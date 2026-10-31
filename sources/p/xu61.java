package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class xu61 {
    public final Object a;
    public final wu61 b;

    public xu61(Object obj, wu61 wu61Var) {
        this.a = obj;
        this.b = wu61Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xu61)) {
            return false;
        }
        xu61 xu61Var = (xu61) obj;
        return u890.j(this.a, xu61Var.a) && u890.j(this.b, xu61Var.b);
    }

    public final int hashCode() {
        Object obj = this.a;
        return this.b.hashCode() + ((obj == null ? 0 : obj.hashCode()) * 31);
    }
}
