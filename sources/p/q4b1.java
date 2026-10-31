package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class q4b1 {
    public final String a;
    public final String b;

    public q4b1(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q4b1)) {
            return false;
        }
        q4b1 q4b1Var = (q4b1) obj;
        return u890.j(this.a, q4b1Var.a) && u890.j(this.b, q4b1Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
