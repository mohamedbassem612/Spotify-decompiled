package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class zni0 implements doi0 {
    public final fru a;

    public zni0(fru fruVar) {
        this.a = fruVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zni0) && this.a.equals(((zni0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
