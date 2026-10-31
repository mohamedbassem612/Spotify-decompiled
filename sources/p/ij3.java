package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ij3 extends dsa0 {
    public final String c;
    public final List d;

    public ij3(String str, List list) {
        this.c = str;
        this.d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ij3)) {
            return false;
        }
        ij3 ij3Var = (ij3) obj;
        return u890.j(this.c, ij3Var.c) && u890.j(this.d, ij3Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + (this.c.hashCode() * 31);
    }
}
