package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class vre1 extends ese1 {
    public final int a;

    public vre1(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vre1) && this.a == ((vre1) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }
}
