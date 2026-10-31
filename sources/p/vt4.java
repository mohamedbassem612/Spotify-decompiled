package p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class vt4 implements pdy0 {
    public final boolean a;
    public final luk b;
    public final idd1 c;

    public vt4(boolean z, luk lukVar) {
        this.a = z;
        this.b = lukVar;
        this.c = new idd1(new st4(this, (byte) 2));
    }

    public final boolean a() {
        vt4 vt4Var = (vt4) this.c.getValue();
        return vt4Var != null ? vt4Var.a() : this.a;
    }

    public final List models() {
        return Collections.singletonList(new fpb("remove_possessive_your", "android-music-app-platform-possessive-copy-properties", a()));
    }

    public vt4(luk lukVar) {
        this(false, lukVar);
    }
}
