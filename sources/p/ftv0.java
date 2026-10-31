package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class ftv0 {
    public final etv0 a;
    public final int b;

    public ftv0(etv0 etv0Var, int i) {
        this.a = etv0Var;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ftv0)) {
            return false;
        }
        ftv0 ftv0Var = (ftv0) obj;
        return this.a.equals(ftv0Var.a) && this.b == ftv0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
