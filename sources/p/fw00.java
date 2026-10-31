package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class fw00 implements ww00 {
    public final boolean a;

    public fw00(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fw00) && this.a == ((fw00) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
