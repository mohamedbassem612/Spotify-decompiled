package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ds9 implements xpw {
    public final psw X;
    public final ia00 Y;
    public final rm9 a;
    public final tm b;
    public final ip9 c;
    public final ip9 d;
    public final tm e;
    public final ip9 f;
    public final nm1 g;
    public final w2k1 h;
    public final cy7 i;
    public final js20 t;

    public ds9(rm9 rm9Var, tm tmVar, ip9 ip9Var, ip9 ip9Var2, tm tmVar2, ip9 ip9Var3, nm1 nm1Var, w2k1 w2k1Var, cy7 cy7Var) {
        this.a = rm9Var;
        this.b = tmVar;
        this.c = ip9Var;
        this.d = ip9Var2;
        this.e = tmVar2;
        this.f = ip9Var3;
        this.g = nm1Var;
        this.h = w2k1Var;
        this.i = cy7Var;
        this.t = z0o1.k(rm9Var.u, vq9.c, new uv8(this, (byte) 19), 4);
        j2i j2iVar = new j2i(-100463021, new zk9(this, (byte) 8), true);
        ien0 ien0Var = qsw.a;
        this.X = new psw(j2iVar, (byte) 0);
        this.Y = n3o1.q(this).a(pn9.t, new hp9(this, (byte) 4));
    }

    public final rqw a() {
        return this.Y;
    }

    public final jsw c() {
        return this.X;
    }

    public final mqw getBehavior() {
        return this.t;
    }
}
