package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class p3a1 implements r3a1 {
    public final gon a;

    public p3a1(gon gonVar) {
        this.a = gonVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p3a1) && u890.j(this.a, ((p3a1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
