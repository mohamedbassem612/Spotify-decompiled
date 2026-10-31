package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class irc1 {
    public final String a;

    public final boolean equals(Object obj) {
        if (obj instanceof irc1) {
            return this.a.equals(((irc1) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return f4i1.f("SubtitleUrl(value=", this.a, ")");
    }
}
