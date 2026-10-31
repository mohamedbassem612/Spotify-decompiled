package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class w3m extends z3m {
    public final int a;

    public w3m(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w3m) && this.a == ((w3m) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }
}
