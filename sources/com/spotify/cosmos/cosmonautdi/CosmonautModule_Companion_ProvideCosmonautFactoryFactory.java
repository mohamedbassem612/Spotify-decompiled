package com.spotify.cosmos.cosmonautdi;

import com.spotify.cosmos.cosmonaut.CosmonautFactory;
import p.c8o;
import p.jly0;
import p.nfa0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class CosmonautModule_Companion_ProvideCosmonautFactoryFactory implements jly0 {
    private final jly0 jsonProvider;

    private CosmonautModule_Companion_ProvideCosmonautFactoryFactory(jly0 jly0Var) {
        this.jsonProvider = jly0Var;
    }

    public static CosmonautModule_Companion_ProvideCosmonautFactoryFactory create(jly0 jly0Var) {
        return new CosmonautModule_Companion_ProvideCosmonautFactoryFactory(jly0Var);
    }

    public static CosmonautFactory provideCosmonautFactory(nfa0 nfa0Var) {
        CosmonautFactory cosmonautFactoryProvideCosmonautFactory = CosmonautModule.INSTANCE.provideCosmonautFactory(nfa0Var);
        c8o.m(cosmonautFactoryProvideCosmonautFactory);
        return cosmonautFactoryProvideCosmonautFactory;
    }

    /* JADX INFO: renamed from: get, reason: merged with bridge method [inline-methods] */
    public CosmonautFactory m7get() {
        return provideCosmonautFactory((nfa0) this.jsonProvider.get());
    }
}
