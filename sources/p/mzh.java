package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class mzh extends uzh {
    public final i7t0 a;

    public mzh(i7t0 i7t0Var) {
        this.a = i7t0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mzh) && this.a.equals(((mzh) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
