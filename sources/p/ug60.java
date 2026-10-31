package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ug60 {
    public final int a;

    public ug60(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ug60) && this.a == ((ug60) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }
}
