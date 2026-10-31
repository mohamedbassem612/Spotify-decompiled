package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class zsi0 implements nbj1 {
    public final vcm a;

    public zsi0(vcm vcmVar) {
        this.a = vcmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zsi0) && this.a == ((zsi0) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
