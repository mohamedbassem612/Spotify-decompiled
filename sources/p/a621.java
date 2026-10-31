package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class a621 {
    public final int a;

    public a621(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a621) && this.a == ((a621) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }
}
