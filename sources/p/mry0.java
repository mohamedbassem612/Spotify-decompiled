package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class mry0 implements sry0 {
    public final boolean a;

    public mry0(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mry0) && this.a == ((mry0) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
