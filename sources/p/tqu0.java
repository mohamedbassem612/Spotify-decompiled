package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class tqu0 {
    public final String a;
    public final List b;
    public final boolean c;
    public final boolean d;

    public tqu0(List list, boolean z, String str, boolean z2) {
        this.a = str;
        this.b = list;
        this.c = z;
        this.d = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tqu0)) {
            return false;
        }
        tqu0 tqu0Var = (tqu0) obj;
        return u890.j(this.a, tqu0Var.a) && this.b.equals(tqu0Var.b) && this.c == tqu0Var.c && this.d == tqu0Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + xcg1.g(f4i1.b(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }
}
