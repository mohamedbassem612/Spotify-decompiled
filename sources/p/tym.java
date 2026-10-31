package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class tym implements wym {
    public final boolean a;

    public tym(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tym) && this.a == ((tym) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
