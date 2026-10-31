package p;

import android.content.Context;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class lym1 implements oh81 {
    public final kly0 a;
    public final kly0 b;
    public final kly0 c;
    public final kly0 d;
    public final ov20 e;
    public final Context f;
    public final idd1 g = new idd1(new yrm1(this, (byte) 4));

    public lym1(caq caqVar, thq thqVar, thq thqVar2, thq thqVar3, ov20 ov20Var, Context context) {
        this.a = caqVar;
        this.b = thqVar;
        this.c = thqVar2;
        this.d = thqVar3;
        this.e = ov20Var;
        this.f = context;
    }

    public static kh81 b(lym1 lym1Var, String str, String str2, boolean z, boolean z2, int i) {
        if ((i & 1) != 0) {
            str = "#FFFFFF";
        }
        String str3 = str;
        if ((i & 2) != 0) {
            str2 = "";
        }
        if ((i & 4) != 0) {
            z = false;
        }
        boolean z3 = (i & 8) == 0;
        boolean z4 = (i & 16) == 0;
        boolean z5 = (i & 32) != 0 ? false : z2;
        Context context = lym1Var.f;
        xpw xpwVar = (xpw) lym1Var.c.get();
        boolean z6 = z4;
        wsx wsxVar = wsx.c;
        if (z3) {
            str2 = context.getString(2131962469);
        } else if (z6) {
            str2 = context.getString(2131962467);
        }
        String str4 = str2;
        str4.getClass();
        int i2 = z ? 2131962470 : 2131962466;
        uzl0 uzl0Var = (uzl0) lym1Var.d.get();
        uzl0Var.getClass();
        return new kh81(new ng81(new gym1(wsxVar, str3, str4, i2, z5, new fym1(new tzl0(uzl0Var))), xpwVar));
    }

    public final mr20 a() {
        return (mr20) this.g.getValue();
    }
}
