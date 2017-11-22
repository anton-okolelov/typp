<?php

namespace Typp;

use Typp\Test\TyppTestCase;

class CommandLineTest extends TyppTestCase
{
    /** @test */
    public function commandLineParseHelloWorldPhp()
    {
        $fileToCompile = $this->helper->getFullCodeFilename('helloworld.php');

        $tmpDir = (new TempDir())->getPath();

        $compiler = $this->helper->getCompilerPath();
        `php {$compiler} --outDir $tmpDir $fileToCompile  `;
        $this->assertFileEquals("$tmpDir/helloworld.php", $fileToCompile);
    }
}