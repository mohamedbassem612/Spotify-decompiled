package p;

import androidx.compose.ui.platform.ComposeView;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class edb0 extends w611 {
    public static final /* synthetic */ int W0 = 0;
    public final hrr0 U0;
    public final hrr0 V0;

    public edb0(ComposeView composeView) {
        super(composeView);
        this.U0 = v8r.q((Object) null);
        this.V0 = v8r.q((Object) null);
        composeView.setContent(new j2i(2113956628, new ddb0(this, (byte) 1), true));
    }

    public final void E(int i, j2i j2iVar, b0k b0kVar) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(595323805);
        if (x340Var.Y(i & 1, (i & 3) != 2)) {
            nyx.a(2, (wux) null, apo.r(848817706, new ak10(j2iVar, (byte) 10), x340Var), x340Var, 3078, 6);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new vx90(this, j2iVar, i, (byte) 11);
        }
    }

    public final void F(kcb0 kcb0Var, Function0 function0, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1872586623);
        int i2 = (x340Var.i(kcb0Var) ? 4 : 2) | i | (x340Var.i(function0) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            String strK = kcb0Var.b ? x0d.k(x340Var, -35546749, 2131958996, x340Var, false) : x0d.k(x340Var, -35544030, 2131958997, x340Var, false);
            String str = kcb0Var.a.a;
            boolean z = kcb0Var.b;
            if (ihc1.y0(strK)) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return;
            }
            gbx gbxVar = new gbx(new y50(strK), function0);
            Object objT = x340Var.T();
            if (objT == fkj0.X) {
                objT = rab0.P0;
                x340Var.s0(objT);
            }
            vxo1.g(str, (if5) null, z, gbxVar, (iu30) objT, (qim0) null, (if5) null, (lax) null, x340Var, 24624, 224);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new mb90(this, kcb0Var, function0, i, (byte) 18);
        }
    }
}
