package com.spotify.cosmos.core;

import com.spotify.connect.esperanto.proto.ConnectMessages$StateResponse;
import com.spotify.cosmos.callbackrouter.CallbackRouter;
import com.spotify.cosmos.cosmos.Lifetime;
import com.spotify.cosmos.cosmos.Request;
import com.spotify.cosmos.cosmos.ResolveCallback;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p.a8d1;
import p.alb1;
import p.at71;
import p.c9n;
import p.d5p1;
import p.d9n;
import p.dm61;
import p.eg;
import p.f5p1;
import p.gn41;
import p.h4p1;
import p.hab0;
import p.hm5;
import p.jch0;
import p.l4p1;
import p.l811;
import p.llm;
import p.lnm;
import p.mr20;
import p.o7h;
import p.p811;
import p.q8r;
import p.rih1;
import p.smo1;
import p.ssw0;
import p.vu30;
import p.xab1;
import p.z8n;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00172\u00020\u0001:\u0002\u0018\u0017B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00070\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Lcom/spotify/cosmos/servicebasedrouter/ScopedCallbackRouter;", "Lcom/spotify/cosmos/callbackrouter/CallbackRouter;", "Lcom/spotify/cosmos/servicebasedrouter/ScopeCallbackConnector;", "scopeConnector", "<init>", "(Lcom/spotify/cosmos/servicebasedrouter/ScopeCallbackConnector;)V", "Lp/mr20;", "Lcom/spotify/cosmos/servicebasedrouter/ScopedCallbackRouter$RouterState;", "routerState", "(Lcom/spotify/cosmos/servicebasedrouter/ScopeCallbackConnector;)Lp/mr20;", "Lcom/spotify/cosmos/cosmos/Request;", "request", "Lcom/spotify/cosmos/cosmos/ResolveCallback;", "callback", "Lcom/spotify/cosmos/cosmos/Lifetime;", "resolve", "(Lcom/spotify/cosmos/cosmos/Request;Lcom/spotify/cosmos/cosmos/ResolveCallback;)Lcom/spotify/cosmos/cosmos/Lifetime;", "Lp/c9n;", "scope", "Lp/c9n;", "Lp/at71;", "routerStateFlow", "Lp/at71;", "Companion", "RouterState", "src_main_java_com_spotify_cosmos_servicebasedrouter-servicebasedrouter"}, k = 1, mv = {2, 3, 0}, xi = ConnectMessages$StateResponse.Device.SUPPORTS_GAPLESS_FIELD_NUMBER)
public final class ScopedCallbackRouter implements CallbackRouter {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Set<String> IDEMPOTENT_ACTIONS = dm61.z0(new String[]{Request.GET, Request.SUB});
    private final at71 routerStateFlow;
    private final c9n scope;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/spotify/cosmos/servicebasedrouter/ScopedCallbackRouter$Companion;", "", "<init>", "()V", "IDEMPOTENT_ACTIONS", "", "", "getIDEMPOTENT_ACTIONS", "()Ljava/util/Set;", "src_main_java_com_spotify_cosmos_servicebasedrouter-servicebasedrouter"}, k = 1, mv = {2, 3, 0}, xi = ConnectMessages$StateResponse.Device.SUPPORTS_GAPLESS_FIELD_NUMBER)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Set<String> getIDEMPOTENT_ACTIONS() {
            return ScopedCallbackRouter.IDEMPOTENT_ACTIONS;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Lcom/spotify/cosmos/servicebasedrouter/ScopedCallbackRouter$RouterState;", "", "Available", "NotAvailable", "Lcom/spotify/cosmos/servicebasedrouter/ScopedCallbackRouter$RouterState$Available;", "Lcom/spotify/cosmos/servicebasedrouter/ScopedCallbackRouter$RouterState$NotAvailable;", "src_main_java_com_spotify_cosmos_servicebasedrouter-servicebasedrouter"}, k = 1, mv = {2, 3, 0}, xi = ConnectMessages$StateResponse.Device.SUPPORTS_GAPLESS_FIELD_NUMBER)
    public interface RouterState {

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/spotify/cosmos/servicebasedrouter/ScopedCallbackRouter$RouterState$Available;", "Lcom/spotify/cosmos/servicebasedrouter/ScopedCallbackRouter$RouterState;", "router", "Lcom/spotify/cosmos/callbackrouter/CallbackRouter;", "<init>", "(Lcom/spotify/cosmos/callbackrouter/CallbackRouter;)V", "getRouter", "()Lcom/spotify/cosmos/callbackrouter/CallbackRouter;", "src_main_java_com_spotify_cosmos_servicebasedrouter-servicebasedrouter"}, k = 1, mv = {2, 3, 0}, xi = ConnectMessages$StateResponse.Device.SUPPORTS_GAPLESS_FIELD_NUMBER)
        public static final class Available implements RouterState {
            private final CallbackRouter router;

            public Available(CallbackRouter callbackRouter) {
                this.router = callbackRouter;
            }

