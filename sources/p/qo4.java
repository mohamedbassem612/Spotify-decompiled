package p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class qo4 implements pdy0 {
    public final boolean a;
    public final luk b;
    public final idd1 c;

    public qo4(boolean z, luk lukVar) {
        this.a = z;
        this.b = lukVar;
        this.c = new idd1(new q30(this, (byte) 16));
    }

    public static qo4 c(aey0 aey0Var) {
        return new qo4(aey0Var.c("android-libs-waze:waze_sdk_enabled", true), null);
    }

    public final boolean b() {
        qo4 qo4Var = (qo4) this.c.getValue();
        return qo4Var != null ? qo4Var.b() : this.a;
    }

    public final boolean d() {
        return b();
    }

    public final List models() {
        return Collections.singletonList(new fpb("waze_sdk_enabled", "android-libs-waze", b()));
    }

    public qo4(luk lukVar) {
        this(true, lukVar);
    }
}
