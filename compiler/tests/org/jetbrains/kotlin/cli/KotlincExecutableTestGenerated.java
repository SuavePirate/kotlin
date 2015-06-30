/*
 * Copyright 2010-2015 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jetbrains.kotlin.cli;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.JUnit3RunnerWithInners;
import org.jetbrains.kotlin.test.JetTestUtils;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.runner.RunWith;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.TestsPackage}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@RunWith(JUnit3RunnerWithInners.class)
public class KotlincExecutableTestGenerated extends AbstractKotlincExecutableTest {
    @TestMetadata("compiler/testData/cli/jvm")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class Jvm extends AbstractKotlincExecutableTest {
        public void testAllFilesPresentInJvm() throws Exception {
            JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/cli/jvm"), Pattern.compile("^(.+)\\.args$"), false);
        }

        @TestMetadata("classAndFacadeClash.args")
        public void testClassAndFacadeClash() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("compiler/testData/cli/jvm/classAndFacadeClash.args");
            doJvmTest(fileName);
        }

        @TestMetadata("classAndPartClash.args")
        public void testClassAndPartClash() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("compiler/testData/cli/jvm/classAndPartClash.args");
            doJvmTest(fileName);
        }

        @TestMetadata("classAndTraitClash.args")
        public void testClassAndTraitClash() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("compiler/testData/cli/jvm/classAndTraitClash.args");
            doJvmTest(fileName);
        }

        @TestMetadata("classpath.args")
        public void testClasspath() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("compiler/testData/cli/jvm/classpath.args");
            doJvmTest(fileName);
        }

        @TestMetadata("conflictingOverloads.args")
        public void testConflictingOverloads() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("compiler/testData/cli/jvm/conflictingOverloads.args");
            doJvmTest(fileName);
        }

        @TestMetadata("diagnosticsOrder.args")
        public void testDiagnosticsOrder() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("compiler/testData/cli/jvm/diagnosticsOrder.args");
            doJvmTest(fileName);
        }

        @TestMetadata("duplicateSources.args")
        public void testDuplicateSources() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("compiler/testData/cli/jvm/duplicateSources.args");
            doJvmTest(fileName);
        }

        @TestMetadata("duplicateSourcesInModule.args")
        public void testDuplicateSourcesInModule() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("compiler/testData/cli/jvm/duplicateSourcesInModule.args");
            doJvmTest(fileName);
        }

        @TestMetadata("emptySources.args")
        public void testEmptySources() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("compiler/testData/cli/jvm/emptySources.args");
            doJvmTest(fileName);
        }

        @TestMetadata("extraHelp.args")
        public void testExtraHelp() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("compiler/testData/cli/jvm/extraHelp.args");
            doJvmTest(fileName);
        }

        @TestMetadata("help.args")
        public void testHelp() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("compiler/testData/cli/jvm/help.args");
            doJvmTest(fileName);
        }

        @TestMetadata("inlineCycle.args")
        public void testInlineCycle() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("compiler/testData/cli/jvm/inlineCycle.args");
            doJvmTest(fileName);
        }

        @TestMetadata("multipleTextRangesInDiagnosticsOrder.args")
        public void testMultipleTextRangesInDiagnosticsOrder() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("compiler/testData/cli/jvm/multipleTextRangesInDiagnosticsOrder.args");
            doJvmTest(fileName);
        }

        @TestMetadata("nonExistingClassPathAndAnnotationsPath.args")
        public void testNonExistingClassPathAndAnnotationsPath() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("compiler/testData/cli/jvm/nonExistingClassPathAndAnnotationsPath.args");
            doJvmTest(fileName);
        }

        @TestMetadata("nonExistingSourcePath.args")
        public void testNonExistingSourcePath() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("compiler/testData/cli/jvm/nonExistingSourcePath.args");
            doJvmTest(fileName);
        }

        @TestMetadata("nonLocalDisabled.args")
        public void testNonLocalDisabled() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("compiler/testData/cli/jvm/nonLocalDisabled.args");
            doJvmTest(fileName);
        }

        @TestMetadata("pluginSimple.args")
        public void testPluginSimple() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("compiler/testData/cli/jvm/pluginSimple.args");
            doJvmTest(fileName);
        }

        @TestMetadata("pluginSimpleUsage.args")
        public void testPluginSimpleUsage() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("compiler/testData/cli/jvm/pluginSimpleUsage.args");
            doJvmTest(fileName);
        }

        @TestMetadata("signatureClash.args")
        public void testSignatureClash() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("compiler/testData/cli/jvm/signatureClash.args");
            doJvmTest(fileName);
        }

        @TestMetadata("simple.args")
        public void testSimple() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("compiler/testData/cli/jvm/simple.args");
            doJvmTest(fileName);
        }

        @TestMetadata("suppressAllWarningsJvm.args")
        public void testSuppressAllWarningsJvm() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("compiler/testData/cli/jvm/suppressAllWarningsJvm.args");
            doJvmTest(fileName);
        }

        @TestMetadata("syntheticAccessorSignatureClash.args")
        public void testSyntheticAccessorSignatureClash() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("compiler/testData/cli/jvm/syntheticAccessorSignatureClash.args");
            doJvmTest(fileName);
        }

        @TestMetadata("warningsInDummy.args")
        public void testWarningsInDummy() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("compiler/testData/cli/jvm/warningsInDummy.args");
            doJvmTest(fileName);
        }

        @TestMetadata("wrongAbiVersion.args")
        public void testWrongAbiVersion() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("compiler/testData/cli/jvm/wrongAbiVersion.args");
            doJvmTest(fileName);
        }

        @TestMetadata("wrongArgument.args")
        public void testWrongArgument() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("compiler/testData/cli/jvm/wrongArgument.args");
            doJvmTest(fileName);
        }

        @TestMetadata("wrongKotlinSignature.args")
        public void testWrongKotlinSignature() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("compiler/testData/cli/jvm/wrongKotlinSignature.args");
            doJvmTest(fileName);
        }

        @TestMetadata("wrongScriptWithNoSource.args")
        public void testWrongScriptWithNoSource() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("compiler/testData/cli/jvm/wrongScriptWithNoSource.args");
            doJvmTest(fileName);
        }
    }

    @TestMetadata("compiler/testData/cli/js")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class Js extends AbstractKotlincExecutableTest {
        public void testAllFilesPresentInJs() throws Exception {
            JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/cli/js"), Pattern.compile("^(.+)\\.args$"), false);
        }

        @TestMetadata("createMetadata.args")
        public void testCreateMetadata() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("compiler/testData/cli/js/createMetadata.args");
            doJsTest(fileName);
        }

        @TestMetadata("diagnosticForClassLiteral.args")
        public void testDiagnosticForClassLiteral() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("compiler/testData/cli/js/diagnosticForClassLiteral.args");
            doJsTest(fileName);
        }

        @TestMetadata("diagnosticForUnhandledElements.args")
        public void testDiagnosticForUnhandledElements() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("compiler/testData/cli/js/diagnosticForUnhandledElements.args");
            doJsTest(fileName);
        }

        @TestMetadata("diagnosticWhenReferenceToBuiltinsMember.args")
        public void testDiagnosticWhenReferenceToBuiltinsMember() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("compiler/testData/cli/js/diagnosticWhenReferenceToBuiltinsMember.args");
            doJsTest(fileName);
        }

        @TestMetadata("emptySources.args")
        public void testEmptySources() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("compiler/testData/cli/js/emptySources.args");
            doJsTest(fileName);
        }

        @TestMetadata("inlineCycle.args")
        public void testInlineCycle() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("compiler/testData/cli/js/inlineCycle.args");
            doJsTest(fileName);
        }

        @TestMetadata("jsExtraHelp.args")
        public void testJsExtraHelp() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("compiler/testData/cli/js/jsExtraHelp.args");
            doJsTest(fileName);
        }

        @TestMetadata("jsHelp.args")
        public void testJsHelp() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("compiler/testData/cli/js/jsHelp.args");
            doJsTest(fileName);
        }

        @TestMetadata("libraryDirNotFound.args")
        public void testLibraryDirNotFound() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("compiler/testData/cli/js/libraryDirNotFound.args");
            doJsTest(fileName);
        }

        @TestMetadata("nonExistingSourcePath.args")
        public void testNonExistingSourcePath() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("compiler/testData/cli/js/nonExistingSourcePath.args");
            doJsTest(fileName);
        }

        @TestMetadata("notValidLibraryDir.args")
        public void testNotValidLibraryDir() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("compiler/testData/cli/js/notValidLibraryDir.args");
            doJsTest(fileName);
        }

        @TestMetadata("outputIsDirectory.args")
        public void testOutputIsDirectory() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("compiler/testData/cli/js/outputIsDirectory.args");
            doJsTest(fileName);
        }

        @TestMetadata("outputPostfixFileNotFound.args")
        public void testOutputPostfixFileNotFound() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("compiler/testData/cli/js/outputPostfixFileNotFound.args");
            doJsTest(fileName);
        }

        @TestMetadata("outputPrefixFileNotFound.args")
        public void testOutputPrefixFileNotFound() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("compiler/testData/cli/js/outputPrefixFileNotFound.args");
            doJsTest(fileName);
        }

        @TestMetadata("simple2js.args")
        public void testSimple2js() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("compiler/testData/cli/js/simple2js.args");
            doJsTest(fileName);
        }

        @TestMetadata("suppressAllWarningsJS.args")
        public void testSuppressAllWarningsJS() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("compiler/testData/cli/js/suppressAllWarningsJS.args");
            doJsTest(fileName);
        }

        @TestMetadata("withFolderAsLib.args")
        public void testWithFolderAsLib() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("compiler/testData/cli/js/withFolderAsLib.args");
            doJsTest(fileName);
        }

        @TestMetadata("withLib.args")
        public void testWithLib() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("compiler/testData/cli/js/withLib.args");
            doJsTest(fileName);
        }

        @TestMetadata("wrongAbiVersion.args")
        public void testWrongAbiVersion() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("compiler/testData/cli/js/wrongAbiVersion.args");
            doJsTest(fileName);
        }
    }
}
