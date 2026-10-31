package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class bo7 {
    public final String a;
    public final boolean b;
    public final int c;

    public bo7(String str, int i, boolean z) {
        this.a = str;
        this.b = z;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bo7)) {
            return false;
        }
        bo7 bo7Var = (bo7) obj;
        return this.a.equals(bo7Var.a) && this.b == bo7Var.b && this.c == bo7Var.c;
    }

    public final int hashCode() {
        return l1d.C(this.c) + xcg1.g(this.a.hashCode() * 31, 31, this.b);
    }
}
