package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class io1 implements ko1 {
    public final boolean a;

    public io1(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof io1) && this.a == ((io1) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
