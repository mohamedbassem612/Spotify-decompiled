package p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class z44 implements pdy0 {
    public final boolean a;
    public final luk b;
    public final idd1 c;

    public z44(boolean z, luk lukVar) {
        this.a = z;
        this.b = lukVar;
        this.c = new idd1(new m44(this, (byte) 9));
    }

    public final boolean a() {
        z44 z44Var = (z44) this.c.getValue();
        return z44Var != null ? z44Var.a() : this.a;
    }

    public final List models() {
        return Collections.singletonList(new fpb("enable_background_verification_trigger", "android-app-music-scopes-deferred", a()));
    }

    public z44(luk lukVar) {
        this(true, lukVar);
    }
}
