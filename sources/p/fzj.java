package p;

import android.view.View;
import androidx.compose.ui.platform.ComposeView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class fzj extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ gzj b;
    public final /* synthetic */ hrr0 c;
    public final /* synthetic */ ComposeView d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fzj(gzj gzjVar, hrr0 hrr0Var, ComposeView composeView) {
        super(2);
        this.b = gzjVar;
        this.c = hrr0Var;
        this.d = composeView;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        View view = this.d;
        hrr0 hrr0Var = this.c;
        gzj gzjVar = this.b;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                j2i j2iVar = gzjVar.a;
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    j2i j2iVar2 = (xu30) hrr0Var.getValue();
                    if (j2iVar2 == null) {
                        while (true) {
                            j2iVar2 = null;
                            if (view != null) {
                                Object tag = view.getTag(2131428150);
                                stj stjVar = tag instanceof stj ? (stj) tag : null;
                                j2i j2iVar3 = stjVar != null ? stjVar.a : null;
                                if (j2iVar3 != null) {
                                    j2iVar2 = j2iVar3;
                                } else {
                                    ComposeView parent = view.getParent();
                                    view = parent instanceof View ? (View) parent : null;
                                }
                            }
                        }
                    }
                    if (j2iVar2 != null) {
                        x340Var2.i0(2016131797);
                        j2iVar2.invoke(j2iVar, x340Var2, 0);
                    } else {
                        x340Var2.i0(2016132556);
                        j2iVar.invoke(x340Var2, 0);
                    }
                    x340Var2.r(false);
                }
                break;
            default:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x340Var4.b0();
                } else {
                    mod.b(hhr0.a.a(gzjVar), apo.r(802097059, new fzj(hrr0Var, (ComposeView) view, gzjVar), x340Var4), x340Var4, 56);
                }
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fzj(hrr0 hrr0Var, ComposeView composeView, gzj gzjVar) {
        super(2);
        this.c = hrr0Var;
        this.d = composeView;
        this.b = gzjVar;
    }
}
