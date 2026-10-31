package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class gdm0 {
    public final String a;
    public final String b;

    public gdm0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gdm0)) {
            return false;
        }
        gdm0 gdm0Var = (gdm0) obj;
        return this.a.equals(gdm0Var.a) && u890.j(this.b, gdm0Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
