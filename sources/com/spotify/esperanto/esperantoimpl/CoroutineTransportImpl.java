package com.spotify.esperanto.esperantoimpl;

import com.spotify.esperanto.esperanto.CoroutineTransport;
import com.spotify.esperanto.esperanto.Transport;
import io.reactivex.rxjava3.core.Single;
import kotlin.Metadata;
import p.d9n;
import p.eg;
import p.fc11;
import p.hm5;
import p.lnm;
import p.mr20;
import p.onm;
import p.q8r;
import p.yoi1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J-\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ(\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0096@¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/spotify/esperanto/esperantoimpl/CoroutineTransportImpl;", "Lcom/spotify/esperanto/esperanto/CoroutineTransport;", "Lcom/spotify/esperanto/esperanto/Transport;", "transport", "<init>", "(Lcom/spotify/esperanto/esperanto/Transport;)V", "", "service", "method", "", "payload", "Lp/mr20;", "callStream", "(Ljava/lang/String;Ljava/lang/String;[B)Lp/mr20;", "callSingle", "(Ljava/lang/String;Ljava/lang/String;[BLp/lnm;)Ljava/lang/Object;", "callSync", "(Ljava/lang/String;Ljava/lang/String;[B)[B", "Lcom/spotify/esperanto/esperanto/Transport;", "src_main_java_com_spotify_esperanto_esperantoimpl-esperanto_kt-impl"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class CoroutineTransportImpl implements CoroutineTransport {
    private final Transport transport;

    /* JADX INFO: renamed from: com.spotify.esperanto.esperantoimpl.CoroutineTransportImpl$callSingle$1, reason: invalid class name */
    @q8r(c = "com.spotify.esperanto.esperantoimpl.CoroutineTransportImpl", f = "CoroutineTransportImpl.kt", l = {16}, m = "callSingle", v = 2)
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class AnonymousClass1 extends onm {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(lnm<? super AnonymousClass1> lnmVar) {
            super(lnmVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CoroutineTransportImpl.this.callSingle(null, null, null, this);
        }
    }

    public CoroutineTransportImpl(Transport transport) {
        this.transport = transport;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object callSingle(String str, String str2, byte[] bArr, lnm<? super byte[]> lnmVar) {
        AnonymousClass1 anonymousClass1;
        if (lnmVar instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) lnmVar;
            int i = anonymousClass1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(lnmVar);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(lnmVar);
        }
        Object objJ = anonymousClass1.result;
        int i2 = anonymousClass1.label;
        if (i2 == 0) {
            hm5.M(objJ);
            Single singleCallSingle = this.transport.callSingle(str, str2, bArr);
            anonymousClass1.L$0 = null;
            anonymousClass1.L$1 = null;
            anonymousClass1.L$2 = null;
            anonymousClass1.label = 1;
            objJ = fc11.j(singleCallSingle, anonymousClass1);
            d9n d9nVar = d9n.a;
            if (objJ == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objJ);
        }
        return objJ;
    }

    public mr20 callStream(String service, String method, byte[] payload) {
        return yoi1.g(this.transport.callStream(service, method, payload));
    }

    public byte[] callSync(String service, String method, byte[] payload) {
        return this.transport.callSync(service, method, payload);
    }
}
