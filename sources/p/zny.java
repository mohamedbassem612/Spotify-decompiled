package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class zny implements coy {
    public final joy a;

    public zny(joy joyVar) {
        this.a = joyVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zny) && this.a.equals(((zny) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
