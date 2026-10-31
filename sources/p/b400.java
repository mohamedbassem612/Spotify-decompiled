package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class b400 implements w600 {
    public final qtf1 a;

    public b400(qtf1 qtf1Var) {
        this.a = qtf1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b400) && this.a.equals(((b400) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
