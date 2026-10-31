package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class akk extends jkk {
    public final lvt0 a;

    public akk(lvt0 lvt0Var) {
        this.a = lvt0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof akk) && this.a.equals(((akk) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
