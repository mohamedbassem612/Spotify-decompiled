package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class tvz0 {
    public final boolean a;
    public final Set b;
    public final long c;
    public final String d;

    public tvz0(boolean z, Set set, long j, String str) {
        this.a = z;
        this.b = set;
        this.c = j;
        this.d = str;
    }

    public static tvz0 a(tvz0 tvz0Var, Set set, int i) {
        boolean z = tvz0Var.a;
        if ((i & 2) != 0) {
            set = tvz0Var.b;
        }
        Set set2 = set;
        long j = (i & 4) != 0 ? tvz0Var.c : 0L;
        String str = tvz0Var.d;
        tvz0Var.getClass();
        return new tvz0(z, set2, j, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tvz0)) {
            return false;
        }
        tvz0 tvz0Var = (tvz0) obj;
        return this.a == tvz0Var.a && this.b.equals(tvz0Var.b) && this.c == tvz0Var.c && u890.j(this.d, tvz0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + cy30.f(gvg.c(Boolean.hashCode(this.a) * 31, 31, this.b), this.c, 31);
    }
}
