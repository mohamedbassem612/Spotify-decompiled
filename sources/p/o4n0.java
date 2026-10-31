package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class o4n0 {
    public final String a;
    public final String b;

    public o4n0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o4n0)) {
            return false;
        }
        o4n0 o4n0Var = (o4n0) obj;
        return u890.j(this.a, o4n0Var.a) && u890.j(this.b, o4n0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
