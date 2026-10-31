package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class bv80 extends z47 {
    public final String g;
    public final String h;
    public final int i;

    public bv80(int i, String str, String str2) {
        this.g = str;
        this.h = str2;
        this.i = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bv80)) {
            return false;
        }
        bv80 bv80Var = (bv80) obj;
        return u890.j(this.g, bv80Var.g) && u890.j(this.h, bv80Var.h) && this.i == bv80Var.i;
    }

    public final int hashCode() {
        String str = this.g;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.h;
        return Integer.hashCode(this.i) + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String x() {
        return this.g;
    }

    public final String y() {
        return this.h;
    }

    public final int z() {
        return this.i;
    }
}
