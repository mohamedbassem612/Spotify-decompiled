package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class iy00 {
    public final String a;
    public final boolean b;
    public final List c;

    public iy00(String str, List list, boolean z) {
        this.a = str;
        this.b = z;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iy00)) {
            return false;
        }
        iy00 iy00Var = (iy00) obj;
        return u890.j(this.a, iy00Var.a) && this.b == iy00Var.b && this.c.equals(iy00Var.c);
    }

    public final int hashCode() {
        String str = this.a;
        return this.c.hashCode() + xcg1.g((str == null ? 0 : str.hashCode()) * 31, 31, this.b);
    }
}
