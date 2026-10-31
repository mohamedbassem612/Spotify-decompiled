package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class w101 implements z101 {
    public final k101 a;

    public w101(k101 k101Var) {
        this.a = k101Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w101) && this.a.equals(((w101) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
