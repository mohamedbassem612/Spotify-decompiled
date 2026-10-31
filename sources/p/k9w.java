package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class k9w implements liw {
    public final j9w a;

    public k9w(j9w j9wVar) {
        this.a = j9wVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k9w) && this.a.equals(((k9w) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
