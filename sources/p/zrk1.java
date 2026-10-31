package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class zrk1 implements qsk1 {
    public final String a;
    public final b32 b;

    public zrk1(String str, b32 b32Var) {
        this.a = str;
        this.b = b32Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zrk1)) {
            return false;
        }
        zrk1 zrk1Var = (zrk1) obj;
        return u890.j(this.a, zrk1Var.a) && this.b.equals(zrk1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
