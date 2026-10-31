package p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ju4 implements pdy0 {
    public final boolean a;
    public final luk b;
    public final idd1 c;

    public ju4(boolean z, luk lukVar) {
        this.a = z;
        this.b = lukVar;
        this.c = new idd1(new st4(this, (byte) 14));
    }

    public final boolean a() {
        ju4 ju4Var = (ju4) this.c.getValue();
        return ju4Var != null ? ju4Var.a() : this.a;
    }

    public final List models() {
        return Collections.singletonList(new fpb("is_video_first_standard_experience_enabled", "android-musicvideos-listvideofirst", a()));
    }

    public ju4(luk lukVar) {
        this(false, lukVar);
    }
}
