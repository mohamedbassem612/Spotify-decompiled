package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class xky extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ p3v b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ byte e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ xky(p3v p3vVar, float f, float f2, int i, int i2, byte b) {
        super(2);
        this.a = b;
        this.b = p3vVar;
        this.c = f;
        this.d = f2;
        this.e = i2;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ((Number) obj2).intValue();
                int iP = czo1.p(1);
                byte b2 = this.e;
                ha71.l(this.b, this.c, this.d, (b0k) obj, iP, b2);
                break;
            case 1:
                ((Number) obj2).intValue();
                int iP2 = czo1.p(1);
                byte b3 = this.e;
                sio1.l(this.b, this.c, this.d, (b0k) obj, iP2, b3);
                break;
            default:
                ((Number) obj2).intValue();
                int iP3 = czo1.p(1);
                byte b4 = this.e;
                ijo1.m(this.b, this.c, this.d, (b0k) obj, iP3, b4);
                break;
        }
        return rih1Var;
    }
}
