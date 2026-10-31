package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class gzj1 {
    public final czj1 a;

    public gzj1(czj1 czj1Var) {
        this.a = czj1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gzj1) && this.a.equals(((gzj1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
