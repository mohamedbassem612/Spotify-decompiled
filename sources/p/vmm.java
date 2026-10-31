package p;

import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class vmm implements m381 {
    public final /* synthetic */ byte a;
    public final o3r b;

    public vmm(wmm wmmVar) {
        this.a = (byte) 0;
        jd11 jd11Var = rc11.a;
        this.b = w3p1.n(new l4r(new xv00(jd11Var.b(zmm.class)), 2, afm.Y0, new j4r(afm.X0), afm.Z0), new l4r(new xv00(jd11Var.b(xmm.class)), 1, afm.a1, new j4r(new v7l(wmmVar, (byte) 19)), afm.b1), u2m.X);
    }

    public final o3r b() {
        byte b = this.a;
        return this.b;
    }

    public final boolean r(vhc1 vhc1Var, Object obj) {
        hll hllVar;
        List list;
        switch (this.a) {
            case 0:
                umm ummVar = (umm) obj;
                String strE = wmm.e(ummVar.b, ummVar.a);
                return !(strE == null || strE.length() == 0);
            default:
                bqj1 bqj1Var = (bqj1) obj;
                Set set = s4b1.f;
                return uic.x(vhc1Var.getUri()).c == blc0.Pg && (hllVar = bqj1Var.a) != null && (list = hllVar.d) != null && list.contains(fll.c) && yto.k(bqj1Var.b, true);
        }
    }

    public vmm() {
        this.a = (byte) 1;
        this.b = w3p1.n(new l4r(new xv00(rc11.a.b(hll.class)), 2, jmj1.W0, new j4r(jmj1.U0), jmj1.X0), new l4r(hvm.d, 2, jmj1.Y0, new j4r(jmj1.V0), jmj1.Z0), olj1.d);
    }
}
