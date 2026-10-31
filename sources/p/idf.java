package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class idf implements bef {
    public final String a;

    public idf(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof idf) && this.a.equals(((idf) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
