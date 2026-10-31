package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class a1a1 extends q1a1 {
    public final gon a;

    public a1a1(gon gonVar) {
        this.a = gonVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a1a1) && u890.j(this.a, ((a1a1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
