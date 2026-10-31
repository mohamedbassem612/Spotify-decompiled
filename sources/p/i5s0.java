package p;

import android.database.SQLException;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class i5s0 implements v7g1, uvz0 {
    public final vu30 a;
    public final y341 b;
    public final AtomicInteger c = new AtomicInteger(0);
    public u7g1 d;

    public i5s0(vu30 vu30Var, y341 y341Var) {
        this.a = vu30Var;
        this.b = y341Var;
    }

    @Override // p.v7g1
    public final Object a(u7g1 u7g1Var, vu30 vu30Var, a8d1 a8d1Var) {
        return this.a.invoke(new l24(this, u7g1Var, vu30Var, (lnm) null, (byte) 16), a8d1Var);
    }

    @Override // p.uvz0
    public final y341 b() {
        return this.b;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p.bdv0
    public final Object c(String str, iu30 iu30Var, onm onmVar) {
        g5s0 g5s0Var;
        if (onmVar instanceof g5s0) {
            g5s0Var = (g5s0) onmVar;
            int i = g5s0Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                g5s0Var.e = i - Integer.MIN_VALUE;
            } else {
                g5s0Var = new g5s0(this, onmVar);
            }
        } else {
            g5s0Var = new g5s0(this, onmVar);
        }
        Object objD = g5s0Var.c;
        int i2 = g5s0Var.e;
        Object obj = d9n.a;
        if (i2 == 0) {
            hm5.M(objD);
            g5s0Var.a = str;
            g5s0Var.b = iu30Var;
            g5s0Var.e = 1;
            objD = d(g5s0Var);
            if (objD != obj) {
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                hm5.M(objD);
                return objD;
            }
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        iu30Var = g5s0Var.b;
        str = g5s0Var.a;
        hm5.M(objD);
        if (((Boolean) objD).booleanValue()) {
            h5s0 h5s0Var = new h5s0(this, str, iu30Var, null);
            g5s0Var.a = null;
            g5s0Var.b = null;
            g5s0Var.e = 2;
            Object objInvoke = this.a.invoke(h5s0Var, g5s0Var);
            return objInvoke == obj ? obj : objInvoke;
        }
        d441 d441VarG1 = this.b.g1(str);
        try {
            Object objInvoke2 = iu30Var.invoke(d441VarG1);
            o0c.v(d441VarG1, (Throwable) null);
            return objInvoke2;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                o0c.v(d441VarG1, th);
                throw th2;
            }
        }
    }

    @Override // p.v7g1
    public final Boolean d(lnm lnmVar) {
        return yah0.m(this.d != null || this.b.V0());
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(u7g1 u7g1Var, vu30 vu30Var, onm onmVar) throws NoWhenBranchMatchedException {
        f5s0 f5s0Var;
        if (onmVar instanceof f5s0) {
            f5s0Var = (f5s0) onmVar;
            int i = f5s0Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                f5s0Var.d = i - Integer.MIN_VALUE;
            } else {
                f5s0Var = new f5s0(this, onmVar);
            }
        } else {
            f5s0Var = new f5s0(this, onmVar);
        }
        Object objInvoke = f5s0Var.b;
        int i2 = f5s0Var.d;
        AtomicInteger atomicInteger = this.c;
        boolean z = true;
        y341 y341Var = this.b;
        try {
            if (i2 == 0) {
                hm5.M(objInvoke);
                int iOrdinal = u7g1Var.ordinal();
                if (iOrdinal == 0) {
                    qxy0.s(y341Var, "BEGIN DEFERRED TRANSACTION");
                } else if (iOrdinal == 1) {
                    qxy0.s(y341Var, "BEGIN IMMEDIATE TRANSACTION");
                } else {
                    if (iOrdinal != 2) {
                        eg.o();
                        return null;
                    }
                    qxy0.s(y341Var, "BEGIN EXCLUSIVE TRANSACTION");
                }
                if (atomicInteger.incrementAndGet() > 0) {
                    this.d = u7g1Var;
                }
                e5s0 e5s0Var = new e5s0(this);
                f5s0Var.a = true;
                f5s0Var.d = 1;
                objInvoke = vu30Var.invoke(e5s0Var, f5s0Var);
                d9n d9nVar = d9n.a;
                if (objInvoke == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z = f5s0Var.a;
                hm5.M(objInvoke);
            }
            if (atomicInteger.decrementAndGet() == 0) {
                this.d = null;
            }
            if (z) {
                qxy0.s(y341Var, "END TRANSACTION");
                return objInvoke;
            }
            qxy0.s(y341Var, "ROLLBACK TRANSACTION");
            return objInvoke;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                try {
                    if (atomicInteger.decrementAndGet() == 0) {
                        this.d = null;
                    }
                    qxy0.s(y341Var, "ROLLBACK TRANSACTION");
                } catch (SQLException e) {
                    j2h1.h(th, e);
                }
                throw th2;
            }
        }
    }
}
