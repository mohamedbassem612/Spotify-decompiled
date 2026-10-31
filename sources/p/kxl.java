package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class kxl extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ wat b;
    public final /* synthetic */ ven0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kxl(wat watVar, ven0 ven0Var, byte b) {
        super(1);
        this.a = b;
        this.b = watVar;
        this.c = ven0Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        wat watVar = this.b;
        ven0 ven0Var = this.c;
        switch (b) {
            case 0:
                float fM0 = watVar.M0((int) (((yr80) obj).a & 4294967295L));
                mma0[] mma0VarArr = pxl.a;
                pzm.k(fM0, ven0Var);
                break;
            case 1:
                pzm.k(watVar.M0((int) (((yr80) obj).a & 4294967295L)), ven0Var);
                break;
            case 2:
                pzm.k(watVar.M0((int) (((yr80) obj).a & 4294967295L)), ven0Var);
                break;
            case 3:
                pzm.k(watVar.M0((int) (((yr80) obj).a >> 32)), ven0Var);
                break;
            case 4:
                zrm0 zrm0Var = ((y9e1) obj).b;
                float fN0 = watVar.N0((zrm0Var.b(0) + zrm0Var.f(0)) / 2.0f);
                int i = zrm0Var.f;
                if (i > 3) {
                    i = 3;
                }
                ebe1 ebe1Var = new ebe1(fN0, i);
                if (!ebe1Var.equals((ebe1) ven0Var.getValue())) {
                    ven0Var.setValue(ebe1Var);
                }
                break;
            case 5:
                pzm.k(watVar.M0((int) (((elb0) obj).b() & 4294967295L)), ven0Var);
                break;
            case 6:
                float fM1 = watVar.M0((int) (((yr80) obj).a & 4294967295L));
                if (p3v.b(fM1, ((p3v) ven0Var.getValue()).a) > 0) {
                    pzm.k(fM1, ven0Var);
                }
                break;
            case 7:
                float fM2 = watVar.M0((int) (((yr80) obj).a & 4294967295L));
                if (p3v.b(fM2, ((p3v) ven0Var.getValue()).a) > 0) {
                    pzm.k(fM2, ven0Var);
                }
                break;
            default:
                pzm.k(watVar.M0((int) (((yr80) obj).a & 4294967295L)), ven0Var);
                break;
        }
        return rih1Var;
    }
}
