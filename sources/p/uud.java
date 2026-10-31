package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class uud extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ long b;
    public final /* synthetic */ float c;
    public final /* synthetic */ qim0 d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ uud(float f, long j, Object obj, qim0 qim0Var, int i, byte b) {
        super(2);
        this.a = b;
        this.c = f;
        this.b = j;
        this.f = obj;
        this.d = qim0Var;
        this.e = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.e;
        Object obj3 = this.f;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ((Number) obj2).intValue();
                int iP = czo1.p(i | 1);
                float f = this.c;
                long j = this.b;
                r4o1.r(f, j, (String) obj3, this.d, (b0k) obj, iP);
                break;
            case 1:
                ((Number) obj2).intValue();
                int iP2 = czo1.p(i | 1);
                y4o1.b((c380) obj3, this.b, this.c, this.d, (b0k) obj, iP2);
                break;
            case 2:
                ((Number) obj2).intValue();
                int iP3 = czo1.p(i | 1);
                y4o1.j((zud) obj3, this.b, this.c, this.d, (b0k) obj, iP3);
                break;
            default:
                ((Number) obj2).intValue();
                int iP4 = czo1.p(i | 1);
                float f2 = this.c;
                long j2 = this.b;
                luo1.k(f2, j2, (cr31) obj3, this.d, (b0k) obj, iP4);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ uud(Object obj, long j, float f, qim0 qim0Var, int i, byte b) {
        super(2);
        this.a = b;
        this.f = obj;
        this.b = j;
        this.c = f;
        this.d = qim0Var;
        this.e = i;
    }
}
