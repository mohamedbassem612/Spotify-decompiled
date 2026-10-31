package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class m60 {
    public final String a;
    public final zzo1 b;

    public m60(String str, zzo1 zzo1Var) {
        this.a = str;
        this.b = zzo1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m60)) {
            return false;
        }
        m60 m60Var = (m60) obj;
        return this.a.equals(m60Var.a) && this.b.equals(m60Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
