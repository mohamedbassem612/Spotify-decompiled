package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class bm9 {
    public final String a;
    public final boolean b;
    public final boolean c;

    public bm9(String str, boolean z, boolean z2) {
        this.a = str;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bm9)) {
            return false;
        }
        bm9 bm9Var = (bm9) obj;
        return u890.j(this.a, bm9Var.a) && this.b == bm9Var.b && this.c == bm9Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + xcg1.g(this.a.hashCode() * 31, 31, this.b);
    }
}
