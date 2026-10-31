package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class b20 {
    public final String a;
    public final y10 b;
    public final int c;

    public b20(String str, y10 y10Var, int i) {
        this.a = str;
        this.b = y10Var;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b20)) {
            return false;
        }
        b20 b20Var = (b20) obj;
        if (!u890.j(this.a, b20Var.a) || !u890.j(this.b, b20Var.b)) {
            return false;
        }
        int i = b20Var.c;
        int i2 = this.c;
        if (i2 == 0) {
            return i == 0;
        }
        return i != 0 && i2 == i;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        y10 y10Var = this.b;
        int iHashCode2 = (iHashCode + (y10Var == null ? 0 : Boolean.hashCode(y10Var.a))) * 31;
        int i = this.c;
        return iHashCode2 + (i != 0 ? l1d.C(i) : 0);
    }
}
