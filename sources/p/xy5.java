package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class xy5 extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ pt b;
    public final /* synthetic */ ez5 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xy5(pt ptVar, ez5 ez5Var) {
        super(2);
        this.b = ptVar;
        this.c = ez5Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        ez5 ez5Var = this.c;
        pt ptVar = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ((Number) obj2).intValue();
                ptVar.h(ez5Var, (b0k) obj, czo1.p(1));
                break;
            default:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    otw.c((p40) ptVar.h, l1d.m("spotify:atv-pin-entry:", ez5Var.a), (qim0) null, (ipb1) null, x340Var2, 0, 12);
                }
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xy5(pt ptVar, ez5 ez5Var, int i) {
        super(2);
        this.b = ptVar;
        this.c = ez5Var;
    }
}
