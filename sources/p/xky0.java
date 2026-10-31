package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class xky0 {
    public final rvb0 a;

    public xky0(Function0 function0) {
        this.a = new rvb0(function0);
    }

    public ely0 a(Object obj) {
        return new ely0(this, obj, obj == null, null, null, true);
    }

    public osi1 b() {
        return this.a;
    }

    public final ely0 c(iu30 iu30Var) {
        return new ely0(this, null, false, null, iu30Var, false);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0034 A[PHI: r4
      0x0034: PHI (r4v2 p.osi1) = (r4v6 p.osi1), (r4v7 p.osi1) binds: [B:21:0x0040, B:16:0x0032] A[DONT_GENERATE, DONT_INLINE]] */
    public final osi1 d(ely0 ely0Var, osi1 osi1Var) {
        l5k l5kVar;
        osi1 osi1Var2;
        fsb1 fsb1Var;
        cjv cjvVar;
        osi1 osi1Var3 = null;
        osi1Var3 = null;
        osi1Var3 = null;
        osi1Var3 = null;
        osi1Var3 = null;
        osi1Var3 = null;
        if (osi1Var instanceof cjv) {
            if (ely0Var.e) {
                cjvVar = (cjv) osi1Var;
                cjvVar.a.setValue(ely0Var.a());
            }
        } else if (osi1Var instanceof fsb1) {
            if ((ely0Var.b || ely0Var.f != null) && !ely0Var.e) {
                fsb1Var = (fsb1) osi1Var;
                if (u890.j(ely0Var.a(), fsb1Var.a)) {
                    osi1Var2 = l5kVar;
                    osi1Var2 = fsb1Var;
                    osi1Var3 = osi1Var2;
                }
            }
        } else if (osi1Var instanceof l5k) {
            l5kVar = (l5k) osi1Var;
            if (ely0Var.d == l5kVar.a) {
                osi1Var2 = l5kVar;
                osi1Var2 = fsb1Var;
                osi1Var3 = osi1Var2;
            }
        }
        if (osi1Var3 != null) {
            osi1Var3 = cjvVar;
            return osi1Var3;
        }
        if (!ely0Var.e) {
            iu30 iu30Var = ely0Var.d;
            if (iu30Var != null) {
                osi1Var3 = cjvVar;
                return new l5k(iu30Var);
            }
            osi1Var3 = cjvVar;
            return new fsb1(ely0Var.a());
        }
        Object obj = ely0Var.f;
        kcx0 kcx0Var = ely0Var.c;
        if (kcx0Var == null) {
            osi1Var3 = cjvVar;
            kcx0Var = kcx0.R0;
        }
        osi1Var3 = cjvVar;
        return new cjv(xto.s(obj, kcx0Var));
    }
}
