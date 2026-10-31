package p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class fq4 implements pdy0 {
    public final boolean a;
    public final luk b;
    public final idd1 c;

    public fq4(boolean z, luk lukVar) {
        this.a = z;
        this.b = lukVar;
        this.c = new idd1(new lp4(this, (byte) 18));
    }

    public final boolean a() {
        fq4 fq4Var = (fq4) this.c.getValue();
        return fq4Var != null ? fq4Var.a() : this.a;
    }

    public final List models() {
        return Collections.singletonList(new fpb("enabled", "android-list-ux-platform-consumers-standard-listcomponents-deletedbyowner", a()));
    }

    public fq4(luk lukVar) {
        this(true, lukVar);
    }
}
