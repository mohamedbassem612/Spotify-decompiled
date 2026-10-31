package p;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class lhl {
    public int b;
    public boolean c;
    public final cjl d;
    public final int e;
    public lhl f;
    public p6a1 i;
    public HashSet a = null;
    public int g = 0;
    public int h = Integer.MIN_VALUE;

    public lhl(cjl cjlVar, int i) {
        this.d = cjlVar;
        this.e = i;
    }

    public final void a(lhl lhlVar, int i) {
        b(lhlVar, i, Integer.MIN_VALUE, false);
    }

    public final boolean b(lhl lhlVar, int i, int i2, boolean z) {
        if (lhlVar == null) {
            j();
            return true;
        }
        if (!z && !i(lhlVar)) {
            return false;
        }
        this.f = lhlVar;
        if (lhlVar.a == null) {
            lhlVar.a = new HashSet();
        }
        HashSet hashSet = this.f.a;
        if (hashSet != null) {
            hashSet.add(this);
        }
        this.g = i;
        this.h = i2;
        return true;
    }

    public final void c(int i, ArrayList arrayList, yol1 yol1Var) {
        HashSet hashSet = this.a;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                uyn1.q(((lhl) it.next()).d, i, arrayList, yol1Var);
            }
        }
    }

    public final int d() {
        if (this.c) {
            return this.b;
        }
        return 0;
    }

    public final int e() {
        lhl lhlVar;
        if (this.d.i0 == 8) {
            return 0;
        }
        int i = this.h;
        return (i == Integer.MIN_VALUE || (lhlVar = this.f) == null || lhlVar.d.i0 != 8) ? this.g : i;
    }

    public final lhl f() {
        int i = this.e;
        int iC = l1d.C(i);
        cjl cjlVar = this.d;
        switch (iC) {
            case 0:
            case 5:
            case 6:
            case 7:
            case 8:
                return null;
            case 1:
                return cjlVar.L;
            case 2:
                return cjlVar.M;
            case 3:
                return cjlVar.J;
            case 4:
                return cjlVar.K;
            default:
                eg.f(gvg.C(i));
                return null;
        }
    }

    public final boolean g() {
        HashSet hashSet = this.a;
        if (hashSet == null) {
            return false;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (((lhl) it.next()).f().h()) {
                return true;
            }
        }
        return false;
    }

    public final boolean h() {
        return this.f != null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:46:0x0061 A[RETURN] */
    public final boolean i(lhl lhlVar) {
        if (lhlVar != null) {
            cjl cjlVar = lhlVar.d;
            int i = lhlVar.e;
            int i2 = this.e;
            if (i != i2) {
                switch (l1d.C(i2)) {
                    case 0:
                    case 7:
                    case 8:
                        break;
                    case 1:
                    case 3:
                        boolean z = i == 2 || i == 4;
                        if (!(cjlVar instanceof tq50)) {
                            return z;
                        }
                        if (z || i == 8) {
                            return true;
                        }
                        break;
                    case 2:
                    case 4:
                        boolean z2 = i == 3 || i == 5;
                        if (!(cjlVar instanceof tq50)) {
                            return z2;
                        }
                        if (z2 || i == 9) {
                            return true;
                        }
                        break;
                    case 5:
                        if (i != 2 && i != 4) {
                            return true;
                        }
                        break;
                    case 6:
                        if (i != 6 && i != 8 && i != 9) {
                            return true;
                        }
                        break;
                    default:
                        eg.f(gvg.C(i2));
                        return false;
                }
            } else if (i2 != 6 || (cjlVar.F && this.d.F)) {
                return true;
            }
        }
        return false;
    }

    public final void j() {
        HashSet hashSet;
        lhl lhlVar = this.f;
        if (lhlVar != null && (hashSet = lhlVar.a) != null) {
            hashSet.remove(this);
            if (this.f.a.size() == 0) {
                this.f.a = null;
            }
        }
        this.a = null;
        this.f = null;
        this.g = 0;
        this.h = Integer.MIN_VALUE;
        this.c = false;
        this.b = 0;
    }

    public final void k() {
        p6a1 p6a1Var = this.i;
        if (p6a1Var == null) {
            this.i = new p6a1(1);
        } else {
            p6a1Var.c();
        }
    }

    public final void l(int i) {
        this.b = i;
        this.c = true;
    }

    public final String toString() {
        return this.d.k0 + ":" + gvg.C(this.e);
    }
}
