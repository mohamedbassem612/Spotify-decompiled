package p;

import android.net.Uri;
import androidx.compose.ui.graphics.ColorFilter;
import com.spotify.casita.v1.resolved.ResponseInfo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class qro1 {
    public static b180 a;

    public static final void a(String str, String str2, b4v0 b4v0Var, qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var;
        qim0 qim0Var2;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(-2020445765);
        int i2 = i | (x340Var2.g(str) ? 4 : 2) | (x340Var2.g(str2) ? 32 : 16) | (x340Var2.i(b4v0Var) ? 256 : 128) | 3072;
        if (x340Var2.Y(i2 & 1, (i2 & 1171) != 1170)) {
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarF = u291.f(qim0Var3, 1.0f);
            WeakHashMap weakHashMap = osl1.x;
            qim0 qim0VarP = x0d.p(lhc.g(x340Var2).g, 32, qim0VarF);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var2).b;
            cvx cvxVar2 = cbx.b(x340Var2).b;
            qim0 qim0VarThen = uyn1.y(qim0VarP, 16.0f, 16.0f).then(qim0Var3);
            mbh mbhVarA = jbh.a(new d36(20.0f, true, new um5(false)), een.P0, x340Var2, 0);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0VarThen);
            hzj.A.getClass();
            if (x340Var2.a == null) {
                tgp1.p();
                throw null;
            }
            x340Var2.m0();
            if (x340Var2.S) {
                x340Var2.l(hmb0.t1);
            } else {
                x340Var2.v0();
            }
            nko1.H(mbhVarA, x340Var2, y580.O0);
            nko1.H(xos0VarM, x340Var2, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
            nko1.F(x340Var2);
            nko1.H(qim0VarE, x340Var2, y580.Y);
            uwo1.e(str, null, cbx.d(x340Var2).d, 0L, null, null, 0, false, null, 0, null, x340Var2, i2 & 14, 0, 2042);
            uwo1.f(b4v0Var.a(str2), null, cbx.d(x340Var2).g, null, null, null, 0, false, null, 0, null, null, x340Var2, 0, 0, 4090);
            x340Var = x340Var2;
            x340Var.r(true);
            qim0Var2 = qim0Var3;
        } else {
            x340Var = x340Var2;
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new x2(i, (Object) str, (Object) str2, (Object) b4v0Var, (Object) qim0Var2, (byte) 0);
        }
    }

    public static final void b(String str, boolean z, String str2, String str3, iu30 iu30Var, qim0 qim0Var, int i, b0k b0kVar, int i2) {
        b0k b0kVar2;
        qim0 qim0Var2;
        String strK;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-433003308);
        int i3 = i2 | (b0kVar3.g(str) ? 4 : 2) | (b0kVar3.h(z) ? 32 : 16) | (b0kVar3.g(str2) ? 256 : 128) | (b0kVar3.g(str3) ? 2048 : 1024) | (b0kVar3.i(iu30Var) ? 16384 : 8192) | 196608 | (b0kVar3.e(i == 0 ? -1 : l1d.C(i)) ? 1048576 : 524288);
        if (b0kVar3.Y(i3 & 1, (599187 & i3) != 599186)) {
            xu30 xu30VarR = null;
            String str4 = (str3 == null || ihc1.y0(str3)) ? null : str3;
            if (str4 == null) {
                str4 = str;
            }
            if (i == 3) {
                strK = x0d.k(b0kVar3, -1814392349, 2131952566, b0kVar3, false);
            } else {
                b0kVar3.i0(-1814313764);
                b0kVar3.r(false);
                strK = null;
            }
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarN = anm1.N("audience-user-row-test-tag", qim0Var3);
            if (strK == null) {
                b0kVar3.i0(-1814052993);
                b0kVar3.r(false);
            } else {
                b0kVar3.i0(-1814052992);
                xu30VarR = apo.r(-1377400766, new p3(strK, (byte) 22), b0kVar3);
                b0kVar3.r(false);
            }
            xu30 xu30Var = xu30VarR;
            String strN0 = cwl1.n0(2131952567, new Object[]{str4}, b0kVar3);
            boolean z2 = (i3 & 57344) == 16384;
            Object objT = b0kVar3.T();
            if (z2 || objT == fkj0.X) {
                objT = new ge3(iu30Var, (byte) 25);
                b0kVar3.s0(objT);
            }
            qim0Var2 = qim0Var3;
            b0kVar2 = b0kVar3;
            jto1.b(qim0VarN, null, null, false, null, null, new gbx(new y50(strN0), (Function0) objT), null, apo.r(-1818686754, new go7(str2, str, str4, (byte) 0), b0kVar3), null, null, xu30Var, apo.r(1938578875, new ho7(z, str4, iu30Var), b0kVar3), null, null, apo.r(-1517520616, new p3(str4, (byte) 23), b0kVar3), b0kVar2, 100663296, 196992, 26302);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new si2(str, z, str2, str3, iu30Var, qim0Var2, i, i2);
        }
    }

    public static final void c(String str, long j, qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var;
        qim0 qim0Var2;
        m4c m4cVar = fkj0.X;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(-1524859306);
        int i2 = i | (x340Var2.g(str) ? 4 : 2) | (x340Var2.f(j) ? 32 : 16) | 24576;
        if (x340Var2.Y(i2 & 1, (i2 & 9363) != 9362)) {
            float fX0 = ((wat) x340Var2.k(t4k.h)).X0(28.0f);
            boolean zD = x340Var2.d(fX0);
            Object objT = x340Var2.T();
            if (zD || objT == m4cVar) {
                objT = new jc5((byte) 17, fX0);
                x340Var2.s0(objT);
            }
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarF = dug.f(u291.r(eqr0.B(qim0Var3, (iu30) objT), 32.0f), j, er31.a);
            Object objT2 = x340Var2.T();
            if (objT2 == m4cVar) {
                objT2 = rwn.V0;
                x340Var2.s0(objT2);
            }
            qim0 qim0VarX = lrn1.x(exd0.s(qim0VarF, (iu30) objT2), 0.0f);
            gfh0 gfh0VarC = t1c.c(een.h, false);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0VarX);
            hzj.A.getClass();
            if (x340Var2.a == null) {
                tgp1.p();
                throw null;
            }
            x340Var2.m0();
            if (x340Var2.S) {
                x340Var2.l(hmb0.t1);
            } else {
                x340Var2.v0();
            }
            nko1.H(gfh0VarC, x340Var2, y580.O0);
            nko1.H(xos0VarM, x340Var2, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
            nko1.F(x340Var2);
            nko1.H(qim0VarE, x340Var2, y580.Y);
            uwr uwrVar = cbx.a;
            long j2 = cbx.a(x340Var2).b.a;
            qim0Var2 = qim0Var3;
            uwo1.e(str, null, cbx.d(x340Var2).k, j2, null, null, 0, false, null, 0, null, x340Var2, i2 & 14, 0, 2034);
            x340Var = x340Var2;
            x340Var.r(true);
        } else {
            x340Var = x340Var2;
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new z0o(str, j, qim0Var2, i, (byte) 0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0069  */
    /* JADX WARN: Code duplicated, block: B:41:0x006e  */
    /* JADX WARN: Code duplicated, block: B:43:0x0072  */
    /* JADX WARN: Code duplicated, block: B:45:0x007a  */
    /* JADX WARN: Code duplicated, block: B:46:0x007d  */
    /* JADX WARN: Code duplicated, block: B:50:0x0085  */
    /* JADX WARN: Code duplicated, block: B:53:0x008d  */
    /* JADX WARN: Code duplicated, block: B:56:0x009a  */
    /* JADX WARN: Code duplicated, block: B:57:0x009c  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:62:0x00af  */
    /* JADX WARN: Code duplicated, block: B:67:0x00c3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:68:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:71:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:78:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:79:0x00e9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:80:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:81:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:84:0x010a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:85:0x010c  */
    /* JADX WARN: Code duplicated, block: B:87:0x0146  */
    /* JADX WARN: Code duplicated, block: B:90:0x0155  */
    /* JADX WARN: Code duplicated, block: B:92:? A[RETURN, SYNTHETIC] */
    public static final void d(boolean z, iu30 iu30Var, String str, qim0 qim0Var, boolean z2, idn0 idn0Var, max maxVar, b0k b0kVar, int i, int i2) {
        int i3;
        qim0 qim0Var2;
        int i4;
        boolean z3;
        int i5;
        boolean z4;
        idn0 idn0Var2;
        qim0 qim0Var3;
        boolean z5;
        max maxVar2;
        h311 h311VarV;
        qim0 qim0Var4;
        Object objT;
        max maxVar3;
        idn0 idn0Var3;
        int i6;
        qim0 qim0Var5;
        boolean z6;
        int i7;
        String strN0;
        boolean zG;
        Object objT2;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1152848293);
        if ((i & 6) == 0) {
            i3 = (x340Var.h(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= x340Var.g(str) ? 256 : 128;
        }
        int i8 = i2 & 8;
        if (i8 == 0) {
            if ((i & 3072) == 0) {
                qim0Var2 = qim0Var;
                i3 |= x340Var.i(qim0Var2) ? 2048 : 1024;
            }
            i4 = i2 & 16;
            if (i4 != 0) {
                if ((i & 24576) == 0) {
                    z3 = z2;
                    if (x340Var.h(z3)) {
                        i5 = 16384;
                    } else {
                        i5 = 8192;
                    }
                    i3 |= i5;
                }
                if ((196608 & i) == 0) {
                    i3 |= 65536;
                }
                if ((1572864 & i) == 0) {
                    i3 |= 524288;
                }
                if ((599187 & i3) != 599186) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (x340Var.Y(i3 & 1, z4)) {
                    x340Var.d0();
                    if ((i & 1) != 0 || x340Var.E()) {
                        if (i8 != 0) {
                            qim0Var4 = nim0.a;
                        } else {
                            qim0Var4 = qim0Var2;
                        }
                        if (i4 != 0) {
                            z3 = false;
                        }
                        objT = x340Var.T();
                        if (objT == m4cVar) {
                            objT = ktd.n(x340Var);
                        }
                        maxVar3 = jax.a;
                        idn0Var3 = (idn0) objT;
                        i6 = i3 & (-4128769);
                        qim0Var5 = qim0Var4;
                    } else {
                        x340Var.b0();
                        qim0 qim0Var6 = qim0Var2;
                        i6 = i3 & (-4128769);
                        qim0Var5 = qim0Var6;
                        idn0Var3 = idn0Var;
                        maxVar3 = maxVar;
                    }
                    z6 = z3;
                    x340Var.s();
                    if (z) {
                        i7 = 2131956068;
                    } else if (z6) {
                        i7 = 2131956066;
                    } else {
                        i7 = 2131956070;
                    }
                    strN0 = cwl1.n0(i7, new Object[]{str}, x340Var);
                    jdx jdxVar = jdx.c;
                    gdx gdxVarS = yla.s(x340Var);
                    zG = x340Var.g(strN0);
                    objT2 = x340Var.T();
                    if (zG || objT2 == m4cVar) {
                        objT2 = new kov(strN0, (byte) 9);
                        x340Var.s0(objT2);
                    }
                    foo1.d(z, iu30Var, jdxVar, s161.b(qim0Var5, false, (iu30) objT2), null, maxVar3, gdxVarS, null, idn0Var3, null, null, null, apo.r(2065915803, new xix(z, z6, (byte) 0), x340Var), x340Var, i6 & 126, 384, 3728);
                    maxVar2 = maxVar3;
                    idn0Var2 = idn0Var3;
                    qim0Var3 = qim0Var5;
                    z5 = z6;
                } else {
                    x340Var.b0();
                    idn0Var2 = idn0Var;
                    qim0Var3 = qim0Var2;
                    z5 = z3;
                    maxVar2 = maxVar;
                }
                h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new vu(z, iu30Var, str, qim0Var3, z5, idn0Var2, maxVar2, i, i2);
                }
            }
            i3 |= 24576;
            z3 = z2;
            if ((196608 & i) == 0) {
                i3 |= 65536;
            }
            if ((1572864 & i) == 0) {
                i3 |= 524288;
            }
            if ((599187 & i3) != 599186) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (x340Var.Y(i3 & 1, z4)) {
                x340Var.d0();
                if ((i & 1) != 0) {
                    if (i8 != 0) {
                        qim0Var4 = nim0.a;
                    } else {
                        qim0Var4 = qim0Var2;
                    }
                    if (i4 != 0) {
                        z3 = false;
                    }
                    objT = x340Var.T();
                    if (objT == m4cVar) {
                        objT = ktd.n(x340Var);
                    }
                    maxVar3 = jax.a;
                    idn0Var3 = (idn0) objT;
                    i6 = i3 & (-4128769);
                    qim0Var5 = qim0Var4;
                } else {
                    if (i8 != 0) {
                        qim0Var4 = nim0.a;
                    } else {
                        qim0Var4 = qim0Var2;
                    }
                    if (i4 != 0) {
                        z3 = false;
                    }
                    objT = x340Var.T();
                    if (objT == m4cVar) {
                        objT = ktd.n(x340Var);
                    }
                    maxVar3 = jax.a;
                    idn0Var3 = (idn0) objT;
                    i6 = i3 & (-4128769);
                    qim0Var5 = qim0Var4;
                }
                z6 = z3;
                x340Var.s();
                if (z) {
                    i7 = 2131956068;
                } else if (z6) {
                    i7 = 2131956066;
                } else {
                    i7 = 2131956070;
                }
                strN0 = cwl1.n0(i7, new Object[]{str}, x340Var);
                jdx jdxVar2 = jdx.c;
                gdx gdxVarS2 = yla.s(x340Var);
                zG = x340Var.g(strN0);
                objT2 = x340Var.T();
                if (zG) {
                    objT2 = new kov(strN0, (byte) 9);
                    x340Var.s0(objT2);
                } else {
                    objT2 = new kov(strN0, (byte) 9);
                    x340Var.s0(objT2);
                }
                foo1.d(z, iu30Var, jdxVar2, s161.b(qim0Var5, false, (iu30) objT2), null, maxVar3, gdxVarS2, null, idn0Var3, null, null, null, apo.r(2065915803, new xix(z, z6, (byte) 0), x340Var), x340Var, i6 & 126, 384, 3728);
                maxVar2 = maxVar3;
                idn0Var2 = idn0Var3;
                qim0Var3 = qim0Var5;
                z5 = z6;
            } else {
                x340Var.b0();
                idn0Var2 = idn0Var;
                qim0Var3 = qim0Var2;
                z5 = z3;
                maxVar2 = maxVar;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new vu(z, iu30Var, str, qim0Var3, z5, idn0Var2, maxVar2, i, i2);
            }
        }
        i3 |= 3072;
        qim0Var2 = qim0Var;
        i4 = i2 & 16;
        if (i4 != 0) {
            if ((i & 24576) == 0) {
                z3 = z2;
                if (x340Var.h(z3)) {
                    i5 = 16384;
                } else {
                    i5 = 8192;
                }
                i3 |= i5;
            }
            if ((196608 & i) == 0) {
                i3 |= 65536;
            }
            if ((1572864 & i) == 0) {
                i3 |= 524288;
            }
            if ((599187 & i3) != 599186) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (x340Var.Y(i3 & 1, z4)) {
                x340Var.d0();
                if ((i & 1) != 0) {
                    if (i8 != 0) {
                        qim0Var4 = nim0.a;
                    } else {
                        qim0Var4 = qim0Var2;
                    }
                    if (i4 != 0) {
                        z3 = false;
                    }
                    objT = x340Var.T();
                    if (objT == m4cVar) {
                        objT = ktd.n(x340Var);
                    }
                    maxVar3 = jax.a;
                    idn0Var3 = (idn0) objT;
                    i6 = i3 & (-4128769);
                    qim0Var5 = qim0Var4;
                } else {
                    if (i8 != 0) {
                        qim0Var4 = nim0.a;
                    } else {
                        qim0Var4 = qim0Var2;
                    }
                    if (i4 != 0) {
                        z3 = false;
                    }
                    objT = x340Var.T();
                    if (objT == m4cVar) {
                        objT = ktd.n(x340Var);
                    }
                    maxVar3 = jax.a;
                    idn0Var3 = (idn0) objT;
                    i6 = i3 & (-4128769);
                    qim0Var5 = qim0Var4;
                }
                z6 = z3;
                x340Var.s();
                if (z) {
                    i7 = 2131956068;
                } else if (z6) {
                    i7 = 2131956066;
                } else {
                    i7 = 2131956070;
                }
                strN0 = cwl1.n0(i7, new Object[]{str}, x340Var);
                jdx jdxVar3 = jdx.c;
                gdx gdxVarS3 = yla.s(x340Var);
                zG = x340Var.g(strN0);
                objT2 = x340Var.T();
                if (zG) {
                    objT2 = new kov(strN0, (byte) 9);
                    x340Var.s0(objT2);
                } else {
                    objT2 = new kov(strN0, (byte) 9);
                    x340Var.s0(objT2);
                }
                foo1.d(z, iu30Var, jdxVar3, s161.b(qim0Var5, false, (iu30) objT2), null, maxVar3, gdxVarS3, null, idn0Var3, null, null, null, apo.r(2065915803, new xix(z, z6, (byte) 0), x340Var), x340Var, i6 & 126, 384, 3728);
                maxVar2 = maxVar3;
                idn0Var2 = idn0Var3;
                qim0Var3 = qim0Var5;
                z5 = z6;
            } else {
                x340Var.b0();
                idn0Var2 = idn0Var;
                qim0Var3 = qim0Var2;
                z5 = z3;
                maxVar2 = maxVar;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new vu(z, iu30Var, str, qim0Var3, z5, idn0Var2, maxVar2, i, i2);
            }
        }
        i3 |= 24576;
        z3 = z2;
        if ((196608 & i) == 0) {
            i3 |= 65536;
        }
        if ((1572864 & i) == 0) {
            i3 |= 524288;
        }
        if ((599187 & i3) != 599186) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (x340Var.Y(i3 & 1, z4)) {
            x340Var.d0();
            if ((i & 1) != 0) {
                if (i8 != 0) {
                    qim0Var4 = nim0.a;
                } else {
                    qim0Var4 = qim0Var2;
                }
                if (i4 != 0) {
                    z3 = false;
                }
                objT = x340Var.T();
                if (objT == m4cVar) {
                    objT = ktd.n(x340Var);
                }
                maxVar3 = jax.a;
                idn0Var3 = (idn0) objT;
                i6 = i3 & (-4128769);
                qim0Var5 = qim0Var4;
            } else {
                if (i8 != 0) {
                    qim0Var4 = nim0.a;
                } else {
                    qim0Var4 = qim0Var2;
                }
                if (i4 != 0) {
                    z3 = false;
                }
                objT = x340Var.T();
                if (objT == m4cVar) {
                    objT = ktd.n(x340Var);
                }
                maxVar3 = jax.a;
                idn0Var3 = (idn0) objT;
                i6 = i3 & (-4128769);
                qim0Var5 = qim0Var4;
            }
            z6 = z3;
            x340Var.s();
            if (z) {
                i7 = 2131956068;
            } else if (z6) {
                i7 = 2131956066;
            } else {
                i7 = 2131956070;
            }
            strN0 = cwl1.n0(i7, new Object[]{str}, x340Var);
            jdx jdxVar4 = jdx.c;
            gdx gdxVarS4 = yla.s(x340Var);
            zG = x340Var.g(strN0);
            objT2 = x340Var.T();
            if (zG) {
                objT2 = new kov(strN0, (byte) 9);
                x340Var.s0(objT2);
            } else {
                objT2 = new kov(strN0, (byte) 9);
                x340Var.s0(objT2);
            }
            foo1.d(z, iu30Var, jdxVar4, s161.b(qim0Var5, false, (iu30) objT2), null, maxVar3, gdxVarS4, null, idn0Var3, null, null, null, apo.r(2065915803, new xix(z, z6, (byte) 0), x340Var), x340Var, i6 & 126, 384, 3728);
            maxVar2 = maxVar3;
            idn0Var2 = idn0Var3;
            qim0Var3 = qim0Var5;
            z5 = z6;
        } else {
            x340Var.b0();
            idn0Var2 = idn0Var;
            qim0Var3 = qim0Var2;
            z5 = z3;
            maxVar2 = maxVar;
        }
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new vu(z, iu30Var, str, qim0Var3, z5, idn0Var2, maxVar2, i, i2);
        }
    }

    public static final void e(boolean z, boolean z2, b0k b0kVar, int i) {
        String strK;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-2091433518);
        int i2 = (x340Var.h(z) ? 4 : 2) | i | (x340Var.h(z2) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            if (z) {
                strK = x0d.k(x340Var, 177087244, 2131956074, x340Var, false);
            } else {
                strK = z2 ? x0d.k(x340Var, 177089843, 2131956066, x340Var, false) : x0d.k(x340Var, 177092398, 2131956075, x340Var, false);
            }
            uwo1.e(strK, null, null, 0L, null, null, 0, false, null, 0, null, x340Var, 0, 0, 2046);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new xix(z, z2, i);
        }
    }

    public static final void f(int i, String str, boolean z, boolean z2, Function0 function0, qim0 qim0Var, b0k b0kVar, int i2) {
        b0k b0kVar2;
        qim0 qim0Var2;
        long j;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-1180865787);
        int i3 = i2 | (b0kVar3.e(i) ? 4 : 2) | (b0kVar3.g(str) ? 32 : 16) | (b0kVar3.h(z) ? 256 : 128) | (b0kVar3.h(z2) ? 2048 : 1024) | (b0kVar3.i(function0) ? 16384 : 8192) | 196608;
        if (b0kVar3.Y(i3 & 1, (74899 & i3) != 74898)) {
            if (z) {
                b0kVar3.i0(-940647887);
                uwr uwrVar = cbx.a;
                j = cbx.a(b0kVar3).b.c;
            } else {
                b0kVar3.i0(-940646548);
                j = ((u7h) b0kVar3.k(qgx.a)).a;
            }
            b0kVar3.r(false);
            long j2 = j;
            pm31 pm31Var = new pm31(3);
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarQ = dgo1.q(qim0Var3, z, z2, pm31Var, function0, 8);
            era eraVar = een.Q0;
            uwr uwrVar2 = cbx.a;
            cvx cvxVar = cbx.b(b0kVar3).b;
            mbh mbhVarA = jbh.a(new d36(8.0f, true, new um5(false)), eraVar, b0kVar3, 0);
            int iHashCode = Long.hashCode(((x340) b0kVar3).T);
            xos0 xos0VarM = b0kVar3.m();
            qim0 qim0VarE = zr7.E(b0kVar3, qim0VarQ);
            hzj.A.getClass();
            if (((x340) b0kVar3).a == null) {
                tgp1.p();
                throw null;
            }
            b0kVar3.m0();
            if (((x340) b0kVar3).S) {
                b0kVar3.l(hmb0.t1);
            } else {
                b0kVar3.v0();
            }
            nko1.H(mbhVarA, b0kVar3, y580.O0);
            nko1.H(xos0VarM, b0kVar3, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), b0kVar3, y580.R0);
            nko1.F(b0kVar3);
            nko1.H(qim0VarE, b0kVar3, y580.Y);
            nl70.c(i3o1.n(i, b0kVar3, i3 & 14), (String) null, (qim0) null, j2, b0kVar3, 56, 4);
            uwo1.e(str, null, cbx.d(b0kVar3).j, j2, new a0e1(3), null, 0, false, null, 0, null, b0kVar3, (i3 >> 3) & 14, 0, 2018);
            b0kVar2 = b0kVar3;
            yoi1.b(z, (Function0) null, (qim0) null, z2, (idn0) null, b0kVar2, ((i3 >> 6) & 14) | 48 | (i3 & 7168), 20);
            b0kVar2.r(true);
            qim0Var2 = qim0Var3;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new h7c0(i, str, z, z2, function0, qim0Var2, i2, (byte) 0);
        }
    }

    public static final void g(b7c0 b7c0Var, lax laxVar, iu30 iu30Var, b0k b0kVar, int i) {
        b0k b0kVar2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(98605557);
        int i2 = (b0kVar3.e(b7c0Var == null ? -1 : b7c0Var.ordinal()) ? 4 : 2) | i | (b0kVar3.g(laxVar) ? 32 : 16);
        if ((i & 384) == 0) {
            i2 |= b0kVar3.i(iu30Var) ? 256 : 128;
        }
        if (b0kVar3.Y(i2 & 1, (i2 & 147) != 146)) {
            boolean zEquals = laxVar.equals(iax.a);
            qim0 qim0VarF = u291.f(nim0.a, 1.0f);
            uwr uwrVar = cbx.a;
            float f = cbx.b(b0kVar3).e.b;
            float f2 = cbx.b(b0kVar3).e.b;
            cvx cvxVar = cbx.b(b0kVar3).b;
            cvx cvxVar2 = cbx.b(b0kVar3).b;
            b0kVar2 = b0kVar3;
            cwl1.b(uyn1.A(qim0VarF, f, 12.0f, f2, 16.0f), (tl3) null, (hw61) null, ogx.e, (vzq0) null, mmo1.z(laxVar, b0kVar3), false, (idn0) null, (ga80) null, (gbx) null, (gbx) null, apo.r(-2076993506, new o3((byte) 24, (Object) b7c0Var, (cv30) iu30Var, zEquals), b0kVar3), b0kVar2, 0, 48, 2006);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new c7e(b7c0Var, laxVar, iu30Var, i, (byte) 2);
        }
    }

    public static final void h(b7c0 b7c0Var, lax laxVar, boolean z, iu30 iu30Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1655390151);
        int i2 = i | (x340Var.e(b7c0Var == null ? -1 : b7c0Var.ordinal()) ? 4 : 2) | (x340Var.g(laxVar) ? 32 : 16) | (x340Var.h(z) ? 256 : 128) | (x340Var.i(iu30Var) ? 2048 : 1024);
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            nim0 nim0Var = nim0.a;
            qim0 qim0VarF = u291.f(nim0Var, 1.0f);
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarF);
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
            g(b7c0Var, laxVar, iu30Var, x340Var, ((i2 >> 3) & 896) | (i2 & 126));
            if (z) {
                x340Var.i0(807438968);
                uwr uwrVar = cbx.a;
                cvx cvxVar = cbx.b(x340Var).b;
                rqo1.g(0, 0, x340Var, anm1.N("library_layout_picker_divider", uyn1.B(nim0Var, 0.0f, 0.0f, 0.0f, 16.0f, 7)));
                x340Var.r(false);
            } else {
                x340Var.i0(807616753);
                x340Var.r(false);
            }
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new qy90((Object) b7c0Var, (Object) laxVar, z, (Object) iu30Var, i, (byte) 8);
        }
    }

    public static final void i(int i, int i2, String str, b0k b0kVar, qim0 qim0Var) {
        int i3;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(284557675);
        int i4 = i | 6;
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 = i | 54;
        } else {
            i3 = i4 | (x340Var.g(str) ? 32 : 16);
        }
        if (x340Var.Y(i3 & 1, (i3 & 19) != 18)) {
            if (i5 != 0) {
                str = null;
            }
            nyx.a(0, (wux) null, apo.r(-638400264, new p9y0(str), x340Var), x340Var, 3072, 7);
            qim0Var = nim0.a;
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new zmh(i, i2, str, qim0Var);
        }
    }

    public static final void j(String str, b0k b0kVar, int i) {
        float f;
        qim0 qim0Var;
        hc01 hc01Var;
        boolean z;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-979325120);
        j06 j06Var = x340Var.a;
        qim0 qim0Var2 = nim0.a;
        int i2 = i | (x340Var.i(qim0Var2) ? 4 : 2) | (x340Var.g(str) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            hc01.d.getClass();
            hc01 hc01Var2 = hc01.e;
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            cua cuaVar = cbx.b(x340Var).f;
            zov0 zov0Var = cbx.b(x340Var).g;
            cr31 cr31VarB = er31.b(6.0f);
            qim0 qim0VarD = u291.d(qim0Var2, 1.0f);
            long j = hc01Var2.a;
            u5j1 u5j1Var = d4o1.a;
            qim0 qim0VarF = dug.f(qim0VarD, j, u5j1Var);
            gra graVar = een.h;
            gfh0 gfh0VarC = t1c.c(graVar, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarF);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            boolean z2 = x340Var.S;
            n4k n4kVar = hmb0.t1;
            if (z2) {
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
            mbh mbhVarA = jbh.a(h36.c, een.Q0, x340Var, 0);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0Var2);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(mbhVarA, x340Var, lljVar);
            nko1.H(xos0VarM2, x340Var, lljVar2);
            x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE2, x340Var, lljVar4);
            if (str != null) {
                x340Var.i0(-1917141016);
                qim0Var = qim0Var2;
                f = 88.0f;
                cwl1.f(oi7.a(Uri.parse(str), (gw70) null, (xb10) null, (yqi1) null, (jmr0) null, (jmr0) null, false, false, (j6m) null, (iu30) null, (iu30) null, (iu30) null, 0L, x340Var, 0, 0, 131070), (String) null, i1p1.q(u291.r(qim0Var, 88.0f), cr31VarB), (tl3) null, mif1.P0, 0.0f, (ColorFilter) null, x340Var, 48, 104);
                x340Var = x340Var;
                x340Var.r(false);
                hc01Var = hc01Var2;
                z = true;
            } else {
                f = 88.0f;
                qim0Var = qim0Var2;
                x340Var.i0(-1916875222);
                qim0 qim0VarF2 = dug.f(i1p1.q(u291.r(qim0Var, 88.0f), cr31VarB), cbx.a(x340Var).a.a.a(), u5j1Var);
                gfh0 gfh0VarC2 = t1c.c(graVar, false);
                int iHashCode3 = Long.hashCode(x340Var.T);
                xos0 xos0VarM3 = x340Var.m();
                qim0 qim0VarE3 = zr7.E(x340Var, qim0VarF2);
                x340Var.m0();
                if (x340Var.S) {
                    x340Var.l(n4kVar);
                } else {
                    x340Var.v0();
                }
                nko1.H(gfh0VarC2, x340Var, lljVar);
                nko1.H(xos0VarM3, x340Var, lljVar2);
                x0d.q(iHashCode3, x340Var, lljVar3, x340Var);
                nko1.H(qim0VarE3, x340Var, lljVar4);
                hc01Var = hc01Var2;
                w0h1.a(pkx.c, isl.a, u291.r(qim0Var, 64.0f), hc01Var.b, 0L, false, x340Var, pkx.d | 48, 48);
                z = true;
                x340Var.r(true);
                x340Var.r(false);
            }
            uwo1.e(ydh.g(cvxVar.a, 2131955647, x340Var, x340Var, qim0Var), null, cbx.d(x340Var).j, hc01Var.b, null, null, 0, false, null, 0, null, x340Var, 0, 0, 2034);
            op71.g(x340Var, u291.h(qim0Var, 16.0f));
            tto1.c(0, 6, 0L, 0L, x340Var, u291.v(qim0Var, f));
            x340Var.r(true);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new p9y0(str, i, (byte) 6);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v5 */
    public static final void k(iys0 iys0Var, Function0 function0, qim0 qim0Var, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        qim0 qim0Var2;
        Object obj;
        boolean z;
        long j;
        long j2;
        ?? r2;
        qim0 qim0VarX;
        boolean z2;
        boolean z3;
        long j3 = iys0Var.c;
        long jA = iys0Var.d;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1928041363);
        j06 j06Var = x340Var.a;
        int i2 = i | (x340Var.i(iys0Var) ? 4 : 2) | (x340Var.i(function0) ? 32 : 16) | 384;
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            boolean zY0 = ihc1.y0(iys0Var.e);
            uwr uwrVar = cbx.a;
            long jC = cbx.a(x340Var).a.b.c();
            boolean zG = x340Var.g(iys0Var);
            Object objT = x340Var.T();
            if (zG || objT == fkj0.X) {
                p3v p3vVar = (p3v) o7h.P0(p7h.M(new p3v[]{new p3v(72.0f), new p3v(120.0f), new p3v(180.0f), new p3v(150.0f), new p3v(200.0f)}), dqz0.a);
                float f = p3vVar.a;
                x340Var.s0(p3vVar);
                obj = p3vVar;
            } else {
                obj = objT;
            }
            float f2 = ((p3v) obj).a;
            cr31 cr31VarB = er31.b(cbx.b(x340Var).b.c);
            long j4 = u7h.k;
            if (z4h1.b(jA, j4)) {
                z = false;
                x340Var.i0(-1682019247);
                jA = cbx.a(x340Var).a.b.a();
            } else {
                x340Var.i0(-1682075357);
                z = false;
            }
            x340Var.r(z);
            qim0Var2 = nim0.a;
            qim0 qim0VarF = dug.f(qim0Var2, jA, cr31VarB);
            mta mtaVar = cbx.b(x340Var).d;
            qim0 qim0VarB = u291.b(0.0f, 48.0f, 1, qim0VarF);
            if (zY0) {
                j = j4;
                j2 = j3;
                qim0VarX = qim0Var2;
                r2 = z;
            } else if (iys0Var.i) {
                j = j4;
                j2 = j3;
                r2 = z;
                qim0VarX = bin.x(qim0Var2, false, null, null, null, function0, 15);
            } else {
                j = j4;
                qim0VarX = d9y0.k(qim0Var2, 0.5f);
                r2 = z;
                j2 = j3;
            }
            qim0 qim0VarThen = qim0VarB.then(qim0VarX).then(zY0 != 0 ? cwl1.l0(qim0Var2, jC, cr31VarB, 12) : qim0Var2);
            gfh0 gfh0VarC = t1c.c(een.d, (boolean) r2);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarThen);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            boolean z4 = x340Var.S;
            n4k n4kVar = hmb0.t1;
            if (z4) {
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
            cvx cvxVar = cbx.b(x340Var).b;
            cvx cvxVar2 = cbx.b(x340Var).b;
            cvx cvxVar3 = cbx.b(x340Var).b;
            cvx cvxVar4 = cbx.b(x340Var).b;
            float f3 = 16.0f;
            qim0 qim0VarW = uyn1.w(qim0Var2, new zzq0(12.0f, 12.0f, 16.0f, 12.0f));
            jw31 jw31VarA = ew31.a(h36.a, een.N0, x340Var, (int) r2);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0VarW);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(jw31VarA, x340Var, lljVar);
            nko1.H(xos0VarM2, x340Var, lljVar2);
            x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE2, x340Var, lljVar4);
            if (zY0) {
                x340Var.i0(-917945894);
                op71.g(x340Var, u291.v(qim0Var2, f2));
                x340Var.r((boolean) r2);
                z2 = true;
            } else {
                x340Var.i0(-917843563);
                hux huxVar = iys0Var.a;
                if (huxVar != null) {
                    x340Var.i0(-917799357);
                    int iC = l1d.C(iys0Var.b);
                    if (iC != 0) {
                        z3 = true;
                        if (iC != 1) {
                            throw p3d1.k(x340Var, 2048608967, (boolean) r2);
                        }
                        x340Var.i0(2048613289);
                        zov0 zov0Var = cbx.b(x340Var).g;
                        x340Var.r((boolean) r2);
                        f3 = 24.0f;
                    } else {
                        z3 = true;
                        x340Var.i0(2048611304);
                        zov0 zov0Var2 = cbx.b(x340Var).g;
                        x340Var.r((boolean) r2);
                    }
                    qim0 qim0VarR = u291.r(qim0Var2, f3);
                    long j5 = j2;
                    if (z4h1.b(j5, j)) {
                        x340Var.i0(-917329180);
                        j5 = cbx.a(x340Var).b.a;
                    } else {
                        x340Var.i0(-917382128);
                    }
                    x340Var.r((boolean) r2);
                    z2 = z3;
                    w0h1.a(huxVar, isl.a, qim0VarR, j5, 0L, false, x340Var, 56, 48);
                    x340Var.r((boolean) r2);
                } else {
                    z2 = true;
                    x340Var.i0(-917249665);
                    x340Var.r((boolean) r2);
                }
                String str = iys0Var.e;
                lee1 lee1Var = cbx.d(x340Var).g;
                long j6 = cbx.a(x340Var).b.a;
                cvx cvxVar5 = cbx.b(x340Var).b;
                cvx cvxVar6 = cbx.b(x340Var).b;
                uwo1.e(str, uyn1.B(qim0Var2, 8.0f, 0.0f, 8.0f, 0.0f, 10), lee1Var, j6, null, null, 0, false, null, 0, null, x340Var, 0, 0, 2032);
                x340Var = x340Var;
                x340Var.r((boolean) r2);
            }
            x340Var.r(z2);
            x340Var.r(z2);
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new juc1(iys0Var, function0, qim0Var2, i, (byte) 1);
        }
    }

    public static final void l(z5q0 z5q0Var, boolean z, qim0 qim0Var, b0k b0kVar, int i) {
        z5q0 z5q0Var2;
        boolean z2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1083098455);
        int i2 = (x340Var.g(z5q0Var) ? 4 : 2) | i | (x340Var.h(z) ? 32 : 16) | (x340Var.g(qim0Var) ? 256 : 128);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            z5q0Var2 = z5q0Var;
            z2 = z;
            c4p1.k(z5q0Var2, z2, anm1.N("users.nearby", qim0Var), apo.r(527714853, new muh1(z5q0Var, (byte) 7), x340Var), x340Var, (i2 & 14) | 3072 | (i2 & 112));
        } else {
            z5q0Var2 = z5q0Var;
            z2 = z;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ene1(z5q0Var2, z2, qim0Var, i);
        }
    }

    public static final p1j0 m(tom tomVar) {
        String str = tomVar.a;
        String str2 = tomVar.b;
        lpl lplVar = tomVar.f;
        String str3 = lplVar.a;
        String str4 = lplVar.c;
        bc71 bc71Var = lplVar.b;
        w4i1 w4i1Var = tomVar.c;
        List list = tomVar.h;
        List list2 = tomVar.i;
        return new p1j0(str3, str4, lplVar.e != null, bc71Var, str, str2, w4i1Var, tomVar.d, s(tomVar.t), list, r(tomVar.g), tomVar.X, tomVar, list2);
    }

    public static final tom n(List list) {
        Object next;
        Iterator it = list.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!(((tom) next).f instanceof vol));
        if (next instanceof tom) {
            return (tom) next;
        }
        return null;
    }

    public static final pii0 o(oii0 oii0Var, lii0 lii0Var) {
        Set set = lii0Var.b;
        String str = oii0Var.a;
        ArrayList arrayList = oii0Var.e;
        ArrayList<nii0> arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            nii0 nii0Var = (nii0) obj;
            if (!set.contains(nii0Var.d) && !set.contains(nii0Var.c)) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList(q7h.U(arrayList2, 10));
        for (nii0 nii0Var2 : arrayList2) {
            arrayList3.add(new mey0(nii0Var2.a, oii0Var.b, nii0Var2.d, nii0Var2.c, (x360) null, nii0Var2.e, nii0Var2.f, (String) null, oii0Var.g, 128));
        }
        return new pii0(str, arrayList3, oii0Var.d);
    }

    public static final ia00 q(xr6 xr6Var, xu30 xu30Var, zu30 zu30Var) {
        return xr6Var.a(new ws31(xu30Var, (byte) 2), new cq61(zu30Var, (byte) 0));
    }

    public static final t1j0 r(rom romVar) {
        if (romVar instanceof pom) {
            return r1j0.a;
        }
        if (romVar instanceof oom) {
            return new q1j0(((oom) romVar).a);
        }
        if (u890.j(romVar, qom.a)) {
            return s1j0.a;
        }
        eg.o();
        return null;
    }

    public static final j1j0 s(nom nomVar) {
        if (nomVar instanceof mom) {
            return new i1j0(((mom) nomVar).a);
        }
        if (nomVar instanceof lom) {
            return new h1j0(((lom) nomVar).a);
        }
        if (u890.j(nomVar, iom.a)) {
            return e1j0.a;
        }
        if (u890.j(nomVar, hom.a)) {
            return d1j0.a;
        }
        if (u890.j(nomVar, kom.a)) {
            return g1j0.a;
        }
        if (nomVar instanceof jom) {
            return f1j0.a;
        }
        eg.o();
        return null;
    }

    public static final void t(ArrayList arrayList, boolean z, p811 p811Var, p811 p811Var2, a2j0 a2j0Var) {
        if (!z || !(a2j0Var instanceof x0j0)) {
            u(arrayList, p811Var2, p811Var, true);
            arrayList.add(a2j0Var);
            return;
        }
        x0j0 x0j0Var = (x0j0) a2j0Var;
        List list = x0j0Var.b;
        jzr0 jzr0Var = (jzr0) o7h.s0(list);
        if (jzr0Var == null) {
            return;
        }
        if (jzr0Var.a == fr2.ROUTINE_RESULT) {
            u(arrayList, p811Var2, p811Var, true);
            arrayList.add(a2j0Var);
        } else {
            if (p811Var.a == null) {
                p811Var.a = x0j0Var.a;
            }
            r7h.W(list, (Collection) p811Var2.a);
        }
    }

    public static final void u(ArrayList arrayList, p811 p811Var, p811 p811Var2, boolean z) {
        Object obj;
        if (((List) p811Var.a).isEmpty() || (obj = p811Var2.a) == null) {
            return;
        }
        arrayList.add(new x0j0((String) obj, o7h.l1((Iterable) p811Var.a), z));
        p811Var.a = new ArrayList();
        p811Var2.a = null;
    }

    public static final yz21 v(ResponseInfo responseInfo, boolean z) {
        String strE;
        String strQ = responseInfo.q();
        String strS = responseInfo.s();
        if (strS == null || ihc1.y0(strS)) {
            strE = "static";
        } else {
            strE = !z ? f4i1.e(responseInfo.s(), "-offline") : responseInfo.s();
        }
        return new yz21(strQ, strE);
    }

    public static final v1j0 w(tom tomVar) {
        String str = tomVar.a;
        String str2 = tomVar.b;
        String str3 = tomVar.f.a;
        w4i1 w4i1Var = tomVar.c;
        t1j0 t1j0VarR = r(tomVar.g);
        List list = tomVar.h;
        List list2 = tomVar.i;
        return new v1j0(str3, str, str2, w4i1Var, tomVar.d, t1j0VarR, s(tomVar.t), list, tomVar.X, list2, 512);
    }

    public String p() {
        if (this instanceof j610) {
            return ((j610) this).b;
        }
        return null;
    }
}
