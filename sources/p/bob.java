package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class bob {
    public final String a;

    public bob(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bob) && u890.j(this.a, ((bob) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
