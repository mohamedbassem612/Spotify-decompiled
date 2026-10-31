package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class k500 implements o700 {
    public final h290 a;

    public k500(h290 h290Var) {
        this.a = h290Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k500) && this.a.equals(((k500) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
