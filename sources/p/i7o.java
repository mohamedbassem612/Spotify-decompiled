package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class i7o {
    public final String a;

    public i7o(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i7o) && this.a.equals(((i7o) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
