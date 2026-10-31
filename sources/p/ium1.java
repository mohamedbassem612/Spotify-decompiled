package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ium1 {
    public final Set a;
    public final boolean b;

    public ium1(Set set, boolean z) {
        this.a = set;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ium1)) {
            return false;
        }
        ium1 ium1Var = (ium1) obj;
        return this.a.equals(ium1Var.a) && this.b == ium1Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
