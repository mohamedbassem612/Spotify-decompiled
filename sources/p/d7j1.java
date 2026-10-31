package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class d7j1 {
    public final boolean a;

    public d7j1(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d7j1) && this.a == ((d7j1) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
