package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class gpy0 {
    public final boolean a;

    public gpy0(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gpy0) && this.a == ((gpy0) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
