package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class cf8 {
    public final String a;

    public cf8(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cf8) && this.a.equals(((cf8) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
