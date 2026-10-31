package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class s4n0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ qlb b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s4n0(qlb qlbVar, byte b) {
        super(1);
        this.a = b;
        this.b = qlbVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        qlb qlbVar = this.b;
        switch (b) {
            case 0:
                return d3p1.H(qlbVar.b, (o3r) qlbVar.f, (o4n0) obj);
            default:
                o4n0 o4n0Var = (o4n0) obj;
                String str = o4n0Var.a;
                return new noa0((String) qlbVar.e, o4n0Var.b, str);
        }
    }
}
