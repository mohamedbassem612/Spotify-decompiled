package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class oo50 extends po50 {
    public final int a;

    public oo50(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof oo50) && this.a == ((oo50) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }
}
