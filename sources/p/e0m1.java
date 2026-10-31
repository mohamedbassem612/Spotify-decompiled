package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class e0m1 implements g0m1 {
    public final seo a;

    public e0m1(seo seoVar) {
        this.a = seoVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e0m1) && this.a.equals(((e0m1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
