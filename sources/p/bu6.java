package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class bu6 {
    public final String a;
    public final String b;

    public bu6(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bu6)) {
            return false;
        }
        bu6 bu6Var = (bu6) obj;
        return u890.j(this.a, bu6Var.a) && u890.j(this.b, bu6Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return Boolean.hashCode(false) + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }
}
