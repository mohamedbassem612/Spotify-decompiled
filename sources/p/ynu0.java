package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class ynu0 {
    public final String a;
    public final String b;
    public final a601 c;

    public ynu0(String str, String str2, a601 a601Var) {
        this.a = str;
        this.b = str2;
        this.c = a601Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ynu0) {
            ynu0 ynu0Var = (ynu0) obj;
            return u890.j(this.a, ynu0Var.a) && u890.j(this.b, ynu0Var.b) && this.c == ynu0Var.c;
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
