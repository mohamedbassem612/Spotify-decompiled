package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class lwd0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ String b;
    public final /* synthetic */ lb50 c;
    public final /* synthetic */ max d;
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lwd0(String str, max maxVar, lb50 lb50Var, int i) {
        super(2);
        this.a = (byte) 0;
        this.b = str;
        this.d = maxVar;
        this.c = lb50Var;
        this.e = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.e;
        max maxVar = this.d;
        lb50 lb50Var = this.c;
        String str = this.b;
        b0k b0kVar = (b0k) obj;
        ((Number) obj2).intValue();
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                d3p1.h(czo1.p(i | 1), str, b0kVar, maxVar, lb50Var);
                break;
            case 1:
                d3p1.k(czo1.p(i | 1), str, b0kVar, maxVar, lb50Var);
                break;
            default:
                d3p1.m(czo1.p(i | 1), str, b0kVar, maxVar, lb50Var);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lwd0(String str, lb50 lb50Var, max maxVar, int i, byte b) {
        super(2);
        this.a = b;
        this.b = str;
        this.c = lb50Var;
        this.d = maxVar;
        this.e = i;
    }
}
