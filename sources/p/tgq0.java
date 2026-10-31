package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class tgq0 {
    public final Set a;
    public final long b;

    public tgq0(Set set, long j) {
        this.a = set;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tgq0)) {
            return false;
        }
        tgq0 tgq0Var = (tgq0) obj;
        return this.a.equals(tgq0Var.a) && this.b == tgq0Var.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
