package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class jc80 {
    public final ji0 a;

    public jc80(ji0 ji0Var) {
        this.a = ji0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jc80) && u890.j(this.a, ((jc80) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
