package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class lja0 implements xht {
    public final tia0 a;
    public final tia0 b;
    public final jc11 c;

    public lja0(jc11 jc11Var, cgy0 cgy0Var, jja0 jja0Var) {
        tia0 tia0Var = new tia0(tia0.e(bb11.a(jc11Var.a)));
        at7 at7Var = jc11Var.b;
        tia0 tia0VarC = null;
        String str = ((h6b0) at7Var.c) != h6b0.MULTIFILE_CLASS_PART ? null : (String) at7Var.h;
        if (str != null && str.length() > 0) {
            tia0VarC = tia0.c(str);
        }
        this.a = tia0Var;
        this.b = tia0VarC;
        this.c = jc11Var;
        Integer num = (Integer) z0o1.l(cgy0Var, eka0.k);
        if (num != null) {
            jja0Var.getString(num.intValue());
        }
    }

    public final heg a() {
        kf30 kf30Var;
        tia0 tia0Var = this.a;
        String str = tia0Var.a;
        int iLastIndexOf = str.lastIndexOf("/");
        if (iLastIndexOf == -1) {
            kf30Var = kf30.c;
            if (kf30Var == null) {
                tia0.a(9);
                throw null;
            }
        } else {
            kf30Var = new kf30(str.substring(0, iLastIndexOf).replace('/', '.'));
        }
        String strD = tia0Var.d();
        return new heg(kf30Var, ajn0.e(ihc1.V0(strD, '/', strD)));
    }

    public final String c() {
        return gvg.k(new StringBuilder("Class '"), a().a().a.a, '\'');
    }

    public final String toString() {
        return lja0.class.getSimpleName() + ": " + this.a;
    }
}
