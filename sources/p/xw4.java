package p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class xw4 implements pdy0 {
    public final boolean a;
    public final luk b;
    public final idd1 c;

    public xw4(boolean z, luk lukVar) {
        this.a = z;
        this.b = lukVar;
        this.c = new idd1(new q30(this, (byte) 19));
    }

    public final boolean b() {
        xw4 xw4Var = (xw4) this.c.getValue();
        return xw4Var != null ? xw4Var.b() : this.a;
    }

    public final List models() {
        return Collections.singletonList(new fpb("enabled", "android-peekabook", b()));
    }

    public xw4(luk lukVar) {
        this(false, lukVar);
    }
}
