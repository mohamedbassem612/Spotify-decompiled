package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class pi60 implements qi60 {
    public final zzm a;
    public final String b;

    public pi60(zzm zzmVar) {
        this.a = zzmVar;
        this.b = zzmVar.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pi60) && u890.j(this.a, ((pi60) obj).a);
    }

    @Override // p.qi60
    public final String getKey() {
        return this.b;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
