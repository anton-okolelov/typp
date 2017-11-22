<?php

declare(strict_types=1);

namespace Typp;

use Typp\Test\TyppTestCase;

class StringCompilerTest extends TyppTestCase
{
    /** @test */
    public function phpHelloWorldIsTheSame()
    {
        $code = $this->helper->getCode('helloworld.php');
        $stringCompiler = new Compiler();
        $this->assertEquals($stringCompiler->compile($code), $code);
    }

}