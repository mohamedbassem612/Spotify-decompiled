package p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class se4 implements pdy0 {
    public final boolean a;
    public final luk b;
    public final idd1 c;

    public se4(boolean z, luk lukVar) {
        this.a = z;
        this.b = lukVar;
        this.c = new idd1(new q30(this, (byte) 8));
    }

    public static se4 c(aey0 aey0Var) {
        return new se4(aey0Var.c("android-ereader:enable_audiobook_hyde", false), null);
    }

    public final boolean b() {
        se4 se4Var = (se4) this.c.getValue();
        return se4Var != null ? se4Var.b() : this.a;
    }

    public final List models() {
        return Collections.singletonList(new fpb("enable_audiobook_hyde", "android-ereader", b()));
    }

    public se4(luk lukVar) {
        this(false, lukVar);
    }
}
