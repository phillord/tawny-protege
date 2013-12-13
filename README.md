# tawny.protege

This is a bridge between
[Protege-nrepl](https://github.com/phillord/protege-nrepl) and
[Tawny-OWL](https://github.com/phillord/tawny-owl). It enables the use of
Tawny-OWL through a nrepl launched from Protege. Any ontologies created or
changed in Tawny will be displayed, live, in Protege.

Currently, the release version of Protege and Tawny use different versions of
the OWL API. This means that a specialized build of Protege is necessary.

## Usage

The protege-nrepl plugin reads a `init.clj` file. This is a good place to
force loading of tawny-protege. My full `init.clj` looks like this:


    ;; force loading of tawny
    (cemerick.pomegranate/add-dependencies
       :coordinates '[[uk.org.russet/tawny-protege "1.0"]]
       :repositories (merge cemerick.pomegranate.aether/maven-central
                       {"clojars" "http://clojars.org/repo"}))

    ;; and monkey patch the thing
    (require 'tawny.protege-nrepl)

    ;; initing the dialog takes ages -- so auto connect
    (dosync (ref-set protege.model/auto-connect-on-default true))


Currently Tawny uses the OWL API version 3.4.8 and depends on (one!) feature
introduced in it, while Protege uses version 3.4.2. So, if you use tawny
inside Protege errors will occasionally happen (if you use datatypes
essentially). Unfortunately, upgrading Protege to 3.4.8 requires a slight
patch to Protege.

I have built an  **unsupported**, **pre-release** version of Protege with
protege-nrepl (and [protege-tawny](https://github.com/phillord/protege-tawny))
installed, which is accessible from
[here](http://purl.org/ontolink/protege-nrepl). Please don't ask the Protege
team for help with this! This should be a stop-gap solution; we hope that
protege-nrepl will work in a standard Protege install. 


## License

The contents of this file are subject to the LGPL License, Version 3.0.

Copyright (C) 2012, 2013, Newcastle University

This program is free software: you can redistribute it and/or modify it under
the terms of the GNU Lesser General Public License as published by the Free
Software Foundation, either version 3 of the License, or (at your option) any
later version.

This program is distributed in the hope that it will be useful, but WITHOUT
ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
FOR A PARTICULAR PURPOSE. See the GNU General Public License for more details.

You should have received a copy of the GNU Lesser General Public License along
with this program. If not, see http://www.gnu.org/licenses/.
