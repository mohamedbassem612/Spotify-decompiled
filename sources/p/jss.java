package p;

import android.transition.Transition;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class jss extends k9 {
    public final Object c;
    public final Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Code duplicated, block: B:9:0x0015 A[PHI: r4
      0x0015: PHI (r4v3 p.vf30) = (r4v2 p.vf30), (r4v2 p.vf30), (r4v2 p.vf30), (r4v5 p.vf30), (r4v5 p.vf30), (r4v5 p.vf30) binds: [B:21:0x002d, B:16:0x0024, B:18:0x0027, B:11:0x001a, B:6:0x0010, B:8:0x0013] A[DONT_GENERATE, DONT_INLINE]] */
    public jss(foa1 foa1Var, boolean z, boolean z2) {
        vf30 vf30Var;
        Integer num;
        super(foa1Var, (byte) 5);
        zf30 zf30Var = foa1Var.c;
        Transition transition = null;
        if (foa1Var.a == 2) {
            vf30Var = zf30Var.m1;
            if (z) {
                if (vf30Var == null || vf30Var == null) {
                    num = null;
                } else {
                    num = vf30Var.k;
                }
            } else if (vf30Var == null) {
                num = null;
            } else {
                num = vf30Var.i;
            }
        } else {
            vf30Var = zf30Var.m1;
            if (z) {
                if (vf30Var == null || vf30Var == null) {
                    num = null;
                } else {
                    num = vf30Var.i;
                }
            } else if (vf30Var == null) {
                num = null;
            } else {
                num = vf30Var.k;
            }
        }
        this.c = num;
        if (z2) {
            if (z) {
                if (vf30Var != null && vf30Var != null) {
                    transition = vf30Var.m;
                }
            } else if (vf30Var != null) {
                transition = vf30Var.m;
            }
        }
        this.d = transition;
    }

    public final ej30 v1() {
        Object obj = this.c;
        ej30 ej30VarW1 = w1(obj);
        Object obj2 = this.d;
        ej30 ej30VarW2 = w1(obj2);
        if (ej30VarW1 == null || ej30VarW2 == null || ej30VarW1 == ej30VarW2) {
            return ej30VarW1 == null ? ej30VarW2 : ej30VarW1;
        }
        bhn0.n("Mixing framework transitions and AndroidX transitions is not allowed. Fragment ", U0().c, " returned Transition ", obj, " which uses a different Transition  type than its shared element transition ", obj2);
        return null;
    }

    public final ej30 w1(Object obj) {
        if (obj == null) {
            return null;
        }
        cj30 cj30Var = xi30.a;
        if (cj30Var.g(obj)) {
            return cj30Var;
        }
        ej30 ej30Var = xi30.b;
        if (ej30Var != null && ej30Var.g(obj)) {
            return ej30Var;
        }
        jah.j("Transition ", obj, " for fragment ", U0().c, " is not a valid framework Transition or AndroidX Transition");
        return null;
    }
}
