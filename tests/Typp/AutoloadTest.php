<?php

declare(strict_types=1);

namespace Typp;

use Typp\Test\TyppTestCase;

class AutoloaderTest extends TyppTestCase
{
    /** @test */
    public function classExists() {
        $this->assertTrue(class_exists('Typp\Compiler'));
    }
}