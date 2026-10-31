package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class kxi1 implements zu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ t8r0 c;
    public final /* synthetic */ xfx d;
    public final /* synthetic */ j2i e;
    public final /* synthetic */ iu30 f;

    public /* synthetic */ kxi1(ArrayList arrayList, t8r0 t8r0Var, xfx xfxVar, j2i j2iVar, iu30 iu30Var, byte b) {
        this.a = b;
        this.b = arrayList;
        this.c = t8r0Var;
        this.d = xfxVar;
        this.e = j2iVar;
        this.f = iu30Var;
    }

    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        ArrayList arrayList = this.b;
        switch (b) {
            case 0:
                aqb0 aqb0Var = (aqb0) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var = (b0k) obj3;
                int iIntValue2 = ((Number) obj4).intValue();
                int i = (iIntValue2 & 6) == 0 ? iIntValue2 | (x340Var.g(aqb0Var) ? 4 : 2) : iIntValue2;
                if ((iIntValue2 & 48) == 0) {
                    i |= x340Var.e(iIntValue) ? 32 : 16;
                }
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(i & 1, (i & 147) != 146)) {
                    x340Var2.b0();
                } else {
                    f6m f6mVar = (f6m) arrayList.get(iIntValue);
                    x340Var2.i0(403687567);
                    qyo1.k(this.c, f6mVar, this.d, this.e, this.f, (qim0) null, x340Var2, 0);
                    x340Var2.r(false);
                }
                break;
            default:
                aqb0 aqb0Var2 = (aqb0) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                x340 x340Var3 = (b0k) obj3;
                int iIntValue4 = ((Number) obj4).intValue();
                int i2 = (iIntValue4 & 6) == 0 ? iIntValue4 | (x340Var3.g(aqb0Var2) ? 4 : 2) : iIntValue4;
                if ((iIntValue4 & 48) == 0) {
                    i2 |= x340Var3.e(iIntValue3) ? 32 : 16;
                }
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(i2 & 1, (i2 & 147) != 146)) {
                    x340Var4.b0();
                } else {
                    f6m f6mVar2 = (f6m) arrayList.get(iIntValue3);
                    x340Var4.i0(1092998371);
                    qyo1.k(this.c, f6mVar2, this.d, this.e, this.f, (qim0) null, x340Var4, 0);
                    x340Var4.r(false);
                }
                break;
        }
        return rih1Var;
    }
}
