package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class h51 extends x3p1 {
    public final String c;
    public final String d;

    public h51(String str, String str2) {
        this.c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h51)) {
            return false;
        }
        h51 h51Var = (h51) obj;
        return u890.j(this.c, h51Var.c) && u890.j(this.d, h51Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + (this.c.hashCode() * 31);
    }

    public final String x() {
        return this.d;
    }

    public final String y() {
        return this.c;
    }
}
