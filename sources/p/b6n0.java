package p;

import android.graphics.Color;
import android.net.Uri;
import androidx.compose.ui.graphics.ColorFilter;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class b6n0 implements xpw {
    public final gw70 a;
    public final bu4 b;
    public final cu4 c;
    public final p410 d;
    public final epb1 e;
    public final ojm f;
    public final poy0 g = f2p1.q(new a6n0(this, (byte) 0), new nsm0(2, this, b6n0.class, "stateMapper", "stateMapper(Lcom/spotify/musicquiz/elements/musicquizcardelement/MusicQuizCard$Props;Lcom/spotify/listcontentruntime/metadataapi/MetadataValues;)Lcom/spotify/musicquiz/elements/musicquizcardelement/MusicQuizCard$State;", 0, 2), new a6n0(this, (byte) 1), 4);
    public final ia00 h = n3o1.q(this).a(fmk0.R0, fmk0.S0);
    public final psw i;

    public b6n0(gw70 gw70Var, bu4 bu4Var, cu4 cu4Var, p410 p410Var, epb1 epb1Var, ojm ojmVar) {
        this.a = gw70Var;
        this.b = bu4Var;
        this.c = cu4Var;
        this.d = p410Var;
        this.e = epb1Var;
        this.f = ojmVar;
        j2i j2iVar = new j2i(1252351957, new hmk0(this, (byte) 18), true);
        ien0 ien0Var = qsw.a;
        this.i = new psw(j2iVar, (byte) 0);
    }

    public static String l(String str, ioj0 ioj0Var) {
        List list;
        up70 up70Var;
        up70 up70VarA;
        String str2;
        goj0 goj0VarA;
        xkk1 xkk1Var;
        hoj0 hoj0VarC = ioj0Var.c(xkk1.class, str);
        mq70 mq70Var = (hoj0VarC == null || (goj0VarA = hoj0VarC.a()) == null || (xkk1Var = (xkk1) goj0VarA.a) == null) ? null : xkk1Var.a;
        if (mq70Var != null && (up70VarA = mq70Var.a(vp70.c)) != null && (str2 = up70VarA.a.a) != null) {
            return str2;
        }
        if (mq70Var == null || (list = mq70Var.a) == null || (up70Var = (up70) o7h.s0(list)) == null) {
            return null;
        }
        return up70Var.a.a;
    }

    public static long m(String str) {
        u7h m231Var;
        try {
            m231Var = new u7h(z4p1.e(Color.parseColor(str)));
        } catch (Throwable th) {
            m231Var = new m231(th);
        }
        uwr uwrVar = cbx.a;
        u7h u7hVar = new u7h(((vex) zex.a.e).i);
        if (m231Var instanceof m231) {
            m231Var = u7hVar;
        }
        return m231Var.a;
    }

    public final rqw a() {
        return this.h;
    }

    public final jsw c() {
        return this.i;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0043  */
    /* JADX WARN: Code duplicated, block: B:24:0x0045  */
    /* JADX WARN: Code duplicated, block: B:27:0x004d  */
    /* JADX WARN: Code duplicated, block: B:29:0x0051  */
    /* JADX WARN: Code duplicated, block: B:30:0x0053  */
    /* JADX WARN: Code duplicated, block: B:35:0x007c  */
    /* JADX WARN: Code duplicated, block: B:38:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:40:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:41:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:43:0x011b  */
    /* JADX WARN: Code duplicated, block: B:45:0x0120  */
    /* JADX WARN: Code duplicated, block: B:48:0x012a  */
    /* JADX WARN: Code duplicated, block: B:50:? A[RETURN, SYNTHETIC] */
    public final void e(int i, int i2, String str, b0k b0kVar, qim0 qim0Var) {
        int i3;
        qim0 qim0Var2;
        boolean z;
        qim0 qim0Var3;
        h311 h311VarV;
        qim0 qim0Var4;
        qim0 qim0Var5;
        cr31 cr31VarB;
        boolean zI;
        Object objT;
        gfh0 gfh0VarC;
        int iHashCode;
        xos0 xos0VarM;
        qim0 qim0VarE;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-599757678);
        if ((i & 6) == 0) {
            i3 = i | (x340Var.g(str) ? 4 : 2);
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 == 0) {
            if ((i & 48) == 0) {
                qim0Var2 = qim0Var;
                i3 |= x340Var.i(qim0Var2) ? 32 : 16;
            }
            if ((i3 & 19) != 18) {
                z = true;
            } else {
                z = false;
            }
            if (x340Var.Y(i3 & 1, z)) {
                qim0Var4 = nim0.a;
                if (i4 != 0) {
                    qim0Var5 = qim0Var4;
                } else {
                    qim0Var5 = qim0Var2;
                }
                uwr uwrVar = cbx.a;
                cua cuaVar = cbx.b(x340Var).f;
                cr31VarB = er31.b(4.0f);
                qim0 qim0VarZ = uyn1.z(0.0f, 0.0f, 3, u291.f(qim0Var5, 1.0f));
                zI = x340Var.i(cr31VarB);
                objT = x340Var.T();
                if (zI || objT == fkj0.X) {
                    objT = new xkm0(cr31VarB, (byte) 12);
                    x340Var.s0(objT);
                }
                qim0 qim0VarC = i541.C(qim0VarZ, (iu30) objT);
                gfh0VarC = t1c.c(een.d, false);
                iHashCode = Long.hashCode(x340Var.T);
                xos0VarM = x340Var.m();
                qim0VarE = zr7.E(x340Var, qim0VarC);
                hzj.A.getClass();
                if (x340Var.a != null) {
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
                Uri uri = Uri.parse(str);
                jsl jslVar = new jsl(cwl1.o0(x340Var, 2131959007));
                cbx.a.getClass();
                ecx ecxVarA = uwr.a();
                nkx nkxVar = nkx.c;
                eso1.e(uri, jslVar, u291.f(qim0Var4, 1.0f), (p3v) null, (zvx) null, ecxVarA, (j6m) null, (tl3) null, (ColorFilter) null, new nux(nkxVar, nkxVar), false, false, x340Var, 1073744896, 0, 3536);
                x340Var.r(true);
                qim0Var3 = qim0Var5;
            } else {
                x340Var.b0();
                qim0Var3 = qim0Var2;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new qx1((byte) 15, i, i2, this, str, qim0Var3);
            }
        }
        i3 |= 48;
        qim0Var2 = qim0Var;
        if ((i3 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (x340Var.Y(i3 & 1, z)) {
            qim0Var4 = nim0.a;
            if (i4 != 0) {
                qim0Var5 = qim0Var4;
            } else {
                qim0Var5 = qim0Var2;
            }
            uwr uwrVar2 = cbx.a;
            cua cuaVar2 = cbx.b(x340Var).f;
            cr31VarB = er31.b(4.0f);
            qim0 qim0VarZ2 = uyn1.z(0.0f, 0.0f, 3, u291.f(qim0Var5, 1.0f));
            zI = x340Var.i(cr31VarB);
            objT = x340Var.T();
            if (zI) {
                objT = new xkm0(cr31VarB, (byte) 12);
                x340Var.s0(objT);
            } else {
                objT = new xkm0(cr31VarB, (byte) 12);
                x340Var.s0(objT);
            }
            qim0 qim0VarC2 = i541.C(qim0VarZ2, (iu30) objT);
            gfh0VarC = t1c.c(een.d, false);
            iHashCode = Long.hashCode(x340Var.T);
            xos0VarM = x340Var.m();
            qim0VarE = zr7.E(x340Var, qim0VarC2);
            hzj.A.getClass();
            if (x340Var.a != null) {
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
            Uri uri2 = Uri.parse(str);
            jsl jslVar2 = new jsl(cwl1.o0(x340Var, 2131959007));
            cbx.a.getClass();
            ecx ecxVarA2 = uwr.a();
            nkx nkxVar2 = nkx.c;
            eso1.e(uri2, jslVar2, u291.f(qim0Var4, 1.0f), (p3v) null, (zvx) null, ecxVarA2, (j6m) null, (tl3) null, (ColorFilter) null, new nux(nkxVar2, nkxVar2), false, false, x340Var, 1073744896, 0, 3536);
            x340Var.r(true);
            qim0Var3 = qim0Var5;
        } else {
            x340Var.b0();
            qim0Var3 = qim0Var2;
        }
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new qx1((byte) 15, i, i2, this, str, qim0Var3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x006b  */
    /* JADX WARN: Code duplicated, block: B:40:0x006d  */
    /* JADX WARN: Code duplicated, block: B:43:0x0075 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:44:0x0077  */
    /* JADX WARN: Code duplicated, block: B:45:0x0079  */
    /* JADX WARN: Code duplicated, block: B:48:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:50:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:53:0x00df  */
    /* JADX WARN: Code duplicated, block: B:55:? A[RETURN, SYNTHETIC] */
    public final void f(String str, qim0 qim0Var, float f, qqb qqbVar, b0k b0kVar, int i, int i2) {
        int i3;
        qim0 qim0Var2;
        float f2;
        qqb qqbVar2;
        boolean z;
        b0k b0kVar2;
        qqb qqbVar3;
        h311 h311VarV;
        qqb qqbVar4;
        cr31 cr31Var;
        qim0 qim0VarF;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(1108799669);
        if ((i & 6) == 0) {
            i3 = (b0kVar3.g(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            qim0Var2 = qim0Var;
            i3 |= b0kVar3.i(qim0Var2) ? 32 : 16;
        } else {
            qim0Var2 = qim0Var;
        }
        if ((i & 384) == 0) {
            f2 = f;
            i3 |= b0kVar3.d(f2) ? 256 : 128;
        } else {
            f2 = f;
        }
        int i4 = i2 & 8;
        if (i4 == 0) {
            if ((i & 3072) == 0) {
                qqbVar2 = qqbVar;
                i3 |= b0kVar3.i(qqbVar2) ? 2048 : 1024;
            }
            if ((i3 & 1171) != 1170) {
                z = true;
            } else {
                z = false;
            }
            if (b0kVar3.Y(i3 & 1, z)) {
                if (i4 != 0) {
                    qqbVar4 = null;
                } else {
                    qqbVar4 = qqbVar2;
                }
                Uri uri = Uri.parse(str);
                jsl jslVar = new jsl(cwl1.o0(b0kVar3, 2131959010));
                cbx.a.getClass();
                ecx ecxVarA = uwr.a();
                ttx ttxVar = ttx.c;
                nux nuxVar = new nux(ttxVar, ttxVar);
                qim0 qim0VarR = d7e.r(1.0f, u291.f(qim0Var, f), false);
                cr31Var = er31.a;
                qim0 qim0VarQ = i1p1.q(qim0VarR, cr31Var);
                qim0VarF = nim0.a;
                if (qqbVar4 != null) {
                    qim0VarF = d1u.F(qim0VarF, qqbVar4.a, qqbVar4.b, cr31Var);
                }
                b0kVar2 = b0kVar3;
                eso1.e(uri, jslVar, qim0VarQ.then(qim0VarF), (p3v) null, (zvx) null, ecxVarA, (j6m) null, (tl3) null, (ColorFilter) null, nuxVar, false, false, b0kVar2, 1073744896, 0, 3536);
                qqbVar3 = qqbVar4;
            } else {
                b0kVar2 = b0kVar3;
                b0kVar2.b0();
                qqbVar3 = qqbVar2;
            }
            h311VarV = b0kVar2.v();
            if (h311VarV != null) {
                h311VarV.d = new fst(this, str, qim0Var2, f2, qqbVar3, i, i2);
            }
        }
        i3 |= 3072;
        qqbVar2 = qqbVar;
        if ((i3 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (b0kVar3.Y(i3 & 1, z)) {
            if (i4 != 0) {
                qqbVar4 = null;
            } else {
                qqbVar4 = qqbVar2;
            }
            Uri uri2 = Uri.parse(str);
            jsl jslVar2 = new jsl(cwl1.o0(b0kVar3, 2131959010));
            cbx.a.getClass();
            ecx ecxVarA2 = uwr.a();
            ttx ttxVar2 = ttx.c;
            nux nuxVar2 = new nux(ttxVar2, ttxVar2);
            qim0 qim0VarR2 = d7e.r(1.0f, u291.f(qim0Var, f), false);
            cr31Var = er31.a;
            qim0 qim0VarQ2 = i1p1.q(qim0VarR2, cr31Var);
            qim0VarF = nim0.a;
            if (qqbVar4 != null) {
                qim0VarF = d1u.F(qim0VarF, qqbVar4.a, qqbVar4.b, cr31Var);
            }
            b0kVar2 = b0kVar3;
            eso1.e(uri2, jslVar2, qim0VarQ2.then(qim0VarF), (p3v) null, (zvx) null, ecxVarA2, (j6m) null, (tl3) null, (ColorFilter) null, nuxVar2, false, false, b0kVar2, 1073744896, 0, 3536);
            qqbVar3 = qqbVar4;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qqbVar3 = qqbVar2;
        }
        h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new fst(this, str, qim0Var2, f2, qqbVar3, i, i2);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final void g(s5n0 s5n0Var, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        int i2;
        b6n0 b6n0Var;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1676698785);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(s5n0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(this) ? 32 : 16;
        }
        if (!x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            b6n0Var = this;
            x340Var.b0();
        } else if (s5n0Var instanceof q5n0) {
            x340Var.i0(694800002);
            b6n0Var = this;
            b6n0Var.e((i2 << 3) & 896, 2, ((q5n0) s5n0Var).a, x340Var, null);
            x340Var.r(false);
        } else {
            b6n0Var = this;
            if (s5n0Var instanceof r5n0) {
                x340Var.i0(694802778);
                r5n0 r5n0Var = (r5n0) s5n0Var;
                b6n0Var.k(r5n0Var.b, r5n0Var.a, x340Var, (i2 << 3) & 896);
                x340Var.r(false);
            } else {
                if (!(s5n0Var instanceof p5n0)) {
                    throw p3d1.k(x340Var, 694798642, false);
                }
                x340Var.i0(694809300);
                p5n0 p5n0Var = (p5n0) s5n0Var;
                b6n0Var.h(p5n0Var.a, p5n0Var.b, x340Var, (i2 << 3) & 896);
                x340Var.r(false);
            }
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new nbf0(b6n0Var, s5n0Var, i, (byte) 19);
        }
    }

    public final mqw getBehavior() {
        return this.g;
    }

    public final void h(String str, String str2, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1510007715);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.g(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(this) ? 256 : 128;
        }
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            w2g0.c(u291.f(nim0.a, 1.0f), (tl3) null, apo.r(456159885, new iwf0(str2, this, str), x340Var), x340Var, 3072, 6);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new w5n0(this, str, str2, i, (byte) 0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:91:0x04eb  */
    public final void i(u5n0 u5n0Var, iu30 iu30Var, b0k b0kVar, int i) {
        iu30 iu30Var2;
        x340 x340Var;
        lee1 lee1Var;
        m4c m4cVar;
        boolean z;
        vex vexVar;
        Object objValueOf;
        pl3 pl3Var = een.N0;
        m4c m4cVar2 = fkj0.X;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(-1097718507);
        j06 j06Var = x340Var2.a;
        int i2 = i | (x340Var2.i(u5n0Var) ? 4 : 2) | (x340Var2.i(iu30Var) ? 32 : 16) | (x340Var2.i(this) ? 256 : 128);
        if (x340Var2.Y(i2 & 1, (i2 & 147) != 146)) {
            h5n0 h5n0Var = u5n0Var.f;
            String str = h5n0Var.a;
            mic0 mic0VarL = v9c.l(new mmr0[]{new mmr0(Float.valueOf(0.0f), new u7h(u7h.b(m(h5n0Var.a), 0.7f, 0.0f, 0.0f, 0.0f, 14))), new mmr0(Float.valueOf(0.55f), new u7h(u7h.b(m(h5n0Var.b), 0.7f, 0.0f, 0.0f, 0.0f, 14))), new mmr0(Float.valueOf(1.0f), new u7h(u7h.b(m(h5n0Var.c), 0.7f, 0.0f, 0.0f, 0.0f, 14)))}, (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(Float.POSITIVE_INFINITY)) & 4294967295L), (((long) Float.floatToRawIntBits(Float.POSITIVE_INFINITY)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), 0);
            nim0 nim0Var = nim0.a;
            qim0 qim0VarF = u291.f(nim0Var, 1.0f);
            uwr uwrVar = cbx.a;
            cua cuaVar = cbx.b(x340Var2).f;
            qim0 qim0VarE = dug.e(dug.f(i1p1.q(qim0VarF, er31.b(16.0f)), m(str), d4o1.a), mic0VarL, (hw61) null, 0.0f, 6);
            int i3 = i2 & 112;
            boolean zI = (i3 == 32) | x340Var2.i(u5n0Var);
            Object objT = x340Var2.T();
            if (zI || objT == m4cVar2) {
                objT = new x5n0(iu30Var, u5n0Var);
                x340Var2.s0(objT);
            }
            qim0 qim0VarX = bin.x(qim0VarE, false, (String) null, (pm31) null, (idn0) null, (Function0) objT, 15);
            cvx cvxVar = cbx.b(x340Var2).b;
            qim0 qim0VarN = anm1.N("QuizCardRoot", uyn1.x(qim0VarX, 16.0f));
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var2, 0);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE2 = zr7.E(x340Var2, qim0VarN);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var2.m0();
            boolean z2 = x340Var2.S;
            n4k n4kVar = hmb0.t1;
            if (z2) {
                x340Var2.l(n4kVar);
            } else {
                x340Var2.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(mbhVarA, x340Var2, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var2, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var2, lljVar3);
            nko1.F(x340Var2);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE2, x340Var2, lljVar4);
            int i4 = (i2 >> 3) & 112;
            j(u5n0Var.d, x340Var2, i4);
            qim0 qim0VarF2 = u291.f(nim0Var, 1.0f);
            cvx cvxVar2 = cbx.b(x340Var2).b;
            qim0 qim0VarZ = uyn1.z(0.0f, 16.0f, 1, qim0VarF2);
            cu4 cu4Var = this.c;
            pl3 pl3Var2 = cu4Var.b() ? pl3Var : een.O0;
            b36 b36Var = h36.g;
            jw31 jw31VarA = ew31.a(b36Var, pl3Var2, x340Var2, 0);
            int iHashCode2 = Long.hashCode(x340Var2.T);
            xos0 xos0VarM2 = x340Var2.m();
            qim0 qim0VarE3 = zr7.E(x340Var2, qim0VarZ);
            x340Var2.m0();
            if (x340Var2.S) {
                x340Var2.l(n4kVar);
            } else {
                x340Var2.v0();
            }
            nko1.H(jw31VarA, x340Var2, lljVar);
            nko1.H(xos0VarM2, x340Var2, lljVar2);
            x0d.q(iHashCode2, x340Var2, lljVar3, x340Var2);
            nko1.H(qim0VarE3, x340Var2, lljVar4);
            pw31 pw31Var = pw31.a;
            w2g0.c(pw31Var.a(0.65f, nim0Var, true), (tl3) null, apo.r(1195182437, new mbj0(u5n0Var, (byte) 24), x340Var2), x340Var2, 3072, 6);
            cvx cvxVar3 = cbx.b(x340Var2).b;
            op71.g(x340Var2, u291.v(nim0Var, 16.0f));
            qim0 qim0VarA = pw31Var.a(0.35f, nim0Var, true);
            gfh0 gfh0VarC = t1c.c(een.i, false);
            int iHashCode3 = Long.hashCode(x340Var2.T);
            xos0 xos0VarM3 = x340Var2.m();
            qim0 qim0VarE4 = zr7.E(x340Var2, qim0VarA);
            x340Var2.m0();
            if (x340Var2.S) {
                x340Var2.l(n4kVar);
            } else {
                x340Var2.v0();
            }
            nko1.H(gfh0VarC, x340Var2, lljVar);
            nko1.H(xos0VarM3, x340Var2, lljVar2);
            x0d.q(iHashCode3, x340Var2, lljVar3, x340Var2);
            nko1.H(qim0VarE4, x340Var2, lljVar4);
            g(u5n0Var.e, x340Var2, i4);
            x340Var2.r(true);
            x340Var2.r(true);
            qim0 qim0VarF3 = u291.f(nim0Var, 1.0f);
            jw31 jw31VarA2 = ew31.a(b36Var, pl3Var, x340Var2, 0);
            int iHashCode4 = Long.hashCode(x340Var2.T);
            xos0 xos0VarM4 = x340Var2.m();
            qim0 qim0VarE5 = zr7.E(x340Var2, qim0VarF3);
            x340Var2.m0();
            if (x340Var2.S) {
                x340Var2.l(n4kVar);
            } else {
                x340Var2.v0();
            }
            nko1.H(jw31VarA2, x340Var2, lljVar);
            nko1.H(xos0VarM4, x340Var2, lljVar2);
            x0d.q(iHashCode4, x340Var2, lljVar3, x340Var2);
            nko1.H(qim0VarE5, x340Var2, lljVar4);
            String str2 = u5n0Var.c;
            if (cu4Var.b()) {
                x340Var2.i0(-1827080211);
                lee1Var = cbx.d(x340Var2).j;
                x340Var2.r(false);
            } else {
                x340Var2.i0(-1827078772);
                lee1Var = cbx.d(x340Var2).m;
                x340Var2.r(false);
            }
            zsc zscVar = zex.a;
            vex vexVar2 = (vex) zscVar.e;
            vex vexVar3 = (vex) zscVar.e;
            uwo1.e(str2, anm1.N("QuizCardTagLine", pw31Var.a(1.0f, nim0Var, true)), lee1Var, vexVar2.m, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var2, 0, 0, 2032);
            boolean zI2 = x340Var2.i(u5n0Var) | (i3 == 32);
            Object objT2 = x340Var2.T();
            if (zI2) {
                m4cVar = m4cVar2;
            } else {
                m4cVar = m4cVar2;
                if (objT2 == m4cVar) {
                }
                iu30Var2 = iu30Var;
                foo1.c(new gbx(z50.c, (Function0) objT2), jdx.c, anm1.N("QuizCardPlayButton", nim0Var), (max) null, yla.s(x340Var2), (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, apo.r(1093450821, new fhk0(u5n0Var, (byte) 10), x340Var2), x340Var2, 0, 48, 2008);
                x340Var = x340Var2;
                x340Var.r(true);
                String str3 = u5n0Var.i;
                if (cu4Var.b() || str3 == null) {
                    z = true;
                    x340Var.i0(-448172061);
                    x340Var.r(false);
                } else {
                    x340Var.i0(-449451152);
                    cvx cvxVar4 = cbx.b(x340Var).b;
                    qim0 qim0VarB = uyn1.B(nim0Var, 0.0f, 4.0f, 0.0f, 0.0f, 13);
                    jw31 jw31VarA3 = ew31.a(h36.a, pl3Var, x340Var, 0);
                    int iHashCode5 = Long.hashCode(x340Var.T);
                    xos0 xos0VarM5 = x340Var.m();
                    qim0 qim0VarE6 = zr7.E(x340Var, qim0VarB);
                    x340Var.m0();
                    if (x340Var.S) {
                        x340Var.l(n4kVar);
                    } else {
                        x340Var.v0();
                    }
                    nko1.H(jw31VarA3, x340Var, lljVar);
                    nko1.H(xos0VarM5, x340Var, lljVar2);
                    x0d.q(iHashCode5, x340Var, lljVar3, x340Var);
                    nko1.H(qim0VarE6, x340Var, lljVar4);
                    int i5 = u5n0Var.j;
                    int i6 = i5 == 0 ? -1 : z5n0.a[l1d.C(i5)];
                    if (i6 == -1) {
                        z = true;
                        vexVar = vexVar3;
                        x340Var.i0(479894912);
                        x340Var.r(false);
                    } else {
                        if (i6 != 1) {
                            throw p3d1.k(x340Var, 1123832614, false);
                        }
                        x340Var.i0(479135970);
                        lee1 lee1Var2 = cbx.d(x340Var).o;
                        yae1 yae1VarQ = d5p1.q(0, x340Var, 1);
                        boolean zG = x340Var.g(yae1VarQ);
                        Object objT3 = x340Var.T();
                        if (zG || objT3 == m4cVar) {
                            objValueOf = Integer.valueOf((int) (yae1.a(yae1VarQ, "", lee1Var2, 0, false, 0, 0L, (flb0) null, (xat) null, 1020).c & 4294967295L));
                            x340Var.s0(objValueOf);
                        } else {
                            objValueOf = objT3;
                        }
                        int iIntValue = ((Number) objValueOf).intValue();
                        wat watVar = (wat) x340Var.k(t4k.h);
                        eox eoxVar = eox.c;
                        vexVar = vexVar3;
                        long j = vexVar.m;
                        cvx cvxVar5 = cbx.b(x340Var).b;
                        z = true;
                        w0h1.a(eoxVar, isl.a, u291.h(u291.v(uyn1.B(nim0Var, 0.0f, 0.0f, 4.0f, 0.0f, 11), watVar.y(lee1Var2.a.b)), watVar.M0(iIntValue)), j, 0L, false, x340Var, eox.d | 48, 48);
                        x340Var = x340Var;
                        x340Var.r(false);
                    }
                    x340 x340Var3 = x340Var;
                    uwo1.e(str3, (qim0) null, cbx.d(x340Var).o, vexVar.m, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var3, 0, 0, 2034);
                    x340Var = x340Var3;
                    x340Var.r(z);
                    x340Var.r(false);
                }
                x340Var.r(z);
            }
            objT2 = new x5n0(u5n0Var, iu30Var);
            x340Var2.s0(objT2);
            iu30Var2 = iu30Var;
            foo1.c(new gbx(z50.c, (Function0) objT2), jdx.c, anm1.N("QuizCardPlayButton", nim0Var), (max) null, yla.s(x340Var2), (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, apo.r(1093450821, new fhk0(u5n0Var, (byte) 10), x340Var2), x340Var2, 0, 48, 2008);
            x340Var = x340Var2;
            x340Var.r(true);
            String str4 = u5n0Var.i;
            if (cu4Var.b()) {
                z = true;
                x340Var.i0(-448172061);
                x340Var.r(false);
            } else {
                z = true;
                x340Var.i0(-448172061);
                x340Var.r(false);
            }
            x340Var.r(z);
        } else {
            iu30Var2 = iu30Var;
            x340Var = x340Var2;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new y5n0(this, u5n0Var, iu30Var2, i);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final void j(String str, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        int i2;
        boolean z;
        String str2;
        String strK;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1014137267);
        if ((i & 6) == 0) {
            i2 = i | (x340Var.g(str) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(this) ? 32 : 16;
        }
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            x340Var.i0(371664735);
            wat watVar = (wat) x340Var.k(t4k.h);
            uwr uwrVar = cbx.a;
            float fY = watVar.y(cbx.d(x340Var).g.a.b) * 1.2f;
            x340Var.r(false);
            fra fraVar = een.N0;
            nim0 nim0Var = nim0.a;
            qim0 qim0VarN = anm1.N("QuizCardLogo", nim0Var);
            jw31 jw31VarA = ew31.a(h36.a, fraVar, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarN);
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
            nko1.H(jw31VarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            cwl1.f(oi7.a(Uri.parse(str), (gw70) null, (xb10) null, (yqi1) null, (jmr0) null, (jmr0) null, false, true, (j6m) null, (iu30) null, (iu30) null, (iu30) null, 0L, x340Var, 805306368, 0, 130558), (String) null, u291.D(u291.h(nim0Var, fY), (era) null, 1), (tl3) null, mif1.R0, 0.0f, (ColorFilter) null, x340Var, 48, 104);
            x340Var = x340Var;
            int iOrdinal = this.b.ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal == 1) {
                    z = false;
                    strK = x0d.k(x340Var, 1949500290, 2131959008, x340Var, false);
                } else {
                    if (iOrdinal != 2) {
                        throw p3d1.k(x340Var, 1949498002, false);
                    }
                    x340Var.i0(-1422603889);
                    z = false;
                    x340Var.r(false);
                    strK = "Internal only";
                }
                str2 = strK;
            } else {
                z = false;
                x340Var.i0(304933708);
                x340Var.r(false);
                str2 = null;
            }
            if (str2 == null) {
                x340Var.i0(305134464);
                x340Var.r(z);
            } else {
                x340Var.i0(305134465);
                cvx cvxVar = cbx.b(x340Var).b;
                op71.g(x340Var, u291.v(nim0Var, 8.0f));
                suo1.f(str2, 4, (qim0) null, 0, x340Var, 48, 28);
                x340Var.r(z);
            }
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new nbf0(this, str, i, (byte) 20);
        }
    }

    public final void k(String str, String str2, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-762175769);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.g(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(this) ? 256 : 128;
        }
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            nim0 nim0Var = nim0.a;
            qim0 qim0VarR = d7e.r(1.0f, u291.f(nim0Var, 1.0f), false);
            gra graVar = een.d;
            gfh0 gfh0VarC = t1c.c(graVar, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarR);
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
            int length = str.length();
            h2c h2cVar = h2c.a;
            if (length > 0) {
                x340Var.i0(-511173642);
                f(str, h2cVar.a(nim0Var, graVar), str2.length() > 0 ? 0.65f : 1.0f, null, x340Var, ((i2 << 6) & 57344) | (i2 & 14), 8);
                x340Var.r(false);
            } else {
                x340Var.i0(-510970623);
                x340Var.r(false);
            }
            if (str2.length() > 0) {
                x340Var.i0(-510907445);
                f(str2, h2cVar.a(nim0Var, een.Y), str.length() > 0 ? 0.65f : 1.0f, k1u.d(2.0f, u7h.j), x340Var, ((i2 >> 3) & 14) | ((i2 << 6) & 57344), 0);
                x340Var.r(false);
            } else {
                x340Var.i0(-510632351);
                x340Var.r(false);
            }
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new w5n0(this, str, str2, i, (byte) 1);
        }
    }
}
