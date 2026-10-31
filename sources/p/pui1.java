package p;

import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.DrawScope;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class pui1 extends pim0 implements m7v {
    public zgg1 O0;
    public bby P0;
    public ln00 Q0;
    public ft71 R0;

    public final void t0(lsl lslVar) {
        lslVar.s1();
        zgg1 zgg1Var = this.O0;
        oui1 oui1Var = new oui1(this, (byte) 0);
        ft71 ft71Var = this.R0;
        ygg1 ygg1VarA = zgg1Var.a(oui1Var, ft71Var.m() ? new u7h(ft71Var.f) : null, null, new oui1(this, (byte) 1));
        ft71 ft71Var2 = this.R0;
        long j = ((u7h) ygg1VarA.getValue()).a;
        p1f0 p1f0Var = ft71Var2.c;
        if (ft71Var2.n() && ((Boolean) ((hrr0) p1f0Var.g).getValue()).booleanValue()) {
            j = ((u7h) ((hrr0) p1f0Var.h).getValue()).a;
        }
        long j2 = j;
        if (ft71Var2.n()) {
            ft71Var2.f = j2;
        }
        if (u7h.c(j2) == 0.0f) {
            return;
        }
        oig1 oig1Var = this.P0.a;
        oig1 oig1Var2 = this.Q0.a;
        DrawScope.d0(lslVar, j2, 0L, 0L, 0.0f, (phc1) null, (ColorFilter) null, 126);
    }
}
