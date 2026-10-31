package p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class n35 implements pdy0 {
    public final boolean a;
    public final luk b;
    public final idd1 c;

    public n35(boolean z, luk lukVar) {
        this.a = z;
        this.b = lukVar;
        this.c = new idd1(new k25(this, (byte) 17));
    }

    public final boolean a() {
        n35 n35Var = (n35) this.c.getValue();
        return n35Var != null ? n35Var.a() : this.a;
    }

    public final List models() {
        return Collections.singletonList(new fpb("enable_compose_transcript_renderer", "android-system-previewcard-element-transcripts-impl", a()));
    }

    public n35(luk lukVar) {
        this(false, lukVar);
    }
}
