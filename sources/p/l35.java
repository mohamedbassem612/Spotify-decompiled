package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class l35 implements pdy0 {
    public final boolean a;
    public final boolean b;
    public final luk c;
    public final idd1 d;

    public l35(boolean z, boolean z2, luk lukVar) {
        this.a = z;
        this.b = z2;
        this.c = lukVar;
        this.d = new idd1(new k25(this, (byte) 15));
    }

    public final boolean a() {
        l35 l35Var = (l35) this.d.getValue();
        return l35Var != null ? l35Var.a() : this.a;
    }

    public final boolean b() {
        l35 l35Var = (l35) this.d.getValue();
        return l35Var != null ? l35Var.b() : this.b;
    }

    public final List models() {
        return p7h.M(new fpb[]{new fpb("playlist_curator_stats_enabled", "android-system-playliststats-properties", a()), new fpb("playlist_curator_stats_fake_data_enabled", "android-system-playliststats-properties", b())});
    }

    public l35(luk lukVar) {
        this(false, false, lukVar);
    }
}
