package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class od11 {
    public final String a;
    public final String b;

    public od11(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof od11)) {
            return false;
        }
        od11 od11Var = (od11) obj;
        return u890.j(this.a, od11Var.a) && u890.j(this.b, od11Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
