package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class aya0 {
    public final yig1 a;

    public aya0(yig1 yig1Var) {
        this.a = yig1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof aya0) && u890.j(this.a, ((aya0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
