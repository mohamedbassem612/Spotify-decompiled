package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ew8 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ String b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ew8(Object obj, boolean z, String str, boolean z2, byte b) {
        super(1);
        this.a = b;
        this.e = obj;
        this.c = z;
        this.b = str;
        this.d = z2;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj2 = this.e;
        switch (b) {
            case 0:
                ajq0 ajq0Var = (ajq0) obj2;
                fn31.T(cto1.q((dg30) ajq0Var.a), (q8n) ajq0Var.e, 0, new dw8(ajq0Var, this.c, this.b, this.d, (lnm) null, (byte) 0), 2);
                break;
            case 1:
                a680 a680Var = (a680) obj2;
                fn31.T((u9c0) ((idd1) a680Var.f).getValue(), (q8n) a680Var.e, 0, new dw8(this.d, a680Var, this.b, this.c, (lnm) null), 2);
                break;
            default:
                ubc0 ubc0Var = new ubc0((tv80) obj);
                wp20 wp20Var = (wp20) obj2;
                fn31.T(zso1.H(((f0i) ((dg30) wp20Var.d)).a), (q8n) wp20Var.e, 0, new p230(this.c, wp20Var, this.b, this.d, ubc0Var, (lnm) null), 2);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ew8(a680 a680Var, String str, boolean z, boolean z2) {
        super(1);
        this.a = (byte) 1;
        this.e = a680Var;
        this.b = str;
        this.c = z;
        this.d = z2;
    }
}
