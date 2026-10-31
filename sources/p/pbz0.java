package p;

import android.content.Context;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class pbz0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ sbz0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pbz0(sbz0 sbz0Var, byte b) {
        super(1);
        this.a = b;
        this.b = sbz0Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        sbz0 sbz0Var = this.b;
        switch (b) {
            case 0:
                return new lo5(sbz0Var, (byte) 3);
            case 1:
                eh4 eh4Var = sbz0Var.d.h;
                return new hcz0(-406847489, eh4Var.d(), eh4Var.k(), yoo1.w(eh4Var));
            case 2:
                int iIntValue = ((Number) obj).intValue();
                gu2 gu2Var = sbz0Var.c.e;
                if (gu2Var != null) {
                    gu2Var.invoke(Integer.valueOf(iIntValue));
                }
                return rih1Var;
            case 3:
                ixb ixbVar = (ixb) obj;
                if (ixbVar == ixb.b) {
                    sbz0Var.e(false);
                } else if (ixbVar == ixb.c) {
                    sbz0Var.c();
                }
                return rih1Var;
            default:
                tv80 tv80Var = (tv80) obj;
                Context context = sbz0Var.a;
                boolean z = sbz0Var.j;
                if (z && context.getResources().getConfiguration().orientation != 2) {
                    sbz0Var.m = tv80Var;
                    if (sbz0Var.d() && z && context.getResources().getConfiguration().orientation != 2) {
                        sbz0Var.c();
                        BottomSheetBehavior bottomSheetBehavior = sbz0Var.q;
                        if (bottomSheetBehavior != null) {
                            bottomSheetBehavior.L(6);
                        }
                    }
                }
                return rih1Var;
        }
    }
}
