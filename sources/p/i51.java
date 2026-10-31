package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class i51 extends x3p1 {
    public final String c;
    public final String d;
    public final bk8 e;

    public i51(String str, String str2, bk8 bk8Var) {
        this.c = str;
        this.d = str2;
        this.e = bk8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i51)) {
            return false;
        }
        i51 i51Var = (i51) obj;
        return this.c.equals(i51Var.c) && this.d.equals(i51Var.d) && this.e == i51Var.e;
    }

    public final int hashCode() {
        int iD = cy30.d(this.c.hashCode() * 31, 31, this.d);
        bk8 bk8Var = this.e;
        return iD + (bk8Var == null ? 0 : bk8Var.hashCode());
    }

    public final bk8 x() {
        return this.e;
    }

    public final String y() {
        return this.d;
    }

    public final String z() {
        return this.c;
    }
}
