package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class j1n1 extends q1n1 {
    public final smo1 a;

    public j1n1(smo1 smo1Var) {
        this.a = smo1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j1n1) && this.a.equals(((j1n1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
