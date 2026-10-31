package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class dwt0 implements gwt0 {
    public final String a;
    public final String b;

    public dwt0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dwt0)) {
            return false;
        }
        dwt0 dwt0Var = (dwt0) obj;
        return u890.j(this.a, dwt0Var.a) && u890.j(this.b, dwt0Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
