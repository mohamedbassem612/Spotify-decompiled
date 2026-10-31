package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class n1n1 extends q1n1 {
    public final q9t a;

    public n1n1(q9t q9tVar) {
        this.a = q9tVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n1n1) && this.a.equals(((n1n1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
