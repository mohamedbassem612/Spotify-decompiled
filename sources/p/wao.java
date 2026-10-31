package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class wao extends cbo {
    public final o2z a;

    public wao(o2z o2zVar) {
        this.a = o2zVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wao) && this.a.equals(((wao) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
