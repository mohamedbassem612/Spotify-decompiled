package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class yqv0 implements erv0 {
    public final boolean a;

    public yqv0(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yqv0) && this.a == ((yqv0) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
