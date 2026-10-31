package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class fzh extends uzh {
    public final d5a a;

    public fzh(d5a d5aVar) {
        this.a = d5aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fzh) && this.a.equals(((fzh) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
