package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class h121 implements q121 {
    public final boolean a;

    public h121(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h121) && this.a == ((h121) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
