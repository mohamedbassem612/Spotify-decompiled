package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class o1i1 {
    public final String a;
    public final String b;

    public o1i1(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o1i1)) {
            return false;
        }
        o1i1 o1i1Var = (o1i1) obj;
        return u890.j(this.a, o1i1Var.a) && this.b.equals(o1i1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
