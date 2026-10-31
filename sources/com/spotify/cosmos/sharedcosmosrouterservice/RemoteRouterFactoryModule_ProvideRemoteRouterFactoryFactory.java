package com.spotify.cosmos.sharedcosmosrouterservice;

import p.c8o;
import p.jly0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class RemoteRouterFactoryModule_ProvideRemoteRouterFactoryFactory implements jly0 {
    public static RemoteRouterFactoryModule_ProvideRemoteRouterFactoryFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static RemoteRouterFactory provideRemoteRouterFactory() {
        RemoteRouterFactory remoteRouterFactoryProvideRemoteRouterFactory = RemoteRouterFactoryModule.INSTANCE.provideRemoteRouterFactory();
        c8o.m(remoteRouterFactoryProvideRemoteRouterFactory);
        return remoteRouterFactoryProvideRemoteRouterFactory;
    }

    /* JADX INFO: renamed from: get, reason: merged with bridge method [inline-methods] */
    public RemoteRouterFactory m20get() {
        return provideRemoteRouterFactory();
    }
}
