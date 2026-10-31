package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ckk extends jkk {
    public final tje1 a;

    public ckk(tje1 tje1Var) {
        this.a = tje1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ckk) && this.a.equals(((ckk) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
