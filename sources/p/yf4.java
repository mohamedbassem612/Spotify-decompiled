package p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class yf4 implements pdy0 {
    public final boolean a;
    public final luk b;
    public final idd1 c = new idd1(new pe4(this, (byte) 28));

    public yf4(boolean z, luk lukVar) {
        this.a = z;
        this.b = lukVar;
    }

    public final boolean a() {
        yf4 yf4Var = (yf4) this.c.getValue();
        return yf4Var != null ? yf4Var.a() : this.a;
    }

    public final List models() {
        return Collections.singletonList(new fpb("enable_composer_page", "android-feature-creator-root-page", a()));
    }
}
