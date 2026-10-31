package p;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ov01 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ String c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ boolean h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ov01(String str, c380 c380Var, boolean z, boolean z2, boolean z3, boolean z4, iu30 iu30Var, int i) {
        super(2);
        this.a = (byte) 2;
        this.c = str;
        this.b = c380Var;
        this.d = z;
        this.f = z2;
        this.g = z3;
        this.h = z4;
        this.e = iu30Var;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invoke(Object obj, Object obj2) throws NoWhenBranchMatchedException {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj3 = this.e;
        Object obj4 = this.b;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                boolean z = this.h;
                int iP = czo1.p(1);
                String str = this.c;
                boolean z2 = this.d;
                kyo1.h((idd1) obj4, str, z2, (String) obj3, this.f, this.g, z, (b0k) obj, iP);
                break;
            case 1:
                ((Number) obj2).intValue();
                String str2 = (String) obj3;
                boolean z3 = this.h;
                int iP2 = czo1.p(1);
                kyo1.h((idd1) obj4, this.c, this.d, str2, this.f, this.g, z3, (b0k) obj, iP2);
                break;
            default:
                ((Number) obj2).intValue();
                int iP3 = czo1.p(1);
                String str3 = this.c;
                boolean z4 = this.d;
                boolean z5 = this.f;
                boolean z6 = this.g;
                boolean z7 = this.h;
                y7y0.c(str3, (c380) obj4, z4, z5, z6, z7, (iu30) obj3, (b0k) obj, iP3);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ov01(idd1 idd1Var, String str, boolean z, String str2, boolean z2, boolean z3, boolean z4, int i, byte b) {
        super(2);
        this.a = b;
        this.b = idd1Var;
        this.c = str;
        this.d = z;
        this.e = str2;
        this.f = z2;
        this.g = z3;
        this.h = z4;
    }
}
