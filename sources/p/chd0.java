package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class chd0 implements ehd0 {
    public final int a;

    public chd0(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof chd0) && this.a == ((chd0) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }
}
