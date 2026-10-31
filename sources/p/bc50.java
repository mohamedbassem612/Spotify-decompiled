package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class bc50 implements fc50 {
    public final boolean a;

    public bc50(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bc50) && this.a == ((bc50) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
