package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class q18 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ long b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q18(long j, i28 i28Var, n18 n18Var, iu30 iu30Var, int i) {
        super(2);
        this.a = (byte) 0;
        this.b = j;
        this.d = i28Var;
        this.e = n18Var;
        this.f = iu30Var;
        this.c = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        int i = this.c;
        rih1 rih1Var = rih1.a;
        Object obj3 = this.f;
        Object obj4 = this.e;
        Object obj5 = this.d;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                int iP = czo1.p(i | 1);
                long j = this.b;
                buo1.c(j, (i28) obj5, (n18) obj4, (iu30) obj3, (b0k) obj, iP);
                break;
            case 1:
                ((Number) obj2).intValue();
                int iP2 = czo1.p(i | 1);
                long j2 = this.b;
                k1o1.c(j2, (yqg) obj5, (Function0) obj4, (bf4) obj3, (b0k) obj, iP2);
                break;
            case 2:
                ((Number) obj2).intValue();
                int iP3 = czo1.p(i | 1);
                long j3 = this.b;
                o4o1.a((iu30) obj3, (gm31) obj5, j3, (qim0) obj4, (b0k) obj, iP3);
                break;
            case 3:
                ((Number) obj2).intValue();
                int iP4 = czo1.p(i | 1);
                oh80.a((nh80) obj5, (iu30) obj3, (qim0) obj4, this.b, (b0k) obj, iP4);
                break;
            case 4:
                ((Number) obj2).intValue();
                int iP5 = czo1.p(i | 1);
                long j4 = this.b;
                dgd0.b((String) obj5, (String) obj4, j4, (qim0) obj3, (b0k) obj, iP5);
                break;
            case 5:
                ((Number) obj2).intValue();
                String str = (String) obj3;
                int i2 = this.c;
                int iP6 = czo1.p(1);
                long j5 = this.b;
                i1p1.b((String) obj5, j5, (String) obj4, str, i2, (b0k) obj, iP6);
                break;
            case 6:
                ((Number) obj2).intValue();
                int iP7 = czo1.p(i | 1);
                long j6 = this.b;
                kbb.e((String) obj5, j6, (Function0) obj4, (qim0) obj3, (b0k) obj, iP7);
                break;
            default:
                ((Number) obj2).intValue();
                int iP8 = czo1.p(i | 1);
                long j7 = this.b;
                dem1.m((String) obj5, (String) obj4, j7, (vu30) obj3, (b0k) obj, iP8);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q18(long j, yqg yqgVar, Function0 function0, bf4 bf4Var, int i) {
        super(2);
        this.a = (byte) 1;
        this.b = j;
        this.d = yqgVar;
        this.e = function0;
        this.f = bf4Var;
        this.c = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q18(String str, long j, String str2, String str3, int i, int i2) {
        super(2);
        this.a = (byte) 5;
        this.d = str;
        this.b = j;
        this.e = str2;
        this.f = str3;
        this.c = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q18(String str, long j, Function0 function0, qim0 qim0Var, int i) {
        super(2);
        this.a = (byte) 6;
        this.d = str;
        this.b = j;
        this.e = function0;
        this.f = qim0Var;
        this.c = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q18(String str, String str2, long j, Object obj, int i, byte b) {
        super(2);
        this.a = b;
        this.d = str;
        this.e = str2;
        this.b = j;
        this.f = obj;
        this.c = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q18(iu30 iu30Var, gm31 gm31Var, long j, qim0 qim0Var, int i) {
        super(2);
        this.a = (byte) 2;
        this.f = iu30Var;
        this.d = gm31Var;
        this.b = j;
        this.e = qim0Var;
        this.c = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q18(nh80 nh80Var, iu30 iu30Var, qim0 qim0Var, long j, int i) {
        super(2);
        this.a = (byte) 3;
        this.d = nh80Var;
        this.f = iu30Var;
        this.e = qim0Var;
        this.b = j;
        this.c = i;
    }
}
