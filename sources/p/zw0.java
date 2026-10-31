package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class zw0 implements bx0 {
    public final int a;
    public final String b;

    public zw0(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zw0)) {
            return false;
        }
        zw0 zw0Var = (zw0) obj;
        return this.a == zw0Var.a && u890.j(this.b, zw0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }
}
