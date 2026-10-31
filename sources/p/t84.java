package p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class t84 implements pdy0 {
    public final boolean a;
    public final luk b;
    public final idd1 c = new idd1(new u74(this, (byte) 9));

    public t84(boolean z, luk lukVar) {
        this.a = z;
        this.b = lukVar;
    }

    public final boolean a() {
        t84 t84Var = (t84) this.c.getValue();
        return t84Var != null ? t84Var.a() : this.a;
    }

    public final List models() {
        return Collections.singletonList(new fpb("enable_facebook_messenger_text", "android-campaigns-wes", a()));
    }
}
