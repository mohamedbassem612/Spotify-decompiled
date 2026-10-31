package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class iv11 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ c380 b;
    public final /* synthetic */ boolean c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ iv11(c380 c380Var, boolean z, int i, byte b) {
        super(2);
        this.a = b;
        this.b = c380Var;
        this.c = z;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        boolean z = this.c;
        c380 c380Var = this.b;
        b0k b0kVar = (b0k) obj;
        ((Number) obj2).intValue();
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                u4p1.v(czo1.p(9), b0kVar, c380Var, z);
                break;
            default:
                u4p1.v(czo1.p(9), b0kVar, c380Var, z);
                break;
        }
        return rih1Var;
    }
}
