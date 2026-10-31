package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class lkf extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 2;
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lkf(skf skfVar, int i, boolean z, m5b0 m5b0Var, qim0 qim0Var, iu30 iu30Var, int i2) {
        super(2);
        this.f = skfVar;
        this.b = i;
        this.c = z;
        this.g = m5b0Var;
        this.d = qim0Var;
        this.h = iu30Var;
        this.e = i2;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invoke(Object obj, Object obj2) throws NoWhenBranchMatchedException {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.e;
        Object obj3 = this.d;
        Object obj4 = this.h;
        Object obj5 = this.g;
        Object obj6 = this.f;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ((Number) obj2).intValue();
                int iP = czo1.p(i | 1);
                int i2 = this.b;
                boolean z = this.c;
                tto1.a((skf) obj6, i2, z, (m5b0) obj5, (qim0) obj3, (iu30) obj4, (b0k) obj, iP);
                break;
            case 1:
                ((Number) obj2).intValue();
                int iP2 = czo1.p(i | 1);
                int i3 = this.b;
                boolean z2 = this.c;
                wmo1.h((gc60) obj6, (fc60) obj5, i3, (jkr0) obj4, z2, (qim0) obj3, (b0k) obj, iP2);
                break;
            case 2:
                ((Number) obj2).intValue();
                int iP3 = czo1.p(i | 1);
                int i4 = this.b;
                boolean z3 = this.c;
                d3p1.i((String) obj6, (String) obj5, i4, (o0e0) obj3, z3, (lb50) obj4, (b0k) obj, iP3);
                break;
            default:
                ((Number) obj2).intValue();
                int iP4 = czo1.p(i | 1);
                int i5 = this.b;
                boolean z4 = this.c;
                cvd1.c((dvd1) obj6, i5, (kly0) obj5, z4, (String) obj4, (qim0) obj3, (b0k) obj, iP4);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lkf(String str, String str2, int i, o0e0 o0e0Var, boolean z, lb50 lb50Var, int i2) {
        super(2);
        this.f = str;
        this.g = str2;
        this.b = i;
        this.d = o0e0Var;
        this.c = z;
        this.h = lb50Var;
        this.e = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lkf(gc60 gc60Var, fc60 fc60Var, int i, jkr0 jkr0Var, boolean z, qim0 qim0Var, int i2) {
        super(2);
        this.f = gc60Var;
        this.g = fc60Var;
        this.b = i;
        this.h = jkr0Var;
        this.c = z;
        this.d = qim0Var;
        this.e = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lkf(dvd1 dvd1Var, int i, kly0 kly0Var, boolean z, String str, qim0 qim0Var, int i2) {
        super(2);
        this.f = dvd1Var;
        this.b = i;
        this.g = kly0Var;
        this.c = z;
        this.h = str;
        this.d = qim0Var;
        this.e = i2;
    }
}
