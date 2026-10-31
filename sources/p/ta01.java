package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ta01 {
    public final String a;
    public final boolean b;
    public final boolean c;

    public ta01(String str, boolean z, boolean z2) {
        this.a = str;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ta01)) {
            return false;
        }
        ta01 ta01Var = (ta01) obj;
        return u890.j(this.a, ta01Var.a) && this.b == ta01Var.b && this.c == ta01Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + xcg1.g(this.a.hashCode() * 31, 31, this.b);
    }
}
