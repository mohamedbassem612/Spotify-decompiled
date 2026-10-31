package p;

import android.content.Context;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class g37 {
    public final Context a;
    public final idd1 b = new idd1(ng5.c1);
    public final idd1 c = new idd1(ng5.b1);
    public final idd1 d = new idd1(ng5.d1);

    public g37(Context context, ltm1 ltm1Var) {
        this.a = context;
    }

    public final o17 a(ttm1 ttm1Var, boolean z) {
        String str = ttm1Var.d;
        if (z) {
            return i17.a;
        }
        int iOrdinal = ttm1Var.e.ordinal();
        idd1 idd1Var = this.b;
        xz6 xz6Var = xz6.d;
        yz6 yz6Var = yz6.d;
        switch (iOrdinal) {
            case 0:
                return new o07(new g07(str, yz6Var));
            case 1:
            case 8:
                return new e17(new g07(str, yz6Var));
            case 2:
                return new k07(new g07(str, yz6Var), false);
            case 3:
                return new s07(new g07(str, yz6Var), (rk70) idd1Var.getValue());
            case 4:
                return new s07(new g07(str, yz6Var), (rk70) this.c.getValue());
            case 5:
                return new l07(new g07(str, xz6Var), false);
            case 6:
                return new p07(new g07(str, xz6Var));
            case 7:
                return new s07(new g07(str, yz6Var), (rk70) this.d.getValue());
            case 9:
                return new y07(new g07(str, yz6Var), false);
            case 10:
                nb10 nb10Var = ttm1Var.g;
                giv0 giv0Var = nb10Var instanceof giv0 ? (giv0) nb10Var : null;
                if (giv0Var == null) {
                    return i17.a;
                }
                int iC = l1d.C(giv0Var.b);
                if (iC != 0) {
                    return iC != 1 ? i17.a : new o07(new g07(str, yz6Var));
                }
                return new k07(new g07(str, yz6Var), false);
            case 11:
                return new v07(ltm1.d(this.a), new g07((String) null, yz6Var));
            case 12:
                return new s07(new g07(str, yz6Var), (rk70) idd1Var.getValue());
            case 13:
                nb10 nb10Var2 = ttm1Var.g;
                sy3 sy3Var = nb10Var2 instanceof sy3 ? (sy3) nb10Var2 : null;
                aey aeyVar = sy3Var != null ? sy3Var.a : null;
                if (aeyVar == null) {
                    return i17.a;
                }
                ttm1 ttm1Var2 = new ttm1(ttm1Var.a, ttm1Var.b, ttm1Var.c, str, aeyVar, ttm1Var.f, nb10Var2, ttm1Var.h);
                return a(ttm1Var2, jo31.p(ttm1Var2));
            default:
                return i17.a;
        }
    }
}
