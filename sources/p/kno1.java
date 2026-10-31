package p;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import androidx.compose.ui.graphics.ColorFilter;
import java.util.Arrays;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class kno1 {
    public static final z740 a = new z740(2, "Spotify.Feature.MixingTools", "edit");
    public static final z740 b = new z740(2, "Spotify.Feature.MusicVideos", "view");
    public static final z740 c = new z740(2, "Spotify.Feature.AudioQuality", "streamVeryHighBitrate");
    public static final z740 d = new z740(2, "Spotify.Feature.AudioQuality", "streamLosslessBitrate");
    public static b180 e;

    public static final q8i0 A(yo60 yo60Var, hwt hwtVar) {
        String str = yo60Var.b;
        boolean z = str == null || str.length() == 0;
        l8i0 l8i0Var = l8i0.a;
        m8i0 m8i0Var = m8i0.a;
        if (hwtVar == null) {
            return !z ? m8i0Var : l8i0Var;
        }
        return (z || hwtVar.a || hwtVar.c || hwtVar.e || !hwtVar.b || !hwtVar.d) ? l8i0Var : m8i0Var;
    }

    public static final q8i0 B(pjw0 pjw0Var, hwt hwtVar) {
        boolean z = pjw0Var.b instanceof mjw0;
        return (hwtVar != null ? !z || hwtVar.a || hwtVar.c || hwtVar.e || !hwtVar.b || !hwtVar.d : !z) ? l8i0.a : m8i0.a;
    }

    public static final String C(qq80 qq80Var) {
        sq80 sq80Var = qq80Var.b;
        return f4i1.f(ab80.h(sq80Var.a), ":", ab80.i(sq80Var.b));
    }

    public static int D(int i, int i2) {
        return Math.min(Math.max(i, i2), 1073741823);
    }

    public static final void a(e7s0 e7s0Var, b0k b0kVar, int i) {
        int i2;
        nux nuxVar;
        String uri;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-486772238);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(e7s0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            Uri uri2 = (e7s0Var == null || (uri = e7s0Var.getUri()) == null) ? Uri.EMPTY : Uri.parse(uri);
            boolean z = e7s0Var instanceof c7s0;
            if (z) {
                nkx nkxVar = nkx.c;
                nuxVar = new nux(nkxVar, nkxVar);
            } else {
                ltx ltxVar = ltx.c;
                nuxVar = new nux(ltxVar, ltxVar);
            }
            nux nuxVar2 = nuxVar;
            uri2.getClass();
            qim0 qim0VarQ = nim0.a;
            if (z) {
                qim0VarQ = i1p1.q(qim0VarQ, er31.a);
            }
            eso1.e(uri2, isl.a, qim0VarQ, (p3v) null, (zvx) null, (ecx) null, (j6m) null, (tl3) null, (ColorFilter) null, nuxVar2, false, false, x340Var, 1073741872, 0, 3576);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new u9o((Object) e7s0Var, i, (byte) 2);
        }
    }

    public static final void b(String str, String str2, String str3, String str4, e7s0 e7s0Var, Function0 function0, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        b0k b0kVar2;
        xu30 xu30Var;
        m4c m4cVar = fkj0.X;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(1661861293);
        if ((i & 6) == 0) {
            i2 = (b0kVar3.g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= b0kVar3.g(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= b0kVar3.g(str3) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= b0kVar3.g(str4) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= (32768 & i) == 0 ? b0kVar3.g(e7s0Var) : b0kVar3.i(e7s0Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= b0kVar3.i(function0) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= b0kVar3.i(qim0Var) ? 1048576 : 524288;
        }
        if (b0kVar3.Y(i2 & 1, (599187 & i2) != 599186)) {
            String strO0 = cwl1.o0(b0kVar3, 2131959677);
            boolean z = (458752 & i2) == 131072;
            Object objT = b0kVar3.T();
            if (z || objT == m4cVar) {
                objT = new isr0(function0, (byte) 5);
                b0kVar3.s0(objT);
            }
            Function0 function1 = (Function0) objT;
            if (ihc1.y0(strO0)) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return;
            }
            gbx gbxVar = new gbx(new y50(strO0), function1);
            qim0 qim0VarF = u291.f(qim0Var, 1.0f);
            uwr uwrVar = cbx.a;
            long jA = cbx.a(b0kVar3).a.a.a();
            cua cuaVar = cbx.b(b0kVar3).f;
            qim0 qim0VarF2 = dug.f(qim0VarF, jA, er31.b(6.0f));
            boolean zI = ((i2 & 14) == 4) | b0kVar3.i(gbxVar);
            Object objT2 = b0kVar3.T();
            if (zI || objT2 == m4cVar) {
                objT2 = new thx(str, gbxVar, (byte) 2);
                b0kVar3.s0(objT2);
            }
            qim0 qim0VarA = s161.a(qim0VarF2, (iu30) objT2);
            if (str4 == null) {
                b0kVar3.i0(423204705);
                b0kVar3.r(false);
                xu30Var = null;
            } else {
                b0kVar3.i0(423204706);
                xu30 xu30VarR = apo.r(-1560619493, new qdg0(str4, (byte) 23), b0kVar3);
                b0kVar3.r(false);
                xu30Var = xu30VarR;
            }
            b0kVar2 = b0kVar3;
            jto1.b(qim0VarA, null, jax.a, false, null, null, gbxVar, null, null, apo.r(-1926438314, new n1r0(e7s0Var, (byte) 13), b0kVar3), apo.r(-526951978, new qdg0(str2, (byte) 24), b0kVar3), xu30Var, o6j.a, null, null, apo.r(-1710041103, new xo6(str3, str4, (byte) 11), b0kVar3), b0kVar2, 805306368, 196998, 25018);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new kt3((Object) str, (Object) str2, (Object) str3, (Object) str4, (Object) e7s0Var, (Object) function0, (Object) qim0Var, i, (byte) 13);
        }
    }

    public static final void c(int i, Function0 function0, b0k b0kVar, qim0 qim0Var) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(404610332);
        int i2 = (x340Var.i(qim0Var) ? 4 : 2) | i | (x340Var.i(function0) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            ldx ldxVar = ldx.c;
            gdx gdxVarR = yla.r(x340Var);
            boolean z = (i2 & 112) == 32;
            Object objT = x340Var.T();
            if (z || objT == fkj0.X) {
                objT = new j3n(function0, (byte) 4);
                x340Var.s0(objT);
            }
            Function0 function1 = (Function0) objT;
            if (ihc1.y0("Close")) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return;
            }
            wro1.h(new gbx(new y50("Close"), function1), ldxVar, qim0Var, null, gdxVarR, null, false, null, null, sgi.a, x340Var, (i2 << 6) & 896, 6, 984);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new vd1(qim0Var, function0, i, (byte) 18);
        }
    }

    public static final void d(h7s0 h7s0Var, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        b0k b0kVar2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-1634481045);
        if ((i & 6) == 0) {
            i2 = (b0kVar3.g(h7s0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= b0kVar3.i(qim0Var) ? 32 : 16;
        }
        byte b2 = 0;
        byte b3 = 1;
        if (b0kVar3.Y(i2 & 1, (i2 & 19) != 18)) {
            qim0 qim0VarF = u291.f(qim0Var, 1.0f);
            uwr uwrVar = cbx.a;
            long jA = cbx.a(b0kVar3).a.a.a();
            cua cuaVar = cbx.b(b0kVar3).f;
            qim0 qim0VarF2 = dug.f(qim0VarF, jA, er31.b(6.0f));
            boolean z = (i2 & 14) == 4;
            Object objT = b0kVar3.T();
            if (z || objT == fkj0.X) {
                objT = new wvq0(h7s0Var, (byte) 25);
                b0kVar3.s0(objT);
            }
            b0kVar2 = b0kVar3;
            jto1.b(s161.a(qim0VarF2, (iu30) objT), null, new hax(h7s0Var.a), false, null, null, null, null, null, o6j.b, apo.r(1159217684, new b7s0(h7s0Var, b2), b0kVar3), null, null, null, null, apo.r(2146237615, new b7s0(h7s0Var, b3), b0kVar3), b0kVar2, 806879232, 196998, 27066);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new nbf0(h7s0Var, qim0Var, i, (byte) 28);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:103:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:105:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x0067  */
    /* JADX WARN: Code duplicated, block: B:39:0x006d  */
    /* JADX WARN: Code duplicated, block: B:40:0x0070  */
    /* JADX WARN: Code duplicated, block: B:44:0x0079  */
    /* JADX WARN: Code duplicated, block: B:45:0x007b  */
    /* JADX WARN: Code duplicated, block: B:48:0x0084  */
    /* JADX WARN: Code duplicated, block: B:50:0x0088  */
    /* JADX WARN: Code duplicated, block: B:53:0x0093  */
    /* JADX WARN: Code duplicated, block: B:54:0x0095  */
    /* JADX WARN: Code duplicated, block: B:56:0x0098  */
    /* JADX WARN: Code duplicated, block: B:57:0x009a  */
    /* JADX WARN: Code duplicated, block: B:59:0x009d  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:65:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:67:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:77:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:81:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:84:0x011a  */
    /* JADX WARN: Code duplicated, block: B:86:0x0123  */
    /* JADX WARN: Code duplicated, block: B:87:0x0127  */
    /* JADX WARN: Code duplicated, block: B:90:0x0173  */
    /* JADX WARN: Code duplicated, block: B:91:0x0177  */
    /* JADX WARN: Code duplicated, block: B:94:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:95:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:98:0x01e9  */
    public static final void e(hw61 hw61Var, j2i j2iVar, qim0 qim0Var, j2i j2iVar2, b0k b0kVar, int i, int i2) {
        int i3;
        qim0 qim0Var2;
        boolean z;
        qim0 qim0Var3;
        h311 h311VarV;
        qim0 qim0Var4;
        boolean z2;
        int i4;
        int i5;
        Object objT;
        Object obj;
        qim0 qim0VarC;
        boolean zH;
        Object objT2;
        gfh0 gfh0Var;
        int iHashCode;
        xos0 xos0VarM;
        qim0 qim0VarE;
        boolean z3;
        n4k n4kVar;
        boolean z4;
        Object objT3;
        int i6;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1841298720);
        j06 j06Var = x340Var.a;
        if ((i & 6) == 0) {
            i3 = (x340Var.i(hw61Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i7 = i & 48;
        isl islVar = isl.a;
        if (i7 == 0) {
            i3 |= x340Var.g(islVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= x340Var.i(j2iVar) ? 256 : 128;
        }
        int i8 = i2 & 8;
        if (i8 == 0) {
            if ((i & 3072) == 0) {
                qim0Var2 = qim0Var;
                i3 |= x340Var.i(qim0Var2) ? 2048 : 1024;
            }
            if ((i & 24576) == 0) {
                if (x340Var.i(j2iVar2)) {
                    i6 = 16384;
                } else {
                    i6 = 8192;
                }
                i3 |= i6;
            }
            if ((i3 & 9363) != 9362) {
                z = true;
            } else {
                z = false;
            }
            if (x340Var.Y(i3 & 1, z)) {
                qim0Var4 = nim0.a;
                if (i8 != 0) {
                    qim0Var2 = qim0Var4;
                }
                if (x340Var.k(t4k.n) == flb0.b) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    i4 = 2;
                } else {
                    i4 = 1;
                }
                i5 = z2 ? 3 : 4;
                x340Var.i0(-38438320);
                objT = x340Var.T();
                obj = fkj0.X;
                if (objT == obj) {
                    objT = s8x.i;
                    x340Var.s0(objT);
                }
                qim0VarC = i541.C(qim0Var2, (iu30) objT);
                if (islVar.equals(islVar)) {
                    j06Var = j06Var;
                } else {
                    if ((i3 & 112) == 32) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    objT3 = x340Var.T();
                    if (z4 || objT3 == obj) {
                        objT3 = new qrk(1, (byte) 21);
                        x340Var.s0(objT3);
                    }
                    qim0VarC = qim0VarC.then(s161.a(qim0Var4, (iu30) objT3));
                }
                x340Var.r(false);
                zH = x340Var.h(z2);
                objT2 = x340Var.T();
                if (zH || objT2 == obj) {
                    objT2 = new kcx((byte) 0, z2);
                    x340Var.s0(objT2);
                }
                gfh0Var = (gfh0) objT2;
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
                nko1.H(gfh0Var, x340Var, lljVar);
                llj lljVar2 = y580.N0;
                nko1.H(xos0VarM, x340Var, lljVar2);
                Integer numValueOf = Integer.valueOf(iHashCode);
                llj lljVar3 = y580.R0;
                nko1.H(numValueOf, x340Var, lljVar3);
                nko1.F(x340Var);
                llj lljVar4 = y580.Y;
                nko1.H(qim0VarE, x340Var, lljVar4);
                qim0 qim0VarZ = z(0.875f, pzm.b(i4), pzm.c(i4));
                gra graVar = een.d;
                gfh0 gfh0VarC = t1c.c(graVar, false);
                int iHashCode2 = Long.hashCode(x340Var.T);
                xos0 xos0VarM2 = x340Var.m();
                qim0 qim0VarE2 = zr7.E(x340Var, qim0VarZ);
                x340Var.m0();
                int i9 = i3;
                if (x340Var.S) {
                    x340Var.l(n4kVar);
                } else {
                    x340Var.v0();
                }
                nko1.H(gfh0VarC, x340Var, lljVar);
                nko1.H(xos0VarM2, x340Var, lljVar2);
                x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
                nko1.H(qim0VarE2, x340Var, lljVar4);
                j2iVar2.invoke(x340Var, Integer.valueOf((i9 >> 12) & 14));
                x340Var.r(true);
                qim0 qim0VarQ = i1p1.q(exd0.r(z(0.5f, pzm.b(i5), pzm.c(i5)), new o6m(hw61Var, (byte) 1)), hw61Var);
                gfh0 gfh0VarC2 = t1c.c(graVar, false);
                int iHashCode3 = Long.hashCode(x340Var.T);
                xos0 xos0VarM3 = x340Var.m();
                qim0 qim0VarE3 = zr7.E(x340Var, qim0VarQ);
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
                k4s0.i((i9 >> 6) & 14, j2iVar, x340Var, true, true);
            } else {
                x340Var.b0();
            }
            qim0Var3 = qim0Var2;
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new nj2((Object) hw61Var, (Object) j2iVar, qim0Var3, (Object) j2iVar2, i, i2, (byte) 10);
            }
        }
        i3 |= 3072;
        qim0Var2 = qim0Var;
        if ((i & 24576) == 0) {
            if (x340Var.i(j2iVar2)) {
                i6 = 16384;
            } else {
                i6 = 8192;
            }
            i3 |= i6;
        }
        if ((i3 & 9363) != 9362) {
            z = true;
        } else {
            z = false;
        }
        if (x340Var.Y(i3 & 1, z)) {
            qim0Var4 = nim0.a;
            if (i8 != 0) {
                qim0Var2 = qim0Var4;
            }
            if (x340Var.k(t4k.n) == flb0.b) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                i4 = 2;
            } else {
                i4 = 1;
            }
            if (z2) {
            }
            x340Var.i0(-38438320);
            objT = x340Var.T();
            obj = fkj0.X;
            if (objT == obj) {
                objT = s8x.i;
                x340Var.s0(objT);
            }
            qim0VarC = i541.C(qim0Var2, (iu30) objT);
            if (islVar.equals(islVar)) {
                if ((i3 & 112) == 32) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                objT3 = x340Var.T();
                if (z4) {
                    objT3 = new qrk(1, (byte) 21);
                    x340Var.s0(objT3);
                } else {
                    objT3 = new qrk(1, (byte) 21);
                    x340Var.s0(objT3);
                }
                qim0VarC = qim0VarC.then(s161.a(qim0Var4, (iu30) objT3));
            } else {
                j06Var = j06Var;
            }
            x340Var.r(false);
            zH = x340Var.h(z2);
            objT2 = x340Var.T();
            if (zH) {
                objT2 = new kcx((byte) 0, z2);
                x340Var.s0(objT2);
            } else {
                objT2 = new kcx((byte) 0, z2);
                x340Var.s0(objT2);
            }
            gfh0Var = (gfh0) objT2;
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
            llj lljVar5 = y580.O0;
            nko1.H(gfh0Var, x340Var, lljVar5);
            llj lljVar6 = y580.N0;
            nko1.H(xos0VarM, x340Var, lljVar6);
            Integer numValueOf2 = Integer.valueOf(iHashCode);
            llj lljVar7 = y580.R0;
            nko1.H(numValueOf2, x340Var, lljVar7);
            nko1.F(x340Var);
            llj lljVar8 = y580.Y;
            nko1.H(qim0VarE, x340Var, lljVar8);
            qim0 qim0VarZ2 = z(0.875f, pzm.b(i4), pzm.c(i4));
            gra graVar2 = een.d;
            gfh0 gfh0VarC3 = t1c.c(graVar2, false);
            int iHashCode4 = Long.hashCode(x340Var.T);
            xos0 xos0VarM4 = x340Var.m();
            qim0 qim0VarE4 = zr7.E(x340Var, qim0VarZ2);
            x340Var.m0();
            int i10 = i3;
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(gfh0VarC3, x340Var, lljVar5);
            nko1.H(xos0VarM4, x340Var, lljVar6);
            x0d.q(iHashCode4, x340Var, lljVar7, x340Var);
            nko1.H(qim0VarE4, x340Var, lljVar8);
            j2iVar2.invoke(x340Var, Integer.valueOf((i10 >> 12) & 14));
            x340Var.r(true);
            qim0 qim0VarQ2 = i1p1.q(exd0.r(z(0.5f, pzm.b(i5), pzm.c(i5)), new o6m(hw61Var, (byte) 1)), hw61Var);
            gfh0 gfh0VarC4 = t1c.c(graVar2, false);
            int iHashCode5 = Long.hashCode(x340Var.T);
            xos0 xos0VarM5 = x340Var.m();
            qim0 qim0VarE5 = zr7.E(x340Var, qim0VarQ2);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(gfh0VarC4, x340Var, lljVar5);
            nko1.H(xos0VarM5, x340Var, lljVar6);
            x0d.q(iHashCode5, x340Var, lljVar7, x340Var);
            nko1.H(qim0VarE5, x340Var, lljVar8);
            k4s0.i((i10 >> 6) & 14, j2iVar, x340Var, true, true);
        } else {
            x340Var.b0();
        }
        qim0Var3 = qim0Var2;
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new nj2((Object) hw61Var, (Object) j2iVar, qim0Var3, (Object) j2iVar2, i, i2, (byte) 10);
        }
    }

    public static final void f(ga60 ga60Var, qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1316363838);
        int i2 = (x340Var.g(ga60Var) ? 4 : 2) | i | (x340Var.i(qim0Var) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            mbh mbhVarA = jbh.a(h36.c, een.Q0, x340Var, 0);
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
            d761 d761Var = ga60Var.c;
            d761 d761Var2 = ga60Var.d;
            qim0 qim0Var3 = nim0.a;
            if (d761Var == null) {
                x340Var.i0(1712570904);
                x340Var.r(false);
                qim0Var2 = qim0Var3;
            } else {
                x340Var.i0(1712570905);
                qim0Var2 = qim0Var3;
                qgo1.f(d761Var.g(new cjc0(d761Var2 != null ? 1 : 2), x340Var, 0), u291.f(qim0Var3, 1.0f), new a0e1(3), 0, false, null, x340Var, 8, 56);
                x340Var.r(false);
            }
            if (d761Var2 == null) {
                x340Var.i0(1712812890);
                x340Var.r(false);
            } else {
                x340Var.i0(1712812891);
                qgo1.f(d761Var2.g(new cjc0(1), x340Var, 0), u291.f(qim0Var2, 1.0f), new a0e1(3), 0, false, null, x340Var, 8, 56);
                x340Var.r(false);
            }
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new jj50(ga60Var, qim0Var, i, (byte) 9);
        }
    }

    public static final void g(ga60 ga60Var, List list, long j, long j2, fb60 fb60Var, b0k b0kVar, int i) {
        qim0 qim0VarP;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(143055140);
        j06 j06Var = x340Var.a;
        int i2 = i | (x340Var.g(ga60Var) ? 4 : 2) | (x340Var.g(list) ? 32 : 16) | (x340Var.f(j) ? 256 : 128) | (x340Var.f(j2) ? 2048 : 1024) | (x340Var.g(fb60Var) ? 16384 : 8192);
        if (x340Var.Y(i2 & 1, (i2 & 9363) != 9362)) {
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            boolean z = (ga60Var.c == null && ga60Var.d == null) ? false : true;
            qim0 qim0Var = nim0.a;
            qim0 qim0VarD = u291.d(qim0Var, 1.0f);
            float f = cvxVar.a;
            float f2 = cvxVar.b;
            qim0 qim0VarB = uyn1.B(qim0VarD, 0.0f, f, 0.0f, 16.0f, 5);
            era eraVar = een.Q0;
            mbh mbhVarA = jbh.a(h36.g, eraVar, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarB);
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
            nko1.H(mbhVarA, x340Var, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var, lljVar3);
            nko1.F(x340Var);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var, lljVar4);
            qim0 qim0VarThen = u291.f(qim0Var, 1.0f).then(ulo1.p(x340Var, 1));
            mbh mbhVarA2 = jbh.a(h36.c, eraVar, x340Var, 0);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0VarThen);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(mbhVarA2, x340Var, lljVar);
            nko1.H(xos0VarM2, x340Var, lljVar2);
            x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE2, x340Var, lljVar4);
            da60 da60Var = ga60Var.e;
            qim0 qim0VarZ = uyn1.z(f2, 0.0f, 2, u291.f(qim0Var, 1.0f));
            if (z) {
                x340Var.i0(-207909484);
                qim0VarP = ulo1.p(x340Var, 1);
                x340Var.r(false);
            } else {
                x340Var.i0(-207908168);
                x340Var.r(false);
                qim0VarP = qim0Var;
            }
            zko1.f(da60Var, qim0VarZ.then(qim0VarP), list, j2, x340Var, ((i2 << 3) & 896) | (i2 & 7168), 0);
            op71.g(x340Var, u291.h(qim0Var, 16.0f));
            int i3 = i2 & 14;
            boolean z3 = z;
            h(ga60Var, z3, j, fb60Var, null, x340Var, (i2 & 910) | ((i2 >> 3) & 7168));
            if (z3) {
                v8i0.i(f2, 2145120030, x340Var, x340Var, qim0Var);
                f(ga60Var, uyn1.z(16.0f, 0.0f, 2, u291.f(qim0Var, 1.0f)), x340Var, i3);
                x340Var.r(false);
            } else {
                x340Var.i0(2145323762);
                x340Var.r(false);
            }
            x340Var.r(true);
            op71.g(x340Var, qim0Var);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new fp30(ga60Var, list, j, j2, fb60Var, i);
        }
    }

    public static final void h(ga60 ga60Var, boolean z, long j, fb60 fb60Var, qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var;
        qim0 qim0Var2;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(-1179796403);
        int i2 = (x340Var2.g(ga60Var) ? 4 : 2) | i | (x340Var2.h(z) ? 32 : 16) | (x340Var2.f(j) ? 256 : 128);
        if ((i & 3072) == 0) {
            i2 |= x340Var2.g(fb60Var) ? 2048 : 1024;
        }
        int i3 = i2 | 24576;
        if (x340Var2.Y(i3 & 1, (i3 & 9363) != 9362)) {
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var2).b;
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarZ = uyn1.z(16.0f, 0.0f, 2, u291.f(qim0Var3, 1.0f));
            mbh mbhVarA = jbh.a(h36.c, een.Q0, x340Var2, 0);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0VarZ);
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
            x340Var = x340Var2;
            hb60.a(ga60Var.a, j, fb60Var, u291.f(qim0Var3, 1.0f), (ajc0) null, 3, x340Var, (i3 >> 3) & 1008, 16);
            d761 d761Var = ga60Var.b;
            if (d761Var == null) {
                x340Var.i0(-1359761985);
                x340Var.r(false);
            } else {
                x340Var.i0(-1359761984);
                qgo1.f(d761Var.g(z ? new cjc0(2) : bjc0.a, x340Var, 0), u291.f(qim0Var3, 1.0f).then(z ? qim0Var3 : u291.y(qim0Var3, een.Z, true)), new a0e1(3), 0, false, null, x340Var, 8, 56);
                x340Var = x340Var;
                x340Var.r(false);
            }
            x340Var.r(true);
            qim0Var2 = qim0Var3;
        } else {
            x340Var = x340Var2;
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new mc60(ga60Var, z, j, fb60Var, qim0Var2, i);
        }
    }

    public static final void i(ta60 ta60Var, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        ta60 ta60Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1680177156);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? x340Var.g(ta60Var) : x340Var.i(ta60Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        byte b2 = 0;
        if (x340Var.Y(i3 & 1, (i3 & 19) != 18)) {
            ta60Var2 = ta60Var;
            ulo1.b(ta60Var2, "InsightHeroCard", null, apo.r(-55283711, new nc60(ta60Var, b2), x340Var), x340Var, (i3 & 14) | 24624 | ((i3 << 3) & 896), 8);
            qim0Var = nim0.a;
        } else {
            ta60Var2 = ta60Var;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new oc60(ta60Var2, qim0Var, i, (byte) 0);
        }
    }

    public static l5s j() {
        l5s l5sVar = new l5s();
        l5sVar.a = -1;
        l5sVar.d = -1;
        return l5sVar;
    }

    public static final void k(int i, b0k b0kVar, qim0 qim0Var, boolean z, boolean z2) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1685845727);
        int i2 = i | 6;
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            qim0Var2 = nim0.a;
            qim0 qim0VarF = u291.f(qim0Var2, 1.0f);
            pi30 pi30VarO = bbp1.o(x340Var);
            Bundle bundleE = vhc.e(48, true, z, z2, false, false);
            w8c0 w8c0Var = (w8c0) hso1.v(((iac0) x340Var.k(jfe0.a)).getLifecycle(), x340Var).getValue();
            Object objT = x340Var.T();
            if (objT == fkj0.X) {
                objT = zqb0.i;
                x340Var.s0(objT);
            }
            m5n1.a(u0p0.class, qim0VarF, pi30VarO, bundleE, w8c0Var, (iu30) objT, x340Var, 0, 0);
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ovf(qim0Var2, z, z2, i);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void l(j7s0 j7s0Var, Function0 function0, qim0 qim0Var, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-582764241);
        int i2 = i | (x340Var.g(j7s0Var) ? 4 : 2) | (x340Var.i(function0) ? 32 : 16) | (x340Var.i(qim0Var) ? 256 : 128);
        if (!x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            x340Var.b0();
        } else if (j7s0Var instanceof g7s0) {
            x340Var.i0(-1690680537);
            g7s0 g7s0Var = (g7s0) j7s0Var;
            b(g7s0Var.a, g7s0Var.b, g7s0Var.c, g7s0Var.d, g7s0Var.e, function0, qim0Var, x340Var, 4128768 & (i2 << 12));
            x340Var.r(false);
        } else if (j7s0Var instanceof i7s0) {
            x340Var.i0(-1690672761);
            i7s0 i7s0Var = (i7s0) j7s0Var;
            b(i7s0Var.a, i7s0Var.b, i7s0Var.c, i7s0Var.d, i7s0Var.e, function0, qim0Var, x340Var, 4128768 & (i2 << 12));
            x340Var.r(false);
        } else {
            if (!(j7s0Var instanceof h7s0)) {
                throw p3d1.k(x340Var, -1690682539, false);
            }
            x340Var.i0(-1690665369);
            d((h7s0) j7s0Var, qim0Var, x340Var, ((i2 >> 3) & 112) | (i2 & 14));
            x340Var.r(false);
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new vbn0(j7s0Var, function0, qim0Var, i, (byte) 29);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void m(vnr0 vnr0Var, List list, vu30 vu30Var, qim0 qim0Var, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        qim0 qim0Var2;
        Long lValueOf;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-254618621);
        int i2 = 256;
        int i3 = i | (x340Var.i(vnr0Var) ? 4 : 2) | (x340Var.g(list) ? 32 : 16) | (x340Var.i(vu30Var) ? 256 : 128) | 3072;
        if (x340Var.Y(i3 & 1, (i3 & 1171) != 1170)) {
            Object objT = x340Var.T();
            if (objT == m4cVar) {
                objT = bb00.h(0, x340Var);
            }
            err0 err0Var = (hdn0) objT;
            wat watVar = (wat) x340Var.k(t4k.h);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            mbh mbhVarA = jbh.a(new d36(8.0f, true, new um5(false)), een.P0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarE = zr7.E(x340Var, qim0Var3);
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
            qgo1.f(vnr0Var, null, null, 0, false, null, x340Var, (i3 & 14) | 8, 62);
            x340Var.i0(155129114);
            int i4 = 0;
            for (Object obj : list) {
                int i5 = i4 + 1;
                if (i4 < 0) {
                    p7h.T();
                    throw null;
                }
                i7s0 i7s0Var = (j7s0) obj;
                if (i7s0Var instanceof g7s0) {
                    lValueOf = Long.valueOf(((g7s0) i7s0Var).f);
                } else if (i7s0Var instanceof i7s0) {
                    lValueOf = Long.valueOf(i7s0Var.f);
                } else {
                    if (!(i7s0Var instanceof h7s0)) {
                        eg.o();
                        return;
                    }
                    lValueOf = null;
                }
                boolean zG = x340Var.g(lValueOf) | ((i3 & 896) == i2) | x340Var.e(i4);
                Object objT2 = x340Var.T();
                if (zG || objT2 == m4cVar) {
                    objT2 = new wv1((Object) lValueOf, (Object) vu30Var, i4, (byte) 19);
                    x340Var.s0(objT2);
                }
                l(i7s0Var, (Function0) objT2, u291.b(0.0f, watVar.M0(err0Var.s()), 1, lrn1.u(qim0Var3, new myg0(err0Var, (byte) 14))), x340Var, 0);
                i4 = i5;
                i2 = 256;
            }
            x340Var.r(false);
            x340Var.r(true);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new b2o0(i, vnr0Var, list, vu30Var, qim0Var2, (byte) 13);
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0173  */
    /* JADX WARN: Code duplicated, block: B:103:0x0184  */
    /* JADX WARN: Code duplicated, block: B:106:0x018f  */
    /* JADX WARN: Code duplicated, block: B:108:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x0065  */
    /* JADX WARN: Code duplicated, block: B:39:0x006b  */
    /* JADX WARN: Code duplicated, block: B:40:0x006e  */
    /* JADX WARN: Code duplicated, block: B:44:0x0077  */
    /* JADX WARN: Code duplicated, block: B:46:0x007b  */
    /* JADX WARN: Code duplicated, block: B:48:0x007e  */
    /* JADX WARN: Code duplicated, block: B:50:0x0086  */
    /* JADX WARN: Code duplicated, block: B:51:0x0089  */
    /* JADX WARN: Code duplicated, block: B:55:0x0098  */
    /* JADX WARN: Code duplicated, block: B:56:0x009b  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:67:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:69:0x00be  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:74:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:76:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:79:0x00df A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:81:0x00e4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:82:0x00e6 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:84:0x00eb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:85:0x00ed A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:87:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:89:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:90:0x010e  */
    /* JADX WARN: Code duplicated, block: B:93:0x0126  */
    /* JADX WARN: Code duplicated, block: B:94:0x013c  */
    /* JADX WARN: Code duplicated, block: B:96:0x0144  */
    /* JADX WARN: Code duplicated, block: B:99:0x016f  */
    public static final void n(boolean z, Function0 function0, qim0 qim0Var, boolean z2, soz0 soz0Var, idn0 idn0Var, b0k b0kVar, int i, int i2) {
        int i3;
        boolean z3;
        int i4;
        idn0 idn0Var2;
        int i5;
        boolean z4;
        boolean z5;
        idn0 idn0Var3;
        h311 h311VarV;
        idn0 idn0Var4;
        float f;
        tob1 tob1VarA;
        long j;
        tob1 tob1VarS;
        qim0 qim0Var2;
        qim0 qim0Var3;
        qim0 qim0VarP;
        boolean zG;
        Object objT;
        int i6;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(408580840);
        if ((i & 6) == 0) {
            i3 = (x340Var.h(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= x340Var.i(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= x340Var.g(qim0Var) ? 256 : 128;
        }
        int i7 = i2 & 8;
        if (i7 == 0) {
            if ((i & 3072) == 0) {
                z3 = z2;
                i3 |= x340Var.h(z3) ? 2048 : 1024;
            }
            if ((i & 24576) == 0) {
                if (x340Var.g(soz0Var)) {
                    i6 = 16384;
                } else {
                    i6 = 8192;
                }
                i3 |= i6;
            }
            i4 = i2 & 32;
            if (i4 != 0) {
                if ((196608 & i) == 0) {
                    idn0Var2 = idn0Var;
                    if (x340Var.g(idn0Var2)) {
                        i5 = 131072;
                    } else {
                        i5 = 65536;
                    }
                    i3 |= i5;
                }
                if ((74899 & i3) != 74898) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (x340Var.Y(i3 & 1, z4)) {
                    x340Var.d0();
                    if ((i & 1) != 0 || x340Var.E()) {
                        boolean z6 = i7 == 0 ? z3 : true;
                        if (i4 != 0) {
                            idn0Var4 = null;
                        } else {
                            idn0Var4 = idn0Var2;
                        }
                        z3 = z6;
                    } else {
                        x340Var.b0();
                        idn0Var4 = idn0Var2;
                    }
                    x340Var.s();
                    if (z) {
                        f = 6.0f;
                    } else {
                        f = 0.0f;
                    }
                    tob1VarA = z95.a(f, t890.w(x340Var, 2), (String) null, x340Var, 0, 12);
                    if (!z3 && z) {
                        j = soz0Var.a;
                    } else if (!z3 && !z) {
                        j = soz0Var.b;
                    } else if (z3 && z) {
                        j = soz0Var.c;
                    } else {
                        j = soz0Var.d;
                    }
                    if (z3) {
                        x340Var.i0(1194696477);
                        tob1VarS = w191.a(j, t890.w(x340Var, 4), null, x340Var, 0, 12);
                        x340Var = x340Var;
                        x340Var.r(false);
                    } else {
                        x340Var.i0(1194874138);
                        tob1VarS = v8r.s(new u7h(j), x340Var);
                        x340Var.r(false);
                    }
                    qim0Var2 = nim0.a;
                    if (function0 != null) {
                        qim0Var3 = qim0Var2;
                        z5 = z3;
                        qim0VarP = dgo1.p(qim0Var3, z, idn0Var4, ai31.a(20.0f, 4, false), z5, new pm31(3), function0);
                    } else {
                        qim0Var3 = qim0Var2;
                        z5 = z3;
                        qim0VarP = qim0Var3;
                    }
                    if (function0 != null) {
                        vq60 vq60Var = jw80.a;
                        qim0Var3 = tsj0.a;
                    }
                    qim0 qim0VarM = u291.m(uyn1.x(u291.B(qim0Var.then(qim0Var3).then(qim0VarP), een.h, 2), 2.0f), 20.0f);
                    zG = x340Var.g(tob1VarS) | x340Var.g(tob1VarA);
                    objT = x340Var.T();
                    if (zG || objT == fkj0.X) {
                        objT = new gub0(tob1VarS, tob1VarA, (byte) 14);
                        x340Var.s0(objT);
                    }
                    j0o1.b(0, x340Var, (iu30) objT, qim0VarM);
                    idn0Var3 = idn0Var4;
                } else {
                    x340Var.b0();
                    z5 = z3;
                    idn0Var3 = idn0Var2;
                }
                h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new toz0(z, function0, qim0Var, z5, soz0Var, idn0Var3, i, i2, (byte) 0);
                }
            }
            i3 |= 196608;
            idn0Var2 = idn0Var;
            if ((74899 & i3) != 74898) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (x340Var.Y(i3 & 1, z4)) {
                x340Var.d0();
                if ((i & 1) != 0) {
                    if (i7 == 0) {
                    }
                    if (i4 != 0) {
                        idn0Var4 = null;
                    } else {
                        idn0Var4 = idn0Var2;
                    }
                    z3 = z6;
                } else {
                    if (i7 == 0) {
                    }
                    if (i4 != 0) {
                        idn0Var4 = null;
                    } else {
                        idn0Var4 = idn0Var2;
                    }
                    z3 = z6;
                }
                x340Var.s();
                if (z) {
                    f = 6.0f;
                } else {
                    f = 0.0f;
                }
                tob1VarA = z95.a(f, t890.w(x340Var, 2), (String) null, x340Var, 0, 12);
                if (!z3) {
                    if (!z3) {
                        if (z3) {
                            j = soz0Var.d;
                        } else {
                            j = soz0Var.d;
                        }
                    } else if (z3) {
                        j = soz0Var.d;
                    } else {
                        j = soz0Var.d;
                    }
                } else if (!z3) {
                    if (z3) {
                        j = soz0Var.d;
                    } else {
                        j = soz0Var.d;
                    }
                } else if (z3) {
                    j = soz0Var.d;
                } else {
                    j = soz0Var.d;
                }
                if (z3) {
                    x340Var.i0(1194696477);
                    tob1VarS = w191.a(j, t890.w(x340Var, 4), null, x340Var, 0, 12);
                    x340Var = x340Var;
                    x340Var.r(false);
                } else {
                    x340Var.i0(1194874138);
                    tob1VarS = v8r.s(new u7h(j), x340Var);
                    x340Var.r(false);
                }
                qim0Var2 = nim0.a;
                if (function0 != null) {
                    qim0Var3 = qim0Var2;
                    z5 = z3;
                    qim0VarP = dgo1.p(qim0Var3, z, idn0Var4, ai31.a(20.0f, 4, false), z5, new pm31(3), function0);
                } else {
                    qim0Var3 = qim0Var2;
                    z5 = z3;
                    qim0VarP = qim0Var3;
                }
                if (function0 != null) {
                    vq60 vq60Var2 = jw80.a;
                    qim0Var3 = tsj0.a;
                }
                qim0 qim0VarM2 = u291.m(uyn1.x(u291.B(qim0Var.then(qim0Var3).then(qim0VarP), een.h, 2), 2.0f), 20.0f);
                zG = x340Var.g(tob1VarS) | x340Var.g(tob1VarA);
                objT = x340Var.T();
                if (zG) {
                    objT = new gub0(tob1VarS, tob1VarA, (byte) 14);
                    x340Var.s0(objT);
                } else {
                    objT = new gub0(tob1VarS, tob1VarA, (byte) 14);
                    x340Var.s0(objT);
                }
                j0o1.b(0, x340Var, (iu30) objT, qim0VarM2);
                idn0Var3 = idn0Var4;
            } else {
                x340Var.b0();
                z5 = z3;
                idn0Var3 = idn0Var2;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new toz0(z, function0, qim0Var, z5, soz0Var, idn0Var3, i, i2, (byte) 0);
            }
        }
        i3 |= 3072;
        z3 = z2;
        if ((i & 24576) == 0) {
            if (x340Var.g(soz0Var)) {
                i6 = 16384;
            } else {
                i6 = 8192;
            }
            i3 |= i6;
        }
        i4 = i2 & 32;
        if (i4 != 0) {
            if ((196608 & i) == 0) {
                idn0Var2 = idn0Var;
                if (x340Var.g(idn0Var2)) {
                    i5 = 131072;
                } else {
                    i5 = 65536;
                }
                i3 |= i5;
            }
            if ((74899 & i3) != 74898) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (x340Var.Y(i3 & 1, z4)) {
                x340Var.d0();
                if ((i & 1) != 0) {
                    if (i7 == 0) {
                    }
                    if (i4 != 0) {
                        idn0Var4 = null;
                    } else {
                        idn0Var4 = idn0Var2;
                    }
                    z3 = z6;
                } else {
                    if (i7 == 0) {
                    }
                    if (i4 != 0) {
                        idn0Var4 = null;
                    } else {
                        idn0Var4 = idn0Var2;
                    }
                    z3 = z6;
                }
                x340Var.s();
                if (z) {
                    f = 6.0f;
                } else {
                    f = 0.0f;
                }
                tob1VarA = z95.a(f, t890.w(x340Var, 2), (String) null, x340Var, 0, 12);
                if (!z3) {
                    if (!z3) {
                        if (z3) {
                            j = soz0Var.d;
                        } else {
                            j = soz0Var.d;
                        }
                    } else if (z3) {
                        j = soz0Var.d;
                    } else {
                        j = soz0Var.d;
                    }
                } else if (!z3) {
                    if (z3) {
                        j = soz0Var.d;
                    } else {
                        j = soz0Var.d;
                    }
                } else if (z3) {
                    j = soz0Var.d;
                } else {
                    j = soz0Var.d;
                }
                if (z3) {
                    x340Var.i0(1194696477);
                    tob1VarS = w191.a(j, t890.w(x340Var, 4), null, x340Var, 0, 12);
                    x340Var = x340Var;
                    x340Var.r(false);
                } else {
                    x340Var.i0(1194874138);
                    tob1VarS = v8r.s(new u7h(j), x340Var);
                    x340Var.r(false);
                }
                qim0Var2 = nim0.a;
                if (function0 != null) {
                    qim0Var3 = qim0Var2;
                    z5 = z3;
                    qim0VarP = dgo1.p(qim0Var3, z, idn0Var4, ai31.a(20.0f, 4, false), z5, new pm31(3), function0);
                } else {
                    qim0Var3 = qim0Var2;
                    z5 = z3;
                    qim0VarP = qim0Var3;
                }
                if (function0 != null) {
                    vq60 vq60Var3 = jw80.a;
                    qim0Var3 = tsj0.a;
                }
                qim0 qim0VarM3 = u291.m(uyn1.x(u291.B(qim0Var.then(qim0Var3).then(qim0VarP), een.h, 2), 2.0f), 20.0f);
                zG = x340Var.g(tob1VarS) | x340Var.g(tob1VarA);
                objT = x340Var.T();
                if (zG) {
                    objT = new gub0(tob1VarS, tob1VarA, (byte) 14);
                    x340Var.s0(objT);
                } else {
                    objT = new gub0(tob1VarS, tob1VarA, (byte) 14);
                    x340Var.s0(objT);
                }
                j0o1.b(0, x340Var, (iu30) objT, qim0VarM3);
                idn0Var3 = idn0Var4;
            } else {
                x340Var.b0();
                z5 = z3;
                idn0Var3 = idn0Var2;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new toz0(z, function0, qim0Var, z5, soz0Var, idn0Var3, i, i2, (byte) 0);
            }
        }
        i3 |= 196608;
        idn0Var2 = idn0Var;
        if ((74899 & i3) != 74898) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (x340Var.Y(i3 & 1, z4)) {
            x340Var.d0();
            if ((i & 1) != 0) {
                if (i7 == 0) {
                }
                if (i4 != 0) {
                    idn0Var4 = null;
                } else {
                    idn0Var4 = idn0Var2;
                }
                z3 = z6;
            } else {
                if (i7 == 0) {
                }
                if (i4 != 0) {
                    idn0Var4 = null;
                } else {
                    idn0Var4 = idn0Var2;
                }
                z3 = z6;
            }
            x340Var.s();
            if (z) {
                f = 6.0f;
            } else {
                f = 0.0f;
            }
            tob1VarA = z95.a(f, t890.w(x340Var, 2), (String) null, x340Var, 0, 12);
            if (!z3) {
                if (!z3) {
                    if (z3) {
                        j = soz0Var.d;
                    } else {
                        j = soz0Var.d;
                    }
                } else if (z3) {
                    j = soz0Var.d;
                } else {
                    j = soz0Var.d;
                }
            } else if (!z3) {
                if (z3) {
                    j = soz0Var.d;
                } else {
                    j = soz0Var.d;
                }
            } else if (z3) {
                j = soz0Var.d;
            } else {
                j = soz0Var.d;
            }
            if (z3) {
                x340Var.i0(1194696477);
                tob1VarS = w191.a(j, t890.w(x340Var, 4), null, x340Var, 0, 12);
                x340Var = x340Var;
                x340Var.r(false);
            } else {
                x340Var.i0(1194874138);
                tob1VarS = v8r.s(new u7h(j), x340Var);
                x340Var.r(false);
            }
            qim0Var2 = nim0.a;
            if (function0 != null) {
                qim0Var3 = qim0Var2;
                z5 = z3;
                qim0VarP = dgo1.p(qim0Var3, z, idn0Var4, ai31.a(20.0f, 4, false), z5, new pm31(3), function0);
            } else {
                qim0Var3 = qim0Var2;
                z5 = z3;
                qim0VarP = qim0Var3;
            }
            if (function0 != null) {
                vq60 vq60Var4 = jw80.a;
                qim0Var3 = tsj0.a;
            }
            qim0 qim0VarM4 = u291.m(uyn1.x(u291.B(qim0Var.then(qim0Var3).then(qim0VarP), een.h, 2), 2.0f), 20.0f);
            zG = x340Var.g(tob1VarS) | x340Var.g(tob1VarA);
            objT = x340Var.T();
            if (zG) {
                objT = new gub0(tob1VarS, tob1VarA, (byte) 14);
                x340Var.s0(objT);
            } else {
                objT = new gub0(tob1VarS, tob1VarA, (byte) 14);
                x340Var.s0(objT);
            }
            j0o1.b(0, x340Var, (iu30) objT, qim0VarM4);
            idn0Var3 = idn0Var4;
        } else {
            x340Var.b0();
            z5 = z3;
            idn0Var3 = idn0Var2;
        }
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new toz0(z, function0, qim0Var, z5, soz0Var, idn0Var3, i, i2, (byte) 0);
        }
    }

    public static final void o(ns31 ns31Var) {
        xs31.d(ns31Var, jd0.h, new xv00(rc11.a.b(dxc0.class)), rje.e1, mle.b);
    }

    public static final boolean p(int i, int i2) {
        return i == i2;
    }

    public static Uri q(Context context, int i) {
        Resources resources = context.getResources();
        String packageName = context.getPackageName();
        String resourceTypeName = resources.getResourceTypeName(i);
        String resourceEntryName = resources.getResourceEntryName(i);
        StringBuilder sbN = gvg.n("android.resource://", packageName, "/", resourceTypeName, "/");
        sbN.append(resourceEntryName);
        return Uri.parse(sbN.toString());
    }

    public static final String r() {
        return String.format("m.%s", Arrays.copyOf(new Object[]{wf10.s}, 1));
    }

    public static final String s() {
        return String.format("https://graph.%s", Arrays.copyOf(new Object[]{wf10.s}, 1));
    }

    public static final String t() {
        return String.format("https://graph.%s", Arrays.copyOf(new Object[]{wf10.e()}, 1));
    }

    public static final String u(String str) {
        return String.format("https://graph.%s", Arrays.copyOf(new Object[]{str}, 1));
    }

    public static final String v() {
        return String.format("https://graph-video.%s", Arrays.copyOf(new Object[]{wf10.e()}, 1));
    }

    public static final String w() {
        return String.format("m.%s", Arrays.copyOf(new Object[]{wf10.r}, 1));
    }

    public static int x(int i) {
        return Integer.hashCode(i);
    }

    public static u17 y(String str) {
        if (str.length() <= 0) {
            str = null;
        }
        return str != null ? new u17(new vz6(str)) : u17.b;
    }

    public static final qim0 z(float f, float f2, float f3) {
        return i541.D(nim0.a, f, f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, sgc1.u(f2, f3), null, false, 0L, 0L, 0, null, 1047548);
    }
}
