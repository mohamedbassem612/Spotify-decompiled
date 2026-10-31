package p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class qm4 implements pdy0 {
    public final boolean a;
    public final luk b;
    public final idd1 c = new idd1(new q30(this, (byte) 15));

    public qm4(boolean z, luk lukVar) {
        this.a = z;
        this.b = lukVar;
    }

    public static qm4 c(aey0 aey0Var) {
        return new qm4(aey0Var.c("android-libs-hugs:apply_content_area_padding", false), null);
    }

    public final boolean b() {
        qm4 qm4Var = (qm4) this.c.getValue();
        return qm4Var != null ? qm4Var.b() : this.a;
    }

    public final List models() {
        return Collections.singletonList(new fpb("apply_content_area_padding", "android-libs-hugs", b()));
    }
}
