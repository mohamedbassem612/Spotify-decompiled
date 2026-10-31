package com.spotify.cosmos.cosmonautdi;

import com.spotify.cosmos.cosmonaut.Cosmonaut;
import com.spotify.cosmos.cosmonaut.CosmonautFactory;
import com.spotify.cosmos.fireandforgetresolver.FireAndForgetResolver;
import com.spotify.cosmos.rxrouter.RxRouter;
import com.spotify.cosmos.rxrouter.RxRouterProvider;
import com.spotify.cosmos.rxrouter.RxRouterProviderModule_Companion_ProvideRxRouterProviderFactory;
import com.spotify.cosmos.servicebasedrouterimpl.RxFireAndForgetResolver;
import p.c8o;
import p.jah;
import p.jly0;
import p.nfa0;
import p.xqu;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class DaggerCosmosComponent {

    public static final class CosmosComponentImpl implements CosmosComponent {
        private final CosmosComponentImpl cosmosComponentImpl = this;
        private final CosmosDeps cosmosDeps;
        jly0 provideCosmonautFactoryProvider;
        jly0 provideCosmonautProvider;
        jly0 provideRxRouterProvider;
        jly0 rxFireAndForgetResolverProvider;

        public static final class SwitchingProvider<T> implements jly0 {
            private final CosmosComponentImpl cosmosComponentImpl;
            private final int id;

            public SwitchingProvider(CosmosComponentImpl cosmosComponentImpl, int i) {
                this.cosmosComponentImpl = cosmosComponentImpl;
                this.id = i;
            }

            public T get() {
                int i = this.id;
                if (i == 0) {
                    CosmonautFactory cosmonautFactory = (CosmonautFactory) this.cosmosComponentImpl.provideCosmonautFactoryProvider.get();
                    RxRouter rxRouter = this.cosmosComponentImpl.cosmosDeps.getRxRouter();
                    c8o.l(rxRouter);
                    return (T) CosmonautModule_Companion_ProvideCosmonautFactory.provideCosmonaut(cosmonautFactory, rxRouter);
                }
                if (i == 1) {
                    nfa0 json = this.cosmosComponentImpl.cosmosDeps.getJson();
                    c8o.l(json);
                    return (T) CosmonautModule_Companion_ProvideCosmonautFactoryFactory.provideCosmonautFactory(json);
                }
                if (i == 2) {
                    RxRouter rxRouter2 = this.cosmosComponentImpl.cosmosDeps.getRxRouter();
                    c8o.l(rxRouter2);
                    return (T) new RxFireAndForgetResolver(rxRouter2);
                }
                if (i != 3) {
                    jah.e(i);
                    return null;
                }
                RxRouter rxRouter3 = this.cosmosComponentImpl.cosmosDeps.getRxRouter();
                c8o.l(rxRouter3);
                return (T) RxRouterProviderModule_Companion_ProvideRxRouterProviderFactory.provideRxRouterProvider(rxRouter3);
            }
        }

        public CosmosComponentImpl(CosmosDeps cosmosDeps) {
            this.cosmosDeps = cosmosDeps;
            initialize(cosmosDeps);
        }

        private void initialize(CosmosDeps cosmosDeps) {
            this.provideCosmonautFactoryProvider = xqu.b(new SwitchingProvider(this.cosmosComponentImpl, 1));
            this.provideCosmonautProvider = xqu.b(new SwitchingProvider(this.cosmosComponentImpl, 0));
            this.rxFireAndForgetResolverProvider = xqu.b(new SwitchingProvider(this.cosmosComponentImpl, 2));
            this.provideRxRouterProvider = xqu.b(new SwitchingProvider(this.cosmosComponentImpl, 3));
        }

        @Override // com.spotify.cosmos.cosmoscomponentapi.CosmosComponentApi
        public Cosmonaut getCosmonaut() {
            return (Cosmonaut) this.provideCosmonautProvider.get();
        }

        @Override // com.spotify.cosmos.cosmoscomponentapi.CosmosComponentApi
        public CosmonautFactory getCosmonautFactory() {
            return (CosmonautFactory) this.provideCosmonautFactoryProvider.get();
        }

        @Override // com.spotify.cosmos.cosmoscomponentapi.CosmosComponentApi
        public FireAndForgetResolver getFireAndForgetResolver() {
            return (FireAndForgetResolver) this.rxFireAndForgetResolverProvider.get();
        }

        @Override // com.spotify.cosmos.cosmoscomponentapi.CosmosComponentApi
        public RxRouterProvider getRxRouterProvider() {
            return (RxRouterProvider) this.provideRxRouterProvider.get();
        }
    }

    public static final class Factory implements CosmosComponent.Factory {
        public /* synthetic */ Factory(int i) {
            this();
        }

        @Override // com.spotify.cosmos.cosmonautdi.CosmosComponent.Factory
        public CosmosComponent create(CosmosDeps cosmosDeps) {
            c8o.i(cosmosDeps);
            return new CosmosComponentImpl(cosmosDeps);
        }

        private Factory() {
        }
    }

    private DaggerCosmosComponent() {
    }

    public static CosmosComponent.Factory factory() {
        return new Factory(0);
    }
}
