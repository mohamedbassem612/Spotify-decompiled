package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ztm0 implements bum0 {
    public final jy21 a;

    public ztm0(jy21 jy21Var) {
        this.a = jy21Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ztm0) && u890.j(this.a, ((ztm0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
