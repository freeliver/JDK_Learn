/*
 * Copyright (c) 2017, Oracle and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.  Oracle designates this
 * particular file as subject to the "Classpath" exception as provided
 * by Oracle in the LICENSE file that accompanied this code.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
 * or visit www.oracle.com if you need additional information or have any
 * questions.
 */

/**
 * Registers Graal Compiler specific management interfaces for the JVM.
 *
 * @moduleGraph
 * @since 10
 */
module jdk.internal.vm.compiler.management {
    // source file: file:///t:/workspace/open/src/jdk.internal.vm.compiler.management/share/classes/module-info.java
    //              file:///t:/workspace/build/windows-x64-open/support/gensrc/jdk.internal.vm.compiler.management/module-info.java.extra
    requires java.management;
    requires jdk.management;
    requires jdk.internal.vm.ci;
    requires jdk.internal.vm.compiler;

    provides org.graalvm.compiler.hotspot.HotSpotGraalManagementRegistration with org.graalvm.compiler.hotspot.management.HotSpotGraalManagement;
    provides org.graalvm.compiler.serviceprovider.JMXService with org.graalvm.compiler.hotspot.management.JMXServiceProvider;
}
