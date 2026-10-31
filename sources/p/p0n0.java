package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class p0n0 implements iu30 {
    public final zf30 a;

    public p0n0(zf30 zf30Var) {
        this.a = zf30Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p0n0) && u890.j(this.a, ((p0n0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // p.iu30
    public final Object invoke(Object obj) {
        return Boolean.valueOf(((zf30) obj).equals(this.a));
    }
}
