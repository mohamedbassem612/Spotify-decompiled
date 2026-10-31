package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class rbl1 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ c9n b;
    public final /* synthetic */ vbl1 c;
    public final /* synthetic */ o0i d;
    public final /* synthetic */ ven0 e;
    public final /* synthetic */ ven0 f;
    public final /* synthetic */ ylv g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rbl1(c9n c9nVar, vbl1 vbl1Var, o0i o0iVar, ven0 ven0Var, ven0 ven0Var2, ylv ylvVar, byte b) {
        super(1);
        this.a = b;
        this.b = c9nVar;
        this.c = vbl1Var;
        this.d = o0iVar;
        this.e = ven0Var;
        this.f = ven0Var2;
        this.g = ylvVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        o0i o0iVar = this.d;
        vbl1 vbl1Var = this.c;
        ylv ylvVar = this.g;
        c9n c9nVar = this.b;
        ven0 ven0Var = this.f;
        ven0 ven0Var2 = this.e;
        switch (b) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                Boolean bool = Boolean.FALSE;
                ven0Var2.setValue(bool);
                ven0Var.setValue(bool);
                fn31.T(c9nVar, (o8n) null, 0, new qbl1(zBooleanValue, ylvVar, null, (byte) 0), 3);
                vbl1Var.b.e(o0iVar.e, new hbl1(o0iVar, (byte) 2));
                vbl1Var.f.b.onNext(Float.valueOf(1.0f));
                vbl1Var.c.a(ecl1.a);
                break;
            default:
                boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                Boolean bool2 = Boolean.TRUE;
                ven0Var2.setValue(bool2);
                ven0Var.setValue(bool2);
                fn31.T(c9nVar, (o8n) null, 0, new qbl1(zBooleanValue2, ylvVar, null, (byte) 1), 3);
                vbl1Var.b.e(o0iVar.e, new hbl1(o0iVar, (byte) 1));
                vbl1Var.f.b.onNext(Float.valueOf(2.0f));
                vbl1Var.c.a(dcl1.a);
                break;
        }
        return rih1Var;
    }
}
