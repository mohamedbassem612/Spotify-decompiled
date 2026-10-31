package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ezj1 implements fzj1 {
    public final syj1 a;

    public ezj1(syj1 syj1Var) {
        this.a = syj1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ezj1) && this.a.equals(((ezj1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
