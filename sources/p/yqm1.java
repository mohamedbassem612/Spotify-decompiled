package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class yqm1 extends arm1 {
    public final pr61 a;

    public yqm1(pr61 pr61Var) {
        this.a = pr61Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yqm1) && this.a.equals(((yqm1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
