package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class rev {
    public final lp9 a;
    public final float b;
    public final boolean c;

    public rev(lp9 lp9Var, float f, boolean z) {
        this.a = lp9Var;
        this.b = f;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rev)) {
            return false;
        }
        rev revVar = (rev) obj;
        return u890.j(this.a, revVar.a) && Float.compare(this.b, revVar.b) == 0 && this.c == revVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + x0d.f(this.a.hashCode() * 31, 31, this.b);
    }
}