            public final CallbackRouter getRouter() {
                return this.router;
            }
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, d2 = {"Lcom/spotify/cosmos/servicebasedrouter/ScopedCallbackRouter$RouterState$NotAvailable;", "Lcom/spotify/cosmos/servicebasedrouter/ScopedCallbackRouter$RouterState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "src_main_java_com_spotify_cosmos_servicebasedrouter-servicebasedrouter"}, k = 1, mv = {2, 3, 0}, xi = ConnectMessages$StateResponse.Device.SUPPORTS_GAPLESS_FIELD_NUMBER)
        public static final /* data */ class NotAvailable implements RouterState {
            public static final NotAvailable INSTANCE = new NotAvailable();

            private NotAvailable() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof NotAvailable);
            }

            public int hashCode() {
                return 1732638440;
            }

            public String toString() {
                return "NotAvailable";
            }
        }
    }

    public ScopedCallbackRouter(ScopeCallbackConnector scopeCallbackConnector) {
        llm llmVarE = smo1.e(new z8n("ScopedCallbackRouterScope"));
        this.scope = llmVarE;
        this.routerStateFlow = d5p1.r(routerState(scopeCallbackConnector), llmVarE, new alb1(0L, Long.MAX_VALUE), 1);
    }

    private final mr20 routerState(ScopeCallbackConnector scopeConnector) {
        return h4p1.f(new C00051(scopeConnector, null));
    }

    @Override // com.spotify.cosmos.callbackrouter.CallbackRouter
    public Lifetime resolve(Request request, ResolveCallback callback) {
        boolean zI0 = o7h.i0(IDEMPOTENT_ACTIONS, request.getAction());
        l811 l811Var = new l811();
        l811Var.a = true;
        final p811 p811Var = new p811();
        final xab1 xab1VarU = l4p1.u(this.scope, f5p1.q(this.routerStateFlow, new ScopedCallbackRouter$resolve$job$1(l811Var, p811Var, request, callback, zI0, null)));
        return new Lifetime() { // from class: com.spotify.cosmos.servicebasedrouter.ScopedCallbackRouter.resolve.1
            @Override // com.spotify.cosmos.cosmos.Lifetime
            public void release() {
                xab1VarU.d((CancellationException) null);
                Lifetime lifetime = (Lifetime) p811Var.a;
                if (lifetime != null) {
                    lifetime.release();
                }
            }
        };
    }

    /* JADX INFO: renamed from: com.spotify.cosmos.servicebasedrouter.ScopedCallbackRouter$routerState$1, reason: invalid class name and case insensitive filesystem */
    @q8r(c = "com.spotify.cosmos.servicebasedrouter.ScopedCallbackRouter$routerState$1", f = "ScopedCallbackRouter.kt", l = {79}, m = "invokeSuspend", v = 2)
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lp/ssw0;", "Lcom/spotify/cosmos/servicebasedrouter/ScopedCallbackRouter$RouterState;", "Lp/rih1;", "<anonymous>", "(Lp/ssw0;)V"}, k = 3, mv = {2, 3, 0})
    public static final class C00051 extends a8d1 implements vu30 {
        final /* synthetic */ ScopeCallbackConnector $scopeConnector;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C00051(ScopeCallbackConnector scopeCallbackConnector, lnm<? super C00051> lnmVar) {
            super(2, lnmVar);
            this.$scopeConnector = scopeCallbackConnector;
        }

        public final lnm<rih1> create(Object obj, lnm<?> lnmVar) {
            C00051 c00051 = new C00051(this.$scopeConnector, lnmVar);
            c00051.L$0 = obj;
            return c00051;
        }

        public final Object invoke(ssw0 ssw0Var, lnm<? super rih1> lnmVar) {
            return create(ssw0Var, lnmVar).invokeSuspend(rih1.a);
        }

        public final Object invokeSuspend(Object obj) {
            ssw0 ssw0Var = (ssw0) this.L$0;
            int i = this.label;
            if (i == 0) {
                hm5.M(obj);
                C00001 c00001 = new C00001(this.$scopeConnector.connect(new ScopedCallbackRouter$routerState$1$scopeDisposable$1(ssw0Var), new ScopedCallbackRouter$routerState$1$scopeDisposable$2(ssw0Var)));
                this.L$0 = null;
                this.L$1 = null;
                this.label = 1;
                Object objS = jch0.s(ssw0Var, c00001, this);
                d9n d9nVar = d9n.a;
                if (objS == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
            }
            return rih1.a;
        }

        /* JADX INFO: renamed from: com.spotify.cosmos.servicebasedrouter.ScopedCallbackRouter$routerState$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lp/rih1;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {2, 3, 0})
        public static final class C00001 extends hab0 implements Function0 {
            final /* synthetic */ gn41 $scopeDisposable;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00001(gn41 gn41Var) {
                super(0);
                this.$scopeDisposable = gn41Var;
            }

            public /* bridge */ /* synthetic */ Object invoke() {
                m16invoke();
                return rih1.a;
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m16invoke() {
                this.$scopeDisposable.dispose();
            }
        }
    }
}
