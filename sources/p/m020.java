package p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class m020 implements pdy0 {
    public final boolean a;
    public final luk b;
    public final idd1 c;

    public m020(boolean z, luk lukVar) {
        this.a = z;
        this.b = lukVar;
        this.c = new idd1(new cc00(this, (byte) 7));
    }

    public final boolean b() {
        m020 m020Var = (m020) this.c.getValue();
        return m020Var != null ? m020Var.b() : this.a;
    }

    public final List models() {
        return Collections.singletonList(new fpb("enable_offline_listening_toggle", "fetch-settings", b()));
    }

    public m020(luk lukVar) {
        this(false, lukVar);
    }
}
