package p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class qe4 implements pdy0 {
    public final boolean a;
    public final luk b;
    public final idd1 c = new idd1(new pe4(this, (byte) 0));

    public qe4(boolean z, luk lukVar) {
        this.a = z;
        this.b = lukVar;
    }

    public final boolean a() {
        qe4 qe4Var = (qe4) this.c.getValue();
        return qe4Var != null ? qe4Var.a() : this.a;
    }

    public final List models() {
        return Collections.singletonList(new fpb("use_share_data_element", "android-episode-page-cwppagetemplate", a()));
    }
}
