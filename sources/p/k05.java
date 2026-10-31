package p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class k05 implements pdy0 {
    public final boolean a;
    public final luk b;
    public final idd1 c;

    public k05(boolean z, luk lukVar) {
        this.a = z;
        this.b = lukVar;
        this.c = new idd1(new uz4(this, (byte) 13));
    }

    public final boolean a() {
        k05 k05Var = (k05) this.c.getValue();
        return k05Var != null ? k05Var.a() : this.a;
    }

    public final List models() {
        return Collections.singletonList(new fpb("enable_remote_downloads", "android-remotedownloads-contextmenu", a()));
    }

    public k05(luk lukVar) {
        this(false, lukVar);
    }
}
