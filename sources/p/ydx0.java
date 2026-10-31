package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ydx0 {
    public final String a;
    public final String b;

    public ydx0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ydx0)) {
            return false;
        }
        ydx0 ydx0Var = (ydx0) obj;
        return this.a.equals(ydx0Var.a) && u890.j(this.b, ydx0Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
