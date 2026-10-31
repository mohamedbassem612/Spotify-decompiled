package p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class sw60 {
    public final n36 a = new n36();
    public e7o0 b;

    /* JADX WARN: Code duplicated, block: B:51:0x011d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:52:0x011f  */
    /* JADX WARN: Code duplicated, block: B:53:0x013e  */
    public final void a(double d, long j, long j2, long j3, long j4) {
        e7o0 e7o0Var;
        n36 n36Var = this.a;
        if (n36Var.isEmpty() || j3 >= ((rw60) n36Var.last()).d) {
            if (!n36Var.isEmpty() && j3 - ((rw60) n36Var.last()).d > j4) {
                n36Var.clear();
            }
            rw60 rw60Var = new rw60(d, j, j2, j3);
            n36Var.addLast(rw60Var);
            while (n36Var.c > 64) {
                n36Var.removeFirst();
            }
            while (!n36Var.isEmpty() && j3 - ((rw60) n36Var.first()).d > 10000) {
                n36Var.removeFirst();
            }
            e7o0 e7o0Var2 = this.b;
            if (n36Var.b() >= 10) {
                Iterator it = n36Var.iterator();
                long j5 = 0;
                while (it.hasNext()) {
                    long j6 = ((rw60) it.next()).b;
                    if (j6 > 1000) {
                        j6 = 1000;
                    }
                    j5 += j6;
                }
                if (j5 >= 2000 && (((rw60) o7h.A0(n36Var)).d - ((rw60) o7h.q0(n36Var)).d) + ((rw60) o7h.q0(n36Var)).b >= 2000) {
                    ArrayList arrayList = new ArrayList(q7h.U(n36Var, 10));
                    Iterator it2 = n36Var.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(Double.valueOf(((rw60) it2.next()).a));
                    }
                    List listZ0 = o7h.Z0(arrayList);
                    double dDoubleValue = ((Number) listZ0.get((listZ0.size() - 1) / 10)).doubleValue();
                    Iterator it3 = n36Var.iterator();
                    if (!it3.hasNext()) {
                        hhg1.k();
                        return;
                    }
                    long j7 = ((rw60) it3.next()).c;
                    while (it3.hasNext()) {
                        long j8 = ((rw60) it3.next()).c;
                        if (j7 < j8) {
                            j7 = j8;
                        }
                    }
                    e7o0Var = new e7o0(dDoubleValue, j7, rw60Var.d);
                } else if (e7o0Var2 != null) {
                    e7o0Var = new e7o0(Math.min(e7o0Var2.a, rw60Var.a), Math.max(e7o0Var2.b, rw60Var.c), e7o0Var2.c);
                } else {
                    e7o0Var = null;
                }
            } else if (e7o0Var2 != null) {
                e7o0Var = new e7o0(Math.min(e7o0Var2.a, rw60Var.a), Math.max(e7o0Var2.b, rw60Var.c), e7o0Var2.c);
            } else {
                e7o0Var = null;
            }
            this.b = e7o0Var;
        }
    }
}
