package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class nvk {
    public final sxk a;

    public nvk(sxk sxkVar) {
        this.a = sxkVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nvk) && u890.j(this.a, ((nvk) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
