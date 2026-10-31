package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class x51 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ j2i b;
    public final /* synthetic */ List c;
    public final /* synthetic */ nl3 d;
    public final /* synthetic */ float e;
    public final /* synthetic */ gdx f;
    public final /* synthetic */ lee1 g;
    public final /* synthetic */ int h;
    public final /* synthetic */ vu30 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x51(nl3 nl3Var, float f, j2i j2iVar, List list, gdx gdxVar, lee1 lee1Var, int i, vu30 vu30Var) {
        super(2);
        this.a = (byte) 2;
        this.d = nl3Var;
        this.e = f;
        this.b = j2iVar;
        this.c = list;
        this.f = gdxVar;
        this.g = lee1Var;
        this.h = i;
        this.i = vu30Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        vu30 vu30Var = this.i;
        j2i j2iVar = this.b;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    j2iVar.invoke(x340Var2, 0);
                    c4p1.b(this.c, nim0.a, this.d, this.e, this.f, this.g, this.h, x340Var2, 48, 0);
                    vu30Var.invoke(x340Var2, 0);
                }
                break;
            case 1:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x340Var4.b0();
                } else {
                    j2iVar.invoke(x340Var4, 0);
                    c4p1.b(this.c, nim0.a, this.d, this.e, this.f, this.g, this.h, x340Var4, 48, 0);
                    vu30Var.invoke(x340Var4, 0);
                }
                break;
            case 2:
                x340 x340Var5 = (b0k) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                x340 x340Var6 = x340Var5;
                if (!x340Var6.Y(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x340Var6.b0();
                } else {
                    Object objT = x340Var6.T();
                    if (objT == fkj0.X) {
                        objT = gx0.Y;
                        x340Var6.s0(objT);
                    }
                    c4p1.c(this.d, this.e, s161.a(nim0.a, (iu30) objT), apo.r(1129853968, new x51(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, (byte) 1), x340Var6), x340Var6, 3072);
                }
                break;
            default:
                x340 x340Var7 = (b0k) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                x340 x340Var8 = x340Var7;
                if (!x340Var8.Y(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    x340Var8.b0();
                } else {
                    j2iVar.invoke(x340Var8, 0);
                    c4p1.b(this.c, nim0.a, this.d, this.e, this.f, this.g, this.h, x340Var8, 48, 0);
                    vu30Var.invoke(x340Var8, 0);
                }
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x51(j2i j2iVar, List list, nl3 nl3Var, float f, gdx gdxVar, lee1 lee1Var, int i, vu30 vu30Var, byte b) {
        super(2);
        this.a = b;
        this.b = j2iVar;
        this.c = list;
        this.d = nl3Var;
        this.e = f;
        this.f = gdxVar;
        this.g = lee1Var;
        this.h = i;
        this.i = vu30Var;
    }
}
