package com.spotify.cosmos.sharedcosmosrouterservice;

import p.a8n;
import p.c8o;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
final class DaggerSharedCosmosRouterServiceFactoryComponent {

    public static final class Factory implements SharedCosmosRouterServiceFactoryComponent.Factory {
        public /* synthetic */ Factory(int i) {
            this();
        }

        @Override // com.spotify.cosmos.sharedcosmosrouterservice.SharedCosmosRouterServiceFactoryComponent.Factory
        public SharedCosmosRouterServiceFactoryComponent create(SharedCosmosRouterServiceDependencies sharedCosmosRouterServiceDependencies) {
            c8o.i(sharedCosmosRouterServiceDependencies);
            return new SharedCosmosRouterServiceFactoryComponentImpl(sharedCosmosRouterServiceDependencies);
        }

        private Factory() {
        }
    }

    public static final class SharedCosmosRouterServiceFactoryComponentImpl implements SharedCosmosRouterServiceFactoryComponent {
        private final SharedCosmosRouterServiceDependencies sharedCosmosRouterServiceDependencies;
        private final SharedCosmosRouterServiceFactoryComponentImpl sharedCosmosRouterServiceFactoryComponentImpl = this;

        public SharedCosmosRouterServiceFactoryComponentImpl(SharedCosmosRouterServiceDependencies sharedCosmosRouterServiceDependencies) {
            this.sharedCosmosRouterServiceDependencies = sharedCosmosRouterServiceDependencies;
        }

        @Override // com.spotify.cosmos.sharedcosmosrouterservice.SharedCosmosRouterServiceFactoryComponent
        public SharedCosmosRouterService sharedCosmosRouterService() {
            a8n coreThreadingApi = this.sharedCosmosRouterServiceDependencies.getCoreThreadingApi();
            c8o.l(coreThreadingApi);
            return new SharedCosmosRouterService(coreThreadingApi, RemoteRouterFactoryModule_ProvideRemoteRouterFactoryFactory.provideRemoteRouterFactory());
        }
    }

    private DaggerSharedCosmosRouterServiceFactoryComponent() {
    }

    public static SharedCosmosRouterServiceFactoryComponent.Factory factory() {
        return new Factory(0);
    }
}
