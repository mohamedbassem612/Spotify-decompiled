package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class bjy extends cjy {
    public final nb51 a;

    public bjy(nb51 nb51Var) {
        this.a = nb51Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bjy) && this.a.equals(((bjy) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
