package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class tgd extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ wux b;
    public final /* synthetic */ jgd c;
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tgd(wux wuxVar, jgd jgdVar, int i, byte b) {
        super(2);
        this.a = b;
        this.b = wuxVar;
        this.c = jgdVar;
        this.d = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.d;
        jgd jgdVar = this.c;
        wux wuxVar = this.b;
        b0k b0kVar = (b0k) obj;
        ((Number) obj2).intValue();
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                xyn1.h(wuxVar, jgdVar, b0kVar, czo1.p(i | 1));
                break;
            default:
                xyn1.l(wuxVar, jgdVar, b0kVar, czo1.p(i | 1));
                break;
        }
        return rih1Var;
    }
}
