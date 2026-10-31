package p;

import android.net.Uri;
import androidx.compose.ui.graphics.ColorFilter;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class p27 extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ String b;
    public final /* synthetic */ xb10 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p27(String str, xb10 xb10Var, byte b) {
        super(3);
        this.a = b;
        this.b = str;
        this.c = xb10Var;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        String str = this.b;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj2;
                int iIntValue = ((Number) obj3).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 17) != 16)) {
                    x340Var2.b0();
                } else {
                    fwx fwxVarG = hso1.G(ltx.c, 0L, 0L, x340Var2, ltx.d, 30);
                    qim0 qim0VarR = d7e.r(1.0f, nim0.a, true);
                    uwr uwrVar = cbx.a;
                    cvx cvxVar = cbx.b(x340Var2).b;
                    eso1.h(oi7.a(Uri.parse(str), (gw70) null, this.c, (yqi1) null, fwxVarG, fwxVarG, false, false, (j6m) null, (iu30) null, (iu30) null, (iu30) null, 0L, x340Var2, 2359296, 0, 130966), isl.a, uyn1.z(0.0f, 4.0f, 1, qim0VarR), (p3v) null, (zvx) null, (ecx) null, (j6m) null, (tl3) null, (ColorFilter) null, x340Var2, 48, 504);
                }
                break;
            default:
                b0k b0kVar = (b0k) obj2;
                ((Number) obj3).intValue();
                eso1.h(oi7.a(Uri.parse(str), (gw70) null, this.c, (yqi1) null, (jmr0) null, (jmr0) null, false, false, (j6m) null, (iu30) null, (iu30) null, (iu30) null, 0L, b0kVar, 0, 0, 131062), isl.a, (qim0) null, (p3v) null, (zvx) null, (ecx) null, (j6m) null, (tl3) null, (ColorFilter) null, b0kVar, 48, 508);
                break;
        }
        return rih1Var;
    }
}
