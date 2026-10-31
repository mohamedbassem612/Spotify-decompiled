package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class dxd0 implements rxd0 {
    public final String a;
    public final String b;

    public dxd0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dxd0)) {
            return false;
        }
        dxd0 dxd0Var = (dxd0) obj;
        return this.a.equals(dxd0Var.a) && u890.j(this.b, dxd0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
