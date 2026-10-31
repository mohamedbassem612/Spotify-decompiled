package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class hu1 implements iu1 {
    public final vo1 a;

    public hu1(vo1 vo1Var) {
        this.a = vo1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hu1) && this.a.equals(((hu1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
