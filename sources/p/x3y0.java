package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class x3y0 implements y3y0 {
    public final tv80 a;

    public x3y0(tv80 tv80Var) {
        this.a = tv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x3y0) && this.a.equals(((x3y0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
