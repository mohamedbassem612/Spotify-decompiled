package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class wjk extends jkk {
    public final qh51 a;

    public wjk(qh51 qh51Var) {
        this.a = qh51Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wjk) && this.a.equals(((wjk) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
