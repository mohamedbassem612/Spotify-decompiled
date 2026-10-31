package p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class fp4 implements pdy0 {
    public final boolean a;
    public final luk b;
    public final idd1 c = new idd1(new zn4(this, (byte) 24));

    public fp4(boolean z, luk lukVar) {
        this.a = z;
        this.b = lukVar;
    }

    public final boolean a() {
        fp4 fp4Var = (fp4) this.c.getValue();
        return fp4Var != null ? fp4Var.a() : this.a;
    }

    public final List models() {
        return Collections.singletonList(new fpb("right_align_footer_actions", "android-list-ux-platform-consumers-audiobook-rows-audiobook", a()));
    }
}
