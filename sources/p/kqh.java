package p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class kqh implements pdy0 {
    public final boolean a;
    public final luk b;
    public final idd1 c = new idd1(new vjh(this, (byte) 4));

    public kqh(boolean z, luk lukVar) {
        this.a = z;
        this.b = lukVar;
    }

    public final boolean a() {
        kqh kqhVar = (kqh) this.c.getValue();
        return kqhVar != null ? kqhVar.a() : this.a;
    }

    public final List models() {
        return Collections.singletonList(new fpb("enable_comments_npv_widget", "comments-widget", a()));
    }
}
