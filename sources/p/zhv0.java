package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class zhv0 extends biv0 {
    public final ok1 a;

    public zhv0(ok1 ok1Var) {
        this.a = ok1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zhv0) && this.a.equals(((zhv0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
