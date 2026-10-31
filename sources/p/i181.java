package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class i181 implements wpw {
    public final ia00 X;
    public final zob1 a;
    public final bpb1 b;
    public final vnr c;
    public final i081 d;
    public final kly0 e;
    public final r860 f;
    public final int g;
    public final js20 h;
    public final idd1 i;
    public final idd1 t;

    public i181(zob1 zob1Var, bpb1 bpb1Var, vnr vnrVar, i081 i081Var, kly0 kly0Var, r860 r860Var) {
        this.a = zob1Var;
        this.b = bpb1Var;
        this.c = vnrVar;
        this.d = i081Var;
        this.e = kly0Var;
        this.f = r860Var;
        this.g = r860Var != null ? 2 : 0;
        this.h = w3p1.q(new hbz0(this, (byte) 19), new q961(this, (byte) 27), new dj71(this, (byte) 10), (o8n) null, (iu30) null, 24);
        this.i = new idd1(new qv61(this, (byte) 20));
        this.t = new idd1(new l5v0(this, (byte) 18));
        this.X = n3o1.q(this).a(vy61.X0, vy61.Y0);
    }

    public final rqw a() {
        return this.X;
    }

    public final rsw c() {
        return (rsw) this.t.getValue();
    }

    public final mqw getBehavior() {
        return this.h;
    }
}
