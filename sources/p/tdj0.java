package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class tdj0 extends ydj0 {
    public final boolean a;

    public tdj0(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tdj0) && this.a == ((tdj0) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
