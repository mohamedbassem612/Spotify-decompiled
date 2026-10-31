package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class lu70 implements syq, yul1, cvl1 {
    public final rsw X;
    public final idd1 Y;
    public final d0r a;
    public final au70 b;
    public final u0i c;
    public final lzn0 d;
    public final vgm e;
    public final gw70 f;
    public final boolean g;
    public final o3r h = pu70.a;
    public final js20 i = w0o1.i(new ju70(this, (byte) 0), new c4z(this), new ju70(this, (byte) 1), 4);
    public final hy00 t = n3o1.r(this).c(oe60.Z, oe60.N0);

    public lu70(d0r d0rVar, au70 au70Var, u0i u0iVar, lzn0 lzn0Var, vgm vgmVar, boolean z, gw70 gw70Var, boolean z2) {
        this.a = d0rVar;
        this.b = au70Var;
        this.c = u0iVar;
        this.d = lzn0Var;
        this.e = vgmVar;
        this.f = gw70Var;
        this.g = z2;
        this.X = z ? f6o1.C(new rzj(this, (byte) 4)) : lnn1.g(new ft30(this), a9o.Y0, new xy50(this, (byte) 4));
        this.Y = new idd1(new nd70(this, (byte) 3));
    }

    public static cu70 f(iu70 iu70Var) {
        if (iu70Var instanceof gu70) {
            aw70 aw70Var = ((gu70) iu70Var).a;
            return new cu70((j47) o7h.s0(aw70Var.f.a), aw70Var.c, aw70Var.d, aw70Var.g, aw70Var.e, aw70Var.h, aw70Var.f7p, aw70Var.q, aw70Var.t);
        }
        if (iu70Var instanceof hu70) {
            return new cu70(null, "", "", "", "", null, null, 256);
        }
        eg.o();
        return null;
    }

    public final rqw a() {
        return this.t;
    }

    public final rsw c() {
        return this.X;
    }

    @Override // p.wul1
    public final d0r e() {
        return this.a;
    }

    public final mqw getBehavior() {
        return this.i;
    }

    @Override // p.wul1
    public final o3r getData() {
        return this.h;
    }

    @Override // p.wul1
    public final f4r getData() {
        return this.h;
    }
}
