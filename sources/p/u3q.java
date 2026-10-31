package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class u3q {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jly0 b;

    public /* synthetic */ u3q(jly0 jly0Var, byte b) {
        this.a = b;
        this.b = jly0Var;
    }

    public final nn61 a() {
        byte b = this.a;
        r7q r7qVar = this.b;
        switch (b) {
            case 0:
                v5q v5qVar = (v5q) ((thq) r7qVar).c;
                return new nn61(new uww0(xqu.a(v5qVar.p1), (byte) 16), (th30) v5qVar.R0.get(), false, (byte) 28);
            case 1:
                s7q s7qVar = (s7q) r7qVar.d;
                return new nn61(new uww0(xqu.a(s7qVar.Q5), (byte) 16), (th30) s7qVar.f2.get(), false, (byte) 28);
            default:
                teq teqVar = r7qVar.d;
                return new nn61(j991.k(xqu.a(teqVar.j5)), (th30) teqVar.m1.get(), false, (byte) 28);
        }
    }
}
