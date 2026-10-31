package com.spotify.cosmos.cosmonautdi;

import com.spotify.cosmos.cosmonaut.CosmonautFactory;
import com.spotify.cosmos.cosmoscomponentapi.CosmosComponentApi;
import p.c8o;
import p.jly0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class CosmosApisProviderModule_ProvideCosmonautFactoryFactory implements jly0 {
    private final jly0 componentProvider;

    private CosmosApisProviderModule_ProvideCosmonautFactoryFactory(jly0 jly0Var) {
        this.componentProvider = jly0Var;
    }

    public static CosmosApisProviderModule_ProvideCosmonautFactoryFactory create(jly0 jly0Var) {
        return new CosmosApisProviderModule_ProvideCosmonautFactoryFactory(jly0Var);
    }

    public static CosmonautFactory provideCosmonautFactory(CosmosComponentApi cosmosComponentApi) {
        CosmonautFactory cosmonautFactoryProvideCosmonautFactory = CosmosApisProviderModule.INSTANCE.provideCosmonautFactory(cosmosComponentApi);
        c8o.m(cosmonautFactoryProvideCosmonautFactory);
        return cosmonautFactoryProvideCosmonautFactory;
    }

    /* JADX INFO: renamed from: get, reason: merged with bridge method [inline-methods] */
    public CosmonautFactory m1269get() {
        return provideCosmonautFactory((CosmosComponentApi) this.componentProvider.get());
    }
}
