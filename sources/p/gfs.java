package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class gfs {
    public final String a;
    public int b;
    public long c;
    public final p2i0 d;
    public boolean e;
    public boolean f;
    public final /* synthetic */ hfs g;

    public gfs(hfs hfsVar, String str, int i, p2i0 p2i0Var) {
        this.g = hfsVar;
        this.a = str;
        this.b = i;
        this.c = p2i0Var == null ? -1L : p2i0Var.d;
        if (p2i0Var == null || !p2i0Var.c()) {
            return;
        }
        this.d = p2i0Var;
    }

    public final boolean a(int i, p2i0 p2i0Var) {
        if (p2i0Var != null) {
            long j = p2i0Var.d;
            if (j != -1) {
                p2i0 p2i0Var2 = this.d;
                if (p2i0Var2 == null) {
                    return !p2i0Var.c() && j == this.c;
                }
                return j == p2i0Var2.d && p2i0Var.b == p2i0Var2.b && p2i0Var.c == p2i0Var2.c;
            }
        }
        return i == this.b;
    }

    public final boolean b(tz3 tz3Var) {
        p2i0 p2i0Var = tz3Var.d;
        sqe1 sqe1Var = tz3Var.b;
        if (p2i0Var == null) {
            return this.b != tz3Var.c;
        }
        long j = this.c;
        if (j == -1) {
            return false;
        }
        if (p2i0Var.d > j) {
            return true;
        }
        p2i0 p2i0Var2 = this.d;
        if (p2i0Var2 == null) {
            return false;
        }
        int i = p2i0Var2.b;
        int iB = sqe1Var.b(p2i0Var.a);
        int iB2 = sqe1Var.b(p2i0Var2.a);
        if (p2i0Var.d < p2i0Var2.d || iB < iB2) {
            return false;
        }
        if (iB > iB2) {
            return true;
        }
        if (!p2i0Var.c()) {
            int i2 = p2i0Var.e;
            return i2 == -1 || i2 > i;
        }
        int i3 = p2i0Var.b;
        int i4 = p2i0Var.c;
        if (i3 <= i) {
            return i3 == i && i4 > p2i0Var2.c;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0025  */
    public final void c(int i, p2i0 p2i0Var) {
        long j;
        if (this.c == -1 && i == this.b && p2i0Var != null) {
            long j2 = p2i0Var.d;
            hfs hfsVar = this.g;
            gfs gfsVar = (gfs) hfsVar.c.get(hfsVar.f);
            if (gfsVar != null) {
                j = gfsVar.c;
                if (j == -1) {
                    j = hfsVar.g + 1;
                }
            } else {
                j = hfsVar.g + 1;
            }
            if (j2 >= j) {
                this.c = j2;
            }
        }
    }

    public final boolean d(sqe1 sqe1Var, sqe1 sqe1Var2) {
        p2i0 p2i0Var;
        int i = this.b;
        if (i < sqe1Var.o()) {
            hfs hfsVar = this.g;
            oqe1 oqe1Var = hfsVar.a;
            sqe1Var.m(i, oqe1Var);
            int i2 = oqe1Var.n;
            while (true) {
                if (i2 > oqe1Var.o) {
                    i = -1;
                    break;
                }
                int iB = sqe1Var2.b(sqe1Var.l(i2));
                if (iB != -1) {
                    i = sqe1Var2.f(iB, hfsVar.b, false).c;
                    break;
                }
                i2++;
            }
        } else if (i >= sqe1Var2.o()) {
            i = -1;
            break;
        }
        this.b = i;
        return i != -1 && ((p2i0Var = this.d) == null || sqe1Var2.b(p2i0Var.a) != -1);
    }
}
