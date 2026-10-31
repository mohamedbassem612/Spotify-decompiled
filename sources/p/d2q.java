package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class d2q {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jly0 b;

    public /* synthetic */ d2q(jly0 jly0Var, byte b) {
        this.a = b;
        this.b = jly0Var;
    }

    public static qlb b(d2q d2qVar, d0r d0rVar) {
        return d2qVar.a(igu.a, d0rVar);
    }

    public final qlb a(o8n o8nVar, d0r d0rVar) {
        byte b = this.a;
        r7q r7qVar = this.b;
        switch (b) {
            case 0:
                return new qlb((vgm) ((i2q) r7qVar).c.Q0.get(), d0rVar, o8nVar);
            case 1:
                return new qlb((vgm) ((s7q) r7qVar.d).X4.get(), d0rVar, o8nVar);
            default:
                return new qlb((vgm) ((thq) r7qVar).c.b.E.get(), d0rVar, o8nVar);
        }
    }
}
