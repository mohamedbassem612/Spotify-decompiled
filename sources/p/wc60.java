package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class wc60 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ hd60 b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wc60(hd60 hd60Var, float f, float f2, int i, byte b) {
        super(2);
        this.a = b;
        this.b = hd60Var;
        this.c = f;
        this.d = f2;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        float f = this.d;
        float f2 = this.c;
        hd60 hd60Var = this.b;
        b0k b0kVar = (b0k) obj;
        ((Number) obj2).intValue();
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                boo1.r(hd60Var, f2, f, b0kVar, czo1.p(7));
                break;
            default:
                boo1.r(hd60Var, f2, f, b0kVar, czo1.p(7));
                break;
        }
        return rih1Var;
    }
}
