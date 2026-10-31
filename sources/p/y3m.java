package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class y3m extends z3m {
    public final String a;

    public y3m(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y3m) && u890.j(this.a, ((y3m) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
