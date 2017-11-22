<?php

namespace Typp\Test;

use PHPUnit\Framework\TestCase;

class TyppTestCase extends TestCase
{
    protected $helper;

    public function __construct($name = null, array $data = [], $dataName = '')
    {
        parent::__construct($name, $data, $dataName);
        $this->helper = new Helper(ROOT, TESTS);
    }
}