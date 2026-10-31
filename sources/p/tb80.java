package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class tb80 {
    public final String a;
    public final List b;
    public final int c;
    public final int d;

    public tb80(String str, int i, int i2, List list) {
        this.a = str;
        this.b = list;
        this.c = i;
        this.d = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tb80)) {
            return false;
        }
        tb80 tb80Var = (tb80) obj;
        return this.a.equals(tb80Var.a) && this.b.equals(tb80Var.b) && this.c == tb80Var.c && this.d == tb80Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + kaa0.f(this.c, f4i1.b(this.a.hashCode() * 31, 31, this.b), 31);
    }
}
