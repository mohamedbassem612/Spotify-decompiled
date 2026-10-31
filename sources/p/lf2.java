package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class lf2 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Function0 c;
    public final /* synthetic */ Function0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lf2(boolean z, Function0 function0, Function0 function1, byte b) {
        super(2);
        this.a = b;
        switch (b) {
            case 1:
                this.b = z;
                this.c = function0;
                this.d = function1;
                super(2);
                break;
            default:
                this.b = z;
                this.c = function0;
                this.d = function1;
                break;
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        Function0 function0 = this.d;
        Function0 function1 = this.c;
        rih1 rih1Var = rih1.a;
        boolean z = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else if (!z) {
                    x340Var2.i0(-1493753514);
                    si1.d(this.d, (qim0) null, (yf) null, x340Var2, 0, 6);
                    x340Var2.r(false);
                } else {
                    x340Var2.i0(-1493834827);
                    si1.g(this.c, (qim0) null, (yf) null, x340Var2, 0, 6);
                    x340Var2.r(false);
                }
                break;
            case 1:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x340Var4.b0();
                } else {
                    cgj1.n(u291.d(nim0.a, 1.0f), (vu30) null, (vu30) null, (vu30) null, (vu30) null, 0, u7h.j, 0L, new mn20(0, 0, 0, 0), apo.r(-30520086, new o3(z, function1, function0, (byte) 7), x340Var4), x340Var4, 805306368, 190);
                }
                break;
            case 2:
                ((Number) obj2).intValue();
                wyo1.b(z, function1, function0, (b0k) obj, czo1.p(1));
                break;
            default:
                ((Number) obj2).intValue();
                vby0.f(z, function1, function0, (b0k) obj, czo1.p(1));
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lf2(boolean z, Function0 function0, Function0 function1, int i, byte b) {
        super(2);
        this.a = b;
        this.b = z;
        this.c = function0;
        this.d = function1;
    }
}
