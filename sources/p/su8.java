package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class su8 implements tu8 {
    public final int a;

    public su8(int i) {
        this.a = i;
    }

    public final int a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof su8) && this.a == ((su8) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }
}
