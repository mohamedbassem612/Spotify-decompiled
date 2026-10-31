package p;

import java.util.ArrayList;
import java.util.Locale;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class mbf {
    public final /* synthetic */ byte a;
    public final nfa0 b;

    public /* synthetic */ mbf(nfa0 nfa0Var, byte b) {
        this.a = b;
        this.b = nfa0Var;
    }

    public final sio1 a(String str) {
        qn50 qn50Var;
        khh0 khh0Var;
        int i;
        byte b = this.a;
        int i2 = 2;
        nfa0 nfa0Var = this.b;
        switch (b) {
            case 0:
                try {
                    hth hthVar = (hth) nfa0Var.a(str, hth.Companion.serializer());
                    lrs0 lrs0Var = hthVar.a;
                    String str2 = lrs0Var.a;
                    String str3 = lrs0Var.b;
                    ib9 ib9Var = lrs0Var.c;
                    b561 b561Var = new b561(str2, str3, new gb9(ib9Var != null ? ib9Var.a : null, ib9Var != null ? ib9Var.b : null, ib9Var != null ? ib9Var.c : null));
                    String str4 = hthVar.b;
                    kth kthVar = hthVar.c;
                    if (kthVar != null) {
                        ib9 ib9Var2 = kthVar.b;
                        qn50Var = new qn50(kthVar.a, new gb9(ib9Var2 != null ? ib9Var2.a : null, ib9Var2 != null ? ib9Var2.b : null, ib9Var2 != null ? ib9Var2.c : null), kthVar.c);
                    } else {
                        qn50Var = null;
                    }
                    nth nthVar = hthVar.d;
                    if (nthVar != null) {
                        String upperCase = nthVar.b.toUpperCase(Locale.ROOT);
                        if (upperCase.equals("GIF")) {
                            i2 = 1;
                        } else if (!upperCase.equals("IMAGE")) {
                            i2 = 0;
                        }
                        khh0Var = i2 != 0 ? new khh0(nthVar.a, i2) : null;
                    } else {
                        khh0Var = null;
                    }
                    return new hlo0(b561Var, str4, qn50Var, khh0Var, hthVar.e);
                } catch (Exception unused) {
                    return null;
                }
            case 1:
                try {
                    dvy0 dvy0Var = (dvy0) nfa0Var.a(str, dvy0.Companion.serializer());
                    return new ilo0(dvy0Var.a, dvy0Var.c, dvy0Var.b, dvy0Var.d, "Unknown", dvy0Var.e, dvy0Var.f, dvy0Var.g);
                } catch (Exception unused2) {
                    return null;
                }
            case 2:
                try {
                    dfz0 dfz0Var = (dfz0) nfa0Var.a(str, dfz0.Companion.serializer());
                    ArrayList arrayList = new ArrayList();
                    for (xez0 xez0Var : dfz0Var.b) {
                        arrayList.add(new yez0(xez0Var.a, xez0Var.b, xez0Var.c));
                    }
                    return new jlo0(arrayList);
                } catch (Exception unused3) {
                    return null;
                }
            default:
                try {
                    bh31 bh31Var = (bh31) nfa0Var.a(str, bh31.Companion.serializer());
                    String str5 = bh31Var.a;
                    if (u890.j(str5, "new_episode_notification")) {
                        i = 1;
                    } else if (u890.j(str5, "entity")) {
                        i = i2;
                    } else if (u890.j(str5, "static_image")) {
                        i2 = 3;
                        i = i2;
                    } else {
                        i = 0;
                    }
                    eh31 eh31Var = bh31Var.c;
                    String str6 = eh31Var.a;
                    if (str6 == null || i == 0) {
                        return null;
                    }
                    return new klo0(i, str6, eh31Var.b, eh31Var.c, eh31Var.d, eh31Var.e);
                } catch (Exception unused4) {
                    return null;
                }
        }
    }
}
