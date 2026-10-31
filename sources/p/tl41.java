package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class tl41 implements ul41 {
    public final hm41 a;

    public tl41(hm41 hm41Var) {
        this.a = hm41Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tl41) && this.a.equals(((tl41) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
