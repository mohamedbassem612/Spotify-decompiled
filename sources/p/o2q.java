package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class o2q implements cl4 {
    public final /* synthetic */ byte a;
    public final daq b;
    public final e3q c;

    public /* synthetic */ o2q(daq daqVar, e3q e3qVar, byte b) {
        this.a = b;
        this.b = daqVar;
        this.c = e3qVar;
    }

    public final dl4 a(Object obj) {
        byte b = this.a;
        e3q e3qVar = this.c;
        daq daqVar = this.b;
        switch (b) {
            case 0:
                a680 a680Var = new a680();
                daq daqVar2 = this.b;
                a680Var.b = daqVar2;
                e3q e3qVar2 = this.c;
                a680Var.c = e3qVar2;
                a680Var.a = (jnw) obj;
                a680Var.d = new p2q(daqVar2, e3qVar2, a680Var, 0, (byte) 0);
                a680Var.e = xqu.b(new p2q(daqVar2, e3qVar2, a680Var, 1, (byte) 0));
                a680Var.f = xqu.b(new p2q(daqVar2, e3qVar2, a680Var, 2, (byte) 0));
                return a680Var;
            case 1:
                return new lbq((Object) daqVar, (Object) e3qVar, (byte) 0);
            default:
                return new qqp(daqVar, e3qVar);
        }
    }
}
