package p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class de4 implements pdy0 {
    public final boolean a;
    public final luk b;
    public final idd1 c;

    public de4(boolean z, luk lukVar) {
        this.a = z;
        this.b = lukVar;
        this.c = new idd1(new wb4(this, (byte) 22));
    }

    public final boolean a() {
        de4 de4Var = (de4) this.c.getValue();
        return de4Var != null ? de4Var.a() : this.a;
    }

    public final List models() {
        return Collections.singletonList(new fpb("editor_profile_enabled", "android-editorprofile-remoteconfiguration", a()));
    }

    public de4(luk lukVar) {
        this(false, lukVar);
    }
}
