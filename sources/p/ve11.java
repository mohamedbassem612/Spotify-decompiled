package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ve11 implements p090 {
    public final boolean a;
    public final bpb1 b = gio1.b((Object) null);
    public final bpb1 c = gio1.b((Object) null);

    public ve11(bge bgeVar, boolean z) {
        this.a = z;
        fu20 fu20VarQ = f5p1.q(hu20.e(bgeVar, new i64((byte) 25)), new ue11(this, (lnm) null, (byte) 0));
        ov40 ov40Var = ov40.a;
        l4p1.u(ov40Var, fu20VarQ);
        l4p1.u(ov40Var, f5p1.q(hu20.e(bgeVar, new i64((byte) 26)), new ue11(this, (lnm) null, (byte) 1)));
    }

    public final ry21 a(uf01 uf01Var) {
        String str;
        ln21 ln21Var = uf01Var.e;
        if (u890.j(ln21Var.a.d, "spclient.wg.spotify.com")) {
            Object objC = ln21Var.c(fq21.class);
            bpb1 bpb1Var = this.b;
            String str2 = "";
            if (objC == null ? !this.a ? (str = (String) bpb1Var.getValue()) != null : (str = (String) this.c.getValue()) != null : (str = (String) bpb1Var.getValue()) != null) {
                str2 = str;
            }
            if (str2.length() > 0) {
                k370 k370VarG = ln21Var.a.g();
                k370 k370Var = new k370();
                k370Var.f((l370) null, str2);
                k370VarG.e(k370Var.b().d);
                l370 l370VarB = k370VarG.b();
                ne neVarB = ln21Var.b();
                neVarB.a = l370VarB;
                neVarB.c0(wf90.class, wf90.a);
                return uf01Var.b(new ln21(neVarB));
            }
        }
        return uf01Var.b(ln21Var);
    }
}
