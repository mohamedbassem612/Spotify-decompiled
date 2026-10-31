package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class wp60 implements cq60 {
    public final boolean a;

    public wp60(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wp60) && this.a == ((wp60) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
