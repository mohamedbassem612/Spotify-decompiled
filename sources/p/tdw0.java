package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class tdw0 implements kew0 {
    public final hwt a;

    public tdw0(hwt hwtVar) {
        this.a = hwtVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tdw0) && u890.j(this.a, ((tdw0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
