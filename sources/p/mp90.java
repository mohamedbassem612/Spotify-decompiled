package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class mp90 {
    public final String a;

    public final boolean equals(Object obj) {
        if (obj instanceof mp90) {
            return u890.j(this.a, ((mp90) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return f4i1.f("SocialRadarBroadcastToken(value=", this.a, ")");
    }
}
