package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class l631 {
    public final String a;

    public l631(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l631) && this.a.equals(((l631) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
