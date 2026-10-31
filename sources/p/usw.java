package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class usw implements vsw {
    public final int a;

    public usw(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof usw) && this.a == ((usw) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }
}
