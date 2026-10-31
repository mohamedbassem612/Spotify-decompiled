package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class l7m {
    public final String a;

    public l7m(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l7m) && this.a.equals(((l7m) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
