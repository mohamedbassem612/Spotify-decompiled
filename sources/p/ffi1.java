package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ffi1 extends gfi1 {
    public final String a;
    public final String b;
    public final int c;

    public ffi1(int i, String str, String str2) {
        this.a = str;
        this.b = str2;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ffi1)) {
            return false;
        }
        ffi1 ffi1Var = (ffi1) obj;
        return this.a.equals(ffi1Var.a) && this.b.equals(ffi1Var.b) && this.c == ffi1Var.c;
    }

    public final int hashCode() {
        return l1d.C(this.c) + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
