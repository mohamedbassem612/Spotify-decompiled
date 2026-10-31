package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ob60 implements xpw {
    public final ijp a;
    public final jjp b;
    public final kjp c;
    public final e7m0 d;
    public final psw e;

    public ob60(ijp ijpVar, jjp jjpVar, kjp kjpVar) {
        this.a = ijpVar;
        this.b = jjpVar;
        this.c = kjpVar;
        z860 z860Var = z860.i;
        t2m t2mVar = t2m.B;
        ed2 ed2Var = ed2.f;
        oq50 oq50Var = oq50.P0;
        w6m0 w6m0Var = new w6m0(t2mVar, (byte) 0);
        cas casVar = new cas();
        casVar.a = oq50.Q0;
        casVar.d = h050.Y;
        casVar.a(z860.t, z860.X);
        this.d = new e7m0(z860Var, w6m0Var, ed2Var, oq50Var, casVar);
        j2i j2iVar = new j2i(-777297181, new zq30(this, (byte) 24), true);
        ien0 ien0Var = qsw.a;
        this.e = new psw(j2iVar, (byte) 0);
    }

    public final rqw a() {
        return n3o1.q(this).a(vn50.Y0, vn50.Z0);
    }

    public final jsw c() {
        return this.e;
    }

    public final mqw getBehavior() {
        return this.d;
    }
}
