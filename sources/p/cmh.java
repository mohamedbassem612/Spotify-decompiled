package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class cmh {
    public final alr0 a;
    public final boolean b;

    public cmh(alr0 alr0Var, boolean z) {
        this.a = alr0Var;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cmh)) {
            return false;
        }
        cmh cmhVar = (cmh) obj;
        return u890.j(this.a, cmhVar.a) && this.b == cmhVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
