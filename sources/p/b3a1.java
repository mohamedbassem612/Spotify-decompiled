package p;

import io.reactivex.rxjava3.functions.Consumer;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class b3a1 implements Consumer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ g2z b;
    public final /* synthetic */ x1a1 c;
    public final /* synthetic */ String d;

    public /* synthetic */ b3a1(g2z g2zVar, x1a1 x1a1Var, String str, byte b) {
        this.a = b;
        this.b = g2zVar;
        this.c = x1a1Var;
        this.d = str;
    }

    public final void accept(Object obj) {
        String str;
        String str2;
        String str3;
        String str4;
        byte b = this.a;
        x1a1 x1a1Var = this.c;
        g2z g2zVar = this.b;
        switch (b) {
            case 0:
                sy21 sy21Var = (sy21) obj;
                Set set = x1a1Var.d;
                int i = x1a1Var.e;
                boolean z = x1a1Var.b;
                ry21 ry21Var = sy21Var.a;
                boolean z2 = ry21Var.Q0;
                String str5 = this.d;
                if (!z2) {
                    int i2 = ry21Var.d;
                    uz21 uz21Var = sy21Var.c;
                    v4a1 v4a1Var = new v4a1(i2, uz21Var != null ? k1u.t(uz21Var) : null);
                    String str6 = x1a1Var.a;
                    wea0 wea0Var = x1a1Var.c;
                    int i3 = z ? 2 : 1;
                    int iC = l1d.C(i);
                    if (iC == 0) {
                        str = "full";
                    } else if (iC != 1) {
                        eg.o();
                    } else {
                        str = "listen_only";
                    }
                    g2zVar.H(new t4a1(str6, wea0Var, set, i3, str5, str, v4a1Var));
                } else {
                    ga61 ga61Var = (ga61) sy21Var.b;
                    if (ga61Var == null || (str2 = ga61Var.b) == null) {
                        str2 = "";
                    }
                    String str7 = str2;
                    String str8 = x1a1Var.a;
                    wea0 wea0Var2 = x1a1Var.c;
                    int i4 = z ? 2 : 1;
                    int iC2 = l1d.C(i);
                    if (iC2 == 0) {
                        str3 = "full";
                    } else if (iC2 != 1) {
                        eg.o();
                    } else {
                        str3 = "listen_only";
                    }
                    g2zVar.H(new x4a1(str8, wea0Var2, set, i4, str5, str3, str7));
                }
                break;
            default:
                u4a1 u4a1Var = new u4a1(rc11.a.b(((Throwable) obj).getClass()).r());
                String str9 = x1a1Var.a;
                wea0 wea0Var3 = x1a1Var.c;
                int i5 = x1a1Var.b ? 2 : 1;
                int iC3 = l1d.C(x1a1Var.e);
                if (iC3 == 0) {
                    str4 = "full";
                } else if (iC3 != 1) {
                    eg.o();
                } else {
                    str4 = "listen_only";
                }
                g2zVar.H(new t4a1(str9, wea0Var3, x1a1Var.d, i5, this.d, str4, u4a1Var));
                break;
        }
    }
}
