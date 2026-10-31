package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class jjb0 {
    public final ji0 a;
    public final String b;

    public jjb0(String str, ji0 ji0Var) {
        this.a = ji0Var;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jjb0)) {
            return false;
        }
        jjb0 jjb0Var = (jjb0) obj;
        return this.a.equals(jjb0Var.a) && this.b.equals(jjb0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
