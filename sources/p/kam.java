package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class kam {
    public final long a = lam.a.incrementAndGet();
    public final vzj b;

    public kam(vzj vzjVar) {
        this.b = vzjVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kam)) {
            return false;
        }
        kam kamVar = (kam) obj;
        return this.a == kamVar.a && this.b.equals(kamVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }
}
