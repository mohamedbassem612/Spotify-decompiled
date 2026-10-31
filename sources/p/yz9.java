package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class yz9 extends zz9 {
    public final int a;

    public yz9(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yz9) && this.a == ((yz9) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }
}
