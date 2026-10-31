package com.spotify.cosmos.cosmonautdi;

import com.spotify.cosmos.cosmoscomponentapi.CosmosComponentApi;
import p.c8o;
import p.jly0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class CosmosComponentInstallerModule_CosmosComponentFactory implements jly0 {
    private final jly0 depsProvider;

    private CosmosComponentInstallerModule_CosmosComponentFactory(jly0 jly0Var) {
        this.depsProvider = jly0Var;
    }

    public static CosmosComponentApi cosmosComponent(CosmosDeps cosmosDeps) {
        CosmosComponentApi cosmosComponentApiCosmosComponent = CosmosComponentInstallerModule.INSTANCE.cosmosComponent(cosmosDeps);
        c8o.m(cosmosComponentApiCosmosComponent);
        return cosmosComponentApiCosmosComponent;
    }

    public static CosmosComponentInstallerModule_CosmosComponentFactory create(jly0 jly0Var) {
        return new CosmosComponentInstallerModule_CosmosComponentFactory(jly0Var);
    }

    /* JADX INFO: renamed from: get, reason: merged with bridge method [inline-methods] */
    public CosmosComponentApi m11get() {
        return cosmosComponent((CosmosDeps) this.depsProvider.get());
    }
}
