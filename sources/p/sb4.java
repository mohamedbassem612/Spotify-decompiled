package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class sb4 implements pdy0 {
    public final boolean a;
    public final luk b;
    public final idd1 c = new idd1(new u74(this, (byte) 26));

    public sb4(boolean z, luk lukVar) {
        this.a = z;
        this.b = lukVar;
    }

    public final boolean a() {
        sb4 sb4Var = (sb4) this.c.getValue();
        return sb4Var != null ? sb4Var.a() : this.a;
    }

    public final List models() {
        return k4p1.x(new fpb("media_prefetch_data_saver_enabled", "android-contentdelivery-prefetchimpl", a()));
    }
}
