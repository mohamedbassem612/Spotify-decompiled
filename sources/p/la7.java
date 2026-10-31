package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class la7 implements za7 {
    public final fwq a;

    public la7(fwq fwqVar) {
        this.a = fwqVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof la7) && this.a.equals(((la7) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
