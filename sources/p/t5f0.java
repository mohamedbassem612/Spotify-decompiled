package p;

import androidx.compose.ui.geometry.Offset;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class t5f0 extends am3 {
    public final long b(ndo0 ndo0Var, long j) {
        z5f0 z5f0VarC1 = ndo0Var.c1();
        z5f0VarC1.getClass();
        long jE0 = z5f0VarC1.E0();
        return Offset.g((((long) Float.floatToRawIntBits((int) (jE0 & 4294967295L))) & 4294967295L) | (Float.floatToRawIntBits((int) (jE0 >> 32)) << 32), j);
    }

    public final Map c(ndo0 ndo0Var) {
        z5f0 z5f0VarC1 = ndo0Var.c1();
        z5f0VarC1.getClass();
        return z5f0VarC1.A0().c();
    }

    public final int f(ndo0 ndo0Var, ul3 ul3Var) {
        z5f0 z5f0VarC1 = ndo0Var.c1();
        z5f0VarC1.getClass();
        return z5f0VarC1.U(ul3Var);
    }
}
