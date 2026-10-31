package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class oym0 implements pym0 {
    public final int a;

    public oym0(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof oym0) && this.a == ((oym0) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }
}
