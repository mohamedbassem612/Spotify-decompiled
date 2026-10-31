package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class wz2 extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ qim0 b;
    public final /* synthetic */ float c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wz2(j2i j2iVar, j2i j2iVar2, j2i j2iVar3, qim0 qim0Var, mih1 mih1Var, float f, j2i j2iVar4, ixq0 ixq0Var) {
        super(2);
        this.d = j2iVar;
        this.e = j2iVar2;
        this.f = j2iVar3;
        this.b = qim0Var;
        this.h = mih1Var;
        this.c = f;
        this.g = j2iVar4;
        this.i = ixq0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj3 = this.i;
        Object obj4 = this.h;
        Object obj5 = this.g;
        Object obj6 = this.f;
        Object obj7 = this.e;
        Object obj8 = this.d;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(1 & iIntValue, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    ton1.g(6, apo.r(455304456, new vz2((j2i) obj8, (j2i) obj7, (j2i) obj6, this.b, (mih1) obj4, this.c, (j2i) obj5, (ixq0) obj3), x340Var2), x340Var2);
                }
                break;
            default:
                ((Number) obj2).intValue();
                float f = this.c;
                int iP = czo1.p(1);
                puo1.e((a470) obj8, (wgh1) obj7, (mev) obj6, (dh30) obj5, this.b, (upb0) obj4, (zzq0) obj3, f, (b0k) obj, iP);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wz2(a470 a470Var, wgh1 wgh1Var, mev mevVar, dh30 dh30Var, qim0 qim0Var, upb0 upb0Var, zzq0 zzq0Var, float f, int i) {
        super(2);
        this.d = a470Var;
        this.e = wgh1Var;
        this.f = mevVar;
        this.g = dh30Var;
        this.b = qim0Var;
        this.h = upb0Var;
        this.i = zzq0Var;
        this.c = f;
    }
}
