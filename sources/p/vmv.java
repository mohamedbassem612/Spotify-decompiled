package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class vmv implements ymv {
    public final fnv a;

    public vmv(fnv fnvVar) {
        this.a = fnvVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vmv) && this.a.equals(((vmv) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
