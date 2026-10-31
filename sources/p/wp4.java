package p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class wp4 implements pdy0 {
    public final boolean a;
    public final luk b;
    public final idd1 c;

    public wp4(boolean z, luk lukVar) {
        this.a = z;
        this.b = lukVar;
        this.c = new idd1(new lp4(this, (byte) 10));
    }

    public final boolean a() {
        wp4 wp4Var = (wp4) this.c.getValue();
        return wp4Var != null ? wp4Var.a() : this.a;
    }

    public final List models() {
        return Collections.singletonList(new fpb("radio_header_metadata_enabled", "android-list-ux-platform-consumers-radio-shared", a()));
    }

    public wp4(luk lukVar) {
        this(false, lukVar);
    }
}
