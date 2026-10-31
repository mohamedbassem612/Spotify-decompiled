package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class acw implements liw {
    public final ti a;

    public acw(ti tiVar) {
        this.a = tiVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof acw) && this.a.equals(((acw) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
