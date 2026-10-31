package com.spotify.cosmos.cosmonautdi;

import com.spotify.cosmos.cosmonaut.Cosmonaut;
import com.spotify.cosmos.cosmonaut.CosmonautFactory;
import com.spotify.cosmos.rxrouter.RxRouter;
import p.c8o;
import p.jly0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class CosmonautModule_Companion_ProvideCosmonautFactory implements jly0 {
    private final jly0 cosmonautFactoryProvider;
    private final jly0 rxRouterProvider;

    private CosmonautModule_Companion_ProvideCosmonautFactory(jly0 jly0Var, jly0 jly0Var2) {
        this.cosmonautFactoryProvider = jly0Var;
        this.rxRouterProvider = jly0Var2;
    }

    public static CosmonautModule_Companion_ProvideCosmonautFactory create(jly0 jly0Var, jly0 jly0Var2) {
        return new CosmonautModule_Companion_ProvideCosmonautFactory(jly0Var, jly0Var2);
    }

    public static Cosmonaut provideCosmonaut(CosmonautFactory cosmonautFactory, RxRouter rxRouter) {
        Cosmonaut cosmonautProvideCosmonaut = CosmonautModule.INSTANCE.provideCosmonaut(cosmonautFactory, rxRouter);
        c8o.m(cosmonautProvideCosmonaut);
        return cosmonautProvideCosmonaut;
    }

    /* JADX INFO: renamed from: get, reason: merged with bridge method [inline-methods] */
    public Cosmonaut m6get() {
        return provideCosmonaut((CosmonautFactory) this.cosmonautFactoryProvider.get(), (RxRouter) this.rxRouterProvider.get());
    }
}
