package p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ar4 implements pdy0 {
    public final boolean a;
    public final luk b;
    public final idd1 c = new idd1(new rq4(this, (byte) 5));

    public ar4(boolean z, luk lukVar) {
        this.a = z;
        this.b = lukVar;
    }

    public final boolean a() {
        ar4 ar4Var = (ar4) this.c.getValue();
        return ar4Var != null ? ar4Var.a() : this.a;
    }

    public final List models() {
        return Collections.singletonList(new fpb("login_method_page_enabled", "android-login-settings-loginmethods-impl", a()));
    }
}
