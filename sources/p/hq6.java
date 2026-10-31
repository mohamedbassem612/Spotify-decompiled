package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class hq6 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ qim0 d;
    public final /* synthetic */ Function0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hq6(String str, String str2, Function0 function0, qim0 qim0Var) {
        super(2);
        this.a = (byte) 4;
        this.d = qim0Var;
        this.e = function0;
        this.b = str;
        this.c = str2;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ((Number) obj2).intValue();
                zko1.a(czo1.p(1), this.b, this.c, this.e, (b0k) obj, this.d);
                break;
            case 1:
                ((Number) obj2).intValue();
                w2b.h(czo1.p(1), this.b, this.c, this.e, (b0k) obj, this.d);
                break;
            case 2:
                ((Number) obj2).intValue();
                qxy0.q(czo1.p(1), this.b, this.c, this.e, (b0k) obj, this.d);
                break;
            case 3:
                ((Number) obj2).intValue();
                luo1.g(czo1.p(1), this.b, this.c, this.e, (b0k) obj, this.d);
                break;
            case 4:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(1 & iIntValue, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    sqe.o(apo.r(892639659, new h621(this.e, (byte) 17), x340Var2), apo.r(1654520970, new b4(this.b, this.c, (byte) 22), x340Var2), u291.f(this.d, 1.0f), x340Var2, 54);
                }
                break;
            case 5:
                ((Number) obj2).intValue();
                sqe.m(czo1.p(1), this.b, this.c, this.e, (b0k) obj, this.d);
                break;
            case 6:
                ((Number) obj2).intValue();
                hyo1.h(czo1.p(1), this.b, this.c, this.e, (b0k) obj, this.d);
                break;
            default:
                ((Number) obj2).intValue();
                aq8.q(czo1.p(3073), this.b, this.c, this.e, (b0k) obj, this.d);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hq6(String str, String str2, Function0 function0, qim0 qim0Var, int i, byte b) {
        super(2);
        this.a = b;
        this.b = str;
        this.c = str2;
        this.e = function0;
        this.d = qim0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hq6(String str, String str2, qim0 qim0Var, Function0 function0, int i, byte b) {
        super(2);
        this.a = b;
        this.b = str;
        this.c = str2;
        this.d = qim0Var;
        this.e = function0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hq6(String str, Function0 function0, qim0 qim0Var, String str2, int i, byte b) {
        super(2);
        this.a = b;
        this.b = str;
        this.e = function0;
        this.d = qim0Var;
        this.c = str2;
    }
}
