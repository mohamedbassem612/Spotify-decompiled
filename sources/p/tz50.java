package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class tz50 {
    public final String a;
    public final String b;
    public final rz50 c;

    public tz50(String str, String str2, rz50 rz50Var) {
        this.a = str;
        this.b = str2;
        this.c = rz50Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tz50)) {
            return false;
        }
        tz50 tz50Var = (tz50) obj;
        return u890.j(this.a, tz50Var.a) && this.b.equals(tz50Var.b) && u890.j(this.c, tz50Var.c);
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        rz50 rz50Var = this.c;
        return iD + (rz50Var == null ? 0 : rz50Var.hashCode());
    }
}
