package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ysn implements atn {
    public final int a;

    public ysn(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ysn) && this.a == ((ysn) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }
}
