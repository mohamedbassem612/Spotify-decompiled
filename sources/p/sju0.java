package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class sju0 implements tju0 {
    public final int a;

    public sju0(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sju0) && this.a == ((sju0) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }
}
