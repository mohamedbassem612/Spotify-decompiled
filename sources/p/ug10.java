package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ug10 {
    public final Object a;
    public final j2i b;

    public ug10(xr91 xr91Var, j2i j2iVar) {
        this.a = xr91Var;
        this.b = j2iVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ug10) {
            ug10 ug10Var = (ug10) obj;
            return u890.j(this.a, ug10Var.a) && this.b == ug10Var.b;
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.a;
        return this.b.hashCode() + ((obj == null ? 0 : obj.hashCode()) * 31);
    }

    public final String toString() {
        return "FadeInFadeOutAnimationItem(key=" + this.a + ", transition=" + this.b + ")";
    }
}
