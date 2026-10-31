package p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class zo4 implements pdy0 {
    public final boolean a;
    public final luk b;
    public final idd1 c;

    public zo4(boolean z, luk lukVar) {
        this.a = z;
        this.b = lukVar;
        this.c = new idd1(new zn4(this, (byte) 18));
    }

    public final boolean a() {
        zo4 zo4Var = (zo4) this.c.getValue();
        return zo4Var != null ? zo4Var.a() : this.a;
    }

    public final List models() {
        return Collections.singletonList(new fpb("enable_small_list_direct_load", "android-list-platform-viewport-impl", a()));
    }

    public zo4(luk lukVar) {
        this(true, lukVar);
    }
}
