package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class dtd1 extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ ceo c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dtd1(int i, ceo ceoVar, byte b) {
        super(3);
        this.a = b;
        this.b = i;
        this.c = ceoVar;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        ceo ceoVar = this.c;
        int i = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ((Number) obj3).intValue();
                x340 x340Var = (b0k) obj2;
                x340Var.i0(85687385);
                zfv zfvVarI = htd1.i((dhg1) obj, i, ceoVar);
                x340Var.r(false);
                return zfvVarI;
            case 1:
                ((Number) obj3).intValue();
                x340 x340Var2 = (b0k) obj2;
                x340Var2.i0(-1644644074);
                zfv zfvVarI2 = htd1.i((dhg1) obj, i, ceoVar);
                x340Var2.r(false);
                return zfvVarI2;
            case 2:
                ((Number) obj3).intValue();
                x340 x340Var3 = (b0k) obj2;
                x340Var3.i0(503936059);
                zfv zfvVarI3 = htd1.i((dhg1) obj, i, ceoVar);
                x340Var3.r(false);
                return zfvVarI3;
            case 3:
                ((Number) obj3).intValue();
                x340 x340Var4 = (b0k) obj2;
                x340Var4.i0(198469465);
                zfv zfvVarI4 = htd1.i((dhg1) obj, i, ceoVar);
                x340Var4.r(false);
                return zfvVarI4;
            case 4:
                ((Number) obj3).intValue();
                x340 x340Var5 = (b0k) obj2;
                x340Var5.i0(-2065786919);
                zfv zfvVarI5 = htd1.i((dhg1) obj, i, ceoVar);
                x340Var5.r(false);
                return zfvVarI5;
            case 5:
                ((Number) obj3).intValue();
                x340 x340Var6 = (b0k) obj2;
                x340Var6.i0(2041183415);
                zfv zfvVarI6 = htd1.i((dhg1) obj, i, ceoVar);
                x340Var6.r(false);
                return zfvVarI6;
            default:
                ((Number) obj3).intValue();
                x340 x340Var7 = (b0k) obj2;
                x340Var7.i0(1782025485);
                zfv zfvVarI7 = htd1.i((dhg1) obj, i, ceoVar);
                x340Var7.r(false);
                return zfvVarI7;
        }
    }
}
