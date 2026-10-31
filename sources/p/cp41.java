package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class cp41 implements np41 {
    public final List a;
    public final boolean b;

    public cp41(List list, boolean z) {
        this.a = list;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cp41)) {
            return false;
        }
        cp41 cp41Var = (cp41) obj;
        return this.a.equals(cp41Var.a) && this.b == cp41Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
