package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class va0 implements wa0 {
    public final iyl1 a;

    public va0(iyl1 iyl1Var) {
        this.a = iyl1Var;
    }

    @Override // p.wa0
    public final iyl1 a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof va0) && this.a.equals(((va0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
