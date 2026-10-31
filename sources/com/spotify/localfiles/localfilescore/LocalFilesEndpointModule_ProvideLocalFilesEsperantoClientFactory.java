package com.spotify.localfiles.localfilescore;

import com.spotify.cosmos.callbackrouter.CallbackRouter;
import p.c8o;
import p.jly0;
import p.xde0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class LocalFilesEndpointModule_ProvideLocalFilesEsperantoClientFactory implements jly0 {
    private final jly0 callbackRouterProvider;

    private LocalFilesEndpointModule_ProvideLocalFilesEsperantoClientFactory(jly0 jly0Var) {
        this.callbackRouterProvider = jly0Var;
    }

    public static LocalFilesEndpointModule_ProvideLocalFilesEsperantoClientFactory create(jly0 jly0Var) {
        return new LocalFilesEndpointModule_ProvideLocalFilesEsperantoClientFactory(jly0Var);
    }

    public static xde0 provideLocalFilesEsperantoClient(CallbackRouter callbackRouter) {
        xde0 xde0VarProvideLocalFilesEsperantoClient = LocalFilesEndpointModule.INSTANCE.provideLocalFilesEsperantoClient(callbackRouter);
        c8o.m(xde0VarProvideLocalFilesEsperantoClient);
        return xde0VarProvideLocalFilesEsperantoClient;
    }

    @Override // p.kly0
    public xde0 get() {
        return provideLocalFilesEsperantoClient((CallbackRouter) this.callbackRouterProvider.get());
    }
}
