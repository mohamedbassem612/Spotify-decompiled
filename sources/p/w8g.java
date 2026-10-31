package p;

import android.net.Uri;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class w8g implements q2i1 {
    public final n2i1 a;
    public final k2i1 b;

    public w8g(n2i1 n2i1Var, k2i1 k2i1Var) {
        this.a = n2i1Var;
        this.b = k2i1Var;
    }

    @Override // p.q2i1
    public final boolean a(Uri uri) {
        return this.a.s(uri);
    }

    @Override // p.q2i1
    public final boolean c(Uri uri) {
        if (!this.a.s(uri)) {
            return false;
        }
        this.b.b(uri);
        return true;
    }
}
