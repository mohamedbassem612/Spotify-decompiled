package p;

import java.net.URI;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public abstract class ltg0 {
    public static final se11 a = new se11("\\[([^]]+)]\\(([^)]+)\\)");
    public static final se11 b = new se11("\\*\\*(.+?)\\*\\*");

    /* JADX WARN: Code duplicated, block: B:38:0x00e8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:39:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:45:0x0113  */
    public static final void a(ye5 ye5Var, pae1 pae1Var, ArrayList arrayList, iu30 iu30Var, String str) {
        URI m231Var;
        String host;
        n561 sgg1Var = new sgg1(jtg0.b, se11.b(a, str));
        se11 se11Var = b;
        int i = 0;
        fp20 fp20VarZ = z561.Z(z561.i0(new n561[]{sgg1Var, new sgg1(jtg0.c, se11.b(se11Var, str))}));
        ktg0 ktg0Var = new ktg0((byte) 0);
        ArrayList<gtg0> arrayListL0 = z561.l0(fp20VarZ);
        r7h.f0(arrayListL0, ktg0Var);
        for (gtg0 gtg0Var : arrayListL0) {
            tr80 tr80Var = gtg0Var.b;
            mbh0 mbh0Var = gtg0Var.c;
            int i2 = ((rr80) tr80Var).a;
            if (i2 >= i) {
                ye5Var.g(str.substring(i, i2));
                int iC = l1d.C(gtg0Var.a);
                if (iC == 0) {
                    String str2 = (String) ((kbh0) mbh0Var.a()).get(2);
                    String str3 = (String) ((kbh0) mbh0Var.a()).get(1);
                    try {
                        m231Var = new URI(str2);
                    } catch (Throwable th) {
                        m231Var = new m231(th);
                    }
                    if (m231Var instanceof m231) {
                        m231Var = null;
                    }
                    URI uri = m231Var;
                    if (nhc1.S(uri != null ? uri.getScheme() : null, "spotify", true)) {
                        ye5Var.l(new ljc0(str2, pae1Var, new uhg(iu30Var, str2, (byte) 6)));
                        a(ye5Var, pae1Var, arrayList, iu30Var, str3);
                        ye5Var.j();
                    } else if (nhc1.S(uri != null ? uri.getScheme() : null, "http", true)) {
                        host = uri != null ? uri.getHost() : null;
                        if (host != null || host.length() == 0) {
                            a(ye5Var, pae1Var, arrayList, iu30Var, str3);
                        } else {
                            String strC = f4i1.c(arrayList.size(), "source_");
                            String strG = se11Var.g("$1", str3);
                            arrayList.add(new htg0(strC, strG, str2));
                            z6p1.r(ye5Var, strC, strG);
                        }
                    } else if (nhc1.S(uri != null ? uri.getScheme() : null, "https", true)) {
                        if (uri != null) {
                        }
                        if (host != null) {
                            a(ye5Var, pae1Var, arrayList, iu30Var, str3);
                        } else {
                            a(ye5Var, pae1Var, arrayList, iu30Var, str3);
                        }
                    } else {
                        a(ye5Var, pae1Var, arrayList, iu30Var, str3);
                    }
                } else {
                    if (iC != 1) {
                        eg.o();
                        return;
                    }
                    a(ye5Var, pae1Var, arrayList, iu30Var, (String) ((kbh0) mbh0Var.a()).get(1));
                }
                i = ((rr80) gtg0Var.b).b + 1;
            }
        }
        ye5Var.g(str.substring(i));
    }
}
