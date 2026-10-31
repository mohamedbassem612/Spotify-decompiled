package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class swz implements k700 {
    public final van a;

    public swz(van vanVar) {
        this.a = vanVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof swz) && u890.j(this.a, ((swz) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
