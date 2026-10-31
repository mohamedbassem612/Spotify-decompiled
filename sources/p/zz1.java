package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class zz1 {
    public final String a;
    public final c380 b;

    public zz1(String str, c380 c380Var) {
        this.a = str;
        this.b = c380Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zz1)) {
            return false;
        }
        zz1 zz1Var = (zz1) obj;
        return u890.j(this.a, zz1Var.a) && u890.j(this.b, zz1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
