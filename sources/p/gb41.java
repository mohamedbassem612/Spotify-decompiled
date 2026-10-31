package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class gb41 extends pb41 {
    public final boolean a;

    public gb41(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gb41) && this.a == ((gb41) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
