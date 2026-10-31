package p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class n94 implements pdy0 {
    public final boolean a;
    public final luk b;
    public final idd1 c;

    public n94(boolean z, luk lukVar) {
        this.a = z;
        this.b = lukVar;
        this.c = new idd1(new u74(this, (byte) 17));
    }

    public final boolean a() {
        n94 n94Var = (n94) this.c.getValue();
        return n94Var != null ? n94Var.a() : this.a;
    }

    public final List models() {
        return Collections.singletonList(new fpb("age_assurance_check_enabled", "android-collectionartist-collection-artist", a()));
    }

    public n94(luk lukVar) {
        this(false, lukVar);
    }
}
