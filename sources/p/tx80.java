package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class tx80 {
    public final String a;
    public final boolean b;
    public final boolean c;

    public tx80(String str, boolean z, boolean z2) {
        this.a = str;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tx80)) {
            return false;
        }
        tx80 tx80Var = (tx80) obj;
        return u890.j(this.a, tx80Var.a) && this.b == tx80Var.b && this.c == tx80Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + xcg1.g(this.a.hashCode() * 31, 31, this.b);
    }
}
