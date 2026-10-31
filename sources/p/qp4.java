package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class qp4 implements pdy0 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final luk d;
    public final idd1 e;

    public qp4(boolean z, boolean z2, boolean z3, luk lukVar) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = lukVar;
        this.e = new idd1(new lp4(this, (byte) 4));
    }

    public final boolean a() {
        qp4 qp4Var = (qp4) this.e.getValue();
        return qp4Var != null ? qp4Var.a() : this.a;
    }

    public final boolean b() {
        qp4 qp4Var = (qp4) this.e.getValue();
        return qp4Var != null ? qp4Var.b() : this.b;
    }

    public final boolean c() {
        qp4 qp4Var = (qp4) this.e.getValue();
        return qp4Var != null ? qp4Var.c() : this.c;
    }

    public final List models() {
        return p7h.M(new fpb[]{new fpb("duplicate_chip_liked_songs_enabled", "android-list-ux-platform-consumers-likedsongs-shared", a()), new fpb("enable_graduation_chip", "android-list-ux-platform-consumers-likedsongs-shared", b()), new fpb("use_select_chip_language_for_playlist_name", "android-list-ux-platform-consumers-likedsongs-shared", c())});
    }

    public qp4(luk lukVar) {
        this(false, true, true, lukVar);
    }
}
