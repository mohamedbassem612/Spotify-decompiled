package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class mj6 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ dj6 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ yux d;
    public final /* synthetic */ float e;
    public final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mj6(dj6 dj6Var, long j, yux yuxVar, float f, int i, byte b) {
        super(2);
        this.a = b;
        this.b = dj6Var;
        this.c = j;
        this.d = yuxVar;
        this.e = f;
        this.f = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.f;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ((Number) obj2).intValue();
                int iP = czo1.p(i | 1);
                sio1.d(this.b, this.c, this.d, this.e, (b0k) obj, iP);
                break;
            default:
                ((Number) obj2).intValue();
                int iP2 = czo1.p(i | 1);
                sio1.e(this.b, this.c, this.d, this.e, (b0k) obj, iP2);
                break;
        }
        return rih1Var;
    }
}
