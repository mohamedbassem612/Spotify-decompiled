package p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class w8r0 implements pdy0 {
    public final boolean a;
    public final luk b;
    public final idd1 c;

    public w8r0(boolean z, luk lukVar) {
        this.a = z;
        this.b = lukVar;
        this.c = new idd1(new gyq0(this, (byte) 13));
    }

    public static w8r0 b(aey0 aey0Var) {
        return new w8r0(aey0Var.c("page-match:book_matching_enabled", false), null);
    }

    public final boolean a() {
        w8r0 w8r0Var = (w8r0) this.c.getValue();
        return w8r0Var != null ? w8r0Var.a() : this.a;
    }

    public final List models() {
        return Collections.singletonList(new fpb("book_matching_enabled", "page-match", a()));
    }

    public w8r0(luk lukVar) {
        this(false, lukVar);
    }
}
