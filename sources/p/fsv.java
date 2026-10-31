package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class fsv implements usv {
    public final esv a;

    public fsv(esv esvVar) {
        this.a = esvVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fsv) && this.a.equals(((fsv) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
