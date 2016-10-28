/*
 * Copyright (C) 2016 Atlas of Living Australia
 * All Rights Reserved.
 * The contents of this file are subject to the Mozilla Public
 * License Version 1.1 (the "License"); you may not use this file
 * except in compliance with the License. You may obtain a copy of
 * the License at http://www.mozilla.org/MPL/
 * Software distributed under the License is distributed on an "AS
 * IS" basis, WITHOUT WARRANTY OF ANY KIND, either express or
 * implied. See the License for the specific language governing
 * rights and limitations under the License.
 */

modules = {
    bootstrap {
        dependsOn 'core'
        defaultBundle 'main-core'
        resource url:[dir:'js', file:'bootstrap.js', plugin:'generic-bootstrap2'], disposition: 'head', exclude: '*'
        resource url:[dir:'css', file:'bootstrap.css', plugin:'generic-bootstrap2'] //, attrs:[media:'screen, projection, print']
        resource url:[dir:'css', file:'bootstrap-responsive.css', plugin:'generic-bootstrap2'], exclude: '*', attrs:[media:'screen'] // id:'responsiveCss'
        //resource url:[dir:'css', file:'avh-extra.css']//, attrs:[media:'screen']
    }

    core {
        dependsOn 'jquery'
        resource url:[dir:'js', file:'jquery-migrate-1.2.1.min.js', plugin: 'generic-bootstrap2']
        resource url:[dir:'js', file:'html5.js', plugin:'generic-bootstrap2'], wrapper: { s -> "<!--[if lt IE 9]>$s<![endif]-->" }, disposition: 'head'
        resource url:[dir:'js', file:'jquery.autocomplete.js', plugin:'generic-bootstrap2']
        resource url:[dir:'css', file:'jquery.autocomplete.css', plugin:'generic-bootstrap2']
    }
}