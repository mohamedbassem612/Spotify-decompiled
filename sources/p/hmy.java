package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class hmy extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 2;
    public final /* synthetic */ String b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ iu30 d;
    public final /* synthetic */ qim0 e;
    public final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hmy(String str, int i, boolean z, iu30 iu30Var, qim0 qim0Var, int i2) {
        super(2);
        this.b = str;
        this.f = i;
        this.c = z;
        this.d = iu30Var;
        this.e = qim0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        int i = this.f;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ((Number) obj2).intValue();
                y1a1.i(czo1.p(i | 1), this.b, (b0k) obj, this.d, this.e, this.c);
                break;
            case 1:
                ((Number) obj2).intValue();
                ajo1.e(czo1.p(i | 1), this.b, (b0k) obj, this.d, this.e, this.c);
                break;
            default:
                ((Number) obj2).intValue();
                qim0 qim0Var = this.e;
                int iP = czo1.p(1);
                foo1.j(this.b, this.f, this.c, this.d, qim0Var, (b0k) obj, iP);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hmy(String str, boolean z, iu30 iu30Var, qim0 qim0Var, int i) {
        super(2);
        this.b = str;
        this.c = z;
        this.d = iu30Var;
        this.e = qim0Var;
        this.f = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hmy(String str, boolean z, qim0 qim0Var, iu30 iu30Var, int i) {
        super(2);
        this.b = str;
        this.c = z;
        this.e = qim0Var;
        this.d = iu30Var;
        this.f = i;
    }
}
