package p;

import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class az81 {
    public final f0f1 a;
    public final iu30 b;
    public final Function0 c;
    public final iu30 d;
    public final llm e;
    public volatile Object f;
    public volatile int h;
    public iti1 j;
    public final AtomicInteger g = new AtomicInteger(0);
    public final xgn0 i = ygn0.a();

    public az81(elg elgVar, f0f1 f0f1Var, iu30 iu30Var, Function0 function0, d781 d781Var, q8n q8nVar) {
        this.a = f0f1Var;
        this.b = iu30Var;
        this.c = function0;
        this.d = d781Var;
        this.e = us71.h(q8nVar);
        this.f = elgVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(l2t l2tVar, int i, onm onmVar) {
        vy81 vy81Var;
        if (onmVar instanceof vy81) {
            vy81Var = (vy81) onmVar;
            int i2 = vy81Var.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                vy81Var.c = i2 - Integer.MIN_VALUE;
            } else {
                vy81Var = new vy81(this, onmVar);
            }
        } else {
            vy81Var = new vy81(this, onmVar);
        }
        Object objO = vy81Var.a;
        int i3 = vy81Var.c;
        if (i3 == 0) {
            hm5.M(objO);
            h2e h2eVar = new h2e(l2tVar, (lnm) null, (byte) 1);
            vy81Var.c = 1;
            objO = rc2.O(i, h2eVar, vy81Var);
            d9n d9nVar = d9n.a;
            if (objO == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i3 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objO);
        }
        return objO == null ? this.c.invoke() : objO;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object b(int i, onm onmVar) {
        xy81 xy81Var;
        xgn0 xgn0Var;
        int i2;
        int i3;
        az81 az81Var;
        s2t s2tVarQ;
        if (onmVar instanceof xy81) {
            xy81Var = (xy81) onmVar;
            int i4 = xy81Var.e;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                xy81Var.e = i4 - Integer.MIN_VALUE;
            } else {
                xy81Var = new xy81(this, onmVar);
            }
        } else {
            xy81Var = new xy81(this, onmVar);
        }
        Object obj = xy81Var.c;
        int i5 = xy81Var.e;
        d9n d9nVar = d9n.a;
        try {
            if (i5 == 0) {
                hm5.M(obj);
                xgn0Var = this.i;
                xy81Var.b = xgn0Var;
                xy81Var.a = i;
                xy81Var.e = 1;
                if (xgn0Var.a(xy81Var) != d9nVar) {
                }
                i2 = i;
                return d9nVar;
            }
            if (i5 != 1) {
                if (i5 != 2) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                l2t l2tVar = xy81Var.b;
                hm5.M(obj);
                return obj;
            }
            int i6 = xy81Var.a;
            xgn0Var = xy81Var.b;
            hm5.M(obj);
            i2 = i6;
            iti1 iti1Var = this.j;
            AtomicInteger atomicInteger = this.g;
            if (iti1Var != null && iti1Var.a && iti1Var.b == atomicInteger.get()) {
                s2tVarQ = (s2t) iti1Var.c;
                az81Var = this;
            } else {
                int iIncrementAndGet = atomicInteger.incrementAndGet();
                az81Var = this;
                s2tVarQ = fn31.q(this.e, (o8n) null, 0, new yy81(true, az81Var, i3 == true ? 1 : 0, iIncrementAndGet, null), 3);
                az81Var.j = new iti1(iIncrementAndGet, true, s2tVarQ);
            }
            xgn0Var.c((Object) null);
            xy81Var.b = null;
            xy81Var.a = i3 == true ? (short) 1 : (short) 0;
            xy81Var.e = 2;
            Object objA = az81Var.a(s2tVarQ, i3 == true ? 1 : 0, xy81Var);
            if (objA != d9nVar) {
                return objA;
            }
            i2 = i;
            return d9nVar;
        } catch (Throwable th) {
            xgn0Var.c((Object) null);
            throw th;
        }
        i2 = i;
        i3 = i2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object c(int i, onm onmVar) {
        zy81 zy81Var;
        xgn0 xgn0Var;
        int i2;
        int i3;
        az81 az81Var;
        s2t s2tVarQ;
        if (onmVar instanceof zy81) {
            zy81Var = (zy81) onmVar;
            int i4 = zy81Var.e;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                zy81Var.e = i4 - Integer.MIN_VALUE;
            } else {
                zy81Var = new zy81(this, onmVar);
            }
        } else {
            zy81Var = new zy81(this, onmVar);
        }
        Object obj = zy81Var.c;
        d9n d9nVar = d9n.a;
        int i5 = zy81Var.e;
        try {
            if (i5 == 0) {
                hm5.M(obj);
                xgn0Var = this.i;
                zy81Var.b = xgn0Var;
                zy81Var.a = i;
                zy81Var.e = 1;
                if (xgn0Var.a(zy81Var) != d9nVar) {
                }
                i2 = i;
                return d9nVar;
            }
            if (i5 != 1) {
                if (i5 != 2) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                l2t l2tVar = zy81Var.b;
                hm5.M(obj);
                return obj;
            }
            int i6 = zy81Var.a;
            xgn0Var = zy81Var.b;
            hm5.M(obj);
            i2 = i6;
            int i7 = this.g.get();
            if (this.h == i7 && !((Boolean) this.b.invoke(this.f)).booleanValue()) {
                Object obj2 = this.f;
                xgn0Var.c((Object) null);
                return obj2;
            }
            iti1 iti1Var = this.j;
            if (iti1Var == null || iti1Var.b != i7) {
                az81Var = this;
                s2tVarQ = fn31.q(this.e, (o8n) null, 0, new yy81(false, az81Var, i3 == true ? 1 : 0, i7, null), 3);
                az81Var.j = new iti1(i7, false, s2tVarQ);
            } else {
                s2tVarQ = (s2t) iti1Var.c;
                az81Var = this;
            }
            xgn0Var.c((Object) null);
            zy81Var.b = null;
            zy81Var.a = i3 == true ? (short) 1 : (short) 0;
            zy81Var.e = 2;
            Object objA = az81Var.a(s2tVarQ, i3 == true ? 1 : 0, zy81Var);
            if (objA != d9nVar) {
                return objA;
            }
            i2 = i;
            return d9nVar;
        } catch (Throwable th) {
            xgn0Var.c((Object) null);
            throw th;
        }
        i2 = i;
        i3 = i2;
    }
}
