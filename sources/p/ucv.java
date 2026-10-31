package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ucv implements vcv {
    public final lia1 a;

    public ucv(lia1 lia1Var) {
        this.a = lia1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ucv) && this.a == ((ucv) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
