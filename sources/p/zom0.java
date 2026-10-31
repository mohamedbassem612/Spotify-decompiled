package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class zom0 {
    public final boolean a;
    public final String b;
    public final qom0 c;

    public /* synthetic */ zom0(int i) {
        this(false, null, (i & 4) != 0 ? pom0.a : mom0.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zom0)) {
            return false;
        }
        zom0 zom0Var = (zom0) obj;
        return this.a == zom0Var.a && u890.j(this.b, zom0Var.b) && u890.j(this.c, zom0Var.c);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.a) * 31;
        String str = this.b;
        return this.c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public zom0(boolean z, String str, qom0 qom0Var) {
        this.a = z;
        this.b = str;
        this.c = qom0Var;
    }
}
