package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class aqx0 {
    public final boolean a;
    public final List b;

    public aqx0(List list, boolean z) {
        this.a = z;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aqx0)) {
            return false;
        }
        aqx0 aqx0Var = (aqx0) obj;
        return this.a == aqx0Var.a && u890.j(this.b, aqx0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
    }
}
