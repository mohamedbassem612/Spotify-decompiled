package com.spotify.cosmos.callbackrouter;

import p.c8o;
import p.jly0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class FakeCallbackRouterModule_ProvideCallbackRouterFactory implements jly0 {

    public static final class InstanceHolder {
        static final FakeCallbackRouterModule_ProvideCallbackRouterFactory INSTANCE = new FakeCallbackRouterModule_ProvideCallbackRouterFactory();

        private InstanceHolder() {
        }
    }

    public static FakeCallbackRouterModule_ProvideCallbackRouterFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static CallbackRouter provideCallbackRouter() {
        CallbackRouter callbackRouterProvideCallbackRouter = FakeCallbackRouterModule.INSTANCE.provideCallbackRouter();
        c8o.m(callbackRouterProvideCallbackRouter);
        return callbackRouterProvideCallbackRouter;
    }

    /* JADX INFO: renamed from: get, reason: merged with bridge method [inline-methods] */
    public CallbackRouter m1268get() {
        return provideCallbackRouter();
    }
}
