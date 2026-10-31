package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class cc40 extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cc40(int i, int i2, String str, iu30 iu30Var, boolean z) {
        super(2);
        this.c = z;
        this.b = i;
        this.f = str;
        this.d = iu30Var;
        this.e = i2;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        int i = this.e;
        rih1 rih1Var = rih1.a;
        Object obj3 = this.d;
        Object obj4 = this.f;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                iu30 iu30Var = (iu30) obj3;
                int iP = czo1.p(i | 1);
                int i2 = this.b;
                d1u.m(i2, iP, (String) obj4, (b0k) obj, iu30Var, this.c);
                break;
            case 1:
                ((Number) obj2).intValue();
                int iP2 = czo1.p(i | 1);
                int i3 = this.b;
                boolean z = this.c;
                l0p1.d(i3, z, (iu30) obj3, (qim0) obj4, (b0k) obj, iP2);
                break;
            case 2:
                ((Number) obj2).intValue();
                qim0 qim0Var = (qim0) obj3;
                int iP3 = czo1.p(1);
                ((ze21) obj4).e(this.b, this.e, this.c, qim0Var, (b0k) obj, iP3);
                break;
            case 3:
                ((Number) obj2).intValue();
                int iP4 = czo1.p(i | 1);
                int i4 = this.b;
                boolean z2 = this.c;
                smo1.b(i4, z2, (Function0) obj4, (j2i) obj3, (b0k) obj, iP4);
                break;
            default:
                ((Number) obj2).intValue();
                int iP5 = czo1.p(i | 1);
                boolean z3 = this.c;
                o4p1.f((zvj1) obj4, z3, (iu30) obj3, this.b, (b0k) obj, iP5);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cc40(int i, boolean z, Function0 function0, j2i j2iVar, int i2) {
        super(2);
        this.b = i;
        this.c = z;
        this.f = function0;
        this.d = j2iVar;
        this.e = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cc40(int i, boolean z, iu30 iu30Var, qim0 qim0Var, int i2) {
        super(2);
        this.b = i;
        this.c = z;
        this.d = iu30Var;
        this.f = qim0Var;
        this.e = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cc40(ze21 ze21Var, int i, int i2, boolean z, qim0 qim0Var, int i3) {
        super(2);
        this.f = ze21Var;
        this.b = i;
        this.e = i2;
        this.c = z;
        this.d = qim0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cc40(zvj1 zvj1Var, boolean z, iu30 iu30Var, int i, int i2) {
        super(2);
        this.f = zvj1Var;
        this.c = z;
        this.d = iu30Var;
        this.b = i;
        this.e = i2;
    }
}
