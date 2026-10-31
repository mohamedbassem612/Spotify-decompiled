package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class v2h1 extends d3h1 {
    public final int b;

    public v2h1(int i) {
        super("visibility");
        this.b = i;
    }

    @Override // p.d3h1
    public final String a() {
        return String.valueOf(this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v2h1) && this.b == ((v2h1) obj).b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b);
    }
}
