package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class l050 extends n050 {
    public final g250 a;

    public l050(g250 g250Var) {
        this.a = g250Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l050) && this.a.equals(((l050) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
