package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class fg6 extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ String b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fg6(int i, long j, long j2, String str, String str2) {
        super(2);
        this.b = str;
        this.f = str2;
        this.c = j;
        this.d = j2;
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
                fho1.j(czo1.p(i | 1), this.c, this.d, this.b, (b0k) obj, (qim0) obj3);
                break;
            default:
                ((Number) obj2).intValue();
                int iP = czo1.p(i | 1);
                String str = this.b;
                i1p1.n(str, (String) obj3, this.c, this.d, (b0k) obj, iP);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fg6(String str, long j, long j2, qim0 qim0Var, int i) {
        super(2);
        this.b = str;
        this.c = j;
        this.d = j2;
        this.f = qim0Var;
        this.e = i;
    }
}
