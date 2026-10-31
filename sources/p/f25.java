package p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class f25 implements pdy0 {
    public final boolean a;
    public final luk b;
    public final idd1 c = new idd1(new uz4(this, (byte) 28));

    public f25(boolean z, luk lukVar) {
        this.a = z;
        this.b = lukVar;
    }

    public final boolean a() {
        f25 f25Var = (f25) this.c.getValue();
        return f25Var != null ? f25Var.a() : this.a;
    }

    public final List models() {
        return Collections.singletonList(new fpb("standalone_author_page_enabled", "android-system-author", a()));
    }
}
