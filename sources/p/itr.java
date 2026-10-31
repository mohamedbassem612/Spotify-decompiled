package p;

import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.DrawScope;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class itr extends pim0 implements m7v {
    public final idn0 O0;
    public boolean P0;
    public boolean Q0;
    public boolean R0;

    public itr(idn0 idn0Var) {
        this.O0 = idn0Var;
    }

    public final void t0(lsl lslVar) {
        lslVar.s1();
        if (this.P0) {
            DrawScope.d0(lslVar, u7h.b(u7h.b, 0.3f, 0.0f, 0.0f, 0.0f, 14), 0L, lslVar.j(), 0.0f, (phc1) null, (ColorFilter) null, 122);
        } else if (this.Q0 || this.R0) {
            DrawScope.d0(lslVar, u7h.b(u7h.b, 0.1f, 0.0f, 0.0f, 0.0f, 14), 0L, lslVar.j(), 0.0f, (phc1) null, (ColorFilter) null, 122);
        }
    }

    public final void z1() {
        fn31.T(v1(), (o8n) null, 0, new n1o(this, (lnm) null, (byte) 15), 3);
    }
}
