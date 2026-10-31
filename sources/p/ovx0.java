package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ovx0 extends qvx0 {
    public final boolean a;

    public ovx0(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ovx0) && this.a == ((ovx0) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
