package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class gbd {
    public final ebd a;

    public gbd(ebd ebdVar) {
        this.a = ebdVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gbd) && this.a.equals(((gbd) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
