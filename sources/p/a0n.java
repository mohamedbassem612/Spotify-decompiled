package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class a0n implements c0n {
    public final zzm a;

    public a0n(zzm zzmVar) {
        this.a = zzmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a0n) && u890.j(this.a, ((a0n) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
