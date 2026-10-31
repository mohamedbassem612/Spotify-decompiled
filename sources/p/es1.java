package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class es1 implements bt1 {
    public final cwo a;

    public es1(cwo cwoVar) {
        this.a = cwoVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof es1) && this.a.equals(((es1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
