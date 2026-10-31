package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class rja0 extends ton1 {
    public final tdy0 c;
    public final ggy0 d;
    public final yja0 e;
    public final zjn0 f;
    public final l141 g;
    public final String h;

    /* JADX WARN: Code duplicated, block: B:25:0x00ba  */
    public rja0(tdy0 tdy0Var, ggy0 ggy0Var, yja0 yja0Var, zjn0 zjn0Var, l141 l141Var) {
        String string;
        String strQ;
        this.c = tdy0Var;
        this.d = ggy0Var;
        this.e = yja0Var;
        this.f = zjn0Var;
        this.g = l141Var;
        if (yja0Var.i()) {
            strQ = zjn0Var.getString(yja0Var.e.c).concat(zjn0Var.getString(yja0Var.e.d));
        } else {
            vz00 vz00Var = fka0.a;
            eja0 eja0VarB = fka0.b(ggy0Var, zjn0Var, l141Var, true);
            if (eja0VarB == null) {
                mna0.d(tdy0Var, "No field signature for property: ");
                throw null;
            }
            String str = eja0VarB.d;
            String str2 = eja0VarB.e;
            StringBuilder sb = new StringBuilder(dia0.a(str));
            n9r n9rVarK = tdy0Var.k();
            if (u890.j(tdy0Var.getVisibility(), mht.d) && (n9rVarK instanceof wht)) {
                Integer num = (Integer) z0o1.l(((wht) n9rVarK).e, eka0.g);
                string = "$".concat(ikn0.a.g("_", num != null ? zjn0Var.getString(num.intValue()) : "main"));
            } else if (u890.j(tdy0Var.getVisibility(), mht.a) && (n9rVarK instanceof dzq0)) {
                xht xhtVar = ((hit) tdy0Var).f1;
                if (xhtVar instanceof lja0) {
                    lja0 lja0Var = (lja0) xhtVar;
                    if (lja0Var.b != null) {
                        StringBuilder sb2 = new StringBuilder("$");
                        String strD = lja0Var.a.d();
                        sb2.append(ajn0.e(ihc1.V0(strD, '/', strD)).b());
                        string = sb2.toString();
                    } else {
                        string = "";
                    }
                } else {
                    string = "";
                }
            } else {
                string = "";
            }
            strQ = l1d.q(sb, string, "()", str2);
        }
        this.h = strQ;
    }

    public final tdy0 C() {
        return this.c;
    }

    public final zjn0 D() {
        return this.f;
    }

    public final ggy0 E() {
        return this.d;
    }

    public final yja0 F() {
        return this.e;
    }

    public final l141 G() {
        return this.g;
    }

    public final String n() {
        return this.h;
    }
}
