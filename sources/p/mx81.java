package p;

import app.p000rive.semantics.SemanticState;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class mx81 {
    public final String a;
    public final int b;
    public final boolean c;
    public final int d;
    public final int e;
    public final Long f;

    public mx81(String str, int i, int i2, Long l, int i3) {
        i = (i3 & 8) != 0 ? 1 : i;
        boolean z = (i3 & 16) == 0;
        int i4 = (i3 & 32) == 0 ? 2131165342 : 0;
        i2 = (i3 & 64) != 0 ? 2 : i2;
        l = (i3 & SemanticState.Focused) != 0 ? null : l;
        this.a = str;
        this.b = i;
        this.c = z;
        this.d = i4;
        this.e = i2;
        this.f = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mx81)) {
            return false;
        }
        mx81 mx81Var = (mx81) obj;
        return u890.j(this.a, mx81Var.a) && this.b == mx81Var.b && this.c == mx81Var.c && this.d == mx81Var.d && this.e == mx81Var.e && u890.j(this.f, mx81Var.f);
    }

    public final int hashCode() {
        String str = this.a;
        int iF = kaa0.f(this.e, kaa0.f(this.d, xcg1.g(ab80.k(this.b, (str == null ? 0 : str.hashCode()) * 29791, 31), 31, this.c), 31), 31);
        Long l = this.f;
        return iF + (l != null ? l.hashCode() : 0);
    }
}
