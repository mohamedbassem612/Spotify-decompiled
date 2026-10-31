package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class mx9 extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 5;
    public final /* synthetic */ long b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mx9(String str, hdn0 hdn0Var, long j, boolean z, int i) {
        super(2);
        this.d = str;
        this.e = hdn0Var;
        this.b = j;
        this.c = z;
    }

    public final Object invoke(Object obj, Object obj2) {
        rih1 rih1Var;
        byte b = this.a;
        rih1 rih1Var2 = rih1.a;
        Object obj3 = this.e;
        Object obj4 = this.d;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                int iP = czo1.p(3073);
                boolean z = this.c;
                k4p1.b(z, (gx9) obj4, this.b, (qim0) obj3, (b0k) obj, iP);
                break;
            case 1:
                ((Number) obj2).intValue();
                ((iyj) obj4).f(czo1.p(1), this.b, (Function0) obj3, (b0k) obj, this.c);
                break;
            case 2:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                fhm fhmVar = (fhm) obj3;
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(1 & iIntValue, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    if (((hux) obj4) == null) {
                        x340Var2.i0(1501512413);
                        x340Var2.r(false);
                        rih1Var = null;
                    } else {
                        x340Var2.i0(1501512414);
                        isl islVar = isl.a;
                        long j = this.b;
                        w0h1.a((hux) obj4, islVar, (qim0) null, j, j, this.c, x340Var2, 56, 4);
                        x340Var2.r(false);
                        rih1Var = rih1Var2;
                    }
                    if (rih1Var == null) {
                        x340Var2.i0(1501760135);
                        if (fhmVar == null) {
                            x340Var2.i0(1501760134);
                        } else {
                            x340Var2.i0(1501760135);
                            j0o1.d(fhmVar, x340Var2, 0);
                        }
                        x340Var2.r(false);
                    } else {
                        x340Var2.i0(-228658911);
                    }
                    x340Var2.r(false);
                }
                break;
            case 3:
                ((Number) obj2).intValue();
                int iP2 = czo1.p(1);
                d9y0.e((String) obj4, this.c, this.b, (iu30) obj3, (b0k) obj, iP2);
                break;
            case 4:
                ((Number) obj2).intValue();
                u4p1.s((c380) obj4, this.c, (iix0) obj3, this.b, (b0k) obj, czo1.p(1));
                break;
            default:
                ((Number) obj2).intValue();
                k1p1.b((String) obj4, (hdn0) obj3, this.b, this.c, (b0k) obj, czo1.p(1));
                break;
        }
        return rih1Var2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mx9(String str, boolean z, long j, iu30 iu30Var, int i) {
        super(2);
        this.d = str;
        this.c = z;
        this.b = j;
        this.e = iu30Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mx9(iyj iyjVar, long j, boolean z, Function0 function0, int i) {
        super(2);
        this.d = iyjVar;
        this.b = j;
        this.c = z;
        this.e = function0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mx9(hux huxVar, fhm fhmVar, long j, boolean z) {
        super(2);
        this.d = huxVar;
        this.e = fhmVar;
        this.b = j;
        this.c = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mx9(c380 c380Var, boolean z, iix0 iix0Var, long j, int i) {
        super(2);
        this.d = c380Var;
        this.c = z;
        this.e = iix0Var;
        this.b = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mx9(boolean z, gx9 gx9Var, long j, qim0 qim0Var, int i) {
        super(2);
        this.c = z;
        this.d = gx9Var;
        this.b = j;
        this.e = qim0Var;
    }
}
