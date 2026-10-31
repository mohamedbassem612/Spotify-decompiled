package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ue91 {
    public final ef91 a;

    public ue91(ef91 ef91Var) {
        this.a = ef91Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ue91) && this.a == ((ue91) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
