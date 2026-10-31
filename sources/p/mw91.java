package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class mw91 implements ow91 {
    public final hx91 a;

    public mw91(hx91 hx91Var) {
        this.a = hx91Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mw91) && this.a.equals(((mw91) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
