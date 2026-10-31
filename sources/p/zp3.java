package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class zp3 extends hr3 {
    public final String a;
    public final n6c0 b;

    public zp3(String str, n6c0 n6c0Var) {
        this.a = str;
        this.b = n6c0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zp3)) {
            return false;
        }
        zp3 zp3Var = (zp3) obj;
        return u890.j(this.a, zp3Var.a) && u890.j(this.b, zp3Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
