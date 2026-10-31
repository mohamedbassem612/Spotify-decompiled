package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class h311 {
    public i311 a;
    public int b;
    public s340 c;
    public vu30 d;
    public int e;
    public sdn0 f;
    public nen0 g;

    public h311(i311 i311Var) {
        this.a = i311Var;
    }

    public final boolean a() {
        if (this.a != null) {
            s340 s340Var = this.c;
            if (s340Var != null ? s340Var.a() : false) {
                return true;
            }
        }
        return false;
    }

    public final void b() {
        i311 i311Var = this.a;
        if (i311Var != null) {
            i311Var.g(this, null);
        }
    }

    public final int c(Object obj) {
        int iG;
        i311 i311Var = this.a;
        if (i311Var == null || (iG = i311Var.g(this, obj)) == 0) {
            return 1;
        }
        return iG;
    }

    public final void d() {
        i311 i311Var = this.a;
        if (i311Var != null) {
            i311Var.b();
        }
        this.a = null;
        this.f = null;
        this.g = null;
        this.d = null;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0053 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:23:0x0055 A[LOOP:0: B:10:0x001b->B:23:0x0055, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:32:0x0058 A[EDGE_INSN: B:32:0x0058->B:24:0x0058 BREAK  A[LOOP:0: B:10:0x001b->B:23:0x0055], SYNTHETIC] */
    public final void e() {
        sdn0 sdn0Var;
        i311 i311Var = this.a;
        if (i311Var == null || (sdn0Var = this.f) == null) {
            return;
        }
        f(true);
        try {
            Object[] objArr = sdn0Var.b;
            int[] iArr = sdn0Var.c;
            long[] jArr = sdn0Var.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    long j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                        if (i != length) {
                            break;
                            break;
                        }
                        i++;
                    } else {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j) < 128) {
                                int i4 = (i << 3) + i3;
                                Object obj = objArr[i4];
                                int i5 = iArr[i4];
                                i311Var.f(obj);
                            }
                            j >>= 8;
                        }
                        if (i2 != 8) {
                            break;
                        } else if (i != length) {
                            break;
                        } else {
                            i++;
                        }
                    }
                }
            }
        } finally {
            f(false);
        }
    }

    public final void f(boolean z) {
        int i = this.b;
        this.b = z ? i | 32 : i & (-33);
    }

    public final void g(vu30 vu30Var) {
        this.d = vu30Var;
    }
}
