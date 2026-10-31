package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class n7z0 extends z8z0 {
    public final boolean a;
    public final List b;
    public final boolean c;

    public n7z0(List list, boolean z, boolean z2) {
        this.a = z;
        this.b = list;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n7z0)) {
            return false;
        }
        n7z0 n7z0Var = (n7z0) obj;
        return this.a == n7z0Var.a && this.b.equals(n7z0Var.b) && this.c == n7z0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + f4i1.b(Boolean.hashCode(this.a) * 31, 31, this.b);
    }
}
