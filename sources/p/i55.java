package p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class i55 implements pdy0 {
    public final boolean a;
    public final luk b;
    public final idd1 c = new idd1(new f55(this, (byte) 2));

    public i55(boolean z, luk lukVar) {
        this.a = z;
        this.b = lukVar;
    }

    public final boolean a() {
        i55 i55Var = (i55) this.c.getValue();
        return i55Var != null ? i55Var.a() : this.a;
    }

    public final List models() {
        return Collections.singletonList(new fpb("enable_static_transcript", "android-transcript-link", a()));
    }
}
