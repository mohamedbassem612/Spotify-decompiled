package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class r5 implements Function0 {
    public final p2o0 a;
    public final o5 b;
    public final t8 c;
    public final int d;
    public final int e;

    public r5(p2o0 p2o0Var, o5 o5Var, t8 t8Var, int i, int i2) {
        this.a = p2o0Var;
        this.b = o5Var;
        this.c = t8Var;
        this.d = i;
        this.e = i2;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0036  */
    public final Object invoke() {
        int size;
        t8 t8Var = this.c;
        boolean z = t8Var instanceof yfy0;
        int i = 0;
        if (z) {
            size = ((yfy0) t8Var).O0.size();
        } else {
            size = t8Var instanceof ggy0 ? ((ggy0) t8Var).O0.size() : 0;
        }
        o5 o5Var = this.b;
        if (z) {
            int i2 = ((yfy0) t8Var).c;
            if ((i2 & 32) == 32 || (i2 & 64) == 64) {
                i = 1;
            }
        } else if (t8Var instanceof ggy0) {
            int i3 = ((ggy0) t8Var).c;
            if ((i3 & 32) == 32 || (i3 & 64) == 64) {
                i = 1;
            }
        } else {
            if (!(t8Var instanceof kfy0)) {
                throw new UnsupportedOperationException("Unsupported message: " + t8Var.getClass());
            }
            ihy0 ihy0Var = (ihy0) o5Var;
            if (ihy0Var.h == gfy0.ENUM_CLASS) {
                i = 2;
            } else if (ihy0Var.i) {
                i = 1;
            }
        }
        return this.a.I(o5Var, t8Var, this.d, size + i + this.e);
    }
}
