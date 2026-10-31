package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class sl1 {
    public final boolean a;

    public sl1(boolean z) {
        this.a = z;
    }

    public final boolean a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sl1) && this.a == ((sl1) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
