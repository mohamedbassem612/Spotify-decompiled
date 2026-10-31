package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ah5 implements xpw {
    public final plq a;
    public final e7m0 b;
    public final eih1 c;
    public final psw d;

    public ah5(zg5 zg5Var, ppv0 ppv0Var, ccy0 ccy0Var, plq plqVar, qlq qlqVar) {
        this.a = plqVar;
        gh5 gh5Var = new gh5(zg5Var.a, zg5Var.b, zg5Var.c);
        drm1 drm1Var = new drm1((byte) 4);
        q8n q8nVarA = ((jiz0) ((ojq) qlqVar.a.c).b).a();
        c8o.l(q8nVarA);
        yg5 yg5Var = new yg5(q8nVarA, ppv0Var, ccy0Var);
        this.b = sbl.z(gh5Var, drm1Var, yg5Var.c, ad5.d, ook0.e);
        this.c = new eih1();
        j2i j2iVar = new j2i(122844465, new i43(this, (byte) 7), true);
        ien0 ien0Var = qsw.a;
        this.d = new psw(j2iVar, (byte) 0);
    }

    public final rqw a() {
        return this.c;
    }

    public final jsw c() {
        return this.d;
    }

    public final mqw getBehavior() {
        return this.b;
    }
}
