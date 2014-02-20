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
package com.javacreed.examples.oop.part3.tax;

import java.math.BigDecimal;
import java.math.RoundingMode;

public abstract class AbstractTaxCalculator implements TaxCalculator {

  protected abstract BigDecimal calculate(BigDecimal value);

  @Override
  public BigDecimal calculateTax(final BigDecimal value) {
    final BigDecimal tax = calculate(value);
    final BigDecimal rounded = round(tax);
    return rounded;
  }

  protected BigDecimal round(BigDecimal value) {
    /* Rounded up to the nearest 0.05 */
    value = value.multiply(new BigDecimal("20")).setScale(0, RoundingMode.UP).setScale(2);
    value = value.divide(new BigDecimal("20"), RoundingMode.UP);
    return value;
  }
}
