package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class k7f1 {
    public final h7f1 a;
    public final i7f1 b;
    public final j7f1 c;
    public final yj41 d;
    public final String e;
    public final rx7 f;
    public final String g;

    public k7f1(h7f1 h7f1Var, i7f1 i7f1Var, j7f1 j7f1Var, yj41 yj41Var, String str, rx7 rx7Var, String str2) {
        this.a = h7f1Var;
        this.b = i7f1Var;
        this.c = j7f1Var;
        this.d = yj41Var;
        this.e = str;
        this.f = rx7Var;
        this.g = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof k7f1) {
            k7f1 k7f1Var = (k7f1) obj;
            if (this.a == k7f1Var.a && this.b == k7f1Var.b && this.c == k7f1Var.c && this.d.equals(k7f1Var.d) && this.e.equals(k7f1Var.e) && u890.j(this.f, k7f1Var.f) && u890.j(this.g, k7f1Var.g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iD = cy30.d((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31, 31, this.e);
        rx7 rx7Var = this.f;
        int iHashCode = (iD + (rx7Var == null ? 0 : rx7Var.hashCode())) * 31;
        String str = this.g;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }
}
