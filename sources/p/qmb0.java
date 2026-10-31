package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class qmb0 implements hfh0 {
    public final /* synthetic */ hfh0 a;
    public final /* synthetic */ vmb0 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ hfh0 d;

    public qmb0(hfh0 hfh0Var, vmb0 vmb0Var, int i, hfh0 hfh0Var2) {
        this.b = vmb0Var;
        this.c = i;
        this.d = hfh0Var2;
        this.a = hfh0Var;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0073 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:24:0x0075 A[LOOP:0: B:5:0x0019->B:24:0x0075, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:28:0x0078 A[EDGE_INSN: B:28:0x0078->B:25:0x0078 BREAK  A[LOOP:0: B:5:0x0019->B:24:0x0075], SYNTHETIC] */
    @Override // p.hfh0
    public final void a() {
        int i = this.c;
        vmb0 vmb0Var = this.b;
        vmb0Var.e = i;
        this.d.a();
        bfn0 bfn0Var = vmb0Var.Z;
        nen0 nen0Var = vmb0Var.Y;
        long[] jArr = nen0Var.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j = jArr[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i2 != length) {
                        break;
                        break;
                    }
                    i2++;
                } else {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j) < 128) {
                            int i5 = (i2 << 3) + i4;
                            Object obj = nen0Var.b[i5];
                            rlc1 rlc1Var = (rlc1) nen0Var.c[i5];
                            int iJ = bfn0Var.j(obj);
                            if (iJ < 0 || iJ >= vmb0Var.e) {
                                if (iJ >= 0) {
                                    Object[] objArr = bfn0Var.a;
                                    Object obj2 = objArr[iJ];
                                    objArr[iJ] = ejo1.b;
                                }
                                if (vmb0Var.t.b(obj)) {
                                    rlc1Var.dispose();
                                }
                                nen0Var.l(i5);
                            }
                        }
                        j >>= 8;
                    }
                    if (i3 != 8) {
                        break;
                    } else if (i2 != length) {
                        break;
                    } else {
                        i2++;
                    }
                }
            }
        }
        vmb0Var.g(vmb0Var.d);
    }

    @Override // p.hfh0
    public final iu30 b() {
        return this.a.b();
    }

    @Override // p.hfh0
    public final Map c() {
        return this.a.c();
    }

    @Override // p.hfh0
    public final vu30 d() {
        return this.a.d();
    }

    @Override // p.hfh0
    public final iu30 e() {
        return this.a.e();
    }

    @Override // p.hfh0
    public final int getHeight() {
        return this.a.getHeight();
    }

    @Override // p.hfh0
    public final int getWidth() {
        return this.a.getWidth();
    }
}
