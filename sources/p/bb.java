package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class bb extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ String b;
    public final /* synthetic */ Function0 c;
    public final /* synthetic */ Function0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bb(String str, Function0 function0, Function0 function1) {
        super(2);
        this.a = (byte) 1;
        this.b = str;
        this.c = function0;
        this.d = function1;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Function0 function0 = this.d;
        Function0 function1 = this.c;
        String str = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ((Number) obj2).intValue();
                yto1.a(str, function1, function0, (b0k) obj, czo1.p(1));
                break;
            case 1:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(1 & iIntValue, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    iqo1.d(apo.r(-1475603712, new pji(str, (byte) 14), x340Var2), apo.r(1851402655, new bvk(function1, (byte) 3), x340Var2), null, null, wei.b, apo.r(-2020441061, new bvk(function0, (byte) 4), x340Var2), x340Var2, 221238, 12);
                }
                break;
            case 2:
                ((Number) obj2).intValue();
                crm0.a(str, function1, function0, (b0k) obj, czo1.p(1));
                break;
            case 3:
                ((Number) obj2).intValue();
                uap1.a(str, function1, function0, (b0k) obj, czo1.p(1));
                break;
            case 4:
                ((Number) obj2).intValue();
                nyn1.g(str, function1, function0, (b0k) obj, czo1.p(1));
                break;
            case 5:
                ((Number) obj2).intValue();
                uvg0.a(str, function1, function0, (b0k) obj, czo1.p(1));
                break;
            case 6:
                ((Number) obj2).intValue();
                fuo1.l(str, function1, function0, (b0k) obj, czo1.p(1));
                break;
            case 7:
                ((Number) obj2).intValue();
                r2p1.f(str, function1, function0, (b0k) obj, czo1.p(1));
                break;
            case 8:
                ((Number) obj2).intValue();
                z6p1.j(str, function1, function0, (b0k) obj, czo1.p(1));
                break;
            default:
                ((Number) obj2).intValue();
                z6p1.n(str, function1, function0, (b0k) obj, czo1.p(1));
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bb(String str, Function0 function0, Function0 function1, int i, byte b) {
        super(2);
        this.a = b;
        this.b = str;
        this.c = function0;
        this.d = function1;
    }
}
