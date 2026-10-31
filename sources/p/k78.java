package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class k78 {
    public final boolean a;

    public k78(boolean z) {
        this.a = z;
    }

    public final boolean a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k78) && this.a == ((k78) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
