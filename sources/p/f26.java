package p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class f26 implements pdy0 {
    public final boolean a;
    public final feh1 b;
    public final idd1 c = new idd1(new f85(this, (byte) 28));

    public f26(boolean z, xz11 xz11Var) {
        this.a = z;
        this.b = xz11Var;
    }

    public final boolean a() {
        f26 f26Var = (f26) this.c.getValue();
        return f26Var != null ? f26Var.a() : this.a;
    }

    public final List models() {
        return Collections.singletonList(new fpb("widget_enabled", "apps-music-features-widget", a()));
    }
}
