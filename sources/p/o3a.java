package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class o3a extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 2;
    public final /* synthetic */ String b;
    public final /* synthetic */ qim0 c;
    public final /* synthetic */ long d;
    public final /* synthetic */ lee1 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o3a(String str, qim0 qim0Var, long j, lee1 lee1Var, int i) {
        super(2);
        this.b = str;
        this.c = qim0Var;
        this.d = j;
        this.e = lee1Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ((Number) obj2).intValue();
                long j = this.d;
                b6p1.b(czo1.p(1), j, this.b, (b0k) obj, this.c, this.e);
                break;
            case 1:
                ((Number) obj2).intValue();
                lee1 lee1Var = this.e;
                j2p1.g(czo1.p(1), this.d, this.b, (b0k) obj, this.c, lee1Var);
                break;
            default:
                ((Number) obj2).intValue();
                qim0 qim0Var = this.c;
                vz31.a(czo1.p(1), this.d, this.b, (b0k) obj, qim0Var, this.e);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o3a(String str, qim0 qim0Var, lee1 lee1Var, long j, int i) {
        super(2);
        this.b = str;
        this.c = qim0Var;
        this.e = lee1Var;
        this.d = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o3a(String str, lee1 lee1Var, long j, qim0 qim0Var, int i) {
        super(2);
        this.b = str;
        this.e = lee1Var;
        this.d = j;
        this.c = qim0Var;
    }
}
