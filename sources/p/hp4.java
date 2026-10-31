package p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class hp4 implements pdy0 {
    public final boolean a;
    public final luk b;
    public final idd1 c;

    public hp4(boolean z, luk lukVar) {
        this.a = z;
        this.b = lukVar;
        this.c = new idd1(new zn4(this, (byte) 26));
    }

    public final boolean a() {
        hp4 hp4Var = (hp4) this.c.getValue();
        return hp4Var != null ? hp4Var.a() : this.a;
    }

    public final List models() {
        return Collections.singletonList(new fpb("use_release_row", "android-list-ux-platform-consumers-audiobook-rows-releaserow", a()));
    }

    public hp4(luk lukVar) {
        this(false, lukVar);
    }
}
