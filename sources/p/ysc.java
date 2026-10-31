package p;

import java.io.File;
import java.util.ArrayList;
import java.util.TreeSet;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ysc {
    public final int a;
    public final String b;
    public final TreeSet c = new TreeSet();
    public final ArrayList d = new ArrayList();
    public ypr e;

    public ysc(int i, String str, ypr yprVar) {
        this.a = i;
        this.b = str;
        this.e = yprVar;
    }

    public final void a(aw81 aw81Var) {
        this.c.add(aw81Var);
    }

    public final long b(long j, long j2) {
        dm5.m(j >= 0);
        dm5.m(j2 >= 0);
        aw81 aw81VarD = d(j, j2);
        long j3 = aw81VarD.c;
        if (!aw81VarD.d) {
            if (j3 == -1) {
                j3 = Long.MAX_VALUE;
            }
            return -Math.min(j3, j2);
        }
        long j4 = j + j2;
        long j5 = j4 >= 0 ? j4 : Long.MAX_VALUE;
        long jMax = aw81VarD.b + j3;
        if (jMax < j5) {
            for (aw81 aw81Var : this.c.tailSet(aw81VarD, false)) {
                long j6 = aw81Var.b;
                if (j6 > jMax) {
                    break;
                }
                jMax = Math.max(jMax, j6 + aw81Var.c);
                if (jMax >= j5) {
                    break;
                }
            }
        }
        return Math.min(jMax - j, j2);
    }

    public final ypr c() {
        return this.e;
    }

    public final aw81 d(long j, long j2) {
        aw81 aw81Var = new aw81(this.b, j, -1L, -9223372036854775807L, null);
        TreeSet treeSet = this.c;
        aw81 aw81Var2 = (aw81) treeSet.floor(aw81Var);
        if (aw81Var2 != null && aw81Var2.b + aw81Var2.c > j) {
            return aw81Var2;
        }
        aw81 aw81Var3 = (aw81) treeSet.ceiling(aw81Var);
        if (aw81Var3 != null) {
            long jMin = aw81Var3.b - j;
            if (j2 != -1) {
                jMin = Math.min(jMin, j2);
            }
            j2 = jMin;
        }
        return aw81.d(j, j2, this.b);
    }

    public final TreeSet e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ysc.class != obj.getClass()) {
            return false;
        }
        ysc yscVar = (ysc) obj;
        return this.a == yscVar.a && this.b.equals(yscVar.b) && this.c.equals(yscVar.c) && this.e.equals(yscVar.e);
    }

    public final boolean f() {
        return this.c.isEmpty();
    }

    public final boolean g(long j, long j2) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.d;
            if (i >= arrayList.size()) {
                return false;
            }
            xsc xscVar = (xsc) arrayList.get(i);
            long j3 = xscVar.a;
            long j4 = xscVar.b;
            if (j4 == -1) {
                if (j >= j3) {
                    return true;
                }
            } else if (j2 != -1 && j3 <= j && j + j2 <= j3 + j4) {
                return true;
            }
            i++;
        }
    }

    public final boolean h(long j, long j2) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.d;
            if (i >= arrayList.size()) {
                arrayList.add(new xsc(j, j2));
                return true;
            }
            xsc xscVar = (xsc) arrayList.get(i);
            long j3 = xscVar.a;
            if (j3 <= j) {
                long j4 = xscVar.b;
                if (j4 == -1 || j3 + j4 > j) {
                    return false;
                }
                i++;
            } else {
                if (j2 == -1 || j + j2 > j3) {
                    return false;
                }
                i++;
            }
        }
    }

    public final int hashCode() {
        return this.e.hashCode() + cy30.d(this.a * 31, 31, this.b);
    }

    public final boolean i(aw81 aw81Var) {
        if (!this.c.remove(aw81Var)) {
            return false;
        }
        File file = aw81Var.e;
        if (file == null) {
            return true;
        }
        file.delete();
        return true;
    }

    public final aw81 j(aw81 aw81Var, long j, boolean z) {
        long j2;
        File file;
        TreeSet treeSet = this.c;
        dm5.y(treeSet.remove(aw81Var));
        File file2 = aw81Var.e;
        file2.getClass();
        if (z) {
            File parentFile = file2.getParentFile();
            parentFile.getClass();
            j2 = j;
            File fileE = aw81.e(parentFile, this.a, aw81Var.b, j2);
            if (file2.renameTo(fileE)) {
                file = fileE;
            } else {
                oon1.H("Failed to rename " + file2 + " to " + fileE);
            }
            dm5.y(aw81Var.d);
            aw81 aw81Var2 = new aw81(aw81Var.a, aw81Var.b, aw81Var.c, j2, file);
            treeSet.add(aw81Var2);
            return aw81Var2;
        }
        j2 = j;
        file = file2;
        dm5.y(aw81Var.d);
        aw81 aw81Var3 = new aw81(aw81Var.a, aw81Var.b, aw81Var.c, j2, file);
        treeSet.add(aw81Var3);
        return aw81Var3;
    }

    public final void k(long j) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.d;
            if (i >= arrayList.size()) {
                bhn0.w();
                return;
            } else {
                if (((xsc) arrayList.get(i)).a == j) {
                    arrayList.remove(i);
                    return;
                }
                i++;
            }
        }
    }
}
