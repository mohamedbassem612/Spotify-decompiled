package p;

import android.graphics.Color;
import android.text.Html;
import android.text.Spanned;
import android.text.style.StyleSpan;
import android.text.style.URLSpan;
import android.view.View;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.PlatformSpanStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import com.facebook.FacebookException;
import com.spotify.base.java.logging.Logger;
import com.spotify.wrapped.v1.proto.Paragraph;
import java.util.ArrayList;
import java.util.Date;
import java.util.WeakHashMap;
import kotlin.jvm.functions.Function0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class fuo1 {
    public static b180 a;

    public static final int A(lk10 lk10Var) {
        int i = lk10Var.b;
        fk10 fk10Var = lk10Var.c;
        if (i == 1 && fk10Var == fk10.a) {
            return 3;
        }
        if (i == 1 && fk10Var == fk10.b) {
            return 6;
        }
        if (i != 1) {
            if (i == 2) {
                return 4;
            }
            if (i == 3) {
                return 5;
            }
            if (i == 4) {
                return 1;
            }
        }
        return 2;
    }

    public static final int B(lk10 lk10Var) {
        gk10 gk10Var = lk10Var.d;
        int i = gk10Var == null ? -1 : yj10.a[gk10Var.ordinal()];
        if (i != -1) {
            if (i == 1) {
                return 2;
            }
            if (i == 2) {
                return 3;
            }
            if (i == 3) {
                return 1;
            }
            if (i == 4) {
                return 4;
            }
            if (i != 5) {
                eg.o();
                return 0;
            }
        }
        return 5;
    }

    public static String C(int i) {
        if (i == 1) {
            return "Strategy.Simple";
        }
        if (i == 2) {
            return "Strategy.HighQuality";
        }
        if (i == 3) {
            return "Strategy.Balanced";
        }
        return i == 0 ? "Strategy.Unspecified" : "Invalid";
    }

    public static final int D(lk10 lk10Var) {
        int i = lk10Var.b;
        fk10 fk10Var = lk10Var.c;
        if (i == 1 && fk10Var == fk10.a) {
            return 3;
        }
        if (i == 1 && fk10Var == fk10.b) {
            return 6;
        }
        if (i != 1) {
            if (i == 2) {
                return 4;
            }
            if (i == 3) {
                return 5;
            }
            if (i == 4) {
                return 1;
            }
        }
        return 2;
    }

    /* JADX WARN: Code duplicated, block: B:51:0x008c  */
    /* JADX WARN: Code duplicated, block: B:52:0x008e  */
    /* JADX WARN: Code duplicated, block: B:55:0x0097 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:56:0x0099  */
    /* JADX WARN: Code duplicated, block: B:57:0x009b  */
    /* JADX WARN: Code duplicated, block: B:60:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:62:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:66:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:68:0x0101  */
    /* JADX WARN: Code duplicated, block: B:69:0x0103  */
    /* JADX WARN: Code duplicated, block: B:74:0x010e  */
    /* JADX WARN: Code duplicated, block: B:76:0x0158  */
    /* JADX WARN: Code duplicated, block: B:78:0x0175  */
    /* JADX WARN: Code duplicated, block: B:80:0x017a  */
    /* JADX WARN: Code duplicated, block: B:83:0x0184  */
    /* JADX WARN: Code duplicated, block: B:85:? A[RETURN, SYNTHETIC] */
    public static final void a(j2i j2iVar, j2i j2iVar2, q251 q251Var, iu30 iu30Var, qim0 qim0Var, boolean z, b0k b0kVar, int i, int i2) {
        int i3;
        boolean z2;
        boolean z3;
        boolean z4;
        h311 h311VarV;
        boolean z5;
        mbh mbhVarA;
        int iHashCode;
        xos0 xos0VarM;
        qim0 qim0VarE;
        boolean z6;
        boolean z7;
        Object objT;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-472519229);
        if ((i & 6) == 0) {
            i3 = (x340Var.i(j2iVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= x340Var.i(j2iVar2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= x340Var.i(q251Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= x340Var.i(iu30Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= x340Var.g(qim0Var) ? 16384 : 8192;
        }
        int i4 = i2 & 32;
        if (i4 == 0) {
            if ((196608 & i) == 0) {
                z2 = z;
                i3 |= x340Var.h(z2) ? 131072 : 65536;
            }
            if ((74899 & i3) != 74898) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (x340Var.Y(i3 & 1, z3)) {
                if (i4 != 0) {
                    z5 = true;
                } else {
                    z5 = z2;
                }
                qim0 qim0VarC = u291.c(qim0Var, 1.0f);
                mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
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
                nko1.H(mbhVarA, x340Var, y580.O0);
                nko1.H(xos0VarM, x340Var, y580.N0);
                nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
                nko1.F(x340Var);
                nko1.H(qim0VarE, x340Var, y580.Y);
                j2iVar.invoke(x340Var, Integer.valueOf(i3 & 14));
                if (z5) {
                    x340Var.i0(-1087741296);
                    if ((i3 & 7168) == 2048) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    objT = x340Var.T();
                    if (z7 || objT == fkj0.X) {
                        objT = new c5a(iu30Var, (byte) 27);
                        x340Var.s0(objT);
                    }
                    n251 n251Var = new n251((iu30) objT);
                    uwr uwrVar = cbx.a;
                    cvx cvxVar = cbx.b(x340Var).b;
                    cvx cvxVar2 = cbx.b(x340Var).b;
                    cvx cvxVar3 = cbx.b(x340Var).b;
                    z6 = true;
                    otw.c(q251Var, n251Var, u291.f(uyn1.B(nim0.a, 8.0f, 8.0f, 8.0f, 0.0f, 8), 1.0f), (ipb1) null, x340Var, (i3 >> 6) & 14, 8);
                    x340Var.r(false);
                } else {
                    z6 = true;
                    x340Var.i0(-1087029195);
                    x340Var.r(false);
                }
                j2iVar2.invoke(pbh.a, x340Var, Integer.valueOf((i3 & 112) | 6));
                x340Var.r(z6);
                z4 = z5;
            } else {
                x340Var.b0();
                z4 = z2;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new yc5(j2iVar, j2iVar2, q251Var, iu30Var, qim0Var, z4, i, i2);
            }
        }
        i3 |= 196608;
        z2 = z;
        if ((74899 & i3) != 74898) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (x340Var.Y(i3 & 1, z3)) {
            if (i4 != 0) {
                z5 = true;
            } else {
                z5 = z2;
            }
            qim0 qim0VarC2 = u291.c(qim0Var, 1.0f);
            mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
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
            nko1.H(mbhVarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            j2iVar.invoke(x340Var, Integer.valueOf(i3 & 14));
            if (z5) {
                x340Var.i0(-1087741296);
                if ((i3 & 7168) == 2048) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                objT = x340Var.T();
                if (z7) {
                    objT = new c5a(iu30Var, (byte) 27);
                    x340Var.s0(objT);
                } else {
                    objT = new c5a(iu30Var, (byte) 27);
                    x340Var.s0(objT);
                }
                n251 n251Var2 = new n251((iu30) objT);
                uwr uwrVar2 = cbx.a;
                cvx cvxVar4 = cbx.b(x340Var).b;
                cvx cvxVar5 = cbx.b(x340Var).b;
                cvx cvxVar6 = cbx.b(x340Var).b;
                z6 = true;
                otw.c(q251Var, n251Var2, u291.f(uyn1.B(nim0.a, 8.0f, 8.0f, 8.0f, 0.0f, 8), 1.0f), (ipb1) null, x340Var, (i3 >> 6) & 14, 8);
                x340Var.r(false);
            } else {
                z6 = true;
                x340Var.i0(-1087029195);
                x340Var.r(false);
            }
            j2iVar2.invoke(pbh.a, x340Var, Integer.valueOf((i3 & 112) | 6));
            x340Var.r(z6);
            z4 = z5;
        } else {
            x340Var.b0();
            z4 = z2;
        }
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new yc5(j2iVar, j2iVar2, q251Var, iu30Var, qim0Var, z4, i, i2);
        }
    }

    public static final void b(String str, float f, qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(1619225206);
        int i2 = i | (x340Var2.g(str) ? 4 : 2) | (x340Var2.d(f) ? 32 : 16) | (x340Var2.i(qim0Var) ? 256 : 128);
        if (x340Var2.Y(i2 & 1, (i2 & 147) != 146)) {
            qim0 qim0VarF = u291.f(qim0Var, 1.0f);
            boolean z = (i2 & 112) == 32;
            Object objT = x340Var2.T();
            if (z || objT == fkj0.X) {
                objT = new vbk0((byte) 11, f);
                x340Var2.s0(objT);
            }
            qim0 qim0VarC = i541.C(qim0VarF, (iu30) objT);
            gfh0 gfh0VarC = t1c.c(een.h, false);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0VarC);
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
            uwo1.e(str, uyn1.B(u291.f(nim0.a, 1.0f), 16.0f, 0.0f, 16.0f, 0.0f, 10), cbx.d(x340Var2).h, 0L, new a0e1(3), null, 2, false, new cjc0(1), 0, null, x340Var2, i2 & 14, 0, 1704);
            x340Var = x340Var2;
            x340Var.r(true);
        } else {
            x340Var = x340Var2;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new exs0(str, f, qim0Var, i, (byte) 0);
        }
    }

    public static final void c(String str, if5 if5Var, lax laxVar, boolean z, int i, jsg jsgVar, iu30 iu30Var, qim0 qim0Var, j2i j2iVar, b0k b0kVar, int i2, int i3) {
        int i4;
        int i5;
        b0k b0kVar2;
        boolean z2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-957516009);
        if ((i2 & 6) == 0) {
            i4 = (b0kVar3.g(str) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= (i2 & 64) == 0 ? b0kVar3.g(if5Var) : b0kVar3.i(if5Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= (i2 & 512) == 0 ? b0kVar3.g(laxVar) : b0kVar3.i(laxVar) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= b0kVar3.h(z) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i4 |= b0kVar3.e(i) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i4 |= b0kVar3.g(jsgVar) ? 131072 : 65536;
        }
        if ((i2 & 1572864) == 0) {
            i4 |= b0kVar3.e(11) ? 1048576 : 524288;
        }
        if ((12582912 & i2) == 0) {
            i4 |= b0kVar3.e(0) ? 8388608 : 4194304;
        }
        if ((100663296 & i2) == 0) {
            i4 |= b0kVar3.e(12) ? 67108864 : 33554432;
        }
        if ((805306368 & i2) == 0) {
            i4 |= b0kVar3.i(iu30Var) ? 536870912 : 268435456;
        }
        if ((i3 & 6) == 0) {
            i5 = i3 | (b0kVar3.i(qim0Var) ? 4 : 2);
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= b0kVar3.i(j2iVar) ? 32 : 16;
        }
        if (b0kVar3.Y(i4 & 1, ((i4 & 306783379) == 306783378 && (i5 & 19) == 18) ? false : true)) {
            String strU = cwl1.U(2131820795, i, new Object[]{Integer.valueOf(i)}, b0kVar3);
            String strF = f4i1.f(str, ", ", if5Var.c(b0kVar3));
            Object objT = b0kVar3.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = ktd.n(b0kVar3);
            }
            idn0 idn0Var = (idn0) objT;
            uwr uwrVar = cbx.a;
            cua cuaVar = cbx.b(b0kVar3).f;
            cr31 cr31VarB = er31.b(6.0f);
            max maxVarZ = mmo1.z(laxVar, b0kVar3);
            zzq0 zzq0Var = new zzq0(0.0f, 0.0f, 0.0f, 0.0f);
            qim0 qim0VarF = u291.f(qim0Var, 1.0f);
            cvx cvxVar = cbx.b(b0kVar3).b;
            qim0 qim0VarU = qxy0.u(da80.a(uyn1.z(4.0f, 0.0f, 2, qim0VarF), idn0Var, vno1.o(cr31VarB, b0kVar3, 0)), idn0Var, 1);
            int i6 = i4 & 7168;
            int i7 = 57344 & i4;
            int i8 = 1879048192 & i4;
            boolean z3 = ((29360128 & i4) == 8388608) | (i6 == 2048) | (i7 == 16384) | ((234881024 & i4) == 67108864) | (i8 == 536870912);
            Object objT2 = b0kVar3.T();
            if (z3 || objT2 == m4cVar) {
                z2 = false;
                objT2 = new o9o((byte) 0, i, iu30Var, z);
                b0kVar3.s0(objT2);
            } else {
                z2 = false;
            }
            qim0 qim0VarS = y9g1.s(qim0VarU, (iu30) objT2);
            boolean zG = (i6 == 2048 ? true : z2) | b0kVar3.g(strF) | b0kVar3.g(strU) | (i7 == 16384 ? true : z2) | ((458752 & i4) == 131072 ? true : z2) | ((i4 & 3670016) == 1048576 ? true : z2) | (i8 == 536870912 ? true : z2);
            Object objT3 = b0kVar3.T();
            if (zG || objT3 == m4cVar) {
                yjb yjbVar = new yjb(z, strF, strU, i, jsgVar, iu30Var);
                b0kVar3.s0(yjbVar);
                objT3 = yjbVar;
            }
            b0kVar2 = b0kVar3;
            cwl1.b(s161.a(qim0VarS, (iu30) objT3), (tl3) null, (hw61) null, (pgx) null, zzq0Var, maxVarZ, false, (idn0) null, (ga80) null, (gbx) null, (gbx) null, apo.r(1740589902, new rv71(j2iVar, (byte) 8), b0kVar3), b0kVar2, 0, 48, 1998);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new p9o(str, if5Var, laxVar, z, i, jsgVar, iu30Var, qim0Var, j2iVar, i2, i3);
        }
    }

    public static final void d(int i, boolean z, long j, j2i j2iVar, j2i j2iVar2, j2i j2iVar3, j2i j2iVar4, j2i j2iVar5, qim0 qim0Var, b0k b0kVar, int i2) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1985343340);
        int i3 = i2 | (x340Var.e(i) ? 4 : 2) | (x340Var.e(12) ? 32 : 16) | (x340Var.h(z) ? 256 : 128) | (x340Var.f(j) ? 2048 : 1024) | 805306368;
        if (x340Var.Y(i3 & 1, (306783379 & i3) != 306783378)) {
            x340Var.j0(475845883);
            wat watVar = (wat) x340Var.k(t4k.h);
            x340Var.j0(-492369756);
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = x0d.o(watVar, x340Var);
            }
            x340Var.r(false);
            ufh0 ufh0Var = (ufh0) objT;
            x340Var.j0(-492369756);
            Object objT2 = x340Var.T();
            if (objT2 == m4cVar) {
                objT2 = x0d.m(x340Var);
            }
            x340Var.r(false);
            xhl xhlVar = (xhl) objT2;
            x340Var.j0(-492369756);
            Object objT3 = x340Var.T();
            if (objT3 == m4cVar) {
                objT3 = v8r.q(Boolean.FALSE);
                x340Var.s0(objT3);
            }
            x340Var.r(false);
            ven0 ven0Var = (ven0) objT3;
            x340Var.j0(-492369756);
            Object objT4 = x340Var.T();
            if (objT4 == m4cVar) {
                objT4 = x0d.n(xhlVar, x340Var);
            }
            x340Var.r(false);
            nil nilVar = (nil) objT4;
            x340Var.j0(-492369756);
            Object objT5 = x340Var.T();
            if (objT5 == m4cVar) {
                objT5 = bb00.i(rih1.a, f331.X0, x340Var);
            }
            x340Var.r(false);
            ven0 ven0Var2 = (ven0) objT5;
            ru ruVar = new ru(ven0Var2, ufh0Var, nilVar, ven0Var, (byte) 3);
            su suVar = new su(ven0Var, nilVar, (byte) 3);
            tu tuVar = new tu(ufh0Var, (byte) 3);
            qim0 qim0Var3 = nim0.a;
            who1.h(s161.b(qim0Var3, false, tuVar), apo.i(x340Var, -1488813576, new t9o(ven0Var2, xhlVar, suVar, z, j, i, j2iVar, j2iVar2, j2iVar3, j2iVar5, j2iVar4)), ruVar, x340Var, 48);
            x340Var.r(false);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new s9o(i, z, j, j2iVar, j2iVar2, j2iVar3, j2iVar4, j2iVar5, qim0Var2, i2);
        }
    }

    public static final void e(String str, if5 if5Var, int i, iu30 iu30Var, qim0 qim0Var, lax laxVar, b0k b0kVar, int i2) {
        b0k b0kVar2;
        qim0 qim0Var2;
        qim0 qim0Var3;
        Object v2bVar;
        ven0 ven0Var;
        boolean z;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-495345806);
        int i3 = i2 | (b0kVar3.g(str) ? 4 : 2) | (b0kVar3.i(if5Var) ? 32 : 16) | (b0kVar3.e(i) ? 131072 : 65536) | (b0kVar3.i(iu30Var) ? 1048576 : 524288) | 12582912 | (b0kVar3.g(laxVar) ? 67108864 : 33554432);
        if (b0kVar3.Y(i3 & 1, (38347923 & i3) != 38347922)) {
            b0kVar3.d0();
            if ((i2 & 1) == 0 || b0kVar3.E()) {
                qim0Var3 = nim0.a;
            } else {
                b0kVar3.b0();
                qim0Var3 = qim0Var;
            }
            b0kVar3.s();
            Object objT = b0kVar3.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = bb00.h(i, b0kVar3);
            }
            err0 err0Var = (hdn0) objT;
            Object objT2 = b0kVar3.T();
            if (objT2 == m4cVar) {
                objT2 = v8r.q((Object) null);
                b0kVar3.s0(objT2);
            }
            ven0 ven0Var2 = (ven0) objT2;
            boolean z2 = laxVar instanceof iax;
            jsg jsgVar = new jsg(0.0f, 12.0f);
            Integer numValueOf = Integer.valueOf(i);
            int i4 = i3 & 458752;
            boolean zI = b0kVar3.i(ven0Var2) | (i4 == 131072) | b0kVar3.i(err0Var);
            Object objT3 = b0kVar3.T();
            if (zI || objT3 == m4cVar) {
                ven0Var = ven0Var2;
                z = z2;
                v2bVar = new v2b(i, ven0Var, err0Var, (lnm) null, (byte) 4);
                b0kVar3.s0(v2bVar);
            } else {
                z = z2;
                v2bVar = objT3;
                ven0Var = ven0Var2;
            }
            qxd0.t(numValueOf, b0kVar3, (vu30) v2bVar);
            int iS = err0Var.s();
            boolean zI2 = b0kVar3.i(err0Var) | b0kVar3.i(ven0Var) | (i4 == 131072) | ((3670016 & i3) == 1048576);
            Object objT4 = b0kVar3.T();
            if (zI2 || objT4 == m4cVar) {
                ven0 ven0Var3 = ven0Var;
                fu fuVar = new fu(i, iu30Var, err0Var, ven0Var3, (byte) 6);
                ven0Var = ven0Var3;
                b0kVar3.s0(fuVar);
                objT4 = fuVar;
            }
            boolean z3 = z;
            b0kVar2 = b0kVar3;
            qim0 qim0Var4 = qim0Var3;
            c(str, if5Var, laxVar, z3, iS, jsgVar, (iu30) objT4, qim0Var4, apo.r(-1353842234, new lv1((hdn0) err0Var, if5Var, str, z3, ven0Var, i, iu30Var, jsgVar), b0kVar3), b0kVar2, (i3 & 14) | 64 | (i3 & 112) | ((i3 >> 18) & 896) | 114819072, 54);
            qim0Var2 = qim0Var4;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new hy0(str, if5Var, i, iu30Var, qim0Var2, laxVar, i2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01dd A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:103:0x01df  */
    /* JADX WARN: Code duplicated, block: B:105:0x0200  */
    /* JADX WARN: Code duplicated, block: B:108:0x0225  */
    /* JADX WARN: Code duplicated, block: B:109:0x0229  */
    /* JADX WARN: Code duplicated, block: B:112:0x0248  */
    /* JADX WARN: Code duplicated, block: B:113:0x024b  */
    /* JADX WARN: Code duplicated, block: B:116:0x026a  */
    /* JADX WARN: Code duplicated, block: B:117:0x0271  */
    /* JADX WARN: Code duplicated, block: B:120:0x02bb  */
    /* JADX WARN: Code duplicated, block: B:122:0x02c0  */
    /* JADX WARN: Code duplicated, block: B:125:0x02cb  */
    /* JADX WARN: Code duplicated, block: B:127:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x0065  */
    /* JADX WARN: Code duplicated, block: B:39:0x006a  */
    /* JADX WARN: Code duplicated, block: B:41:0x006e  */
    /* JADX WARN: Code duplicated, block: B:43:0x0076  */
    /* JADX WARN: Code duplicated, block: B:44:0x0079  */
    /* JADX WARN: Code duplicated, block: B:48:0x0087  */
    /* JADX WARN: Code duplicated, block: B:49:0x0089  */
    /* JADX WARN: Code duplicated, block: B:52:0x0092 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:53:0x0094  */
    /* JADX WARN: Code duplicated, block: B:55:0x0097  */
    /* JADX WARN: Code duplicated, block: B:56:0x0099  */
    /* JADX WARN: Code duplicated, block: B:59:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:61:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:62:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:64:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:67:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:69:0x0101  */
    /* JADX WARN: Code duplicated, block: B:70:0x0105  */
    /* JADX WARN: Code duplicated, block: B:73:0x0135  */
    /* JADX WARN: Code duplicated, block: B:75:0x0142  */
    /* JADX WARN: Code duplicated, block: B:76:0x0144  */
    /* JADX WARN: Code duplicated, block: B:79:0x0152  */
    /* JADX WARN: Code duplicated, block: B:80:0x0154  */
    /* JADX WARN: Code duplicated, block: B:83:0x015d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:84:0x015f  */
    /* JADX WARN: Code duplicated, block: B:86:0x0174  */
    /* JADX WARN: Code duplicated, block: B:88:0x0182  */
    /* JADX WARN: Code duplicated, block: B:92:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:93:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:96:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:98:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:99:0x01d6  */
    public static final void f(rj01 rj01Var, boolean z, Function0 function0, br0 br0Var, dey deyVar, b0k b0kVar, int i, int i2) {
        int i3;
        br0 br0Var2;
        int i4;
        dey deyVar2;
        int i5;
        boolean z2;
        br0 br0Var3;
        dey deyVar3;
        h311 h311VarV;
        dey deyVar4;
        boolean zIsEmpty;
        boolean z3;
        float f;
        float f2;
        String strO0;
        mbh mbhVarA;
        int iHashCode;
        xos0 xos0VarM;
        qim0 qim0Var;
        qim0 qim0VarE;
        boolean z4;
        n4k n4kVar;
        Object objT;
        qim0 qim0VarB;
        boolean z5;
        br0 br0Var4;
        dey deyVar5;
        boolean z6;
        qim0 qim0VarX;
        boolean z7;
        boolean z8;
        Object objT2;
        boolean z9;
        boolean z10;
        boolean z11;
        Object objT3;
        int i6;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-133831294);
        j06 j06Var = x340Var.a;
        if ((i & 6) == 0) {
            i3 = (x340Var.g(rj01Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= x340Var.h(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= x340Var.i(function0) ? 256 : 128;
        }
        int i7 = i2 & 8;
        if (i7 == 0) {
            if ((i & 3072) == 0) {
                br0Var2 = br0Var;
                i3 |= x340Var.i(br0Var2) ? 2048 : 1024;
            }
            i4 = i2 & 16;
            if (i4 != 0) {
                if ((i & 24576) == 0) {
                    deyVar2 = deyVar;
                    if (x340Var.g(deyVar2)) {
                        i5 = 16384;
                    } else {
                        i5 = 8192;
                    }
                    i3 |= i5;
                }
                if ((i3 & 9363) != 9362) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (x340Var.Y(i3 & 1, z2)) {
                    if (i7 != 0) {
                        br0Var2 = null;
                    }
                    if (i4 != 0) {
                        deyVar4 = null;
                    } else {
                        deyVar4 = deyVar2;
                    }
                    zIsEmpty = rj01Var.i.isEmpty();
                    z3 = !zIsEmpty;
                    uwr uwrVar = cbx.a;
                    xpv0 xpv0Var = cbx.c(x340Var).c;
                    n8b1 n8b1VarE = xpv0.e();
                    f = n8b1VarE.b;
                    f2 = n8b1VarE.a;
                    if (zIsEmpty) {
                        x340Var.i0(-1237932306);
                        x340Var.r(false);
                        strO0 = null;
                    } else {
                        x340Var.i0(-1238071434);
                        if (z) {
                            i6 = 2131960926;
                        } else {
                            i6 = 2131960927;
                        }
                        strO0 = cwl1.o0(x340Var, i6);
                        x340Var.r(false);
                    }
                    mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
                    iHashCode = Long.hashCode(x340Var.T);
                    xos0VarM = x340Var.m();
                    qim0Var = nim0.a;
                    qim0VarE = zr7.E(x340Var, qim0Var);
                    hzj.A.getClass();
                    if (j06Var != null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var.m0();
                    z4 = x340Var.S;
                    n4kVar = hmb0.t1;
                    if (z4) {
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
                    x340Var.i0(-72569673);
                    if (rj01Var.t.length() > 0) {
                        x340Var.i0(-72537434);
                        if ((i3 & 14) == 4) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        boolean zG = z9 | x340Var.g(strO0);
                        if ((i3 & 896) == 256) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        z11 = zG | z10;
                        objT3 = x340Var.T();
                        if (z11 || objT3 == m4cVar) {
                            objT3 = new ozu0(rj01Var, strO0, function0, (byte) 23);
                            x340Var.s0(objT3);
                        }
                        qim0VarB = s161.a(qim0Var, (iu30) objT3);
                        z5 = false;
                        x340Var.r(false);
                    } else {
                        x340Var.i0(-72248762);
                        objT = x340Var.T();
                        if (objT == m4cVar) {
                            objT = th01.e;
                            x340Var.s0(objT);
                        }
                        qim0VarB = s161.b(qim0Var, true, (iu30) objT);
                        z5 = false;
                        x340Var.r(false);
                    }
                    gra graVar = een.d;
                    gfh0 gfh0VarC = t1c.c(graVar, z5);
                    br0Var4 = br0Var2;
                    deyVar5 = deyVar4;
                    int iHashCode2 = Long.hashCode(x340Var.T);
                    xos0 xos0VarM2 = x340Var.m();
                    qim0 qim0VarE2 = zr7.E(x340Var, qim0VarB);
                    x340Var.m0();
                    if (x340Var.S) {
                        x340Var.l(n4kVar);
                    } else {
                        x340Var.v0();
                    }
                    nko1.H(gfh0VarC, x340Var, lljVar);
                    nko1.H(xos0VarM2, x340Var, lljVar2);
                    x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
                    nko1.H(qim0VarE2, x340Var, lljVar4);
                    if (zIsEmpty) {
                        z6 = false;
                        x340Var.i0(-696709978);
                        x340Var.r(false);
                        qim0VarX = qim0Var;
                    } else {
                        x340Var.i0(-696711108);
                        if ((i3 & 896) == 256) {
                            z8 = true;
                        } else {
                            z8 = false;
                        }
                        objT2 = x340Var.T();
                        if (z8 || objT2 == m4cVar) {
                            objT2 = new lpx0(function0, (byte) 23);
                            x340Var.s0(objT2);
                        }
                        qim0VarX = bin.x(qim0Var, false, null, null, null, (Function0) objT2, 15);
                        z6 = false;
                        x340Var.r(false);
                    }
                    gfh0 gfh0VarC2 = t1c.c(graVar, z6);
                    int iHashCode3 = Long.hashCode(x340Var.T);
                    xos0 xos0VarM3 = x340Var.m();
                    qim0 qim0VarE3 = zr7.E(x340Var, qim0VarX);
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
                    Paragraph paragraph = rj01Var.b;
                    String str = rj01Var.c;
                    int i8 = rj01Var.d;
                    Paragraph paragraph2 = rj01Var.e;
                    Paragraph paragraph3 = rj01Var.f;
                    Paragraph paragraph4 = rj01Var.g;
                    String str2 = rj01Var.h;
                    if (zIsEmpty) {
                        z7 = false;
                    } else {
                        z7 = z;
                    }
                    zj01.d(paragraph, str, i8, paragraph2, paragraph3, paragraph4, str2, z3, z7, x340Var, 0);
                    x340Var.r(true);
                    x340Var.r(true);
                    if (zIsEmpty) {
                        x340Var.r(false);
                        deyVar2 = deyVar5;
                    } else {
                        bby bbyVarD = xay.d(irn1.l0(f2, f, null, 4), een.Z, 12);
                        ln00 ln00VarL = xay.l(12, irn1.l0(f2, f, null, 4));
                        deyVar2 = deyVar5;
                        fq7.b(pbh.a, z, (qim0) null, bbyVarD, ln00VarL, (String) null, apo.r(-755198384, new hho0(br0Var4, deyVar2, rj01Var, (byte) 17), x340Var), x340Var, (i3 & 112) | 1572870, 18);
                        x340Var.r(false);
                    }
                    x340Var.r(true);
                    br0Var3 = br0Var4;
                } else {
                    x340Var.b0();
                    br0Var3 = br0Var2;
                }
                deyVar3 = deyVar2;
                h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new oia(rj01Var, z, function0, br0Var3, deyVar3, i, i2, (byte) 10);
                }
            }
            i3 |= 24576;
            deyVar2 = deyVar;
            if ((i3 & 9363) != 9362) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (x340Var.Y(i3 & 1, z2)) {
                if (i7 != 0) {
                    br0Var2 = null;
                }
                if (i4 != 0) {
                    deyVar4 = null;
                } else {
                    deyVar4 = deyVar2;
                }
                zIsEmpty = rj01Var.i.isEmpty();
                z3 = !zIsEmpty;
                uwr uwrVar2 = cbx.a;
                xpv0 xpv0Var2 = cbx.c(x340Var).c;
                n8b1 n8b1VarE2 = xpv0.e();
                f = n8b1VarE2.b;
                f2 = n8b1VarE2.a;
                if (zIsEmpty) {
                    x340Var.i0(-1238071434);
                    if (z) {
                        i6 = 2131960926;
                    } else {
                        i6 = 2131960927;
                    }
                    strO0 = cwl1.o0(x340Var, i6);
                    x340Var.r(false);
                } else {
                    x340Var.i0(-1237932306);
                    x340Var.r(false);
                    strO0 = null;
                }
                mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
                iHashCode = Long.hashCode(x340Var.T);
                xos0VarM = x340Var.m();
                qim0Var = nim0.a;
                qim0VarE = zr7.E(x340Var, qim0Var);
                hzj.A.getClass();
                if (j06Var != null) {
                    tgp1.p();
                    throw null;
                }
                x340Var.m0();
                z4 = x340Var.S;
                n4kVar = hmb0.t1;
                if (z4) {
                    x340Var.l(n4kVar);
                } else {
                    x340Var.v0();
                }
                llj lljVar5 = y580.O0;
                nko1.H(mbhVarA, x340Var, lljVar5);
                llj lljVar6 = y580.N0;
                nko1.H(xos0VarM, x340Var, lljVar6);
                Integer numValueOf2 = Integer.valueOf(iHashCode);
                llj lljVar7 = y580.R0;
                nko1.H(numValueOf2, x340Var, lljVar7);
                nko1.F(x340Var);
                llj lljVar8 = y580.Y;
                nko1.H(qim0VarE, x340Var, lljVar8);
                x340Var.i0(-72569673);
                if (rj01Var.t.length() > 0) {
                    x340Var.i0(-72537434);
                    if ((i3 & 14) == 4) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    boolean zG2 = z9 | x340Var.g(strO0);
                    if ((i3 & 896) == 256) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    z11 = zG2 | z10;
                    objT3 = x340Var.T();
                    if (z11) {
                        objT3 = new ozu0(rj01Var, strO0, function0, (byte) 23);
                        x340Var.s0(objT3);
                    } else {
                        objT3 = new ozu0(rj01Var, strO0, function0, (byte) 23);
                        x340Var.s0(objT3);
                    }
                    qim0VarB = s161.a(qim0Var, (iu30) objT3);
                    z5 = false;
                    x340Var.r(false);
                } else {
                    x340Var.i0(-72248762);
                    objT = x340Var.T();
                    if (objT == m4cVar) {
                        objT = th01.e;
                        x340Var.s0(objT);
                    }
                    qim0VarB = s161.b(qim0Var, true, (iu30) objT);
                    z5 = false;
                    x340Var.r(false);
                }
                gra graVar2 = een.d;
                gfh0 gfh0VarC3 = t1c.c(graVar2, z5);
                br0Var4 = br0Var2;
                deyVar5 = deyVar4;
                int iHashCode4 = Long.hashCode(x340Var.T);
                xos0 xos0VarM4 = x340Var.m();
                qim0 qim0VarE4 = zr7.E(x340Var, qim0VarB);
                x340Var.m0();
                if (x340Var.S) {
                    x340Var.l(n4kVar);
                } else {
                    x340Var.v0();
                }
                nko1.H(gfh0VarC3, x340Var, lljVar5);
                nko1.H(xos0VarM4, x340Var, lljVar6);
                x0d.q(iHashCode4, x340Var, lljVar7, x340Var);
                nko1.H(qim0VarE4, x340Var, lljVar8);
                if (zIsEmpty) {
                    x340Var.i0(-696711108);
                    if ((i3 & 896) == 256) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    objT2 = x340Var.T();
                    if (z8) {
                        objT2 = new lpx0(function0, (byte) 23);
                        x340Var.s0(objT2);
                    } else {
                        objT2 = new lpx0(function0, (byte) 23);
                        x340Var.s0(objT2);
                    }
                    qim0VarX = bin.x(qim0Var, false, null, null, null, (Function0) objT2, 15);
                    z6 = false;
                    x340Var.r(false);
                } else {
                    z6 = false;
                    x340Var.i0(-696709978);
                    x340Var.r(false);
                    qim0VarX = qim0Var;
                }
                gfh0 gfh0VarC4 = t1c.c(graVar2, z6);
                int iHashCode5 = Long.hashCode(x340Var.T);
                xos0 xos0VarM5 = x340Var.m();
                qim0 qim0VarE5 = zr7.E(x340Var, qim0VarX);
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
                Paragraph paragraph5 = rj01Var.b;
                String str3 = rj01Var.c;
                int i9 = rj01Var.d;
                Paragraph paragraph6 = rj01Var.e;
                Paragraph paragraph7 = rj01Var.f;
                Paragraph paragraph8 = rj01Var.g;
                String str4 = rj01Var.h;
                if (zIsEmpty) {
                    z7 = z;
                } else {
                    z7 = false;
                }
                zj01.d(paragraph5, str3, i9, paragraph6, paragraph7, paragraph8, str4, z3, z7, x340Var, 0);
                x340Var.r(true);
                x340Var.r(true);
                if (zIsEmpty) {
                    x340Var.r(false);
                    deyVar2 = deyVar5;
                } else {
                    bby bbyVarD2 = xay.d(irn1.l0(f2, f, null, 4), een.Z, 12);
                    ln00 ln00VarL2 = xay.l(12, irn1.l0(f2, f, null, 4));
                    deyVar2 = deyVar5;
                    fq7.b(pbh.a, z, (qim0) null, bbyVarD2, ln00VarL2, (String) null, apo.r(-755198384, new hho0(br0Var4, deyVar2, rj01Var, (byte) 17), x340Var), x340Var, (i3 & 112) | 1572870, 18);
                    x340Var.r(false);
                }
                x340Var.r(true);
                br0Var3 = br0Var4;
            } else {
                x340Var.b0();
                br0Var3 = br0Var2;
            }
            deyVar3 = deyVar2;
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new oia(rj01Var, z, function0, br0Var3, deyVar3, i, i2, (byte) 10);
            }
        }
        i3 |= 3072;
        br0Var2 = br0Var;
        i4 = i2 & 16;
        if (i4 != 0) {
            if ((i & 24576) == 0) {
                deyVar2 = deyVar;
                if (x340Var.g(deyVar2)) {
                    i5 = 16384;
                } else {
                    i5 = 8192;
                }
                i3 |= i5;
            }
            if ((i3 & 9363) != 9362) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (x340Var.Y(i3 & 1, z2)) {
                if (i7 != 0) {
                    br0Var2 = null;
                }
                if (i4 != 0) {
                    deyVar4 = null;
                } else {
                    deyVar4 = deyVar2;
                }
                zIsEmpty = rj01Var.i.isEmpty();
                z3 = !zIsEmpty;
                uwr uwrVar3 = cbx.a;
                xpv0 xpv0Var3 = cbx.c(x340Var).c;
                n8b1 n8b1VarE3 = xpv0.e();
                f = n8b1VarE3.b;
                f2 = n8b1VarE3.a;
                if (zIsEmpty) {
                    x340Var.i0(-1238071434);
                    if (z) {
                        i6 = 2131960926;
                    } else {
                        i6 = 2131960927;
                    }
                    strO0 = cwl1.o0(x340Var, i6);
                    x340Var.r(false);
                } else {
                    x340Var.i0(-1237932306);
                    x340Var.r(false);
                    strO0 = null;
                }
                mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
                iHashCode = Long.hashCode(x340Var.T);
                xos0VarM = x340Var.m();
                qim0Var = nim0.a;
                qim0VarE = zr7.E(x340Var, qim0Var);
                hzj.A.getClass();
                if (j06Var != null) {
                    tgp1.p();
                    throw null;
                }
                x340Var.m0();
                z4 = x340Var.S;
                n4kVar = hmb0.t1;
                if (z4) {
                    x340Var.l(n4kVar);
                } else {
                    x340Var.v0();
                }
                llj lljVar9 = y580.O0;
                nko1.H(mbhVarA, x340Var, lljVar9);
                llj lljVar10 = y580.N0;
                nko1.H(xos0VarM, x340Var, lljVar10);
                Integer numValueOf3 = Integer.valueOf(iHashCode);
                llj lljVar11 = y580.R0;
                nko1.H(numValueOf3, x340Var, lljVar11);
                nko1.F(x340Var);
                llj lljVar12 = y580.Y;
                nko1.H(qim0VarE, x340Var, lljVar12);
                x340Var.i0(-72569673);
                if (rj01Var.t.length() > 0) {
                    x340Var.i0(-72537434);
                    if ((i3 & 14) == 4) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    boolean zG3 = z9 | x340Var.g(strO0);
                    if ((i3 & 896) == 256) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    z11 = zG3 | z10;
                    objT3 = x340Var.T();
                    if (z11) {
                        objT3 = new ozu0(rj01Var, strO0, function0, (byte) 23);
                        x340Var.s0(objT3);
                    } else {
                        objT3 = new ozu0(rj01Var, strO0, function0, (byte) 23);
                        x340Var.s0(objT3);
                    }
                    qim0VarB = s161.a(qim0Var, (iu30) objT3);
                    z5 = false;
                    x340Var.r(false);
                } else {
                    x340Var.i0(-72248762);
                    objT = x340Var.T();
                    if (objT == m4cVar) {
                        objT = th01.e;
                        x340Var.s0(objT);
                    }
                    qim0VarB = s161.b(qim0Var, true, (iu30) objT);
                    z5 = false;
                    x340Var.r(false);
                }
                gra graVar3 = een.d;
                gfh0 gfh0VarC5 = t1c.c(graVar3, z5);
                br0Var4 = br0Var2;
                deyVar5 = deyVar4;
                int iHashCode6 = Long.hashCode(x340Var.T);
                xos0 xos0VarM6 = x340Var.m();
                qim0 qim0VarE6 = zr7.E(x340Var, qim0VarB);
                x340Var.m0();
                if (x340Var.S) {
                    x340Var.l(n4kVar);
                } else {
                    x340Var.v0();
                }
                nko1.H(gfh0VarC5, x340Var, lljVar9);
                nko1.H(xos0VarM6, x340Var, lljVar10);
                x0d.q(iHashCode6, x340Var, lljVar11, x340Var);
                nko1.H(qim0VarE6, x340Var, lljVar12);
                if (zIsEmpty) {
                    x340Var.i0(-696711108);
                    if ((i3 & 896) == 256) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    objT2 = x340Var.T();
                    if (z8) {
                        objT2 = new lpx0(function0, (byte) 23);
                        x340Var.s0(objT2);
                    } else {
                        objT2 = new lpx0(function0, (byte) 23);
                        x340Var.s0(objT2);
                    }
                    qim0VarX = bin.x(qim0Var, false, null, null, null, (Function0) objT2, 15);
                    z6 = false;
                    x340Var.r(false);
                } else {
                    z6 = false;
                    x340Var.i0(-696709978);
                    x340Var.r(false);
                    qim0VarX = qim0Var;
                }
                gfh0 gfh0VarC6 = t1c.c(graVar3, z6);
                int iHashCode7 = Long.hashCode(x340Var.T);
                xos0 xos0VarM7 = x340Var.m();
                qim0 qim0VarE7 = zr7.E(x340Var, qim0VarX);
                x340Var.m0();
                if (x340Var.S) {
                    x340Var.l(n4kVar);
                } else {
                    x340Var.v0();
                }
                nko1.H(gfh0VarC6, x340Var, lljVar9);
                nko1.H(xos0VarM7, x340Var, lljVar10);
                x0d.q(iHashCode7, x340Var, lljVar11, x340Var);
                nko1.H(qim0VarE7, x340Var, lljVar12);
                Paragraph paragraph9 = rj01Var.b;
                String str5 = rj01Var.c;
                int i10 = rj01Var.d;
                Paragraph paragraph10 = rj01Var.e;
                Paragraph paragraph11 = rj01Var.f;
                Paragraph paragraph12 = rj01Var.g;
                String str6 = rj01Var.h;
                if (zIsEmpty) {
                    z7 = z;
                } else {
                    z7 = false;
                }
                zj01.d(paragraph9, str5, i10, paragraph10, paragraph11, paragraph12, str6, z3, z7, x340Var, 0);
                x340Var.r(true);
                x340Var.r(true);
                if (zIsEmpty) {
                    x340Var.r(false);
                    deyVar2 = deyVar5;
                } else {
                    bby bbyVarD3 = xay.d(irn1.l0(f2, f, null, 4), een.Z, 12);
                    ln00 ln00VarL3 = xay.l(12, irn1.l0(f2, f, null, 4));
                    deyVar2 = deyVar5;
                    fq7.b(pbh.a, z, (qim0) null, bbyVarD3, ln00VarL3, (String) null, apo.r(-755198384, new hho0(br0Var4, deyVar2, rj01Var, (byte) 17), x340Var), x340Var, (i3 & 112) | 1572870, 18);
                    x340Var.r(false);
                }
                x340Var.r(true);
                br0Var3 = br0Var4;
            } else {
                x340Var.b0();
                br0Var3 = br0Var2;
            }
            deyVar3 = deyVar2;
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new oia(rj01Var, z, function0, br0Var3, deyVar3, i, i2, (byte) 10);
            }
        }
        i3 |= 24576;
        deyVar2 = deyVar;
        if ((i3 & 9363) != 9362) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (x340Var.Y(i3 & 1, z2)) {
            if (i7 != 0) {
                br0Var2 = null;
            }
            if (i4 != 0) {
                deyVar4 = null;
            } else {
                deyVar4 = deyVar2;
            }
            zIsEmpty = rj01Var.i.isEmpty();
            z3 = !zIsEmpty;
            uwr uwrVar4 = cbx.a;
            xpv0 xpv0Var4 = cbx.c(x340Var).c;
            n8b1 n8b1VarE4 = xpv0.e();
            f = n8b1VarE4.b;
            f2 = n8b1VarE4.a;
            if (zIsEmpty) {
                x340Var.i0(-1238071434);
                if (z) {
                    i6 = 2131960926;
                } else {
                    i6 = 2131960927;
                }
                strO0 = cwl1.o0(x340Var, i6);
                x340Var.r(false);
            } else {
                x340Var.i0(-1237932306);
                x340Var.r(false);
                strO0 = null;
            }
            mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
            iHashCode = Long.hashCode(x340Var.T);
            xos0VarM = x340Var.m();
            qim0Var = nim0.a;
            qim0VarE = zr7.E(x340Var, qim0Var);
            hzj.A.getClass();
            if (j06Var != null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            z4 = x340Var.S;
            n4kVar = hmb0.t1;
            if (z4) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            llj lljVar13 = y580.O0;
            nko1.H(mbhVarA, x340Var, lljVar13);
            llj lljVar14 = y580.N0;
            nko1.H(xos0VarM, x340Var, lljVar14);
            Integer numValueOf4 = Integer.valueOf(iHashCode);
            llj lljVar15 = y580.R0;
            nko1.H(numValueOf4, x340Var, lljVar15);
            nko1.F(x340Var);
            llj lljVar16 = y580.Y;
            nko1.H(qim0VarE, x340Var, lljVar16);
            x340Var.i0(-72569673);
            if (rj01Var.t.length() > 0) {
                x340Var.i0(-72537434);
                if ((i3 & 14) == 4) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                boolean zG4 = z9 | x340Var.g(strO0);
                if ((i3 & 896) == 256) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                z11 = zG4 | z10;
                objT3 = x340Var.T();
                if (z11) {
                    objT3 = new ozu0(rj01Var, strO0, function0, (byte) 23);
                    x340Var.s0(objT3);
                } else {
                    objT3 = new ozu0(rj01Var, strO0, function0, (byte) 23);
                    x340Var.s0(objT3);
                }
                qim0VarB = s161.a(qim0Var, (iu30) objT3);
                z5 = false;
                x340Var.r(false);
            } else {
                x340Var.i0(-72248762);
                objT = x340Var.T();
                if (objT == m4cVar) {
                    objT = th01.e;
                    x340Var.s0(objT);
                }
                qim0VarB = s161.b(qim0Var, true, (iu30) objT);
                z5 = false;
                x340Var.r(false);
            }
            gra graVar4 = een.d;
            gfh0 gfh0VarC7 = t1c.c(graVar4, z5);
            br0Var4 = br0Var2;
            deyVar5 = deyVar4;
            int iHashCode8 = Long.hashCode(x340Var.T);
            xos0 xos0VarM8 = x340Var.m();
            qim0 qim0VarE8 = zr7.E(x340Var, qim0VarB);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(gfh0VarC7, x340Var, lljVar13);
            nko1.H(xos0VarM8, x340Var, lljVar14);
            x0d.q(iHashCode8, x340Var, lljVar15, x340Var);
            nko1.H(qim0VarE8, x340Var, lljVar16);
            if (zIsEmpty) {
                x340Var.i0(-696711108);
                if ((i3 & 896) == 256) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                objT2 = x340Var.T();
                if (z8) {
                    objT2 = new lpx0(function0, (byte) 23);
                    x340Var.s0(objT2);
                } else {
                    objT2 = new lpx0(function0, (byte) 23);
                    x340Var.s0(objT2);
                }
                qim0VarX = bin.x(qim0Var, false, null, null, null, (Function0) objT2, 15);
                z6 = false;
                x340Var.r(false);
            } else {
                z6 = false;
                x340Var.i0(-696709978);
                x340Var.r(false);
                qim0VarX = qim0Var;
            }
            gfh0 gfh0VarC8 = t1c.c(graVar4, z6);
            int iHashCode9 = Long.hashCode(x340Var.T);
            xos0 xos0VarM9 = x340Var.m();
            qim0 qim0VarE9 = zr7.E(x340Var, qim0VarX);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(gfh0VarC8, x340Var, lljVar13);
            nko1.H(xos0VarM9, x340Var, lljVar14);
            x0d.q(iHashCode9, x340Var, lljVar15, x340Var);
            nko1.H(qim0VarE9, x340Var, lljVar16);
            Paragraph paragraph13 = rj01Var.b;
            String str7 = rj01Var.c;
            int i11 = rj01Var.d;
            Paragraph paragraph14 = rj01Var.e;
            Paragraph paragraph15 = rj01Var.f;
            Paragraph paragraph16 = rj01Var.g;
            String str8 = rj01Var.h;
            if (zIsEmpty) {
                z7 = z;
            } else {
                z7 = false;
            }
            zj01.d(paragraph13, str7, i11, paragraph14, paragraph15, paragraph16, str8, z3, z7, x340Var, 0);
            x340Var.r(true);
            x340Var.r(true);
            if (zIsEmpty) {
                x340Var.r(false);
                deyVar2 = deyVar5;
            } else {
                bby bbyVarD4 = xay.d(irn1.l0(f2, f, null, 4), een.Z, 12);
                ln00 ln00VarL4 = xay.l(12, irn1.l0(f2, f, null, 4));
                deyVar2 = deyVar5;
                fq7.b(pbh.a, z, (qim0) null, bbyVarD4, ln00VarL4, (String) null, apo.r(-755198384, new hho0(br0Var4, deyVar2, rj01Var, (byte) 17), x340Var), x340Var, (i3 & 112) | 1572870, 18);
                x340Var.r(false);
            }
            x340Var.r(true);
            br0Var3 = br0Var4;
        } else {
            x340Var.b0();
            br0Var3 = br0Var2;
        }
        deyVar3 = deyVar2;
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new oia(rj01Var, z, function0, br0Var3, deyVar3, i, i2, (byte) 10);
        }
    }

    public static final void g(String str, float f, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(726926023);
        int i2 = i | (x340Var.g(str) ? 4 : 2) | (x340Var.d(f) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = bb00.h(0, x340Var);
            }
            err0 err0Var = (hdn0) objT;
            float fS = err0Var.s() * f * 0.5f;
            float f2 = f < 0.5f ? 1.0f : 1.0f - ((f - 0.5f) / 0.5f);
            nim0 nim0Var = nim0.a;
            qim0 qim0VarB = u291.b(0.0f, 56.0f, 1, uyn1.A(u291.f(nim0Var, 1.0f), 16.0f, 16.0f, 16.0f, 8.0f));
            boolean zI = x340Var.i(err0Var);
            Object objT2 = x340Var.T();
            if (zI || objT2 == m4cVar) {
                objT2 = new myg0(err0Var, (byte) 15);
                x340Var.s0(objT2);
            }
            qim0 qim0VarU = lrn1.u(qim0VarB, (iu30) objT2);
            gfh0 gfh0VarC = t1c.c(een.t, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarU);
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
            uwr uwrVar = cbx.a;
            lee1 lee1Var = cbx.d(x340Var).c;
            Object objT3 = x340Var.T();
            if (objT3 == m4cVar) {
                objT3 = egs0.Q0;
                x340Var.s0(objT3);
            }
            qim0 qim0VarB2 = s161.b(nim0Var, false, (iu30) objT3);
            boolean zD = x340Var.d(fS) | x340Var.d(f2);
            Object objT4 = x340Var.T();
            if (zD || objT4 == m4cVar) {
                objT4 = new e8(fS, f2, (byte) 10);
                x340Var.s0(objT4);
            }
            uwo1.e(str, i541.C(qim0VarB2, (iu30) objT4), lee1Var, 0L, null, null, 0, false, null, 0, null, x340Var, i2 & 14, 0, 2040);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new fxs0(str, f, i, (byte) 0);
        }
    }

    public static final void h(vws0 vws0Var, iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(2028892320);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(vws0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        byte b = 1;
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            Object objT = x340Var.T();
            if (objT == fkj0.X) {
                objT = new xvs0(new azr0(iu30Var, (byte) 6), new k2g0(iu30Var, (byte) 29), new g0s0(iu30Var, (byte) 17));
                x340Var.s0(objT);
            }
            otw.c((xvs0) objT, new wvs0(vws0Var.d, vws0Var.c), (qim0) null, (ipb1) null, x340Var, 0, 12);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new yvs0(vws0Var, iu30Var, i, b);
        }
    }

    public static final void i(vws0 vws0Var, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        qim0 qim0Var2;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1398255371);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(vws0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if (x340Var.Y(i3 & 1, (i3 & 147) != 146)) {
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarF = u291.f(qim0Var3, 1.0f);
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
            if (vws0Var.a) {
                x340Var.i0(-858566384);
                String str = vws0Var.b;
                int i4 = i3 & 112;
                boolean z = i4 == 32;
                Object objT = x340Var.T();
                if (z || objT == m4cVar) {
                    objT = new g0s0(iu30Var, (byte) 18);
                    x340Var.s0(objT);
                }
                Function0 function0 = (Function0) objT;
                boolean z2 = i4 == 32;
                Object objT2 = x340Var.T();
                if (z2 || objT2 == m4cVar) {
                    objT2 = new g0s0(iu30Var, (byte) 19);
                    x340Var.s0(objT2);
                }
                l(str, function0, (Function0) objT2, x340Var, 0);
                x340Var.r(false);
            } else {
                x340Var.i0(-858313641);
                x340Var.r(false);
            }
            if (vws0Var.c.isEmpty()) {
                x340Var.i0(-858202537);
                x340Var.r(false);
            } else {
                x340Var.i0(-858276534);
                h(vws0Var, iu30Var, x340Var, i3 & 126);
                x340Var.r(false);
            }
            x340Var.r(true);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new jmk0(vws0Var, iu30Var, qim0Var2, i, (byte) 20);
        }
    }

    public static final void j(bxs0 bxs0Var, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        qim0 qim0Var2;
        float f = bxs0Var.f;
        String str = bxs0Var.a;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1648596217);
        byte b = 2;
        if ((i & 6) == 0) {
            i2 = (x340Var.i(bxs0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if (x340Var.Y(i3 & 1, (i3 & 19) != 18)) {
            WeakHashMap weakHashMap = osl1.x;
            float fD = poo1.x(lhc.g(x340Var).f, x340Var).d();
            qim0Var2 = nim0.a;
            qim0 qim0VarB = uyn1.B(u291.f(qim0Var2, 1.0f), 0.0f, fD, 0.0f, 0.0f, 13);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarB);
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
            g(str, f, x340Var, 0);
            b(str, f, u291.h(h2c.a.a(qim0Var2, een.t), 56.0f), x340Var, 0);
            x340Var.r(true);
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new yvs0(bxs0Var, qim0Var2, i, b);
        }
    }

    public static final void k(wj01 wj01Var, Function0 function0, boolean z, b0k b0kVar, int i, int i2) {
        int i3;
        Function0 function1;
        boolean z2;
        boolean z3;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(534224336);
        int i4 = (x340Var.g(wj01Var) ? 4 : 2) | i;
        int i5 = i4 | 432;
        int i6 = i2 & 8;
        if (i6 != 0) {
            i3 = i4 | 3504;
        } else {
            i3 = (x340Var.h(z) ? 2048 : 1024) | i5;
        }
        if (x340Var.Y(i3 & 1, (i3 & 1171) != 1170)) {
            Object objT = x340Var.T();
            if (objT == fkj0.X) {
                objT = ijz0.Z;
                x340Var.s0(objT);
            }
            Function0 function2 = (Function0) objT;
            boolean z4 = i6 != 0 ? false : z;
            if (wj01Var instanceof vj01) {
                x340Var.i0(-2071406023);
                vj01 vj01Var = (vj01) wj01Var;
                if (vj01Var.c != null) {
                    x340Var.i0(-2071367707);
                    zj01.a(vj01Var.b, vj01Var.c, z4, null, x340Var, (i3 >> 3) & 896, 8);
                    z3 = z4;
                    x340Var.r(false);
                } else {
                    z3 = z4;
                    x340Var.i0(-2071192867);
                    zj01.g(vj01Var.b, z3, x340Var, (i3 >> 6) & 112);
                    x340Var.r(false);
                }
                x340Var.r(false);
            } else {
                z3 = z4;
                if (wj01Var instanceof qj01) {
                    x340Var.i0(-2006471573);
                    qj01 qj01Var = (qj01) wj01Var;
                    zj01.c(qj01Var.c, 0, qj01Var.b, x340Var);
                    x340Var.r(false);
                } else if (wj01Var instanceof uj01) {
                    x340Var.i0(-2006467144);
                    zj01.f(((uj01) wj01Var).b, x340Var, 0);
                    x340Var.r(false);
                } else {
                    if (wj01Var instanceof tj01) {
                        x340Var.i0(-2006464684);
                        tj01 tj01Var = (tj01) wj01Var;
                        zj01.e(tj01Var.b, tj01Var.c, tj01Var.d, x340Var, 0);
                        x340Var.r(false);
                    } else {
                        if (!(wj01Var instanceof rj01)) {
                            throw p3d1.k(x340Var, -2006482682, false);
                        }
                        x340Var.i0(-2006458475);
                        function1 = function2;
                        f((rj01) wj01Var, false, function1, null, null, x340Var, i3 & 1022, 24);
                        x340Var = x340Var;
                        x340Var.r(false);
                    }
                    z2 = z3;
                }
            }
            function1 = function2;
            z2 = z3;
        } else {
            x340Var.b0();
            function1 = function0;
            z2 = z;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new rkk0(wj01Var, function1, z2, i, i2);
        }
    }

    public static final void l(String str, Function0 function0, Function0 function1, b0k b0kVar, int i) {
        Object obj = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1590557547);
        int i2 = i | (x340Var.g(str) ? 4 : 2) | (x340Var.i(function0) ? 32 : 16) | (x340Var.i(function1) ? 256 : 128);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            View view = (View) x340Var.k(AndroidCompositionLocals_androidKt.f);
            boolean zG = x340Var.g(view);
            Object objT = x340Var.T();
            if (zG || objT == obj) {
                objT = new nxs0(view);
                x340Var.s0(objT);
            }
            nxs0 nxs0Var = (nxs0) objT;
            nim0 nim0Var = nim0.a;
            qim0 qim0VarQ = i1p1.q(uyn1.x(u291.h(uyn1.B(u291.f(nim0Var, 1.0f), 8.0f, 0.0f, 8.0f, 8.0f, 2), 56.0f), 8.0f), er31.b(4.0f));
            uwr uwrVar = cbx.a;
            zsc zscVar = zex.a;
            vex vexVar = (vex) zscVar.b;
            yex yexVar = (yex) zscVar.d;
            qim0 qim0VarF = dug.f(qim0VarQ, vexVar.b, d4o1.a);
            boolean zI = x340Var.i(nxs0Var);
            Object objT2 = x340Var.T();
            if (zI || objT2 == obj) {
                objT2 = new fgs0(nxs0Var, (byte) 4);
                x340Var.s0(objT2);
            }
            qim0 qim0VarQ2 = d9y0.q(qim0VarF, (iu30) objT2);
            boolean zI2 = x340Var.i(nxs0Var);
            Object objT3 = x340Var.T();
            if (zI2 || objT3 == obj) {
                objT3 = new wao0(1, nxs0Var, nxs0.class, "onPreviewKeyEvent", "onPreviewKeyEvent-ZmokQxo(Landroid/view/KeyEvent;)Z", 0, (byte) 22);
                x340Var.s0(objT3);
            }
            qim0 qim0VarT = y9g1.t(qim0VarQ2, (iu30) objT3);
            boolean z = (i2 & 896) == 256;
            Object objT4 = x340Var.T();
            if (z || objT4 == obj) {
                objT4 = new hii0(function1, (byte) 9);
                x340Var.s0(objT4);
            }
            qim0 qim0VarN = anm1.N("allboarding_picker_search_bar", bin.x(py20.a(cev0.G(qim0VarT, (iu30) objT4), 0L, er31.b(4.0f), x340Var, 0, 13), false, null, new pm31(0), null, function0, 11));
            jw31 jw31VarA = ew31.a(h36.a, een.N0, x340Var, 0);
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
            w0h1.a(esx.c, isl.a, uyn1.B(nim0Var, 8.0f, 0.0f, 0.0f, 0.0f, 14), yexVar.a, 0L, false, x340Var, esx.d | 48, 48);
            uwo1.e(str, uyn1.B(nim0Var, 8.0f, 0.0f, 0.0f, 0.0f, 14), cbx.d(x340Var).k, yexVar.a, null, null, 2, false, new cjc0(1), 0, null, x340Var, i2 & 14, 0, 1712);
            x340Var = x340Var;
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new bb(str, function0, function1, i, (byte) 6);
        }
    }

    public static final void m(int i, int i2, b0k b0kVar, qim0 qim0Var) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(461289098);
        int i3 = (x340Var.e(i) ? 4 : 2) | i2 | 48;
        if (x340Var.Y(i3 & 1, (i3 & 19) != 18)) {
            String strN0 = cwl1.n0(2131959833, new Object[]{Integer.valueOf(i)}, x340Var);
            uwr uwrVar = cbx.a;
            lee1 lee1Var = cbx.d(x340Var).j;
            long j = cbx.a(x340Var).b.b;
            qim0Var2 = nim0.a;
            uwo1.e(strN0, qim0Var2, lee1Var, j, null, null, 0, false, null, 0, null, x340Var, 48, 0, 2032);
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new u9o(i, qim0Var2, i2);
        }
    }

    public static final void n(int i, int i2, b0k b0kVar, qim0 qim0Var) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1821824017);
        int i3 = (x340Var.e(i) ? 4 : 2) | i2 | 48;
        if (x340Var.Y(i3 & 1, (i3 & 19) != 18)) {
            uwr uwrVar = cbx.a;
            cua cuaVar = cbx.b(x340Var).f;
            cr31 cr31VarB = er31.b(2.0f);
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarF = dug.f(i1p1.q(qim0Var3, cr31VarB), cbx.a(x340Var).a.a.a(), d4o1.a);
            gfh0 gfh0VarC = t1c.c(een.d, false);
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
            nko1.H(gfh0VarC, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            String strN0 = cwl1.n0(2131959833, new Object[]{Integer.valueOf(i)}, x340Var);
            lee1 lee1Var = cbx.d(x340Var).h;
            long j = cbx.a(x340Var).b.a;
            cvx cvxVar = cbx.b(x340Var).b;
            cvx cvxVar2 = cbx.b(x340Var).b;
            uwo1.e(strN0, uyn1.y(qim0Var3, 8.0f, 4.0f), lee1Var, j, null, null, 0, false, null, 0, null, x340Var, 0, 0, 2032);
            x340Var.r(true);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new mq2((byte) 7, i, i2, qim0Var2);
        }
    }

    public static void o(t28 t28Var, cp5 cp5Var) {
        if (t28Var != null) {
            Logger.g("Registering audio routing listener.", new Object[0]);
            t28Var.l(cp5Var);
        }
    }

    public static swx p(long j, long j2, long j3, b0k b0kVar, int i) {
        long j4;
        if ((i & 1) != 0) {
            uwr uwrVar = cbx.a;
            j4 = cbx.a(b0kVar).b.a;
        } else {
            j4 = j;
        }
        uwr uwrVar2 = cbx.a;
        return new swx(j4, cbx.a(b0kVar).c.b, (i & 4) != 0 ? cbx.a(b0kVar).c.c : j2, u7h.b(cbx.a(b0kVar).c.c, 0.3f, 0.0f, 0.0f, 0.0f, 14), (i & 16) != 0 ? cbx.a(b0kVar).a.b.a() : j3, u7h.b(cbx.a(b0kVar).a.b.a(), 0.3f, 0.0f, 0.0f, 0.0f, 14), u7h.b(u7h.f, 0.3f, 0.0f, 0.0f, 0.0f, 14), cbx.a(b0kVar).a.c);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.facebook.FacebookException */
    public static xd q(JSONObject jSONObject) throws JSONException, FacebookException {
        if (jSONObject.getInt("version") > 1) {
            throw new FacebookException("Unknown AccessToken serialization format.");
        }
        String string = jSONObject.getString("token");
        Date date = new Date(jSONObject.getLong("expires_at"));
        JSONArray jSONArray = jSONObject.getJSONArray("permissions");
        JSONArray jSONArray2 = jSONObject.getJSONArray("declined_permissions");
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("expired_permissions");
        Date date2 = new Date(jSONObject.getLong("last_refresh"));
        oe oeVarValueOf = oe.valueOf(jSONObject.getString("source"));
        return new xd(string, jSONObject.getString("application_id"), jSONObject.getString("user_id"), fpi1.A(jSONArray), fpi1.A(jSONArray2), jSONArrayOptJSONArray == null ? new ArrayList() : fpi1.A(jSONArrayOptJSONArray), oeVarValueOf, date, date2, new Date(jSONObject.optLong("data_access_expiration_time", 0L)), jSONObject.optString("graph_domain", null));
    }

    public static void r() {
        xd xdVar = (xd) ne.f.u0().c;
        if (xdVar != null) {
            y(new xd(xdVar.e, xdVar.h, xdVar.i, xdVar.b, xdVar.c, xdVar.d, xdVar.f, new Date(), new Date(), xdVar.t));
        }
    }

    public static xd s() {
        return (xd) ne.f.u0().c;
    }

    public static final fb91 t(x340 x340Var) {
        lb91 lb91Var = lb91.a;
        uwr uwrVar = cbx.a;
        long j = cbx.a(x340Var).c.c;
        long j2 = cbx.a(x340Var).c.c;
        long j3 = u7h.j;
        return lb91.e(j, cbx.a(x340Var).c.c, j3, cbx.a(x340Var).c.b, j3, j2, cbx.a(x340Var).c.c, j3, cbx.a(x340Var).c.b, j3, x340Var, 0);
    }

    public static final void u(z2d1 z2d1Var, ye5 ye5Var, e930 e930Var) {
        zma1 zma1Var;
        u7h u7hVar = e930Var.b;
        if (!(z2d1Var instanceof x2d1)) {
            if (!(z2d1Var instanceof y2d1)) {
                eg.o();
                return;
            }
            y2d1 y2d1Var = (y2d1) z2d1Var;
            URLSpan uRLSpan = y2d1Var.c;
            int i = y2d1Var.a;
            int i2 = y2d1Var.b;
            ye5Var.c(i, uRLSpan.getURL(), i2, uRLSpan.getURL());
            ye5Var.d(new zma1(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, TextDecoration.c, (Shadow) null, (PlatformSpanStyle) null, 61439), i, i2);
            return;
        }
        x2d1 x2d1Var = (x2d1) z2d1Var;
        StyleSpan styleSpan = x2d1Var.c;
        int i3 = x2d1Var.a;
        int i4 = x2d1Var.b;
        int style = styleSpan.getStyle();
        if (style == 1) {
            zma1Var = u7hVar != null ? new zma1(u7hVar.a, 0L, FontWeight.Z, (FontStyle) null, (FontSynthesis) null, e930Var.a, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, 65498) : new zma1(0L, 0L, FontWeight.Z, (FontStyle) null, (FontSynthesis) null, e930Var.a, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, 65499);
        } else if (style == 2) {
            zma1Var = new zma1(0L, 0L, (FontWeight) null, new FontStyle(1), (FontSynthesis) null, FontFamily.a, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, 65495);
        } else if (style != 3) {
            zma1Var = new zma1(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, 65535);
        } else if (u7hVar != null) {
            zma1Var = new zma1(u7hVar.a, 0L, FontWeight.Z, new FontStyle(1), (FontSynthesis) null, e930Var.a, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, 65490);
        } else {
            zma1Var = new zma1(0L, 0L, FontWeight.Z, new FontStyle(1), (FontSynthesis) null, e930Var.a, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, 65491);
        }
        ye5Var.d(zma1Var, i3, i4);
    }

    public static final af5 v(String str, e930 e930Var) {
        Spanned spannedFromHtml = Html.fromHtml(str, 0);
        ye5 ye5Var = new ye5(spannedFromHtml.toString());
        for (Object obj : spannedFromHtml.getSpans(0, spannedFromHtml.length(), Object.class)) {
            int spanStart = spannedFromHtml.getSpanStart(obj);
            int spanEnd = spannedFromHtml.getSpanEnd(obj);
            if (obj instanceof URLSpan) {
                u(new y2d1(spanStart, spanEnd, (URLSpan) obj), ye5Var, e930Var);
            } else if (obj instanceof StyleSpan) {
                u(new x2d1(spanStart, spanEnd, (StyleSpan) obj), ye5Var, e930Var);
            }
        }
        return ye5Var.p();
    }

    public static boolean w() {
        xd xdVar = (xd) ne.f.u0().c;
        return (xdVar == null || new Date().after(xdVar.a)) ? false : true;
    }

    public static float x(float f) {
        float f2 = f / 255.0f;
        return f2 < 0.03928f ? f2 / 12.92f : (float) Math.pow((f2 + 0.055f) / 1.055f, 2.4000000953674316d);
    }

    public static void y(xd xdVar) {
        ne.f.u0().S(xdVar, true);
    }

    public static boolean z(int i) {
        return Math.abs(1.05f / (((x((float) Color.blue(i)) * 0.0722f) + ((x((float) Color.green(i)) * 0.7152f) + (x((float) Color.red(i)) * 0.2126f))) + 0.05f)) < 3.0f;
    }
}
