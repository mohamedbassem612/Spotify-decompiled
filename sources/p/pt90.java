package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class pt90 {
    public final String a;
    public final String b;

    public pt90(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pt90)) {
            return false;
        }
        pt90 pt90Var = (pt90) obj;
        return u890.j(this.a, pt90Var.a) && u890.j(this.b, pt90Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
