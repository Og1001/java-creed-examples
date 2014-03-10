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
package com.javacreed.examples.gson.part2;

import java.io.IOException;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

public class BookTypeAdapter extends AbstractTypeAdapter<Book> {

  @Override
  public Book read(final JsonReader in) throws IOException {
    throw new UnsupportedOperationException("Coming soon");
  }

  @Override
  public void write(final JsonWriter out, final Book book) throws IOException {
    out.beginObject();
    out.name("isbn");
    out.value(book.getIsbn());
    out.name("title");
    out.value(book.getTitle());

    out.name("authors");
    out.beginArray();
    for (final Author author : book.getAuthors()) {
      delegateWrite(out, author);
    }
    out.endArray();
    out.endObject();
  }

}
