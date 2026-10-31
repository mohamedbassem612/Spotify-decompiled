package p;

import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class kto0 implements it80 {
    public final rvy0 a;
    public final mmo b;
    public final lzn0 c;
    public final uf0 d;
    public final vu1 e;
    public final muz f;
    public final g341 g;

    public kto0(rvy0 rvy0Var, mmo mmoVar, lzn0 lzn0Var, uf0 uf0Var, vu1 vu1Var, muz muzVar, g341 g341Var, mhc mhcVar) {
        this.a = rvy0Var;
        this.b = mmoVar;
        this.c = lzn0Var;
        this.d = uf0Var;
        this.e = vu1Var;
        this.f = muzVar;
        this.g = g341Var;
    }

    public final void a(ajq0 ajq0Var) {
        ajq0Var.H("SETTINGS_INTENT_ACTION", "Handle the settings intent from notifications", new gto0(this, (byte) 0));
        ajq0Var.H("EMAIL_VERIFICATION_INTENT_ACTION", "Handle the email verification intent action from notifications", new gto0(this, (byte) 1));
        ajq0Var.E(new hto0((byte) 0), "navigate to spotify internal links from notifications", new gto0(this, (byte) 2));
        hto0 hto0Var = new hto0((byte) 1);
        gto0 gto0Var = new gto0(this, (byte) 3);
        r95 r95Var = (r95) ajq0Var.e;
        mg30 mg30Var = (mg30) ajq0Var.b;
        ro30 ro30Var = mg30Var.a;
        rr10 rr10Var = new rr10(gto0Var, (byte) 14);
        fc3 fc3Var = new fc3(mg30Var, (byte) 8);
        r95Var.a(hto0Var, new o860((Scheduler) ro30Var.b, new cb60(ro30Var, "navigate to spotify dummy links, meaning external links from notifications", rr10Var, fc3Var, (byte) 7), "navigate to spotify dummy links, meaning external links from notifications", m830.c1, (byte) 9));
        ajq0Var.H("PLAY_AND_NAVIGATE_INTENT_ACTION", "Handle the play and navigate intent action from notifications", new ito0(this));
        ajq0Var.B("ADD_TO_PLAYLIST_INTENT_ACTION", "Opening the AddToPlaylistActivity", new jto0(this));
    }

    public final void e() {
        if (this.b.c() == null) {
            this.c.f(new dwn0(nik1.z0.a, "", false, false, 0, 0, false, null, null, null));
        }
    }

    public final void f(int i) {
        this.a.a(i);
    }
}
