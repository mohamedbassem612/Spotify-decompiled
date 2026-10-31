package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class kz60 implements oz60 {
    public final fq0 a;

    public kz60(fq0 fq0Var) {
        this.a = fq0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kz60) && this.a.equals(((kz60) obj).a);
    }

    public final int hashCode() {
        return l1d.C(9) + (this.a.hashCode() * 31);
    }
}
