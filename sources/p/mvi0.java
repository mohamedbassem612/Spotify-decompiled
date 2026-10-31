package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class mvi0 implements afo {
    public static final g5k b = new g5k(new tfc(new cwa((byte) 18), ann0.a), new tfc(new cwa((byte) 19), rd31.a));
    public final ArrayList a = new ArrayList();

    public final b380 b(long j) {
        ArrayList arrayList = this.a;
        if (!arrayList.isEmpty()) {
            if (j >= ((bfo) arrayList.get(0)).b) {
                ArrayList arrayList2 = new ArrayList();
                for (int i = 0; i < arrayList.size(); i++) {
                    bfo bfoVar = (bfo) arrayList.get(i);
                    if (j >= bfoVar.b && j < bfoVar.d) {
                        arrayList2.add(bfoVar);
                    }
                    if (j < bfoVar.b) {
                        break;
                    }
                }
                bg11 bg11VarW = b380.w(arrayList2, b);
                v280 v280VarM = b380.m();
                for (int i2 = 0; i2 < bg11VarW.d; i2++) {
                    v280VarM.e(((bfo) bg11VarW.get(i2)).a);
                }
                return v280VarM.g();
            }
        }
        w280 w280Var = b380.b;
        return bg11.e;
    }

    public final long c(long j) {
        ArrayList arrayList = this.a;
        if (arrayList.isEmpty()) {
            return -9223372036854775807L;
        }
        if (j < ((bfo) arrayList.get(0)).b) {
            return -9223372036854775807L;
        }
        long jMax = ((bfo) arrayList.get(0)).b;
        for (int i = 0; i < arrayList.size(); i++) {
            long j2 = ((bfo) arrayList.get(i)).b;
            long j3 = ((bfo) arrayList.get(i)).d;
            if (j3 > j) {
                if (j2 > j) {
                    break;
                }
                jMax = Math.max(jMax, j2);
            } else {
                jMax = Math.max(jMax, j3);
            }
        }
        return jMax;
    }

    public final void clear() {
        this.a.clear();
    }

    public final long d(long j) {
        int i = 0;
        long jMin = -9223372036854775807L;
        while (true) {
            ArrayList arrayList = this.a;
            if (i >= arrayList.size()) {
                break;
            }
            long j2 = ((bfo) arrayList.get(i)).b;
            long j3 = ((bfo) arrayList.get(i)).d;
            if (j < j2) {
                if (jMin != -9223372036854775807L) {
                    jMin = Math.min(jMin, j2);
                    break;
                }
                jMin = j2;
                break;
            }
            if (j < j3) {
                jMin = jMin == -9223372036854775807L ? j3 : Math.min(jMin, j3);
            }
            i++;
        }
        if (jMin != -9223372036854775807L) {
            return jMin;
        }
        return Long.MIN_VALUE;
    }

    public final boolean e(bfo bfoVar, long j) {
        long j2 = bfoVar.b;
        dm5.m(j2 != -9223372036854775807L);
        dm5.m(bfoVar.c != -9223372036854775807L);
        boolean z = j2 <= j && j < bfoVar.d;
        ArrayList arrayList = this.a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (j2 >= ((bfo) arrayList.get(size)).b) {
                arrayList.add(size + 1, bfoVar);
                return z;
            }
        }
        arrayList.add(0, bfoVar);
        return z;
    }

    public final void g(long j) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.a;
            if (i >= arrayList.size()) {
                return;
            }
            long j2 = ((bfo) arrayList.get(i)).b;
            if (j > j2 && j > ((bfo) arrayList.get(i)).d) {
                arrayList.remove(i);
                i--;
            } else if (j < j2) {
                return;
            }
            i++;
        }
    }
}
