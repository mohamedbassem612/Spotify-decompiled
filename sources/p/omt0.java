package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class omt0 {
    public final int a;

    public omt0(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof omt0) && this.a == ((omt0) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }
}
