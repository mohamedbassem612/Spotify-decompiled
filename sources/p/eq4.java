package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class eq4 implements pdy0 {
    public final boolean a;
    public final boolean b;
    public final luk c;
    public final idd1 d = new idd1(new lp4(this, (byte) 17));

    public eq4(boolean z, boolean z2, luk lukVar) {
        this.a = z;
        this.b = z2;
        this.c = lukVar;
    }

    public final boolean a() {
        eq4 eq4Var = (eq4) this.d.getValue();
        return eq4Var != null ? eq4Var.a() : this.a;
    }

    public final boolean b() {
        eq4 eq4Var = (eq4) this.d.getValue();
        return eq4Var != null ? eq4Var.b() : this.b;
    }

    public final List models() {
        return p7h.M(new fpb[]{new fpb("enable_for_lists_with_audiobook_content", "android-list-ux-platform-consumers-standard-headerplaybutton", a()), new fpb("enable_omni_play_button_element", "android-list-ux-platform-consumers-standard-headerplaybutton", b())});
    }
}
