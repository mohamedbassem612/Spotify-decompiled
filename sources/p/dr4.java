package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class dr4 implements pdy0 {
    public final int a;
    public final boolean b;
    public final boolean c;
    public final luk d;
    public final idd1 e = new idd1(new rq4(this, (byte) 8));

    public dr4(int i, luk lukVar, boolean z, boolean z2) {
        this.a = i;
        this.b = z;
        this.c = z2;
        this.d = lukVar;
    }

    public final int a() {
        dr4 dr4Var = (dr4) this.e.getValue();
        return dr4Var != null ? dr4Var.a() : this.a;
    }

    public final boolean b() {
        dr4 dr4Var = (dr4) this.e.getValue();
        return dr4Var != null ? dr4Var.b() : this.b;
    }

    public final boolean c() {
        dr4 dr4Var = (dr4) this.e.getValue();
        return dr4Var != null ? dr4Var.c() : this.c;
    }

    @Override // p.pdy0
    public final List models() {
        return p7h.M(new fpb("download_delay_ms", "android-lyrics-offline-impl", a(), 0, 30000), new fpb("lyrics_offline_enabled", "android-lyrics-offline-impl", b()), new fpb("suppress_download_error_retry", "android-lyrics-offline-impl", c()));
    }
}
