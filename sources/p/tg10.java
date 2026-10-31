package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class tg10 {
    public final Object a;
    public final j2i b;

    public tg10(wr91 wr91Var, j2i j2iVar) {
        this.a = wr91Var;
        this.b = j2iVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof tg10) {
            tg10 tg10Var = (tg10) obj;
            return u890.j(this.a, tg10Var.a) && this.b == tg10Var.b;
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.a;
        return this.b.hashCode() + ((obj == null ? 0 : obj.hashCode()) * 31);
    }

    public final String toString() {
        return "FadeInFadeOutAnimationItem(key=" + this.a + ", transition=" + this.b + ')';
    }
}
