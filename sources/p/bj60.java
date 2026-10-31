package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class bj60 {
    public final d8r0 a;

    public bj60(d8r0 d8r0Var) {
        this.a = d8r0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bj60) && this.a.equals(((bj60) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
