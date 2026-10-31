package p;

import android.graphics.Bitmap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class a4d implements xpw {
    public final q4d a;
    public final qj0 b;
    public final sj30 c;
    public final ljm0 d = h7w.B(jpc.S0, (o8n) null, (iu30) null, new hp9(this, (byte) 18), 6);
    public final eih1 e = new eih1();
    public final psw f;

    public a4d(q4d q4dVar, qj0 qj0Var, sj30 sj30Var) {
        this.a = q4dVar;
        this.b = qj0Var;
        this.c = sj30Var;
        j2i j2iVar = new j2i(-666491967, new zk9(this, (byte) 25), true);
        ien0 ien0Var = qsw.a;
        this.f = new psw(j2iVar, (byte) 0);
    }

    public final rqw a() {
        return this.e;
    }

    public final jsw c() {
        return this.f;
    }

    public final void e(Function0 function0, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-428869144);
        int i2 = (x340Var.i(function0) ? 4 : 2) | i | (x340Var.i(this) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            otw.c(this.b, new l4d(function0), (qim0) null, (ipb1) null, x340Var, 0, 12);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new hj8(this, function0, i, (byte) 26);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final void f(vg41 vg41Var, boolean z, boolean z2, v3d v3dVar, j2i j2iVar, dmw0 dmw0Var, vu30 vu30Var, iu30 iu30Var, iu30 iu30Var2, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        int i2;
        a4d a4dVar;
        x340 x340Var;
        tob1 tob1Var;
        ven0 ven0Var;
        v3d v3dVar2;
        x340 x340Var2;
        x340 x340Var3 = (x340) b0kVar;
        x340Var3.k0(-1450305766);
        if ((i & 6) == 0) {
            i2 = (x340Var3.e(vg41Var.ordinal()) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var3.h(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var3.h(z2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var3.i(v3dVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= x340Var3.i(j2iVar) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= x340Var3.e(dmw0Var.ordinal()) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= x340Var3.i(vu30Var) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= x340Var3.i(iu30Var) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i2 |= x340Var3.i(iu30Var2) ? 67108864 : 33554432;
        }
        if ((805306368 & i) == 0) {
            i2 |= x340Var3.i(this) ? 536870912 : 268435456;
        }
        int i3 = i2;
        if (x340Var3.Y(i3 & 1, (i3 & 306783379) != 306783378)) {
            Object objT = x340Var3.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = v8r.q(null);
                x340Var3.s0(objT);
            }
            ven0 ven0Var2 = (ven0) objT;
            Object objT2 = x340Var3.T();
            if (objT2 == m4cVar) {
                objT2 = v8r.q(null);
                x340Var3.s0(objT2);
            }
            ven0 ven0Var3 = (ven0) objT2;
            Object objT3 = x340Var3.T();
            if (objT3 == m4cVar) {
                objT3 = v8r.q(null);
                x340Var3.s0(objT3);
            }
            tob1 tob1Var2 = (ven0) objT3;
            Object objT4 = x340Var3.T();
            if (objT4 == m4cVar) {
                objT4 = v8r.q(null);
                x340Var3.s0(objT4);
            }
            tob1 tob1Var3 = (ven0) objT4;
            boolean zI = x340Var3.i(ven0Var3);
            Object objT5 = x340Var3.T();
            if (zI || objT5 == m4cVar) {
                objT5 = new cy7(ven0Var3, (byte) 12);
                x340Var3.s0(objT5);
            }
            qxd0.i(rih1.a, (iu30) objT5, x340Var3);
            gmw0 gmw0Var = (gmw0) ven0Var2.getValue();
            boolean zI2 = x340Var3.i(v3dVar) | x340Var3.i(ven0Var3) | x340Var3.i(ven0Var2) | x340Var3.i(tob1Var2) | x340Var3.i(tob1Var3) | x340Var3.i(this);
            Object objT6 = x340Var3.T();
            if (zI2 || objT6 == m4cVar) {
                tob1Var = tob1Var2;
                ven0Var = ven0Var2;
                objT6 = new df6(v3dVar, this, ven0Var3, ven0Var, tob1Var, tob1Var3, (lnm) null, (byte) 4);
                tob1Var3 = tob1Var3;
                v3dVar2 = v3dVar;
                x340Var3.s0(objT6);
            } else {
                v3dVar2 = v3dVar;
                tob1Var = tob1Var2;
                ven0Var = ven0Var2;
            }
            qxd0.s(v3dVar2, gmw0Var, (vu30) objT6, x340Var3);
            Bitmap bitmap = (Bitmap) ven0Var3.getValue();
            v3d v3dVar3 = (v3d) tob1Var.getValue();
            ur80 ur80Var = (ur80) tob1Var3.getValue();
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(x340Var3.T);
            xos0 xos0VarM = x340Var3.m();
            nim0 nim0Var = nim0.a;
            qim0 qim0VarE = zr7.E(x340Var3, nim0Var);
            hzj.A.getClass();
            if (x340Var3.a == null) {
                tgp1.p();
                throw null;
            }
            x340Var3.m0();
            if (x340Var3.S) {
                x340Var3.l(hmb0.t1);
            } else {
                x340Var3.v0();
            }
            nko1.H(gfh0VarC, x340Var3, y580.O0);
            nko1.H(xos0VarM, x340Var3, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var3, y580.R0);
            nko1.F(x340Var3);
            nko1.H(qim0VarE, x340Var3, y580.Y);
            if (bitmap == null || v3dVar3 == null || ur80Var == null) {
                a4dVar = this;
                x340Var2 = x340Var3;
                if (z2) {
                    x340Var2.i0(-757298328);
                    qim0 qim0VarD = u291.d(nim0Var, 1.0f);
                    boolean zI3 = x340Var2.i(a4dVar);
                    Object objT7 = x340Var2.T();
                    if (zI3 || objT7 == m4cVar) {
                        objT7 = new s3d(a4dVar, (byte) 0);
                        x340Var2.s0(objT7);
                    }
                    qim0 qim0VarX = ern1.x(qim0VarD, (iu30) objT7);
                    Object objT8 = x340Var2.T();
                    if (objT8 == m4cVar) {
                        objT8 = jpc.R0;
                        x340Var2.s0(objT8);
                    }
                    iu30 iu30Var3 = (iu30) objT8;
                    boolean zI4 = x340Var2.i(ven0Var) | ((i3 & 458752) == 131072) | ((i3 & 29360128) == 8388608) | ((i3 & 234881024) == 67108864);
                    Object objT9 = x340Var2.T();
                    if (zI4 || objT9 == m4cVar) {
                        objT9 = new db(dmw0Var, iu30Var, iu30Var2, ven0Var, (byte) 24);
                        x340Var2.s0(objT9);
                    }
                    dm5.a(iu30Var3, qim0VarX, (iu30) objT9, x340Var2, 6, 0);
                    x340Var2.r(false);
                } else {
                    x340Var2.i0(-756711870);
                    x340Var2.r(false);
                }
            } else {
                x340Var3.i0(-757510306);
                g(bitmap, v3dVar3, ur80Var, x340Var3, (i3 >> 18) & 7168);
                a4dVar = this;
                x340Var2 = x340Var3;
                x340Var2.r(false);
            }
            boolean zI5 = x340Var2.i(a4dVar);
            Object objT10 = x340Var2.T();
            if (zI5 || objT10 == m4cVar) {
                objT10 = new s3d(a4dVar, (byte) 1);
                x340Var2.s0(objT10);
            }
            int i4 = i3 >> 6;
            int i5 = ((i3 << 3) & 112) | (i4 & 896) | (i4 & 57344);
            int i6 = i3 << 12;
            x340 x340Var4 = x340Var2;
            vvm1.l(null, vg41Var, j2iVar, (iu30) objT10, vu30Var, z, z2, x340Var4, i5 | (i6 & 458752) | (i6 & 3670016));
            x340Var = x340Var4;
            x340Var.r(true);
        } else {
            a4dVar = this;
            x340Var = x340Var3;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new t3d(a4dVar, vg41Var, z, z2, v3dVar, j2iVar, dmw0Var, vu30Var, iu30Var, iu30Var2, i);
        }
    }

    public final void g(Bitmap bitmap, v3d v3dVar, ur80 ur80Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1082739795);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(bitmap) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(v3dVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(ur80Var) ? 256 : 128;
        }
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            nim0 nim0Var = nim0.a;
            qim0 qim0VarD = u291.d(nim0Var, 1.0f);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarD);
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
            cwl1.g(new yk4(bitmap), (String) null, u291.d(nim0Var, 1.0f), mif1.P0, 0, x340Var, 48, 232);
            vno1.a(v3dVar, ur80Var, (qim0) null, x340Var, (i2 >> 3) & 126);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new vqa(i, this, bitmap, v3dVar, ur80Var, (byte) 12);
        }
    }

    public final mqw getBehavior() {
        return this.d;
    }
}
