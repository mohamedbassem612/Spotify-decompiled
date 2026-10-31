package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class j51 extends x3p1 {
    public final String c;
    public final String d;

    public j51(String str, String str2) {
        this.c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j51)) {
            return false;
        }
        j51 j51Var = (j51) obj;
        return this.c.equals(j51Var.c) && this.d.equals(j51Var.d);
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
