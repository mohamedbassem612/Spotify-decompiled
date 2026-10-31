package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public abstract class hb60 {
    public static final c380 a = mqo1.A(p7h.M(new Integer[]{50, 60, 75, 85, 96, 110, 125, 150}));
    public static final ajc0 b = new ajc0(z860.f);

    /* JADX WARN: Code duplicated, block: B:41:0x0072  */
    public static final void a(String str, long j, fb60 fb60Var, qim0 qim0Var, ajc0 ajc0Var, int i, b0k b0kVar, int i2, int i3) {
        int i4;
        int i5;
        b0k b0kVar2;
        int i6;
        ajc0 ajc0Var2 = ajc0Var;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-2086470797);
        if ((i2 & 6) == 0) {
            i4 = (b0kVar3.g(str) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= b0kVar3.f(j) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= b0kVar3.g(fb60Var) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= b0kVar3.i(qim0Var) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            if ((i3 & 16) != 0) {
                i6 = 8192;
            } else {
                if ((32768 & i2) == 0 ? b0kVar3.g(ajc0Var2) : b0kVar3.i(ajc0Var2)) {
                    i6 = 16384;
                } else {
                    i6 = 8192;
                }
            }
            i4 |= i6;
        }
        if ((196608 & i2) == 0) {
            if ((i3 & 32) == 0) {
                i5 = i;
                int i7 = b0kVar3.e(i5) ? 131072 : 65536;
                i4 |= i7;
            } else {
                i5 = i;
            }
            i4 |= i7;
        } else {
            i5 = i;
        }
        if (b0kVar3.Y(i4 & 1, (74899 & i4) != 74898)) {
            b0kVar3.d0();
            if ((i2 & 1) == 0 || b0kVar3.E()) {
                if ((i3 & 16) != 0) {
                    i4 &= -57345;
                    ajc0Var2 = b;
                }
                if ((i3 & 32) != 0) {
                    i4 &= -458753;
                    i5 = 5;
                }
            } else {
                b0kVar3.b0();
                if ((i3 & 16) != 0) {
                    i4 &= -57345;
                }
                if ((i3 & 32) != 0) {
                    i4 &= -458753;
                }
            }
            b0kVar3.s();
            uwr uwrVar = cbx.a;
            Object obj = ajx.a.b;
            ibx ibxVarP = bno1.p(b0kVar3);
            int iIntValue = ((Number) ajc0Var2.a.invoke(ef.b(b0kVar3))).intValue();
            s61 s61Var = new s61(fb60Var.a, fb60Var.b, fb60Var.c, 50.0f, a);
            Object objT = b0kVar3.T();
            if (objT == fkj0.X) {
                objT = z860.g;
                b0kVar3.s0(objT);
            }
            b0kVar2 = b0kVar3;
            zmo1.e(str, s161.b(qim0Var, false, (iu30) objT), ibxVarP, j, new a0e1(i5), (mhc0) null, 2, false, iIntValue, s61Var, (iu30) null, b0kVar2, (i4 & 14) | 512 | ((i4 << 6) & 7168) | ((i4 >> 3) & 57344), 1184);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        ajc0 ajc0Var3 = ajc0Var2;
        int i8 = i5;
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new gb60(str, j, fb60Var, qim0Var, ajc0Var3, i8, i2, i3);
        }
    }
}
