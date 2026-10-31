package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class crf0 implements drf0 {
    public final vhc0 a;
    public final boolean b;

    public crf0(vhc0 vhc0Var, boolean z) {
        this.a = vhc0Var;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof crf0)) {
            return false;
        }
        crf0 crf0Var = (crf0) obj;
        return this.a.equals(crf0Var.a) && this.b == crf0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Integer.hashCode(this.a.a) * 31);
    }
}
