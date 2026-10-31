package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class c2a1 implements m2a1 {
    public final gon a;

    public c2a1(gon gonVar) {
        this.a = gonVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c2a1) && u890.j(this.a, ((c2a1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
