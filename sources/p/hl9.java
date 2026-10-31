package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class hl9 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hl9(int i, int i2, Function0 function0) {
        super(2);
        this.a = (byte) 7;
        this.b = i;
        this.d = function0;
        this.c = i2;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.c;
        int i2 = this.b;
        Object obj3 = this.d;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ((Number) obj2).intValue();
                f2p1.c(i2, i, (xtb0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 1:
                ((Number) obj2).intValue();
                pap1.h((llw0) obj3, i2, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
            case 2:
                ((Number) obj2).intValue();
                ((cab) obj3).k(i2, i, czo1.p(1), (b0k) obj);
                return rih1Var;
            case 3:
                ((Number) obj2).intValue();
                x2g0.h(i2, (hcx) obj3, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
            case 4:
                ((Number) obj2).intValue();
                ((y5a0) obj3).g(i2, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
            case 5:
                long j = ((yr80) obj).a;
                long j2 = ((yr80) obj2).a;
                return irn1.n0(i2 + i, 0, (ceo) obj3);
            case 6:
                ((Number) obj2).intValue();
                ((f2o0) obj3).g(i2, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
            case 7:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(1 & iIntValue, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                    return rih1Var;
                }
                String strO0 = cwl1.o0(x340Var2, i2);
                Function0 function0 = (Function0) obj3;
                if (ihc1.y0(strO0)) {
                    hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                    return null;
                }
                foo1.c(new gbx(new y50(strO0), function0), new idx(19), nim0.a, null, null, null, null, null, null, null, apo.r(272565206, new p4g0(i, (byte) 6), x340Var2), x340Var2, 0, 48, 2040);
                return rih1Var;
            default:
                ((Number) obj2).intValue();
                ((o3o0) obj3).f(i2, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hl9(int i, int i2, ceo ceoVar) {
        super(2);
        this.a = (byte) 5;
        this.b = i;
        this.c = i2;
        this.d = ceoVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hl9(int i, int i2, xtb0 xtb0Var, int i3) {
        super(2);
        this.a = (byte) 0;
        this.b = i;
        this.c = i2;
        this.d = xtb0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hl9(int i, hcx hcxVar, int i2) {
        super(2);
        this.a = (byte) 3;
        this.b = i;
        this.d = hcxVar;
        this.c = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hl9(Object obj, int i, int i2, byte b) {
        super(2);
        this.a = b;
        this.d = obj;
        this.b = i;
        this.c = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hl9(cab cabVar, int i, int i2, int i3) {
        super(2);
        this.a = (byte) 2;
        this.d = cabVar;
        this.b = i;
        this.c = i2;
    }
}
