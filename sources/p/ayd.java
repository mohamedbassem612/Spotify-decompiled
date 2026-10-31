package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ayd implements mqw {
    public final /* synthetic */ byte a;
    public final /* synthetic */ maa b;

    public /* synthetic */ ayd(maa maaVar, byte b) {
        this.a = b;
        this.b = maaVar;
    }

    public static e5h e(d5h d5hVar) {
        return new e5h(d5hVar.a, d5hVar.b, "", d5hVar.d, d5hVar.c, d5hVar.e, d5hVar.f, d5hVar.g, d5hVar.h, false);
    }

    public final lqw a(Object obj, ipb1 ipb1Var) {
        p811 p811Var;
        xab1 xab1VarU;
        byte b = this.a;
        maa maaVar = this.b;
        switch (b) {
            case 0:
                h141 h141Var = (h141) ipb1Var;
                h141Var.e(new zxd(((vxd) obj).a, 0));
                return new cfd(h141Var, (byd) maaVar, (byte) 5);
            default:
                d5h d5hVar = (d5h) obj;
                g5h g5hVar = (g5h) maaVar;
                h141 h141Var2 = (h141) ipb1Var;
                h141Var2.e(e(d5hVar));
                p811 p811Var2 = new p811();
                p811Var2.a = d5hVar.h;
                l811 l811Var = new l811();
                l811 l811Var2 = new l811();
                String str = d5hVar.a;
                if (ihc1.Z0(str, "?").equals("spotify:collection:tracks")) {
                    xab1VarU = null;
                    p811Var = p811Var2;
                } else {
                    p811Var = p811Var2;
                    xab1VarU = l4p1.u(cto1.q(g5hVar.i), new fu20(d3p1.F(g5hVar.g, ysf.a, str), new df6((byte) 5, (Object) l811Var2, (Object) l811Var, (Object) g5hVar, (Object) h141Var2, (Object) p811Var, (lnm) null), (byte) 1));
                }
                return new cp31(p811Var, h141Var2, l811Var2, l811Var, g5hVar, xab1VarU);
        }
    }

    public final Object d(Object obj) {
        switch (this.a) {
            case 0:
                return new zxd(((vxd) obj).a, 0);
            default:
                return e((d5h) obj);
        }
    }
}
