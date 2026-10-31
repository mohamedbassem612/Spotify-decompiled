package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class wu40 {
    public static final kiv a = new kiv(new xh3((byte) 29), (byte) 1);

    public static final void a(xah xahVar, l2h1 l2h1Var, l1i l1iVar, j2i j2iVar, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-58048984);
        int i2 = i | 146;
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            x340Var.d0();
            int i3 = i & 1;
            kiv kivVar = a;
            if (i3 == 0 || x340Var.E()) {
                nx61 nx61Var = vu40.h;
                xahVar = poz0.r(x340Var);
                l2h1Var = poz0.y(x340Var);
                l1iVar = ((vu40) x340Var.k(kivVar)).c;
            } else {
                x340Var.b0();
            }
            x340Var.s();
            vu40 vu40Var = new vu40(xahVar, l2h1Var, l1iVar);
            ely0 ely0VarA = kivVar.a(vu40Var);
            ely0 ely0VarA2 = da80.a.a(jtr.d);
            ely0 ely0VarA3 = r9e1.a.a(l2h1Var.f);
            kiv kivVar2 = ol70.a;
            vu40Var.f.getClass();
            mod.c(new ely0[]{ely0VarA, ely0VarA2, ely0VarA3, kivVar2.a(new p3v(40.0f))}, j2iVar, x340Var, 56);
        } else {
            x340Var.b0();
        }
        xah xahVar2 = xahVar;
        l2h1 l2h1Var2 = l2h1Var;
        l1i l1iVar2 = l1iVar;
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new hea(xahVar2, l2h1Var2, l1iVar2, j2iVar, i);
        }
    }
}
