package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class zjk extends jkk {
    public final a7s0 a;

    public zjk(a7s0 a7s0Var) {
        this.a = a7s0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zjk) && this.a.equals(((zjk) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
