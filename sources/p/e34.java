package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class e34 implements wpw {
    public final zob1 a;
    public final sp00 b;
    public final p5x0 c;
    public final bpb1 d;
    public final r860 e;
    public final int f;
    public final js20 g;
    public final nsw h;
    public final ia00 i;

    public e34(zob1 zob1Var, sp00 sp00Var, p5x0 p5x0Var, bpb1 bpb1Var, gw70 gw70Var, lo60 lo60Var, vgm vgmVar, r860 r860Var) {
        this.a = zob1Var;
        this.b = sp00Var;
        this.c = p5x0Var;
        this.d = bpb1Var;
        this.e = r860Var;
        this.f = r860Var != null ? 2 : 0;
        this.g = w3p1.q(new ve3(this, (byte) 7), dt3.g, new xb2(this, (byte) 16), (o8n) null, (iu30) null, 24);
        this.h = jch0.j(new d34(this, gw70Var, lo60Var, vgmVar, (byte) 0));
        this.i = n3o1.q(this).a(k63.b1, k63.c1);
    }

    public final rqw a() {
        return this.i;
    }

    public final rsw c() {
        return this.h;
    }

    public final mqw getBehavior() {
        return this.g;
    }
}
