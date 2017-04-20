package org.opencimi.workbench.web.controller;

import org.opencimi.workbench.web.model.CimiClass;
import org.springframework.web.bind.annotation.*;

/**
 * Copyright 2017 Cognitive Medical Systems, Inc (http://www.cognitivemedicine.com).
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * <p>
 * Created by cnanjo on 4/19/17.
 */
@RestController
public class CimiModelController {
    @RequestMapping(value= "/model.json", method = RequestMethod.GET, produces="application/json")
    @ResponseBody
    public CimiClass getModel(@RequestParam(value="name", defaultValue="CrazyClass") String name) {
        return new CimiClass(name);
    }
}
