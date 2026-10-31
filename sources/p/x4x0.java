package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class x4x0 extends i541 {
    public final String d;
    public final String e;

    public x4x0(String str, String str2) {
        this.d = str;
        this.e = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x4x0)) {
            return false;
        }
        x4x0 x4x0Var = (x4x0) obj;
        return u890.j(this.d, x4x0Var.d) && u890.j(this.e, x4x0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + (this.d.hashCode() * 31);
    }
}
