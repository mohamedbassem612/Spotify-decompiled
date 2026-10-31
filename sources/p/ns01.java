package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ns01 extends vs01 {
    public final mv01 a;

    public ns01(mv01 mv01Var) {
        this.a = mv01Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ns01) && u890.j(this.a, ((ns01) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
