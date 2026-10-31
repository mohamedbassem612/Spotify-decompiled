package p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class sm4 implements pdy0 {
    public final boolean a;
    public final luk b;
    public final idd1 c = new idd1(new om4(this, (byte) 2));

    public sm4(boolean z, luk lukVar) {
        this.a = z;
        this.b = lukVar;
    }

    public final boolean a() {
        sm4 sm4Var = (sm4) this.c.getValue();
        return sm4Var != null ? sm4Var.a() : this.a;
    }

    public final List models() {
        return Collections.singletonList(new fpb("enable_fullscreen_track_change", "android-libs-lyrics", a()));
    }
}
