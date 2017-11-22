<?php

declare(strict_types=1);

namespace Typp\Test;

class Helper
{
    private $rootDir;
    private $testsDir;

    public function __construct(string $rootDir, string $testsDir)
    {
        $this->rootDir = $rootDir;
        $this->testsDir = $testsDir;
    }

    public function getCode(string $name): string
    {
        return file_get_contents($this->getFullCodeFilename($name));
    }

    public function getFullCodeFilename(string $name): string
    {
        return "{$this->testsDir}/$name";
    }

    public function getCompilerPath(): string
    {
        return "{$this->rootDir}/typpc.php";
    }
}