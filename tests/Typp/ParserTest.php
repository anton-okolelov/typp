<?php

namespace Typp;

use Typp\Test\TyppTestCase;

class ParserTest extends TyppTestCase
{
    /** @test */
    public function parseHelloWorld()
    {
        $this->helper->getCode('helloworld.php');
        $this->assertFalse(true);
    }
}