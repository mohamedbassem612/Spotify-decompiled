package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class gty0 {
    public final boolean a;

    public gty0(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gty0) && this.a == ((gty0) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
