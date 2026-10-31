package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class xuf1 {
    public final ynb0 a;
    public final ful0 b;

    public xuf1(ynb0 ynb0Var, avf1 avf1Var) {
        this.a = ynb0Var;
        Set set = s4b1.f;
        String strZ = uic.B(avf1Var.b).z();
        strZ = strZ == null ? "" : strZ;
        if (avf1Var.c.equals(cvf1.a)) {
            this.b = new ful0(strZ);
        } else {
            eg.o();
            throw null;
        }
    }
}
