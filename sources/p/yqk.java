package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class yqk {
    public final k7r a;

    public yqk(k7r k7rVar) {
        this.a = k7rVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yqk) && this.a.equals(((yqk) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
