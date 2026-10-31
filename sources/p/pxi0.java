package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class pxi0 {
    public final String a;
    public final String b;
    public final boolean c;

    public pxi0(String str, String str2, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pxi0)) {
            return false;
        }
        pxi0 pxi0Var = (pxi0) obj;
        return u890.j(this.a, pxi0Var.a) && u890.j(this.b, pxi0Var.b) && this.c == pxi0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
