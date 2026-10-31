package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class iji0 {
    public final String a;
    public final String b;

    public iji0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iji0)) {
            return false;
        }
        iji0 iji0Var = (iji0) obj;
        return this.a.equals(iji0Var.a) && this.b.equals(iji0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
