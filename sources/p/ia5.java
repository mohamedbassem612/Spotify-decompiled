package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ia5 extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ long b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ia5(fns fnsVar, String str, long j, tob1 tob1Var, boolean z, int i) {
        super(2);
        this.e = fnsVar;
        this.f = str;
        this.b = j;
        this.g = tob1Var;
        this.c = z;
        this.d = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.d;
        Object obj3 = this.g;
        Object obj4 = this.f;
        Object obj5 = this.e;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ((Number) obj2).intValue();
                int iP = czo1.p(i | 1);
                long j = this.b;
                boolean z = this.c;
                ka5.b((sju) obj5, (mt71) obj4, j, z, (qim0) obj3, (b0k) obj, iP);
                break;
            default:
                ((Number) obj2).intValue();
                int iP2 = czo1.p(i | 1);
                long j2 = this.b;
                crn1.h((fns) obj5, (String) obj4, j2, (tob1) obj3, this.c, nim0.a, (b0k) obj, iP2);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ia5(sju sjuVar, mt71 mt71Var, long j, boolean z, qim0 qim0Var, int i) {
        super(2);
        this.e = sjuVar;
        this.f = mt71Var;
        this.b = j;
        this.c = z;
        this.g = qim0Var;
        this.d = i;
    }
}
