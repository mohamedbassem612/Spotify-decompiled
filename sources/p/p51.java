package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class p51 extends x3p1 {
    public final String c;
    public final String d;
    public final bk8 e;

    public p51(String str, String str2, bk8 bk8Var) {
        this.c = str;
        this.d = str2;
        this.e = bk8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p51)) {
            return false;
        }
        p51 p51Var = (p51) obj;
        return u890.j(this.c, p51Var.c) && u890.j(this.d, p51Var.d) && this.e == p51Var.e;
    }

    public final int hashCode() {
        int iD = cy30.d(this.c.hashCode() * 31, 31, this.d);
        bk8 bk8Var = this.e;
        return iD + (bk8Var == null ? 0 : bk8Var.hashCode());
    }

    public final String x() {
        return this.d;
    }

    public final String y() {
        return this.c;
    }
}
