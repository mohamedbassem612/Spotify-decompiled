package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class mnu0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ onu0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mnu0(onu0 onu0Var, byte b) {
        super(1);
        this.a = b;
        this.b = onu0Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        onu0 onu0Var = this.b;
        switch (b) {
            case 0:
                dnu0 dnu0Var = (dnu0) obj;
                rzq rzqVar = onu0Var.b;
                return new x010(hu20.e(d3p1.F(rzqVar, onu0Var.c, dnu0Var), new t4o0((lnm) null, onu0Var, (byte) 22)), d3p1.F(rzqVar, onu0Var.d, dnu0Var), new lok0(3, (lnm) null, (byte) 13), (byte) 1);
            default:
                return w5p1.o((dnu0) obj, onu0Var.a, (sv21) null);
        }
    }
}
