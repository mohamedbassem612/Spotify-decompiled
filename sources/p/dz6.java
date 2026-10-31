package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class dz6 {
    public final String a;
    public final String b;

    public dz6(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dz6)) {
            return false;
        }
        dz6 dz6Var = (dz6) obj;
        return u890.j(this.a, dz6Var.a) && u890.j(this.b, dz6Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
