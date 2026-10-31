package p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class o74 implements pdy0 {
    public final boolean a;
    public final luk b;
    public final idd1 c = new idd1(new m44(this, (byte) 26));

    public o74(boolean z, luk lukVar) {
        this.a = z;
        this.b = lukVar;
    }

    public final boolean a() {
        o74 o74Var = (o74) this.c.getValue();
        return o74Var != null ? o74Var.a() : this.a;
    }

    public final List models() {
        return Collections.singletonList(new fpb("enable_unified_language_picker", "android-betamax-audio-language-page-impl", a()));
    }
}
