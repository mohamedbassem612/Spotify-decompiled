package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class x1k0 implements k4k0 {
    public final String a;

    public x1k0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x1k0) && this.a.equals(((x1k0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
