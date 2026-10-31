package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class t260 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ String b;
    public final /* synthetic */ qim0 c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ float e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t260(String str, qim0 qim0Var, boolean z, float f, int i, byte b) {
        super(2);
        this.a = b;
        this.b = str;
        this.c = qim0Var;
        this.d = z;
        this.e = f;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ((Number) obj2).intValue();
                float f = this.e;
                int iP = czo1.p(7);
                zgo1.e(this.b, this.c, this.d, f, (b0k) obj, iP);
                break;
            default:
                ((Number) obj2).intValue();
                float f2 = this.e;
                int iP2 = czo1.p(7);
                zgo1.f(this.b, this.c, this.d, f2, (b0k) obj, iP2);
                break;
        }
        return rih1Var;
    }
}
