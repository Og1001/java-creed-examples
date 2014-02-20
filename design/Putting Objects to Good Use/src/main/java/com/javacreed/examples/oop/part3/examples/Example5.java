/**
 * Copyright 2012-2014 Java Creed.
 * 
 * Licensed under the Apache License, Version 2.0 (the "<em>License</em>");
 * you may not use this file except in compliance with the License. You may 
 * obtain a copy of the License at: 
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0 
 * 
 * Unless required by applicable law or agreed to in writing, software 
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT 
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the 
 * License for the specific language governing permissions and limitations 
 * under the License.
 */
package com.javacreed.examples.oop.part3.examples;

import com.javacreed.examples.oop.part3.Item;
import com.javacreed.examples.oop.part3.ItemBuilder;

public class Example5 {

  public static void main(final String[] args) {
    final Item calculator = new ItemBuilder("Imported Calculator", "12.25")//@formatter:off
                                  .addSalesTaxCalculator()
                                  .addImportTaxCalculator()
                                  .addEcoTaxCalculator()
                                  .build();//@formatter:on
    System.out.println(calculator);
  }
}
