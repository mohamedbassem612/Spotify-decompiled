package p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class i54 implements pdy0 {
    public final boolean a;
    public final luk b;
    public final idd1 c = new idd1(new m44(this, (byte) 15));

    public i54(boolean z, luk lukVar) {
        this.a = z;
        this.b = lukVar;
    }

    public final boolean a() {
        i54 i54Var = (i54) this.c.getValue();
        return i54Var != null ? i54Var.a() : this.a;
    }

    public final List models() {
        return Collections.singletonList(new fpb("fully_support_audiobooks", "android-assisted-curation-curation-handler-playlist", a()));
    }
}
