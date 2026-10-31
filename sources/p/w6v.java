package p;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class w6v extends hab0 implements iu30 {
    public final /* synthetic */ int N0;
    public final /* synthetic */ String O0;
    public final /* synthetic */ String P0;
    public final /* synthetic */ long Q0;
    public final /* synthetic */ String R0;
    public final /* synthetic */ ven0 S0;
    public final /* synthetic */ ven0 T0;
    public final /* synthetic */ ggv U0;
    public final /* synthetic */ fgv V0;
    public final /* synthetic */ String W0;
    public final /* synthetic */ Set X;
    public final /* synthetic */ String X0;
    public final /* synthetic */ int Y;
    public final /* synthetic */ ven0 Y0;
    public final /* synthetic */ int Z;
    public final /* synthetic */ hdn0 Z0;
    public final /* synthetic */ List a;
    public final /* synthetic */ iu30 a1;
    public final /* synthetic */ c380 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ ven0 d;
    public final /* synthetic */ ss50 e;
    public final /* synthetic */ ven0 f;
    public final /* synthetic */ xtb0 g;
    public final /* synthetic */ dw91 h;
    public final /* synthetic */ dw91 i;
    public final /* synthetic */ boolean t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w6v(List list, c380 c380Var, String str, ven0 ven0Var, ss50 ss50Var, ven0 ven0Var2, xtb0 xtb0Var, dw91 dw91Var, dw91 dw91Var2, boolean z, Set set, int i, int i2, int i3, String str2, String str3, long j, String str4, ven0 ven0Var3, ven0 ven0Var4, ggv ggvVar, fgv fgvVar, String str5, String str6, ven0 ven0Var5, hdn0 hdn0Var, iu30 iu30Var) {
        super(1);
        this.a = list;
        this.b = c380Var;
        this.c = str;
        this.d = ven0Var;
        this.e = ss50Var;
        this.f = ven0Var2;
        this.g = xtb0Var;
        this.h = dw91Var;
        this.i = dw91Var2;
        this.t = z;
        this.X = set;
        this.Y = i;
        this.Z = i2;
        this.N0 = i3;
        this.O0 = str2;
        this.P0 = str3;
        this.Q0 = j;
        this.R0 = str4;
        this.S0 = ven0Var3;
        this.T0 = ven0Var4;
        this.U0 = ggvVar;
        this.V0 = fgvVar;
        this.W0 = str5;
        this.X0 = str6;
        this.Y0 = ven0Var5;
        this.Z0 = hdn0Var;
        this.a1 = iu30Var;
    }

    public final Object invoke(Object obj) {
        rtb0 rtb0Var = (rtb0) obj;
        List list = this.a;
        boolean zIsEmpty = list.isEmpty();
        byte b = 18;
        int i = 2;
        fgv fgvVar = this.V0;
        ggv ggvVar = this.U0;
        ven0 ven0Var = this.f;
        ven0 ven0Var2 = this.d;
        if (zIsEmpty) {
            c380 c380Var = this.b;
            rtb0.b(rtb0Var, c380Var.size(), new uv4(0, (byte) 18), new j2i(177069054, new v6v(0, this.h, this.i, c380Var, this.t, this.X, this.Y, this.Z, this.N0, this.O0, this.P0, ven0Var2, this.e, ven0Var, this.g, this.Q0, this.R0, this.S0, this.T0, ggvVar, fgvVar, this.W0, this.X0, this.Y0, this.Z0, this.a1), true), 4);
        } else {
            Iterator it = list.iterator();
            int i2 = 0;
            while (it.hasNext()) {
                Object next = it.next();
                int i3 = i2 + 1;
                if (i2 < 0) {
                    p7h.T();
                    throw null;
                }
                dke dkeVar = (dke) next;
                String strL = l1d.l(dkeVar.a.a, "chapter_");
                ss50 ss50Var = this.e;
                xtb0 xtb0Var = this.g;
                ven0 ven0Var3 = ven0Var2;
                ven0 ven0Var4 = ven0Var;
                rtb0.f(rtb0Var, strL, new j2i(1765319192, new rl6(dkeVar, ven0Var2, ss50Var, ven0Var, xtb0Var, (byte) 2), true), i);
                ggv ggvVar2 = ggvVar;
                int i4 = dkeVar.b;
                fgv fgvVar2 = fgvVar;
                rtb0.b(rtb0Var, dkeVar.c - i4, new uv4(i4, b), new j2i(177069054, new v6v(i4, this.h, this.i, this.b, this.t, this.X, this.Y, this.Z, this.N0, this.O0, this.P0, ven0Var3, ss50Var, ven0Var4, xtb0Var, this.Q0, this.R0, this.S0, this.T0, ggvVar2, fgvVar2, this.W0, this.X0, this.Y0, this.Z0, this.a1), true), 4);
                ven0Var2 = ven0Var3;
                ven0Var = ven0Var4;
                ggvVar = ggvVar2;
                fgvVar = fgvVar2;
                i2 = i3;
                it = it;
                b = 18;
                i = 2;
            }
        }
        String str = this.c;
        if (str != null && str.length() != 0) {
            rtb0.c(rtb0Var, "provider_credit", new j2i(106766620, new kaf(str, (byte) 27), true), 2);
        }
        return rih1.a;
    }
}
