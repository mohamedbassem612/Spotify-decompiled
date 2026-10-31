package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class u230 {
    public final boolean a;

    public u230(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u230) && this.a == ((u230) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
