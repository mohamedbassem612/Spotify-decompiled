package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class c011 implements j011 {
    public final boolean a;

    public c011(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c011) && this.a == ((c011) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
