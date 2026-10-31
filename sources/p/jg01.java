package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class jg01 {
    public final boolean a = true;
    public final boolean b;

    public jg01(boolean z) {
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jg01)) {
            return false;
        }
        jg01 jg01Var = (jg01) obj;
        return this.a == jg01Var.a && this.b == jg01Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }
}
