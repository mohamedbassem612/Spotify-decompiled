package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class y2n0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ qlb b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y2n0(qlb qlbVar, byte b) {
        super(1);
        this.a = b;
        this.b = qlbVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        qlb qlbVar = this.b;
        switch (b) {
            case 0:
                return d3p1.H(qlbVar.b, (o3r) qlbVar.f, (u2n0) obj);
            default:
                u2n0 u2n0Var = (u2n0) obj;
                String str = u2n0Var.a;
                return new noa0((String) qlbVar.e, u2n0Var.b, str);
        }
    }
}
