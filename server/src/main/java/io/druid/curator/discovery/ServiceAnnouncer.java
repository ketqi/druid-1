/*
 * Druid - a distributed column store.
 * Copyright 2012 - 2015 Metamarkets Group Inc.
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

package io.druid.curator.discovery;

import io.druid.server.DruidNode;

/**
 * Announces our ability to serve a particular function. Multiple users may announce the same service, in which
 * case they are treated as interchangeable instances of that service.
 */
public interface ServiceAnnouncer
{
  public void announce(DruidNode node);

  public void unannounce(DruidNode node);
}
