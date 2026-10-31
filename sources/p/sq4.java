package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class sq4 implements pdy0 {
    public final boolean a;
    public final boolean b;
    public final int c;
    public final boolean d;
    public final boolean e;
    public final luk f;
    public final idd1 g = new idd1(new rq4(this, (byte) 0));

    public sq4(int i, luk lukVar, boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = z;
        this.b = z2;
        this.c = i;
        this.d = z3;
        this.e = z4;
        this.f = lukVar;
    }

    public final boolean a() {
        sq4 sq4Var = (sq4) this.g.getValue();
        return sq4Var != null ? sq4Var.a() : this.a;
    }

    public final boolean b() {
        sq4 sq4Var = (sq4) this.g.getValue();
        return sq4Var != null ? sq4Var.b() : this.b;
    }

    public final int c() {
        sq4 sq4Var = (sq4) this.g.getValue();
        return sq4Var != null ? sq4Var.c() : this.c;
    }

    public final boolean d() {
        sq4 sq4Var = (sq4) this.g.getValue();
        return sq4Var != null ? sq4Var.d() : this.d;
    }

    public final boolean e() {
        sq4 sq4Var = (sq4) this.g.getValue();
        return sq4Var != null ? sq4Var.e() : this.e;
    }

    public final List models() {
        return p7h.M(new fpb[]{new fpb("join_party_on_web_cta_enabled", "android-liveroom-livestreampagefragment", a()), new fpb("livestream_pause_button_enabled", "android-liveroom-livestreampagefragment", b()), new fpb("stream_to_main_lifecycle_message_delay_millis", "android-liveroom-livestreampagefragment", c(), 0, 60000), new fpb("upcoming_listening_parties_enabled", "android-liveroom-livestreampagefragment", d()), new fpb("voting_widget_enabled", "android-liveroom-livestreampagefragment", e())});
    }
}
