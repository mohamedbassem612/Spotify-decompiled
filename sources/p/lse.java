package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class lse extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ nse b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lse(nse nseVar, int i) {
        super(2);
        this.a = (byte) 1;
        this.b = nseVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        nse nseVar = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                nseVar.l.c(new z5o0((h0r0) obj, (c7r0) obj2));
                break;
            case 1:
                ((Number) obj2).intValue();
                nseVar.c((b0k) obj, czo1.p(1));
                break;
            default:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    nseVar.c(x340Var2, 0);
                }
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lse(nse nseVar, byte b) {
        super(2);
        this.a = b;
        this.b = nseVar;
    }
}
