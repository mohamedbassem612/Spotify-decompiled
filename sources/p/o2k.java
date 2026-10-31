package p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class o2k implements v561 {
    public final bg11 a;
    public long b;

    public o2k(List list, List list2) {
        v280 v280VarM = b380.m();
        dm5.m(list.size() == list2.size());
        for (int i = 0; i < list.size(); i++) {
            v280VarM.c(new n2k((v561) list.get(i), (List) list2.get(i)));
        }
        this.a = v280VarM.g();
        this.b = -9223372036854775807L;
    }

    @Override // p.v561
    public final long a() {
        int i = 0;
        long jMin = Long.MAX_VALUE;
        while (true) {
            bg11 bg11Var = this.a;
            if (i >= bg11Var.d) {
                break;
            }
            long jA = ((n2k) bg11Var.get(i)).a.a();
            if (jA != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jA);
            }
            i++;
        }
        if (jMin == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return jMin;
    }

    @Override // p.v561
    public final boolean b() {
        int i = 0;
        while (true) {
            bg11 bg11Var = this.a;
            if (i >= bg11Var.d) {
                return false;
            }
            if (((n2k) bg11Var.get(i)).a.b()) {
                return true;
            }
            i++;
        }
    }

    @Override // p.v561
    public final boolean i(hae0 hae0Var) {
        boolean zI;
        boolean z = false;
        do {
            long jA = a();
            if (jA == Long.MIN_VALUE) {
                return z;
            }
            int i = 0;
            zI = false;
            while (true) {
                bg11 bg11Var = this.a;
                if (i >= bg11Var.d) {
                    break;
                }
                long jA2 = ((n2k) bg11Var.get(i)).a.a();
                boolean z2 = jA2 != Long.MIN_VALUE && jA2 <= hae0Var.a;
                if (jA2 == jA || z2) {
                    zI |= ((n2k) bg11Var.get(i)).a.i(hae0Var);
                }
                i++;
            }
            z |= zI;
        } while (zI);
        return z;
    }

    @Override // p.v561
    public final long x() {
        int i = 0;
        long jMin = Long.MAX_VALUE;
        long jMin2 = Long.MAX_VALUE;
        while (true) {
            bg11 bg11Var = this.a;
            if (i >= bg11Var.d) {
                break;
            }
            n2k n2kVar = (n2k) bg11Var.get(i);
            long jX = n2kVar.a.x();
            b380 b380Var = n2kVar.b;
            if ((b380Var.contains(1) || b380Var.contains(2) || b380Var.contains(4)) && jX != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jX);
            }
            if (jX != Long.MIN_VALUE) {
                jMin2 = Math.min(jMin2, jX);
            }
            i++;
        }
        if (jMin != Long.MAX_VALUE) {
            this.b = jMin;
            return jMin;
        }
        if (jMin2 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        long j = this.b;
        return j != -9223372036854775807L ? j : jMin2;
    }

    @Override // p.v561
    public final void y(long j) {
        int i = 0;
        while (true) {
            bg11 bg11Var = this.a;
            if (i >= bg11Var.d) {
                return;
            }
            ((n2k) bg11Var.get(i)).y(j);
            i++;
        }
    }

    public o2k(v561[] v561VarArr) {
        this(b380.q(v561VarArr), Collections.nCopies(v561VarArr.length, b380.t(-1)));
    }
}
