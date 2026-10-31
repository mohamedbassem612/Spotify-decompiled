package p;

import android.os.Bundle;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class n7c0 implements iu61 {
    public final /* synthetic */ byte a = 0;
    public final Object b;
    public final Object c;
    public final Object d;

    public n7c0(zgz0 zgz0Var, nl51 nl51Var, dr41 dr41Var, nbc nbcVar) {
        this.b = zgz0Var;
        this.c = nl51Var;
        this.d = dr41Var;
    }

    @Override // p.iu61
    public final hu61 create() {
        byte b = this.a;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                return new hu61(new jx21(2131962085), mqo1.s(new xt61[]{new xt61(qnx.c, null, null, null, mqo1.s(new sq61[]{((vn8) obj3).c(2131962085), ((sjq0) obj2).s0(), ((myq0) obj).f()}), 253)}));
            default:
                jx21 jx21Var = new jx21(2131962182);
                pox poxVar = pox.c;
                jgb1 jgb1VarB = ((zgz0) obj3).b();
                jgb1 jgb1VarB2 = ((nl51) obj2).b();
                jgb1 jgb1VarI = ((dr41) obj).i();
                c0g.x.getClass();
                return new hu61(jx21Var, mqo1.s(new xt61[]{new xt61(poxVar, null, null, null, mqo1.s(new sq61[]{jgb1VarB, jgb1VarB2, jgb1VarI, new jgb1("profileViewAllPrivacySettings", 2131962183, null, null, null, null, null, null, cxo1.P0, null, new qxn0(new jxn0(59, false), new nxn0(nik1.e1, (Bundle) null)), null, 90106)}), 253)}));
        }
    }

    public n7c0(vn8 vn8Var, sjq0 sjq0Var, myq0 myq0Var) {
        this.b = vn8Var;
        this.c = sjq0Var;
        this.d = myq0Var;
    }
}
