package com.leruge.use;

import com.leruge.test.Test;

import io.dcloud.feature.uniapp.annotation.UniJSMethod;
import io.dcloud.feature.uniapp.common.UniModule;

public class Demo extends UniModule {

    @UniJSMethod(uiThread = false)
    public String test() {

        return Test.start();
    }
}
