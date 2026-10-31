package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class m5o0 {
    public final String a;
    public final spq0 b;

    public m5o0(String str, spq0 spq0Var) {
        this.a = str;
        this.b = spq0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m5o0)) {
            return false;
        }
        m5o0 m5o0Var = (m5o0) obj;
        return this.a.equals(m5o0Var.a) && this.b.equals(m5o0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
