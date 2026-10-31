package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class dw71 {
    public final boolean a;
    public final String b;
    public final int c;

    public dw71(String str, int i, boolean z) {
        this.a = z;
        this.b = str;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dw71)) {
            return false;
        }
        dw71 dw71Var = (dw71) obj;
        return this.a == dw71Var.a && this.b.equals(dw71Var.b) && this.c == dw71Var.c;
    }

    public final int hashCode() {
        return l1d.C(this.c) + cy30.d(Boolean.hashCode(this.a) * 31, 31, this.b);
    }
}
