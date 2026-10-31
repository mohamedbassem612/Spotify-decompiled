package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class lyh1 implements nyh1 {
    public final uzh1 a;

    public lyh1(uzh1 uzh1Var) {
        this.a = uzh1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lyh1) && u890.j(this.a, ((lyh1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
