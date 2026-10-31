package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class l9c1 extends n9c1 {
    public final a6c1 a;

    public l9c1(a6c1 a6c1Var) {
        this.a = a6c1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l9c1) && this.a.equals(((l9c1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
