package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class dcb1 implements yu50 {
    public final wp20 a;
    public final wu50 b;

    public dcb1(wp20 wp20Var, srq srqVar) {
        this.a = wp20Var;
        this.b = new wu50(new ccb1(srqVar, this, (byte) 0), (bpb1) wp20Var.e);
    }

    @Override // p.yu50
    public final wu50 u() {
        return this.b;
    }
}
