package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class rw90 implements xpw {
    public final xv90 a;
    public final tob1 b;
    public final d6o0 c;
    public final y5a0 d;
    public final ldo e;
    public final ng20 f;
    public final js20 g;
    public final ia00 h;
    public final psw i;

    public rw90(xv90 xv90Var, ven0 ven0Var, i6o0 i6o0Var, y5a0 y5a0Var) {
        this.a = xv90Var;
        this.b = ven0Var;
        this.c = i6o0Var;
        this.d = y5a0Var;
        this.e = new ldo(xv90Var.f, new umf0(xv90Var.g, xv90Var.b));
        this.f = new ng20(xv90Var.i);
        c9c0 c9c0Var = xv90Var.a.a;
        this.g = x3p1.m(new x010(new any(c9c0Var.b.current(), (byte) 18), c9c0Var.d.b(), new ir90(3, null, (byte) 1), (byte) 1), mr90.g, ul90.h, (o8n) null, new hu90(this, (byte) 2), 8);
        this.h = n3o1.q(this).a(rb80.d1, rb80.e1);
        this.i = new psw(new j2i(326735363, new wv60(this, (byte) 26), true), (byte) 0);
    }

    public final rqw a() {
        return this.h;
    }

    public final jsw c() {
        return this.i;
    }

    public final mqw getBehavior() {
        return this.g;
    }
}
