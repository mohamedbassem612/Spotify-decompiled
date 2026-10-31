package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class iku extends pim0 implements m7v {
    public bsb0 O0;

    public final void A1() {
        bsb0 bsb0Var = this.O0;
        bsb0Var.e();
        bsb0Var.b = null;
        bsb0Var.c = -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof iku) && u890.j(this.O0, ((iku) obj).O0);
    }

    public final int hashCode() {
        return this.O0.hashCode();
    }

    public final void t0(lsl lslVar) {
        ArrayList arrayList = this.O0.i;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            xrb0 xrb0Var = (xrb0) arrayList.get(i);
            be50 be50Var = xrb0Var.o;
            if (be50Var != null) {
                long j = xrb0Var.m;
                long j2 = be50Var.t;
                float f = ((int) (j >> 32)) - ((int) (j2 >> 32));
                float f2 = ((int) (j & 4294967295L)) - ((int) (4294967295L & j2));
                ((dg8) lslVar.a1().b).z(f, f2);
                try {
                    m5n1.r(lslVar, be50Var);
                    ((dg8) lslVar.a1().b).z(-f, -f2);
                } catch (Throwable th) {
                    ((dg8) lslVar.a1().b).z(-f, -f2);
                    throw th;
                }
            }
        }
        lslVar.s1();
    }

    public final String toString() {
        return "DisplayingDisappearingItemsNode(animator=" + this.O0 + ")";
    }

    public final void z1() {
        this.O0.j = this;
    }
}
