package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class tcc0 {
    public final String a;
    public final String b;
    public final boolean c;

    public tcc0(String str, String str2, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tcc0)) {
            return false;
        }
        tcc0 tcc0Var = (tcc0) obj;
        return u890.j(this.a, tcc0Var.a) && u890.j(this.b, tcc0Var.b) && this.c == tcc0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
