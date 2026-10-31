package com.spotify.esperanto.p000esperantoimpl;

import com.spotify.connect.esperanto.proto.ConnectMessages$StateResponse;
import com.spotify.esperanto.esperanto.CoroutineCancellable;
import com.spotify.esperanto.esperanto.CoroutineTransport;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import p.a8d1;
import p.aym;
import p.d9n;
import p.eg;
import p.faa0;
import p.fkj0;
import p.h4p1;
import p.hm5;
import p.jch0;
import p.lnm;
import p.mr20;
import p.ohd;
import p.p811;
import p.q8r;
import p.rih1;
import p.ssw0;
import p.vu30;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J4\u0010\n\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00042\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0082\b¢\u0006\u0004\b\n\u0010\u000bJ(\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\fH\u0082 ¢\u0006\u0004\b\u000e\u0010\u000fJ0\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0010H\u0082 ¢\u0006\u0004\b\u0013\u0010\u0014J0\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0015H\u0082 ¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\u0012¢\u0006\u0004\b\u0018\u0010\u0003J-\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\f0\u00192\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ(\u0010\u001c\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\fH\u0096@¢\u0006\u0004\b\u001c\u0010\u001dJ'\u0010\u001e\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001e\u0010\u000fJ\u0010\u0010\u001f\u001a\u00020\u0012H\u0086 ¢\u0006\u0004\b\u001f\u0010\u0003R\u001a\u0010!\u001a\u00020 8\u0002X\u0082D¢\u0006\f\n\u0004\b!\u0010\"\u0012\u0004\b#\u0010\u0003R\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010(\u001a\u00020'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006*"}, d2 = {"Lcom/spotify/esperanto/esperantoimpl/NativeCoroutineTransport;", "Lcom/spotify/esperanto/esperanto/CoroutineTransport;", "<init>", "()V", "T", "", "service", "method", "Lkotlin/Function0;", "block", "lockedTransport", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "", "payload", "nativeCallSync", "(Ljava/lang/String;Ljava/lang/String;[B)[B", "Lcom/spotify/esperanto/esperantoimpl/StreamCallback;", "callback", "Lp/rih1;", "startNativeStream", "(Ljava/lang/String;Ljava/lang/String;[BLcom/spotify/esperanto/esperantoimpl/StreamCallback;)V", "Lcom/spotify/esperanto/esperantoimpl/SingleCallback;", "startNativeSingle", "(Ljava/lang/String;Ljava/lang/String;[BLcom/spotify/esperanto/esperantoimpl/SingleCallback;)V", "invalidate", "Lp/mr20;", "callStream", "(Ljava/lang/String;Ljava/lang/String;[B)Lp/mr20;", "callSingle", "(Ljava/lang/String;Ljava/lang/String;[BLp/lnm;)Ljava/lang/Object;", "callSync", "destroy", "", "nThis", "J", "getNThis$annotations", "Ljava/util/concurrent/locks/ReentrantReadWriteLock;", "lock", "Ljava/util/concurrent/locks/ReentrantReadWriteLock;", "", "invalidated", "Z", "src_main_java_com_spotify_esperanto_esperantoimpl-esperanto_kt-impl"}, k = 1, mv = {2, 3, 0}, xi = ConnectMessages$StateResponse.Device.SUPPORTS_GAPLESS_FIELD_NUMBER)
public final class NativeCoroutineTransport implements CoroutineTransport {
    private boolean invalidated;
    private final ReentrantReadWriteLock lock = new ReentrantReadWriteLock();
    private final long nThis;

    /* JADX INFO: renamed from: com.spotify.esperanto.esperantoimpl.NativeCoroutineTransport$callStream$1, reason: invalid class name */
    @q8r(c = "com.spotify.esperanto.esperantoimpl.NativeCoroutineTransport$callStream$1", f = "NativeCoroutineTransport.kt", l = {135}, m = "invokeSuspend", v = 2)
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lp/ssw0;", "", "Lp/rih1;", "<anonymous>", "(Lp/ssw0;)V"}, k = 3, mv = {2, 3, 0})
    public static final class AnonymousClass1 extends a8d1 implements vu30 {
        final /* synthetic */ String $method;
        final /* synthetic */ byte[] $payload;
        final /* synthetic */ String $service;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, String str2, byte[] bArr, lnm<? super AnonymousClass1> lnmVar) {
            super(2, lnmVar);
            this.$service = str;
            this.$method = str2;
            this.$payload = bArr;
        }

        public final lnm<rih1> create(Object obj, lnm<?> lnmVar) {
            AnonymousClass1 anonymousClass1 = NativeCoroutineTransport.this.new AnonymousClass1(this.$service, this.$method, this.$payload, lnmVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        public final Object invoke(ssw0 ssw0Var, lnm<? super rih1> lnmVar) {
            return create(ssw0Var, lnmVar).invokeSuspend(rih1.a);
        }

        /* JADX WARN: Type inference failed for: r11v1, types: [com.spotify.esperanto.esperantoimpl.NativeCoroutineTransport$callStream$1$callback$1, com.spotify.esperanto.esperantoimpl.StreamCallback] */
        public final Object invokeSuspend(Object obj) {
            final ssw0 ssw0Var = (ssw0) this.L$0;
            int i = this.label;
            if (i == 0) {
                hm5.M(obj);
                ?? r11 = new StreamCallback() { // from class: com.spotify.esperanto.esperantoimpl.NativeCoroutineTransport$callStream$1$callback$1
                    private CoroutineCancellable cancellable;

                    @Override // com.spotify.esperanto.p000esperantoimpl.StreamCallback
                    public void cancel() {
                        CoroutineCancellable coroutineCancellable = this.cancellable;
                        if (coroutineCancellable != null) {
                            coroutineCancellable.cancel();
                        }
                        this.cancellable = null;
                    }

                    @Override // com.spotify.esperanto.p000esperantoimpl.StreamCallback
                    public void send(byte[] chunk) {
                        ssw0Var.l(chunk);
                    }

                    @Override // com.spotify.esperanto.p000esperantoimpl.StreamCallback
                    public void setCancellable(CoroutineCancellable cancellable) {
                        this.cancellable = cancellable;
                    }
                };
                NativeCoroutineTransport nativeCoroutineTransport = NativeCoroutineTransport.this;
                String str = this.$service;
                String str2 = this.$method;
                byte[] bArr = this.$payload;
                ReentrantReadWriteLock.ReadLock lock = nativeCoroutineTransport.lock.readLock();
                lock.lock();
                try {
                    if (nativeCoroutineTransport.invalidated) {
                        throw new IllegalStateException("call scheduled after invalidation: " + str + "." + str2);
                    }
                    nativeCoroutineTransport.startNativeStream(str, str2, bArr, r11);
                    lock.unlock();
                    2 r0 = new 2((NativeCoroutineTransport$callStream$1$callback$1) r11);
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 1;
                    Object objS = jch0.s(ssw0Var, r0, this);
                    d9n d9nVar = d9n.a;
                    if (objS == d9nVar) {
                        return d9nVar;
                    }
                } catch (Throwable th) {
                    lock.unlock();
                    throw th;
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
    }

    private static /* synthetic */ void getNThis$annotations() {
    }

    private final <T> T lockedTransport(String service, String method, Function0 block) {
        ReentrantReadWriteLock.ReadLock lock = this.lock.readLock();
        lock.lock();
        try {
            if (!this.invalidated) {
                T t = (T) block.invoke();
                lock.unlock();
                return t;
            }
            throw new IllegalStateException("call scheduled after invalidation: " + service + "." + method);
        } catch (Throwable th) {
            lock.unlock();
            throw th;
        }
    }

    private final native byte[] nativeCallSync(String service, String method, byte[] payload);

    /* JADX INFO: Access modifiers changed from: private */
    public final native void startNativeSingle(String service, String method, byte[] payload, SingleCallback callback);

    /* JADX INFO: Access modifiers changed from: private */
    public final native void startNativeStream(String service, String method, byte[] payload, StreamCallback callback);

    @Override // com.spotify.esperanto.esperanto.CoroutineTransport
    public Object callSingle(String str, String str2, byte[] bArr, lnm<? super byte[]> lnmVar) {
        final ohd ohdVar = new ohd(1, aym.t(lnmVar));
        ohdVar.t();
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        final p811 p811Var = new p811();
        SingleCallback singleCallback = new SingleCallback() { // from class: com.spotify.esperanto.esperantoimpl.NativeCoroutineTransport$callSingle$2$callback$1
            @Override // com.spotify.esperanto.p000esperantoimpl.SingleCallback
            public void resume(byte[] chunk) {
                if (atomicBoolean.compareAndSet(false, true)) {
                    ohdVar.resumeWith(chunk);
                }
            }

            @Override // com.spotify.esperanto.p000esperantoimpl.SingleCallback
            public void setCancellable(CoroutineCancellable cancellable) {
                p811Var.a = cancellable;
            }
        };
        ohdVar.n(new NativeCoroutineTransport$callSingle$2$1(atomicBoolean));
        faa0 faa0VarA = ohdVar.e.A(fkj0.W0);
        if (faa0VarA != null) {
            faa0VarA.L(new NativeCoroutineTransport$callSingle$2$2(p811Var));
        }
        ReentrantReadWriteLock.ReadLock lock = this.lock.readLock();
        lock.lock();
        try {
            if (!this.invalidated) {
                startNativeSingle(str, str2, bArr, singleCallback);
                lock.unlock();
                return ohdVar.r();
            }
            throw new IllegalStateException("call scheduled after invalidation: " + str + "." + str2);
        } catch (Throwable th) {
            lock.unlock();
            throw th;
        }
    }

    @Override // com.spotify.esperanto.esperanto.CoroutineTransport
    public mr20 callStream(String service, String method, byte[] payload) {
        return h4p1.f(new AnonymousClass1(service, method, payload, null));
    }

    @Override // com.spotify.esperanto.esperanto.CoroutineTransport
    public byte[] callSync(String service, String method, byte[] payload) {
        ReentrantReadWriteLock.ReadLock lock = this.lock.readLock();
        lock.lock();
        try {
            if (!this.invalidated) {
                byte[] bArrNativeCallSync = nativeCallSync(service, method, payload);
                lock.unlock();
                return bArrNativeCallSync;
            }
            throw new IllegalStateException("call scheduled after invalidation: " + service + "." + method);
        } catch (Throwable th) {
            lock.unlock();
            throw th;
        }
    }

    public final native void destroy();

    public final void invalidate() {
        ReentrantReadWriteLock reentrantReadWriteLock = this.lock;
        ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
        int i = 0;
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        for (int i2 = 0; i2 < readHoldCount; i2++) {
            lock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            this.invalidated = true;
            while (i < readHoldCount) {
                lock.lock();
                i++;
            }
        } finally {
            while (i < readHoldCount) {
                lock.lock();
                i++;
            }
            writeLock.unlock();
        }
    }
}
