package p;

import android.os.Bundle;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class h5p0 implements g5p0 {
    public final a1r0 a;

    public h5p0(a1r0 a1r0Var) {
        this.a = a1r0Var;
    }

    public final void a(ou80 ou80Var) {
        d("spotify:internal:now-playing:queue-peek", ou80Var);
    }

    public final void c(ou80 ou80Var) {
        d("spotify:now-playing:queue", ou80Var);
    }

    public final void d(String str, ou80 ou80Var) {
        a1r0.e(this.a, new dwn0(str, "", false, false, 0, 0, false, (a690) null, (Bundle) null, ou80Var != null ? new awn0(ou80Var) : null), (Bundle) null, 6);
    }
}
