package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class kfd1 {
    public final String a;
    public final List b;

    public kfd1(String str, List list) {
        this.a = str;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kfd1)) {
            return false;
        }
        kfd1 kfd1Var = (kfd1) obj;
        return this.a.equals(kfd1Var.a) && this.b.equals(kfd1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
