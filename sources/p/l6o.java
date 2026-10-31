package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class l6o {
    public final String a;

    public l6o(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l6o) && this.a.equals(((l6o) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
