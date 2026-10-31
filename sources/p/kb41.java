package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class kb41 extends pb41 {
    public final boolean a;

    public kb41(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kb41) && this.a == ((kb41) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
