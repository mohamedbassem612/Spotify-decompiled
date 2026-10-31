package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class h1q {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jly0 b;

    public /* synthetic */ h1q(jly0 jly0Var, byte b) {
        this.a = b;
        this.b = jly0Var;
    }

    public final p68 a(c4n0 c4n0Var) {
        byte b = this.a;
        jly0 jly0Var = this.b;
        switch (b) {
            case 0:
                i2q i2qVar = (i2q) jly0Var;
                teq teqVar = i2qVar.b;
                return new p68(c4n0Var, (js6) teqVar.L5.get(), (ywc0) i2qVar.c.P0.get(), (i4q) teqVar.t2.get(), (yhm) teqVar.e6.get(), (em6) teqVar.H6.get(), ((Boolean) teqVar.K6.get()).booleanValue());
            default:
                teq teqVar2 = ((thq) jly0Var).c;
                return new p68(c4n0Var, (js6) teqVar2.L5.get(), (ywc0) teqVar2.b.D.get(), (i4q) teqVar2.t2.get(), (yhm) teqVar2.e6.get(), (em6) teqVar2.H6.get(), ((Boolean) teqVar2.K6.get()).booleanValue());
        }
    }
}
