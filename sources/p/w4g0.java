package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class w4g0 {
    public final String a;
    public final String b;
    public final boolean c;

    public w4g0(String str, String str2, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w4g0)) {
            return false;
        }
        w4g0 w4g0Var = (w4g0) obj;
        return this.a.equals(w4g0Var.a) && this.b.equals(w4g0Var.b) && this.c == w4g0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
