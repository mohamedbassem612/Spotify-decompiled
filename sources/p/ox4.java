package p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ox4 implements pdy0 {
    public final boolean a;
    public final tgp0 b;
    public final luk c;
    public final idd1 d;
    public final idd1 e;

    public ox4(boolean z, tgp0 tgp0Var, luk lukVar) {
        this.a = z;
        this.b = tgp0Var;
        this.c = lukVar;
        this.d = new idd1(new nx4(this, (byte) 1));
        this.e = new idd1(new nx4(this, (byte) 0));
    }

    public final boolean a() {
        ox4 ox4Var = (ox4) this.e.getValue();
        return ox4Var != null ? ox4Var.a() : this.a;
    }

    public final List models() {
        return Collections.singletonList(new fpb("automix_enabled", "android-player-settings-automix", a()));
    }

    public ox4(tgp0 tgp0Var, luk lukVar) {
        this(true, tgp0Var, lukVar);
    }
}
