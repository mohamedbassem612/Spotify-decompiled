package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class um6 implements xm6 {
    public final int a;
    public final int b;
    public final String c;
    public final int d;
    public final List e;

    public um6(int i, int i2, int i3, String str, List list) {
        this.a = i;
        this.b = i2;
        this.c = str;
        this.d = i3;
        this.e = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof um6)) {
            return false;
        }
        um6 um6Var = (um6) obj;
        return this.a == um6Var.a && this.b == um6Var.b && u890.j(this.c, um6Var.c) && this.d == um6Var.d && this.e.equals(um6Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + kaa0.f(this.d, cy30.d(kaa0.f(this.b, Integer.hashCode(this.a) * 31, 31), 31, this.c), 31);
    }
}
