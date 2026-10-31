package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class iu50 {
    public final String a;
    public final int b;

    public iu50(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iu50)) {
            return false;
        }
        iu50 iu50Var = (iu50) obj;
        return this.a.equals(iu50Var.a) && this.b == iu50Var.b;
    }

    public final int hashCode() {
        return l1d.C(this.b) + (this.a.hashCode() * 31);
    }
}
