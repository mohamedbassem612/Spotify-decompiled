package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class l4x0 extends i541 {
    public final String d;
    public final String e;

    public l4x0(String str, String str2) {
        this.d = str;
        this.e = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l4x0)) {
            return false;
        }
        l4x0 l4x0Var = (l4x0) obj;
        return u890.j(this.d, l4x0Var.d) && u890.j(this.e, l4x0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + (this.d.hashCode() * 31);
    }
}
