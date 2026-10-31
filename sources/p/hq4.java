package p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class hq4 implements pdy0 {
    public final boolean a;
    public final luk b;
    public final idd1 c;

    public hq4(boolean z, luk lukVar) {
        this.a = z;
        this.b = lukVar;
        this.c = new idd1(new lp4(this, (byte) 20));
    }

    public final boolean a() {
        hq4 hq4Var = (hq4) this.c.getValue();
        return hq4Var != null ? hq4Var.a() : this.a;
    }

    public final List models() {
        return Collections.singletonList(new fpb("enabled", "android-list-ux-platform-consumers-standard-listcomponents-privacysnackbar", a()));
    }

    public hq4(luk lukVar) {
        this(true, lukVar);
    }
}
