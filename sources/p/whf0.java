package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class whf0 implements yhf0 {
    public final boolean a;

    public whf0(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof whf0) && this.a == ((whf0) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
