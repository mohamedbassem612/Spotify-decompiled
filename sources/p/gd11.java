package p;

import android.content.Context;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class gd11 implements tyq {
    public final gw70 a;
    public final kt91 b;
    public final Context c;
    public final u210 d;
    public final d0r e;
    public final com.spotify.home.evopage.structureapi.a f;
    public final o3r g;
    public final js20 h;
    public final ia00 i;
    public final psw t;

    public gd11(gw70 gw70Var, kt91 kt91Var, Context context, u210 u210Var, d0r d0rVar, com.spotify.home.evopage.structureapi.a aVar) {
        this.a = gw70Var;
        this.b = kt91Var;
        this.c = context;
        this.d = u210Var;
        this.e = d0rVar;
        this.f = aVar;
        jd11 jd11Var = rc11.a;
        this.g = w3p1.n(new l4r(new xv00(jd11Var.b(jo70.class)), 1, a411.e1, new j4r(fft0.S0), fd11.b), new l4r(new xv00(jd11Var.b(xkk1.class)), 1, fd11.c, new j4r(a411.d1), fd11.d), ibi0.W0);
        this.h = z0o1.j(new hbz0(this, (byte) 7), new nsm0(this), new ak01(this, (byte) 12), 4);
        this.i = n3o1.q(this).a(rw01.P0, rw01.Q0);
        j2i j2iVarJ = apo.j(-1486144642, new dr01(this, (byte) 14), true);
        ien0 ien0Var = qsw.a;
        this.t = new psw(j2iVarJ, (byte) 0);
    }

    public final rqw a() {
        return this.i;
    }

    public final jsw c() {
        return this.t;
    }

    @Override // p.wul1
    public final d0r e() {
        return this.e;
    }

    public final mqw getBehavior() {
        return this.h;
    }

    @Override // p.wul1
    public final f4r getData() {
        return this.g;
    }
}
