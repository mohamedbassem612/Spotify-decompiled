package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class i4f0 {
    public final String a;

    public final boolean equals(Object obj) {
        if (obj instanceof i4f0) {
            return this.a.equals(((i4f0) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return f4i1.f("LogoutRequest(deviceId=", this.a, ")");
    }
}
