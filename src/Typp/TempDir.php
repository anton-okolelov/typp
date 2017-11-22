<?php

declare(strict_types=1);

namespace Typp;


class TempDir
{
    public function __construct()
    {
        $this->path = sys_get_temp_dir() . "/" . "temp" . rand(0, PHP_INT_MAX);
        mkdir($this->path);
    }

    public function getPath(): string
    {
        return $this->path;
    }

    public function __destruct()
    {
        `rm -rf $this->path`;
    }
}