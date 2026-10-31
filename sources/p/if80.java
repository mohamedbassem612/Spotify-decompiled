package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class if80 extends jf80 {
    public final ef80 a;

    public if80(ef80 ef80Var) {
        this.a = ef80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof if80) && this.a == ((if80) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
