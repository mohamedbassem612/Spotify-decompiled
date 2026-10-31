package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class mo5 {
    public final do5 a;
    public final int b;

    public mo5(do5 do5Var, int i) {
        this.a = do5Var;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mo5)) {
            return false;
        }
        mo5 mo5Var = (mo5) obj;
        return this.a.equals(mo5Var.a) && this.b == mo5Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + kaa0.f(this.b, kaa0.f(2131952358, this.a.hashCode() * 31, 31), 31);
    }
}
