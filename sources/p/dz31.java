package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class dz31 {
    public xpl1 a;
    public ArrayList b;

    public static long a(zct zctVar, long j) {
        xpl1 xpl1Var = zctVar.d;
        ArrayList arrayList = zctVar.k;
        if (xpl1Var instanceof k660) {
            return j;
        }
        int size = arrayList.size();
        long jMin = j;
        for (int i = 0; i < size; i++) {
            zct zctVar2 = (xct) arrayList.get(i);
            if (zctVar2 instanceof zct) {
                zct zctVar3 = zctVar2;
                if (zctVar3.d != xpl1Var) {
                    jMin = Math.min(jMin, a(zctVar3, ((long) zctVar3.f) + j));
                }
            }
        }
        zct zctVar4 = xpl1Var.i;
        zct zctVar5 = xpl1Var.h;
        if (zctVar != zctVar4) {
            return jMin;
        }
        long j2 = j - xpl1Var.j();
        return Math.min(Math.min(jMin, a(zctVar5, j2)), j2 - ((long) zctVar5.f));
    }

    public static long b(zct zctVar, long j) {
        xpl1 xpl1Var = zctVar.d;
        ArrayList arrayList = zctVar.k;
        if (xpl1Var instanceof k660) {
            return j;
        }
        int size = arrayList.size();
        long jMax = j;
        for (int i = 0; i < size; i++) {
            zct zctVar2 = (xct) arrayList.get(i);
            if (zctVar2 instanceof zct) {
                zct zctVar3 = zctVar2;
                if (zctVar3.d != xpl1Var) {
                    jMax = Math.max(jMax, b(zctVar3, ((long) zctVar3.f) + j));
                }
            }
        }
        zct zctVar4 = xpl1Var.h;
        zct zctVar5 = xpl1Var.i;
        if (zctVar != zctVar4) {
            return jMax;
        }
        long j2 = xpl1Var.j() + j;
        return Math.max(Math.max(jMax, b(zctVar5, j2)), j2 - ((long) zctVar5.f));
    }
}
