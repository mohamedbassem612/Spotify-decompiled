package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class eb41 extends pb41 {
    public final boolean a;

    public eb41(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof eb41) && this.a == ((eb41) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
