package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class apq0 extends i541 {
    public final int d;
    public final boolean e;

    public apq0(int i, boolean z) {
        this.d = i;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof apq0)) {
            return false;
        }
        apq0 apq0Var = (apq0) obj;
        return this.d == apq0Var.d && this.e == apq0Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + (Integer.hashCode(this.d) * 31);
    }
}
