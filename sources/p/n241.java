package p;

import io.reactivex.rxjava3.core.ObservableEmitter;
import io.reactivex.rxjava3.exceptions.UndeliverableException;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class n241 extends q6 implements ssw0 {
    public static final /* synthetic */ long g = avg.a.objectFieldOffset(n241.class.getDeclaredField("_signal$volatile"));
    private volatile /* synthetic */ int _signal$volatile;
    public final ObservableEmitter e;
    public final xgn0 f;

    public n241(o8n o8nVar, ObservableEmitter observableEmitter) {
        super(o8nVar, false, true);
        this.e = observableEmitter;
        this.f = ygn0.a();
    }

    public final void B(iu30 iu30Var) {
        throw new UnsupportedOperationException("RxObservableCoroutine doesn't support invokeOnClose");
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0020  */
    public final IllegalStateException B0(Object obj) {
        boolean z;
        if (!isActive()) {
            Throwable thA0 = a0();
            Object objG0 = g0();
            if (objG0 instanceof nyh) {
                z = avg.a.getIntVolatile((nyh) objG0, nyh.b) == 1;
            }
            C0(thA0, z);
            return g();
        }
        try {
            this.e.onNext(obj);
            D0();
            return null;
        } catch (Throwable th) {
            UndeliverableException undeliverableException = new UndeliverableException(th);
            boolean zR = R(undeliverableException);
            D0();
            if (zR) {
                return undeliverableException;
            }
            w0h1.u(undeliverableException, ((q6) this).d);
            return g();
        }
    }

    public final void C0(Throwable th, boolean z) {
        long j = g;
        xgn0 xgn0Var = this.f;
        try {
            Unsafe unsafe = avg.a;
            if (unsafe.getIntVolatile(this, j) == -2) {
                xgn0Var.c((Object) null);
                return;
            }
            unsafe.putIntVolatile(this, j, -2);
            Throwable th2 = th != null ? th : null;
            o8n o8nVar = ((q6) this).d;
            ObservableEmitter observableEmitter = this.e;
            if (th2 == null) {
                try {
                    observableEmitter.onComplete();
                } catch (Exception e) {
                    w0h1.u(e, o8nVar);
                }
            } else if ((th2 instanceof UndeliverableException) && !z) {
                w0h1.u(th, o8nVar);
            } else if (th2 != g() || !observableEmitter.isDisposed()) {
                try {
                    observableEmitter.onError(th);
                } catch (Exception e2) {
                    j2h1.h(th, e2);
                    w0h1.u(th, o8nVar);
                }
            }
            xgn0Var.c((Object) null);
        } catch (Throwable th3) {
            xgn0Var.c((Object) null);
            throw th3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002c  */
    public final void D0() {
        boolean z;
        xgn0 xgn0Var = this.f;
        xgn0Var.c((Object) null);
        if (isActive() || !xgn0Var.g()) {
            return;
        }
        Throwable thA0 = a0();
        Object objG0 = g0();
        if (objG0 instanceof nyh) {
            z = avg.a.getIntVolatile((nyh) objG0, nyh.b) == 1;
        }
        C0(thA0, z);
    }

    public final boolean K() {
        return !isActive();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(Object obj, lnm lnmVar) {
        m241 m241Var;
        if (lnmVar instanceof m241) {
            m241Var = (m241) lnmVar;
            int i = m241Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                m241Var.d = i - Integer.MIN_VALUE;
            } else {
                m241Var = new m241(this, lnmVar);
            }
        } else {
            m241Var = new m241(this, lnmVar);
        }
        Object obj2 = m241Var.b;
        int i2 = m241Var.d;
        if (i2 == 0) {
            hm5.M(obj2);
            m241Var.a = obj;
            m241Var.d = 1;
            Object objA = this.f.a(m241Var);
            d9n d9nVar = d9n.a;
            if (objA == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            obj = m241Var.a;
            hm5.M(obj2);
        }
        IllegalStateException illegalStateExceptionB0 = B0(obj);
        if (illegalStateExceptionB0 == null) {
            return rih1.a;
        }
        throw illegalStateExceptionB0;
    }

    public final Object l(Object obj) {
        if (!this.f.g()) {
            return qge.b;
        }
        IllegalStateException illegalStateExceptionB0 = B0(obj);
        return illegalStateExceptionB0 == null ? rih1.a : new oge(illegalStateExceptionB0);
    }

    public final void y0(Throwable th, boolean z) {
        if (avg.a.compareAndSwapInt(this, g, 0, -1) && this.f.g()) {
            C0(th, z);
        }
    }

    public final void z0(Object obj) {
        if (avg.a.compareAndSwapInt(this, g, 0, -1) && this.f.g()) {
            C0(null, false);
        }
    }

    public final r261 c() {
        return this;
    }
}
