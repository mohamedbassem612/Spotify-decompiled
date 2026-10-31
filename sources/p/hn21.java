package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class hn21 {
    public final int a;
    public final boolean b;
    public final boolean c;

    public hn21(int i, boolean z, boolean z2) {
        this.a = i;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hn21)) {
            return false;
        }
        hn21 hn21Var = (hn21) obj;
        return this.a == hn21Var.a && this.b == hn21Var.b && this.c == hn21Var.c;
    }

    public final int hashCode() {
        int i = this.a;
        return Boolean.hashCode(this.c) + xcg1.g((i == 0 ? 0 : l1d.C(i)) * 31, 31, this.b);
    }
}
