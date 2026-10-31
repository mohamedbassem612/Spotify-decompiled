package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class eev {
    public final int a;
    public final long b;
    public final int c;
    public final int d;
    public final Object e;

    public eev(int i, iv20 iv20Var, long j, int i2, int i3) {
        this.a = i;
        this.e = iv20Var;
        this.b = j;
        this.c = i2;
        this.d = i3;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0039  */
    public bv20 a(ju8 ju8Var, boolean z, int i, int i2, int i3, int i4) {
        bv20 bv20Var;
        afh0 afh0Var;
        jr80 jr80Var;
        q5t0 q5t0Var;
        if (ju8Var.b) {
            iv20 iv20Var = (iv20) this.e;
            iv20Var.getClass();
            int iC = l1d.C(2);
            boolean z2 = true;
            if (iC == 0 || iC == 1) {
                bv20Var = null;
            } else {
                if (iC != 2 && iC != 3) {
                    eg.o();
                    return null;
                }
                if (z) {
                    afh0Var = iv20Var.a;
                    jr80Var = iv20Var.e;
                    q5t0Var = iv20Var.b;
                } else {
                    afh0Var = (i < -1 || i2 < 0) ? null : iv20Var.c;
                    jr80Var = iv20Var.f;
                    q5t0Var = iv20Var.d;
                }
                if (afh0Var == null) {
                    bv20Var = null;
                } else {
                    jr80Var.getClass();
                    bv20Var = new bv20(afh0Var, q5t0Var, jr80Var.a);
                }
            }
            if (bv20Var != null) {
                if (i < 0 || (i4 != 0 && (i3 - ((int) (bv20Var.c >> 32)) < 0 || i4 >= this.a))) {
                    z2 = false;
                }
                bv20Var.d = z2;
                return bv20Var;
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x005b, code lost:
    
        if ((((int) (r26 >> 32)) - ((int) (r8 >> 32))) < 0) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public p.ju8 b(boolean r24, int r25, long r26, p.jr80 r28, int r29, int r30, int r31, boolean r32, boolean r33) {
        /*
            Method dump skipped, instruction units count: 255
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.eev.b(boolean, int, long, p.jr80, int, int, int, boolean, boolean):p.ju8");
    }

    public eev(int i, int i2, int i3, long j, String str) {
        this.e = str;
        this.c = i;
        this.a = i2;
        this.d = i3;
        this.b = j;
    }
}
