package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ax50 implements bx50 {
    public final int a;

    public ax50(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ax50) && this.a == ((ax50) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }
}
