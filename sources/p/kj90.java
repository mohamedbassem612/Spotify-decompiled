package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class kj90 {
    public final String a;
    public final List b;

    public kj90(String str, List list) {
        this.a = str;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kj90)) {
            return false;
        }
        kj90 kj90Var = (kj90) obj;
        return u890.j(this.a, kj90Var.a) && u890.j(this.b, kj90Var.b);
    }

    public final int hashCode() {
        String str = this.a;
        return this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }
}
