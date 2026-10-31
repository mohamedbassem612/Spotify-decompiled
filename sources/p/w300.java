package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class w300 implements t600 {
    public final int a;
    public final List b;

    public w300(int i, List list) {
        this.a = i;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w300)) {
            return false;
        }
        w300 w300Var = (w300) obj;
        return this.a == w300Var.a && this.b.equals(w300Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }
}
