package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ztd0 extends gud0 {
    public final boolean a;

    public ztd0(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ztd0) && this.a == ((ztd0) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
