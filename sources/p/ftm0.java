package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ftm0 implements itm0 {
    public final jtm0 a;
    public final int b;

    public ftm0(jtm0 jtm0Var, int i) {
        this.a = jtm0Var;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ftm0)) {
            return false;
        }
        ftm0 ftm0Var = (ftm0) obj;
        return this.a.equals(ftm0Var.a) && this.b == ftm0Var.b;
    }

    public final int hashCode() {
        return l1d.C(this.b) + (this.a.hashCode() * 31);
    }
}
