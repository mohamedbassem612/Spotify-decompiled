package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class fo3 extends qxd0 {
    public final int d;

    public fo3(int i) {
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fo3) && this.d == ((fo3) obj).d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d);
    }
}
