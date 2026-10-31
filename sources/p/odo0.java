package p;

import com.spotify.contentdelivery.mediaprocessing.NativeMediaProcessor;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class odo0 {
    public static final sdn0 a;

    static {
        sdn0 sdn0Var = kfp0.a;
        a = new sdn0();
    }

    public static final void a(pim0 pim0Var, int i, int i2) {
        if (!(pim0Var instanceof l5t)) {
            b(pim0Var, i & pim0Var.c, i2);
            return;
        }
        l5t l5tVar = (l5t) pim0Var;
        int i3 = l5tVar.O0;
        b(pim0Var, i3 & i, i2);
        int i4 = (~i3) & i;
        for (pim0 pim0Var2 = l5tVar.P0; pim0Var2 != null; pim0Var2 = pim0Var2.f) {
            a(pim0Var2, i4, i2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(pim0 pim0Var, int i, int i2) {
        if (i2 != 0 || pim0Var.w1()) {
            if ((i & 2) != 0 && (pim0Var instanceof zlb0)) {
                dio1.y((zlb0) pim0Var);
                if (i2 == 2) {
                    oap1.w(pim0Var, 2).z1();
                }
            }
            if ((i & 128) != 0 && i2 != 2) {
                oap1.B(pim0Var).F();
            }
            if ((4194304 & i) != 0 && i2 != 2) {
                oap1.B(pim0Var).V(false);
            }
            if ((i & 256) != 0 && (pim0Var instanceof mv40)) {
                if (i2 == 1) {
                    hmb0 hmb0VarB = oap1.B(pim0Var);
                    hmb0VarB.b0(hmb0VarB.o1 + 1);
                } else if (i2 == 2) {
                    hmb0 hmb0VarB2 = oap1.B(pim0Var);
                    hmb0VarB2.b0(hmb0VarB2.o1 - 1);
                }
                if (i2 != 2) {
                    hmb0 hmb0VarB3 = oap1.B(pim0Var);
                    if (hmb0VarB3.o1 != 0 && !hmb0VarB3.q() && !hmb0VarB3.r() && !hmb0VarB3.n1) {
                        ha4 ha4Var = (ha4) kmb0.a(hmb0VarB3);
                        ((rok0) ha4Var.t1.f).q(hmb0VarB3);
                        ha4Var.H(null);
                    }
                }
            }
            if ((i & 4) != 0 && (pim0Var instanceof m7v)) {
                ha71.x((m7v) pim0Var);
            }
            if ((i & 8) != 0 && (pim0Var instanceof t161)) {
                oap1.B(pim0Var).S0 = true;
            }
            if ((i & 64) != 0 && (pim0Var instanceof csr0)) {
                tho1.p((csr0) pim0Var);
            }
            if ((i & 2048) != 0 && (pim0Var instanceof iz20)) {
                iz20 iz20Var = (iz20) pim0Var;
                pfd.b = null;
                iz20Var.T0(pfd.a);
                if (pfd.b != null) {
                    i6p1.m(iz20Var);
                }
            }
            if ((i & 4096) != 0 && (pim0Var instanceof ay20)) {
                b6p1.m((ay20) pim0Var);
            }
            if ((i & 2097152) != 0 && (pim0Var instanceof va80) && i2 == 2) {
                ((va80) pim0Var).Z0();
            }
        }
    }

    public static final void c(pim0 pim0Var) {
        if (!pim0Var.N0) {
            qf80.c("autoInvalidateUpdatedNode called on unattached node");
        }
        a(pim0Var, -1, 0);
    }

    public static final int d(oim0 oim0Var) {
        int i = oim0Var instanceof xlb0 ? 3 : 1;
        if (oim0Var instanceof pxe1) {
            i |= 4;
        }
        if (oim0Var instanceof r161) {
            i |= 8;
        }
        if (oim0Var instanceof lav0) {
            i |= 16;
        }
        if (oim0Var instanceof tim0) {
            i |= 32;
        }
        if (oim0Var instanceof g6e1) {
            i |= 256;
        }
        if (oim0Var instanceof bsr0) {
            i |= 64;
        }
        return oim0Var instanceof f5c ? 524288 | i : i;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0055  */
    /* JADX WARN: Code duplicated, block: B:43:0x005b  */
    /* JADX WARN: Code duplicated, block: B:46:0x0061  */
    /* JADX WARN: Code duplicated, block: B:49:0x0067  */
    /* JADX WARN: Code duplicated, block: B:52:0x006d  */
    /* JADX WARN: Code duplicated, block: B:55:0x0073  */
    /* JADX WARN: Code duplicated, block: B:58:0x0079  */
    /* JADX WARN: Code duplicated, block: B:61:0x007f  */
    /* JADX WARN: Code duplicated, block: B:64:0x0087  */
    /* JADX WARN: Code duplicated, block: B:67:0x008e  */
    /* JADX WARN: Code duplicated, block: B:70:0x0095  */
    /* JADX WARN: Code duplicated, block: B:73:0x009c  */
    /* JADX WARN: Code duplicated, block: B:76:0x00a3  */
    public static final int e(pim0 pim0Var) {
        int i;
        int i2 = pim0Var.c;
        if (i2 != 0) {
            return i2;
        }
        Class clsD = r1p1.d(pim0Var);
        sdn0 sdn0Var = a;
        int iD = sdn0Var.d(clsD);
        if (iD >= 0) {
            return sdn0Var.c[iD];
        }
        int i3 = pim0Var instanceof zlb0 ? 3 : 1;
        if (pim0Var instanceof m7v) {
            i3 |= 4;
        }
        if (pim0Var instanceof t161) {
            i3 |= 8;
        }
        if (pim0Var instanceof mav0) {
            i3 |= 16;
        }
        if (pim0Var instanceof sim0) {
            i3 |= 32;
        }
        if (pim0Var instanceof csr0) {
            i3 |= 64;
        }
        if (!(pim0Var instanceof u5q0)) {
            if (pim0Var instanceof zkb0) {
                i = 4194432;
            } else if (pim0Var instanceof ofh0) {
                i3 |= 128;
            }
            if (pim0Var instanceof mv40) {
                i3 |= 256;
            }
            if (pim0Var instanceof v06) {
                i3 |= NativeMediaProcessor.PROCESS_SAMPLE_RESULT_SAMPLE_OFFSET_OUT_OF_BOUNDS;
            }
            if (pim0Var instanceof d030) {
                i3 |= 1024;
            }
            if (pim0Var instanceof iz20) {
                i3 |= 2048;
            }
            if (pim0Var instanceof ay20) {
                i3 |= 4096;
            }
            if (pim0Var instanceof hpa0) {
                i3 |= 8192;
            }
            if (pim0Var instanceof ba4) {
                i3 |= 16384;
            }
            if (pim0Var instanceof j4k) {
                i3 |= 32768;
            }
            if (pim0Var instanceof dpg1) {
                i3 |= 262144;
            }
            if (pim0Var instanceof f5c) {
                i3 |= 524288;
            }
            if (pim0Var instanceof wjh1) {
                i3 |= 1048576;
            }
            if (pim0Var instanceof va80) {
                i3 |= 2097152;
            }
            if (pim0Var instanceof rrb0) {
                i3 |= 8388608;
            }
            sdn0Var.g(i3, clsD);
            return i3;
        }
        i = 4194304;
        i3 |= i;
        if (pim0Var instanceof mv40) {
            i3 |= 256;
        }
        if (pim0Var instanceof v06) {
            i3 |= NativeMediaProcessor.PROCESS_SAMPLE_RESULT_SAMPLE_OFFSET_OUT_OF_BOUNDS;
        }
        if (pim0Var instanceof d030) {
            i3 |= 1024;
        }
        if (pim0Var instanceof iz20) {
            i3 |= 2048;
        }
        if (pim0Var instanceof ay20) {
            i3 |= 4096;
        }
        if (pim0Var instanceof hpa0) {
            i3 |= 8192;
        }
        if (pim0Var instanceof ba4) {
            i3 |= 16384;
        }
        if (pim0Var instanceof j4k) {
            i3 |= 32768;
        }
        if (pim0Var instanceof dpg1) {
            i3 |= 262144;
        }
        if (pim0Var instanceof f5c) {
            i3 |= 524288;
        }
        if (pim0Var instanceof wjh1) {
            i3 |= 1048576;
        }
        if (pim0Var instanceof va80) {
            i3 |= 2097152;
        }
        if (pim0Var instanceof rrb0) {
            i3 |= 8388608;
        }
        sdn0Var.g(i3, clsD);
        return i3;
    }

    public static final int f(pim0 pim0Var) {
        if (!(pim0Var instanceof l5t)) {
            return e(pim0Var);
        }
        l5t l5tVar = (l5t) pim0Var;
        int iF = l5tVar.O0;
        for (pim0 pim0Var2 = l5tVar.P0; pim0Var2 != null; pim0Var2 = pim0Var2.f) {
            iF |= f(pim0Var2);
        }
        return iF;
    }

    public static final boolean g(int i) {
        return ((i & 128) != 0) | ((i & 4194304) != 0);
    }
}
