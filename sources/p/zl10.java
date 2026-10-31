package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class zl10 extends am10 {
    public final String a;
    public final boolean b;

    public zl10(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zl10)) {
            return false;
        }
        zl10 zl10Var = (zl10) obj;
        return u890.j(this.a, zl10Var.a) && this.b == zl10Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public /* synthetic */ zl10() {
        this("generate", false);
    }
}
