package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class xv00 implements zjd1 {
    public final tka0 a;
    public final int b;

    public xv00(tka0 tka0Var) {
        this.a = tka0Var;
        this.b = tka0Var.hashCode();
    }

    @Override // p.zjd1
    public final Class a() {
        return ((wdg) this.a).n();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xv00) && u890.j(this.a, ((xv00) obj).a);
    }

    public final int hashCode() {
        return this.b;
    }

    public final String toString() {
        return f4i1.f("ExtendedMetadataTable<", this.a.r(), ">");
    }
}
