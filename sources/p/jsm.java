package p;

import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class jsm implements l381, m381 {
    public final /* synthetic */ byte a;
    public final o3r b;

    public jsm(yxz0 yxz0Var) {
        this.a = (byte) 3;
        this.b = w3p1.n(new l4r(hvm.d, 1, gkz0.O0, new j4r(gkz0.X), gkz0.P0), new l4r(jd0.x, 2, gkz0.Z, new j4r(gkz0.Y), gkz0.N0), atz0.c);
    }

    public final o3r b() {
        byte b = this.a;
        return this.b;
    }

    public boolean r(vhc1 vhc1Var, Object obj) {
        switch (this.a) {
            case 2:
                return ob51.m(vhc1Var.getUri(), ((t4n0) obj).a);
            default:
                xxz0 xxz0Var = (xxz0) obj;
                if (!xxz0Var.a.equals("DISABLED_CANNOT_ENABLE") && !xxz0Var.b && (vhc1Var instanceof thc1)) {
                    List<ll81> list = ((thc1) vhc1Var).i;
                    if (!(list instanceof Collection) || !list.isEmpty()) {
                        for (ll81 ll81Var : list) {
                            if (u890.j(ll81Var.a, "set-reaction") || u890.j(ll81Var.a, "remove-reaction")) {
                                if (ll81Var.b == 1) {
                                    return true;
                                }
                            }
                        }
                    }
                }
                return false;
        }
    }

    public boolean t(Object obj) {
        switch (this.a) {
            case 0:
                return u890.j(((pt50) obj).a, Boolean.TRUE);
            case 1:
                b0t b0tVar = (b0t) obj;
                f7l1 f7l1Var = b0tVar.a;
                bbl1 bbl1Var = b0tVar.b;
                if ((f7l1Var != null ? f7l1Var.a : null) instanceof z6l1) {
                    return (bbl1Var != null ? bbl1Var.d : null) != null;
                }
                return false;
            default:
                ga11 ga11Var = (ga11) obj;
                boolean z = ga11Var.b;
                qxc0 qxc0Var = ga11Var.a;
                boolean z2 = qxc0Var.h;
                String str = qxc0Var.g;
                return (!z || str == null || str.length() == 0 || !z2 || gyo1.L(qxc0Var.O0)) ? false : true;
        }
    }

    public jsm() {
        this.a = (byte) 2;
        this.b = w3p1.o(new l4r(new wlu(rc11.a.b(mtl.class)), 2, k4n0.O0, new j4r(k4n0.N0), k4n0.P0), u4n0.a);
    }

    public jsm(j2y0 j2y0Var) {
        this.a = (byte) 4;
        this.b = j2y0Var.e;
    }

    public jsm(d82 d82Var) {
        this.a = (byte) 0;
        this.b = w3p1.o(new l4r(jd0.j, 2, crm.Z, new j4r(new gsm(d82Var, (byte) 1)), crm.N0), ism.a);
    }

    public jsm(e0t e0tVar) {
        this.a = (byte) 1;
        this.b = e0tVar.d;
    }
}
