package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class lt9 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ lee1 b;
    public final /* synthetic */ float c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lt9(lee1 lee1Var, float f, int i, byte b) {
        super(2);
        this.a = b;
        this.b = lee1Var;
        this.c = f;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        float f = this.c;
        lee1 lee1Var = this.b;
        b0k b0kVar = (b0k) obj;
        ((Number) obj2).intValue();
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                n3p1.c(lee1Var, f, b0kVar, czo1.p(49));
                break;
            default:
                s9p1.o(lee1Var, f, b0kVar, czo1.p(49));
                break;
        }
        return rih1Var;
    }
}
