package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class b0n implements c0n {
    public final zzm a;

    public b0n(zzm zzmVar) {
        this.a = zzmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b0n) && u890.j(this.a, ((b0n) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
