package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class zhu {
    public final vu30 a;
    public final vu30 b;

    public zhu(int i, vu30 vu30Var) {
        this((vu30) new s55(2, (lnm) null, (byte) 8), (i & 2) != 0 ? new s55(2, (lnm) null, (byte) 9) : vu30Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zhu)) {
            return false;
        }
        zhu zhuVar = (zhu) obj;
        return u890.j(this.a, zhuVar.a) && u890.j(this.b, zhuVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public zhu(vu30 vu30Var, vu30 vu30Var2) {
        this.a = vu30Var;
        this.b = vu30Var2;
    }
}
