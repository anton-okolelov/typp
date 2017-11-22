<?php

declare(strict_types=1);

namespace Typp;

use Typp\Test\TyppTestCase;

class TempDirTest extends TyppTestCase
{
    /** @test */
    public function tempDir()
    {
        $tempDir = new TempDir();
        $path = $tempDir->getPath();
        $this->assertDirectoryIsWritable($path);
        $tempDir->__destruct();
        clearstatcache();
        $this->assertDirectoryNotExists($path);
    }
}