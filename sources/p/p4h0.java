package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class p4h0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ks6 b;
    public final /* synthetic */ kmy c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p4h0(ks6 ks6Var, kmy kmyVar, byte b) {
        super(2);
        this.a = b;
        this.b = ks6Var;
        this.c = kmyVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        ngs0 ngs0Var;
        ecd1 ecd1Var;
        byte b = this.a;
        kmy kmyVar = this.c;
        ks6 ks6Var = this.b;
        switch (b) {
            case 0:
                p6q p6qVar = (p6q) ks6Var.d;
                z8b0 z8b0Var = new z8b0(kmyVar, (byte) 16);
                switch (p6qVar.a) {
                    case 0:
                        ngs0Var = new ngs0(z8b0Var);
                        break;
                    default:
                        ngs0Var = new ngs0(z8b0Var);
                        break;
                }
                return new kpg0(ngs0Var, jtg0.P0);
            case 1:
                hrp hrpVar = (hrp) ks6Var.f;
                return new kpg0(new yup0((irp) ((jly0) ((zl5) hrpVar.a.c).o).get(), new q4h0(kmyVar, (byte) 0)), jtg0.T0);
            case 2:
                return new kpg0(((hfp) ks6Var.g).a(new mbf0(kmyVar, (byte) 23)), new r4h0(ks6Var, (byte) 0));
            case 3:
                grp grpVar = (grp) ks6Var.e;
                q4h0 q4h0Var = new q4h0(kmyVar, (byte) 1);
                grpVar.getClass();
                return new kpg0(new ngs0(q4h0Var), jtg0.Z0);
            default:
                k6q k6qVar = (k6q) ks6Var.Y;
                d0r d0rVar = (d0r) ks6Var.a;
                q4h0 q4h0Var2 = new q4h0(kmyVar, (byte) 7);
                switch (k6qVar.a) {
                    case 0:
                        r7q r7qVar = k6qVar.b;
                        r7q r7qVar2 = ((s7q) r7qVar.d).F6;
                        daq daqVar = r7qVar.b;
                        ecd1Var = new ecd1(r7qVar2, (kt91) daqVar.f8.get(), daqVar.gq, (q8n) daqVar.r2.get(), (q8n) daqVar.V2.get(), d0rVar, q4h0Var2);
                        break;
                    default:
                        thq thqVar = (thq) k6qVar.b;
                        thq thqVar2 = thqVar.c.a.d9;
                        daq daqVar2 = thqVar.b;
                        ecd1Var = new ecd1(thqVar2, (kt91) daqVar2.f8.get(), daqVar2.gq, (q8n) daqVar2.r2.get(), (q8n) daqVar2.V2.get(), d0rVar, q4h0Var2);
                        break;
                }
                return new kpg0(ecd1Var, s4h0.c);
        }
    }
}
