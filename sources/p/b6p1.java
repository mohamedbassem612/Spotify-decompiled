package p;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import com.spotify.betamax.player.VideoSurfaceView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class b6p1 {
    public static b180 a;
    public static b180 b;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v7 */
    public static final void a(yg1 yg1Var, qim0 qim0Var, iu30 iu30Var, b0k b0kVar, int i) {
        x340 x340Var;
        Function0 function0;
        yg1 yg1Var2;
        iu30 iu30Var2 = iu30Var;
        llj lljVar = y580.Y;
        llj lljVar2 = y580.R0;
        llj lljVar3 = y580.N0;
        llj lljVar4 = y580.O0;
        m4c m4cVar = fkj0.X;
        ye1 ye1Var = yg1Var.e;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(493408022);
        j06 j06Var = x340Var2.a;
        int i2 = i | (x340Var2.g(yg1Var) ? 4 : 2) | (x340Var2.i(qim0Var) ? 32 : 16) | (x340Var2.i(iu30Var2) ? 256 : 128);
        if (x340Var2.Y(i2 & 1, (i2 & 147) != 146)) {
            ArrayList<p10> arrayList = ye1Var.b;
            uwr uwrVar = cbx.a;
            qim0 qim0VarX = uyn1.x(u291.f(dug.f(qim0Var, cbx.a(x340Var2).a.a.a(), er31.b(8.0f)), 1.0f), 16.0f);
            era eraVar = een.P0;
            mbh mbhVarA = jbh.a(h36.c, eraVar, x340Var2, 0);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0VarX);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var2.m0();
            boolean z = x340Var2.S;
            Function0 function1 = hmb0.t1;
            if (z) {
                x340Var2.l(function1);
            } else {
                x340Var2.v0();
            }
            nko1.H(mbhVarA, x340Var2, lljVar4);
            nko1.H(xos0VarM, x340Var2, lljVar3);
            x0d.q(iHashCode, x340Var2, lljVar2, x340Var2);
            nko1.H(qim0VarE, x340Var2, lljVar);
            String str = ye1Var.a;
            lee1 lee1Var = cbx.d(x340Var2).h;
            qim0 qim0Var2 = nim0.a;
            boolean z2 = 0;
            uwo1.e(str, uyn1.B(qim0Var2, 0.0f, 0.0f, 0.0f, 8.0f, 7), lee1Var, 0L, null, null, 0, false, null, 0, null, x340Var2, 0, 0, 2040);
            x340Var = x340Var2;
            mbh mbhVarA2 = jbh.a(new d36(16.0f, true, new um5(false)), eraVar, x340Var, 0);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0Var3 = qim0Var2;
            qim0 qim0VarE2 = zr7.E(x340Var, qim0Var3);
            x340Var.m0();
            if (x340Var.S) {
                function0 = function1;
                x340Var.l(function0);
            } else {
                function0 = function1;
                x340Var.v0();
            }
            nko1.H(mbhVarA2, x340Var, lljVar4);
            nko1.H(xos0VarM2, x340Var, lljVar3);
            x0d.q(iHashCode2, x340Var, lljVar2, x340Var);
            nko1.H(qim0VarE2, x340Var, lljVar);
            x340Var.i0(-1256431406);
            for (p10 p10Var : arrayList) {
                jw31 jw31VarA = ew31.a(new d36(8.0f, true, new um5(z2)), een.Z, x340Var, z2);
                int iHashCode3 = Long.hashCode(x340Var.T);
                xos0 xos0VarM3 = x340Var.m();
                qim0 qim0VarE3 = zr7.E(x340Var, qim0Var3);
                hzj.A.getClass();
                x340Var.m0();
                if (x340Var.S) {
                    x340Var.l(function0);
                } else {
                    x340Var.v0();
                }
                nko1.H(jw31VarA, x340Var, lljVar4);
                nko1.H(xos0VarM3, x340Var, lljVar3);
                x0d.q(iHashCode3, x340Var, lljVar2, x340Var);
                nko1.H(qim0VarE3, x340Var, lljVar);
                hux huxVarD = xxq0.d(p10Var.a);
                uwr uwrVar2 = cbx.a;
                x340 x340Var3 = x340Var;
                qim0 qim0Var4 = qim0Var3;
                w0h1.a(huxVarD, isl.a, u291.r(qim0Var3, 16.0f), cbx.a(x340Var).b.f, 0L, false, x340Var3, 56, 48);
                uwo1.e(p10Var.c, u291.f(anm1.N("BenefitsText", qim0Var4), 1.0f), cbx.d(x340Var3).j, 0L, new a0e1(5), null, 0, false, new cjc0(3), 0, null, x340Var3, 0, 0, 1768);
                x340Var = x340Var3;
                x340Var.r(true);
                z2 = 0;
                qim0Var3 = qim0Var4;
                function0 = function0;
            }
            qim0 qim0Var5 = qim0Var3;
            x340Var.r(z2);
            x340Var.r(true);
            if (ye1Var.c.c.length() > 0) {
                x340Var.i0(-1479382013);
                boolean z3 = ((i2 & 14) == 4) | ((i2 & 896) == 256);
                Object objT = x340Var.T();
                if (z3 || objT == m4cVar) {
                    yg1Var2 = yg1Var;
                    iu30Var2 = iu30Var;
                    objT = new ze1((byte) 1, yg1Var2, iu30Var2);
                    x340Var.s0(objT);
                } else {
                    yg1Var2 = yg1Var;
                    iu30Var2 = iu30Var;
                }
                x340 x340Var4 = x340Var;
                foo1.c(new gbx(z50.c, (Function0) objT), jdx.c, uyn1.B(qim0Var5, 0.0f, 16.0f, 0.0f, 0.0f, 13), null, null, null, null, null, null, null, apo.r(2038251590, new af1(yg1Var2, (byte) 1), x340Var), x340Var4, 0, 48, 2040);
                x340Var = x340Var4;
                x340Var.r(false);
            } else {
                iu30Var2 = iu30Var;
                x340Var.i0(-1478983198);
                x340Var.r(false);
            }
            x340Var.r(true);
        } else {
            x340Var = x340Var2;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new bf1(yg1Var, qim0Var, iu30Var2, i, (byte) 1);
        }
    }

    public static final void b(int i, long j, String str, b0k b0kVar, qim0 qim0Var, lee1 lee1Var) {
        qim0 qim0Var2;
        qim0 qim0Var3;
        qim0 qim0Var4;
        int i2;
        String strF = str;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1570429737);
        int i3 = i | (x340Var.g(strF) ? 4 : 2) | 48 | (x340Var.g(lee1Var) ? 256 : 128) | (x340Var.f(j) ? 2048 : 1024);
        boolean z = true;
        if (x340Var.Y(i3 & 1, (i3 & 1171) != 1170)) {
            x340Var.d0();
            if ((i & 1) == 0 || x340Var.E()) {
                qim0Var3 = nim0.a;
            } else {
                x340Var.b0();
                qim0Var3 = qim0Var;
            }
            x340Var.s();
            yae1 yae1VarQ = d5p1.q(0, x340Var, 1);
            int i4 = i3 & 14;
            boolean z2 = ((((i3 & 896) ^ 384) > 256 && x340Var.g(lee1Var)) || (i3 & 384) == 256) | (i4 == 4);
            Object objT = x340Var.T();
            if (z2 || objT == m4cVar) {
                List listQ0 = ihc1.Q0(strF, new String[]{" "}, 0, 6);
                if (listQ0.size() <= 1) {
                    qim0Var4 = qim0Var3;
                    i2 = i4;
                } else {
                    qim0Var4 = qim0Var3;
                    i2 = i4;
                    int i5 = (int) (yae1.b(yae1VarQ, new af5(strF), lee1Var, 0, false, 0, 0L, (flb0) null, (wat) null, (f930) null, 2044).c >> 32);
                    int size = listQ0.size();
                    float f = Float.MAX_VALUE;
                    int i6 = 0;
                    int i7 = 0;
                    while (i6 < size) {
                        int i8 = i6 + 1;
                        int i9 = i5;
                        int i10 = i6;
                        int i11 = size;
                        float fAbs = Math.abs(((int) (yae1.b(yae1VarQ, new af5(o7h.y0(o7h.d1(listQ0, i8), " ", (String) null, (String) null, (iu30) null, 62)), lee1Var, 0, false, 0, 0L, (flb0) null, (wat) null, (f930) null, 2044).c >> 32)) - (i9 / 2.0f));
                        if (fAbs < f) {
                            f = fAbs;
                            i7 = i10;
                        }
                        i5 = i9;
                        size = i11;
                        i6 = i8;
                    }
                    List list = listQ0;
                    int i12 = i7 + 1;
                    strF = f4i1.f(o7h.y0(o7h.d1(list, i12), " ", (String) null, (String) null, (iu30) null, 62), "\n", o7h.y0(o7h.k0(list, i12), " ", (String) null, (String) null, (iu30) null, 62));
                }
                objT = strF;
                x340Var.s0(objT);
            } else {
                i3 = i3;
                qim0Var4 = qim0Var3;
                z = true;
                i2 = i4;
            }
            af5 af5Var = new af5((String) objT);
            boolean z3 = i2 == 4 ? z : false;
            Object objT2 = x340Var.T();
            if (z3 || objT2 == m4cVar) {
                objT2 = new nb9(str, (byte) 8);
                x340Var.s0(objT2);
            }
            qim0 qim0Var5 = qim0Var4;
            uwo1.d(af5Var, j, s161.b(qim0Var5, false, (iu30) objT2), lee1Var, null, null, 0, false, new cjc0(2), 0, null, null, x340Var, ((i3 >> 6) & 112) | ((i3 << 3) & 7168), 0, 3824);
            qim0Var2 = qim0Var5;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new o3a(str, qim0Var2, lee1Var, j, i);
        }
    }

    public static final void c(int i, int i2, j2i j2iVar, b0k b0kVar, qim0 qim0Var) {
        int i3;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1721507927);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (x340Var.i(qim0Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if (x340Var.Y(i3 & 1, (i3 & 19) != 18)) {
            qim0 qim0Var2 = nim0.a;
            if (i4 != 0) {
                qim0Var = qim0Var2;
            }
            w2g0.c(u291.f(qim0Var2, 1.0f), een.e, apo.r(-1353905875, new ef8(qim0Var, j2iVar, (byte) 21), x340Var), x340Var, 3072, 4);
        } else {
            x340Var.b0();
        }
        qim0 qim0Var3 = qim0Var;
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new qbh(qim0Var3, j2iVar, i, i2, (byte) 0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0065  */
    /* JADX WARN: Code duplicated, block: B:39:0x006b  */
    /* JADX WARN: Code duplicated, block: B:40:0x006e  */
    /* JADX WARN: Code duplicated, block: B:44:0x007a  */
    /* JADX WARN: Code duplicated, block: B:45:0x007c  */
    /* JADX WARN: Code duplicated, block: B:48:0x0085 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:49:0x0087  */
    /* JADX WARN: Code duplicated, block: B:50:0x008a  */
    /* JADX WARN: Code duplicated, block: B:53:0x0093  */
    /* JADX WARN: Code duplicated, block: B:56:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:58:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:59:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:64:0x0105  */
    /* JADX WARN: Code duplicated, block: B:65:0x0107  */
    /* JADX WARN: Code duplicated, block: B:69:0x0110  */
    /* JADX WARN: Code duplicated, block: B:72:0x0123  */
    /* JADX WARN: Code duplicated, block: B:73:0x0138  */
    /* JADX WARN: Code duplicated, block: B:75:0x015b  */
    /* JADX WARN: Code duplicated, block: B:78:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:79:0x01be  */
    /* JADX WARN: Code duplicated, block: B:81:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:83:0x01de  */
    /* JADX WARN: Code duplicated, block: B:86:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:88:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v23 */
    public static final void d(boolean z, long j, qim0 qim0Var, bfs0 bfs0Var, j2i j2iVar, b0k b0kVar, int i, int i2) {
        int i3;
        bfs0 bfs0Var2;
        boolean z2;
        bfs0 bfs0Var3;
        h311 h311VarV;
        bfs0 bfs0Var4;
        Object objT;
        m4c m4cVar;
        gra graVar;
        gfh0 gfh0VarC;
        int iHashCode;
        xos0 xos0VarM;
        qim0 qim0VarE;
        boolean z3;
        n4k n4kVar;
        nim0 nim0Var;
        boolean z4;
        Object objT2;
        ?? r6;
        float f;
        int i4;
        j2i j2iVar2 = j2iVar;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1071657868);
        j06 j06Var = x340Var.a;
        if ((i & 6) == 0) {
            i3 = (x340Var.h(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= x340Var.f(j) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= x340Var.g(qim0Var) ? 256 : 128;
        }
        int i5 = i2 & 8;
        if (i5 == 0) {
            if ((i & 3072) == 0) {
                bfs0Var2 = bfs0Var;
                i3 |= x340Var.g(bfs0Var2) ? 2048 : 1024;
            }
            if ((i & 24576) == 0) {
                if (x340Var.i(j2iVar2)) {
                    i4 = 16384;
                } else {
                    i4 = 8192;
                }
                i3 |= i4;
            }
            if ((i3 & 9363) != 9362) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (x340Var.Y(i3 & 1, z2)) {
                if (i5 != 0) {
                    bfs0Var4 = zes0.b;
                } else {
                    bfs0Var4 = bfs0Var2;
                }
                objT = x340Var.T();
                m4cVar = fkj0.X;
                if (objT == m4cVar) {
                    objT = r5r.Z;
                    x340Var.s0(objT);
                }
                qim0 qim0VarC = i541.C(qim0Var, (iu30) objT);
                graVar = een.d;
                gfh0VarC = t1c.c(graVar, false);
                iHashCode = Long.hashCode(x340Var.T);
                xos0VarM = x340Var.m();
                qim0VarE = zr7.E(x340Var, qim0VarC);
                hzj.A.getClass();
                if (j06Var != null) {
                    tgp1.p();
                    throw null;
                }
                x340Var.m0();
                z3 = x340Var.S;
                n4kVar = hmb0.t1;
                if (z3) {
                    x340Var.l(n4kVar);
                } else {
                    x340Var.v0();
                }
                llj lljVar = y580.O0;
                nko1.H(gfh0VarC, x340Var, lljVar);
                llj lljVar2 = y580.N0;
                nko1.H(xos0VarM, x340Var, lljVar2);
                Integer numValueOf = Integer.valueOf(iHashCode);
                llj lljVar3 = y580.R0;
                nko1.H(numValueOf, x340Var, lljVar3);
                nko1.F(x340Var);
                llj lljVar4 = y580.Y;
                nko1.H(qim0VarE, x340Var, lljVar4);
                nim0Var = nim0.a;
                if (z) {
                    x340Var.i0(-1666799549);
                    qim0 qim0VarA = h2c.a.a(u291.d(nim0Var, 0.9f), een.i);
                    if ((i3 & 7168) == 2048) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    objT2 = x340Var.T();
                    if (z4 || objT2 == m4cVar) {
                        objT2 = new m4r(bfs0Var4, (byte) 7);
                        x340Var.s0(objT2);
                    }
                    qim0 qim0VarC2 = i541.C(qim0VarA, (iu30) objT2);
                    if (bfs0Var4 instanceof zes0) {
                        x340Var.i0(-1716318955);
                        uwr uwrVar = cbx.a;
                        cua cuaVar = cbx.b(x340Var).f;
                        r6 = 0;
                        x340Var.r(false);
                        f = 8.0f;
                    } else {
                        r6 = 0;
                        x340Var.i0(-1716317003);
                        uwr uwrVar2 = cbx.a;
                        cua cuaVar2 = cbx.b(x340Var).f;
                        x340Var.r(false);
                        f = 16.0f;
                    }
                    t1c.a(dug.f(qim0VarC2, j, er31.b(f)), x340Var, (int) r6);
                    x340Var.r((boolean) r6);
                } else {
                    x340Var.i0(-1666168172);
                    x340Var.r(false);
                }
                uwr uwrVar3 = cbx.a;
                cua cuaVar3 = cbx.b(x340Var).f;
                qim0 qim0VarK = sto1.k(nim0Var, er31.b(8.0f), new bw61(6.0f, u7h.b, 0.0f, (((long) Float.floatToRawIntBits(4.0f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), 0.3f, 32, 0));
                gfh0 gfh0VarC2 = t1c.c(graVar, false);
                int iHashCode2 = Long.hashCode(x340Var.T);
                xos0 xos0VarM2 = x340Var.m();
                qim0 qim0VarE2 = zr7.E(x340Var, qim0VarK);
                x340Var.m0();
                if (x340Var.S) {
                    x340Var.l(n4kVar);
                } else {
                    x340Var.v0();
                }
                nko1.H(gfh0VarC2, x340Var, lljVar);
                nko1.H(xos0VarM2, x340Var, lljVar2);
                x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
                nko1.H(qim0VarE2, x340Var, lljVar4);
                j2iVar2 = j2iVar;
                k4s0.i((i3 >> 12) & 14, j2iVar2, x340Var, true, true);
                bfs0Var3 = bfs0Var4;
            } else {
                x340Var.b0();
                bfs0Var3 = bfs0Var2;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new zsh(z, j, qim0Var, bfs0Var3, j2iVar2, i, i2);
            }
        }
        i3 |= 3072;
        bfs0Var2 = bfs0Var;
        if ((i & 24576) == 0) {
            if (x340Var.i(j2iVar2)) {
                i4 = 16384;
            } else {
                i4 = 8192;
            }
            i3 |= i4;
        }
        if ((i3 & 9363) != 9362) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (x340Var.Y(i3 & 1, z2)) {
            if (i5 != 0) {
                bfs0Var4 = zes0.b;
            } else {
                bfs0Var4 = bfs0Var2;
            }
            objT = x340Var.T();
            m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = r5r.Z;
                x340Var.s0(objT);
            }
            qim0 qim0VarC3 = i541.C(qim0Var, (iu30) objT);
            graVar = een.d;
            gfh0VarC = t1c.c(graVar, false);
            iHashCode = Long.hashCode(x340Var.T);
            xos0VarM = x340Var.m();
            qim0VarE = zr7.E(x340Var, qim0VarC3);
            hzj.A.getClass();
            if (j06Var != null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            z3 = x340Var.S;
            n4kVar = hmb0.t1;
            if (z3) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            llj lljVar5 = y580.O0;
            nko1.H(gfh0VarC, x340Var, lljVar5);
            llj lljVar6 = y580.N0;
            nko1.H(xos0VarM, x340Var, lljVar6);
            Integer numValueOf2 = Integer.valueOf(iHashCode);
            llj lljVar7 = y580.R0;
            nko1.H(numValueOf2, x340Var, lljVar7);
            nko1.F(x340Var);
            llj lljVar8 = y580.Y;
            nko1.H(qim0VarE, x340Var, lljVar8);
            nim0Var = nim0.a;
            if (z) {
                x340Var.i0(-1666799549);
                qim0 qim0VarA2 = h2c.a.a(u291.d(nim0Var, 0.9f), een.i);
                if ((i3 & 7168) == 2048) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                objT2 = x340Var.T();
                if (z4) {
                    objT2 = new m4r(bfs0Var4, (byte) 7);
                    x340Var.s0(objT2);
                } else {
                    objT2 = new m4r(bfs0Var4, (byte) 7);
                    x340Var.s0(objT2);
                }
                qim0 qim0VarC4 = i541.C(qim0VarA2, (iu30) objT2);
                if (bfs0Var4 instanceof zes0) {
                    x340Var.i0(-1716318955);
                    uwr uwrVar4 = cbx.a;
                    cua cuaVar4 = cbx.b(x340Var).f;
                    r6 = 0;
                    x340Var.r(false);
                    f = 8.0f;
                } else {
                    r6 = 0;
                    x340Var.i0(-1716317003);
                    uwr uwrVar5 = cbx.a;
                    cua cuaVar5 = cbx.b(x340Var).f;
                    x340Var.r(false);
                    f = 16.0f;
                }
                t1c.a(dug.f(qim0VarC4, j, er31.b(f)), x340Var, (int) r6);
                x340Var.r((boolean) r6);
            } else {
                x340Var.i0(-1666168172);
                x340Var.r(false);
            }
            uwr uwrVar6 = cbx.a;
            cua cuaVar6 = cbx.b(x340Var).f;
            qim0 qim0VarK2 = sto1.k(nim0Var, er31.b(8.0f), new bw61(6.0f, u7h.b, 0.0f, (((long) Float.floatToRawIntBits(4.0f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), 0.3f, 32, 0));
            gfh0 gfh0VarC3 = t1c.c(graVar, false);
            int iHashCode3 = Long.hashCode(x340Var.T);
            xos0 xos0VarM3 = x340Var.m();
            qim0 qim0VarE3 = zr7.E(x340Var, qim0VarK2);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(gfh0VarC3, x340Var, lljVar5);
            nko1.H(xos0VarM3, x340Var, lljVar6);
            x0d.q(iHashCode3, x340Var, lljVar7, x340Var);
            nko1.H(qim0VarE3, x340Var, lljVar8);
            j2iVar2 = j2iVar;
            k4s0.i((i3 >> 12) & 14, j2iVar2, x340Var, true, true);
            bfs0Var3 = bfs0Var4;
        } else {
            x340Var.b0();
            bfs0Var3 = bfs0Var2;
        }
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new zsh(z, j, qim0Var, bfs0Var3, j2iVar2, i, i2);
        }
    }

    public static final void e(r220 r220Var, qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1675502539);
        int i2 = (x340Var.g(r220Var) ? 4 : 2) | i | (x340Var.i(qim0Var) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            gfx.b(15, apo.r(-432539274, new ac80(qim0Var, r220Var), x340Var), x340Var, 54);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ac80(r220Var, qim0Var, i);
        }
    }

    public static final void f(float f, float f2, int i, int i2, b0k b0kVar, qim0 qim0Var) {
        cqz0 cqz0Var = dqz0.a;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1272462647);
        int i3 = (i2 & 6) == 0 ? (x340Var.e(i) ? 4 : 2) | i2 : i2;
        if ((i2 & 48) == 0) {
            i3 |= x340Var.d(f) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= x340Var.d(f2) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= x340Var.i(cqz0Var) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= x340Var.g(qim0Var) ? 16384 : 8192;
        }
        if (x340Var.Y(i3 & 1, (i3 & 9363) != 9362)) {
            mbh mbhVarA = jbh.a(h36.e, een.P0, x340Var, 54);
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
            nko1.H(mbhVarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            x340Var.i0(-2005669471);
            for (int i4 = 0; i4 < i; i4++) {
                t1c.a(cwl1.l0(u291.k(uyn1.z(0.0f, f2, 1, u291.f(nim0.a, (dqz0.b.e() * 0.5f) + 0.5f)), f), 0L, (hw61) null, 11), x340Var, 0);
            }
            x340Var.r(false);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new nae0(f, i, f2, qim0Var, i2);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void g(pep0 pep0Var, qim0 qim0Var, float f, float f2, dqz0 dqz0Var, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        float f3;
        float f4;
        dqz0 dqz0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-171284079);
        int i2 = i | (x340Var.g(pep0Var) ? 4 : 2) | (x340Var.g(qim0Var) ? 32 : 16) | 28032;
        if (x340Var.Y(i2 & 1, (i2 & 9363) != 9362)) {
            dqz0 dqz0Var3 = dqz0.a;
            if (pep0Var instanceof nep0) {
                x340Var.i0(-302621896);
                f(24.0f, 8.0f, 8, 3504 | ((i2 << 9) & 57344), x340Var, qim0Var);
                f4 = 8.0f;
                f3 = 24.0f;
                x340Var.r(false);
            } else {
                f4 = 8.0f;
                f3 = 24.0f;
                if (!pep0Var.equals(oep0.a)) {
                    throw p3d1.k(x340Var, -1395235873, false);
                }
                x340Var.i0(-1395227724);
                boolean zI = x340Var.i(dqz0Var3);
                Object objT = x340Var.T();
                if (zI || objT == fkj0.X) {
                    objT = new cru(24.0f, 8.0f, (byte) 4);
                    x340Var.s0(objT);
                }
                ejo1.l((i2 >> 3) & 14, 0, x340Var, (vu30) objT, qim0Var);
                x340Var.r(false);
            }
            dqz0Var2 = dqz0Var3;
        } else {
            x340Var.b0();
            f3 = f;
            f4 = f2;
            dqz0Var2 = dqz0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ub9(pep0Var, qim0Var, f3, f4, dqz0Var2, i);
        }
    }

    public static final void h(onu0 onu0Var, dnu0 dnu0Var, b0k b0kVar, int i) {
        onu0 onu0Var2;
        dnu0 dnu0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1687111329);
        int i2 = (x340Var.i(onu0Var) ? 4 : 2) | i | (x340Var.g(dnu0Var) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            onu0Var2 = onu0Var;
            dnu0Var2 = dnu0Var;
            otw.c(onu0Var2, dnu0Var2, (qim0) null, (ipb1) null, x340Var, i2 & 126, 12);
        } else {
            onu0Var2 = onu0Var;
            dnu0Var2 = dnu0Var;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new hws0(onu0Var2, dnu0Var2, i, (byte) 10);
        }
    }

    public static final void i(vy30 vy30Var, boolean z, int i, int i2, iu30 iu30Var, woa woaVar, kma kmaVar, yqg yqgVar, b0k b0kVar, int i3) {
        int i4;
        b0k b0kVar2;
        ven0 ven0Var;
        frr0 frr0Var;
        ven0 ven0Var2;
        tob1 tob1Var;
        Object gqfVar;
        ven0 ven0Var3;
        tob1 tob1Var2;
        tob1 tob1Var3;
        boolean z2;
        boolean z3;
        boolean z4;
        Long l;
        int i5;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(1576792082);
        j06 j06Var = ((x340) b0kVar3).a;
        if ((i3 & 6) == 0) {
            i4 = (b0kVar3.g(vy30Var) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= b0kVar3.h(z) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= b0kVar3.e(i) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i4 |= b0kVar3.e(i2) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i4 |= b0kVar3.i(iu30Var) ? 16384 : 8192;
        }
        if ((i3 & 196608) == 0) {
            i4 |= b0kVar3.i(woaVar) ? 131072 : 65536;
        }
        if ((i3 & 1572864) == 0) {
            i4 |= b0kVar3.i(kmaVar) ? 1048576 : 524288;
        }
        if ((i3 & 12582912) == 0) {
            i4 |= b0kVar3.g(yqgVar) ? 8388608 : 4194304;
        }
        int i6 = i4;
        if (b0kVar3.Y(i6 & 1, (i6 & 4793491) != 4793490)) {
            Object objT = b0kVar3.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = c97.b(0.0f);
                b0kVar3.s0(objT);
            }
            o95 o95Var = (o95) objT;
            Object objT2 = b0kVar3.T();
            if (objT2 == m4cVar) {
                objT2 = c97.b(0.0f);
                b0kVar3.s0(objT2);
            }
            o95 o95Var2 = (o95) objT2;
            Object objT3 = b0kVar3.T();
            if (objT3 == m4cVar) {
                objT3 = qxd0.M(o6x.a, b0kVar3);
                b0kVar3.s0(objT3);
            }
            c9n c9nVar = (c9n) objT3;
            kiv kivVar = t4k.h;
            wat watVar = (wat) b0kVar3.k(kivVar);
            kiv kivVar2 = frm.a;
            float fX0 = watVar.X0(200.0f);
            float fX1 = ((wat) b0kVar3.k(kivVar)).X0(100.0f);
            Object objT4 = b0kVar3.T();
            if (objT4 == m4cVar) {
                objT4 = v8r.q(wqj1.a);
                b0kVar3.s0(objT4);
            }
            tob1 tob1Var4 = (ven0) objT4;
            Object objT5 = b0kVar3.T();
            if (objT5 == m4cVar) {
                objT5 = v8r.q((Object) null);
                b0kVar3.s0(objT5);
            }
            ven0 ven0Var4 = (ven0) objT5;
            iac0 iac0Var = (iac0) b0kVar3.k(jfe0.a);
            Object objT6 = b0kVar3.T();
            if (objT6 == m4cVar) {
                objT6 = gio1.b(null);
                b0kVar3.s0(objT6);
            }
            wen0 wen0Var = (wen0) objT6;
            ven0 ven0VarH = rwq.h(wen0Var, b0kVar3, 0);
            Object[] objArr = new Object[0];
            Object objT7 = b0kVar3.T();
            if (objT7 == m4cVar) {
                objT7 = kvj1.c;
                b0kVar3.s0(objT7);
            }
            ven0 ven0Var5 = (ven0) k5p1.s(objArr, (Function0) objT7, b0kVar3, 48);
            Object[] objArr2 = new Object[0];
            Object objT8 = b0kVar3.T();
            if (objT8 == m4cVar) {
                objT8 = kvj1.d;
                b0kVar3.s0(objT8);
            }
            ven0 ven0Var6 = (ven0) k5p1.s(objArr2, (Function0) objT8, b0kVar3, 48);
            Object objT9 = b0kVar3.T();
            if (objT9 == m4cVar) {
                objT9 = v8r.q(Boolean.FALSE);
                b0kVar3.s0(objT9);
            }
            ven0 ven0Var7 = (ven0) objT9;
            Object objT10 = b0kVar3.T();
            if (objT10 == m4cVar) {
                objT10 = p3d1.m(((Number) ven0Var5.getValue()).longValue(), b0kVar3);
            }
            frr0 frr0Var2 = (frr0) objT10;
            Object objT11 = b0kVar3.T();
            if (objT11 == m4cVar) {
                objT11 = v8r.q(Boolean.FALSE);
                b0kVar3.s0(objT11);
            }
            ven0 ven0Var8 = (ven0) objT11;
            Object objT12 = b0kVar3.T();
            if (objT12 == m4cVar) {
                objT12 = v8r.q(Boolean.TRUE);
                b0kVar3.s0(objT12);
            }
            tob1 tob1Var5 = (ven0) objT12;
            Object objT13 = b0kVar3.T();
            if (objT13 == m4cVar) {
                objT13 = v8r.q(0);
                b0kVar3.s0(objT13);
            }
            ven0 ven0Var9 = (ven0) objT13;
            Object objT14 = b0kVar3.T();
            if (objT14 == m4cVar) {
                objT14 = new t1k1(wen0Var, tob1Var4, ven0Var6, ven0Var7);
                b0kVar3.s0(objT14);
            }
            d0u0 d0u0Var = (d0u0) objT14;
            Object[] objArr3 = {tob1Var5.getValue(), tob1Var4.getValue(), ven0Var8.getValue(), ven0Var9.getValue()};
            boolean zI = b0kVar3.i(tob1Var5) | b0kVar3.i(tob1Var4) | b0kVar3.i(ven0Var8);
            Object objT15 = b0kVar3.T();
            if (zI || objT15 == m4cVar) {
                objT15 = new gxv0(tob1Var5, tob1Var4, ven0Var8, (lnm) null);
                b0kVar3.s0(objT15);
            }
            qxd0.u(objArr3, (vu30) objT15, b0kVar3);
            k5u0 k5u0Var = (k5u0) ven0VarH.getValue();
            Object value = ven0Var8.getValue();
            boolean zI2 = ((i6 & 29360128) == 8388608) | b0kVar3.i(ven0Var8) | b0kVar3.i(ven0VarH) | b0kVar3.i(frr0Var2) | b0kVar3.i(ven0Var5);
            Object objT16 = b0kVar3.T();
            if (zI2 || objT16 == m4cVar) {
                objT16 = new qt61(ven0Var8, yqgVar, ven0VarH, frr0Var2, ven0Var5, (lnm) null);
                ven0Var = ven0Var8;
                frr0Var = frr0Var2;
                ven0Var2 = ven0Var5;
                b0kVar3.s0(objT16);
            } else {
                ven0Var = ven0Var8;
                frr0Var = frr0Var2;
                ven0Var2 = ven0Var5;
            }
            qxd0.s(k5u0Var, value, (vu30) objT16, b0kVar3);
            boolean zI3 = b0kVar3.i(ven0Var7) | b0kVar3.i(tob1Var4) | b0kVar3.i(ven0Var4) | b0kVar3.i(iac0Var);
            Object objT17 = b0kVar3.T();
            if (zI3 || objT17 == m4cVar) {
                objT17 = new m9i1(iac0Var, ven0Var7, tob1Var4, ven0Var4, (byte) 3);
                tob1Var = tob1Var4;
                b0kVar3.s0(objT17);
            } else {
                tob1Var = tob1Var4;
            }
            qxd0.i(iac0Var, (iu30) objT17, b0kVar3);
            String strN0 = cwl1.n0(2131958400, new Object[]{Integer.valueOf(i + 1), Integer.valueOf(i2)}, b0kVar3);
            nim0 nim0Var = nim0.a;
            qim0 qim0VarD = u291.d(nim0Var, 1.0f);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(b0kVar3).b;
            qim0 qim0VarZ = uyn1.z(16.0f, 0.0f, 2, qim0VarD);
            cvx cvxVar2 = cbx.b(b0kVar3).b;
            qim0 qim0VarB = uyn1.B(qim0VarZ, 0.0f, 0.0f, 0.0f, 16.0f, 7);
            b0kVar3.i0(-826109504);
            pv71 pv71Var = (pv71) b0kVar3.k(frm.a);
            String str = vy30Var.e;
            pv71Var.getClass();
            qim0 qim0VarE = pv71.e(pv71Var, pv71.d(str, b0kVar3), (cd5) b0kVar3.k(frm.b));
            b0kVar3.r(false);
            qim0 qim0VarThen = qim0VarB.then(qim0VarE);
            boolean zG = b0kVar3.g(strN0);
            Object objT18 = b0kVar3.T();
            if (zG || objT18 == m4cVar) {
                objT18 = new ysf1(strN0, (byte) 29);
                b0kVar3.s0(objT18);
            }
            qim0 qim0VarB2 = s161.b(qim0VarThen, false, (iu30) objT18);
            int i7 = i6 & 14;
            boolean zI4 = b0kVar3.i(tob1Var5) | b0kVar3.i(ven0Var4) | b0kVar3.i(tob1Var) | (i7 == 4);
            Object objT19 = b0kVar3.T();
            if (zI4 || objT19 == m4cVar) {
                tob1 tob1Var6 = tob1Var;
                ven0Var3 = ven0Var4;
                gqfVar = new gqf(tob1Var5, ven0Var3, tob1Var6, vy30Var, (byte) 4);
                tob1Var2 = tob1Var5;
                tob1Var3 = tob1Var6;
                b0kVar3.s0(gqfVar);
            } else {
                ven0Var3 = ven0Var4;
                gqfVar = objT19;
                tob1Var2 = tob1Var5;
                tob1Var3 = tob1Var;
            }
            rih1 rih1Var = rih1.a;
            qim0 qim0VarB3 = f8d1.b(qim0VarB2, rih1Var, (PointerInputEventHandler) gqfVar);
            gra graVar = een.h;
            gfh0 gfh0VarC = t1c.c(graVar, false);
            int iHashCode = Long.hashCode(((x340) b0kVar3).T);
            xos0 xos0VarM = b0kVar3.m();
            qim0 qim0VarE2 = zr7.E(b0kVar3, qim0VarB3);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            b0kVar3.m0();
            boolean z5 = ((x340) b0kVar3).S;
            n4k n4kVar = hmb0.t1;
            if (z5) {
                b0kVar3.l(n4kVar);
            } else {
                b0kVar3.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(gfh0VarC, b0kVar3, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, b0kVar3, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, b0kVar3, lljVar3);
            nko1.F(b0kVar3);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE2, b0kVar3, lljVar4);
            int i8 = vy30Var.b;
            ven0 ven0Var10 = ven0Var2;
            Float fValueOf = (i8 <= 0 || (i5 = vy30Var.c) <= 0) ? null : Float.valueOf(i8 / i5);
            qim0 qim0VarR = fValueOf != null ? d7e.r(fValueOf.floatValue(), nim0Var, false) : u291.d(nim0Var, 1.0f);
            boolean zI5 = b0kVar3.i((Object) 
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0425: INVOKE (r6v10 'zI5' boolean) = (r9v1 'b0kVar3' p.b0k), (wrap java.lang.Object:?: CAST (java.lang.Object) (r29v0 ?? I:??[OBJECT, ARRAY])) VIRTUAL call: p.x340.i(java.lang.Object):boolean A[DECLARE_VAR] (LINE:1062) in method: p.b6p1.i(p.vy30, boolean, int, int, p.iu30, p.woa, p.kma, p.yqg, p.b0k, int):void, file: /workspace/spotify-analysis/dex-input/classes4.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:270)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r29v0 ??
                	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                */
            /*
                Method dump skipped, instruction units count: 1608
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: p.b6p1.i(p.vy30, boolean, int, int, p.iu30, p.woa, p.kma, p.yqg, p.b0k, int):void");
        }

        public static final void j(VideoSurfaceView videoSurfaceView, woa woaVar) {
            Object tag = videoSurfaceView.getTag(2131428986);
            uoa uoaVar = tag instanceof uoa ? (uoa) tag : null;
            if (uoaVar != null) {
                uoaVar.f();
                uoaVar.k(videoSurfaceView);
                uoaVar.u();
                woaVar.c(uoaVar);
            }
            videoSurfaceView.setTag(2131428986, null);
        }

        public static long k() {
            return nbe1.b;
        }

        public static final go80 l(klm klmVar, ybp0 ybp0Var, ybp0 ybp0Var2, bcp0 bcp0Var) {
            return klmVar.a("WazeSdkManagerDaemon", new pcp0(ybp0Var, ybp0Var2, bcp0Var, (byte) 6));
        }

        public static final void m(ay20 ay20Var) {
            vy20 vy20Var = oap1.C(ay20Var).getFocusOwner().d;
            if (vy20Var.d.a(ay20Var)) {
                vy20Var.a();
            }
        }

        public static jxk0 n() {
            return new jxk0(r6h1.c);
        }

        public static final tr3 o(tr3 tr3Var, boolean z) {
            w7c0 w7c0Var = tr3Var.c;
            return tr3.b(tr3Var, (List) null, (sxc0) null, new w7c0(sqg0.O(w7c0Var.a, Collections.singletonMap(r181.a, Boolean.valueOf(z)))), false, 11);
        }

        public static final ce60 p(z25 z25Var) {
            int iOrdinal = z25Var.ordinal();
            if (iOrdinal == 0) {
                return null;
            }
            if (iOrdinal == 1) {
                return ce60.a;
            }
            if (iOrdinal == 2) {
                return ce60.b;
            }
            eg.o();
            return null;
        }
    }
