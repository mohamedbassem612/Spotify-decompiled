package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ie91 implements le91 {
    public final Throwable a;

    public ie91(Throwable th) {
        this.a = th;
    }

    @Override // p.le91
    public final String breadcrumb() {
        return i3a.j("LayoutFailed: ", this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ie91) && this.a.equals(((ie91) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
