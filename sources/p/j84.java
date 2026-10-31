package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class j84 implements pdy0 {
    public final int a;
    public final int b;
    public final luk c;
    public final idd1 d;

    public j84(int i, int i2, luk lukVar) {
        this.a = i;
        this.b = i2;
        this.c = lukVar;
        this.d = new idd1(new u74(this, (byte) 4));
    }

    public final int a() {
        j84 j84Var = (j84) this.d.getValue();
        return j84Var != null ? j84Var.a() : this.a;
    }

    public final int b() {
        j84 j84Var = (j84) this.d.getValue();
        return j84Var != null ? j84Var.b() : this.b;
    }

    public final List models() {
        return p7h.M(new fpb[]{new fpb("duck_fade_ms", "android-byom-volumeimpl", a(), 0, 5000), new fpb("duck_target_volume_pct", "android-byom-volumeimpl", b(), 0, 100)});
    }

    public j84(luk lukVar) {
        this(500, 15, lukVar);
    }
}
