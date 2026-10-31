package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class jf31 implements tyq {
    public final zup a;
    public final lzn0 b;
    public final rzq c;
    public final vku d = new vku();
    public final vh1 e;
    public final psw f;
    public final js20 g;
    public final mch h;
    public final ia00 i;

    public jf31(zup zupVar, lzn0 lzn0Var, oj3 oj3Var, aa3 aa3Var, wh1 wh1Var, rzq rzqVar) {
        this.a = zupVar;
        this.b = lzn0Var;
        this.c = rzqVar;
        vh1 vh1VarA = wh1Var.a.m().a(rzqVar);
        this.e = vh1VarA;
        j2i j2iVar = new j2i(-176713398, new dr01(this, (byte) 29), true);
        ien0 ien0Var = qsw.a;
        this.f = new psw(j2iVar, (byte) 0);
        this.g = z0o1.j(new hf31(this, aa3Var, (byte) 0), new fk01(this, (byte) 10), new if31(this, (byte) 0), 4);
        this.h = i6p1.q(aa3Var.b, new h4r(vh1VarA.d, oe31.g));
        this.i = n3o1.q(this).a(ve21.W0, ve21.X0);
    }

    public final rqw a() {
        return this.i;
    }

    public final jsw c() {
        return this.f;
    }

    public final d0r e() {
        return this.c;
    }

    public final mqw getBehavior() {
        return this.g;
    }

    public final f4r getData() {
        return this.h;
    }
}
