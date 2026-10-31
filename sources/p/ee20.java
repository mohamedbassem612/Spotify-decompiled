package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ee20 {
    public final yd20 a;

    public ee20(yd20 yd20Var) {
        this.a = yd20Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ee20) && u890.j(this.a, ((ee20) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
