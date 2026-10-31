package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class uzu0 {
    public final String a;

    public uzu0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uzu0) && this.a.equals(((uzu0) obj).a);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) - 1871273172;
    }
}
