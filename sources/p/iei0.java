package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class iei0 extends hab0 implements vu30 {
    public final /* synthetic */ Object X;
    public final /* synthetic */ Object Y;
    public final /* synthetic */ Object Z;
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ hob1 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ float d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ cv30 f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iei0(hob1 hob1Var, float f, iu30 iu30Var, iuj iujVar, idd1 idd1Var, idd1 idd1Var2, idd1 idd1Var3, idd1 idd1Var4, boolean z, boolean z2, znb0 znb0Var, i091 i091Var) {
        super(2);
        this.b = hob1Var;
        this.d = f;
        this.f = iu30Var;
        this.g = iujVar;
        this.h = idd1Var;
        this.i = idd1Var2;
        this.t = idd1Var3;
        this.X = idd1Var4;
        this.c = z;
        this.e = z2;
        this.Y = znb0Var;
        this.Z = i091Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj3 = this.Z;
        Object obj4 = this.Y;
        Object obj5 = this.X;
        Object obj6 = this.t;
        Object obj7 = this.i;
        Object obj8 = this.h;
        Object obj9 = this.g;
        j2i j2iVar = this.f;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    iu30 iu30Var = (iu30) j2iVar;
                    iuj iujVar = (iuj) obj9;
                    idd1 idd1Var = (idd1) obj8;
                    idd1 idd1Var2 = (idd1) obj7;
                    idd1 idd1Var3 = (idd1) obj6;
                    idd1 idd1Var4 = (idd1) obj5;
                    znb0 znb0Var = (znb0) obj4;
                    i091 i091Var = (i091) obj3;
                    Object objT = x340Var2.T();
                    if (objT == fkj0.X) {
                        objT = qci0.O0;
                        x340Var2.s0(objT);
                    }
                    rpo1.e(this.b, this.d, iu30Var, iujVar, idd1Var, idd1Var2, idd1Var3, idd1Var4, this.c, (qim0) null, this.e, (znb0) null, znb0Var, false, (znb0) null, (znb0) null, false, (znb0) null, (znb0) null, (znb0) null, (yqg) null, i091Var, false, (vu30) null, (String) null, (iu30) objT, x340Var2, 0, 196608, 31451648);
                }
                break;
            default:
                ((Number) obj2).intValue();
                int iP = czo1.p(100691377);
                x2g0.y(this.b, j2iVar, (j2i) obj9, (j2i) obj8, (j2i) obj7, (Function0) obj6, (Function0) obj5, (qim0) obj4, (vu30) obj3, this.c, this.d, this.e, (b0k) obj, iP);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iei0(hob1 hob1Var, j2i j2iVar, j2i j2iVar2, j2i j2iVar3, j2i j2iVar4, Function0 function0, Function0 function1, qim0 qim0Var, vu30 vu30Var, boolean z, float f, boolean z2, int i) {
        super(2);
        this.b = hob1Var;
        this.f = j2iVar;
        this.g = j2iVar2;
        this.h = j2iVar3;
        this.i = j2iVar4;
        this.t = function0;
        this.X = function1;
        this.Y = qim0Var;
        this.Z = vu30Var;
        this.c = z;
        this.d = f;
        this.e = z2;
    }
}
