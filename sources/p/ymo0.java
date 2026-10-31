package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ymo0 extends ejo1 {
    public final String d;
    public final int e;

    public ymo0(String str, int i) {
        this.d = str;
        this.e = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ymo0)) {
            return false;
        }
        ymo0 ymo0Var = (ymo0) obj;
        return u890.j(this.d, ymo0Var.d) && this.e == ymo0Var.e;
    }

    public final int hashCode() {
        return l1d.C(this.e) + (this.d.hashCode() * 31);
    }

    public final String x() {
        return this.d;
    }

    public final int y() {
        return this.e;
    }
}
