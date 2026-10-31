package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ysa1 implements dta1 {
    public final qig1 a;

    public ysa1(qig1 qig1Var) {
        this.a = qig1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ysa1) && this.a.equals(((ysa1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
