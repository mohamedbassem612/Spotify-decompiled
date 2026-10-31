package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class sz81 implements uz81 {
    public final int a;
    public final List b;

    public sz81(int i, List list) {
        this.a = i;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sz81)) {
            return false;
        }
        sz81 sz81Var = (sz81) obj;
        return this.a == sz81Var.a && this.b.equals(sz81Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }
}
