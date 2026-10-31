package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class n6o {
    public final String a;

    public n6o(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n6o) && this.a.equals(((n6o) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
