package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class tk6 extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ float c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tk6(c380 c380Var, int i, float f) {
        super(2);
        this.d = c380Var;
        this.b = i;
        this.c = f;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        float f = this.c;
        int i = this.b;
        Object obj3 = this.d;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ((Number) obj2).intValue();
                ajo1.o((u5t0) obj3, f, (b0k) obj, czo1.p(i | 1));
                break;
            default:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    sbl.c((r6f1) ((c380) obj3).get(i), uyn1.z(f, 0.0f, 2, nim0.a), x340Var2, 8);
                }
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tk6(u5t0 u5t0Var, float f, int i) {
        super(2);
        this.d = u5t0Var;
        this.c = f;
        this.b = i;
    }
}
