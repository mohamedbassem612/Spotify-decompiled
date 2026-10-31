package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class gu60 extends ru60 {
    public final ms60 a;

    public gu60(ms60 ms60Var) {
        this.a = ms60Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gu60) && this.a.equals(((gu60) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
