package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class h7o {
    public final String a;

    public h7o(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h7o) && this.a.equals(((h7o) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
