package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class au60 extends ru60 {
    public final q47 a;

    public au60(q47 q47Var) {
        this.a = q47Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof au60) && this.a.equals(((au60) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
