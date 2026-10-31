package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class zs60 extends jto1 {
    public final String b;
    public final j16 c;
    public final vr60 d;

    public zs60(String str, j16 j16Var, vr60 vr60Var) {
        this.b = str;
        this.c = j16Var;
        this.d = vr60Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zs60)) {
            return false;
        }
        zs60 zs60Var = (zs60) obj;
        return u890.j(this.b, zs60Var.b) && this.c == zs60Var.c && this.d.equals(zs60Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + (this.b.hashCode() * 31)) * 31);
    }
}
