package p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class cv4 implements pdy0 {
    public final boolean a;
    public final luk b;
    public final idd1 c = new idd1(new st4(this, (byte) 27));

    public cv4(boolean z, luk lukVar) {
        this.a = z;
        this.b = lukVar;
    }

    public final boolean a() {
        cv4 cv4Var = (cv4) this.c.getValue();
        return cv4Var != null ? cv4Var.a() : this.a;
    }

    public final List models() {
        return Collections.singletonList(new fpb("is_video_interceptor_enabled", "android-nowplaying-elements-videointerceptor", a()));
    }
}
