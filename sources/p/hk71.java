package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class hk71 extends jk71 {
    public final int a;

    public hk71(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hk71) && this.a == ((hk71) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }
}
