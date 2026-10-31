package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class a1h {
    public final String a;

    public a1h(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a1h) && this.a.equals(((a1h) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
