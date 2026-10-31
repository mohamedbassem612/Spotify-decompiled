package com.spotify.cosmos.cosmonautdi;

import com.spotify.cosmos.cosmoscomponentapi.CosmosComponentApi;
import com.spotify.cosmos.fireandforgetresolver.FireAndForgetResolver;
import p.c8o;
import p.jly0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class CosmosApisProviderModule_ProvideFireAndForgetResolverFactory implements jly0 {
    private final jly0 componentProvider;

    private CosmosApisProviderModule_ProvideFireAndForgetResolverFactory(jly0 jly0Var) {
        this.componentProvider = jly0Var;
    }

    public static CosmosApisProviderModule_ProvideFireAndForgetResolverFactory create(jly0 jly0Var) {
        return new CosmosApisProviderModule_ProvideFireAndForgetResolverFactory(jly0Var);
    }

    public static FireAndForgetResolver provideFireAndForgetResolver(CosmosComponentApi cosmosComponentApi) {
        FireAndForgetResolver fireAndForgetResolverProvideFireAndForgetResolver = CosmosApisProviderModule.INSTANCE.provideFireAndForgetResolver(cosmosComponentApi);
        c8o.m(fireAndForgetResolverProvideFireAndForgetResolver);
        return fireAndForgetResolverProvideFireAndForgetResolver;
    }

    /* JADX INFO: renamed from: get, reason: merged with bridge method [inline-methods] */
    public FireAndForgetResolver m9get() {
        return provideFireAndForgetResolver((CosmosComponentApi) this.componentProvider.get());
    }
}
