package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class gch1 {
    public final String a;
    public final String b;

    public gch1(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gch1)) {
            return false;
        }
        gch1 gch1Var = (gch1) obj;
        return u890.j(this.a, gch1Var.a) && u890.j(this.b, gch1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
