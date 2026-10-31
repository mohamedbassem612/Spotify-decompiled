package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class v1g1 {
    public final h290 a;

    public v1g1(h290 h290Var) {
        this.a = h290Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v1g1) && this.a.equals(((v1g1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
