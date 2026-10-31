package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class nd6 extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ float b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nd6(float f, long j, cr31 cr31Var, qim0 qim0Var, int i) {
        super(2);
        this.b = f;
        this.c = j;
        this.d = cr31Var;
        this.e = qim0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        float f = this.b;
        nim0 nim0Var = nim0.a;
        rih1 rih1Var = rih1.a;
        Object obj3 = this.e;
        Object obj4 = this.d;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ((Number) obj2).intValue();
                od6.b((String) obj4, this.c, (yux) obj3, this.b, (b0k) obj, czo1.p(3073));
                break;
            case 1:
                ((Number) obj2).intValue();
                luo1.l(this.b, this.c, (cr31) obj4, (qim0) obj3, (b0k) obj, czo1.p(1));
                break;
            case 2:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    w0h1.a((hux) obj3, new jsl((String) obj4), u291.r(nim0Var, f), this.c, 0L, false, x340Var2, 8, 48);
                }
                break;
            default:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x340Var4.b0();
                } else {
                    w0h1.a((hux) obj4, (ksl) obj3, u291.r(nim0Var, f), this.c, 0L, false, x340Var4, 8, 48);
                }
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nd6(String str, long j, yux yuxVar, float f, int i) {
        super(2);
        this.d = str;
        this.c = j;
        this.e = yuxVar;
        this.b = f;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nd6(hux huxVar, String str, float f, long j) {
        super(2);
        this.e = huxVar;
        this.d = str;
        this.b = f;
        this.c = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nd6(hux huxVar, ksl kslVar, float f, long j) {
        super(2);
        this.d = huxVar;
        this.e = kslVar;
        this.b = f;
        this.c = j;
    }
}
