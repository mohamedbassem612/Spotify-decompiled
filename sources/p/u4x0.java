package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class u4x0 extends i541 {
    public final String d;
    public final String e;

    public u4x0(String str, String str2) {
        this.d = str;
        this.e = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u4x0)) {
            return false;
        }
        u4x0 u4x0Var = (u4x0) obj;
        return u890.j(this.d, u4x0Var.d) && u890.j(this.e, u4x0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + (this.d.hashCode() * 31);
    }
}
