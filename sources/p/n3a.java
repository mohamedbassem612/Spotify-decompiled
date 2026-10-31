package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class n3a {
    public final boolean a;

    public n3a(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n3a) && this.a == ((n3a) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
