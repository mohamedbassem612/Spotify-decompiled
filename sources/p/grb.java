package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class grb implements nrb {
    public final drb a;

    public grb(drb drbVar) {
        this.a = drbVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof grb) && u890.j(this.a, ((grb) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
