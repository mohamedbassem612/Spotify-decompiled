package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class rzu0 {
    public final int a;

    public rzu0(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rzu0) && this.a == ((rzu0) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }
}
