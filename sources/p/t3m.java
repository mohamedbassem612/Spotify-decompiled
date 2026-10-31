package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class t3m extends z3m {
    public final int a;
    public final int b;

    public t3m(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t3m)) {
            return false;
        }
        t3m t3mVar = (t3m) obj;
        return this.a == t3mVar.a && this.b == t3mVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }
}
