/**
 * Copyright (c) 2012 Edgar Espina
 *
 * This file is part of Handlebars.java.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.github.edgarespina.handlebars;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

/**
 * Template loader for testing.
 *
 * @author edgar.espina
 * @since 0.2.1
 */
public class StringTemplateLoader extends TemplateLoader {

  private String text;

  public StringTemplateLoader(final String text) {
    this.text = text;
  }

  @Override
  protected Reader read(final String location) throws IOException {
    return new StringReader(text);
  }

}
