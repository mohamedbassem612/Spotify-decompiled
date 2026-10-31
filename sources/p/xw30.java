package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class xw30 implements h0r0 {
    public final z7e0 a;
    public final lip b;
    public final iw30 c;
    public final cbr0 d;

    public xw30(z7e0 z7e0Var, lip lipVar, iw30 iw30Var, cbr0 cbr0Var) {
        this.a = z7e0Var;
        this.b = lipVar;
        this.c = iw30Var;
        this.d = cbr0Var;
    }

    @Override // p.h0r0
    public final cbr0 a() {
        return this.d;
    }

    @Override // p.h0r0
    public final p2r0 b() {
        u830 u830Var = new u830(this, (byte) 13);
        u7r0 u7r0Var = new u7r0(a4p1.n(), null, null, false, false, 126);
        return new w6e0(this.c, this.a, u7r0Var, u830Var, (byte) 3);
    }
}
