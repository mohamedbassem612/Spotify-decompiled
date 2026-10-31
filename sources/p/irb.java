package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class irb implements nrb {
    public final drb a;

    public irb(drb drbVar) {
        this.a = drbVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof irb) && u890.j(this.a, ((irb) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
