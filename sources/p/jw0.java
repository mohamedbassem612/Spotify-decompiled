package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class jw0 {
    public final iw0 a;
    public final boolean b;

    public jw0(iw0 iw0Var, boolean z) {
        this.a = iw0Var;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jw0)) {
            return false;
        }
        jw0 jw0Var = (jw0) obj;
        return this.a.equals(jw0Var.a) && this.b == jw0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
