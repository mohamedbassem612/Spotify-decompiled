package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class eta {
    public final String a;

    public eta(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof eta) && this.a.equals(((eta) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
