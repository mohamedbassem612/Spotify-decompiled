package p;

import android.net.Uri;
import androidx.compose.ui.graphics.ColorFilter;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class xb6 extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ zm7 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xb6(zm7 zm7Var, byte b) {
        super(3);
        this.a = b;
        this.b = zm7Var;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        cr31 cr31Var;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        zm7 zm7Var = this.b;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj2;
                ((Number) obj3).intValue();
                an7 an7Var = zm7Var.d;
                String str = an7Var.a;
                if (an7Var.b) {
                    x340 x340Var2 = x340Var;
                    x340Var2.i0(242458659);
                    x340Var2.r(false);
                    cr31Var = er31.a;
                } else {
                    x340 x340Var3 = x340Var;
                    x340Var3.i0(242459507);
                    uwr uwrVar = cbx.a;
                    cua cuaVar = cbx.b(x340Var3).f;
                    cr31 cr31VarB = er31.b(2.0f);
                    x340Var3.r(false);
                    cr31Var = cr31VarB;
                }
                Uri uri = str != null ? Uri.parse(str) : Uri.EMPTY;
                uri.getClass();
                jsl jslVar = new jsl(zm7Var.b);
                qim0 qim0VarQ = i1p1.q(nim0.a, cr31Var);
                p3v p3vVar = new p3v(48.0f);
                hux huxVar = zm7Var.d.c;
                eso1.e(uri, jslVar, qim0VarQ, p3vVar, (zvx) null, (ecx) null, (j6m) null, (tl3) null, (ColorFilter) null, new nux(huxVar, huxVar), false, false, x340Var, 1073766400, 0, 3552);
                break;
            default:
                b0k b0kVar = (b0k) obj2;
                ((Number) obj3).intValue();
                String str2 = zm7Var.b;
                uwr uwrVar2 = cbx.a;
                uwo1.e(str2, (qim0) null, cbx.d(b0kVar).g, cbx.a(b0kVar).b.a, (a0e1) null, (iu30) null, 2, false, new cjc0(1), 0, (qx8) null, b0kVar, 0, 0, 1714);
                break;
        }
        return rih1Var;
    }
}
