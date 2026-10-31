package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class wi60 implements zi60 {
    public final boolean a;

    public wi60(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wi60) && this.a == ((wi60) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
