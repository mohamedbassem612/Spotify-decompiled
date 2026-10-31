package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class zz7 implements c08 {
    public final String a;
    public final int b;

    public zz7(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zz7)) {
            return false;
        }
        zz7 zz7Var = (zz7) obj;
        return u890.j(this.a, zz7Var.a) && this.b == zz7Var.b;
    }

    public final int hashCode() {
        String str = this.a;
        return l1d.C(this.b) + ((str == null ? 0 : str.hashCode()) * 31);
    }
}
