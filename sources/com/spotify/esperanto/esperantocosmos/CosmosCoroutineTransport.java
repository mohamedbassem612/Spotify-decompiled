package com.spotify.esperanto.esperantocosmos;

import com.spotify.base.java.logging.Logger;
import com.spotify.connect.esperanto.proto.ConnectMessages$StateResponse;
import com.spotify.cosmos.cosmos.Lifetime;
import com.spotify.cosmos.cosmos.Request;
import com.spotify.cosmos.cosmos.ResolveCallback;
import com.spotify.cosmos.cosmos.Response;
import com.spotify.esperanto.esperanto.CoroutineTransport;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import p.a8d1;
import p.aym;
import p.d9n;
import p.eg;
import p.gvg;
import p.h4p1;
import p.hab0;
import p.hm5;
import p.jch0;
import p.l1d;
import p.lnm;
import p.mhd;
import p.mr20;
import p.ohd;
import p.p811;
import p.q8r;
import p.rih1;
import p.ssw0;
import p.vu30;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J/\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\r\u0010\u000eJ-\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\u000f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J(\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0096@¢\u0006\u0004\b\u0012\u0010\u0013J'\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/spotify/esperanto/esperantocosmos/CosmosCoroutineTransport;", "Lcom/spotify/esperanto/esperanto/CoroutineTransport;", "Lcom/spotify/esperanto/esperantocosmos/EsperantoCallbackRouter;", "router", "<init>", "(Lcom/spotify/esperanto/esperantocosmos/EsperantoCallbackRouter;)V", "", "service", "method", "", "payload", "cosmosMethod", "Lcom/spotify/cosmos/cosmos/Request;", "createRequest", "(Ljava/lang/String;Ljava/lang/String;[BLjava/lang/String;)Lcom/spotify/cosmos/cosmos/Request;", "Lp/mr20;", "callStream", "(Ljava/lang/String;Ljava/lang/String;[B)Lp/mr20;", "callSingle", "(Ljava/lang/String;Ljava/lang/String;[BLp/lnm;)Ljava/lang/Object;", "callSync", "(Ljava/lang/String;Ljava/lang/String;[B)[B", "Lcom/spotify/esperanto/esperantocosmos/EsperantoCallbackRouter;", "src_main_java_com_spotify_esperanto_esperantocosmos-esperantocosmos_kt-api"}, k = 1, mv = {2, 3, 0}, xi = ConnectMessages$StateResponse.Device.SUPPORTS_GAPLESS_FIELD_NUMBER)
public final class CosmosCoroutineTransport implements CoroutineTransport {
    private final EsperantoCallbackRouter router;

    public CosmosCoroutineTransport(EsperantoCallbackRouter esperantoCallbackRouter) {
        this.router = esperantoCallbackRouter;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Request createRequest(String service, String method, byte[] payload, String cosmosMethod) {
        return new Request(cosmosMethod, gvg.h("sp://esperanto/", service, "/", method), payload);
    }

    @Override // com.spotify.esperanto.esperanto.CoroutineTransport
    public Object callSingle(String str, String str2, byte[] bArr, lnm<? super byte[]> lnmVar) {
        final ohd ohdVar = new ohd(1, aym.t(lnmVar));
        ohdVar.t();
        Request requestCreateRequest = createRequest(str, str2, bArr, Request.POST);
        final p811 p811Var = new p811();
        p811Var.a = this.router.resolve(requestCreateRequest, new ResolveCallback() { // from class: com.spotify.esperanto.esperantocosmos.CosmosCoroutineTransport$callSingle$2$callback$1
            private AtomicBoolean isResumed = new AtomicBoolean(false);

            @Override // com.spotify.cosmos.cosmos.ResolveCallback
            public void onError(Throwable throwable) {
                Lifetime lifetime = (Lifetime) p811Var.a;
                if (lifetime != null) {
                    lifetime.release();
                }
                if (this.isResumed.compareAndSet(false, true)) {
                    Logger.d("Esperanto transport error: %s", throwable.getMessage());
                    ohdVar.q(new CancellationException(l1d.m("Esperanto transport error: ", throwable.getMessage())));
                }
            }

            @Override // com.spotify.cosmos.cosmos.ResolveCallback
            public void onResolved(Response response) {
                Lifetime lifetime = (Lifetime) p811Var.a;
                if (lifetime != null) {
                    lifetime.release();
                }
                if (this.isResumed.compareAndSet(false, true)) {
                    if (response.getStatus() != 200) {
                        Logger.d("Esperanto service unavailable: %s (status %d)", response.getUri(), Integer.valueOf(response.getStatus()));
                        ohdVar.q(new CancellationException(l1d.m("Esperanto service unavailable: ", response.getUri())));
                        return;
                    }
                    mhd mhdVar = ohdVar;
                    byte[] body = response.getBody();
                    if (body == null) {
                        body = new byte[0];
                    }
                    mhdVar.resumeWith(body);
                }
            }
        });
        ohdVar.n(new CosmosCoroutineTransport$callSingle$2$1(p811Var));
        return ohdVar.r();
    }

    @Override // com.spotify.esperanto.esperanto.CoroutineTransport
    public mr20 callStream(String service, String method, byte[] payload) {
        return h4p1.f(new AnonymousClass1(service, method, payload, null));
    }

    @Override // com.spotify.esperanto.esperanto.CoroutineTransport
    public byte[] callSync(String service, String method, byte[] payload) {
        return new byte[0];
    }

    /* JADX INFO: renamed from: com.spotify.esperanto.esperantocosmos.CosmosCoroutineTransport$callStream$1, reason: invalid class name */
    @q8r(c = "com.spotify.esperanto.esperantocosmos.CosmosCoroutineTransport$callStream$1", f = "CosmosCoroutineTransport.kt", l = {ConnectMessages$StateResponse.Device.SUPPORTS_ZEPHYR_FIELD_NUMBER}, m = "invokeSuspend", v = 2)
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lp/ssw0;", "", "Lp/rih1;", "<anonymous>", "(Lp/ssw0;)V"}, k = 3, mv = {2, 3, 0})
    public static final class AnonymousClass1 extends a8d1 implements vu30 {
        final /* synthetic */ String $method;
        final /* synthetic */ byte[] $payload;
        final /* synthetic */ String $service;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, String str2, byte[] bArr, lnm<? super AnonymousClass1> lnmVar) {
            super(2, lnmVar);
            this.$service = str;
            this.$method = str2;
            this.$payload = bArr;
        }

        public final lnm<rih1> create(Object obj, lnm<?> lnmVar) {
            AnonymousClass1 anonymousClass1 = CosmosCoroutineTransport.this.new AnonymousClass1(this.$service, this.$method, this.$payload, lnmVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        public final Object invoke(ssw0 ssw0Var, lnm<? super rih1> lnmVar) {
            return create(ssw0Var, lnmVar).invokeSuspend(rih1.a);
        }

        public final Object invokeSuspend(Object obj) {
            final ssw0 ssw0Var = (ssw0) this.L$0;
            int i = this.label;
            if (i == 0) {
                hm5.M(obj);
                C00011 c00011 = new C00011(CosmosCoroutineTransport.this.router.resolve(CosmosCoroutineTransport.this.createRequest(this.$service, this.$method, this.$payload, Request.SUB), new ResolveCallback() { // from class: com.spotify.esperanto.esperantocosmos.CosmosCoroutineTransport$callStream$1$callback$1
                    @Override // com.spotify.cosmos.cosmos.ResolveCallback
                    public void onError(Throwable throwable) {
                        Logger.d("Esperanto transport error: %s", throwable.getMessage());
                        ssw0Var.H(new CancellationException(l1d.m("Esperanto transport error: ", throwable.getMessage())));
                    }

                    @Override // com.spotify.cosmos.cosmos.ResolveCallback
                    public void onResolved(Response response) {
                        if (response.getStatus() != 200) {
                            Logger.d("Esperanto service unavailable: %s (status %d)", response.getUri(), Integer.valueOf(response.getStatus()));
                            ssw0Var.H(new CancellationException(l1d.m("Esperanto service unavailable: ", response.getUri())));
                            return;
                        }
                        ssw0 ssw0Var2 = ssw0Var;
                        byte[] body = response.getBody();
                        if (body == null) {
                            body = new byte[0];
                        }
                        ssw0Var2.l(body);
                    }
                }));
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.label = 1;
                Object objS = jch0.s(ssw0Var, c00011, this);
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

        /* JADX INFO: renamed from: com.spotify.esperanto.esperantocosmos.CosmosCoroutineTransport$callStream$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lp/rih1;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {2, 3, 0})
        public static final class C00011 extends hab0 implements Function0 {
            final /* synthetic */ Lifetime $lifetime;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00011(Lifetime lifetime) {
                super(0);
                this.$lifetime = lifetime;
            }

            public /* bridge */ /* synthetic */ Object invoke() {
                m22invoke();
                return rih1.a;
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m22invoke() {
                this.$lifetime.release();
            }
        }
    }
}
