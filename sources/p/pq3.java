package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class pq3 extends hr3 {
    public final tv80 a;

    public pq3(tv80 tv80Var) {
        this.a = tv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pq3) && this.a.equals(((pq3) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
