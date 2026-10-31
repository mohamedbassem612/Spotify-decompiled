package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class n2h0 implements e4h0 {
    public final zzm a;

    public n2h0(zzm zzmVar) {
        this.a = zzmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n2h0) && u890.j(this.a, ((n2h0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
