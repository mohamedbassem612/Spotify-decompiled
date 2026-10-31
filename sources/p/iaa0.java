package p;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public abstract class iaa0 extends yoe0 implements qku, i980 {
    public saa0 f;

    @Override // p.i980
    public final pdo0 b() {
        return null;
    }

    @Override // p.qku
    public final void dispose() {
        Object objG0;
        Object objF;
        yoe0 yoe0Var;
        hc21 hc21Var;
        saa0 saa0VarJ = j();
        do {
            objG0 = saa0VarJ.g0();
            if (!(objG0 instanceof iaa0)) {
                if (!(objG0 instanceof i980) || ((i980) objG0).b() == null) {
                    return;
                }
                do {
                    objF = f();
                    if (objF instanceof hc21) {
                        return;
                    }
                    if (objF == this) {
                        return;
                    }
                    yoe0Var = (yoe0) objF;
                    Unsafe unsafe = avg.a;
                    long j = yoe0.e;
                    hc21Var = (hc21) unsafe.getObjectVolatile(yoe0Var, j);
                    if (hc21Var == null) {
                        hc21Var = new hc21(yoe0Var);
                        unsafe.putObjectVolatile(yoe0Var, j, hc21Var);
                    }
                } while (!g5d0.l(this, objF, hc21Var));
                yoe0Var.d();
                return;
            }
            if (objG0 != this) {
                return;
            } else {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = saa0.a;
            }
        } while (!kaa0.o(saa0VarJ, (iaa0) objG0));
    }

    @Override // p.i980
    public final boolean isActive() {
        return true;
    }

    public final saa0 j() {
        saa0 saa0Var = this.f;
        if (saa0Var != null) {
            return saa0Var;
        }
        u890.C("job");
        throw null;
    }

    public boolean k() {
        return false;
    }

    public abstract void l(Throwable th);

    @Override // p.yoe0
    public final String toString() {
        return v8r.l(this) + '@' + v8r.n(this) + "[job@" + v8r.n(j()) + ']';
    }
}
