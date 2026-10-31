package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class zta0 implements aua0 {
    public final k6a1 a;
    public bua0 b;
    public az20 c;

    public zta0(k6a1 k6a1Var) {
        this.a = k6a1Var;
    }

    public final bua0 a() {
        bua0 bua0Var = this.b;
        if (bua0Var != null) {
            return bua0Var;
        }
        u890.C("keyboardActions");
        throw null;
    }

    public final boolean b(int i) {
        iu30 iu30Var;
        b6t b6tVar;
        if (i == 7) {
            iu30Var = a().a;
        } else {
            if (i == 2) {
                a();
            } else if (i == 6) {
                iu30Var = a().b;
            } else if (i == 5) {
                a();
            } else if (i == 3) {
                iu30Var = a().c;
            } else if (i == 4) {
                a();
            } else if (i != 1 && i != 0) {
                eg.m("invalid ImeAction");
                return false;
            }
            iu30Var = null;
        }
        if (iu30Var != null) {
            iu30Var.invoke(this);
            return true;
        }
        if (i == 6) {
            dz20 dz20Var = this.c;
            if (dz20Var != null) {
                dz20Var.i(1, true);
                return true;
            }
            u890.C("focusManager");
            throw null;
        }
        if (i != 5) {
            if (i != 7 || (b6tVar = this.a) == null) {
                return false;
            }
            b6tVar.a();
            return true;
        }
        dz20 dz20Var2 = this.c;
        if (dz20Var2 != null) {
            dz20Var2.i(2, true);
            return true;
        }
        u890.C("focusManager");
        throw null;
    }
}
