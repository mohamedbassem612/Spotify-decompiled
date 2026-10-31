package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class owc0 {
    public final int a;
    public final List b;

    public owc0(int i, List list) {
        this.a = i;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof owc0)) {
            return false;
        }
        owc0 owc0Var = (owc0) obj;
        return this.a == owc0Var.a && u890.j(this.b, owc0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }
}
