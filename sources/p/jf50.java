package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class jf50 {
    public final String a;
    public final boolean b;

    public jf50(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jf50)) {
            return false;
        }
        jf50 jf50Var = (jf50) obj;
        return this.a.equals(jf50Var.a) && this.b == jf50Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
