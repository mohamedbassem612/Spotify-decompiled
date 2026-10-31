package p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ym4 implements pdy0 {
    public final boolean a;
    public final luk b;
    public final idd1 c = new idd1(new om4(this, (byte) 8));

    public ym4(boolean z, luk lukVar) {
        this.a = z;
        this.b = lukVar;
    }

    public final boolean a() {
        ym4 ym4Var = (ym4) this.c.getValue();
        return ym4Var != null ? ym4Var.a() : this.a;
    }

    public final List models() {
        return Collections.singletonList(new fpb("video_manifest_prefetch_plugin_enabled", "android-libs-nowplaying-activity-plugins", a()));
    }
}
