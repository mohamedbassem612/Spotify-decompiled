package p;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ay40 {
    public final vx40 a;
    public final g0l b;
    public final by40 c;
    public final AtomicInteger d = new AtomicInteger(0);
    public final dt71 e = mgo1.e(1, 0, 0, 6);

    public ay40(vx40 vx40Var, g0l g0lVar, by40 by40Var) {
        this.a = vx40Var;
        this.b = g0lVar;
        this.c = by40Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(onm onmVar) throws Throwable {
        wx40 wx40Var;
        if (onmVar instanceof wx40) {
            wx40Var = (wx40) onmVar;
            int i = wx40Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                wx40Var.c = i - Integer.MIN_VALUE;
            } else {
                wx40Var = new wx40(this, onmVar);
            }
        } else {
            wx40Var = new wx40(this, onmVar);
        }
        Object obj = wx40Var.a;
        int i2 = wx40Var.c;
        m231 m231Var = rih1.a;
        AtomicInteger atomicInteger = this.d;
        try {
            if (i2 == 0) {
                hm5.M(obj);
                if (atomicInteger.getAndIncrement() > 0) {
                    return m231Var;
                }
                vx40 vx40Var = this.a;
                wx40Var.c = 1;
                Object objY = vx40Var.y(this, wx40Var);
                d9n d9nVar = d9n.a;
                if (objY == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
            }
        } catch (Throwable th) {
            m231Var = new m231(th);
        }
        if (e331.a(m231Var) != null) {
            atomicInteger.decrementAndGet();
        }
        Throwable thA = e331.a(m231Var);
        if (thA == null || !(thA instanceof CancellationException)) {
            return m231Var;
        }
        throw thA;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x008e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(onm onmVar) throws Throwable {
        xx40 xx40Var;
        Object objC;
        int i;
        int i2;
        Object objC2;
        if (onmVar instanceof xx40) {
            xx40Var = (xx40) onmVar;
            int i3 = xx40Var.e;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                xx40Var.e = i3 - Integer.MIN_VALUE;
            } else {
                xx40Var = new xx40(this, onmVar);
            }
        } else {
            xx40Var = new xx40(this, onmVar);
        }
        Object obj = xx40Var.c;
        int i4 = xx40Var.e;
        d9n d9nVar = d9n.a;
        if (i4 == 0) {
            hm5.M(obj);
            xx40Var.e = 1;
            objC = c(xx40Var);
            if (objC != d9nVar) {
            }
            return d9nVar;
        }
        if (i4 == 1) {
            hm5.M(obj);
            objC = ((e331) obj).a;
        } else {
            if (i4 != 2) {
                if (i4 == 3) {
                    hm5.M(obj);
                    return ((e331) obj).a;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = xx40Var.b;
            i2 = xx40Var.a;
            hm5.M(obj);
        }
        xx40Var.a = i2;
        xx40Var.b = i;
        xx40Var.e = 3;
        objC2 = c(xx40Var);
        if (objC2 != d9nVar) {
            return d9nVar;
        }
        return objC2;
        if (objC instanceof m231) {
            Throwable thA = e331.a(objC);
            ApiException apiException = thA instanceof ApiException ? (ApiException) thA : null;
            if (apiException != null && apiException.getStatusCode() == 10) {
                i = 0;
                xx40Var.a = 0;
                xx40Var.b = 0;
                xx40Var.e = 2;
                if (this.a.y(this, xx40Var) != d9nVar) {
                    i2 = 0;
                    xx40Var.a = i2;
                    xx40Var.b = i;
                    xx40Var.e = 3;
                    objC2 = c(xx40Var);
                    if (objC2 != d9nVar) {
                        return objC2;
                    }
                }
                return d9nVar;
            }
        }
        return objC;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(onm onmVar) throws Throwable {
        yx40 yx40Var;
        rih1 m231Var;
        Status status;
        int i;
        if (onmVar instanceof yx40) {
            yx40Var = (yx40) onmVar;
            int i2 = yx40Var.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                yx40Var.c = i2 - Integer.MIN_VALUE;
            } else {
                yx40Var = new yx40(this, onmVar);
            }
        } else {
            yx40Var = new yx40(this, onmVar);
        }
        Object obj = yx40Var.a;
        int i3 = yx40Var.c;
        try {
            if (i3 == 0) {
                hm5.M(obj);
                vx40 vx40Var = this.a;
                yx40Var.c = 1;
                Object objA = vx40Var.A(yx40Var);
                d9n d9nVar = d9n.a;
                if (objA == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i3 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
            }
            m231Var = rih1.a;
        } catch (Throwable th) {
            m231Var = new m231(th);
        }
        Throwable thA = e331.a(m231Var);
        if (thA != null) {
            ApiException apiException = thA instanceof ApiException ? (ApiException) thA : null;
            if (apiException != null && (i = (status = apiException.getStatus()).a) != 10) {
                lal lalVar = status.d;
                this.c.a((lalVar == null || lalVar.b != 16) ? gm50.w(i) : "API_UNAVAILABLE");
            }
        }
        Throwable thA2 = e331.a(m231Var);
        if (thA2 == null || !(thA2 instanceof CancellationException)) {
            return m231Var;
        }
        throw thA2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(onm onmVar) throws Throwable {
        zx40 zx40Var;
        if (onmVar instanceof zx40) {
            zx40Var = (zx40) onmVar;
            int i = zx40Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                zx40Var.c = i - Integer.MIN_VALUE;
            } else {
                zx40Var = new zx40(this, onmVar);
            }
        } else {
            zx40Var = new zx40(this, onmVar);
        }
        Object obj = zx40Var.a;
        int i2 = zx40Var.c;
        rih1 m231Var = rih1.a;
        AtomicInteger atomicInteger = this.d;
        try {
            if (i2 == 0) {
                hm5.M(obj);
                if (atomicInteger.decrementAndGet() > 0) {
                    return m231Var;
                }
                vx40 vx40Var = this.a;
                zx40Var.c = 1;
                Object objD = vx40Var.D(this, zx40Var);
                d9n d9nVar = d9n.a;
                if (objD == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
            }
        } catch (Throwable th) {
            m231Var = new m231(th);
        }
        if (!(m231Var instanceof m231)) {
            this.e.a(rx40.a);
        }
        if (e331.a(m231Var) != null) {
            atomicInteger.incrementAndGet();
        }
        Throwable thA = e331.a(m231Var);
        if (thA == null || !(thA instanceof CancellationException)) {
            return m231Var;
        }
        throw thA;
    }
}
