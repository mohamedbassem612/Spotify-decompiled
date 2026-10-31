package p;

import android.content.Context;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class fle implements s771 {
    public final Context a;

    public fle(Context context) {
        this.a = context;
    }

    @Override // p.s771
    public final boolean a(ybz ybzVar) {
        return ybzVar.c != null;
    }

    @Override // p.s771
    public final Object b(ybz ybzVar, String str, lnm lnmVar) {
        String str2;
        jlw0 jlw0Var;
        j1z j1zVar = ybzVar.b;
        so71 so71Var = ybzVar.f;
        h281 h281Var = ybzVar.a;
        boolean zA = j1zVar.a();
        dhe dheVar = ybzVar.c;
        if (!zA) {
            if (dheVar == null) {
                hhg1.n("Required value was null.");
                return null;
            }
            jlw0 jlw0Var2 = j1zVar.c;
            int i = so71Var.a;
            int i2 = so71Var.c;
            str2 = h281Var != null ? h281Var.b : null;
            return c(dheVar, new qr7(jlw0Var2, i, i2, str2 == null ? "" : str2, j1zVar.a, dheVar.a), rc11.a.b(vq7.class), bz61.d, tyo1.p(blc0.ig, new String[0]));
        }
        if (dheVar == null) {
            hhg1.n("Required value was null.");
            return null;
        }
        jlw0 jlw0Var3 = ybzVar.e;
        if (h281Var == null || (jlw0Var = h281Var.c) == null) {
            jlw0Var = j1zVar.c;
        }
        jlw0 jlw0Var4 = jlw0Var;
        int i3 = so71Var.a;
        int i4 = so71Var.c;
        str2 = h281Var != null ? h281Var.b : null;
        return c(dheVar, new shj1(jlw0Var3, jlw0Var4, i3, i4, str2 == null ? "" : str2, dheVar.c, j1zVar.f, j1zVar.a, dheVar.a), rc11.a.b(rgj1.class), ahl.a, tyo1.p(blc0.jg, new String[0]));
    }

    public final u771 c(dhe dheVar, c871 c871Var, tka0 tka0Var, ez61 ez61Var, z771 z771Var) {
        return new u771(new t771(new wa71(dheVar.a, null, null, null, null, null, null, 126), z771Var), new pz61(new y171(tka0Var), c871Var, ez61Var, true), new bj71(null, false, this.a.getString(2131955581), 3));
    }
}
