package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class l0e0 {
    public final String a;
    public final String b;
    public final boolean c;

    public l0e0(String str, String str2, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l0e0)) {
            return false;
        }
        l0e0 l0e0Var = (l0e0) obj;
        return this.a.equals(l0e0Var.a) && this.b.equals(l0e0Var.b) && this.c == l0e0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
