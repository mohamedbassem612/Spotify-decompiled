package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class tba0 implements vba0 {
    public final String a;
    public final String b;
    public final boolean c;

    public tba0(String str, String str2, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tba0)) {
            return false;
        }
        tba0 tba0Var = (tba0) obj;
        return this.a.equals(tba0Var.a) && u890.j(this.b, tba0Var.b) && this.c == tba0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
