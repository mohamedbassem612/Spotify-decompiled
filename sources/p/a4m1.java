package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class a4m1 extends b4m1 {
    public final tqu0 a;

    public a4m1(tqu0 tqu0Var) {
        this.a = tqu0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a4m1) && this.a.equals(((a4m1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
