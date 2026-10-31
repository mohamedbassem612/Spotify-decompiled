package p;

import com.spotify.music.SpotifyMainActivity;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class zh30 implements qe41 {
    public boolean N0;
    public boolean O0;
    public boolean P0;
    public vr51 Q0;
    public final nt21 X;
    public final fdc Y;
    public boolean Z;
    public final dg30 a;
    public final qe41 b;
    public final sck1 c;
    public final dn81 d;
    public final f8l e;
    public final y5u f;
    public boolean g;
    public w8c0 h;
    public final lmw i;
    public final tac0 t;

    public zh30(dg30 dg30Var, qe41 qe41Var, sck1 sck1Var, vh0 vh0Var, SpotifyMainActivity spotifyMainActivity, SpotifyMainActivity spotifyMainActivity2, dn81 dn81Var, ots otsVar) {
        this.a = dg30Var;
        this.b = qe41Var;
        this.c = sck1Var;
        this.d = dn81Var;
        f8l f8lVar = new f8l();
        this.e = f8lVar;
        y5u y5uVar = new y5u((byte) 1);
        this.f = y5uVar;
        this.h = w8c0.b;
        this.i = lmw.g(new xh30(this));
        this.t = new tac0(this, true);
        this.X = obg1.o(this);
        this.Y = new fdc(qe41Var, vh0Var.m(), spotifyMainActivity2);
        this.P0 = true;
        yh30 yh30Var = new yh30(this, otsVar);
        hac0 pj00Var = new pj00(this, (byte) 1);
        qe41Var.p().c("FragmentManagerController.state", new ej5(this, (byte) 1));
        dg30Var.V(new uh30(this, (byte) 0));
        dg30Var.C(new vh30(this, (byte) 0));
        dg30Var.Z(new vh30(this, (byte) 1));
        dg30Var.Y(new vh30(this, (byte) 2));
        dg30Var.Y.add(new vh30(this, (byte) 3));
        f8lVar.d.a(yh30Var);
        y5uVar.a().a(pj00Var);
        spotifyMainActivity.f1.add(new wh30(this));
    }

    public static boolean c(th30 th30Var) {
        boolean zC = false;
        for (zf30 zf30Var : th30Var.c.u()) {
            if (zf30Var != null) {
                tg30 tg30Var = zf30Var.V0;
                if ((tg30Var == null ? null : tg30Var.m0()) != null) {
                    zC |= c(zf30Var.g0());
                }
                lj30 lj30Var = zf30Var.u1;
                w8c0 w8c0Var = w8c0.c;
                w8c0 w8c0Var2 = w8c0.d;
                if (lj30Var != null) {
                    lj30 lj30Var2 = (lj30) zf30Var.n0();
                    lj30Var2.b();
                    if (lj30Var2.e.i.a(w8c0Var2)) {
                        iac0 iac0VarN0 = zf30Var.n0();
                        lj30 lj30Var3 = iac0VarN0 != null ? (lj30) iac0VarN0 : null;
                        if (lj30Var3 != null) {
                            lj30Var3.e.i(w8c0Var);
                        }
                        zC = true;
                    }
                }
                if (zf30Var.s1.i.a(w8c0Var2)) {
                    zf30Var.s1.i(w8c0Var);
                    zC = true;
                }
            }
        }
        return zC;
    }

    public final void a() {
        lmw lmwVar = this.i;
        if (lmwVar.t().L) {
            return;
        }
        y5u y5uVar = this.f;
        if (y5uVar.a().i != w8c0.b) {
            y5uVar.a().i(w8c0.a);
        } else {
            lmwVar.k();
            this.t.g(k8c0.ON_DESTROY);
        }
    }

    public final void b(k8c0 k8c0Var) {
        this.h = k8c0Var.a();
        if (this.g) {
            this.f.a().g(k8c0Var);
        }
    }

    @Override // p.iac0
    public final x8c0 getLifecycle() {
        return this.t;
    }

    @Override // p.qe41
    public final oe41 p() {
        return this.X.j();
    }
}
