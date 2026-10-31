package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class shd1 {
    public final int a;

    public shd1(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof shd1) && this.a == ((shd1) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }
}
