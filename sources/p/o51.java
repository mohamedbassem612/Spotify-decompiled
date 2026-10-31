package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class o51 extends x3p1 {
    public final String c;
    public final String d;
    public final boolean e;

    public o51(String str, String str2, boolean z) {
        this.c = str;
        this.d = str2;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o51)) {
            return false;
        }
        o51 o51Var = (o51) obj;
        return u890.j(this.c, o51Var.c) && u890.j(this.d, o51Var.d) && this.e == o51Var.e;
    }

    public final int hashCode() {
        return xcg1.g(cy30.d(this.c.hashCode() * 31, 31, this.d), 31, this.e);
    }

    public final String x() {
        return this.d;
    }

    public final String y() {
        return this.c;
    }
}
