package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class sm0 {
    public final String a;

    public sm0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sm0) && this.a.equals(((sm0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
