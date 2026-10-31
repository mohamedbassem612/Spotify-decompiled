package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class qu1 implements xpw {
    public final j2i a;
    public final j2i b;
    public final e7m0 c;
    public final psw d;
    public final ia00 e;

    public qu1(mfe mfeVar, ma0 ma0Var, j2i j2iVar, j2i j2iVar2) {
        this.a = j2iVar;
        this.b = j2iVar2;
        this.c = sbl.A(im1.Y0, n4.e, new ku1(ma0Var, (byte) 0), ah1.X, new pu1(mfeVar));
        j2i j2iVar3 = new j2i(831885216, new r1(this, (byte) 22), true);
        ien0 ien0Var = qsw.a;
        this.d = new psw(j2iVar3, (byte) 0);
        this.e = new ia00(qu1.class.getName(), mm1.t, mm1.X);
    }

    public final rqw a() {
        return this.e;
    }

    public final jsw c() {
        return this.d;
    }

    public final mqw getBehavior() {
        return this.c;
    }
}
