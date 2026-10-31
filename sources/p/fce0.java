package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class fce0 {
    public final rih1 a = rih1.a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fce0) && this.a == ((fce0) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
