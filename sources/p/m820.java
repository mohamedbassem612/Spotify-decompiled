package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class m820 extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ String b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ Function0 g;
    public final /* synthetic */ idn0 h;
    public final /* synthetic */ fe5 i;
    public final /* synthetic */ qim0 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m820(int i, String str, Function0 function0, fe5 fe5Var, qim0 qim0Var, idn0 idn0Var, boolean z, boolean z2, boolean z3, boolean z4) {
        super(2);
        this.b = str;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = z4;
        this.g = function0;
        this.h = idn0Var;
        this.i = fe5Var;
        this.t = qim0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(1 & iIntValue, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    g0p1.j(0, this.b, this.g, this.i, x340Var2, this.t, this.h, this.c, this.d, this.e, this.f);
                }
                break;
            default:
                ((Number) obj2).intValue();
                g0p1.j(czo1.p(1), this.b, this.g, this.i, (b0k) obj, this.t, this.h, this.c, this.d, this.e, this.f);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m820(String str, boolean z, boolean z2, boolean z3, boolean z4, Function0 function0, idn0 idn0Var, fe5 fe5Var, qim0 qim0Var) {
        super(2);
        this.b = str;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = z4;
        this.g = function0;
        this.h = idn0Var;
        this.i = fe5Var;
        this.t = qim0Var;
    }
}
