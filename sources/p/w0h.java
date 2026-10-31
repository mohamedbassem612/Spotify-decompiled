package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class w0h {
    public final boolean a;

    public w0h(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w0h) && this.a == ((w0h) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
