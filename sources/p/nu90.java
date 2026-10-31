package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class nu90 {
    public final String a;
    public final int b;
    public final boolean c;

    public nu90(String str, int i, boolean z) {
        this.a = str;
        this.b = i;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nu90)) {
            return false;
        }
        nu90 nu90Var = (nu90) obj;
        return u890.j(this.a, nu90Var.a) && this.b == nu90Var.b && this.c == nu90Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + kaa0.f(this.b, this.a.hashCode() * 31, 31);
    }
}
