package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class zv3 extends cw3 {
    public final qu3 a;

    public zv3(qu3 qu3Var) {
        this.a = qu3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zv3) && this.a.equals(((zv3) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
