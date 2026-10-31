package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class cl41 {
    public final hm41 a;

    public cl41(hm41 hm41Var) {
        this.a = hm41Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cl41) && this.a.equals(((cl41) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
