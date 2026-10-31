package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class v3m1 extends b4m1 {
    public final gzl1 a;

    public v3m1(gzl1 gzl1Var) {
        this.a = gzl1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v3m1) && this.a == ((v3m1) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
