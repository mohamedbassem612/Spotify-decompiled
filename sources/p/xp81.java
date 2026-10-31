package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class xp81 extends eq81 {
    public final qjn0 a;

    public xp81(qjn0 qjn0Var) {
        this.a = qjn0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xp81) && this.a.equals(((xp81) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
