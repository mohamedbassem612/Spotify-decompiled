package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class q041 {
    public final String a;
    public final yk4 b;
    public final String c;

    public q041(String str, yk4 yk4Var, String str2) {
        this.a = str;
        this.b = yk4Var;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q041)) {
            return false;
        }
        q041 q041Var = (q041) obj;
        return u890.j(this.a, q041Var.a) && u890.j(this.b, q041Var.b) && u890.j(this.c, q041Var.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        yk4 yk4Var = this.b;
        int iHashCode2 = (iHashCode + (yk4Var == null ? 0 : yk4Var.hashCode())) * 31;
        String str = this.c;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }
}
