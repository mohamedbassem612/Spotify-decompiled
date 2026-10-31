package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class nhw implements diw {
    public final van a;

    public nhw(van vanVar) {
        this.a = vanVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nhw) && u890.j(this.a, ((nhw) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
