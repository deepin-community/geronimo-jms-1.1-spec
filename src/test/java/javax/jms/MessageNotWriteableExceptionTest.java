/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

//
// This source code implements specifications defined by the Java
// Community Process. In order to remain compliant with the specification
// DO NOT add / change / or delete method signatures!
//

package javax.jms;

import junit.framework.TestCase;

/**
 * @version $Rev: 467553 $ $Date: 2006-10-25 06:01:51 +0200 (Wed, 25 Oct 2006) $
 */
public class MessageNotWriteableExceptionTest extends TestCase {
    public void testConstructorNull() {
        MessageNotWriteableException ex = new MessageNotWriteableException(null);
        assertNull(ex.getMessage());
        assertNull(ex.getErrorCode());
        assertNull(ex.getLinkedException());
    }

    public void testConstructorNullNull() {
        MessageNotWriteableException ex = new MessageNotWriteableException(null, null);
        assertNull(ex.getMessage());
        assertNull(ex.getErrorCode());
        assertNull(ex.getLinkedException());
    }

    public void testConstructorNullString() {
        String expected = "some code";
        MessageNotWriteableException ex = new MessageNotWriteableException(null, expected);
        assertNull(ex.getMessage());
        assertEquals(expected, ex.getErrorCode());
        assertNull(ex.getLinkedException());
    }

    public void testConstructorString() {
        String expected = "some message";
        MessageNotWriteableException ex = new MessageNotWriteableException(expected);
        assertEquals(expected, ex.getMessage());
        assertNull(ex.getErrorCode());
        assertNull(ex.getLinkedException());
    }

    public void testConstructorStringNull() {
        String expected = "some message";
        MessageNotWriteableException ex = new MessageNotWriteableException(expected, null);
        assertEquals(expected, ex.getMessage());
        assertNull(ex.getErrorCode());
        assertNull(ex.getLinkedException());
    }

    public void testConstructorStringString() {
        String expectedMessage = "some message";
        String expectedCode = "some code";
        MessageNotWriteableException ex = new MessageNotWriteableException(expectedMessage, expectedCode);
        assertEquals(expectedMessage, ex.getMessage());
        assertEquals(expectedCode, ex.getErrorCode());
        assertNull(ex.getLinkedException());
    }
}
