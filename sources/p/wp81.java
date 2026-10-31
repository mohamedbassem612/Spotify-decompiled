package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class wp81 extends eq81 {
    public final boolean a;

    public wp81(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wp81) && this.a == ((wp81) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
