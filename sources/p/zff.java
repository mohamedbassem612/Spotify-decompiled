package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class zff extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ qim0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zff(String str, String str2, boolean z, qim0 qim0Var, int i) {
        super(2);
        this.b = str;
        this.c = str2;
        this.d = z;
        this.e = qim0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ((Number) obj2).intValue();
                String str = this.c;
                hso1.r(czo1.p(1), this.b, str, (b0k) obj, this.e, this.d);
                break;
            default:
                ((Number) obj2).intValue();
                qim0 qim0Var = this.e;
                u4p1.D(czo1.p(1), this.b, this.c, (b0k) obj, qim0Var, this.d);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zff(qim0 qim0Var, boolean z, String str, String str2, int i) {
        super(2);
        this.e = qim0Var;
        this.d = z;
        this.b = str;
        this.c = str2;
    }
}
