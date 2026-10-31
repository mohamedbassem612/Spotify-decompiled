package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class hxx extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 2;
    public final /* synthetic */ qim0 b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ long e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ int g;
    public final /* synthetic */ byte h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public hxx(xu30 xu30Var, qim0 qim0Var, tl3 tl3Var, lee1 lee1Var, long j, int i, int i2) {
        super(2);
        this.f = xu30Var;
        this.b = qim0Var;
        this.c = tl3Var;
        this.d = lee1Var;
        this.e = j;
        this.g = i;
        this.h = i2;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.g;
        Object obj3 = this.d;
        Object obj4 = this.c;
        Object obj5 = this.f;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ((Number) obj2).intValue();
                tl3 tl3Var = (tl3) obj4;
                cwl1.d(czo1.p(i | 1), this.h, this.e, tl3Var, (b0k) obj, (xu30) obj5, this.b, (lee1) obj3);
                break;
            case 1:
                ((Number) obj2).intValue();
                int iP = czo1.p(i | 1);
                byte b2 = this.h;
                long j = this.e;
                cwl1.e(iP, b2, j, (tl3) obj4, (b0k) obj, (xu30) obj5, this.b, (lee1) obj3);
                break;
            default:
                ((Number) obj2).intValue();
                int iP2 = czo1.p(i | 1);
                byte b3 = this.h;
                kuo1.f((String) obj5, (String) obj4, (iu30) obj3, this.b, this.e, (b0k) obj, iP2, b3);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public hxx(String str, String str2, iu30 iu30Var, qim0 qim0Var, long j, int i, int i2) {
        super(2);
        this.f = str;
        this.c = str2;
        this.d = iu30Var;
        this.b = qim0Var;
        this.e = j;
        this.g = i;
        this.h = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public hxx(qim0 qim0Var, tl3 tl3Var, lee1 lee1Var, long j, xu30 xu30Var, int i, int i2) {
        super(2);
        this.b = qim0Var;
        this.c = tl3Var;
        this.d = lee1Var;
        this.e = j;
        this.f = xu30Var;
        this.g = i;
        this.h = i2;
    }
}
