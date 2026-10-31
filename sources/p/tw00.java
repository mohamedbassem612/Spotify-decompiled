package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class tw00 implements ww00 {
    public final boolean a;

    public tw00(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tw00) && this.a == ((tw00) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
