package p;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.text.PlatformSpanStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import defpackage.n;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public abstract class qxy0 {
    public static b180 a;

    public static int A(int i, int i2) {
        return (i << 3) | i2;
    }

    public static final tob1 B(zau0 zau0Var, b0k b0kVar) {
        ven0 ven0VarH = rwq.h(zau0Var.b, b0kVar, 0);
        x340 x340Var = (x340) b0kVar;
        Object objT = x340Var.T();
        m4c m4cVar = fkj0.X;
        if (objT == m4cVar) {
            objT = v8r.q(((Boolean) ven0VarH.getValue()).booleanValue() ? zau0Var.a() : null);
            x340Var.s0(objT);
        }
        ven0 ven0Var = (ven0) objT;
        Boolean bool = (Boolean) ven0VarH.getValue();
        bool.booleanValue();
        boolean zI = x340Var.i(ven0VarH) | x340Var.i(ven0Var) | x340Var.i(zau0Var);
        Object objT2 = x340Var.T();
        if (zI || objT2 == m4cVar) {
            rwm0 rwm0Var = new rwm0(zau0Var, ven0VarH, ven0Var, (lnm) null, (byte) 0);
            x340Var.s0(rwm0Var);
            objT2 = rwm0Var;
        }
        qxd0.t(bool, x340Var, (vu30) objT2);
        Object objT3 = x340Var.T();
        if (objT3 == m4cVar) {
            objT3 = yv91.a(new zqe(ven0VarH, ven0Var, (byte) 8));
            x340Var.s0(objT3);
        }
        return (tob1) objT3;
    }

    public static final int C(Intent intent) {
        String stringExtra = intent.getStringExtra("glasses_start_mode");
        if (stringExtra != null) {
            int iHashCode = stringExtra.hashCode();
            if (iHashCode != -415813314) {
                if (iHashCode == 21116443 && stringExtra.equals("onboarding")) {
                    return 2;
                }
            } else if (stringExtra.equals("onboarding_post_oobe")) {
                return 3;
            }
        }
        Uri data = intent.getData();
        String string = data != null ? data.toString() : null;
        if (string == null) {
            return 0;
        }
        int iHashCode2 = string.hashCode();
        if (iHashCode2 != -1792544249) {
            return (iHashCode2 == -1774312935 && string.equals("spotify:glasses:onboarding:education")) ? 2 : 0;
        }
        return !string.equals("spotify:glasses:onboarding:account-linking-nudge") ? 0 : 1;
    }

    public static final String D(hs50 hs50Var) {
        if (hs50Var instanceof gs50) {
            int i = ((gs50) hs50Var).a.b;
            if (i != 0) {
                if (pxy0.a[l1d.C(i)] == 1) {
                    return "image_load_failure";
                }
                eg.o();
            }
            return null;
        }
        if (!(hs50Var instanceof fs50)) {
            eg.o();
            return null;
        }
        bho0 bho0Var = ((fs50) hs50Var).a;
        if (!(bho0Var instanceof bho0)) {
            if (!(bho0Var instanceof aho0)) {
                eg.o();
                return null;
            }
            int iC = l1d.C(((aho0) bho0Var).a);
            if (iC == 0 || iC == 1) {
                return "unrecognized";
            }
            if (iC == 2) {
                return "os_notifications_disabled";
            }
            eg.o();
            return null;
        }
        int iC2 = l1d.C(bho0Var.a);
        if (iC2 == 0) {
            return "accept_handler_suppressed_library_import";
        }
        if (iC2 == 1) {
            return "type_handler_suppressed_jam";
        }
        if (iC2 == 2) {
            return "type_handler_suppressed_chat";
        }
        if (iC2 == 3) {
            return "type_handler_suppressed_cmp_qa";
        }
        if (iC2 == 4) {
            return "type_handler_suppressed_kallax";
        }
        if (iC2 == 5) {
            return "accept_handler_suppressed_sales";
        }
        eg.o();
        return null;
    }

    public static final String E(ywm1 ywm1Var, Context context) {
        switch (ywm1Var.ordinal()) {
            case 0:
                return context.getString(2131964155);
            case 1:
                return context.getString(2131964153);
            case 2:
                return context.getString(2131964158);
            case 3:
            case 6:
                return context.getString(2131964160);
            case 4:
                return context.getString(2131964156);
            case 5:
                return context.getString(2131964159);
            case 7:
                return context.getString(2131964162);
            case 8:
                return context.getString(2131964157);
            case 9:
                return context.getString(2131964161);
            default:
                eg.o();
                return null;
        }
    }

    public static final void a(int i, int i2, String str, b0k b0kVar) {
        hux huxVar;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1282338222);
        int i3 = (x340Var.g(str) ? 4 : 2) | i2 | (x340Var.e(l1d.C(i)) ? 32 : 16);
        if (x340Var.Y(i3 & 1, (i3 & 19) != 18)) {
            Uri uri = Uri.parse(str == null ? "" : str);
            qim0 qim0VarD = u291.d(nim0.a, 1.0f);
            int iC = l1d.C(i);
            if (iC == 0) {
                huxVar = grx.c;
            } else if (iC == 1) {
                huxVar = akx.c;
            } else {
                if (iC != 2 && iC != 3) {
                    eg.o();
                    return;
                }
                huxVar = mrx.c;
            }
            eso1.e(uri, isl.a, qim0VarD, (p3v) null, (zvx) null, (ecx) null, (j6m) null, (tl3) null, (ColorFilter) null, new nux(huxVar, huxVar), false, false, x340Var, 1073744944, 0, 3568);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ue0(str, i, i2, (byte) 4);
        }
    }

    public static final void b(b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1357919715);
        if (x340Var.Y(i & 1, i != 0)) {
            qim0 qim0VarD = u291.d(nim0.a, 1.0f);
            uwr uwrVar = cbx.a;
            t1c.a(cwl1.l0(qim0VarD, cbx.a(x340Var).a.b.c(), (hw61) null, 14), x340Var, 0);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new htu(i, (byte) 2);
        }
    }

    public static final void c(int i, int i2, j2i j2iVar, b0k b0kVar, qim0 qim0Var, boolean z) {
        long jC;
        qqb qqbVarD;
        x340 x340Var = (x340) b0kVar;
        int i3 = i2 | (kk0.t(-139809891, i, x340Var) ? 4 : 2) | (x340Var.h(z) ? 32 : 16) | (x340Var.g(qim0Var) ? 256 : 128);
        if (x340Var.Y(i3 & 1, (i3 & 1171) != 1170)) {
            qim0 qim0VarB = uyn1.B(qim0Var, z ? 80.0f : 0.0f, 0.0f, !z ? 80.0f : 0.0f, 0.0f, 10);
            iac iacVar = new iac(i);
            if (z) {
                x340Var.i0(1042323454);
                uwr uwrVar = cbx.a;
                jC = cbx.a(x340Var).a.a.c();
                x340Var.r(false);
            } else {
                x340Var.i0(1042260524);
                uwr uwrVar2 = cbx.a;
                jC = cbx.a(x340Var).a.c;
                x340Var.r(false);
            }
            qsd qsdVarM = s3o1.m(jC, x340Var, 0);
            if (z) {
                x340Var.i0(1042524303);
                x340Var.r(false);
                qqbVarD = null;
            } else {
                x340Var.i0(1042437906);
                qqbVarD = k1u.d(1.0f, cbx.a(x340Var).a.a.c());
                x340Var.r(false);
            }
            l4o1.b(qim0VarB, iacVar, qsdVarM, (ltd) null, qqbVarD, j2iVar, x340Var, 196608, 8);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new py3(i, i2, j2iVar, qim0Var, z);
        }
    }

    /* JADX WARN: Code duplicated, block: B:47:0x0140  */
    /* JADX WARN: Code duplicated, block: B:49:0x0147  */
    /* JADX WARN: Code duplicated, block: B:50:0x014d  */
    /* JADX WARN: Code duplicated, block: B:55:0x017d  */
    /* JADX WARN: Code duplicated, block: B:58:0x018d  */
    /* JADX WARN: Code duplicated, block: B:60:0x0195  */
    /* JADX WARN: Code duplicated, block: B:63:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:65:0x01d9  */
    public static final void d(z3l z3lVar, qim0 qim0Var, boolean z, boolean z2, lee1 lee1Var, long j, long j2, String str, b0k b0kVar, int i) {
        qim0 qim0Var2;
        lee1 lee1Var2;
        long j3;
        long j4;
        String str2;
        h311 h311VarV;
        s3l s3lVar;
        qim0 qim0Var3;
        String strO0;
        long j5;
        long j6;
        yvg1 yvg1Var;
        String str3;
        long j7;
        long j8;
        long j9;
        String str4;
        jw31 jw31VarA;
        int iHashCode;
        xos0 xos0VarM;
        qim0 qim0VarE;
        boolean z3;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1438248602);
        int i2 = i | (x340Var.g(z3lVar) ? 4 : 2) | 48 | (x340Var.h(z) ? 256 : 128) | (x340Var.h(z2) ? 2048 : 1024) | 4792320;
        if (x340Var.Y(i2 & 1, (4793491 & i2) != 4793490)) {
            x340Var.d0();
            int i3 = i & 1;
            qim0 qim0VarN = nim0.a;
            if (i3 == 0 || x340Var.E()) {
                uwr uwrVar = cbx.a;
                lee1 lee1Var3 = cbx.d(x340Var).m;
                long j10 = cbx.a(x340Var).b.c;
                long j11 = cbx.a(x340Var).b.a;
                lee1Var2 = lee1Var3;
                qim0Var3 = qim0VarN;
                strO0 = cwl1.o0(x340Var, 2131954232);
                j5 = j10;
                j6 = j11;
            } else {
                x340Var.b0();
                qim0Var3 = qim0Var;
                lee1Var2 = lee1Var;
                j6 = j2;
                strO0 = str;
                j5 = j;
            }
            x340Var.s();
            if (!(z3lVar instanceof y3l)) {
                if (z3lVar instanceof x3l) {
                    yvg1Var = new yvg1(strO0, ((x3l) z3lVar).a, new u7h(j6));
                } else if (!(z3lVar instanceof w3l)) {
                    eg.o();
                    return;
                } else {
                    w3l w3lVar = (w3l) z3lVar;
                    yvg1Var = new yvg1(w3lVar.a, w3lVar.b, new u7h(j5));
                }
                str3 = (String) yvg1Var.a;
                xvd1 xvd1Var = (xvd1) yvg1Var.b;
                j7 = ((u7h) yvg1Var.c).a;
                if (str3.length() == 0 || xvd1Var != null) {
                    j8 = j5;
                    j9 = j6;
                    str4 = strO0;
                    fra fraVar = een.N0;
                    uwr uwrVar2 = cbx.a;
                    cvx cvxVar = cbx.b(x340Var).b;
                    jw31VarA = ew31.a(new d36(4.0f, true, new um5(false)), fraVar, x340Var, 0);
                    iHashCode = Long.hashCode(x340Var.T);
                    xos0VarM = x340Var.m();
                    qim0VarE = zr7.E(x340Var, qim0Var3);
                    hzj.A.getClass();
                    if (x340Var.a != null) {
                        tgp1.p();
                        throw 0;
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
                    if (z || xvd1Var == null) {
                        z3 = false;
                        x340Var.i0(-1525997472);
                        x340Var.r(false);
                    } else {
                        x340Var.i0(-1526061859);
                        z3 = false;
                        m(xvd1Var, j7, x340Var, 0);
                        x340Var.r(false);
                    }
                    if (str3.length() > 0) {
                        x340Var.i0(-1525960613);
                        if (z2) {
                            qim0VarN = e9k.n(63, qim0VarN);
                        }
                        lee1 lee1Var4 = lee1Var2;
                        uwo1.e(str3, qim0VarN, lee1Var4, j7, (a0e1) null, (iu30) null, 2, false, new cjc0(1), 0, (qx8) null, x340Var, 0, 0, 1712);
                        lee1Var2 = lee1Var4;
                        x340Var.r(false);
                    } else {
                        x340Var.i0(-1525679040);
                        x340Var.r(z3);
                    }
                    x340Var.r(true);
                    j4 = j9;
                    str2 = str4;
                    j3 = j8;
                    qim0Var2 = qim0Var3;
                } else {
                    h311VarV = x340Var.v();
                    if (h311VarV == null) {
                        return;
                    } else {
                        s3lVar = new s3l(z3lVar, qim0Var3, z, z2, lee1Var2, j5, j6, strO0, i, (byte) 0);
                    }
                }
                h311VarV.d = s3lVar;
            }
            yvg1Var = new yvg1(((y3l) z3lVar).a, (Object) null, new u7h(j6));
            str3 = (String) yvg1Var.a;
            xvd1 xvd1Var2 = (xvd1) yvg1Var.b;
            j7 = ((u7h) yvg1Var.c).a;
            if (str3.length() == 0) {
            }
            j8 = j5;
            j9 = j6;
            str4 = strO0;
            fra fraVar2 = een.N0;
            uwr uwrVar3 = cbx.a;
            cvx cvxVar2 = cbx.b(x340Var).b;
            jw31VarA = ew31.a(new d36(4.0f, true, new um5(false)), fraVar2, x340Var, 0);
            iHashCode = Long.hashCode(x340Var.T);
            xos0VarM = x340Var.m();
            qim0VarE = zr7.E(x340Var, qim0Var3);
            hzj.A.getClass();
            if (x340Var.a != null) {
                tgp1.p();
                throw 0;
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
                z3 = false;
                x340Var.i0(-1525997472);
                x340Var.r(false);
            } else {
                z3 = false;
                x340Var.i0(-1525997472);
                x340Var.r(false);
            }
            if (str3.length() > 0) {
                x340Var.i0(-1525960613);
                if (z2) {
                    qim0VarN = e9k.n(63, qim0VarN);
                }
                lee1 lee1Var5 = lee1Var2;
                uwo1.e(str3, qim0VarN, lee1Var5, j7, (a0e1) null, (iu30) null, 2, false, new cjc0(1), 0, (qx8) null, x340Var, 0, 0, 1712);
                lee1Var2 = lee1Var5;
                x340Var.r(false);
            } else {
                x340Var.i0(-1525679040);
                x340Var.r(z3);
            }
            x340Var.r(true);
            j4 = j9;
            str2 = str4;
            j3 = j8;
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
            lee1Var2 = lee1Var;
            j3 = j;
            j4 = j2;
            str2 = str;
        }
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            s3lVar = new s3l(z3lVar, qim0Var2, z, z2, lee1Var2, j3, j4, str2, i, (byte) 1);
            h311VarV.d = s3lVar;
        }
    }

    public static final void e(w0v w0vVar, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        b0k b0kVar2;
        qim0 qim0Var2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(1209581387);
        if ((i & 6) == 0) {
            i2 = i | ((i & 8) == 0 ? b0kVar3.g(w0vVar) : b0kVar3.i(w0vVar) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= b0kVar3.i(iu30Var) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if (b0kVar3.Y(i3 & 1, (i3 & 147) != 146)) {
            p0v p0vVar = w0vVar.a;
            u0v u0vVar = w0vVar.b;
            r0v r0vVar = u0vVar instanceof r0v ? (r0v) u0vVar : null;
            boolean zJ = u890.j(u0vVar, s0v.a);
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarN = anm1.N("download_session_row_test_tag", u291.f(qim0Var3, 1.0f));
            uwr uwrVar = cbx.a;
            zov0 zov0Var = cbx.b(b0kVar3).g;
            cvx cvxVar = cbx.b(b0kVar3).b;
            cvx cvxVar2 = cbx.b(b0kVar3).b;
            cvx cvxVar3 = cbx.b(b0kVar3).b;
            uvx uvxVar = new uvx((pgx) null, 3, new tvx(2.0f, 12.0f, 8.0f), new p3v(64.0f), 2);
            boolean z = (i3 & 112) == 32;
            Object objT = b0kVar3.T();
            if (z || objT == fkj0.X) {
                objT = new q7u(iu30Var, (byte) 5);
                b0kVar3.s0(objT);
            }
            b0kVar2 = b0kVar3;
            jto1.b(qim0VarN, uvxVar, (max) null, false, (idn0) null, (ga80) null, new gbx(z50.c, (Function0) objT), (gbx) null, (xu30) null, apo.r(96794690, new x0v(zJ, r0vVar, p0vVar, (byte) 0), b0kVar3), (xu30) null, apo.r(2039931011, new x0v(zJ, p0vVar, r0vVar), b0kVar3), apo.r(-2005757884, new nzd((Object) p0vVar, (Object) r0vVar, (Object) iu30Var, (byte) 21), b0kVar3), (xu30) null, (xu30) null, apo.r(-1257922681, new x0v(zJ, r0vVar, p0vVar, (byte) 2), b0kVar3), b0kVar2, 805306432, 197040, 26044);
            qim0Var2 = qim0Var3;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new x8t((byte) 9, i, (Object) w0vVar, (Object) qim0Var2, iu30Var);
        }
    }

    public static final void f(Function0 function0, Function0 function1, Function0 function2, Function0 function3, Function0 function4, Function0 function5, Function0 function6, gpq0 gpq0Var, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        b0k b0kVar2;
        qim0 qim0Var2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(332072266);
        if ((i & 6) == 0) {
            i2 = i | (b0kVar3.i(function0) ? 4 : 2);
        } else {
            i2 = i;
        }
        int i3 = i2 | (b0kVar3.i(function1) ? 32 : 16) | (b0kVar3.i(function2) ? 256 : 128) | (b0kVar3.i(function3) ? 2048 : 1024) | (b0kVar3.i(function4) ? 16384 : 8192) | (b0kVar3.i(function5) ? 131072 : 65536) | (b0kVar3.i(function6) ? 1048576 : 524288);
        if ((i & 12582912) == 0) {
            i3 |= (i & 16777216) == 0 ? b0kVar3.g(gpq0Var) : b0kVar3.i(gpq0Var) ? 8388608 : 4194304;
        }
        int i4 = i3 | 100663296;
        if (b0kVar3.Y(i4 & 1, (38347923 & i4) != 38347922)) {
            b0kVar2 = b0kVar3;
            nyx.a(2, (wux) null, apo.r(-1122067369, new n(gpq0Var, function0, function1, function2, function3, function4, function5, function6), b0kVar3), b0kVar2, 3078, 6);
            qim0Var2 = nim0.a;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new ne00(function0, function1, function2, function3, function4, function5, function6, gpq0Var, qim0Var2, i, (byte) 3);
        }
    }

    public static final void g(String str, String str2, Function0 function0, Function0 function1, qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(205712640);
        int i2 = i | (x340Var.g(str) ? 4 : 2) | (x340Var.g(str2) ? 32 : 16) | (x340Var.i(function0) ? 256 : 128) | (x340Var.i(function1) ? 2048 : 1024) | 24576;
        if (x340Var.Y(i2 & 1, (i2 & 9363) != 9362)) {
            String strO0 = cwl1.o0(x340Var, 2131957493);
            String strO1 = cwl1.o0(x340Var, 2131957494);
            boolean z = (i2 & 112) == 32;
            Object objT = x340Var.T();
            if (z || objT == fkj0.X) {
                if (str2 == null || (objT = Uri.parse(str2)) == null) {
                    objT = Uri.EMPTY;
                }
                x340Var.s0(objT);
            }
            x74.f(function1, (scx) null, (mfx) null, false, false, 0.0f, false, Boolean.TRUE, false, false, (vu30) null, apo.r(-1483301471, new jb1(strO1, function0, (Uri) objT, str, strO0), x340Var), x340Var, ((i2 >> 9) & 14) | 113246208, 48, 1662);
            qim0Var2 = nim0.a;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ogs0(str, str2, function0, function1, qim0Var2, i, (byte) 1);
        }
    }

    public static final void h(int i, Function0 function0, b0k b0kVar, qim0 qim0Var) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-52419159);
        int i2 = i | (x340Var.i(function0) ? 4 : 2) | 48;
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarX = bin.x(u291.f(qim0Var3, 1.0f), false, (String) null, (pm31) null, (idn0) null, function0, 15);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            qim0 qim0VarX2 = uyn1.x(qim0VarX, 16.0f);
            jw31 jw31VarA = ew31.a(h36.a, een.N0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarX2);
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
            cmx cmxVar = cmx.c;
            zov0 zov0Var = cbx.b(x340Var).g;
            w0h1.a(cmxVar, isl.a, u291.r(qim0Var3, 16.0f), 0L, 0L, false, x340Var, cmx.d | 48, 56);
            String strO0 = cwl1.o0(x340Var, 2131960710);
            cvx cvxVar2 = cbx.b(x340Var).b;
            uwo1.e(strO0, uyn1.B(qim0Var3, 8.0f, 0.0f, 0.0f, 0.0f, 14), cbx.d(x340Var).j, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 0, 0, 2040);
            x340Var.r(true);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new bb50(function0, qim0Var2, i, (byte) 16);
        }
    }

    public static final void i(int i, String str, Function0 function0, b0k b0kVar, hux huxVar, qim0 qim0Var) {
        Function0 function1 = function0;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-238821743);
        j06 j06Var = x340Var.a;
        int i2 = i | (x340Var.g(str) ? 4 : 2) | (x340Var.i(function1) ? 32 : 16) | (x340Var.i(huxVar) ? 256 : 128) | (x340Var.i(qim0Var) ? 2048 : 1024);
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            jw31 jw31VarA = ew31.a(h36.a, een.N0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0Var);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            boolean z = x340Var.S;
            n4k n4kVar = hmb0.t1;
            if (z) {
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
            nko1.H(qim0VarE, x340Var, lljVar4);
            uwr uwrVar = cbx.a;
            zov0 zov0Var = cbx.b(x340Var).g;
            nim0 nim0Var = nim0.a;
            w0h1.a(huxVar, isl.a, u291.r(nim0Var, 32.0f), cbx.a(x340Var).b.c, 0L, false, x340Var, 56 | ((i2 >> 6) & 14), 48);
            cvx cvxVar = cbx.b(x340Var).b;
            wnb0 wnb0VarK = c13.k(nim0Var, 16.0f, x340Var, 1.0f, true);
            Object objT = x340Var.T();
            if (objT == fkj0.X) {
                objT = rfq0.f;
                x340Var.s0(objT);
            }
            qim0 qim0VarB = s161.b(wnb0VarK, true, (iu30) objT);
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0VarB);
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
            uwo1.e(cwl1.o0(x340Var, 2131956003), (qim0) null, cbx.d(x340Var).j, cbx.a(x340Var).b.b, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 0, 0, 2034);
            uwo1.e(str, (qim0) null, cbx.d(x340Var).g, cbx.a(x340Var).b.a, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, i2 & 14, 0, 2034);
            x340Var = x340Var;
            x340Var.r(true);
            cvx cvxVar2 = cbx.b(x340Var).b;
            op71.g(x340Var, u291.v(nim0Var, 16.0f));
            function1 = function0;
            foo1.g(new gbx(z50.c, function1), (qim0) null, (max) null, yla.s(x340Var), (idn0) null, (vu30) null, (vu30) null, e5j.a, x340Var, 12582912, 118);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new b2o0(i, (Object) str, (Object) function1, (Object) huxVar, (Object) qim0Var, (byte) 5);
        }
    }

    public static final void j(o0v o0vVar, b0k b0kVar, int i) {
        int i2;
        long j;
        int i3;
        int i4;
        String strN0;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(252733778);
        int i5 = i | (x340Var.g(o0vVar) ? 4 : 2) | (x340Var.e(l1d.C(1)) ? 32 : 16);
        if (!x340Var.Y(i5 & 1, (i5 & 19) != 18)) {
            x340Var.b0();
        } else if (o0vVar instanceof l0v) {
            x340Var.i0(114436217);
            int iC = l1d.C(1);
            if (iC == 0) {
                i4 = 2131955060;
            } else if (iC == 1) {
                i4 = 2131955057;
            } else {
                if (iC != 2) {
                    eg.o();
                    return;
                }
                i4 = 2131955067;
            }
            String strO0 = cwl1.o0(x340Var, i4);
            l0v l0vVar = (l0v) o0vVar;
            int i6 = l0vVar.b;
            if (i6 > 0) {
                x340Var.i0(114525652);
                strN0 = cwl1.n0(2131955069, new Object[]{strO0, cwl1.n0(2131955064, new Object[]{Integer.valueOf(l0vVar.a), Integer.valueOf(i6)}, x340Var)}, x340Var);
                x340Var.r(false);
            } else {
                x340Var.i0(114805365);
                x340Var.r(false);
                strN0 = strO0;
            }
            long j2 = cbx.a(x340Var).b.c;
            uwr uwrVar = cbx.a;
            long j3 = cbx.a(x340Var).b.b;
            ye5 ye5Var = new ye5();
            int iO = ye5Var.o(new zma1(j3, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, 65534));
            try {
                ye5Var.g(strN0);
                ye5Var.k(iO);
                int iW0 = ihc1.w0(strN0, strO0, 0, false, 6);
                if (iW0 >= 0) {
                    ye5Var.d(new zma1(j2, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, 65534), iW0, strO0.length() + iW0);
                }
                uwo1.f(ye5Var.p(), (qim0) null, cbx.d(x340Var).j, (x9h) null, (a0e1) null, (iu30) null, 2, false, new cjc0(1), 0, (qx8) null, (cqs0) null, x340Var, 0, 0, 3770);
                x340Var.r(false);
            } catch (Throwable th) {
                ye5Var.k(iO);
                throw th;
            }
        } else if (o0vVar.equals(k0v.a)) {
            x340Var.i0(-1935939577);
            int iC2 = l1d.C(1);
            if (iC2 == 0) {
                i3 = 2131955059;
            } else if (iC2 == 1) {
                i3 = 2131955056;
            } else {
                if (iC2 != 2) {
                    eg.o();
                    return;
                }
                i3 = 2131955066;
            }
            k(cwl1.o0(x340Var, i3), cbx.a(x340Var).b.c, x340Var, 0);
            x340Var.r(false);
        } else if (o0vVar.equals(n0v.a)) {
            x340Var.i0(-1935935910);
            String strO1 = cwl1.o0(x340Var, 2131955065);
            uwr uwrVar2 = cbx.a;
            k(strO1, cbx.a(x340Var).b.b, x340Var, 0);
            x340Var.r(false);
        } else {
            if (!(o0vVar instanceof m0v)) {
                throw p3d1.k(x340Var, -1935972109, false);
            }
            x340Var.i0(-1935930325);
            int i7 = ((m0v) o0vVar).a;
            int iC3 = l1d.C(i7);
            if (iC3 == 0) {
                i2 = 2131955068;
            } else if (iC3 == 1) {
                i2 = 2131955062;
            } else if (iC3 == 2) {
                i2 = 2131955058;
            } else if (iC3 == 3) {
                i2 = 2131955061;
            } else {
                if (iC3 != 4) {
                    eg.o();
                    return;
                }
                i2 = 2131955063;
            }
            String strO2 = cwl1.o0(x340Var, i2);
            int iC4 = l1d.C(i7);
            if (iC4 == 0 || iC4 == 1) {
                x340Var.i0(345665381);
                uwr uwrVar3 = cbx.a;
                j = cbx.a(x340Var).b.b;
                x340Var.r(false);
            } else if (iC4 == 2) {
                x340Var.i0(345660810);
                uwr uwrVar4 = cbx.a;
                j = cbx.a(x340Var).b.g;
                x340Var.r(false);
            } else if (iC4 != 3) {
                if (iC4 != 4) {
                    throw p3d1.k(x340Var, 345659092, false);
                }
                x340Var.i0(345665381);
                uwr uwrVar5 = cbx.a;
                j = cbx.a(x340Var).b.b;
                x340Var.r(false);
            } else {
                x340Var.i0(345662597);
                uwr uwrVar6 = cbx.a;
                j = cbx.a(x340Var).b.e;
                x340Var.r(false);
            }
            k(strO2, j, x340Var, 0);
            x340Var.r(false);
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new utt(o0vVar, i, (byte) 6);
        }
    }

    public static final void k(String str, long j, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1148850363);
        int i2 = i | (x340Var.g(str) ? 4 : 2) | (x340Var.f(j) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            uwr uwrVar = cbx.a;
            uwo1.e(str, (qim0) null, cbx.d(x340Var).j, j, (a0e1) null, (iu30) null, 2, false, new cjc0(1), 0, (qx8) null, x340Var, (i2 & 14) | ((i2 << 6) & 7168), 0, 1714);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new icc(str, j, i, (byte) 3);
        }
    }

    public static final void l(c380 c380Var, b0k b0kVar, int i) {
        h311 h311VarV;
        i90 i90Var;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1649314491);
        int i2 = (x340Var.i(c380Var) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            if (c380Var.isEmpty()) {
                h311VarV = x340Var.v();
                if (h311VarV == null) {
                    return;
                } else {
                    i90Var = new i90(c380Var, i, (byte) 6);
                }
            } else {
                w2g0.c(u291.d(nim0.a, 1.0f), een.h, apo.r(1614507537, new cy00((wat) x340Var.k(t4k.h), c380Var, (gw70) x340Var.k(oi7.a), (byte) 29), x340Var), x340Var, 3126, 4);
            }
            h311VarV.d = i90Var;
        }
        x340Var.b0();
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            i90Var = new i90(c380Var, i, (byte) 7);
            h311VarV.d = i90Var;
        }
    }

    public static final void m(xvd1 xvd1Var, long j, b0k b0kVar, int i) {
        hux huxVar;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1275338198);
        int i2 = (x340Var.e(xvd1Var.ordinal()) ? 4 : 2) | i | (x340Var.f(j) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            int iOrdinal = xvd1Var.ordinal();
            if (iOrdinal == 0) {
                huxVar = rlx.c;
            } else if (iOrdinal == 1) {
                huxVar = wkx.c;
            } else if (iOrdinal == 2) {
                huxVar = yjx.c;
            } else {
                if (iOrdinal != 3) {
                    if (iOrdinal != 4) {
                        eg.o();
                        return;
                    }
                    h311 h311VarV = x340Var.v();
                    if (h311VarV != null) {
                        h311VarV.d = new t3l(xvd1Var, j, i, (byte) 1);
                        return;
                    }
                    return;
                }
                huxVar = vsx.c;
            }
            hux huxVar2 = huxVar;
            uwr uwrVar = cbx.a;
            zov0 zov0Var = cbx.b(x340Var).g;
            w0h1.a(huxVar2, isl.a, u291.r(nim0.a, 12.0f), j, 0L, false, x340Var, 56 | ((i2 << 6) & 7168), 48);
        } else {
            j = j;
            i = i;
            x340Var.b0();
        }
        h311 h311VarV2 = x340Var.v();
        if (h311VarV2 != null) {
            h311VarV2.d = new t3l(xvd1Var, j, i, (byte) 0);
        }
    }

    public static final void n(float f, int i, long j, b0k b0kVar) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1377915245);
        int i2 = (x340Var.f(j) ? 32 : 16) | i;
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            qim0 qim0VarH = u291.h(u291.f(nim0.a, f), ((wat) x340Var.k(t4k.h)).y(j));
            uwr uwrVar = cbx.a;
            long jC = cbx.a(x340Var).a.b.c();
            cua cuaVar = cbx.b(x340Var).f;
            t1c.a(cwl1.l0(qim0VarH, jC, er31.b(6.0f), 12), x340Var, 0);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new y0v(f, j, i);
        }
    }

    public static final void o(gpq0 gpq0Var, Function0 function0, Function0 function1, qim0 qim0Var, b0k b0kVar, int i) {
        boolean z;
        boolean z2;
        fpq0 fpq0Var = gpq0Var.f;
        jo31 jo31Var = fpq0Var.b;
        jo31 jo31Var2 = fpq0Var.a;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(124987444);
        int i2 = i | (x340Var.i(gpq0Var) ? 4 : 2) | (x340Var.i(function0) ? 32 : 16) | (x340Var.i(function1) ? 256 : 128) | (x340Var.i(qim0Var) ? 2048 : 1024);
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
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
            boolean z3 = jo31Var2 instanceof epq0;
            boolean z4 = jo31Var instanceof epq0;
            if (z3) {
                x340Var.i0(1690631164);
                epq0 epq0Var = (epq0) jo31Var2;
                z = z4;
                z2 = false;
                fn31.g(cwl1.o0(x340Var, epq0Var.d), cwl1.o0(x340Var, epq0Var.e), f5p1.k(x340Var, epq0Var.i), function0, (qim0) null, epq0Var.g, epq0Var.f, epq0Var.h, x340Var, (i2 << 6) & 7168);
                x340Var.r(false);
            } else {
                z = z4;
                z2 = false;
                x340Var.i0(1691088600);
                x340Var.r(false);
            }
            if (z3 && z) {
                x340Var.i0(1691159559);
                uwr uwrVar = cbx.a;
                cvx cvxVar = cbx.b(x340Var).b;
                x0d.s(nim0.a, 16.0f, x340Var, z2);
            } else {
                x340Var.i0(1691237400);
                x340Var.r(z2);
            }
            if (z) {
                x340Var.i0(1691295773);
                epq0 epq0Var2 = (epq0) jo31Var;
                fn31.g(cwl1.o0(x340Var, epq0Var2.d), cwl1.o0(x340Var, epq0Var2.e), f5p1.k(x340Var, epq0Var2.i), function1, (qim0) null, epq0Var2.g, epq0Var2.f, epq0Var2.h, x340Var, (i2 << 3) & 7168);
                x340Var.r(z2);
            } else {
                x340Var.i0(1691813752);
                x340Var.r(z2);
            }
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new b2o0(i, (Object) gpq0Var, (Object) function0, (Object) function1, (Object) qim0Var, (byte) 6);
        }
    }

    public static final void p(p0v p0vVar, String str, iu30 iu30Var, b0k b0kVar, int i) {
        iu30 iu30Var2;
        x340 x340Var;
        h311 h311VarV;
        z0v z0vVar;
        boolean z;
        String str2;
        String str3;
        p1v k1vVar;
        m4c m4cVar = fkj0.X;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(-970681724);
        int i2 = (x340Var2.i(iu30Var) ? 256 : 128) | i | (x340Var2.g(p0vVar) ? 4 : 2) | (x340Var2.g(str) ? 32 : 16);
        if (x340Var2.Y(i2 & 1, (i2 & 147) != 146)) {
            o0v o0vVar = p0vVar.e;
            boolean z2 = o0vVar instanceof m0v;
            m0v m0vVar = z2 ? (m0v) o0vVar : null;
            int i3 = m0vVar != null ? m0vVar.a : 0;
            int i4 = i3 == 0 ? -1 : a1v.a[l1d.C(i3)];
            nim0 nim0Var = nim0.a;
            if (i4 == 2) {
                iu30Var2 = iu30Var;
                x340Var = x340Var2;
                x340Var.i0(-817214005);
                String strO0 = cwl1.o0(x340Var, 2131955054);
                z = (i2 & 896) == 256;
                Object objT = x340Var.T();
                if (z || objT == m4cVar) {
                    objT = new q7u(iu30Var2, (byte) 7);
                    x340Var.s0(objT);
                }
                Function0 function0 = (Function0) objT;
                qim0 qim0VarN = anm1.N("download_session_retry_button_test_tag", nim0Var);
                if (str == null) {
                    x340Var.i0(436399983);
                    x340Var.r(false);
                    str2 = null;
                } else {
                    x340Var.i0(436399984);
                    String strN0 = cwl1.n0(2131955055, new Object[]{str}, x340Var);
                    x340Var.r(false);
                    str2 = strN0;
                }
                q(0, strO0, str2, function0, x340Var, qim0VarN);
                x340Var.r(false);
            } else {
                if (i4 != 3) {
                    x340Var2.i0(436507213);
                    if (o0vVar.equals(n0v.a)) {
                        k1vVar = new k1v(Float.valueOf(0.0f));
                    } else if (o0vVar instanceof l0v) {
                        k1vVar = new k1v(Float.valueOf(((l0v) o0vVar).c));
                    } else if (o0vVar.equals(k0v.a)) {
                        k1vVar = i1v.a;
                    } else {
                        if (!z2) {
                            eg.o();
                            return;
                        }
                        int iC = l1d.C(((m0v) o0vVar).a);
                        if (iC != 0 && iC != 1 && iC != 2 && iC != 3 && iC != 4) {
                            eg.o();
                            return;
                        }
                        k1vVar = null;
                    }
                    if (k1vVar == null) {
                        x340Var2.r(false);
                        h311VarV = x340Var2.v();
                        if (h311VarV == null) {
                            return;
                        } else {
                            z0vVar = new z0v(p0vVar, str, iu30Var, i, (byte) 1);
                        }
                    } else {
                        iu30Var2 = iu30Var;
                        sru sruVar = new sru(k1vVar, (String) null, str, (String) null, 10);
                        z = (i2 & 896) == 256;
                        Object objT2 = x340Var2.T();
                        if (z || objT2 == m4cVar) {
                            objT2 = new q7u(iu30Var2, (byte) 8);
                            x340Var2.s0(objT2);
                        }
                        hqq0.f(sruVar, new gbx(z50.c, (Function0) objT2), anm1.N("download_session_download_button_test_tag", nim0Var), x340Var2, 0, 0);
                        x340Var = x340Var2;
                        x340Var.r(false);
                    }
                    h311VarV.d = z0vVar;
                }
                iu30Var2 = iu30Var;
                x340Var = x340Var2;
                x340Var.i0(-817226916);
                String strO1 = cwl1.o0(x340Var, 2131955075);
                z = (i2 & 896) == 256;
                Object objT3 = x340Var.T();
                if (z || objT3 == m4cVar) {
                    objT3 = new q7u(iu30Var2, (byte) 6);
                    x340Var.s0(objT3);
                }
                Function0 function1 = (Function0) objT3;
                qim0 qim0VarN2 = anm1.N("download_session_use_cellular_button_test_tag", nim0Var);
                if (str == null) {
                    x340Var.i0(436018962);
                    x340Var.r(false);
                    str3 = null;
                } else {
                    x340Var.i0(436018963);
                    String strN1 = cwl1.n0(2131955080, new Object[]{str}, x340Var);
                    x340Var.r(false);
                    str3 = strN1;
                }
                q(0, strO1, str3, function1, x340Var, qim0VarN2);
                x340Var.r(false);
            }
        } else {
            iu30Var2 = iu30Var;
            x340Var = x340Var2;
            x340Var.b0();
        }
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            z0vVar = new z0v(p0vVar, str, iu30Var2, i, (byte) 0);
            h311VarV.d = z0vVar;
        }
    }

    public static final void q(int i, String str, String str2, Function0 function0, b0k b0kVar, qim0 qim0Var) {
        b0k b0kVar2;
        qim0 qim0Var2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(539312584);
        int i2 = i | (b0kVar3.g(str) ? 4 : 2) | (b0kVar3.i(function0) ? 32 : 16) | (b0kVar3.i(qim0Var) ? 256 : 128) | (b0kVar3.g(str2) ? 2048 : 1024);
        if (b0kVar3.Y(i2 & 1, (i2 & 1171) != 1170)) {
            gbx gbxVar = new gbx(z50.c, function0);
            jdx jdxVar = jdx.c;
            gdx gdxVarS = yla.s(b0kVar3);
            if (str2 != null) {
                b0kVar3.i0(-811118523);
                boolean z = (i2 & 7168) == 2048;
                Object objT = b0kVar3.T();
                if (z || objT == fkj0.X) {
                    objT = new i3o(str2, (byte) 21);
                    b0kVar3.s0(objT);
                }
                qim0 qim0VarB = s161.b(qim0Var, false, (iu30) objT);
                b0kVar3.r(false);
                qim0Var2 = qim0VarB;
            } else {
                b0kVar3.i0(-811030080);
                b0kVar3.r(false);
                qim0Var2 = qim0Var;
            }
            b0kVar2 = b0kVar3;
            foo1.c(gbxVar, jdxVar, qim0Var2, (max) null, gdxVarS, (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, apo.r(850804201, new b4(str, str2, (byte) 6), b0kVar3), b0kVar2, 0, 48, 2008);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new hq6(str, function0, qim0Var, str2, i, (byte) 2);
        }
    }

    public static final f1r r(f1r f1rVar) {
        return f1rVar instanceof dz3 ? f1rVar : new dz3(f1rVar);
    }

    public static final void s(y341 y341Var, String str) {
        d441 d441VarG1 = y341Var.g1(str);
        try {
            d441VarG1.f1();
            o0c.v(d441VarG1, (Throwable) null);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                o0c.v(d441VarG1, th);
                throw th2;
            }
        }
    }

    public static final qim0 t(qim0 qim0Var, boolean z, idn0 idn0Var) {
        return qim0Var.then(z ? new j030(idn0Var) : nim0.a);
    }

    public static /* synthetic */ qim0 u(qim0 qim0Var, idn0 idn0Var, int i) {
        if ((i & 2) != 0) {
            idn0Var = null;
        }
        return t(qim0Var, true, idn0Var);
    }

    public static final b180 v() {
        b180 b180Var = a;
        if (b180Var != null) {
            return b180Var;
        }
        a180 a180Var = new a180("Encore.Vector.GearsActive24", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i = bui1.a;
        n6a1 n6a1Var = new n6a1(u7h.b);
        cwh0 cwh0VarQ = rjx.q(21.565f, 10.756f, 1.63f, 0.604f);
        cwh0VarQ.c(1.0f, 1.0f, false, true, 0.652f, 0.955f);
        cwh0VarQ.c(12.1f, 12.1f, false, true, -1.1f, 4.822f);
        cwh0VarQ.c(1.0f, 1.0f, false, true, -1.002f, 0.578f);
        cwh0VarQ.k(-1.994f, -0.185f);
        cwh0VarQ.g(-0.203f, 0.0f, -0.422f, 0.12f, -0.586f, 0.32f);
        cwh0VarQ.g(-0.18f, 0.221f, -0.25f, 0.49f, -0.18f, 0.702f);
        cwh0VarQ.k(0.612f, 1.858f);
        cwh0VarQ.c(1.0f, 1.0f, false, true, -0.34f, 1.106f);
        cwh0VarQ.c(12.1f, 12.1f, false, true, -4.455f, 2.146f);
        cwh0VarQ.c(1.0f, 1.0f, false, true, -1.077f, -0.423f);
        cwh0VarQ.k(-1.123f, -1.714f);
        cwh0VarQ.g(-0.11f, -0.17f, -0.341f, -0.275f, -0.602f, -0.275f);
        cwh0VarQ.g(-0.242f, 0.0f, -0.456f, 0.097f, -0.559f, 0.255f);
        cwh0VarQ.k(-1.136f, 1.734f);
        cwh0VarQ.c(1.0f, 1.0f, false, true, -1.076f, 0.423f);
        cwh0VarQ.c(12.1f, 12.1f, false, true, -4.456f, -2.145f);
        cwh0VarQ.c(1.0f, 1.0f, false, true, -0.34f, -1.105f);
        cwh0VarQ.k(0.6f, -1.822f);
        cwh0VarQ.g(0.071f, -0.22f, 0.0f, -0.498f, -0.188f, -0.727f);
        cwh0VarQ.g(-0.168f, -0.205f, -0.394f, -0.328f, -0.604f, -0.328f);
        cwh0VarQ.k(-0.051f, 0.002f);
        cwh0VarQ.k(-1.934f, 0.182f);
        cwh0VarQ.c(1.0f, 1.0f, false, true, -1.002f, -0.578f);
        cwh0VarQ.c(12.1f, 12.1f, false, true, -1.1f, -4.821f);
        cwh0VarQ.c(1.0f, 1.0f, false, true, 0.651f, -0.956f);
        cwh0VarQ.k(1.62f, -0.6f);
        cwh0VarQ.g(0.253f, -0.095f, 0.457f, -0.368f, 0.531f, -0.715f);
        cwh0VarQ.g(0.07f, -0.326f, 0.002f, -0.635f, -0.183f, -0.827f);
        cwh0VarQ.j(1.6f, 8.003f);
        cwh0VarQ.c(1.0f, 1.0f, false, true, -0.173f, -1.143f);
        cwh0VarQ.b(12.1f, 12.1f, false, true, 4.51f, 2.993f);
        cwh0VarQ.c(1.0f, 1.0f, false, true, 1.153f, -0.085f);
        cwh0VarQ.k(1.318f, 0.794f);
        cwh0VarQ.c(0.8f, 0.8f, false, false, 0.429f, 0.112f);
        cwh0VarQ.g(0.176f, 0.0f, 0.362f, -0.046f, 0.538f, -0.132f);
        cwh0VarQ.g(0.344f, -0.167f, 0.582f, -0.454f, 0.62f, -0.746f);
        cwh0VarQ.k(0.2f, -1.524f);
        cwh0VarQ.c(1.0f, 1.0f, false, true, 0.787f, -0.848f);
        cwh0VarQ.c(12.1f, 12.1f, false, true, 4.946f, 0.0f);
        cwh0VarQ.c(1.0f, 1.0f, false, true, 0.786f, 0.848f);
        cwh0VarQ.k(0.207f, 1.573f);
        cwh0VarQ.g(0.037f, 0.279f, 0.263f, 0.552f, 0.59f, 0.713f);
        cwh0VarQ.g(0.17f, 0.084f, 0.349f, 0.128f, 0.519f, 0.128f);
        cwh0VarQ.c(0.8f, 0.8f, false, false, 0.41f, -0.108f);
        cwh0VarQ.k(1.35f, -0.814f);
        cwh0VarQ.c(1.0f, 1.0f, false, true, 1.154f, 0.086f);
        cwh0VarQ.c(12.1f, 12.1f, false, true, 3.084f, 3.866f);
        cwh0VarQ.b(1.0f, 1.0f, false, true, 22.428f, 8.0f);
        cwh0VarQ.k(-1.204f, 1.25f);
        cwh0VarQ.g(-0.18f, 0.187f, -0.247f, 0.489f, -0.179f, 0.807f);
        cwh0VarQ.g(0.073f, 0.339f, 0.272f, 0.607f, 0.52f, 0.699f);
        cwh0VarQ.l(12.0f, 16.0f);
        cwh0VarQ.c(4.0f, 4.0f, true, false, 0.0f, -8.0f);
        cwh0VarQ.c(4.0f, 4.0f, false, false, 0.0f, 8.0f);
        a180.a(a180Var, cwh0VarQ.a, n6a1Var, 1.0f, 2, 1.0f);
        b180 b180VarB = a180Var.b();
        a = b180VarB;
        return b180VarB;
    }

    public static final boolean w(p1g1 p1g1Var) {
        if (p1g1Var.equals(j1g1.a) || p1g1Var.equals(n1g1.a) || p1g1Var.equals(o1g1.a)) {
            return true;
        }
        if (!p1g1Var.equals(i1g1.a) && !p1g1Var.equals(m1g1.a)) {
            eg.o();
        }
        return false;
    }

    public static int x(int i) {
        return i >>> 3;
    }

    public static int y(int i) {
        return i & 7;
    }

    public static final int z(aey aeyVar, boolean z) {
        if (aeyVar == aey.f && !z) {
            return 6;
        }
        switch (aeyVar.ordinal()) {
            case 0:
                return 7;
            case 1:
                return 19;
            case 2:
                return 3;
            case 3:
                return 12;
            case 4:
                return 21;
            case 5:
                return 5;
            case 6:
                return 8;
            case 7:
                return 18;
            case 8:
                return 10;
            case 9:
                return 17;
            case 10:
                return 20;
            case 11:
                return 16;
            case 12:
                return 9;
            case 13:
                return 4;
            default:
                n57.e("ItemType not found for EntityCase " + aeyVar);
                return 23;
        }
    }
}
