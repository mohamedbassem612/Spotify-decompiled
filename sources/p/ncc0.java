package p;

import java.util.Collection;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ncc0 implements r2g {
    public final /* synthetic */ byte a;
    public final String b;
    public final d2f1 c;
    public final me30 d;
    public final yd91 e;
    public final mr20 f;
    public final o3r g;
    public final kly0 h;
    public final l381 i;

    public ncc0(d0r d0rVar, koc0 koc0Var, String str, d2f1 d2f1Var, blp blpVar, me30 me30Var) {
        this.a = (byte) 0;
        this.b = str;
        this.c = d2f1Var;
        this.h = blpVar;
        this.d = me30Var;
        this.e = new yd91(3, new nzb0(this, (byte) 7));
        this.f = rqt0.u(new x010(((roc0) koc0Var).d(), vxo1.l(d0rVar, str), new qr0(this, null, (byte) 27), (byte) 1));
        this.g = w3p1.n(new l4r(pwc0.b, 1, hyb0.Y0, new j4r(new mcc0(this, (byte) 0)), hyb0.Z0), new l4r(jd0.D, 1, hyb0.a1, new j4r(new mcc0(this, (byte) 1)), hyb0.b1), f7c0.d);
        this.i = new ye90(this);
    }

    public static boolean a(Set set, boolean z) {
        if (!z || set == null) {
            return false;
        }
        yev yevVar = occ0.a;
        Set<qqc0> set2 = set;
        if ((set2 instanceof Collection) && set2.isEmpty()) {
            return false;
        }
        for (qqc0 qqc0Var : set2) {
            if (!(qqc0Var instanceof jrc0) && (!(qqc0Var instanceof qqc0) || !ihc1.y0(qqc0Var.a))) {
                return true;
            }
        }
        return false;
    }

    @Override // p.xe91
    public final l381 c() {
        switch (this.a) {
            case 0:
                return (ye90) this.i;
            default:
                return this.i;
        }
    }

    @Override // p.xe91
    public final yd91 d() {
        switch (this.a) {
            case 0:
                break;
        }
        return this.e;
    }

    @Override // p.xe91
    public final mr20 getShow() {
        switch (this.a) {
            case 0:
                break;
        }
        return this.f;
    }

    @Override // p.r2g
    public final Integer i() {
        switch (this.a) {
            case 0:
                break;
        }
        return 1;
    }

    public ncc0(koc0 koc0Var, String str, d2f1 d2f1Var, me30 me30Var, bpq bpqVar) {
        this.a = (byte) 1;
        this.b = str;
        this.c = d2f1Var;
        this.d = me30Var;
        this.h = bpqVar;
        this.e = new yd91(3, new l451(this, (byte) 18));
        this.f = rqt0.u(new zo51(((roc0) koc0Var).d(), this, (byte) 8));
        this.g = w3p1.o(new l4r(pwc0.b, 1, ec61.Y, new j4r(new q961(this, (byte) 5)), ec61.Z), ec61.t);
        this.i = new dc31(this);
    }
}
