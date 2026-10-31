package p;

import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public abstract class lc60 {
    public static final mmr0[] a;
    public static final mmr0[] b;

    static {
        Float fValueOf = Float.valueOf(0.0f);
        long j = u7h.f;
        mmr0 mmr0Var = new mmr0(fValueOf, new u7h(u7h.b(j, 0.0f, 0.0f, 0.0f, 0.0f, 14)));
        Float fValueOf2 = Float.valueOf(0.25f);
        mmr0 mmr0Var2 = new mmr0(fValueOf2, new u7h(u7h.b(j, 0.07f, 0.0f, 0.0f, 0.0f, 14)));
        Float fValueOf3 = Float.valueOf(0.583f);
        mmr0 mmr0Var3 = new mmr0(fValueOf3, new u7h(u7h.b(j, 0.22f, 0.0f, 0.0f, 0.0f, 14)));
        mmr0 mmr0Var4 = new mmr0(Float.valueOf(0.861f), new u7h(u7h.b(j, 0.6f, 0.0f, 0.0f, 0.0f, 14)));
        mmr0 mmr0Var5 = new mmr0(Float.valueOf(0.944f), new u7h(u7h.b(j, 0.85f, 0.0f, 0.0f, 0.0f, 14)));
        Float fValueOf4 = Float.valueOf(1.0f);
        a = new mmr0[]{mmr0Var, mmr0Var2, mmr0Var3, mmr0Var4, mmr0Var5, new mmr0(fValueOf4, new u7h(u7h.b(j, 0.0f, 0.0f, 0.0f, 0.0f, 14)))};
        b = new mmr0[]{new mmr0(fValueOf, new u7h(u7h.b(j, 0.0f, 0.0f, 0.0f, 0.0f, 14))), new mmr0(fValueOf2, new u7h(u7h.b(j, 0.1f, 0.0f, 0.0f, 0.0f, 14))), new mmr0(fValueOf3, new u7h(u7h.b(j, 0.28f, 0.0f, 0.0f, 0.0f, 14))), new mmr0(Float.valueOf(0.875f), new u7h(u7h.b(j, 0.6f, 0.0f, 0.0f, 0.0f, 14))), new mmr0(Float.valueOf(0.931f), new u7h(u7h.b(j, 0.65f, 0.0f, 0.0f, 0.0f, 14))), new mmr0(fValueOf4, new u7h(u7h.b(j, 0.0f, 0.0f, 0.0f, 0.0f, 14)))};
    }

    public static final void a(int i, b0k b0kVar, qim0 qim0Var, tob1 tob1Var) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1818425235);
        int i2 = (x340Var.i(tob1Var) ? 4 : 2) | i | (x340Var.d(8.0f) ? 32 : 16) | (x340Var.i(qim0Var) ? 256 : 128);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            op71.g(x340Var, exd0.r(fc11.n(qim0Var, 4.0f, 4.0f, (hw61) null), new ja5(6.0f, b, tob1Var, (byte) 4)));
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new kc60(tob1Var, qim0Var, i, (byte) 0);
        }
    }

    public static final void b(int i, b0k b0kVar, qim0 qim0Var, tob1 tob1Var) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-2074039714);
        int i2 = (x340Var.i(tob1Var) ? 4 : 2) | i | (x340Var.d(8.0f) ? 32 : 16) | (x340Var.i(qim0Var) ? 256 : 128);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            op71.g(x340Var, exd0.r(qim0Var, new ja5(2.0f, a, tob1Var, (byte) 4)));
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new kc60(tob1Var, qim0Var, i, (byte) 1);
        }
    }

    public static final void c(int i, j2i j2iVar, b0k b0kVar, qim0 qim0Var, boolean z, boolean z2) {
        int i2;
        drr0 drr0Var;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1499276964);
        if ((i & 6) == 0) {
            i2 = (x340Var.h(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.h(z2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(qim0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(j2iVar) ? 2048 : 1024;
        }
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            uwr uwrVar = cbx.a;
            cua cuaVar = cbx.b(x340Var).f;
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0Var);
            hzj.A.getClass();
            if (x340Var.a == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(hmb0.t1);
            } else {
                x340Var.v0();
            }
            nko1.H(gfh0VarC, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            x340Var.i0(1195937987);
            if (z) {
                x340Var.i0(1195970660);
                x340Var.r(false);
                Object obj = fkj0.X;
                x340Var.i0(-1305215835);
                ContentResolver contentResolver = ((Context) x340Var.k(AndroidCompositionLocals_androidKt.b)).getContentResolver();
                boolean zG = x340Var.g(contentResolver);
                Object objT = x340Var.T();
                if (zG || objT == obj) {
                    objT = Boolean.valueOf(!(Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f) == 0.0f));
                    x340Var.s0(objT);
                }
                if (((Boolean) objT).booleanValue()) {
                    x340Var.i0(-1345651683);
                    x340Var.r(false);
                    Object objT2 = x340Var.T();
                    if (objT2 == obj) {
                        objT2 = us71.i(0.0f, x340Var);
                    }
                    drr0Var = (drr0) objT2;
                    boolean zI = x340Var.i(drr0Var);
                    Object objT3 = x340Var.T();
                    if (zI || objT3 == obj) {
                        objT3 = new j020(drr0Var, (lnm) null, (byte) 23);
                        x340Var.s0(objT3);
                    }
                    qxd0.t(rih1.a, x340Var, (vu30) objT3);
                } else {
                    x340Var.i0(-1345719914);
                    Object objT4 = x340Var.T();
                    if (objT4 == obj) {
                        objT4 = us71.i(30.0f, x340Var);
                    }
                    drr0Var = (drr0) objT4;
                    x340Var.r(false);
                }
                x340Var.r(false);
                h2c h2cVar = h2c.a;
                nim0 nim0Var = nim0.a;
                a(0, x340Var, h2cVar.b(nim0Var), drr0Var);
                b(0, x340Var, h2cVar.b(nim0Var), drr0Var);
                j2iVar.invoke(x340Var, Integer.valueOf((i2 >> 9) & 14));
                if (z2) {
                    x340Var.i0(1196487678);
                    d(h2cVar.b(nim0Var), x340Var, 0);
                    x340Var.r(false);
                } else {
                    x340Var.i0(1196585700);
                    x340Var.r(false);
                }
                x340Var.r(false);
            } else {
                x340Var.i0(1195932220);
                k4s0.i((i2 >> 9) & 14, j2iVar, x340Var, false, false);
            }
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new kq2(z, z2, qim0Var, j2iVar, i, (byte) 1);
        }
    }

    public static final void d(qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(2138798740);
        int i2 = (x340Var.d(8.0f) ? 4 : 2) | i | (x340Var.i(qim0Var) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            uwr uwrVar = cbx.a;
            avw0 avw0Var = cbx.b(x340Var).c;
            t1c.a(d1u.E(2.0f, u7h.b(u7h.f, 0.15f, 0.0f, 0.0f, 0.0f, 14), qim0Var, er31.b(8.0f)), x340Var, 0);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ns30(qim0Var, i, (byte) 8);
        }
    }
}
