package p;

import android.net.Uri;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class j2p1 {
    public static b180 a;
    public static b180 b;

    public static final void a(zq0 zq0Var, boolean z, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(417270890);
        int i2 = (x340Var.i(zq0Var) ? 4 : 2) | i | (x340Var.h(z) ? 32 : 16) | (x340Var.i(iu30Var) ? 256 : 128) | 3072;
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarF = u291.f(qim0Var3, 1.0f);
            fra fraVar = een.N0;
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            jw31 jw31VarA = ew31.a(new d36(12.0f, true, new um5(false)), fraVar, x340Var, 0);
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
            nko1.H(jw31VarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            c(zq0Var, iu30Var, x340Var, ((i2 << 3) & 112) | 6 | (i2 & 896));
            if (z) {
                x340Var.i0(1736337604);
                k(zq0Var.c, iu30Var, x340Var, (i2 >> 3) & 112);
                x340Var.r(false);
            } else {
                x340Var.i0(1736383732);
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
            h311VarV.d = new bk0(zq0Var, z, iu30Var, qim0Var2, i, (byte) 1);
        }
    }

    public static final void b(String str, String str2, b0k b0kVar, int i) {
        String str3;
        byte b2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1579952171);
        int i2 = i | (x340Var.g(str) ? 4 : 2) | (x340Var.g(str2) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            wat watVar = (wat) x340Var.k(t4k.h);
            uwr uwrVar = cbx.a;
            zsc zscVar = zex.a;
            Shadow shadow = new Shadow(watVar.X0(7.0f), ((vex) zscVar.e).d, (((long) Float.floatToRawIntBits(watVar.X0(0.0f))) << 32) | (((long) Float.floatToRawIntBits(watVar.X0(3.0f))) & 4294967295L));
            uwr uwrVar2 = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            mbh mbhVarA = jbh.a(new d36(2.0f, true, new um5(false)), een.P0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            nim0 nim0Var = nim0.a;
            qim0 qim0VarE = zr7.E(x340Var, nim0Var);
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
            uwo1.e(str, e9k.n(62, nim0Var), lee1.a(cbx.d(x340Var).d, 0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (TextGeometricTransform) null, 0L, (TextDecoration) null, shadow, (phc1) null, 0, 0, 0L, (u8e1) null, (wdt0) null, (shc0) null, 0, 16769023), cbx.a(x340Var).b.a, null, null, 0, false, new cjc0(1), 0, null, x340Var, i2 & 14, 0, 1776);
            str3 = str2;
            uwo1.e(str3, e9k.n(62, nim0Var), lee1.a(cbx.d(x340Var).g, 0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (TextGeometricTransform) null, 0L, (TextDecoration) null, shadow, (phc1) null, 0, 0, 0L, (u8e1) null, (wdt0) null, (shc0) null, 0, 16769023), ((vex) zscVar.e).m, null, null, 0, false, new cjc0(1), 0, null, x340Var, (i2 >> 3) & 14, 0, 1776);
            b2 = 1;
            x340Var.r(true);
        } else {
            str3 = str2;
            b2 = 1;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new b4(b2, i, str, str3);
        }
    }

    public static final void c(zq0 zq0Var, iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        boolean z;
        String str = zq0Var.b;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-2065293841);
        int i3 = i & 6;
        pw31 pw31Var = pw31.a;
        if (i3 == 0) {
            i2 = (x340Var.i(pw31Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(zq0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(iu30Var) ? 256 : 128;
        }
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            if (str == null || str.length() == 0) {
                x340Var.i0(-1762176515);
                x340Var.r(false);
                z = false;
            } else {
                x340Var.i0(-472486440);
                z = !(((wat) x340Var.k(t4k.h)).U0() >= 1.5f);
                x340Var.r(false);
            }
            x340Var.i0(-472482258);
            nim0 nim0Var = nim0.a;
            qim0 qim0VarN = anm1.N(xyd1.a, pw31Var.a(1.0f, nim0Var, true));
            if (zq0Var.a != null) {
                boolean z2 = (i2 & 896) == 256;
                Object objT = x340Var.T();
                if (z2 || objT == fkj0.X) {
                    objT = new cr0(iu30Var, (byte) 0);
                    x340Var.s0(objT);
                }
                qim0VarN = qim0VarN.then(bin.x(nim0Var, false, null, null, null, (Function0) objT, 15));
            }
            x340Var.r(false);
            fra fraVar = een.N0;
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            jw31 jw31VarA = ew31.a(new d36(12.0f, true, new um5(false)), fraVar, x340Var, 0);
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
            if (z) {
                x340Var.i0(-1307728482);
                Uri uri = Uri.parse(str);
                zov0 zov0Var = cbx.b(x340Var).g;
                ebp1.a(uri, anm1.N(xyd1.b, nim0Var), null, new p3v(48.0f), x340Var, 0, 4);
                x340Var.r(false);
            } else {
                x340Var.i0(-1307521681);
                x340Var.r(false);
            }
            String str2 = zq0Var.d;
            if (str2 == null) {
                str2 = "";
            }
            String strK = zq0Var.e;
            if (strK == null) {
                strK = x0d.k(x340Var, 1897487738, 2131951993, x340Var, false);
            } else {
                x340Var.i0(1897487180);
                x340Var.r(false);
            }
            b(str2, strK, x340Var, 0);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new g90(zq0Var, iu30Var, i, (byte) 3);
        }
    }

    public static final void d(boolean z, iu30 iu30Var, b0k b0kVar, int i) {
        b0k b0kVar2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(974497229);
        int i2 = (b0kVar3.h(z) ? 4 : 2) | i | (b0kVar3.i(iu30Var) ? 32 : 16);
        if (b0kVar3.Y(i2 & 1, (i2 & 19) != 18)) {
            b0kVar2 = b0kVar3;
            jto1.b(null, new uvx((pgx) null, 2, (tvx) null, (p3v) null, 27), null, false, null, null, null, null, null, null, null, p8i.b, apo.r(1581146676, new nr3(z, iu30Var, (byte) 1), b0kVar3), null, null, p8i.c, b0kVar2, 64, 197040, 26621);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new zm9((byte) 0, i, iu30Var, z);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code duplicated, block: B:26:0x0071 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:27:0x0073 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x0075 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:29:0x0077  */
    /* JADX WARN: Code duplicated, block: B:31:0x0082  */
    /* JADX WARN: Code duplicated, block: B:33:0x008a  */
    /* JADX WARN: Code duplicated, block: B:35:0x0095  */
    /* JADX WARN: Code duplicated, block: B:36:0x009c  */
    /* JADX WARN: Code duplicated, block: B:39:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:42:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:45:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:48:0x0111  */
    /* JADX WARN: Code duplicated, block: B:51:0x0125  */
    public static final void e(sk20 sk20Var, qim0 qim0Var, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        qim0 qim0Var2;
        int i2;
        int i3;
        String strK;
        int iOrdinal;
        int i4;
        int i5;
        wat watVar;
        Object objT;
        m4c m4cVar;
        Object objT2;
        xhl xhlVar;
        Object objT3;
        Object objT4;
        Object objT5;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1062980703);
        int i6 = (x340Var.e(sk20Var.ordinal()) ? 4 : 2) | i | 48;
        if (x340Var.Y(i6 & 1, (i6 & 19) != 18)) {
            int iOrdinal2 = sk20Var.ordinal();
            String strK2 = null;
            if (iOrdinal2 == 0) {
                i2 = 677764879;
                i3 = 2131952235;
            } else if (iOrdinal2 != 1) {
                if (iOrdinal2 == 2) {
                    i2 = 677771440;
                    i3 = 2131952239;
                } else {
                    if (iOrdinal2 != 3) {
                        throw p3d1.k(x340Var, 677764090, false);
                    }
                    x340Var.i0(-463827940);
                    x340Var.r(false);
                    strK = null;
                }
                iOrdinal = sk20Var.ordinal();
                if (iOrdinal != 0) {
                    i4 = 677776658;
                    i5 = 2131952234;
                } else if (iOrdinal != 1) {
                    if (iOrdinal != 2) {
                        i4 = 677783411;
                        i5 = 2131952238;
                    } else {
                        if (iOrdinal == 3) {
                            throw p3d1.k(x340Var, 677775875, false);
                        }
                        x340Var.i0(-463453956);
                        x340Var.r(false);
                    }
                    String str = strK2;
                    qim0Var2 = nim0.a;
                    qim0 qim0VarThen = anm1.N("first_save_header", u291.f(qim0Var2, 1.0f)).then(qim0Var2);
                    x340Var.j0(475845883);
                    watVar = (wat) x340Var.k(t4k.h);
                    x340Var.j0(-492369756);
                    objT = x340Var.T();
                    m4cVar = fkj0.X;
                    if (objT == m4cVar) {
                        objT = x0d.o(watVar, x340Var);
                    }
                    x340Var.r(false);
                    ufh0 ufh0Var = (ufh0) objT;
                    x340Var.j0(-492369756);
                    objT2 = x340Var.T();
                    if (objT2 == m4cVar) {
                        objT2 = x0d.m(x340Var);
                    }
                    x340Var.r(false);
                    xhlVar = (xhl) objT2;
                    x340Var.j0(-492369756);
                    objT3 = x340Var.T();
                    if (objT3 == m4cVar) {
                        objT3 = v8r.q(Boolean.FALSE);
                        x340Var.s0(objT3);
                    }
                    x340Var.r(false);
                    ven0 ven0Var = (ven0) objT3;
                    x340Var.j0(-492369756);
                    objT4 = x340Var.T();
                    if (objT4 == m4cVar) {
                        objT4 = x0d.n(xhlVar, x340Var);
                    }
                    x340Var.r(false);
                    nil nilVar = (nil) objT4;
                    x340Var.j0(-492369756);
                    objT5 = x340Var.T();
                    if (objT5 == m4cVar) {
                        objT5 = bb00.i(rih1.a, f331.X0, x340Var);
                    }
                    x340Var.r(false);
                    ven0 ven0Var2 = (ven0) objT5;
                    who1.h(s161.b(qim0VarThen, false, new tu(ufh0Var, (byte) 10)), apo.i(x340Var, -1488813576, new uk20((Object) ven0Var2, (Object) xhlVar, (Object) new su(ven0Var, nilVar, (byte) 6), (Object) strK, (Object) str, (byte) 0)), new ru(ven0Var2, ufh0Var, nilVar, ven0Var, (byte) 6), x340Var, 48);
                    x340Var.r(false);
                } else {
                    i4 = 677780213;
                    i5 = 2131952236;
                }
                strK2 = x0d.k(x340Var, i4, i5, x340Var, false);
                String str2 = strK2;
                qim0Var2 = nim0.a;
                qim0 qim0VarThen2 = anm1.N("first_save_header", u291.f(qim0Var2, 1.0f)).then(qim0Var2);
                x340Var.j0(475845883);
                watVar = (wat) x340Var.k(t4k.h);
                x340Var.j0(-492369756);
                objT = x340Var.T();
                m4cVar = fkj0.X;
                if (objT == m4cVar) {
                    objT = x0d.o(watVar, x340Var);
                }
                x340Var.r(false);
                ufh0 ufh0Var2 = (ufh0) objT;
                x340Var.j0(-492369756);
                objT2 = x340Var.T();
                if (objT2 == m4cVar) {
                    objT2 = x0d.m(x340Var);
                }
                x340Var.r(false);
                xhlVar = (xhl) objT2;
                x340Var.j0(-492369756);
                objT3 = x340Var.T();
                if (objT3 == m4cVar) {
                    objT3 = v8r.q(Boolean.FALSE);
                    x340Var.s0(objT3);
                }
                x340Var.r(false);
                ven0 ven0Var3 = (ven0) objT3;
                x340Var.j0(-492369756);
                objT4 = x340Var.T();
                if (objT4 == m4cVar) {
                    objT4 = x0d.n(xhlVar, x340Var);
                }
                x340Var.r(false);
                nil nilVar2 = (nil) objT4;
                x340Var.j0(-492369756);
                objT5 = x340Var.T();
                if (objT5 == m4cVar) {
                    objT5 = bb00.i(rih1.a, f331.X0, x340Var);
                }
                x340Var.r(false);
                ven0 ven0Var4 = (ven0) objT5;
                who1.h(s161.b(qim0VarThen2, false, new tu(ufh0Var2, (byte) 10)), apo.i(x340Var, -1488813576, new uk20((Object) ven0Var4, (Object) xhlVar, (Object) new su(ven0Var3, nilVar2, (byte) 6), (Object) strK, (Object) str2, (byte) 0)), new ru(ven0Var4, ufh0Var2, nilVar2, ven0Var3, (byte) 6), x340Var, 48);
                x340Var.r(false);
            } else {
                i2 = 677768338;
                i3 = 2131952237;
            }
            strK = x0d.k(x340Var, i2, i3, x340Var, false);
            iOrdinal = sk20Var.ordinal();
            if (iOrdinal != 0) {
                i4 = 677776658;
                i5 = 2131952234;
            } else if (iOrdinal != 1) {
                if (iOrdinal != 2) {
                    i4 = 677783411;
                    i5 = 2131952238;
                } else {
                    if (iOrdinal == 3) {
                        throw p3d1.k(x340Var, 677775875, false);
                    }
                    x340Var.i0(-463453956);
                    x340Var.r(false);
                }
                String str3 = strK2;
                qim0Var2 = nim0.a;
                qim0 qim0VarThen3 = anm1.N("first_save_header", u291.f(qim0Var2, 1.0f)).then(qim0Var2);
                x340Var.j0(475845883);
                watVar = (wat) x340Var.k(t4k.h);
                x340Var.j0(-492369756);
                objT = x340Var.T();
                m4cVar = fkj0.X;
                if (objT == m4cVar) {
                    objT = x0d.o(watVar, x340Var);
                }
                x340Var.r(false);
                ufh0 ufh0Var3 = (ufh0) objT;
                x340Var.j0(-492369756);
                objT2 = x340Var.T();
                if (objT2 == m4cVar) {
                    objT2 = x0d.m(x340Var);
                }
                x340Var.r(false);
                xhlVar = (xhl) objT2;
                x340Var.j0(-492369756);
                objT3 = x340Var.T();
                if (objT3 == m4cVar) {
                    objT3 = v8r.q(Boolean.FALSE);
                    x340Var.s0(objT3);
                }
                x340Var.r(false);
                ven0 ven0Var5 = (ven0) objT3;
                x340Var.j0(-492369756);
                objT4 = x340Var.T();
                if (objT4 == m4cVar) {
                    objT4 = x0d.n(xhlVar, x340Var);
                }
                x340Var.r(false);
                nil nilVar3 = (nil) objT4;
                x340Var.j0(-492369756);
                objT5 = x340Var.T();
                if (objT5 == m4cVar) {
                    objT5 = bb00.i(rih1.a, f331.X0, x340Var);
                }
                x340Var.r(false);
                ven0 ven0Var6 = (ven0) objT5;
                who1.h(s161.b(qim0VarThen3, false, new tu(ufh0Var3, (byte) 10)), apo.i(x340Var, -1488813576, new uk20((Object) ven0Var6, (Object) xhlVar, (Object) new su(ven0Var5, nilVar3, (byte) 6), (Object) strK, (Object) str3, (byte) 0)), new ru(ven0Var6, ufh0Var3, nilVar3, ven0Var5, (byte) 6), x340Var, 48);
                x340Var.r(false);
            } else {
                i4 = 677780213;
                i5 = 2131952236;
            }
            strK2 = x0d.k(x340Var, i4, i5, x340Var, false);
            String str4 = strK2;
            qim0Var2 = nim0.a;
            qim0 qim0VarThen4 = anm1.N("first_save_header", u291.f(qim0Var2, 1.0f)).then(qim0Var2);
            x340Var.j0(475845883);
            watVar = (wat) x340Var.k(t4k.h);
            x340Var.j0(-492369756);
            objT = x340Var.T();
            m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = x0d.o(watVar, x340Var);
            }
            x340Var.r(false);
            ufh0 ufh0Var4 = (ufh0) objT;
            x340Var.j0(-492369756);
            objT2 = x340Var.T();
            if (objT2 == m4cVar) {
                objT2 = x0d.m(x340Var);
            }
            x340Var.r(false);
            xhlVar = (xhl) objT2;
            x340Var.j0(-492369756);
            objT3 = x340Var.T();
            if (objT3 == m4cVar) {
                objT3 = v8r.q(Boolean.FALSE);
                x340Var.s0(objT3);
            }
            x340Var.r(false);
            ven0 ven0Var7 = (ven0) objT3;
            x340Var.j0(-492369756);
            objT4 = x340Var.T();
            if (objT4 == m4cVar) {
                objT4 = x0d.n(xhlVar, x340Var);
            }
            x340Var.r(false);
            nil nilVar4 = (nil) objT4;
            x340Var.j0(-492369756);
            objT5 = x340Var.T();
            if (objT5 == m4cVar) {
                objT5 = bb00.i(rih1.a, f331.X0, x340Var);
            }
            x340Var.r(false);
            ven0 ven0Var8 = (ven0) objT5;
            who1.h(s161.b(qim0VarThen4, false, new tu(ufh0Var4, (byte) 10)), apo.i(x340Var, -1488813576, new uk20((Object) ven0Var8, (Object) xhlVar, (Object) new su(ven0Var7, nilVar4, (byte) 6), (Object) strK, (Object) str4, (byte) 0)), new ru(ven0Var8, ufh0Var4, nilVar4, ven0Var7, (byte) 6), x340Var, 48);
            x340Var.r(false);
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new xh00((Object) sk20Var, (Object) qim0Var2, i, (byte) 15);
        }
    }

    public static final void f(qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1313528641);
        int i2 = (x340Var.i(qim0Var) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            ncf0 ncf0VarG = h5p1.G(new ocf0(2131886204), null, null, x340Var, 0, 62);
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = v8r.q(Boolean.FALSE);
                x340Var.s0(objT);
            }
            ven0 ven0Var = (ven0) objT;
            boolean zI = x340Var.i(ven0Var);
            Object objT2 = x340Var.T();
            if (zI || objT2 == m4cVar) {
                objT2 = new hj6(ven0Var, (lnm) null, (byte) 6);
                x340Var.s0(objT2);
            }
            qxd0.t(rih1.a, x340Var, (vu30) objT2);
            mp10.f(ncf0VarG.c(), u291.r(nim0.a, 68.0f).then(qim0Var), ((Boolean) ven0Var.getValue()).booleanValue(), false, (bcf0) null, 0, (ddf0) null, (tl3) null, (j6m) null, x340Var, 3072, 0, 2097136);
            x340Var = x340Var;
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new wdk(qim0Var, i, (byte) 25);
        }
    }

    public static final void g(int i, long j, String str, b0k b0kVar, qim0 qim0Var, lee1 lee1Var) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(839113461);
        int i2 = i | (x340Var.g(str) ? 4 : 2) | (x340Var.i(qim0Var) ? 32 : 16) | (x340Var.f(j) ? 256 : 128) | (x340Var.i(lee1Var) ? 2048 : 1024);
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            x340Var.d0();
            if ((i & 1) != 0 && !x340Var.E()) {
                x340Var.b0();
            }
            x340Var.s();
            if (str == null) {
                x340Var.i0(1319644489);
                x340Var.r(false);
            } else {
                x340Var.i0(1319644490);
                uwo1.e(str, qim0Var, lee1Var, j, new a0e1(3), null, 2, false, null, 0, null, x340Var, (i2 & 126) | ((i2 >> 3) & 896) | ((i2 << 3) & 7168), 0, 1952);
                x340Var.r(false);
            }
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new o3a(str, qim0Var, j, lee1Var, i);
        }
    }

    public static final void h(pod0 pod0Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(-368945400);
        if ((i & 6) == 0) {
            i2 = (x340Var2.g(pod0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i & 48;
        nim0 nim0Var = nim0.a;
        if (i3 == 0) {
            i2 |= x340Var2.i(nim0Var) ? 32 : 16;
        }
        if (x340Var2.Y(i2 & 1, (i2 & 19) != 18)) {
            long jK = f5p1.k(x340Var2, 2131101372);
            mic0 mic0VarS = v9c.s(p7h.M(new u7h[]{new u7h(jK), new u7h(f5p1.k(x340Var2, 2131101371))}), 0.0f, Float.POSITIVE_INFINITY, 8);
            qim0 qim0VarD = u291.d(nim0Var, 1.0f);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0VarD);
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
            String str = pod0Var.d;
            if (str == null) {
                str = "";
            }
            cso1.d(Uri.parse(str), isl.a, u291.f(nim0Var, 1.0f), mif1.P0, hso1.E(2131231479, 0L, false, jK, x340Var2, 384, 2), null, null, x340Var2, 32816, 224);
            t1c.a(dug.e(u291.d(nim0Var, 1.0f), mic0VarS, null, 0.0f, 6), x340Var2, 0);
            String str2 = pod0Var.a;
            uwr uwrVar = cbx.a;
            uwo1.e(str2, h2c.a.a(u291.f(uyn1.z(16.0f, 0.0f, 2, nim0Var), 1.0f), een.t), cbx.d(x340Var2).c, cbx.a(x340Var2).b.a, null, null, 0, false, null, 0, null, x340Var2, 0, 0, 2032);
            x340Var = x340Var2;
            x340Var.r(true);
        } else {
            x340Var = x340Var2;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ug50(pod0Var, i);
        }
    }

    public static final void i(zob1 zob1Var, qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(482980060);
        int i2 = (x340Var.i(zob1Var) ? 4 : 2) | i | 48;
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            h((pod0) rwq.h(zob1Var, x340Var, i2 & 14).getValue(), x340Var, 48);
            qim0Var = nim0.a;
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new vx90(zob1Var, qim0Var, i, (byte) 29);
        }
    }

    public static final void j(int i, String str, String str2, b0k b0kVar, qim0 qim0Var) {
        String str3;
        int i2;
        x340 x340Var;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(-146950109);
        if ((i & 6) == 0) {
            str3 = str;
            i2 = (x340Var2.g(str3) ? 4 : 2) | i;
        } else {
            str3 = str;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var2.g(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var2.i(qim0Var) ? 256 : 128;
        }
        if (x340Var2.Y(i2 & 1, (i2 & 147) != 146)) {
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var2, 0);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0Var);
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
            uwr uwrVar = cbx.a;
            lee1 lee1Var = cbx.d(x340Var2).k;
            cjc0 cjc0Var = new cjc0(1);
            nim0 nim0Var = nim0.a;
            uwo1.e(str3, anm1.N("text.content.title", nim0Var), lee1Var, 0L, null, null, 2, false, cjc0Var, 0, null, x340Var2, i2 & 14, 0, 1720);
            uwo1.e(str2, anm1.N("text.content.subtitle", nim0Var), cbx.d(x340Var2).j, cbx.a(x340Var2).b.a, null, null, 2, false, new cjc0(1), 0, null, x340Var2, (i2 >> 3) & 14, 0, 1712);
            x340Var = x340Var2;
            x340Var.r(true);
        } else {
            x340Var = x340Var2;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new a4f(str, str2, qim0Var, i, (byte) 4);
        }
    }

    public static final void k(boolean z, iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1185176710);
        if ((i & 6) == 0) {
            i2 = (x340Var.h(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            ldx ldxVar = ldx.c;
            gdx gdxVarA = yla.p(x340Var).a();
            boolean z2 = ((i2 & 14) == 4) | ((i2 & 112) == 32);
            Object objT = x340Var.T();
            if (z2 || objT == fkj0.X) {
                objT = new z20(z, iu30Var, (byte) 4);
                x340Var.s0(objT);
            }
            wro1.h(new gbx(z50.c, (Function0) objT), ldxVar, null, null, gdxVarA, null, false, null, null, apo.r(802897745, new dr0((byte) 0, z), x340Var), x340Var, 0, 6, 988);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new a30((byte) 2, i, iu30Var, z);
        }
    }

    public static final void l(b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-187779466);
        if (x340Var.Y(i & 1, i != 0)) {
            jmr0 jmr0VarN = i3o1.n(2131233972, x340Var, 0);
            qim0 qim0VarK = d9y0.k(u291.d(nim0.a, 1.0f), 0.1f);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            cvx cvxVar2 = cbx.b(x340Var).b;
            cvx cvxVar3 = cbx.b(x340Var).b;
            cvx cvxVar4 = cbx.b(x340Var).b;
            eso1.h(jmr0VarN, isl.a, uyn1.A(qim0VarK, 16.0f, 16.0f, 16.0f, 8.0f), (p3v) null, (zvx) null, (ecx) null, mif1.V0, (tl3) null, (ColorFilter) null, x340Var, 224312, 384);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new rvd1(i, (byte) 5);
        }
    }

    public static final void m(hh11 hh11Var, lzn0 lzn0Var, boolean z, boolean z2, gw3 gw3Var, br0 br0Var, ecd1 ecd1Var, sve sveVar, boolean z3, n601 n601Var, vwz0 vwz0Var, qim0 qim0Var, b0k b0kVar, int i) {
        b0k b0kVar2;
        qim0 qim0Var2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(1780705487);
        int i2 = i | (b0kVar3.g(hh11Var) ? 4 : 2) | (b0kVar3.i(lzn0Var) ? 32 : 16) | (b0kVar3.h(z) ? 256 : 128) | (b0kVar3.h(z2) ? 2048 : 1024) | (b0kVar3.g(gw3Var) ? 16384 : 8192) | (b0kVar3.g(br0Var) ? 131072 : 65536) | (b0kVar3.g(ecd1Var) ? 1048576 : 524288) | (b0kVar3.g(sveVar) ? 8388608 : 4194304) | (b0kVar3.h(z3) ? 67108864 : 33554432) | (b0kVar3.i(n601Var) ? 536870912 : 268435456);
        if (b0kVar3.Y(i2 & 1, ((306783379 & i2) == 306783378 && (((b0kVar3.i(vwz0Var) ? (char) 4 : (char) 2) | '0') & 19) == 18) ? false : true)) {
            Object objT = b0kVar3.T();
            Object obj = fkj0.X;
            if (objT == obj) {
                objT = new lb9();
                b0kVar3.s0(objT);
            }
            lb9 lb9Var = (lb9) objT;
            Object objT2 = b0kVar3.T();
            if (objT2 == obj) {
                objT2 = new ti51();
                b0kVar3.s0(objT2);
            }
            ti51 ti51Var = (ti51) objT2;
            Object objT3 = b0kVar3.T();
            if (objT3 == obj) {
                objT3 = new tr00(n601Var);
                b0kVar3.s0(objT3);
            }
            tr00 tr00Var = (tr00) objT3;
            Object objT4 = b0kVar3.T();
            if (objT4 == obj) {
                objT4 = new kjn0(lzn0Var);
                b0kVar3.s0(objT4);
            }
            kjn0 kjn0Var = (kjn0) objT4;
            Object objT5 = b0kVar3.T();
            if (objT5 == obj) {
                objT5 = new fx();
                b0kVar3.s0(objT5);
            }
            fx fxVar = (fx) objT5;
            Object objT6 = b0kVar3.T();
            if (objT6 == obj) {
                objT6 = new o921(lzn0Var);
                b0kVar3.s0(objT6);
            }
            o921 o921Var = (o921) objT6;
            k2t0 k2t0VarV = kkn.v(ti5.g(b0kVar3), b0kVar3);
            xtb0 xtb0VarA = aub0.a(0, b0kVar3, 3);
            Object objT7 = b0kVar3.T();
            if (objT7 == obj) {
                objT7 = yv91.a(new nxb0(xtb0VarA, (byte) 23));
                b0kVar3.s0(objT7);
            }
            tob1 tob1Var = (tob1) objT7;
            Object objT8 = b0kVar3.T();
            if (objT8 == obj) {
                objT8 = yv91.a(new nxb0(xtb0VarA, (byte) 25));
                b0kVar3.s0(objT8);
            }
            tob1 tob1Var2 = (tob1) objT8;
            Object objT9 = b0kVar3.T();
            if (objT9 == obj) {
                objT9 = yv91.a(new nxb0(xtb0VarA, (byte) 24));
                b0kVar3.s0(objT9);
            }
            tob1 tob1Var3 = (tob1) objT9;
            float fMax = 1.0f;
            if (((Number) tob1Var.getValue()).intValue() <= 0 && !((Boolean) tob1Var3.getValue()).booleanValue()) {
                fMax = Math.max(0.0f, Math.min(1.0f, (((Number) tob1Var2.getValue()).intValue() - 200.0f) / 150.0f));
            }
            float f = fMax;
            long jB = u7h.b(z4p1.e(hh11Var.d), 1.0f, 0.0f, 0.0f, 0.0f, 14);
            j2t0 j2t0Var = k2t0VarV.c;
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarL = bmq0.L(qim0Var3, j2t0Var, (g6o0) null);
            WeakHashMap weakHashMap = osl1.x;
            b0kVar2 = b0kVar3;
            irn1.u(qim0VarL, apo.r(-1547757566, new r9g0(jB, f, k2t0VarV, (Object) hh11Var, (Function0) vwz0Var, (byte) 3), b0kVar3), null, new bgc0(lhc.g(b0kVar3).g, 32), apo.r(1991036872, new ng11(xtb0VarA, jB, hh11Var, z3, sveVar, z2, gw3Var, z, br0Var, ecd1Var, lb9Var, ti51Var, tr00Var, kjn0Var, fxVar, o921Var), b0kVar2), b0kVar2, 24624, 4);
            qim0Var2 = qim0Var3;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new afb(hh11Var, lzn0Var, z, z2, gw3Var, br0Var, ecd1Var, sveVar, z3, n601Var, vwz0Var, qim0Var2, i);
        }
    }

    public static final void n(int i, String str, Function0 function0, b0k b0kVar, qim0 qim0Var) {
        x340 x340Var;
        String str2 = str;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(1548604479);
        int i2 = i | (x340Var2.g(str2) ? 4 : 2) | (x340Var2.i(qim0Var) ? 32 : 16) | (x340Var2.i(function0) ? 256 : 128);
        if (x340Var2.Y(i2 & 1, (i2 & 147) != 146)) {
            Object objT = x340Var2.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = new bs91();
                x340Var2.s0(objT);
            }
            bs91 bs91Var = (bs91) objT;
            Object objT2 = x340Var2.T();
            if (objT2 == m4cVar) {
                objT2 = qxd0.M(o6x.a, x340Var2);
                x340Var2.s0(objT2);
            }
            c9n c9nVar = (c9n) objT2;
            sok.k(bs91Var, qim0Var, fhj.a, x340Var2, (i2 & 112) | 384, 0);
            x340Var = x340Var2;
            boolean zI = x340Var.i(c9nVar) | x340Var.i(bs91Var) | ((i2 & 14) == 4) | ((i2 & 896) == 256);
            Object objT3 = x340Var.T();
            if (zI || objT3 == m4cVar) {
                c6h0 c6h0Var = new c6h0(c9nVar, bs91Var, str2, function0, (lnm) null);
                str2 = str2;
                x340Var.s0(c6h0Var);
                objT3 = c6h0Var;
            }
            qxd0.t(str2, x340Var, (vu30) objT3);
        } else {
            x340Var = x340Var2;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new rl(str2, qim0Var, function0, i, (byte) 22);
        }
    }

    public static final void o(String str, Uri uri, String str2, String str3, String str4, int i, s171 s171Var, qim0 qim0Var, b0k b0kVar, int i2, int i3) {
        qim0 qim0Var2;
        int i4;
        qim0 qim0Var3;
        Function0 function0;
        b0k b0kVar2 = (x340) b0kVar;
        b0kVar2.k0(344723771);
        j06 j06Var = ((x340) b0kVar2).a;
        int i5 = i2 | (b0kVar2.g(str) ? 4 : 2) | (b0kVar2.g(uri) ? 32 : 16) | (b0kVar2.g(str2) ? 256 : 128) | (b0kVar2.g(str3) ? 2048 : 1024) | (b0kVar2.g(str4) ? 16384 : 8192) | (b0kVar2.e(i) ? 131072 : 65536) | (b0kVar2.i(s171Var) ? 1048576 : 524288);
        int i6 = i3 & 128;
        if (i6 != 0) {
            i4 = i5 | 12582912;
            qim0Var2 = qim0Var;
        } else {
            qim0Var2 = qim0Var;
            i4 = i5 | (b0kVar2.i(qim0Var2) ? 8388608 : 4194304);
        }
        int i7 = i4;
        if (b0kVar2.Y(i7 & 1, (i7 & 4793491) != 4793490)) {
            qim0 qim0Var4 = nim0.a;
            qim0 qim0Var5 = i6 != 0 ? qim0Var4 : qim0Var2;
            qim0 qim0VarF = dug.f(zr7.i(u291.f(qim0Var5, 1.0f), gce0.a1), z4p1.e(i), d4o1.a);
            era eraVar = een.P0;
            f36 f36Var = h36.c;
            mbh mbhVarA = jbh.a(f36Var, eraVar, b0kVar2, 0);
            int iHashCode = Long.hashCode(((x340) b0kVar2).T);
            xos0 xos0VarM = b0kVar2.m();
            qim0 qim0VarE = zr7.E(b0kVar2, qim0VarF);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            b0kVar2.m0();
            boolean z = ((x340) b0kVar2).S;
            qim0 qim0Var6 = qim0Var5;
            Function0 function1 = hmb0.t1;
            if (z) {
                b0kVar2.l(function1);
            } else {
                b0kVar2.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(mbhVarA, b0kVar2, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, b0kVar2, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, b0kVar2, lljVar3);
            nko1.F(b0kVar2);
            llj lljVar4 = y580.Y;
            wnb0 wnb0VarQ = kk0.q(b0kVar2, qim0VarE, lljVar4, 1.0f, true);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode2 = Long.hashCode(((x340) b0kVar2).T);
            xos0 xos0VarM2 = b0kVar2.m();
            qim0 qim0VarE2 = zr7.E(b0kVar2, wnb0VarQ);
            b0kVar2.m0();
            if (((x340) b0kVar2).S) {
                b0kVar2.l(function1);
            } else {
                b0kVar2.v0();
            }
            nko1.H(gfh0VarC, b0kVar2, lljVar);
            nko1.H(xos0VarM2, b0kVar2, lljVar2);
            x0d.q(iHashCode2, b0kVar2, lljVar3, b0kVar2);
            nko1.H(qim0VarE2, b0kVar2, lljVar4);
            l(b0kVar2, 0);
            qim0 qim0VarD = u291.d(qim0Var4, 1.0f);
            uwr uwrVar = cbx.a;
            float f = cbx.b(b0kVar2).b.b;
            cvx cvxVar = cbx.b(b0kVar2).b;
            uwo1.e(str, anm1.N("text.content.text", uyn1.A(qim0VarD, cbx.b(b0kVar2).b.c, f, cbx.b(b0kVar2).b.c, 16.0f)), lee1.a(cbx.d(b0kVar2).d, 0L, fc11.G(72), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (TextGeometricTransform) null, 0L, (TextDecoration) null, (Shadow) null, (phc1) null, 0, 0, 0L, (u8e1) null, (wdt0) null, (shc0) null, 0, 16777213), 0L, null, null, 2, false, null, 0, new px8(fc11.G(20), fc11.G(72), fc11.G(1), (mx8) null, 8), b0kVar2, i7 & 14, 8, 952);
            b0kVar2.r(true);
            cvx cvxVar2 = cbx.b(b0kVar2).b;
            cvx cvxVar3 = cbx.b(b0kVar2).b;
            cvx cvxVar4 = cbx.b(b0kVar2).b;
            qim0 qim0VarB = uyn1.B(qim0Var4, 16.0f, 0.0f, 16.0f, 16.0f, 2);
            mbh mbhVarA2 = jbh.a(f36Var, eraVar, b0kVar2, 0);
            int iHashCode3 = Long.hashCode(((x340) b0kVar2).T);
            xos0 xos0VarM3 = b0kVar2.m();
            qim0 qim0VarE3 = zr7.E(b0kVar2, qim0VarB);
            b0kVar2.m0();
            if (((x340) b0kVar2).S) {
                function0 = function1;
                b0kVar2.l(function0);
            } else {
                function0 = function1;
                b0kVar2.v0();
            }
            nko1.H(mbhVarA2, b0kVar2, lljVar);
            nko1.H(xos0VarM3, b0kVar2, lljVar2);
            x0d.q(iHashCode3, b0kVar2, lljVar3, b0kVar2);
            nko1.H(qim0VarE3, b0kVar2, lljVar4);
            p(uri, str2, str3, str4, b0kVar2, (i7 >> 3) & 8190);
            b0kVar2 = b0kVar2;
            cvx cvxVar5 = cbx.b(b0kVar2).b;
            op71.g(b0kVar2, u291.h(qim0Var4, 12.0f));
            if (s171Var != null) {
                b0kVar2.i0(363171340);
                sbl.o(s171Var, (qim0) null, 0, b0kVar2, (i7 >> 18) & 14, 6);
                b0kVar2.r(false);
            } else {
                b0kVar2.i0(363233805);
                qim0 qim0VarF2 = u291.f(qim0Var4, 1.0f);
                jw31 jw31VarA = ew31.a(h36.g, een.N0, b0kVar2, 0);
                int iHashCode4 = Long.hashCode(((x340) b0kVar2).T);
                xos0 xos0VarM4 = b0kVar2.m();
                qim0 qim0VarE4 = zr7.E(b0kVar2, qim0VarF2);
                b0kVar2.m0();
                if (((x340) b0kVar2).S) {
                    b0kVar2.l(function0);
                } else {
                    b0kVar2.v0();
                }
                nko1.H(jw31VarA, b0kVar2, lljVar);
                nko1.H(xos0VarM4, b0kVar2, lljVar2);
                x0d.q(iHashCode4, b0kVar2, lljVar3, b0kVar2);
                nko1.H(qim0VarE4, b0kVar2, lljVar4);
                zov0 zov0Var = cbx.b(b0kVar2).g;
                zpn1.f(u291.D(u291.h(qim0Var4, 16.0f), (era) null, 3), 0L, b0kVar2, 0, 2);
                b0kVar2.r(true);
                b0kVar2.r(false);
            }
            b0kVar2.r(true);
            b0kVar2.r(true);
            qim0Var3 = qim0Var6;
        } else {
            b0kVar2.b0();
            qim0Var3 = qim0Var2;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new iux(str, uri, str2, str3, str4, i, s171Var, qim0Var3, i2, i3);
        }
    }

    public static final void p(Uri uri, String str, String str2, String str3, b0k b0kVar, int i) {
        Uri uri2;
        int i2;
        String str4;
        b0k b0kVar2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-1728940110);
        if ((i & 6) == 0) {
            uri2 = uri;
            i2 = (b0kVar3.g(uri2) ? 4 : 2) | i;
        } else {
            uri2 = uri;
            i2 = i;
        }
        if ((i & 48) == 0) {
            str4 = str;
            i2 |= b0kVar3.g(str4) ? 32 : 16;
        } else {
            str4 = str;
        }
        if ((i & 384) == 0) {
            i2 |= b0kVar3.g(str2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= b0kVar3.g(str3) ? 2048 : 1024;
        }
        if (b0kVar3.Y(i2 & 1, (i2 & 1171) != 1170)) {
            jw31 jw31VarA = ew31.a(h36.a, een.Z, b0kVar3, 0);
            int iHashCode = Long.hashCode(((x340) b0kVar3).T);
            xos0 xos0VarM = b0kVar3.m();
            nim0 nim0Var = nim0.a;
            qim0 qim0VarE = zr7.E(b0kVar3, nim0Var);
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
            nko1.H(jw31VarA, b0kVar3, y580.O0);
            nko1.H(xos0VarM, b0kVar3, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), b0kVar3, y580.R0);
            nko1.F(b0kVar3);
            nko1.H(qim0VarE, b0kVar3, y580.Y);
            jsl jslVarC = two1.C(2131962251, 0, ihc1.y0(str4) ? str2 : str4, b0kVar3);
            uwr uwrVar = cbx.a;
            zov0 zov0Var = cbx.b(b0kVar3).g;
            qim0 qim0VarR = u291.r(nim0Var, 40.0f);
            cua cuaVar = cbx.b(b0kVar3).f;
            eso1.e(uri2, jslVarC, anm1.N("text.content.thumbnail.artwork", i1p1.q(qim0VarR, er31.b(8.0f))), (p3v) null, (zvx) null, (ecx) null, (j6m) null, (tl3) null, (ColorFilter) null, (qux) null, true, false, b0kVar3, i2 & 14, 6, 3064);
            b0kVar2 = b0kVar3;
            cvx cvxVar = cbx.b(b0kVar2).b;
            j((i2 >> 6) & 126, str2, str3, b0kVar2, c13.k(nim0Var, 12.0f, b0kVar2, 1.0f, true));
            b0kVar2.r(true);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new uoc1(i, uri, str, str2, str3, (byte) 11);
        }
    }

    public static final void q(int i, b0k b0kVar, qim0 qim0Var, boolean z) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1098087235);
        int i2 = (x340Var.h(z) ? 4 : 2) | i | (x340Var.g(qim0Var) ? 32 : 16);
        if (!x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            x340Var.b0();
        } else if (z) {
            x340Var.i0(-1648965230);
            xtx xtxVar = xtx.c;
            jsl jslVar = new jsl(cwl1.o0(x340Var, 2131964168));
            uwr uwrVar = cbx.a;
            zov0 zov0Var = cbx.b(x340Var).g;
            w0h1.a(xtxVar, jslVar, u291.r(qim0Var, 12.0f), cbx.a(x340Var).b.f, 0L, true, x340Var, xtx.d | 196608, 16);
            x340Var.r(false);
        } else {
            x340Var.i0(-1648641249);
            x340Var.r(false);
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new z3z0(z, qim0Var, i, (byte) 5);
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x001a  */
    public static final lhg1 r(kak0 kak0Var) {
        lhg1 lhg1Var = kak0Var.S0;
        ruq0 ruq0Var = lhg1Var.b;
        lhg1 lhg1Var2 = null;
        if (!ruq0Var.O0 || ruq0Var.X <= 0) {
            lhg1Var = null;
        } else {
            Integer num = ruq0Var.N0;
            if ((num != null ? num.intValue() : 0) <= 0) {
                lhg1Var = null;
            }
        }
        if (lhg1Var != null) {
            return lhg1Var;
        }
        lhg1 lhg1Var3 = kak0Var.h;
        if (kak0Var.X == xx8.b) {
            ruq0 ruq0Var2 = lhg1Var3.b;
            if (ruq0Var2.O0 && ruq0Var2.X > 0) {
                lhg1Var2 = lhg1Var3;
            }
        }
        if (lhg1Var2 == null) {
            lhg1Var2 = kak0Var.s1;
        }
        return lhg1Var2 == null ? lhg1Var3 : lhg1Var2;
    }

    public static px31 s(m0u m0uVar) {
        boolean z = m0uVar.a;
        boolean z2 = m0uVar.b;
        if (z && z2) {
            return ox31.a;
        }
        if (!z) {
            return kx31.a;
        }
        if (!z2) {
            return mx31.a;
        }
        throw new IllegalStateException("This should never happen. remoteDownloadsEnabled: " + z2 + ", contextSupported: " + z);
    }

    public static final go80 t(klm klmVar, zbp0 zbp0Var, zbp0 zbp0Var2) {
        return klmVar.a("ProfileInstallerDaemon", new ocp0(zbp0Var, zbp0Var2, (byte) 5));
    }

    public static final int u(int i, List list) {
        int size = list.size();
        int i2 = 0;
        while (i2 < size) {
            int i3 = (i2 + size) >>> 1;
            if (h7p1.y((hia) list.get(i3)) < i) {
                i2 = i3 + 1;
            } else {
                size = i3;
            }
        }
        return i2;
    }

    public static void v(String str, String str2) {
        utw0 utw0Var = ike1.a;
        utw0Var.y(str);
        utw0Var.o(str2, new Object[0]);
    }

    public static final hia w(int i, List list, boolean z) {
        hia hiaVar;
        hia hiaVar2;
        int iY = y(i, list);
        do {
            iY--;
            if (-1 >= iY) {
                hiaVar = null;
                break;
            }
            hiaVar = (hia) list.get(iY);
            if (!z) {
                break;
            }
        } while (!h7p1.w(hiaVar));
        int iU = u(i, list);
        int size = list.size();
        while (true) {
            if (iU >= size) {
                hiaVar2 = null;
                break;
            }
            hiaVar2 = (hia) list.get(iU);
            if (!z || h7p1.w(hiaVar2)) {
                break;
            }
            iU++;
        }
        if (hiaVar == null && hiaVar2 == null) {
            return null;
        }
        if (hiaVar == null || hiaVar2 != null) {
            if (hiaVar != null || hiaVar2 == null) {
                if (hiaVar == null || hiaVar2 == null) {
                    return null;
                }
                if (Math.abs(h7p1.y(hiaVar) - i) <= Math.abs(h7p1.y(hiaVar2) - i)) {
                }
            }
            return hiaVar2;
        }
        return hiaVar;
    }

    public static final boolean x(hoh0 hoh0Var, int i) {
        return i > 0 && hoh0Var.c().hashCode() % i == 0;
    }

    public static final int y(int i, List list) {
        int size = list.size();
        int i2 = 0;
        while (i2 < size) {
            int i3 = (i2 + size) >>> 1;
            if (h7p1.y((hia) list.get(i3)) <= i) {
                i2 = i3 + 1;
            } else {
                size = i3;
            }
        }
        return i2;
    }
}
