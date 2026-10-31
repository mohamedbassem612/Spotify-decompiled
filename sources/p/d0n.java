package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class d0n {
    public final zzm a;

    public d0n(zzm zzmVar) {
        this.a = zzmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d0n) && u890.j(this.a, ((d0n) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
