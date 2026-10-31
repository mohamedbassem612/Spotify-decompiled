package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class qdq0 implements ceq0 {
    public final ept a;

    public qdq0(ept eptVar) {
        this.a = eptVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qdq0) && this.a.equals(((qdq0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
