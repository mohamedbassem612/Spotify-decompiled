package p;

import android.net.Uri;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.text.font.FontWeight;
import java.util.Locale;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public abstract class rck {
    public static final long a = u7h.b(u7h.f, 0.1f, 0.0f, 0.0f, 0.0f, 14);
    public static final float b = 700.0f;
    public static final float c = 80.0f;
    public static final float d = 116.0f;
    public static final float e = 4.0f;
    public static final ceo f = new ceo(0.4f, 0.0f, 0.6f, 1.0f);

    public static final void a(int i, long j, float f2, float f3, b0k b0kVar, int i2) {
        x340 x340Var = (x340) b0kVar;
        int i3 = i2 | (kk0.t(-2114395064, i, x340Var) ? 4 : 2) | (x340Var.f(j) ? 32 : 16) | (x340Var.d(f2) ? 256 : 128) | (x340Var.d(f3) ? 2048 : 1024);
        if (x340Var.Y(i3 & 1, (i3 & 1171) != 1170)) {
            nim0 nim0Var = nim0.a;
            qim0 qim0VarV = u291.v(nim0Var, f2);
            uwr uwrVar = cbx.a;
            zov0 zov0Var = cbx.b(x340Var).g;
            qim0 qim0VarN = anm1.N("countdown_icon", i1p1.r(u291.h(qim0VarV, 16.0f)));
            gfh0 gfh0VarC = t1c.c(een.d, false);
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
            nko1.H(gfh0VarC, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            hux huxVarK = k(i);
            zov0 zov0Var2 = cbx.b(x340Var).g;
            qim0 qim0VarR = u291.r(nim0Var, 16.0f);
            boolean z = (i3 & 7168) == 2048;
            Object objT = x340Var.T();
            if (z || objT == fkj0.X) {
                objT = new jc5((byte) 11, f3);
                x340Var.s0(objT);
            }
            w0h1.a(huxVarK, isl.a, i541.C(qim0VarR, (iu30) objT), j, 0L, false, x340Var, 56 | ((i3 << 6) & 7168), 48);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ack(f2, f3, i, i2, j);
        }
    }

    public static final void b(String str, float f2, float f3, b0k b0kVar, int i) {
        b0k b0kVar2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-1915500308);
        int i2 = (b0kVar3.g(str) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i2 |= b0kVar3.d(f2) ? 32 : 16;
        }
        int i3 = i2 | (b0kVar3.d(f3) ? 256 : 128);
        if (b0kVar3.Y(i3 & 1, (i3 & 147) != 146)) {
            String str2 = str.length() == 0 ? null : str;
            Uri uri = str2 != null ? Uri.parse(str2) : Uri.EMPTY;
            uri.getClass();
            nkx nkxVar = nkx.c;
            b0kVar2 = b0kVar3;
            eso1.e(uri, isl.a, i1p1.q(u291.r(nim0.a, f2), er31.b(f3)), (p3v) null, (zvx) null, (ecx) null, (j6m) null, (tl3) null, (ColorFilter) null, new nux(nkxVar, nkxVar), false, true, b0kVar2, 1073741872, 48, 1528);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new mu11(str, f2, f3, i);
        }
    }

    public static final void c(hdk hdkVar, gw70 gw70Var, iu30 iu30Var, qim0 qim0Var, boolean z, b0k b0kVar, int i, int i2) {
        int i3;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1429678674);
        if ((i & 6) == 0) {
            i3 = (x340Var.i(hdkVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= x340Var.i(gw70Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= x340Var.i(iu30Var) ? 256 : 128;
        }
        int i4 = i3 | 3072;
        int i5 = i2 & 16;
        if (i5 != 0) {
            i4 = i3 | 27648;
        } else if ((i & 24576) == 0) {
            i4 |= x340Var.h(z) ? 16384 : 8192;
        }
        if (x340Var.Y(i4 & 1, (i4 & 9363) != 9362)) {
            if (i5 != 0) {
                z = false;
            }
            mod.b(oi7.a.a(gw70Var), apo.r(2067646702, new zs(hdkVar, iu30Var, z), x340Var), x340Var, 56);
            qim0Var = nim0.a;
        } else {
            x340Var.b0();
        }
        qim0 qim0Var2 = qim0Var;
        boolean z2 = z;
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new oia(hdkVar, gw70Var, iu30Var, qim0Var2, z2, i, i2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0033  */
    /* JADX WARN: Code duplicated, block: B:16:0x0036  */
    /* JADX WARN: Code duplicated, block: B:19:0x003f  */
    /* JADX WARN: Code duplicated, block: B:20:0x0041  */
    /* JADX WARN: Code duplicated, block: B:23:0x004a  */
    /* JADX WARN: Code duplicated, block: B:32:0x0063  */
    /* JADX WARN: Code duplicated, block: B:34:0x0067  */
    /* JADX WARN: Code duplicated, block: B:37:0x007c  */
    /* JADX WARN: Code duplicated, block: B:38:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:40:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:43:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:45:? A[RETURN, SYNTHETIC] */
    public static final void d(u7h u7hVar, gdx gdxVar, Function0 function0, b0k b0kVar, int i, int i2) {
        gdx gdxVarS;
        int i3;
        int i4;
        boolean z;
        h311 h311VarV;
        gdx gdxVar2;
        String strO0;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(639893111);
        int i5 = i | (x340Var.g(u7hVar) ? 4 : 2);
        if ((i2 & 2) == 0) {
            gdxVarS = gdxVar;
            int i6 = x340Var.i(gdxVarS) ? 32 : 16;
            int i7 = i5 | i6;
            if (x340Var.i(function0)) {
                i3 = 256;
            } else {
                i3 = 128;
            }
            i4 = i7 | i3;
            if ((i4 & 147) != 146) {
                z = true;
            } else {
                z = false;
            }
            if (x340Var.Y(i4 & 1, z)) {
                x340Var.d0();
                if ((i & 1) == 0 && !x340Var.E()) {
                    x340Var.b0();
                    if ((i2 & 2) != 0) {
                        i4 &= -113;
                    }
                } else if ((i2 & 2) != 0) {
                    gdxVarS = yla.s(x340Var);
                    i4 &= -113;
                }
                gdxVar2 = gdxVarS;
                x340Var.s();
                strO0 = cwl1.o0(x340Var, 2131956604);
                if (!ihc1.y0(strO0)) {
                    hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                    return;
                }
                gbx gbxVar = new gbx(new y50(strO0), function0);
                ldx ldxVar = ldx.c;
                uwr uwrVar = cbx.a;
                mta mtaVar = cbx.b(x340Var).d;
                wro1.h(gbxVar, ldxVar, anm1.N("share_button", u291.r(nim0.a, 48.0f)), (max) null, gdxVar2, (vzq0) null, false, (idn0) null, (ga80) null, apo.r(-63660480, new l2i(gdxVar2, u7hVar, (byte) 28), x340Var), x340Var, (i4 << 12) & 458752, 6, 984);
                gdxVarS = gdxVar2;
            } else {
                x340Var.b0();
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new r27(u7hVar, gdxVarS, function0, i, i2, (byte) 7);
            }
        }
        gdxVarS = gdxVar;
        int i8 = i5 | i6;
        if (x340Var.i(function0)) {
            i3 = 256;
        } else {
            i3 = 128;
        }
        i4 = i8 | i3;
        if ((i4 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (x340Var.Y(i4 & 1, z)) {
            x340Var.d0();
            if ((i & 1) == 0) {
                if ((i2 & 2) != 0) {
                    gdxVarS = yla.s(x340Var);
                    i4 &= -113;
                }
            } else if ((i2 & 2) != 0) {
                gdxVarS = yla.s(x340Var);
                i4 &= -113;
            }
            gdxVar2 = gdxVarS;
            x340Var.s();
            strO0 = cwl1.o0(x340Var, 2131956604);
            if (!ihc1.y0(strO0)) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return;
            }
            gbx gbxVar2 = new gbx(new y50(strO0), function0);
            ldx ldxVar2 = ldx.c;
            uwr uwrVar2 = cbx.a;
            mta mtaVar2 = cbx.b(x340Var).d;
            wro1.h(gbxVar2, ldxVar2, anm1.N("share_button", u291.r(nim0.a, 48.0f)), (max) null, gdxVar2, (vzq0) null, false, (idn0) null, (ga80) null, apo.r(-63660480, new l2i(gdxVar2, u7hVar, (byte) 28), x340Var), x340Var, (i4 << 12) & 458752, 6, 984);
            gdxVarS = gdxVar2;
        } else {
            x340Var.b0();
        }
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new r27(u7hVar, gdxVarS, function0, i, i2, (byte) 7);
        }
    }

    public static final void e(hdk hdkVar, iu30 iu30Var, boolean z, float f2, Function0 function0, qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        long jA;
        long j;
        qim0 qim0Var3;
        long j2;
        ksl kslVar;
        qim0 qim0Var4;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1513036728);
        j06 j06Var = x340Var.a;
        int i2 = i | (x340Var.i(hdkVar) ? 4 : 2) | (x340Var.i(iu30Var) ? 32 : 16) | (x340Var.h(z) ? 256 : 128) | (x340Var.d(f2) ? 2048 : 1024) | (x340Var.i(function0) ? 16384 : 8192) | 196608;
        if (x340Var.Y(i2 & 1, (i2 & 74899) != 74898)) {
            xie1 xie1Var = new xie1(4.0f, 10.0f, 10.0f, 0.5f);
            boolean zJ = vqo1.j(x340Var);
            d7d d7dVar = hdkVar.m;
            String str = hdkVar.d;
            u7h u7hVar = hdkVar.j;
            float f3 = ((d7dVar instanceof y6d) || (d7dVar instanceof w6d)) ? 0.2f : 0.3f;
            qim0 qim0Var5 = nim0.a;
            qim0 qim0VarE = d1u.E(1.0f, hdkVar.l, i1p1.q(u291.h(u291.f(qim0Var5, 1.0f), 56.0f), xie1Var), xie1Var);
            u7h u7hVar2 = hdkVar.k;
            if (u7hVar2 == null) {
                x340Var.i0(-1965584388);
                uwr uwrVar = cbx.a;
                jA = cbx.a(x340Var).a.b.a();
                x340Var.r(false);
            } else {
                x340Var.i0(-1965586217);
                x340Var.r(false);
                jA = u7hVar2.a;
            }
            qim0 qim0VarI = zr7.i(dug.f(qim0VarE, jA, d4o1.a), new asb1(f3, zJ));
            int i3 = i2 & 112;
            boolean z2 = i3 == 32;
            Object objT = x340Var.T();
            if (z2 || objT == m4cVar) {
                objT = new erj(iu30Var, (byte) 26);
                x340Var.s0(objT);
            }
            qim0 qim0VarX = bin.x(qim0VarI, false, (String) null, (pm31) null, (idn0) null, (Function0) objT, 15);
            uwr uwrVar2 = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            cvx cvxVar2 = cbx.b(x340Var).b;
            qim0 qim0VarY = uyn1.y(qim0VarX, 16.0f, 8.0f);
            fra fraVar = een.N0;
            cvx cvxVar3 = cbx.b(x340Var).b;
            jw31 jw31VarA = ew31.a(new d36(8.0f, true, new um5(false)), fraVar, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0VarY);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            boolean z3 = x340Var.S;
            n4k n4kVar = hmb0.t1;
            if (z3) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(jw31VarA, x340Var, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var, lljVar3);
            nko1.F(x340Var);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE2, x340Var, lljVar4);
            b(hdkVar.c, 40.0f, 2.0f, x340Var, 48);
            wnb0 wnb0Var = new wnb0(1.0f, true);
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE3 = zr7.E(x340Var, wnb0Var);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(mbhVarA, x340Var, lljVar);
            nko1.H(xos0VarM2, x340Var, lljVar2);
            x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE3, x340Var, lljVar4);
            if (u7hVar == null) {
                x340Var.i0(-197616970);
                j = cbx.a(x340Var).b.a;
                x340Var.r(false);
            } else {
                x340Var.i0(-197618241);
                x340Var.r(false);
                j = u7hVar.a;
            }
            long j3 = j;
            gxo1.c(hdkVar.b.toUpperCase(Locale.ROOT), (qim0) null, cbx.d(x340Var).k, j3, (a0e1) null, 2, false, new cjc0(1), (qx8) null, 0.0f, (FontWeight) ((bjx) ajx.a.c).e, (iu30) null, x340Var, 0, 0, 2898);
            x340Var = x340Var;
            int length = str.length();
            ksl kslVar2 = isl.a;
            if (length > 0) {
                x340Var.i0(-1830795514);
                cvx cvxVar4 = cbx.b(x340Var).b;
                jw31 jw31VarA2 = ew31.a(new d36(4.0f, true, new um5(false)), fraVar, x340Var, 0);
                int iHashCode3 = Long.hashCode(x340Var.T);
                xos0 xos0VarM3 = x340Var.m();
                qim0 qim0VarE4 = zr7.E(x340Var, qim0Var5);
                x340Var.m0();
                if (x340Var.S) {
                    x340Var.l(n4kVar);
                } else {
                    x340Var.v0();
                }
                nko1.H(jw31VarA2, x340Var, lljVar);
                nko1.H(xos0VarM3, x340Var, lljVar2);
                x0d.q(iHashCode3, x340Var, lljVar3, x340Var);
                nko1.H(qim0VarE4, x340Var, lljVar4);
                int i4 = hdkVar.C;
                if (i4 == 0) {
                    x340Var.i0(-1802629144);
                    x340Var.r(false);
                } else {
                    x340Var.i0(-1802629143);
                    hux huxVarK = k(i4);
                    zov0 zov0Var = cbx.b(x340Var).g;
                    w0h1.a(huxVarK, kslVar2, u291.r(qim0Var5, 12.0f), j3, 0L, false, x340Var, 56, 48);
                    x340Var.r(false);
                }
                qim0Var3 = qim0Var5;
                uwo1.e(str, (qim0) null, cbx.d(x340Var).j, j3, (a0e1) null, (iu30) null, 2, false, new cjc0(1), 0, (qx8) null, x340Var, 0, 0, 1714);
                x340Var = x340Var;
                x340Var.r(true);
                x340Var.r(false);
            } else {
                kslVar2 = kslVar2;
                qim0Var3 = qim0Var5;
                x340Var.i0(-1830101424);
                x340Var.r(false);
            }
            x340Var.r(true);
            if (u7hVar == null) {
                x340Var.i0(1707907040);
                j2 = cbx.a(x340Var).b.a;
                x340Var.r(false);
            } else {
                x340Var.i0(1707905769);
                x340Var.r(false);
                j2 = u7hVar.a;
            }
            long j4 = j2;
            if (hdkVar.s) {
                x340Var.i0(1405562925);
                fpx fpxVar = fpx.c;
                zov0 zov0Var2 = cbx.b(x340Var).g;
                qim0 qim0Var6 = qim0Var3;
                qim0 qim0VarR = u291.r(qim0Var6, 24.0f);
                boolean z4 = i3 == 32;
                Object objT2 = x340Var.T();
                if (z4 || objT2 == m4cVar) {
                    objT2 = new erj(iu30Var, (byte) 27);
                    x340Var.s0(objT2);
                }
                qim0Var4 = qim0Var6;
                kslVar = kslVar2;
                w0h1.a(fpxVar, kslVar, bin.x(qim0VarR, false, (String) null, (pm31) null, (idn0) null, (Function0) objT2, 15), j4, 0L, false, x340Var, fpx.d | 48, 48);
                x340Var.r(false);
            } else {
                kslVar = kslVar2;
                qim0Var4 = qim0Var3;
                x340Var.i0(1405808166);
                x340Var.r(false);
            }
            if (z) {
                x340Var.i0(1405841367);
                g(f2, j4, true, function0, null, x340Var, ((i2 >> 9) & 14) | 384 | ((i2 >> 3) & 7168));
                x340Var.r(false);
            } else {
                x340Var.i0(1406030343);
                jkx jkxVar = jkx.c;
                zov0 zov0Var3 = cbx.b(x340Var).g;
                w0h1.a(jkxVar, kslVar, anm1.N("collapsed_arrow", u291.r(qim0Var4, 24.0f)), j4, 0L, false, x340Var, jkx.d | 48, 48);
                x340Var.r(false);
            }
            x340Var.r(true);
            qim0Var2 = qim0Var4;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new eck(hdkVar, iu30Var, z, f2, function0, qim0Var2, i, (byte) 0);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code duplicated, block: B:100:0x013c  */
    /* JADX WARN: Code duplicated, block: B:103:0x0158  */
    /* JADX WARN: Code duplicated, block: B:106:0x016e  */
    /* JADX WARN: Code duplicated, block: B:107:0x0170  */
    /* JADX WARN: Code duplicated, block: B:109:0x0173  */
    /* JADX WARN: Code duplicated, block: B:111:0x017b  */
    /* JADX WARN: Code duplicated, block: B:113:0x017f  */
    /* JADX WARN: Code duplicated, block: B:116:0x018a  */
    /* JADX WARN: Code duplicated, block: B:117:0x018d  */
    /* JADX WARN: Code duplicated, block: B:123:0x019b  */
    /* JADX WARN: Code duplicated, block: B:126:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:127:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:131:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:134:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:135:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:139:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:141:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:143:0x0214  */
    /* JADX WARN: Code duplicated, block: B:145:0x022f  */
    /* JADX WARN: Code duplicated, block: B:148:0x0244  */
    /* JADX WARN: Code duplicated, block: B:150:0x0249  */
    /* JADX WARN: Code duplicated, block: B:153:0x025b  */
    /* JADX WARN: Code duplicated, block: B:157:0x0274  */
    /* JADX WARN: Code duplicated, block: B:160:0x0297  */
    /* JADX WARN: Code duplicated, block: B:162:0x02a0  */
    /* JADX WARN: Code duplicated, block: B:175:0x02ce  */
    /* JADX WARN: Code duplicated, block: B:180:0x02f7  */
    /* JADX WARN: Code duplicated, block: B:182:0x0313  */
    /* JADX WARN: Code duplicated, block: B:183:0x0315  */
    /* JADX WARN: Code duplicated, block: B:186:0x031f  */
    /* JADX WARN: Code duplicated, block: B:187:0x0321  */
    /* JADX WARN: Code duplicated, block: B:190:0x032a  */
    /* JADX WARN: Code duplicated, block: B:191:0x032c  */
    /* JADX WARN: Code duplicated, block: B:194:0x0335  */
    /* JADX WARN: Code duplicated, block: B:195:0x0337  */
    /* JADX WARN: Code duplicated, block: B:201:0x034c  */
    /* JADX WARN: Code duplicated, block: B:205:0x0375  */
    /* JADX WARN: Code duplicated, block: B:209:0x037e  */
    /* JADX WARN: Code duplicated, block: B:212:0x039a  */
    /* JADX WARN: Code duplicated, block: B:213:0x03c4  */
    /* JADX WARN: Code duplicated, block: B:215:0x03ef  */
    /* JADX WARN: Code duplicated, block: B:216:0x03f9  */
    /* JADX WARN: Code duplicated, block: B:218:0x040d  */
    /* JADX WARN: Code duplicated, block: B:219:0x0418  */
    /* JADX WARN: Code duplicated, block: B:221:0x0422  */
    /* JADX WARN: Code duplicated, block: B:222:0x043b  */
    /* JADX WARN: Code duplicated, block: B:225:0x0482  */
    /* JADX WARN: Code duplicated, block: B:227:0x0488  */
    /* JADX WARN: Code duplicated, block: B:230:0x0498  */
    /* JADX WARN: Code duplicated, block: B:232:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:233:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:31:0x0063  */
    /* JADX WARN: Code duplicated, block: B:32:0x0068  */
    /* JADX WARN: Code duplicated, block: B:34:0x0070  */
    /* JADX WARN: Code duplicated, block: B:35:0x0073  */
    /* JADX WARN: Code duplicated, block: B:39:0x007b  */
    /* JADX WARN: Code duplicated, block: B:40:0x0082  */
    /* JADX WARN: Code duplicated, block: B:42:0x008a  */
    /* JADX WARN: Code duplicated, block: B:43:0x008d  */
    /* JADX WARN: Code duplicated, block: B:47:0x0095  */
    /* JADX WARN: Code duplicated, block: B:48:0x009c  */
    /* JADX WARN: Code duplicated, block: B:50:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:51:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:55:0x00af  */
    /* JADX WARN: Code duplicated, block: B:56:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:58:0x00be  */
    /* JADX WARN: Code duplicated, block: B:59:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:63:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:67:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:68:0x00df  */
    /* JADX WARN: Code duplicated, block: B:71:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:73:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:74:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:76:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:77:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:79:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:80:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:83:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:86:0x0100  */
    /* JADX WARN: Code duplicated, block: B:87:0x0102  */
    /* JADX WARN: Code duplicated, block: B:89:0x0106  */
    /* JADX WARN: Code duplicated, block: B:91:0x010c  */
    /* JADX WARN: Code duplicated, block: B:93:0x0119  */
    /* JADX WARN: Code duplicated, block: B:96:0x0126  */
    /* JADX WARN: Code duplicated, block: B:98:0x012c  */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r8v4 float, still in use, count: 1, list:
          (r8v4 float) from 0x0152: CMP_G (r14v7 float), (r8v4 float) A[WRAPPED] (LINE:339)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:226)
        	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:215)
        	at jadx.core.dex.visitors.regions.TernaryMod.replaceWithTernary(TernaryMod.java:338)
        	at jadx.core.dex.visitors.regions.TernaryMod.processOneBranchTernary(TernaryMod.java:284)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:82)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    public static final void f(p.wck r35, p.u7h r36, p.fb5 r37, boolean r38, boolean r39, float r40, int r41, p.iu30 r42, kotlin.jvm.functions.Function0 r43, p.b0k r44, int r45, int r46) throws kotlin.NoWhenBranchMatchedException {
        /*
            Method dump skipped, instruction units count: 1195
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.rck.f(p.wck, p.u7h, p.fb5, boolean, boolean, float, int, p.iu30, kotlin.jvm.functions.Function0, p.b0k, int, int):void");
    }

    public static final void g(float f2, long j, boolean z, Function0 function0, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        Function0 function1;
        b0k b0kVar2;
        qim0 qim0Var2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-1288134667);
        if ((i & 6) == 0) {
            i2 = (b0kVar3.d(f2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= b0kVar3.f(j) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= b0kVar3.h(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            function1 = function0;
            i2 |= b0kVar3.i(function1) ? 2048 : 1024;
        } else {
            function1 = function0;
        }
        int i3 = i2 | 24576;
        if (b0kVar3.Y(i3 & 1, (i3 & 9363) != 9362)) {
            String strO0 = cwl1.o0(b0kVar3, z ? 2131956603 : 2131956602);
            qlx qlxVar = qlx.c;
            jsl jslVar = new jsl(strO0);
            uwr uwrVar = cbx.a;
            zov0 zov0Var = cbx.b(b0kVar3).g;
            qim0Var2 = nim0.a;
            qim0 qim0VarR = u291.r(qim0Var2, 24.0f);
            boolean z2 = (i3 & 14) == 4;
            Object objT = b0kVar3.T();
            if (z2 || objT == fkj0.X) {
                objT = new jc5((byte) 12, f2);
                b0kVar3.s0(objT);
            }
            b0kVar2 = b0kVar3;
            w0h1.a(qlxVar, jslVar, bin.x(anm1.N("expand_toggle", i541.C(qim0VarR, (iu30) objT)), false, (String) null, (pm31) null, (idn0) null, function1, 15), j, 0L, false, b0kVar2, qlx.d | ((i3 << 6) & 7168), 48);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new vud(f2, j, z, function0, qim0Var2, i);
        }
    }

    public static final void h(hdk hdkVar, iu30 iu30Var, boolean z, float f2, Function0 function0, float f3, float f4, fb5 fb5Var, float f5, int i, qim0 qim0Var, float f6, p3v p3vVar, boolean z2, boolean z3, iu30 iu30Var2, b0k b0kVar, int i2) {
        x340 x340Var;
        qim0 qim0Var2;
        boolean z4;
        x340 x340Var2;
        long jA;
        x340 x340Var3 = (x340) b0kVar;
        x340Var3.k0(-1161635223);
        int i3 = i2 | (x340Var3.i(hdkVar) ? 4 : 2) | (x340Var3.i(iu30Var) ? 32 : 16) | (x340Var3.h(z) ? 256 : 128) | (x340Var3.d(f2) ? 2048 : 1024) | (x340Var3.i(function0) ? 16384 : 8192) | (x340Var3.d(f3) ? 131072 : 65536) | (x340Var3.d(f4) ? 1048576 : 524288) | (x340Var3.g(fb5Var) ? 8388608 : 4194304) | (x340Var3.d(f5) ? 67108864 : 33554432) | (x340Var3.e(i) ? 536870912 : 268435456);
        if (x340Var3.Y(i3 & 1, ((i3 & 306783379) == 306783378 && ((((((6 | (x340Var3.d(f6) ? ' ' : (char) 16)) | (x340Var3.g(p3vVar) ? 256 : 128)) | (x340Var3.h(z2) ? 2048 : 1024)) | (x340Var3.h(z3) ? (char) 16384 : (char) 8192)) | (x340Var3.i(iu30Var2) ? (char) 0 : (char) 0)) & 74899) == 74898) ? false : true)) {
            Object objT = x340Var3.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = us71.i(0.6567f, x340Var3);
            }
            drr0 drr0Var = (drr0) objT;
            if (z3) {
                x340Var3.i0(360069644);
                boolean z5 = ((wat) x340Var3.k(t4k.h)).U0() > 1.0f;
                x340Var3.r(false);
                z4 = z5;
            } else {
                x340Var3.i0(-1722741687);
                x340Var3.r(false);
                z4 = false;
            }
            boolean zD = x340Var3.d(drr0Var.s());
            boolean z6 = z4;
            Object objT2 = x340Var3.T();
            if (zD || objT2 == m4cVar) {
                objT2 = new xie1(16.0f, 16.0f, 16.0f, drr0Var.s());
                x340Var3.s0(objT2);
            }
            xie1 xie1Var = (xie1) objT2;
            gv21 gv21VarZ = sj1.z(hdkVar.p, hdkVar.m, vqo1.j(x340Var3), hdkVar.q, hdkVar.r, z2);
            boolean z7 = gv21VarZ.a;
            ven0 ven0VarD = pap1.D(z7 || gv21VarZ.b || gv21VarZ.c, x340Var3);
            d7d d7dVar = hdkVar.m;
            float f7 = ((d7dVar instanceof y6d) || (d7dVar instanceof w6d)) ? 0.2f : 0.3f;
            float f8 = e;
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarQ = i1p1.q(zr7.i(pap1.r(u291.f(uyn1.x(qim0Var3, f8), 1.0f), ven0VarD, gv21VarZ.d, 28), new vpw(gv21VarZ.b, hdkVar.l, xie1Var, ven0VarD)), xie1Var);
            u7h u7hVar = hdkVar.k;
            if (u7hVar == null) {
                x340Var2 = x340Var3;
                x340Var2.i0(360111597);
                uwr uwrVar = cbx.a;
                jA = cbx.a(x340Var2).a.b.a();
                x340Var2.r(false);
            } else {
                x340Var2 = x340Var3;
                x340Var2.i0(360109768);
                x340Var2.r(false);
                jA = u7hVar.a;
            }
            qim0 qim0VarI = zr7.i(p3f0.c(dug.f(qim0VarQ, jA, d4o1.a), ven0VarD, gv21VarZ.c, p3vVar, null, null, drr0Var.s(), 24), new km60((byte) 0, f7, ven0VarD, z7));
            boolean zI = x340Var2.i(drr0Var) | x340Var2.i(hdkVar);
            Object objT3 = x340Var2.T();
            if (zI || objT3 == m4cVar) {
                objT3 = new puh(hdkVar, drr0Var, (byte) 28);
                x340Var2.s0(objT3);
            }
            qim0 qim0VarS = exd0.s(qim0VarI, (iu30) objT3);
            boolean z8 = (i3 & 112) == 32;
            Object objT4 = x340Var2.T();
            if (z8 || objT4 == m4cVar) {
                objT4 = new erj(iu30Var, (byte) 28);
                x340Var2.s0(objT4);
            }
            qim0 qim0VarX = bin.x(qim0VarS, false, (String) null, (pm31) null, (idn0) null, (Function0) objT4, 15);
            gfh0 gfh0VarC = t1c.c(een.d, false);
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
            qim0 qim0VarF = u291.f(qim0Var3, 1.0f);
            j2i j2iVarR = apo.r(580567009, new jck(hdkVar, z6, z, iu30Var, f2, function0, f6), x340Var2);
            j2i j2iVarR2 = apo.r(1437217152, new ock(hdkVar, z3, f3, f4, iu30Var, fb5Var, f5, i, iu30Var2), x340Var2);
            boolean zI2 = x340Var2.i(drr0Var);
            Object objT5 = x340Var2.T();
            if (zI2 || objT5 == m4cVar) {
                objT5 = new qg6(drr0Var, (byte) 11);
                x340Var2.s0(objT5);
            }
            x340Var = x340Var2;
            wie1.a(j2iVarR, j2iVarR2, qim0VarF, (iu30) objT5, x340Var, 54);
            x340Var.r(true);
            qim0Var2 = qim0Var3;
        } else {
            x340Var = x340Var3;
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new pck(hdkVar, iu30Var, z, f2, function0, f3, f4, fb5Var, f5, i, qim0Var2, f6, p3vVar, z2, z3, iu30Var2, i2);
        }
    }

    public static final void i(boolean z, j2i j2iVar, b0k b0kVar, int i) {
        j2i j2iVar2;
        fra fraVar = een.N0;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(708286483);
        int i2 = (x340Var.h(z) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            nim0 nim0Var = nim0.a;
            if (z) {
                x340Var.i0(-611572243);
                qim0 qim0VarF = u291.f(nim0Var, 1.0f);
                uwr uwrVar = cbx.a;
                cvx cvxVar = cbx.b(x340Var).b;
                d36 d36Var = new d36(8.0f, true, new um5(false));
                cvx cvxVar2 = cbx.b(x340Var).b;
                j2iVar2 = j2iVar;
                k5p1.d(qim0VarF, d36Var, new d36(8.0f, true, new um5(false)), fraVar, 2, 0, j2iVar2, x340Var, 1597440, 32);
                x340Var.r(false);
            } else {
                j2iVar2 = j2iVar;
                x340Var.i0(-611219990);
                qim0 qim0VarF2 = u291.f(nim0Var, 1.0f);
                jw31 jw31VarA = ew31.a(h36.g, fraVar, x340Var, 0);
                int iHashCode = Long.hashCode(x340Var.T);
                xos0 xos0VarM = x340Var.m();
                qim0 qim0VarE = zr7.E(x340Var, qim0VarF2);
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
                j2iVar2.invoke(pw31.a, x340Var, 54);
                x340Var.r(true);
                x340Var.r(false);
            }
        } else {
            j2iVar2 = j2iVar;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ok6((byte) 3, i, j2iVar2, z);
        }
    }

    public static final zfv j(dhg1 dhg1Var, boolean z, int i) {
        return (z && ((vlx0) dhg1Var.e()).a == ulx0.a && ((vlx0) dhg1Var.b()).a == ulx0.b) ? irn1.o0(i, 0, f, 2) : irn1.j0();
    }

    public static final hux k(int i) {
        int iC = l1d.C(i);
        if (iC == 0) {
            return jpx.c;
        }
        if (iC == 1) {
            return ktx.c;
        }
        if (iC == 2) {
            return jkx.c;
        }
        if (iC == 3) {
            return ilx.c;
        }
        eg.o();
        return null;
    }
}
