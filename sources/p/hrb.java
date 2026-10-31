package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class hrb implements nrb {
    public final drb a;

    public hrb(drb drbVar) {
        this.a = drbVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hrb) && u890.j(this.a, ((hrb) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
