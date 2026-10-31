package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class x620 implements z620 {
    public final qa20 a;

    public x620(qa20 qa20Var) {
        this.a = qa20Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x620) && this.a.equals(((x620) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
