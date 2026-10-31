package p;

import android.content.Context;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class zcc0 implements xpw {
    public final gw70 a;
    public final lzn0 b;
    public final z141 c;
    public final lq6 d;
    public final kn6 e;
    public final Context f;
    public final js20 g = x3p1.n(new vcc0(this, (byte) 0), hyb0.c1, new s2c0(this, (byte) 2), (o8n) null, new vcc0(this, (byte) 1), 8);
    public final ia00 h = n3o1.q(this).a(lta0.W0, lta0.X0);
    public final psw i;

    public zcc0(gw70 gw70Var, lzn0 lzn0Var, z141 z141Var, lq6 lq6Var, kn6 kn6Var, Context context) {
        this.a = gw70Var;
        this.b = lzn0Var;
        this.c = z141Var;
        this.d = lq6Var;
        this.e = kn6Var;
        this.f = context;
        j2i j2iVarJ = apo.j(-1401362908, new pba0(this, (byte) 20), true);
        ien0 ien0Var = qsw.a;
        this.i = new psw(j2iVarJ, (byte) 0);
    }

    @Override // p.avl1
    public final rqw a() {
        return this.h;
    }

    @Override // p.maa
    public final jsw c() {
        return this.i;
    }

    @Override // p.maa
    public final mqw getBehavior() {
        return this.g;
    }
}
