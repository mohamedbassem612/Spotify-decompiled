package p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class x54 implements pdy0 {
    public final boolean a;
    public final luk b;
    public final idd1 c;

    public x54(boolean z, luk lukVar) {
        this.a = z;
        this.b = lukVar;
        this.c = new idd1(new m44(this, (byte) 25));
    }

    public final boolean a() {
        x54 x54Var = (x54) this.c.getValue();
        return x54Var != null ? x54Var.a() : this.a;
    }

    public final List models() {
        return Collections.singletonList(new fpb("enable_backend_session_termination", "android-authentication-logout-service-impl", a()));
    }

    public x54(luk lukVar) {
        this(false, lukVar);
    }
}
