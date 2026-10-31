package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class vo50 {
    public final boolean a;
    public final List b;
    public final boolean c;

    public vo50(List list, boolean z, boolean z2) {
        this.a = z;
        this.b = list;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vo50)) {
            return false;
        }
        vo50 vo50Var = (vo50) obj;
        return this.a == vo50Var.a && this.b.equals(vo50Var.b) && this.c == vo50Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + f4i1.b(Boolean.hashCode(this.a) * 31, 31, this.b);
    }
}
