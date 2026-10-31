package p;

import android.content.Context;
import android.content.IntentFilter;
import android.graphics.Color;
import android.net.Uri;
import androidx.compose.ui.graphics.ColorFilter;
import com.spotify.mobius.Loop;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.Next;
import com.spotify.wrapped.v1.proto.RiveAnimation;
import com.spotify.wrapped.v1.proto.RiveAnimationInput;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public abstract class mym {
    public static final jm a = new jm("RESUME_TOKEN", (byte) 5);
    public static b180 b;
    public static b180 c;

    public static final void a(uek uekVar, Function0 function0, Function0 function1, qim0 qim0Var, b0k b0kVar, int i) {
        Function0 function2;
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1611919046);
        j06 j06Var = x340Var.a;
        int i2 = i | (x340Var.i(uekVar) ? 4 : 2) | (x340Var.i(function0) ? 32 : 16) | (x340Var.i(function1) ? 256 : 128) | 3072;
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = ktd.n(x340Var);
            }
            idn0 idn0Var = (idn0) objT;
            jtr jtrVar = jtr.f;
            boolean z = (i2 & 112) == 32;
            Object objT2 = x340Var.T();
            if (z || objT2 == m4cVar) {
                objT2 = new ugj(function0, (byte) 3);
                x340Var.s0(objT2);
            }
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarF = u291.f(bin.v(qim0Var3, idn0Var, jtrVar, false, (String) null, (pm31) null, (Function0) objT2, 28), 1.0f);
            Object objT3 = x340Var.T();
            if (objT3 == m4cVar) {
                objT3 = rdk.e;
                x340Var.s0(objT3);
            }
            qim0 qim0VarB = s161.b(qim0VarF, false, (iu30) objT3);
            era eraVar = een.P0;
            f36 f36Var = h36.c;
            mbh mbhVarA = jbh.a(f36Var, eraVar, x340Var, 0);
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
            qim0 qim0VarQ = i1p1.q(u291.f(qim0Var3, 1.0f), er31.b(8.0f));
            uwr uwrVar = cbx.a;
            qim0 qim0VarK = xcg1.k(cbx.a, qim0VarQ);
            gra graVar = een.d;
            gfh0 gfh0VarC = t1c.c(graVar, false);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0VarK);
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
            qim0 qim0VarN = anm1.N("concert_card_image", u291.d(qim0Var3, 1.0f));
            Uri uri = Uri.parse(uekVar.d);
            nkx nkxVar = nkx.c;
            eso1.e(uri, isl.a, qim0VarN, (p3v) null, (zvx) null, (ecx) null, (j6m) null, (tl3) null, (ColorFilter) null, new nux(nkxVar, nkxVar), false, false, x340Var, 1073766448, 0, 3560);
            ton1.f(0, 0, 0, 24, uekVar.f, uekVar.g, x340Var, anm1.N("concert_card_calendar_icon", u291.r(uyn1.B(h2c.a.a(qim0Var3, graVar), 8.0f, 8.0f, 0.0f, 0.0f, 12), 48.0f)));
            x340Var.r(true);
            qim0 qim0VarB2 = uyn1.B(u291.f(qim0Var3, 1.0f), 0.0f, 8.0f, 0.0f, 8.0f, 5);
            jw31 jw31VarA = ew31.a(h36.a, een.Z, x340Var, 0);
            int iHashCode3 = Long.hashCode(x340Var.T);
            xos0 xos0VarM3 = x340Var.m();
            qim0 qim0VarE3 = zr7.E(x340Var, qim0VarB2);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(jw31VarA, x340Var, lljVar);
            nko1.H(xos0VarM3, x340Var, lljVar2);
            x0d.q(iHashCode3, x340Var, lljVar3, x340Var);
            qim0 qim0VarB3 = uyn1.B(kk0.q(x340Var, qim0VarE3, lljVar4, 1.0f, true), 0.0f, 0.0f, 8.0f, 0.0f, 11);
            mbh mbhVarA2 = jbh.a(f36Var, eraVar, x340Var, 0);
            int iHashCode4 = Long.hashCode(x340Var.T);
            xos0 xos0VarM4 = x340Var.m();
            qim0 qim0VarE4 = zr7.E(x340Var, qim0VarB3);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(mbhVarA2, x340Var, lljVar);
            nko1.H(xos0VarM4, x340Var, lljVar2);
            x0d.q(iHashCode4, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE4, x340Var, lljVar4);
            uwo1.e(uekVar.b, anm1.N("concert_card_title", qim0Var3), cbx.d(x340Var).g, cbx.a(x340Var).b.a, (a0e1) null, (iu30) null, 0, false, new cjc0(2), 0, (qx8) null, x340Var, 0, 0, 1776);
            uwo1.e(uekVar.c, anm1.N("concert_card_subtitle", qim0Var3), cbx.d(x340Var).j, cbx.a(x340Var).b.b, (a0e1) null, (iu30) null, 0, false, new cjc0(2), 0, (qx8) null, x340Var, 0, 0, 1776);
            uwo1.e("", anm1.N("concert_card_extra_string", qim0Var3), cbx.d(x340Var).m, ((vex) zex.a.b).j, (a0e1) null, (iu30) null, 0, false, new cjc0(2), 0, (qx8) null, x340Var, 0, 0, 1776);
            x340Var = x340Var;
            x340Var.r(true);
            if (uekVar.j) {
                x340Var.i0(1929469120);
                pk1 pk1Var = new pk1(uekVar.h ? qk1.b : qk1.a, false, (String) null, (String) null, (j7p1) null, 30);
                qim0 qim0VarN2 = anm1.N("concert_card_save_button", qim0Var3);
                boolean z3 = (i2 & 896) == 256;
                Object objT4 = x340Var.T();
                if (z3 || objT4 == m4cVar) {
                    function2 = function1;
                    objT4 = new ugj(function2, (byte) 4);
                    x340Var.s0(objT4);
                } else {
                    function2 = function1;
                }
                h7p1.a(pk1Var, new gbx(z50.c, (Function0) objT4), qim0VarN2, (max) null, (gdx) null, x340Var, 0, 24);
                x340Var = x340Var;
                x340Var.r(false);
            } else {
                function2 = function1;
                x340Var.i0(1929878754);
                x340Var.r(false);
            }
            x340Var.r(true);
            x340Var.r(true);
            qim0Var2 = qim0Var3;
        } else {
            function2 = function1;
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new hwd(uekVar, function0, function2, qim0Var2, i, (byte) 22);
        }
    }

    public static final void b(String str, String str2, String str3, String str4, String str5, String str6, Function0 function0, Function0 function1, b0k b0kVar, int i, int i2) {
        int i3;
        String str7;
        int i4;
        b0k b0kVar2;
        String str8;
        nim0 nim0Var;
        b0k b0kVar3;
        Object obj = fkj0.X;
        b0k b0kVar4 = (x340) b0kVar;
        b0kVar4.k0(2089326586);
        int i5 = i | (b0kVar4.g(str) ? 4 : 2) | (b0kVar4.g(str2) ? 32 : 16) | (b0kVar4.g(str3) ? 256 : 128) | (b0kVar4.g(str4) ? 2048 : 1024);
        int i6 = i2 & 16;
        if (i6 != 0) {
            i3 = i5 | 24576;
        } else {
            i3 = i5 | (b0kVar4.g(str5) ? 16384 : 8192);
        }
        int i7 = i2 & 32;
        if (i7 != 0) {
            i4 = i3 | 196608;
            str7 = str6;
        } else {
            str7 = str6;
            i4 = i3 | (b0kVar4.g(str7) ? 131072 : 65536);
        }
        int i8 = i4 | (b0kVar4.i(function0) ? 1048576 : 524288) | (b0kVar4.i(function1) ? 8388608 : 4194304);
        if (b0kVar4.Y(i8 & 1, (i8 & 4793491) != 4793490)) {
            String str9 = i6 != 0 ? null : str5;
            if (i7 != 0) {
                str7 = null;
            }
            nim0 nim0Var2 = nim0.a;
            qim0 qim0VarF = u291.f(anm1.N("GatedContentBottomSheet", nim0Var2), 1.0f);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(b0kVar4).b;
            qim0 qim0VarZ = uyn1.z(16.0f, 0.0f, 2, qim0VarF);
            WeakHashMap weakHashMap = osl1.x;
            qim0 qim0VarP = x0d.p(lhc.g(b0kVar4).g, 32, qim0VarZ);
            mbh mbhVarA = jbh.a(h36.c, een.Q0, b0kVar4, 0);
            int iHashCode = Long.hashCode(((x340) b0kVar4).T);
            xos0 xos0VarM = b0kVar4.m();
            qim0 qim0VarE = zr7.E(b0kVar4, qim0VarP);
            hzj.A.getClass();
            if (((x340) b0kVar4).a == null) {
                tgp1.p();
                throw null;
            }
            b0kVar4.m0();
            if (((x340) b0kVar4).S) {
                b0kVar4.l(hmb0.t1);
            } else {
                b0kVar4.v0();
            }
            nko1.H(mbhVarA, b0kVar4, y580.O0);
            nko1.H(xos0VarM, b0kVar4, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), b0kVar4, y580.R0);
            nko1.F(b0kVar4);
            nko1.H(qim0VarE, b0kVar4, y580.Y);
            cvx cvxVar2 = cbx.b(b0kVar4).b;
            op71.g(b0kVar4, u291.r(nim0Var2, 16.0f));
            if (str9 != null) {
                b0kVar4.i0(1357392811);
                boolean z = (57344 & i8) == 16384;
                Object objT = b0kVar4.T();
                if (z || objT == obj) {
                    objT = Uri.parse(str9);
                    b0kVar4.s0(objT);
                }
                Uri uri = (Uri) objT;
                uri.getClass();
                qim0 qim0VarR = u291.r(nim0Var2, 120.0f);
                cua cuaVar = cbx.b(b0kVar4).f;
                nim0Var = nim0Var2;
                eso1.e(uri, isl.a, i1p1.q(qim0VarR, er31.b(2.0f)), (p3v) null, (zvx) null, (ecx) null, (j6m) null, (tl3) null, (ColorFilter) null, (qux) null, false, false, b0kVar4, 48, 0, 4088);
                b0kVar3 = b0kVar4;
                cvx cvxVar3 = cbx.b(b0kVar3).b;
                ywx0.n(nim0Var, 16.0f, b0kVar3, false);
            } else {
                nim0Var = nim0Var2;
                b0kVar3 = b0kVar4;
                b0kVar3.i0(1357749342);
                b0kVar3.r(false);
            }
            b0k b0kVar5 = b0kVar3;
            uwo1.e(str, (qim0) null, cbx.d(b0kVar3).e, 0L, new a0e1(3), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, b0kVar5, i8 & 14, 0, 2026);
            cvx cvxVar4 = cbx.b(b0kVar5).b;
            op71.g(b0kVar5, u291.r(nim0Var, 8.0f));
            uwo1.e(str2, (qim0) null, cbx.d(b0kVar5).j, cbx.a(b0kVar5).b.b, new a0e1(3), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, b0kVar5, (i8 >> 3) & 14, 0, 2018);
            b0k b0kVar6 = b0kVar5;
            if (str7 == null || str7.length() == 0) {
                b0kVar6.i0(1358348510);
                b0kVar6.r(false);
            } else {
                b0kVar6.i0(1358108260);
                cvx cvxVar5 = cbx.b(b0kVar6).b;
                op71.g(b0kVar6, u291.r(nim0Var, 8.0f));
                uwo1.e(str7, (qim0) null, cbx.d(b0kVar6).j, cbx.a(b0kVar6).b.b, new a0e1(3), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, b0kVar6, (i8 >> 15) & 14, 0, 2018);
                b0kVar6 = b0kVar6;
                b0kVar6.r(false);
            }
            op71.g(b0kVar6, u291.r(nim0Var, cbx.b(b0kVar6).b.a));
            z50 z50Var = z50.c;
            b0k b0kVar7 = b0kVar6;
            foo1.c(new gbx(z50Var, function0), new idx(4), (qim0) null, (max) null, (gdx) null, (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, apo.r(-356956891, new ps00(str3, (byte) 20), b0kVar6), b0kVar7, 0, 48, 2044);
            cvx cvxVar6 = cbx.b(b0kVar7).b;
            op71.g(b0kVar7, u291.r(nim0Var, 8.0f));
            foo1.c(new gbx(z50Var, function1), ldx.c, (qim0) null, (max) null, (gdx) null, (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, apo.r(-805597490, new ps00(str4, (byte) 21), b0kVar7), b0kVar7, 0, 48, 2044);
            b0kVar2 = b0kVar7;
            cvx cvxVar7 = cbx.b(b0kVar2).b;
            ywx0.n(nim0Var, 16.0f, b0kVar2, true);
            str8 = str9;
        } else {
            b0kVar2 = b0kVar4;
            b0kVar2.b0();
            str8 = str5;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new x540(str, str2, str3, str4, str8, str7, function0, function1, i, i2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:45:0x0085  */
    /* JADX WARN: Code duplicated, block: B:50:0x0096  */
    /* JADX WARN: Code duplicated, block: B:53:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:55:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:58:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:60:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:61:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:63:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:64:0x0101  */
    /* JADX WARN: Code duplicated, block: B:70:0x0137 A[ORIG_RETURN, RETURN] */
    public static final void c(c380 c380Var, qim0 qim0Var, nl3 nl3Var, b0k b0kVar, int i, int i2) {
        int i3;
        qim0 qim0Var2;
        nl3 nl3Var2;
        h311 h311VarV;
        s3f0 s3f0Var;
        qim0 qim0Var3;
        nl3 nl3Var3;
        gw70 gw70Var;
        boolean zI;
        Object objT;
        ven0 ven0VarP;
        nl3 nl3Var4;
        gra graVar;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1575952119);
        int i4 = i | (x340Var.g(c380Var) ? 4 : 2);
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 = i4 | 48;
        } else {
            i3 = i4 | (x340Var.i(qim0Var) ? 32 : 16);
        }
        int i6 = i3 | (((i2 & 4) == 0 && x340Var.i(nl3Var)) ? 256 : 128);
        if (x340Var.Y(i6 & 1, (i6 & 147) != 146)) {
            x340Var.d0();
            int i7 = i & 1;
            qim0 qim0Var4 = nim0.a;
            if (i7 == 0 || x340Var.E()) {
                qim0Var3 = i5 != 0 ? qim0Var4 : qim0Var;
                if ((i2 & 4) != 0) {
                    i6 &= -897;
                    nl3Var3 = een.P0;
                }
                x340Var.s();
                gw70Var = (gw70) x340Var.k(oi7.a);
                zI = x340Var.i(gw70Var) | ((i6 & 14) == 4);
                objT = x340Var.T();
                if (zI || objT == fkj0.X) {
                    objT = new z290(c380Var, gw70Var, (lnm) null, (byte) 19);
                    x340Var.s0(objT);
                }
                ven0VarP = yto.p((Object) null, c380Var, (vu30) objT, x340Var, ((i6 << 3) & 112) | 6);
                if (((List) ven0VarP.getValue()) == null) {
                    x340Var.i0(-901133125);
                    op71.g(x340Var, u291.h(qim0Var4, 24.0f));
                    x340Var.r(false);
                    h311VarV = x340Var.v();
                    if (h311VarV != null) {
                        return;
                    } else {
                        s3f0Var = new s3f0(c380Var, qim0Var3, nl3Var3, i, i2, (byte) 0);
                    }
                } else {
                    nl3Var4 = nl3Var3;
                    qim0 qim0Var5 = qim0Var3;
                    x340Var.i0(-901073543);
                    x340Var.r(false);
                    qim0 qim0VarH = u291.h(qim0Var5, 24.0f);
                    if (u890.j(nl3Var4, een.Q0)) {
                        graVar = een.h;
                    } else if (u890.j(nl3Var4, een.R0)) {
                        graVar = een.i;
                    } else {
                        graVar = een.g;
                    }
                    w2g0.c(qim0VarH, graVar, apo.r(-1888837153, new h6a0(nl3Var4, ven0VarP, (byte) 17), x340Var), x340Var, 3072, 4);
                    qim0Var2 = qim0Var5;
                    nl3Var2 = nl3Var4;
                }
                h311VarV.d = s3f0Var;
            }
            x340Var.b0();
            if ((i2 & 4) != 0) {
                i6 &= -897;
            }
            qim0Var3 = qim0Var;
            nl3Var3 = nl3Var;
            x340Var.s();
            gw70Var = (gw70) x340Var.k(oi7.a);
            zI = x340Var.i(gw70Var) | ((i6 & 14) == 4);
            objT = x340Var.T();
            if (zI) {
                objT = new z290(c380Var, gw70Var, (lnm) null, (byte) 19);
                x340Var.s0(objT);
            } else {
                objT = new z290(c380Var, gw70Var, (lnm) null, (byte) 19);
                x340Var.s0(objT);
            }
            ven0VarP = yto.p((Object) null, c380Var, (vu30) objT, x340Var, ((i6 << 3) & 112) | 6);
            if (((List) ven0VarP.getValue()) == null) {
                x340Var.i0(-901133125);
                op71.g(x340Var, u291.h(qim0Var4, 24.0f));
                x340Var.r(false);
                h311VarV = x340Var.v();
                if (h311VarV != null) {
                    return;
                } else {
                    s3f0Var = new s3f0(c380Var, qim0Var3, nl3Var3, i, i2, (byte) 0);
                }
            } else {
                nl3Var4 = nl3Var3;
                qim0 qim0Var6 = qim0Var3;
                x340Var.i0(-901073543);
                x340Var.r(false);
                qim0 qim0VarH2 = u291.h(qim0Var6, 24.0f);
                if (u890.j(nl3Var4, een.Q0)) {
                    graVar = een.h;
                } else if (u890.j(nl3Var4, een.R0)) {
                    graVar = een.i;
                } else {
                    graVar = een.g;
                }
                w2g0.c(qim0VarH2, graVar, apo.r(-1888837153, new h6a0(nl3Var4, ven0VarP, (byte) 17), x340Var), x340Var, 3072, 4);
                qim0Var2 = qim0Var6;
                nl3Var2 = nl3Var4;
            }
            h311VarV.d = s3f0Var;
        }
        x340Var.b0();
        qim0Var2 = qim0Var;
        nl3Var2 = nl3Var;
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            s3f0Var = new s3f0(c380Var, qim0Var2, nl3Var2, i, i2, (byte) 1);
            h311VarV.d = s3f0Var;
        }
    }

    public static final void d(oyx oyxVar, Object obj, Function0 function0, b0k b0kVar, int i) {
        int i2;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(679150086);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(oyxVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? x340Var.g(obj) : x340Var.i(obj) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(function0) ? 256 : 128;
        }
        boolean z = true;
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            if ((i2 & 112) != 32 && ((i2 & 64) == 0 || !x340Var.g(obj))) {
                z = false;
            }
            Object objT = x340Var.T();
            if (z || objT == m4cVar) {
                objT = (k6w0) function0.invoke();
                x340Var.s0(objT);
            }
            k6w0 k6w0Var = (k6w0) objT;
            if (k6w0Var != null) {
                x340Var.i0(-1030529398);
                boolean zI = x340Var.i(oyxVar) | x340Var.i(k6w0Var);
                Object objT2 = x340Var.T();
                if (zI || objT2 == m4cVar) {
                    objT2 = new hzu0(oyxVar, k6w0Var, (byte) 17);
                    x340Var.s0(objT2);
                }
                qxd0.h(oyxVar, k6w0Var, (iu30) objT2, x340Var);
                x340Var.r(false);
            } else {
                x340Var.i0(-1030327588);
                x340Var.r(false);
            }
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new j5w0(oyxVar, obj, function0, i, (byte) 0);
        }
    }

    public static final void e(xky0 xky0Var, Object obj, Function0 function0, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1086455200);
        int i2 = (x340Var.g(obj) ? 32 : 16) | i | (x340Var.i(function0) ? 256 : 128);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            oyx oyxVar = (oyx) x340Var.k(xky0Var);
            if (oyxVar != null) {
                x340Var.i0(286902472);
                d(oyxVar, obj, function0, x340Var, i2 & 1008);
                x340Var.r(false);
            } else {
                x340Var.i0(286988962);
                x340Var.r(false);
            }
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new tbs0(xky0Var, obj, function0, i, (byte) 23);
        }
    }

    public static final void f(dt71 dt71Var, cce cceVar, dbp dbpVar, qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-361737832);
        int i2 = i | (x340Var.i(dt71Var) ? 4 : 2) | (x340Var.i(cceVar) ? 32 : 16) | (x340Var.g(dbpVar) ? 256 : 128) | 3072;
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            lnm lnmVar = null;
            if (objT == m4cVar) {
                objT = v8r.q((Object) null);
                x340Var.s0(objT);
            }
            ven0 ven0Var = (ven0) objT;
            boolean zG = x340Var.g((wt91) ven0Var.getValue());
            Object objT2 = x340Var.T();
            if (zG || objT2 == m4cVar) {
                objT2 = v8r.q(Boolean.FALSE);
                x340Var.s0(objT2);
            }
            ven0 ven0Var2 = (ven0) objT2;
            boolean zI = x340Var.i(dt71Var) | x340Var.i(ven0Var);
            Object objT3 = x340Var.T();
            if (zI || objT3 == m4cVar) {
                objT3 = new sb91(dt71Var, ven0Var, lnmVar, (byte) 8);
                x340Var.s0(objT3);
            }
            qxd0.t(dt71Var, x340Var, (vu30) objT3);
            wt91 wt91Var = (wt91) ven0Var.getValue();
            boolean zI2 = x340Var.i(ven0Var) | x340Var.i(ven0Var2);
            Object objT4 = x340Var.T();
            if (zI2 || objT4 == m4cVar) {
                objT4 = new gxv0(ven0Var, ven0Var2, (lnm) null, (byte) 1);
                x340Var.s0(objT4);
            }
            qxd0.t(wt91Var, x340Var, (vu30) objT4);
            boolean zBooleanValue = ((Boolean) ven0Var2.getValue()).booleanValue();
            ceo ceoVar = mlv.b;
            fq7.g(zBooleanValue, null, xay.e(2, irn1.o0(150, 0, ceoVar, 2)).a(xay.g(0.8f, 4, 0L, irn1.o0(150, 0, ceoVar, 2))), xay.f(2, irn1.o0(100, 0, (dlv) null, 6)), null, apo.r(933186160, new kj21(ven0Var, cceVar, dbpVar, ven0Var2), x340Var), x340Var, 196608, 18);
            qim0Var2 = nim0.a;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new gh61(i, dt71Var, cceVar, dbpVar, qim0Var2, (byte) 15);
        }
    }

    public static final void g(k7f1 k7f1Var, float f, qim0 qim0Var, Function0 function0, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1009021433);
        int i2 = i | (x340Var.i(k7f1Var) ? 4 : 2) | (x340Var.d(f) ? 32 : 16) | (x340Var.g(qim0Var) ? 256 : 128) | (x340Var.i(function0) ? 2048 : 1024);
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            yj41 yj41Var = k7f1Var.d;
            yk4 yk4Var = new yk4(yj41Var.a);
            ksl kslVarA = yj41Var.a();
            cbx.a.getClass();
            eso1.f(yk4Var, kslVarA, function0 != null ? a8o.D(qim0Var, function0) : qim0Var, new p3v(f), (zvx) null, uwr.a(), (j6m) null, (tl3) null, (ColorFilter) null, x340Var, ((i2 << 6) & 7168) | 24576, 448);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ys(k7f1Var, f, qim0Var, function0, i, (byte) 11);
        }
    }

    public static final void h(float f, boolean z, wfx0 wfx0Var, iu30 iu30Var, iu30 iu30Var2, j2i j2iVar, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        boolean z2;
        j2i j2iVar2 = caj.a;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-371720159);
        if ((i & 6) == 0) {
            i2 = (x340Var.d(f) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.h(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.g(wfx0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(iu30Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= x340Var.i(iu30Var2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= x340Var.i(j2iVar2) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= x340Var.i(j2iVar) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= x340Var.g(qim0Var) ? 8388608 : 4194304;
        }
        if (x340Var.Y(i2 & 1, (4793491 & i2) != 4793490)) {
            ven0 ven0VarS = v8r.s(iu30Var, x340Var);
            ven0 ven0VarS2 = v8r.s(iu30Var2, x340Var);
            Object objT = x340Var.T();
            Object obj = fkj0.X;
            if (objT == obj) {
                objT = new tfx0(new i2g1(ven0VarS, (byte) 23), new i2g1(ven0VarS2, (byte) 24));
                x340Var.s0(objT);
            }
            tfx0 tfx0Var = (tfx0) objT;
            if (z) {
                x340Var.i0(-1488644468);
                sfx0 sfx0Var = (sfx0) x340Var.k(fge0.a);
                if (sfx0Var == null) {
                    x340Var.i0(-1488451432);
                    z2 = false;
                    x340Var.r(false);
                } else {
                    x340Var.i0(-1488451431);
                    boolean zI = x340Var.i(sfx0Var);
                    Object objT2 = x340Var.T();
                    if (zI || objT2 == obj) {
                        objT2 = new gqj1(sfx0Var, tfx0Var, (lnm) null, (byte) 14);
                        x340Var.s0(objT2);
                    }
                    qxd0.t(sfx0Var, x340Var, (vu30) objT2);
                    z2 = false;
                    x340Var.r(false);
                }
                x340Var.r(z2);
            } else {
                z2 = false;
                x340Var.i0(-1488070751);
                x340Var.r(false);
            }
            Boolean bool = (Boolean) tfx0Var.f.getValue();
            bool.getClass();
            boolean z3 = (i2 & 896) == 256 ? true : z2;
            Object objT3 = x340Var.T();
            if (z3 || objT3 == obj) {
                objT3 = new t6j1(wfx0Var, tfx0Var, (lnm) null, (byte) 21);
                x340Var.s0(objT3);
            }
            qxd0.t(bool, x340Var, (vu30) objT3);
            float fS = ((Boolean) tfx0Var.f.getValue()).booleanValue() ? tfx0Var.c.s() : f;
            boolean zG = x340Var.g(ven0VarS2);
            Object objT4 = x340Var.T();
            if (zG || objT4 == obj) {
                objT4 = new hij1(tfx0Var, ven0VarS2, (byte) 21);
                x340Var.s0(objT4);
            }
            int i3 = (i2 & 14) | 384;
            int i4 = i2 >> 6;
            aym.j(f, fS, tfx0Var, j2iVar, zr7.i(qim0Var, new km60((byte) 1, f, (iu30) objT4, z)), x340Var, i3 | (i4 & 7168) | (i4 & 57344));
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ww90(f, z, wfx0Var, iu30Var, iu30Var2, j2iVar, qim0Var, i);
        }
    }

    public static mr20 i(Loop loop, x8c0 x8c0Var, int i) {
        w8c0 w8c0Var = w8c0.d;
        long j = (i & 4) != 0 ? 0L : 100L;
        whm0 whm0Var = (whm0) ((MobiusLoop) loop).i;
        return r4p1.k(z4p1.v(rqt0.t(new ht20(h4p1.f(new lqv(x8c0Var, w8c0Var, h4p1.g(new d7i0(loop, (lnm) null, (byte) 21)), (lnm) null, (byte) 10)), new d7i0(whm0Var, (lnm) null, (byte) 22)), qlk0.Y), whm0Var != null ? 1 : 0), j);
    }

    public static final boolean j(ArrayList arrayList) {
        int i;
        if (arrayList.isEmpty()) {
            return false;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            m0u m0uVar = (m0u) it.next();
            if (!m0uVar.f && ((i = m0uVar.d.b) == 5 || i == 4 || i == 2 || i == 3)) {
                return true;
            }
        }
        return false;
    }

    public static void k(Context context) {
        if (jlb.a() != null) {
            jlb.a();
            return;
        }
        jlb jlbVar = new jlb(context);
        Set set = dhn.a;
        if (!set.contains(jlb.class)) {
            try {
                if (!set.contains(jlbVar)) {
                    try {
                        zce0.a((Context) jlbVar.b).b(jlbVar, new IntentFilter("com.parse.bolts.measurement_event"));
                    } catch (Throwable th) {
                        dhn.a(jlbVar, th);
                    }
                }
            } catch (Throwable th2) {
                dhn.a(jlb.class, th2);
            }
        }
        if (!dhn.a.contains(jlb.class)) {
            try {
                jlb.c = jlbVar;
            } catch (Throwable th3) {
                dhn.a(jlb.class, th3);
            }
        }
        jlb.a();
    }

    public static final void l(Loop loop, Object obj) {
        try {
            ((MobiusLoop) loop).a(obj);
        } catch (Exception e) {
            n57.g("Dispatching event in Mobius loop failed", e);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object m(RiveAnimation riveAnimation, ti31 ti31Var, kj31 kj31Var, ni31 ni31Var, lnm lnmVar) {
        ji31 ji31Var;
        if (lnmVar instanceof ji31) {
            ji31Var = (ji31) lnmVar;
            int i = ji31Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ji31Var.c = i - Integer.MIN_VALUE;
            } else {
                ji31Var = new ji31(lnmVar);
            }
        } else {
            ji31Var = new ji31(lnmVar);
        }
        Object objB = ji31Var.b;
        int i2 = ji31Var.c;
        if (i2 == 0) {
            hm5.M(objB);
            String url = riveAnimation.getUrl();
            if (ihc1.y0(url)) {
                url = "https://campaigns-service.spotifycdn.com/wrapped-2025/dev/box-swirl.riv";
            }
            ji31Var.a = kj31Var;
            ji31Var.c = 1;
            objB = ti31.b(ti31Var, url, ni31Var, ji31Var);
            d9n d9nVar = d9n.a;
            if (objB == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kj31Var = ji31Var.a;
            hm5.M(objB);
        }
        return kj31Var.a((oi31) objB);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:31:0x0098  */
    /* JADX WARN: Code duplicated, block: B:41:0x00fe A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:45:0x0059 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Serializable n(RiveAnimation riveAnimation, cxc cxcVar, ni31 ni31Var, lnm lnmVar) {
        ki31 ki31Var;
        RiveAnimation riveAnimation2;
        qj31 sj31Var;
        if (lnmVar instanceof ki31) {
            ki31Var = (ki31) lnmVar;
            int i = ki31Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ki31Var.c = i - Integer.MIN_VALUE;
            } else {
                ki31Var = new ki31(lnmVar);
            }
        } else {
            ki31Var = new ki31(lnmVar);
        }
        Object objS = ki31Var.b;
        int i2 = ki31Var.c;
        if (i2 == 0) {
            hm5.M(objS);
            ki31Var.a = riveAnimation;
            ki31Var.c = 1;
            objS = smo1.s(new sew0(riveAnimation, ni31Var, cxcVar, (lnm) null, (byte) 16), ki31Var);
            d9n d9nVar = d9n.a;
            if (objS == d9nVar) {
                return d9nVar;
            }
            riveAnimation2 = riveAnimation;
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            riveAnimation2 = ki31Var.a;
            hm5.M(objS);
        }
        Map map = (Map) objS;
        h290<RiveAnimationInput> h290VarQ = riveAnimation2.q();
        ArrayList arrayList = new ArrayList();
        for (RiveAnimationInput riveAnimationInput : h290VarQ) {
            riveAnimationInput.getClass();
            String path = riveAnimationInput.getPath();
            int iQ = riveAnimationInput.n().q();
            switch (iQ == 0 ? -1 : ii31.a[l1d.C(iQ)]) {
                case -1:
                case 8:
                    sj31Var = null;
                    if (sj31Var != null) {
                        arrayList.add(sj31Var);
                    }
                    break;
                case 0:
                default:
                    eg.o();
                    return null;
                case 1:
                    path.getClass();
                    sj31Var = new sj31(path, riveAnimationInput.n().getStringValue());
                    if (sj31Var != null) {
                        arrayList.add(sj31Var);
                    }
                    break;
                case 2:
                    path.getClass();
                    sj31Var = new nj31(path, riveAnimationInput.n().getBoolValue());
                    if (sj31Var != null) {
                        arrayList.add(sj31Var);
                    }
                    break;
                case 3:
                    path.getClass();
                    sj31Var = new rj31(path, riveAnimationInput.n().r());
                    if (sj31Var != null) {
                        arrayList.add(sj31Var);
                    }
                    break;
                case 4:
                    path.getClass();
                    sj31Var = new tj31(path);
                    if (sj31Var != null) {
                        arrayList.add(sj31Var);
                    }
                    break;
                case 5:
                    path.getClass();
                    sj31Var = new oj31(path, Color.parseColor(riveAnimationInput.n().n()));
                    if (sj31Var != null) {
                        arrayList.add(sj31Var);
                    }
                    break;
                case 6:
                    path.getClass();
                    sj31Var = new pj31(path, riveAnimationInput.n().p());
                    if (sj31Var != null) {
                        arrayList.add(sj31Var);
                    }
                    break;
                case 7:
                    byte[] bArr = (byte[]) map.get(path);
                    if (bArr != null) {
                        path.getClass();
                        sj31Var = new qj31(path, bArr);
                    } else {
                        sj31Var = null;
                    }
                    if (sj31Var != null) {
                        arrayList.add(sj31Var);
                    }
                    break;
            }
        }
        return arrayList;
    }

    public static final ven0 o(tob1 tob1Var, boolean z, String str, int i, dlv dlvVar, Function0 function0, b0k b0kVar, int i2) {
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.i0(1977124390);
        Function0 function1 = (i2 & 32) != 0 ? null : function0;
        if (tob1Var == null) {
            x340Var.i0(-668576240);
            ven0 ven0VarS = v8r.s(function1, x340Var);
            boolean zG = x340Var.g(ven0VarS);
            Object objT = x340Var.T();
            if (zG || objT == m4cVar) {
                objT = new vk1(ven0VarS, (lnm) null, (byte) 12);
                x340Var.s0(objT);
            }
            qxd0.t(rih1.a, x340Var, (vu30) objT);
            Object objT2 = x340Var.T();
            if (objT2 == m4cVar) {
                objT2 = us71.i(1.0f, x340Var);
            }
            drr0 drr0Var = (drr0) objT2;
            x340Var.r(false);
            x340Var.r(false);
            return drr0Var;
        }
        x340Var.i0(-668380196);
        x340Var.r(false);
        if (!((Boolean) tob1Var.getValue()).booleanValue()) {
            x340Var.i0(-668354745);
            Object objT3 = x340Var.T();
            if (objT3 == m4cVar) {
                objT3 = us71.i(0.0f, x340Var);
            }
            drr0 drr0Var2 = (drr0) objT3;
            x340Var.r(false);
            x340Var.r(false);
            return drr0Var2;
        }
        x340Var.i0(-668303812);
        x340Var.r(false);
        hsi1 hsi1Var = new hsi1(str, Float.valueOf(0.0f), Float.valueOf(1.0f), irn1.o0(i, 0, dlvVar, 2), rno1.a);
        boolean zG2 = x340Var.g(function1);
        Object objT4 = x340Var.T();
        if (zG2 || objT4 == m4cVar) {
            objT4 = new j160(function1, (byte) 19);
            x340Var.s0(objT4);
        }
        ven0 ven0VarR = zod.R(hsi1Var, z, (Function0) objT4, x340Var, 8, 0);
        x340Var.r(false);
        return ven0VarR;
    }

    public static Next p(kak0 kak0Var, w2k0 w2k0Var) {
        b8w0 b8w0Var = w2k0Var.a;
        Next nextF = x1p1.F(Next.h(kak0.a(kak0Var, (pdm0) null, (Boolean) null, (ycu0) null, (lhg1) null, (lhg1) null, (lhg1) null, (xx8) null, (List) null, (List) null, (Float) null, (lhg1) null, (lhg1) null, lhg1.a(kak0Var.S0, new q6w0(b8w0Var, 65520), (ruq0) null, false, false, 14), (String) null, (String) null, (lhg1) null, new l8w0(b8w0Var), false, 0, 0, 0, (giq0) null, (uia) null, (uia) null, (Float) null, (Float) null, (Float) null, (Float) null, false, false, (String) null, false, (lhg1) null, (Boolean) null, (Integer) null, (lyj0) null, 0L, (Integer) null, (Integer) null, -4456449, 1048575)), kak0Var);
        kak0 kak0Var2 = (kak0) x1p1.l(nextF);
        if (kak0Var2 != null) {
            if (!(kak0Var2.W0 instanceof l8w0)) {
                kak0Var2 = null;
            }
            kak0 kak0Var3 = kak0Var2;
            if (kak0Var3 != null) {
                nextF = Next.i(kak0.a(kak0Var3, (pdm0) null, (Boolean) null, (ycu0) null, (lhg1) null, (lhg1) null, (lhg1) null, (xx8) null, (List) null, (List) null, (Float) null, (lhg1) null, (lhg1) null, lhg1.a(kak0Var3.S0, (q6w0) null, (ruq0) null, false, true, 7), (String) null, (String) null, (lhg1) null, (m8w0) null, false, 0, 0, 0, (giq0) null, (uia) null, (uia) null, (Float) null, (Float) null, (Float) null, (Float) null, false, false, (String) null, false, (lhg1) null, (Boolean) null, (Integer) null, (lyj0) null, 0L, (Integer) null, (Integer) null, -262145, 1048575), nextF.b());
            }
        }
        return x1p1.t(nextF, 3);
    }

    public static final void q(qzh qzhVar) {
        int dimensionPixelSize = qzhVar.getView().getResources().getDimensionPixelSize(2131165905);
        qzhVar.getView().setPadding(qzhVar.getView().getPaddingLeft() + dimensionPixelSize, qzhVar.getView().getPaddingTop() + dimensionPixelSize, qzhVar.getView().getPaddingRight() + dimensionPixelSize, qzhVar.getView().getPaddingBottom() + dimensionPixelSize);
    }
}
