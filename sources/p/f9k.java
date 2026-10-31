package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class f9k {
    public final String a;
    public final List b = z6x.a;
    public final int c;

    public f9k(String str, int i) {
        this.a = str;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f9k)) {
            return false;
        }
        f9k f9kVar = (f9k) obj;
        return u890.j(this.a, f9kVar.a) && this.b.equals(f9kVar.b) && this.c == f9kVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + f4i1.b(xcg1.g(this.a.hashCode() * 961, 961, false), 31, this.b);
    }
}
