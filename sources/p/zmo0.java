package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class zmo0 extends ejo1 {
    public final String d;
    public final int e;

    public zmo0(String str, int i) {
        this.d = str;
        this.e = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zmo0)) {
            return false;
        }
        zmo0 zmo0Var = (zmo0) obj;
        return u890.j(this.d, zmo0Var.d) && this.e == zmo0Var.e;
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
