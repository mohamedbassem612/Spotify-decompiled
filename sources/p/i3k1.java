package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class i3k1 {
    public final String a;
    public final boolean b;
    public final int c;

    public i3k1(String str, int i) {
        str = (i & 1) != 0 ? "" : str;
        boolean z = (i & 2) != 0;
        int i2 = (i & 4) == 0 ? 2 : 1;
        this.a = str;
        this.b = z;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i3k1)) {
            return false;
        }
        i3k1 i3k1Var = (i3k1) obj;
        return this.a.equals(i3k1Var.a) && this.b == i3k1Var.b && this.c == i3k1Var.c;
    }

    public final int hashCode() {
        return l1d.C(this.c) + xcg1.g(this.a.hashCode() * 31, 31, this.b);
    }
}
