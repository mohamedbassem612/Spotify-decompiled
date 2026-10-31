package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class vp4 implements pdy0 {
    public final boolean a;
    public final boolean b;
    public final luk c;
    public final idd1 d;

    public vp4(boolean z, boolean z2, luk lukVar) {
        this.a = z;
        this.b = z2;
        this.c = lukVar;
        this.d = new idd1(new lp4(this, (byte) 9));
    }

    public final boolean a() {
        vp4 vp4Var = (vp4) this.d.getValue();
        return vp4Var != null ? vp4Var.a() : this.a;
    }

    public final boolean b() {
        vp4 vp4Var = (vp4) this.d.getValue();
        return vp4Var != null ? vp4Var.b() : this.b;
    }

    public final List models() {
        return p7h.M(new fpb[]{new fpb("allow_accept_of_list_component", "android-list-ux-platform-consumers-playlistcollaboration-listcomponents-reactionlens", a()), new fpb("allow_reaction_lens", "android-list-ux-platform-consumers-playlistcollaboration-listcomponents-reactionlens", b())});
    }

    public vp4(luk lukVar) {
        this(false, false, lukVar);
    }
}
