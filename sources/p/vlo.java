package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class vlo {
    public final el3 a;

    public vlo(el3 el3Var) {
        this.a = el3Var;
    }

    public final boolean a(String str) {
        Set set = s4b1.f;
        return b(uic.x(str).c);
    }

    public final boolean b(blc0 blc0Var) {
        idd1 idd1Var = this.a.a;
        int iOrdinal = blc0Var.ordinal();
        if (iOrdinal == 652) {
            return true;
        }
        if (iOrdinal == 844) {
            return ((ol4) idd1Var.getValue()).d();
        }
        if (iOrdinal != 926) {
            return false;
        }
        return ((ol4) idd1Var.getValue()).e();
    }
}
