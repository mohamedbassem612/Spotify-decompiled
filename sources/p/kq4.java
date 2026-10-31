package p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class kq4 implements pdy0 {
    public final boolean a;
    public final luk b;
    public final idd1 c;

    public kq4(boolean z, luk lukVar) {
        this.a = z;
        this.b = lukVar;
        this.c = new idd1(new lp4(this, (byte) 23));
    }

    public final boolean a() {
        kq4 kq4Var = (kq4) this.c.getValue();
        return kq4Var != null ? kq4Var.a() : this.a;
    }

    public final List models() {
        return Collections.singletonList(new fpb("show_subtitle", "android-list-ux-platform-consumers-stsimported-shared", a()));
    }

    public kq4(luk lukVar) {
        this(false, lukVar);
    }
}
