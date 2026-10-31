package p;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public class yoe0 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(yoe0.class, Object.class, "_next$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater b;
    public static final /* synthetic */ long c;
    public static final /* synthetic */ long d;
    public static final /* synthetic */ long e;
    private volatile /* synthetic */ Object _next$volatile = this;
    private volatile /* synthetic */ Object _prev$volatile = this;
    private volatile /* synthetic */ Object _removedRef$volatile;

    static {
        Unsafe unsafe = avg.a;
        c = unsafe.objectFieldOffset(yoe0.class.getDeclaredField("_next$volatile"));
        b = AtomicReferenceFieldUpdater.newUpdater(yoe0.class, Object.class, "_prev$volatile");
        d = unsafe.objectFieldOffset(yoe0.class.getDeclaredField("_prev$volatile"));
        e = unsafe.objectFieldOffset(yoe0.class.getDeclaredField("_removedRef$volatile"));
    }

    public final boolean c(yoe0 yoe0Var, int i) {
        yoe0 yoe0VarH;
        do {
            yoe0VarH = h();
            if (yoe0VarH instanceof xmc0) {
                return (((xmc0) yoe0VarH).f & i) == 0 && yoe0VarH.c(yoe0Var, i);
            }
            Unsafe unsafe = avg.a;
            unsafe.putObjectVolatile(yoe0Var, d, yoe0VarH);
            unsafe.putObjectVolatile(yoe0Var, c, this);
        } while (!g5d0.m(yoe0VarH, this, yoe0Var));
        yoe0Var.e(this);
        return true;
    }

    public final yoe0 d() {
        yoe0 yoe0Var;
        Object objectVolatile;
        while (true) {
            Unsafe unsafe = avg.a;
            long j = d;
            yoe0 yoe0Var2 = (yoe0) unsafe.getObjectVolatile(this, j);
            yoe0Var = yoe0Var2;
            while (true) {
                yoe0 yoe0Var3 = null;
                while (true) {
                    g5d0.g(yoe0Var);
                    Unsafe unsafe2 = avg.a;
                    objectVolatile = unsafe2.getObjectVolatile(yoe0Var, c);
                    if (objectVolatile == this) {
                        if (yoe0Var2 != yoe0Var && !g5d0.n(this, yoe0Var2, yoe0Var)) {
                            break;
                        }
                        break;
                    }
                    if (i()) {
                        return null;
                    }
                    if (!(objectVolatile instanceof hc21)) {
                        yoe0Var3 = yoe0Var;
                        yoe0Var = (yoe0) objectVolatile;
                    } else {
                        if (yoe0Var3 != null) {
                            break;
                        }
                        g5d0.g(yoe0Var);
                        yoe0Var = (yoe0) unsafe2.getObjectVolatile(yoe0Var, j);
                    }
                }
                if (!g5d0.p(yoe0Var3, yoe0Var, ((hc21) objectVolatile).a)) {
                    break;
                }
                yoe0Var = yoe0Var3;
            }
        }
        return yoe0Var;
    }

    public final void e(yoe0 yoe0Var) {
        yoe0 yoe0Var2;
        do {
            yoe0Var2 = (yoe0) avg.a.getObjectVolatile(yoe0Var, d);
            if (f() != yoe0Var) {
                return;
            }
        } while (!g5d0.q(yoe0Var, yoe0Var2, this));
        if (i()) {
            yoe0Var.d();
        }
    }

    public final Object f() {
        return avg.a.getObjectVolatile(this, c);
    }

    public final yoe0 g() {
        Object objF = f();
        hc21 hc21Var = objF instanceof hc21 ? (hc21) objF : null;
        return hc21Var != null ? hc21Var.a : (yoe0) objF;
    }

    public final yoe0 h() {
        yoe0 yoe0VarD = d();
        if (yoe0VarD != null) {
            return yoe0VarD;
        }
        Unsafe unsafe = avg.a;
        long j = d;
        Object objectVolatile = unsafe.getObjectVolatile(this, j);
        while (true) {
            yoe0 yoe0Var = (yoe0) objectVolatile;
            if (!yoe0Var.i()) {
                return yoe0Var;
            }
            objectVolatile = avg.a.getObjectVolatile(yoe0Var, j);
        }
    }

    public boolean i() {
        return f() instanceof hc21;
    }

    public String toString() {
        return new i1w(this) + '@' + v8r.n(this);
    }
}
