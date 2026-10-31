package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class fhm {
    public final rhm a;

    public fhm(rhm rhmVar) {
        this.a = rhmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fhm) && this.a.equals(((fhm) obj).a);
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }
}
