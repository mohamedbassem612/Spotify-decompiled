package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class w201 {
    public final List a;
    public final Integer b;
    public final boolean c;

    public w201(List list, Integer num, boolean z) {
        this.a = list;
        this.b = num;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w201)) {
            return false;
        }
        w201 w201Var = (w201) obj;
        return u890.j(this.a, w201Var.a) && this.b.equals(w201Var.b) && this.c == w201Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + pze0.e(this.a.hashCode() * 31, 31, this.b);
    }
}
