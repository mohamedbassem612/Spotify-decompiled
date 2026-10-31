package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class ydw0 implements kew0 {
    public final boolean a;

    public ydw0(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ydw0) && this.a == ((ydw0) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
