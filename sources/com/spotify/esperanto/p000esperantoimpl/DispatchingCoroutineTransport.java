package com.spotify.esperanto.p000esperantoimpl;

import com.spotify.connect.esperanto.proto.ConnectMessages$StateResponse;
import com.spotify.esperanto.esperanto.CoroutineTransport;
import kotlin.Metadata;
import p.a8d1;
import p.c921;
import p.c9n;
import p.d9n;
import p.eg;
import p.hm5;
import p.lnm;
import p.mr20;
import p.o4p1;
import p.q8n;
import p.q8r;
import p.rih1;
import p.vu30;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006J-\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\f2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ(\u0010\u000f\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0096@¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0011\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0013R\u0014\u0010\u0004\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/spotify/esperanto/esperantoimpl/DispatchingCoroutineTransport;", "Lcom/spotify/esperanto/esperanto/CoroutineTransport;", "Lp/q8n;", "dispatcher", "transport", "<init>", "(Lp/q8n;Lcom/spotify/esperanto/esperanto/CoroutineTransport;)V", "", "service", "method", "", "payload", "Lp/mr20;", "callStream", "(Ljava/lang/String;Ljava/lang/String;[B)Lp/mr20;", "callSingle", "(Ljava/lang/String;Ljava/lang/String;[BLp/lnm;)Ljava/lang/Object;", "callSync", "(Ljava/lang/String;Ljava/lang/String;[B)[B", "Lp/q8n;", "Lcom/spotify/esperanto/esperanto/CoroutineTransport;", "src_main_java_com_spotify_esperanto_esperantoimpl-esperanto_kt-impl"}, k = 1, mv = {2, 3, 0}, xi = ConnectMessages$StateResponse.Device.SUPPORTS_GAPLESS_FIELD_NUMBER)
public final class DispatchingCoroutineTransport implements CoroutineTransport {
    private final q8n dispatcher;
    private final CoroutineTransport transport;

    /* JADX INFO: renamed from: com.spotify.esperanto.esperantoimpl.DispatchingCoroutineTransport$callSingle$2, reason: invalid class name */
    @q8r(c = "com.spotify.esperanto.esperantoimpl.DispatchingCoroutineTransport$callSingle$2", f = "DispatchingCoroutineTransport.kt", l = {24}, m = "invokeSuspend", v = 2)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lp/c9n;", "", "<anonymous>", "(Lp/c9n;)[B"}, k = 3, mv = {2, 3, 0})
    public static final class AnonymousClass2 extends a8d1 implements vu30 {
        final /* synthetic */ String $method;
        final /* synthetic */ byte[] $payload;
        final /* synthetic */ String $service;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String str, String str2, byte[] bArr, lnm<? super AnonymousClass2> lnmVar) {
            super(2, lnmVar);
            this.$service = str;
            this.$method = str2;
            this.$payload = bArr;
        }

        public final lnm<rih1> create(Object obj, lnm<?> lnmVar) {
            return DispatchingCoroutineTransport.this.new AnonymousClass2(this.$service, this.$method, this.$payload, lnmVar);
        }

        public final Object invoke(c9n c9nVar, lnm<? super byte[]> lnmVar) {
            return create(c9nVar, lnmVar).invokeSuspend(rih1.a);
        }

        public final Object invokeSuspend(Object obj) {
            int i = this.label;
            if (i != 0) {
                if (i == 1) {
                    hm5.M(obj);
                    return obj;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj);
            CoroutineTransport coroutineTransport = DispatchingCoroutineTransport.this.transport;
            String str = this.$service;
            String str2 = this.$method;
            byte[] bArr = this.$payload;
            this.label = 1;
            Object objCallSingle = coroutineTransport.callSingle(str, str2, bArr, this);
            d9n d9nVar = d9n.a;
            return objCallSingle == d9nVar ? d9nVar : objCallSingle;
        }
    }

    public DispatchingCoroutineTransport(q8n q8nVar, CoroutineTransport coroutineTransport) {
        this.dispatcher = q8nVar;
        this.transport = coroutineTransport;
    }

    @Override // com.spotify.esperanto.esperanto.CoroutineTransport
    public Object callSingle(String str, String str2, byte[] bArr, lnm<? super byte[]> lnmVar) {
        return c921.H(this.dispatcher, new AnonymousClass2(str, str2, bArr, null), lnmVar);
    }

    @Override // com.spotify.esperanto.esperanto.CoroutineTransport
    public mr20 callStream(String service, String method, byte[] payload) {
        return o4p1.r(this.transport.callStream(service, method, payload), this.dispatcher);
    }

    @Override // com.spotify.esperanto.esperanto.CoroutineTransport
    public byte[] callSync(String service, String method, byte[] payload) {
        return this.transport.callSync(service, method, payload);
    }
}
