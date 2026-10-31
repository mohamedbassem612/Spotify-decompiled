package p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ze4 implements pdy0 {
    public final boolean a;
    public final luk b;
    public final idd1 c;

    public ze4(boolean z, luk lukVar) {
        this.a = z;
        this.b = lukVar;
        this.c = new idd1(new pe4(this, (byte) 7));
    }

    public final boolean a() {
        ze4 ze4Var = (ze4) this.c.getValue();
        return ze4Var != null ? ze4Var.a() : this.a;
    }

    public final List models() {
        return Collections.singletonList(new fpb("enable_ai_attribution", "android-feature-agent-row", a()));
    }

    public ze4(luk lukVar) {
        this(false, lukVar);
    }
}
