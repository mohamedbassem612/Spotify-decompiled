package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class jlv0 {
    public final String a;
    public final int b;

    public jlv0(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jlv0)) {
            return false;
        }
        jlv0 jlv0Var = (jlv0) obj;
        return this.a.equals(jlv0Var.a) && this.b == jlv0Var.b;
    }

    public final int hashCode() {
        return l1d.C(this.b) + (this.a.hashCode() * 31);
    }
}
