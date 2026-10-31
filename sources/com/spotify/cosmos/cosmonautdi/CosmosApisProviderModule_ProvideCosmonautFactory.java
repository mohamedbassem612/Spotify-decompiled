package com.spotify.cosmos.cosmonautdi;

import com.spotify.cosmos.cosmonaut.Cosmonaut;
import com.spotify.cosmos.cosmoscomponentapi.CosmosComponentApi;
import p.c8o;
import p.jly0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class CosmosApisProviderModule_ProvideCosmonautFactory implements jly0 {
    private final jly0 componentProvider;

    private CosmosApisProviderModule_ProvideCosmonautFactory(jly0 jly0Var) {
        this.componentProvider = jly0Var;
    }

    public static CosmosApisProviderModule_ProvideCosmonautFactory create(jly0 jly0Var) {
        return new CosmosApisProviderModule_ProvideCosmonautFactory(jly0Var);
    }

    public static Cosmonaut provideCosmonaut(CosmosComponentApi cosmosComponentApi) {
        Cosmonaut cosmonautProvideCosmonaut = CosmosApisProviderModule.INSTANCE.provideCosmonaut(cosmosComponentApi);
        c8o.m(cosmonautProvideCosmonaut);
        return cosmonautProvideCosmonaut;
    }

    /* JADX INFO: renamed from: get, reason: merged with bridge method [inline-methods] */
    public Cosmonaut m8get() {
        return provideCosmonaut((CosmosComponentApi) this.componentProvider.get());
    }
}
