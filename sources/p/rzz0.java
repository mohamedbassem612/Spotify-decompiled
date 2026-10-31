package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class rzz0 implements uzz0 {
    public final boolean a;

    public rzz0(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rzz0) && this.a == ((rzz0) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
