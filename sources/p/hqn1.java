package p;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class hqn1 {
    public static final float[] a = {0.0f, 1.0f};
    public static int b;
    public static b180 c;

    public static final void a(int i, Function0 function0, b0k b0kVar, qim0 qim0Var) {
        qim0 qim0Var2;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-370744086);
        int i2 = (x340Var.i(function0) ? 4 : 2) | i | 48;
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            String strO0 = cwl1.o0(x340Var, 2131958404);
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarR = d7e.r(1.0f, u291.f(qim0Var3, 1.0f), false);
            boolean zG = x340Var.g(strO0);
            Object objT = x340Var.T();
            if (zG || objT == m4cVar) {
                objT = new xfa(strO0, (byte) 1);
                x340Var.s0(objT);
            }
            qim0 qim0VarB = s161.b(qim0VarR, false, (iu30) objT);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            cr31 cr31VarD = er31.d(8.0f, 0.0f, 0.0f, 0.0f, 14);
            mgx mgxVar = mgx.e;
            gra graVar = een.h;
            boolean z = false;
            zzq0 zzq0Var = new zzq0(0.0f, 0.0f, 0.0f, 0.0f);
            if ((i2 & 14) == 4) {
                z = true;
            }
            Object objT2 = x340Var.T();
            if (z || objT2 == m4cVar) {
                objT2 = new pj8(function0, (byte) 17);
                x340Var.s0(objT2);
            }
            qim0Var2 = qim0Var3;
            cwl1.b(qim0VarB, graVar, cr31VarD, mgxVar, zzq0Var, (max) null, true, (idn0) null, (ga80) null, new gbx(z50.c, (Function0) objT2), (gbx) null, mai.a, x340Var, 1600560, 48, 1440);
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new vd1(function0, qim0Var2, i, (byte) 10);
        }
    }

    public static final void b(jg50 jg50Var, iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var;
        boolean z = jg50Var.c;
        m4c m4cVar = fkj0.X;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(-8467630);
        if ((i & 6) == 0) {
            i2 = (x340Var2.g(jg50Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var2.i(iu30Var) ? 32 : 16;
        }
        if (x340Var2.Y(i2 & 1, (i2 & 19) != 18)) {
            boolean z2 = (i2 & 14) == 4;
            Object objT = x340Var2.T();
            if (z2 || objT == m4cVar) {
                objT = z ? jg50Var.a : jg50Var.b;
                x340Var2.s0(objT);
            }
            String str = (String) objT;
            String strK = z ? x0d.k(x340Var2, 1144160886, 2131956469, x340Var2, false) : x0d.k(x340Var2, 1144224405, 2131956468, x340Var2, false);
            fra fraVar = een.N0;
            nim0 nim0Var = nim0.a;
            qim0 qim0VarZ = u291.z(u291.f(uyn1.B(nim0Var, 0.0f, 4.0f, 0.0f, 12.0f, 5), 1.0f), (fra) null, 3);
            jw31 jw31VarA = ew31.a(h36.e, fraVar, x340Var2, 54);
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
            nko1.H(jw31VarA, x340Var2, y580.O0);
            nko1.H(xos0VarM, x340Var2, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
            nko1.F(x340Var2);
            nko1.H(qim0VarE, x340Var2, y580.Y);
            int i3 = i2;
            jdx jdxVar = jdx.c;
            boolean z3 = (i3 & 112) == 32;
            Object objT2 = x340Var2.T();
            if (z3 || objT2 == m4cVar) {
                objT2 = new g850(iu30Var, (byte) 8);
                x340Var2.s0(objT2);
            }
            Function0 function0 = (Function0) objT2;
            if (ihc1.y0(str)) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return;
            }
            gbx gbxVar = new gbx(new y50(str), function0);
            gdx gdxVarR = yla.r(x340Var2);
            boolean zG = x340Var2.g(strK);
            Object objT3 = x340Var2.T();
            if (zG || objT3 == m4cVar) {
                objT3 = new ry40(strK, (byte) 6);
                x340Var2.s0(objT3);
            }
            foo1.c(gbxVar, jdxVar, s161.b(nim0Var, false, (iu30) objT3), null, gdxVarR, null, null, null, null, null, apo.r(-841814603, new xh00(jg50Var, str, (byte) 29), x340Var2), x340Var2, 48, 48, 2008);
            x340Var = x340Var2;
            x340Var.r(true);
        } else {
            x340Var = x340Var2;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new say(jg50Var, iu30Var, i, (byte) 23);
        }
    }

    public static final void c(int i, Function0 function0, b0k b0kVar, qim0 qim0Var, boolean z) {
        b0k b0kVar2;
        qim0 qim0Var2;
        uvx uvxVarB;
        xu30 xu30Var;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-2002311170);
        int i2 = i | 6 | (b0kVar3.h(z) ? 32 : 16) | (b0kVar3.i(function0) ? 256 : 128);
        if (b0kVar3.Y(i2 & 1, (i2 & 147) != 146)) {
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarN = anm1.N("edit-plan-row", qim0Var3);
            boolean z2 = (i2 & 896) == 256;
            Object objT = b0kVar3.T();
            if (z2 || objT == fkj0.X) {
                objT = new z9t(function0, (byte) 22);
                b0kVar3.s0(objT);
            }
            gbx gbxVar = new gbx(z50.c, (Function0) objT);
            if (z) {
                b0kVar3.i0(-75675006);
                uvxVarB = uvx.b((uvx) b0kVar3.k(vvx.a), 1, (tvx) null, (p3v) null, 27);
                b0kVar3.r(false);
            } else {
                b0kVar3.i0(-75672293);
                uvxVarB = uvx.b((uvx) b0kVar3.k(vvx.a), 0, (tvx) null, new p3v(64.0f), 15);
                b0kVar3.r(false);
            }
            if (z) {
                b0kVar3.i0(1949702783);
                b0kVar3.r(false);
                xu30Var = null;
            } else {
                b0kVar3.i0(1949213325);
                xu30 xu30VarR = apo.r(-672576089, new ac8(3, (byte) 6), b0kVar3);
                b0kVar3.r(false);
                xu30Var = xu30VarR;
            }
            qim0Var2 = qim0Var3;
            b0kVar2 = b0kVar3;
            jto1.b(qim0VarN, uvxVarB, null, false, null, null, gbxVar, null, z ? vki.a : null, xu30Var, null, z ? null : vki.b, null, null, null, apo.r(-1670082238, new aw1((byte) 24, z), b0kVar3), b0kVar2, 70, 196608, 29884);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new le3(qim0Var2, z, function0, i, (byte) 9);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void d(scz sczVar, yqg yqgVar, qim0 qim0Var, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        int i2;
        String strK;
        int i3;
        m4c m4cVar = fkj0.X;
        iu30 iu30Var = sczVar.d;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1126716350);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(sczVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.g(yqgVar) ? 32 : 16;
        }
        int i4 = i2 | 384;
        if (x340Var.Y(i4 & 1, (i4 & 147) != 146)) {
            x340Var.f0(442659351, sczVar.a);
            ncz nczVar = sczVar.c;
            boolean z = nczVar instanceof ncz;
            mcz mczVar = mcz.a;
            if (z) {
                x340Var.i0(442661682);
                int iC = l1d.C(nczVar.a);
                if (iC == 0) {
                    i3 = 2131960189;
                } else if (iC == 1) {
                    i3 = 2131960190;
                } else if (iC == 2) {
                    i3 = 2131960191;
                } else {
                    if (iC != 3) {
                        eg.o();
                        return;
                    }
                    i3 = 2131960192;
                }
                strK = cwl1.o0(x340Var, i3);
                x340Var.r(false);
            } else if (nczVar instanceof pcz) {
                x340Var.i0(837698885);
                String strR = sap1.r(((pcz) nczVar).a);
                x340Var.i0(442667859);
                strK = cwl1.n0(2131960193, new Object[]{strR}, x340Var);
                x340Var.r(false);
                x340Var.r(false);
            } else if (nczVar.equals(lcz.a)) {
                strK = x0d.k(x340Var, 442671632, 2131960194, x340Var, false);
            } else {
                if (!nczVar.equals(mczVar) && !(nczVar instanceof ocz)) {
                    throw p3d1.k(x340Var, 442660364, false);
                }
                x340Var.i0(838032351);
                x340Var.r(false);
                strK = null;
            }
            String str = (z || (nczVar instanceof pcz)) ? strK : null;
            boolean zI = x340Var.i(sczVar);
            Object objT = x340Var.T();
            if (zI || objT == m4cVar) {
                objT = new nty(sczVar, (byte) 16);
                x340Var.s0(objT);
            }
            qxd0.i(iu30Var, (iu30) objT, x340Var);
            boolean zI2 = x340Var.i(sczVar) | x340Var.g(str);
            Object objT2 = x340Var.T();
            if (zI2 || objT2 == m4cVar) {
                objT2 = new nnu(sczVar, str, (lnm) null, (byte) 24);
                x340Var.s0(objT2);
            }
            qxd0.s(str, iu30Var, (vu30) objT2, x340Var);
            if (nczVar.equals(mczVar)) {
                x340Var.i0(839679940);
                x340Var.r(false);
            } else {
                x340Var.i0(838527701);
                gfx.b(1, apo.r(1598500411, new qfx(sczVar, nczVar, yqgVar, strK), x340Var), x340Var, 54);
                x340Var.r(false);
            }
            x340Var.r(false);
            qim0Var = nim0.a;
        } else {
            x340Var.b0();
        }
        qim0 qim0Var2 = qim0Var;
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new x8t(sczVar, yqgVar, qim0Var2, i, (byte) 26);
        }
    }

    public static final void e(i091 i091Var, yqg yqgVar, b0k b0kVar, int i) {
        b0k b0kVar2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(1853398765);
        int i2 = (b0kVar3.i(i091Var) ? 4 : 2) | i | (b0kVar3.g(yqgVar) ? 32 : 16);
        if (b0kVar3.Y(i2 & 1, (i2 & 19) != 18)) {
            b0kVar2 = b0kVar3;
            String strR = sap1.r(z1p1.C(i091Var, i091Var.e, yqgVar, b0kVar3, ((i2 << 3) & 896) | (i2 & 14)));
            uwr uwrVar = cbx.a;
            w6d1.d(strR, (qim0) null, (u7h) null, lee1.a(cbx.d(b0kVar2).m, 0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, "tnum", 0L, (TextGeometricTransform) null, 0L, (TextDecoration) null, (Shadow) null, (phc1) null, 0, 0, 0L, (u8e1) null, (wdt0) null, (shc0) null, 0, 16777151), 0L, 0.0f, 0.0f, 0.0f, new cjc0(1), 2, b0kVar2, 0, 246);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new ozw(i091Var, yqgVar, i, (byte) 29);
        }
    }

    public static final void f(String str, int i, Uri uri, int i2, long j, Function0 function0, b0k b0kVar, int i3) {
        int i4;
        b0k b0kVar2;
        String str2 = str;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(280010841);
        int i5 = i3 | (b0kVar3.g(str2) ? 4 : 2) | (b0kVar3.e(l1d.C(i)) ? 32 : 16) | (b0kVar3.g(uri) ? 256 : 128) | (b0kVar3.e(i2) ? 2048 : 1024) | (b0kVar3.f(j) ? 16384 : 8192) | (b0kVar3.i(function0) ? 131072 : 65536);
        if (b0kVar3.Y(i5 & 1, (74899 & i5) != 74898)) {
            boolean z = (i5 & 458752) == 131072;
            Object objT = b0kVar3.T();
            if (z || objT == fkj0.X) {
                objT = new tze0(function0, (byte) 13);
                b0kVar3.s0(objT);
            }
            gbx gbxVar = new gbx(z50.c, (Function0) objT);
            neg0 neg0Var = new neg0(uri, str2, j, (byte) 0);
            str2 = str2;
            i4 = i;
            b0kVar2 = b0kVar3;
            jto1.b(null, null, null, false, null, null, gbxVar, null, null, apo.r(-1955621246, neg0Var, b0kVar3), null, apo.r(782485537, new f13(i4, (byte) 11), b0kVar3), apo.r(-254524864, new f13(i2, (byte) 12), b0kVar3), null, null, apo.r(929411229, new qdg0(str2, (byte) 2), b0kVar3), b0kVar2, 805306368, 197040, 26047);
        } else {
            i4 = i;
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new ved0(str2, i4, uri, i2, j, function0, i3);
        }
    }

    public static final void g(int i, b0k b0kVar, int i2) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(717660574);
        int i3 = (x340Var.e(i) ? 4 : 2) | i2;
        if (x340Var.Y(i3 & 1, (i3 & 3) != 2)) {
            gfx.b(15, apo.r(-2068120493, new ue0((byte) 14, i, cwl1.U(2131820791, i, new Object[]{Integer.valueOf(i)}, x340Var), false), x340Var), x340Var, 54);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new p4g0((byte) 1, i, i2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0120  */
    /* JADX WARN: Code duplicated, block: B:102:0x0123  */
    /* JADX WARN: Code duplicated, block: B:105:0x012d  */
    /* JADX WARN: Code duplicated, block: B:107:0x013a  */
    /* JADX WARN: Code duplicated, block: B:117:0x015b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:118:0x015d  */
    /* JADX WARN: Code duplicated, block: B:121:0x0164  */
    /* JADX WARN: Code duplicated, block: B:123:0x0174  */
    /* JADX WARN: Code duplicated, block: B:125:0x0178  */
    /* JADX WARN: Code duplicated, block: B:128:0x017e  */
    /* JADX WARN: Code duplicated, block: B:129:0x0185  */
    /* JADX WARN: Code duplicated, block: B:131:0x0189  */
    /* JADX WARN: Code duplicated, block: B:133:0x0195  */
    /* JADX WARN: Code duplicated, block: B:137:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:140:0x01af  */
    /* JADX WARN: Code duplicated, block: B:142:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:145:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:146:0x0230  */
    /* JADX WARN: Code duplicated, block: B:148:0x0236  */
    /* JADX WARN: Code duplicated, block: B:151:0x0249  */
    /* JADX WARN: Code duplicated, block: B:153:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:47:0x007f  */
    /* JADX WARN: Code duplicated, block: B:49:0x0083  */
    /* JADX WARN: Code duplicated, block: B:51:0x008b  */
    /* JADX WARN: Code duplicated, block: B:52:0x008e  */
    /* JADX WARN: Code duplicated, block: B:55:0x0094  */
    /* JADX WARN: Code duplicated, block: B:58:0x009c  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:69:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:70:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:74:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:75:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:79:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:81:0x00da  */
    /* JADX WARN: Code duplicated, block: B:84:0x00e5 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:87:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:90:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:92:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:94:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:96:0x0109  */
    /* JADX WARN: Code duplicated, block: B:97:0x010c  */
    public static final void h(hux huxVar, String str, String str2, Function0 function0, qim0 qim0Var, long j, boolean z, boolean z2, max maxVar, vu30 vu30Var, b0k b0kVar, int i, int i2) {
        int i3;
        qim0 qim0Var2;
        long j2;
        int i4;
        boolean z3;
        int i5;
        int i6;
        boolean z4;
        int i7;
        int i8;
        int i9;
        int i10;
        boolean z5;
        b0k b0kVar2;
        qim0 qim0Var3;
        long j3;
        max maxVar2;
        vu30 vu30Var2;
        boolean z6;
        boolean z7;
        h311 h311VarV;
        max maxVar3;
        boolean z8;
        vu30 vu30Var3;
        int i11;
        boolean z9;
        Object objT;
        Function0 function1;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(43316229);
        if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? b0kVar3.g(huxVar) : b0kVar3.i(huxVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= b0kVar3.g(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= b0kVar3.g(str2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= b0kVar3.i(function0) ? 2048 : 1024;
        }
        int i12 = i2 & 16;
        if (i12 == 0) {
            if ((i & 24576) == 0) {
                qim0Var2 = qim0Var;
                i3 |= b0kVar3.i(qim0Var2) ? 16384 : 8192;
            }
            if ((196608 & i) == 0) {
                if ((i2 & 32) == 0) {
                    j2 = j;
                    int i13 = b0kVar3.f(j2) ? 131072 : 65536;
                    i3 |= i13;
                } else {
                    j2 = j;
                }
                i3 |= i13;
            } else {
                j2 = j;
            }
            i4 = i2 & 64;
            if (i4 != 0) {
                if ((1572864 & i) == 0) {
                    z3 = z;
                    if (b0kVar3.h(z3)) {
                        i5 = 1048576;
                    } else {
                        i5 = 524288;
                    }
                    i3 |= i5;
                }
                i6 = i2 & 128;
                if (i6 != 0) {
                    i3 |= 12582912;
                    z4 = z2;
                } else {
                    z4 = z2;
                    if ((i & 12582912) == 0) {
                        if (b0kVar3.h(z4)) {
                            i7 = 8388608;
                        } else {
                            i7 = 4194304;
                        }
                        i3 |= i7;
                    }
                }
                if ((i & 100663296) != 0) {
                    i3 |= ((i2 & 256) == 0 || !b0kVar3.i(maxVar)) ? 33554432 : 67108864;
                }
                i8 = i2 & 512;
                if (i8 != 0) {
                    if ((i & 805306368) == 0) {
                        if (b0kVar3.i(vu30Var)) {
                            i9 = 536870912;
                        } else {
                            i9 = 268435456;
                        }
                        i3 |= i9;
                    }
                    i10 = i3;
                    if ((i3 & 306783379) != 306783378) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    if (b0kVar3.Y(i10 & 1, z5)) {
                        b0kVar3.d0();
                        if ((i & 1) != 0 || b0kVar3.E()) {
                            if (i12 != 0) {
                                qim0Var2 = nim0.a;
                            }
                            if ((i2 & 32) != 0) {
                                uwr uwrVar = cbx.a;
                                j2 = cbx.a(b0kVar3).b.a;
                                i10 &= -458753;
                            }
                            if (i4 != 0) {
                                z3 = false;
                            }
                            if (i6 != 0) {
                                z4 = false;
                            }
                            if ((i2 & 256) != 0) {
                                maxVar3 = jax.a;
                                i10 &= -234881025;
                            } else {
                                maxVar3 = maxVar;
                            }
                            if (i8 != 0) {
                                z8 = false;
                                vu30Var3 = null;
                            } else {
                                z8 = false;
                                vu30Var3 = vu30Var;
                            }
                            i11 = i10;
                        } else {
                            b0kVar3.b0();
                            if ((i2 & 32) != 0) {
                                i10 &= -458753;
                            }
                            if ((i2 & 256) != 0) {
                                i10 &= -234881025;
                            }
                            vu30Var3 = vu30Var;
                            i11 = i10;
                            z8 = false;
                            maxVar3 = maxVar;
                        }
                        b0kVar3.s();
                        z9 = (i11 & 7168) != 2048 ? z8 : true;
                        objT = b0kVar3.T();
                        if (z9 || objT == fkj0.X) {
                            objT = new lpx0(function0, (byte) 2);
                            b0kVar3.s0(objT);
                        }
                        function1 = (Function0) objT;
                        if (!ihc1.y0(str2)) {
                            hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                            return;
                        }
                        gbx gbxVar = new gbx(new y50(str2), function1);
                        boolean z10 = z3;
                        int i14 = i11 >> 3;
                        b0kVar2 = b0kVar3;
                        qim0 qim0Var4 = qim0Var2;
                        poo1.e(gbxVar, pex.b, yoo1.z(b0kVar3), qim0Var4, 0, null, maxVar3, apo.r(-1480439747, new tre(z4, huxVar, j2, z10), b0kVar3), vu30Var3, null, null, false, null, apo.r(449831562, new psr0(str, (byte) 28), b0kVar3), b0kVar2, ((i11 >> 6) & 3670016) | 12582912 | (i14 & 7168) | (i14 & 234881024), 3072, 7728);
                        z6 = z4;
                        j3 = j2;
                        maxVar2 = maxVar3;
                        vu30Var2 = vu30Var3;
                        z7 = z10;
                        qim0Var3 = qim0Var4;
                    } else {
                        b0kVar2 = b0kVar3;
                        b0kVar2.b0();
                        qim0Var3 = qim0Var2;
                        j3 = j2;
                        maxVar2 = maxVar;
                        vu30Var2 = vu30Var;
                        z6 = z4;
                        z7 = z3;
                    }
                    h311VarV = b0kVar2.v();
                    if (h311VarV != null) {
                        h311VarV.d = new wpx0(huxVar, str, str2, function0, qim0Var3, j3, z7, z6, maxVar2, vu30Var2, i, i2);
                    }
                }
                i3 |= 805306368;
                i10 = i3;
                if ((i3 & 306783379) != 306783378) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (b0kVar3.Y(i10 & 1, z5)) {
                    b0kVar3.d0();
                    if ((i & 1) != 0) {
                        if (i12 != 0) {
                            qim0Var2 = nim0.a;
                        }
                        if ((i2 & 32) != 0) {
                            uwr uwrVar2 = cbx.a;
                            j2 = cbx.a(b0kVar3).b.a;
                            i10 &= -458753;
                        }
                        if (i4 != 0) {
                            z3 = false;
                        }
                        if (i6 != 0) {
                            z4 = false;
                        }
                        if ((i2 & 256) != 0) {
                            maxVar3 = jax.a;
                            i10 &= -234881025;
                        } else {
                            maxVar3 = maxVar;
                        }
                        if (i8 != 0) {
                            z8 = false;
                            vu30Var3 = null;
                        } else {
                            z8 = false;
                            vu30Var3 = vu30Var;
                        }
                        i11 = i10;
                    } else {
                        if (i12 != 0) {
                            qim0Var2 = nim0.a;
                        }
                        if ((i2 & 32) != 0) {
                            uwr uwrVar3 = cbx.a;
                            j2 = cbx.a(b0kVar3).b.a;
                            i10 &= -458753;
                        }
                        if (i4 != 0) {
                            z3 = false;
                        }
                        if (i6 != 0) {
                            z4 = false;
                        }
                        if ((i2 & 256) != 0) {
                            maxVar3 = jax.a;
                            i10 &= -234881025;
                        } else {
                            maxVar3 = maxVar;
                        }
                        if (i8 != 0) {
                            z8 = false;
                            vu30Var3 = null;
                        } else {
                            z8 = false;
                            vu30Var3 = vu30Var;
                        }
                        i11 = i10;
                    }
                    b0kVar3.s();
                    if ((i11 & 7168) != 2048) {
                    }
                    objT = b0kVar3.T();
                    if (z9) {
                        objT = new lpx0(function0, (byte) 2);
                        b0kVar3.s0(objT);
                    } else {
                        objT = new lpx0(function0, (byte) 2);
                        b0kVar3.s0(objT);
                    }
                    function1 = (Function0) objT;
                    if (!ihc1.y0(str2)) {
                        hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                        return;
                    }
                    gbx gbxVar2 = new gbx(new y50(str2), function1);
                    boolean z11 = z3;
                    int i15 = i11 >> 3;
                    b0kVar2 = b0kVar3;
                    qim0 qim0Var5 = qim0Var2;
                    poo1.e(gbxVar2, pex.b, yoo1.z(b0kVar3), qim0Var5, 0, null, maxVar3, apo.r(-1480439747, new tre(z4, huxVar, j2, z11), b0kVar3), vu30Var3, null, null, false, null, apo.r(449831562, new psr0(str, (byte) 28), b0kVar3), b0kVar2, ((i11 >> 6) & 3670016) | 12582912 | (i15 & 7168) | (i15 & 234881024), 3072, 7728);
                    z6 = z4;
                    j3 = j2;
                    maxVar2 = maxVar3;
                    vu30Var2 = vu30Var3;
                    z7 = z11;
                    qim0Var3 = qim0Var5;
                } else {
                    b0kVar2 = b0kVar3;
                    b0kVar2.b0();
                    qim0Var3 = qim0Var2;
                    j3 = j2;
                    maxVar2 = maxVar;
                    vu30Var2 = vu30Var;
                    z6 = z4;
                    z7 = z3;
                }
                h311VarV = b0kVar2.v();
                if (h311VarV != null) {
                    h311VarV.d = new wpx0(huxVar, str, str2, function0, qim0Var3, j3, z7, z6, maxVar2, vu30Var2, i, i2);
                }
            }
            i3 |= 1572864;
            z3 = z;
            i6 = i2 & 128;
            if (i6 != 0) {
                i3 |= 12582912;
                z4 = z2;
            } else {
                z4 = z2;
                if ((i & 12582912) == 0) {
                    if (b0kVar3.h(z4)) {
                        i7 = 8388608;
                    } else {
                        i7 = 4194304;
                    }
                    i3 |= i7;
                }
            }
            if ((i & 100663296) != 0) {
                i3 |= ((i2 & 256) == 0 || !b0kVar3.i(maxVar)) ? 33554432 : 67108864;
            }
            i8 = i2 & 512;
            if (i8 != 0) {
                if ((i & 805306368) == 0) {
                    if (b0kVar3.i(vu30Var)) {
                        i9 = 536870912;
                    } else {
                        i9 = 268435456;
                    }
                    i3 |= i9;
                }
                i10 = i3;
                if ((i3 & 306783379) != 306783378) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (b0kVar3.Y(i10 & 1, z5)) {
                    b0kVar3.d0();
                    if ((i & 1) != 0) {
                        if (i12 != 0) {
                            qim0Var2 = nim0.a;
                        }
                        if ((i2 & 32) != 0) {
                            uwr uwrVar4 = cbx.a;
                            j2 = cbx.a(b0kVar3).b.a;
                            i10 &= -458753;
                        }
                        if (i4 != 0) {
                            z3 = false;
                        }
                        if (i6 != 0) {
                            z4 = false;
                        }
                        if ((i2 & 256) != 0) {
                            maxVar3 = jax.a;
                            i10 &= -234881025;
                        } else {
                            maxVar3 = maxVar;
                        }
                        if (i8 != 0) {
                            z8 = false;
                            vu30Var3 = null;
                        } else {
                            z8 = false;
                            vu30Var3 = vu30Var;
                        }
                        i11 = i10;
                    } else {
                        if (i12 != 0) {
                            qim0Var2 = nim0.a;
                        }
                        if ((i2 & 32) != 0) {
                            uwr uwrVar5 = cbx.a;
                            j2 = cbx.a(b0kVar3).b.a;
                            i10 &= -458753;
                        }
                        if (i4 != 0) {
                            z3 = false;
                        }
                        if (i6 != 0) {
                            z4 = false;
                        }
                        if ((i2 & 256) != 0) {
                            maxVar3 = jax.a;
                            i10 &= -234881025;
                        } else {
                            maxVar3 = maxVar;
                        }
                        if (i8 != 0) {
                            z8 = false;
                            vu30Var3 = null;
                        } else {
                            z8 = false;
                            vu30Var3 = vu30Var;
                        }
                        i11 = i10;
                    }
                    b0kVar3.s();
                    if ((i11 & 7168) != 2048) {
                    }
                    objT = b0kVar3.T();
                    if (z9) {
                        objT = new lpx0(function0, (byte) 2);
                        b0kVar3.s0(objT);
                    } else {
                        objT = new lpx0(function0, (byte) 2);
                        b0kVar3.s0(objT);
                    }
                    function1 = (Function0) objT;
                    if (!ihc1.y0(str2)) {
                        hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                        return;
                    }
                    gbx gbxVar3 = new gbx(new y50(str2), function1);
                    boolean z12 = z3;
                    int i16 = i11 >> 3;
                    b0kVar2 = b0kVar3;
                    qim0 qim0Var6 = qim0Var2;
                    poo1.e(gbxVar3, pex.b, yoo1.z(b0kVar3), qim0Var6, 0, null, maxVar3, apo.r(-1480439747, new tre(z4, huxVar, j2, z12), b0kVar3), vu30Var3, null, null, false, null, apo.r(449831562, new psr0(str, (byte) 28), b0kVar3), b0kVar2, ((i11 >> 6) & 3670016) | 12582912 | (i16 & 7168) | (i16 & 234881024), 3072, 7728);
                    z6 = z4;
                    j3 = j2;
                    maxVar2 = maxVar3;
                    vu30Var2 = vu30Var3;
                    z7 = z12;
                    qim0Var3 = qim0Var6;
                } else {
                    b0kVar2 = b0kVar3;
                    b0kVar2.b0();
                    qim0Var3 = qim0Var2;
                    j3 = j2;
                    maxVar2 = maxVar;
                    vu30Var2 = vu30Var;
                    z6 = z4;
                    z7 = z3;
                }
                h311VarV = b0kVar2.v();
                if (h311VarV != null) {
                    h311VarV.d = new wpx0(huxVar, str, str2, function0, qim0Var3, j3, z7, z6, maxVar2, vu30Var2, i, i2);
                }
            }
            i3 |= 805306368;
            i10 = i3;
            if ((i3 & 306783379) != 306783378) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (b0kVar3.Y(i10 & 1, z5)) {
                b0kVar3.d0();
                if ((i & 1) != 0) {
                    if (i12 != 0) {
                        qim0Var2 = nim0.a;
                    }
                    if ((i2 & 32) != 0) {
                        uwr uwrVar6 = cbx.a;
                        j2 = cbx.a(b0kVar3).b.a;
                        i10 &= -458753;
                    }
                    if (i4 != 0) {
                        z3 = false;
                    }
                    if (i6 != 0) {
                        z4 = false;
                    }
                    if ((i2 & 256) != 0) {
                        maxVar3 = jax.a;
                        i10 &= -234881025;
                    } else {
                        maxVar3 = maxVar;
                    }
                    if (i8 != 0) {
                        z8 = false;
                        vu30Var3 = null;
                    } else {
                        z8 = false;
                        vu30Var3 = vu30Var;
                    }
                    i11 = i10;
                } else {
                    if (i12 != 0) {
                        qim0Var2 = nim0.a;
                    }
                    if ((i2 & 32) != 0) {
                        uwr uwrVar7 = cbx.a;
                        j2 = cbx.a(b0kVar3).b.a;
                        i10 &= -458753;
                    }
                    if (i4 != 0) {
                        z3 = false;
                    }
                    if (i6 != 0) {
                        z4 = false;
                    }
                    if ((i2 & 256) != 0) {
                        maxVar3 = jax.a;
                        i10 &= -234881025;
                    } else {
                        maxVar3 = maxVar;
                    }
                    if (i8 != 0) {
                        z8 = false;
                        vu30Var3 = null;
                    } else {
                        z8 = false;
                        vu30Var3 = vu30Var;
                    }
                    i11 = i10;
                }
                b0kVar3.s();
                if ((i11 & 7168) != 2048) {
                }
                objT = b0kVar3.T();
                if (z9) {
                    objT = new lpx0(function0, (byte) 2);
                    b0kVar3.s0(objT);
                } else {
                    objT = new lpx0(function0, (byte) 2);
                    b0kVar3.s0(objT);
                }
                function1 = (Function0) objT;
                if (!ihc1.y0(str2)) {
                    hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                    return;
                }
                gbx gbxVar4 = new gbx(new y50(str2), function1);
                boolean z13 = z3;
                int i17 = i11 >> 3;
                b0kVar2 = b0kVar3;
                qim0 qim0Var7 = qim0Var2;
                poo1.e(gbxVar4, pex.b, yoo1.z(b0kVar3), qim0Var7, 0, null, maxVar3, apo.r(-1480439747, new tre(z4, huxVar, j2, z13), b0kVar3), vu30Var3, null, null, false, null, apo.r(449831562, new psr0(str, (byte) 28), b0kVar3), b0kVar2, ((i11 >> 6) & 3670016) | 12582912 | (i17 & 7168) | (i17 & 234881024), 3072, 7728);
                z6 = z4;
                j3 = j2;
                maxVar2 = maxVar3;
                vu30Var2 = vu30Var3;
                z7 = z13;
                qim0Var3 = qim0Var7;
            } else {
                b0kVar2 = b0kVar3;
                b0kVar2.b0();
                qim0Var3 = qim0Var2;
                j3 = j2;
                maxVar2 = maxVar;
                vu30Var2 = vu30Var;
                z6 = z4;
                z7 = z3;
            }
            h311VarV = b0kVar2.v();
            if (h311VarV != null) {
                h311VarV.d = new wpx0(huxVar, str, str2, function0, qim0Var3, j3, z7, z6, maxVar2, vu30Var2, i, i2);
            }
        }
        i3 |= 24576;
        qim0Var2 = qim0Var;
        if ((196608 & i) == 0) {
            if ((i2 & 32) == 0) {
                j2 = j;
                if (b0kVar3.f(j2)) {
                }
                i3 |= i13;
            } else {
                j2 = j;
            }
            i3 |= i13;
        } else {
            j2 = j;
        }
        i4 = i2 & 64;
        if (i4 != 0) {
            if ((1572864 & i) == 0) {
                z3 = z;
                if (b0kVar3.h(z3)) {
                    i5 = 1048576;
                } else {
                    i5 = 524288;
                }
                i3 |= i5;
            }
            i6 = i2 & 128;
            if (i6 != 0) {
                i3 |= 12582912;
                z4 = z2;
            } else {
                z4 = z2;
                if ((i & 12582912) == 0) {
                    if (b0kVar3.h(z4)) {
                        i7 = 8388608;
                    } else {
                        i7 = 4194304;
                    }
                    i3 |= i7;
                }
            }
            if ((i & 100663296) != 0) {
                i3 |= ((i2 & 256) == 0 || !b0kVar3.i(maxVar)) ? 33554432 : 67108864;
            }
            i8 = i2 & 512;
            if (i8 != 0) {
                if ((i & 805306368) == 0) {
                    if (b0kVar3.i(vu30Var)) {
                        i9 = 536870912;
                    } else {
                        i9 = 268435456;
                    }
                    i3 |= i9;
                }
                i10 = i3;
                if ((i3 & 306783379) != 306783378) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (b0kVar3.Y(i10 & 1, z5)) {
                    b0kVar3.d0();
                    if ((i & 1) != 0) {
                        if (i12 != 0) {
                            qim0Var2 = nim0.a;
                        }
                        if ((i2 & 32) != 0) {
                            uwr uwrVar8 = cbx.a;
                            j2 = cbx.a(b0kVar3).b.a;
                            i10 &= -458753;
                        }
                        if (i4 != 0) {
                            z3 = false;
                        }
                        if (i6 != 0) {
                            z4 = false;
                        }
                        if ((i2 & 256) != 0) {
                            maxVar3 = jax.a;
                            i10 &= -234881025;
                        } else {
                            maxVar3 = maxVar;
                        }
                        if (i8 != 0) {
                            z8 = false;
                            vu30Var3 = null;
                        } else {
                            z8 = false;
                            vu30Var3 = vu30Var;
                        }
                        i11 = i10;
                    } else {
                        if (i12 != 0) {
                            qim0Var2 = nim0.a;
                        }
                        if ((i2 & 32) != 0) {
                            uwr uwrVar9 = cbx.a;
                            j2 = cbx.a(b0kVar3).b.a;
                            i10 &= -458753;
                        }
                        if (i4 != 0) {
                            z3 = false;
                        }
                        if (i6 != 0) {
                            z4 = false;
                        }
                        if ((i2 & 256) != 0) {
                            maxVar3 = jax.a;
                            i10 &= -234881025;
                        } else {
                            maxVar3 = maxVar;
                        }
                        if (i8 != 0) {
                            z8 = false;
                            vu30Var3 = null;
                        } else {
                            z8 = false;
                            vu30Var3 = vu30Var;
                        }
                        i11 = i10;
                    }
                    b0kVar3.s();
                    if ((i11 & 7168) != 2048) {
                    }
                    objT = b0kVar3.T();
                    if (z9) {
                        objT = new lpx0(function0, (byte) 2);
                        b0kVar3.s0(objT);
                    } else {
                        objT = new lpx0(function0, (byte) 2);
                        b0kVar3.s0(objT);
                    }
                    function1 = (Function0) objT;
                    if (!ihc1.y0(str2)) {
                        hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                        return;
                    }
                    gbx gbxVar5 = new gbx(new y50(str2), function1);
                    boolean z14 = z3;
                    int i18 = i11 >> 3;
                    b0kVar2 = b0kVar3;
                    qim0 qim0Var8 = qim0Var2;
                    poo1.e(gbxVar5, pex.b, yoo1.z(b0kVar3), qim0Var8, 0, null, maxVar3, apo.r(-1480439747, new tre(z4, huxVar, j2, z14), b0kVar3), vu30Var3, null, null, false, null, apo.r(449831562, new psr0(str, (byte) 28), b0kVar3), b0kVar2, ((i11 >> 6) & 3670016) | 12582912 | (i18 & 7168) | (i18 & 234881024), 3072, 7728);
                    z6 = z4;
                    j3 = j2;
                    maxVar2 = maxVar3;
                    vu30Var2 = vu30Var3;
                    z7 = z14;
                    qim0Var3 = qim0Var8;
                } else {
                    b0kVar2 = b0kVar3;
                    b0kVar2.b0();
                    qim0Var3 = qim0Var2;
                    j3 = j2;
                    maxVar2 = maxVar;
                    vu30Var2 = vu30Var;
                    z6 = z4;
                    z7 = z3;
                }
                h311VarV = b0kVar2.v();
                if (h311VarV != null) {
                    h311VarV.d = new wpx0(huxVar, str, str2, function0, qim0Var3, j3, z7, z6, maxVar2, vu30Var2, i, i2);
                }
            }
            i3 |= 805306368;
            i10 = i3;
            if ((i3 & 306783379) != 306783378) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (b0kVar3.Y(i10 & 1, z5)) {
                b0kVar3.d0();
                if ((i & 1) != 0) {
                    if (i12 != 0) {
                        qim0Var2 = nim0.a;
                    }
                    if ((i2 & 32) != 0) {
                        uwr uwrVar10 = cbx.a;
                        j2 = cbx.a(b0kVar3).b.a;
                        i10 &= -458753;
                    }
                    if (i4 != 0) {
                        z3 = false;
                    }
                    if (i6 != 0) {
                        z4 = false;
                    }
                    if ((i2 & 256) != 0) {
                        maxVar3 = jax.a;
                        i10 &= -234881025;
                    } else {
                        maxVar3 = maxVar;
                    }
                    if (i8 != 0) {
                        z8 = false;
                        vu30Var3 = null;
                    } else {
                        z8 = false;
                        vu30Var3 = vu30Var;
                    }
                    i11 = i10;
                } else {
                    if (i12 != 0) {
                        qim0Var2 = nim0.a;
                    }
                    if ((i2 & 32) != 0) {
                        uwr uwrVar11 = cbx.a;
                        j2 = cbx.a(b0kVar3).b.a;
                        i10 &= -458753;
                    }
                    if (i4 != 0) {
                        z3 = false;
                    }
                    if (i6 != 0) {
                        z4 = false;
                    }
                    if ((i2 & 256) != 0) {
                        maxVar3 = jax.a;
                        i10 &= -234881025;
                    } else {
                        maxVar3 = maxVar;
                    }
                    if (i8 != 0) {
                        z8 = false;
                        vu30Var3 = null;
                    } else {
                        z8 = false;
                        vu30Var3 = vu30Var;
                    }
                    i11 = i10;
                }
                b0kVar3.s();
                if ((i11 & 7168) != 2048) {
                }
                objT = b0kVar3.T();
                if (z9) {
                    objT = new lpx0(function0, (byte) 2);
                    b0kVar3.s0(objT);
                } else {
                    objT = new lpx0(function0, (byte) 2);
                    b0kVar3.s0(objT);
                }
                function1 = (Function0) objT;
                if (!ihc1.y0(str2)) {
                    hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                    return;
                }
                gbx gbxVar6 = new gbx(new y50(str2), function1);
                boolean z15 = z3;
                int i19 = i11 >> 3;
                b0kVar2 = b0kVar3;
                qim0 qim0Var9 = qim0Var2;
                poo1.e(gbxVar6, pex.b, yoo1.z(b0kVar3), qim0Var9, 0, null, maxVar3, apo.r(-1480439747, new tre(z4, huxVar, j2, z15), b0kVar3), vu30Var3, null, null, false, null, apo.r(449831562, new psr0(str, (byte) 28), b0kVar3), b0kVar2, ((i11 >> 6) & 3670016) | 12582912 | (i19 & 7168) | (i19 & 234881024), 3072, 7728);
                z6 = z4;
                j3 = j2;
                maxVar2 = maxVar3;
                vu30Var2 = vu30Var3;
                z7 = z15;
                qim0Var3 = qim0Var9;
            } else {
                b0kVar2 = b0kVar3;
                b0kVar2.b0();
                qim0Var3 = qim0Var2;
                j3 = j2;
                maxVar2 = maxVar;
                vu30Var2 = vu30Var;
                z6 = z4;
                z7 = z3;
            }
            h311VarV = b0kVar2.v();
            if (h311VarV != null) {
                h311VarV.d = new wpx0(huxVar, str, str2, function0, qim0Var3, j3, z7, z6, maxVar2, vu30Var2, i, i2);
            }
        }
        i3 |= 1572864;
        z3 = z;
        i6 = i2 & 128;
        if (i6 != 0) {
            i3 |= 12582912;
            z4 = z2;
        } else {
            z4 = z2;
            if ((i & 12582912) == 0) {
                if (b0kVar3.h(z4)) {
                    i7 = 8388608;
                } else {
                    i7 = 4194304;
                }
                i3 |= i7;
            }
        }
        if ((i & 100663296) != 0) {
            i3 |= ((i2 & 256) == 0 || !b0kVar3.i(maxVar)) ? 33554432 : 67108864;
        }
        i8 = i2 & 512;
        if (i8 != 0) {
            if ((i & 805306368) == 0) {
                if (b0kVar3.i(vu30Var)) {
                    i9 = 536870912;
                } else {
                    i9 = 268435456;
                }
                i3 |= i9;
            }
            i10 = i3;
            if ((i3 & 306783379) != 306783378) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (b0kVar3.Y(i10 & 1, z5)) {
                b0kVar3.d0();
                if ((i & 1) != 0) {
                    if (i12 != 0) {
                        qim0Var2 = nim0.a;
                    }
                    if ((i2 & 32) != 0) {
                        uwr uwrVar12 = cbx.a;
                        j2 = cbx.a(b0kVar3).b.a;
                        i10 &= -458753;
                    }
                    if (i4 != 0) {
                        z3 = false;
                    }
                    if (i6 != 0) {
                        z4 = false;
                    }
                    if ((i2 & 256) != 0) {
                        maxVar3 = jax.a;
                        i10 &= -234881025;
                    } else {
                        maxVar3 = maxVar;
                    }
                    if (i8 != 0) {
                        z8 = false;
                        vu30Var3 = null;
                    } else {
                        z8 = false;
                        vu30Var3 = vu30Var;
                    }
                    i11 = i10;
                } else {
                    if (i12 != 0) {
                        qim0Var2 = nim0.a;
                    }
                    if ((i2 & 32) != 0) {
                        uwr uwrVar13 = cbx.a;
                        j2 = cbx.a(b0kVar3).b.a;
                        i10 &= -458753;
                    }
                    if (i4 != 0) {
                        z3 = false;
                    }
                    if (i6 != 0) {
                        z4 = false;
                    }
                    if ((i2 & 256) != 0) {
                        maxVar3 = jax.a;
                        i10 &= -234881025;
                    } else {
                        maxVar3 = maxVar;
                    }
                    if (i8 != 0) {
                        z8 = false;
                        vu30Var3 = null;
                    } else {
                        z8 = false;
                        vu30Var3 = vu30Var;
                    }
                    i11 = i10;
                }
                b0kVar3.s();
                if ((i11 & 7168) != 2048) {
                }
                objT = b0kVar3.T();
                if (z9) {
                    objT = new lpx0(function0, (byte) 2);
                    b0kVar3.s0(objT);
                } else {
                    objT = new lpx0(function0, (byte) 2);
                    b0kVar3.s0(objT);
                }
                function1 = (Function0) objT;
                if (!ihc1.y0(str2)) {
                    hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                    return;
                }
                gbx gbxVar7 = new gbx(new y50(str2), function1);
                boolean z16 = z3;
                int i110 = i11 >> 3;
                b0kVar2 = b0kVar3;
                qim0 qim0Var10 = qim0Var2;
                poo1.e(gbxVar7, pex.b, yoo1.z(b0kVar3), qim0Var10, 0, null, maxVar3, apo.r(-1480439747, new tre(z4, huxVar, j2, z16), b0kVar3), vu30Var3, null, null, false, null, apo.r(449831562, new psr0(str, (byte) 28), b0kVar3), b0kVar2, ((i11 >> 6) & 3670016) | 12582912 | (i110 & 7168) | (i110 & 234881024), 3072, 7728);
                z6 = z4;
                j3 = j2;
                maxVar2 = maxVar3;
                vu30Var2 = vu30Var3;
                z7 = z16;
                qim0Var3 = qim0Var10;
            } else {
                b0kVar2 = b0kVar3;
                b0kVar2.b0();
                qim0Var3 = qim0Var2;
                j3 = j2;
                maxVar2 = maxVar;
                vu30Var2 = vu30Var;
                z6 = z4;
                z7 = z3;
            }
            h311VarV = b0kVar2.v();
            if (h311VarV != null) {
                h311VarV.d = new wpx0(huxVar, str, str2, function0, qim0Var3, j3, z7, z6, maxVar2, vu30Var2, i, i2);
            }
        }
        i3 |= 805306368;
        i10 = i3;
        if ((i3 & 306783379) != 306783378) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (b0kVar3.Y(i10 & 1, z5)) {
            b0kVar3.d0();
            if ((i & 1) != 0) {
                if (i12 != 0) {
                    qim0Var2 = nim0.a;
                }
                if ((i2 & 32) != 0) {
                    uwr uwrVar14 = cbx.a;
                    j2 = cbx.a(b0kVar3).b.a;
                    i10 &= -458753;
                }
                if (i4 != 0) {
                    z3 = false;
                }
                if (i6 != 0) {
                    z4 = false;
                }
                if ((i2 & 256) != 0) {
                    maxVar3 = jax.a;
                    i10 &= -234881025;
                } else {
                    maxVar3 = maxVar;
                }
                if (i8 != 0) {
                    z8 = false;
                    vu30Var3 = null;
                } else {
                    z8 = false;
                    vu30Var3 = vu30Var;
                }
                i11 = i10;
            } else {
                if (i12 != 0) {
                    qim0Var2 = nim0.a;
                }
                if ((i2 & 32) != 0) {
                    uwr uwrVar15 = cbx.a;
                    j2 = cbx.a(b0kVar3).b.a;
                    i10 &= -458753;
                }
                if (i4 != 0) {
                    z3 = false;
                }
                if (i6 != 0) {
                    z4 = false;
                }
                if ((i2 & 256) != 0) {
                    maxVar3 = jax.a;
                    i10 &= -234881025;
                } else {
                    maxVar3 = maxVar;
                }
                if (i8 != 0) {
                    z8 = false;
                    vu30Var3 = null;
                } else {
                    z8 = false;
                    vu30Var3 = vu30Var;
                }
                i11 = i10;
            }
            b0kVar3.s();
            if ((i11 & 7168) != 2048) {
            }
            objT = b0kVar3.T();
            if (z9) {
                objT = new lpx0(function0, (byte) 2);
                b0kVar3.s0(objT);
            } else {
                objT = new lpx0(function0, (byte) 2);
                b0kVar3.s0(objT);
            }
            function1 = (Function0) objT;
            if (!ihc1.y0(str2)) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return;
            }
            gbx gbxVar8 = new gbx(new y50(str2), function1);
            boolean z17 = z3;
            int i111 = i11 >> 3;
            b0kVar2 = b0kVar3;
            qim0 qim0Var11 = qim0Var2;
            poo1.e(gbxVar8, pex.b, yoo1.z(b0kVar3), qim0Var11, 0, null, maxVar3, apo.r(-1480439747, new tre(z4, huxVar, j2, z17), b0kVar3), vu30Var3, null, null, false, null, apo.r(449831562, new psr0(str, (byte) 28), b0kVar3), b0kVar2, ((i11 >> 6) & 3670016) | 12582912 | (i111 & 7168) | (i111 & 234881024), 3072, 7728);
            z6 = z4;
            j3 = j2;
            maxVar2 = maxVar3;
            vu30Var2 = vu30Var3;
            z7 = z17;
            qim0Var3 = qim0Var11;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var3 = qim0Var2;
            j3 = j2;
            maxVar2 = maxVar;
            vu30Var2 = vu30Var;
            z6 = z4;
            z7 = z3;
        }
        h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new wpx0(huxVar, str, str2, function0, qim0Var3, j3, z7, z6, maxVar2, vu30Var2, i, i2);
        }
    }

    public static final void i(xtb0 xtb0Var, iu30 iu30Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(2114967611);
        int i2 = (x340Var.i(xtb0Var) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            boolean zI = x340Var.i(xtb0Var);
            Object objT = x340Var.T();
            if (zI || objT == fkj0.X) {
                objT = new mqv(xtb0Var, iu30Var, (lnm) null, (byte) 3);
                x340Var.s0(objT);
            }
            qxd0.s(xtb0Var, iu30Var, (vu30) objT, x340Var);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new tc11(xtb0Var, iu30Var, i, (byte) 27);
        }
    }

    public static final void j(c380 c380Var, mxf0 mxf0Var, yp71 yp71Var, String str, qim0 qim0Var, b0k b0kVar, int i) {
        b0k b0kVar2;
        qim0 qim0Var2;
        m4c m4cVar = fkj0.X;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-571822345);
        int i2 = i | (b0kVar3.g(c380Var) ? 4 : 2) | (b0kVar3.i(mxf0Var) ? 32 : 16) | (b0kVar3.i(yp71Var) ? 256 : 128) | (b0kVar3.g(str) ? 2048 : 1024) | 24576;
        if (b0kVar3.Y(i2 & 1, (i2 & 9363) != 9362)) {
            boolean z = (i2 & 14) == 4;
            Object objT = b0kVar3.T();
            Object obj = objT;
            if (z || objT == m4cVar) {
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : c380Var) {
                    if (obj2 instanceof b6q0) {
                        arrayList.add(obj2);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj3 : arrayList) {
                    if (((b6q0) obj3).g() != 1) {
                        arrayList2.add(obj3);
                    }
                }
                b0kVar3.s0(arrayList2);
                obj = arrayList2;
            }
            List list = (List) obj;
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarC = u291.c(qim0Var3, 0.7f);
            WeakHashMap weakHashMap = osl1.x;
            vk80 vk80VarX = poo1.x(new bgc0(lhc.g(b0kVar3).g, 32), b0kVar3);
            boolean zI = b0kVar3.i(mxf0Var) | ((i2 & 7168) == 2048) | b0kVar3.i(list) | b0kVar3.i(yp71Var);
            Object objT2 = b0kVar3.T();
            if (zI || objT2 == m4cVar) {
                objT2 = new e971(list, mxf0Var, str, yp71Var);
                b0kVar3.s0(objT2);
            }
            b0kVar2 = b0kVar3;
            ujo1.d(qim0VarC, null, vk80VarX, false, null, null, null, false, null, (iu30) objT2, b0kVar2, 0, 506);
            qim0Var2 = qim0Var3;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new tte1((byte) 6, i, c380Var, mxf0Var, yp71Var, str, qim0Var2);
        }
    }

    public static final int k(int i, int i2) {
        if (i == 1) {
            return i2;
        }
        if (i2 == 1 || i == i2) {
            return i;
        }
        eg.m("CONFLICTING_PROJECTION");
        return 0;
    }

    public static final o3r l(iu30 iu30Var, iu30 iu30Var2, boolean z) {
        return w3p1.o(new l4r(new xv00(rc11.a.b(dd8.class)), 2, q4r0.X, new j4r(new c30(z, iu30Var, iu30Var2, (byte) 28)), q4r0.Y), q4r0.Z);
    }

    public static boolean m(t380 t380Var, String str) {
        if (t380Var != null) {
            return t380Var.contains(str);
        }
        return true;
    }

    public static mnm0 n(knm0 knm0Var) {
        mnm0 mnm0Var = new mnm0(knm0Var);
        mnm0Var.setFloatValues(a);
        mnm0Var.setDuration((long) (1.0f * knm0Var.b()));
        return mnm0Var;
    }

    public static int o() {
        return b;
    }

    public static final boolean p(ttm1 ttm1Var) {
        ho6 ho6Var;
        Parcelable.Creator creator = ttm1.CREATOR;
        boolean z = false;
        if (u890.j(ttm1.i.get(ttm1Var.e), ho6.class)) {
            nb10 nb10Var = ttm1Var.g;
            if (nb10Var == null) {
                bhn0.i("null cannot be cast to non-null type com.spotify.yourlibrary.yourlibraryx.shared.domain.ArtistExtraInfo");
                return false;
            }
            ho6Var = (ho6) nb10Var;
        } else {
            ho6Var = null;
        }
        if (ho6Var != null && !ho6Var.a) {
            z = true;
        }
        return !z;
    }

    public static final void q(lzn0 lzn0Var, String str, tqw tqwVar, Bundle bundle) {
        if (tqwVar != null) {
            lzn0Var.a(str, n3o1.y(tqwVar), bundle);
            return;
        }
        ntj0 ntj0Var = new ntj0("Missing instrumentation during Element navigation");
        Set setB0 = dm61.B0(new String[]{"StackTrace", rc11.a.b(ntj0.class).o(), "navigateToUriWithNullableUbiInstrumentation"});
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : stackTrace) {
            String strI = xcg1.i(stackTraceElement.getClassName(), ".", stackTraceElement.getMethodName());
            if (setB0.isEmpty()) {
                arrayList.add(stackTraceElement);
                break;
            }
            Iterator it = setB0.iterator();
            do {
                if (!it.hasNext()) {
                    arrayList.add(stackTraceElement);
                    break;
                    break;
                }
            } while (!ihc1.h0(strI, (String) it.next(), false));
        }
        ntj0Var.setStackTrace((StackTraceElement[]) arrayList.toArray(new StackTraceElement[0]));
        n57.v(ntj0Var);
        if (bundle != null) {
            lzn0Var.g(bundle, str);
        } else {
            lzn0Var.h(str);
        }
    }

    public static qim0 s(String str, String str2, Function0 function0, qim0 qim0Var) {
        return zr7.i(qim0Var, new pa5(true, str2, function0, str, (byte) 0));
    }
}
