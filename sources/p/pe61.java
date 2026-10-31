package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class pe61 implements cf61 {
    public final String a;

    public pe61(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pe61) && u890.j(this.a, ((pe61) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
