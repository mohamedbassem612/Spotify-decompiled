package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class n121 implements q121 {
    public final String a;
    public final boolean b;
    public final boolean c;

    public n121(String str, boolean z, boolean z2) {
        this.a = str;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n121)) {
            return false;
        }
        n121 n121Var = (n121) obj;
        return u890.j(this.a, n121Var.a) && this.b == n121Var.b && this.c == n121Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + xcg1.g(this.a.hashCode() * 31, 31, this.b);
    }
}
