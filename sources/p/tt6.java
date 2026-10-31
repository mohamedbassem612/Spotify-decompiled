package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class tt6 {
    public final boolean a;
    public final List b;

    public tt6(List list, boolean z) {
        this.a = z;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tt6)) {
            return false;
        }
        tt6 tt6Var = (tt6) obj;
        return this.a == tt6Var.a && this.b.equals(tt6Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
    }
}
