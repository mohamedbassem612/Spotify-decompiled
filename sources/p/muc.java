package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class muc implements puc {
    public final int a;

    public muc(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof muc) && this.a == ((muc) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }
}
