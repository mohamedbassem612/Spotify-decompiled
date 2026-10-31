package p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class bj4 implements pdy0 {
    public final boolean a;
    public final luk b;
    public final idd1 c = new idd1(new sh4(this, (byte) 22));

    public bj4(boolean z, luk lukVar) {
        this.a = z;
        this.b = lukVar;
    }

    public final boolean a() {
        bj4 bj4Var = (bj4) this.c.getValue();
        return bj4Var != null ? bj4Var.a() : this.a;
    }

    public final List models() {
        return Collections.singletonList(new fpb("disable_loading_content", "android-feature-voice-assistant", a()));
    }
}
