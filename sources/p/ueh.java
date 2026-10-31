package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class ueh implements afh {
    public final String a;

    public ueh(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ueh) && this.a.equals(((ueh) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
