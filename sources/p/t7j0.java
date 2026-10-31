package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class t7j0 {
    public final boolean a;

    public t7j0(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t7j0) && this.a == ((t7j0) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
