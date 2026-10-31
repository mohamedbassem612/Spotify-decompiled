package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class gjx extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ gdx b;
    public final /* synthetic */ vu30 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gjx(gdx gdxVar, vu30 vu30Var) {
        super(2);
        this.b = gdxVar;
        this.c = vu30Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        vu30 vu30Var = this.c;
        gdx gdxVar = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    wro1.j(gdxVar, vu30Var, x340Var2, 0);
                }
                break;
            default:
                ((Number) obj2).intValue();
                wro1.j(gdxVar, vu30Var, (b0k) obj, czo1.p(1));
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gjx(gdx gdxVar, vu30 vu30Var, int i) {
        super(2);
        this.b = gdxVar;
        this.c = vu30Var;
    }
}
