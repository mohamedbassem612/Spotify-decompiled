package p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class jo4 implements pdy0 {
    public final boolean a;
    public final luk b;
    public final idd1 c;

    public jo4(boolean z, luk lukVar) {
        this.a = z;
        this.b = lukVar;
        this.c = new idd1(new zn4(this, (byte) 8));
    }

    public final boolean a() {
        jo4 jo4Var = (jo4) this.c.getValue();
        return jo4Var != null ? jo4Var.a() : this.a;
    }

    public final List models() {
        return Collections.singletonList(new fpb("enable_vocal_removal", "android-libs-singalong", a()));
    }

    public jo4(luk lukVar) {
        this(false, lukVar);
    }
}
