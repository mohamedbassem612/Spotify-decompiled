package p;

import android.content.res.Configuration;
import android.database.SQLException;
import android.net.Uri;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.spotify.betamax.player.VideoSurfaceView;
import com.spotify.listplatform.contextmenu.ItemUnavailableException;
import com.spotify.mobius.Next;
import com.spotify.wrapped.v1.proto.Paragraph;
import com.spotify.wrapped.v1.proto.SceneTemplate;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import kotlin.jvm.functions.Function0;
import org.json.JSONObject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public abstract class vby0 {
    public static b180 a;

    public static final wgw A(rnf0 rnf0Var) {
        int i = rnf0Var.e;
        String str = rnf0Var.b;
        vef0 vef0Var = rnf0Var.d;
        Set setB = vef0Var.d.b();
        ArrayList arrayList = new ArrayList();
        Iterator it = setB.iterator();
        while (it.hasNext()) {
            Integer numC0 = nhc1.c0((String) it.next());
            if (numC0 != null) {
                arrayList.add(numC0);
            }
        }
        kw9 kw9Var = rnf0Var.a;
        return new wgw(i, str, arrayList, new bff0(kw9Var.a, kw9Var.b, vef0Var.e, vef0Var.f, vef0Var.g, true), rnf0Var.i);
    }

    public static final void a(int i, j2i j2iVar, b0k b0kVar, qim0 qim0Var, boolean z) {
        int i2;
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(139416816);
        if ((i & 6) == 0) {
            i2 = (x340Var.h(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if ((i & 384) == 0) {
            i3 |= x340Var.i(j2iVar) ? 256 : 128;
        }
        if (x340Var.Y(i3 & 1, (i3 & 147) != 146)) {
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = us71.i(1.0f, x340Var);
            }
            drr0 drr0Var = (drr0) objT;
            Boolean boolValueOf = Boolean.valueOf(z);
            boolean zI = ((i3 & 14) == 4) | x340Var.i(drr0Var);
            Object objT2 = x340Var.T();
            if (zI || objT2 == m4cVar) {
                objT2 = new oy3(z, drr0Var, (lnm) null, (byte) 0);
                x340Var.s0(objT2);
            }
            qxd0.t(boolValueOf, x340Var, (vu30) objT2);
            tob1 tob1VarB = z95.b(drr0Var.s(), (fe5) null, "alpha", (iu30) null, x340Var, 3072, 22);
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarK = z ? d9y0.k(qim0Var3, ((Number) tob1VarB.getValue()).floatValue()) : qim0Var3;
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarK);
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
            dv20.l((i3 >> 6) & 14, j2iVar, x340Var, true);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new py3(z, qim0Var2, j2iVar, i, (byte) 0);
        }
    }

    public static final void b(bac bacVar, qim0 qim0Var, b0k b0kVar, int i) {
        b0k b0kVar2;
        qim0 qim0Var2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-1987550739);
        int i2 = (b0kVar3.i(bacVar) ? 4 : 2) | i | 48;
        if (b0kVar3.Y(i2 & 1, (i2 & 19) != 18)) {
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(b0kVar3).b;
            qim0Var2 = nim0.a;
            qim0 qim0VarN = anm1.N(bacVar.d, u291.f(uyn1.z(0.0f, 8.0f, 1, qim0Var2), 1.0f));
            mbh mbhVarA = jbh.a(h36.c, een.P0, b0kVar3, 0);
            int iHashCode = Long.hashCode(((x340) b0kVar3).T);
            xos0 xos0VarM = b0kVar3.m();
            qim0 qim0VarE = zr7.E(b0kVar3, qim0VarN);
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
            Object objT = b0kVar3.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = iub.V0;
                b0kVar3.s0(objT);
            }
            qim0 qim0VarB = s161.b(qim0Var2, false, (iu30) objT);
            float f = cbx.b(b0kVar3).b.b;
            cvx cvxVar2 = cbx.b(b0kVar3).b;
            cvx cvxVar3 = cbx.b(b0kVar3).b;
            b0kVar2 = b0kVar3;
            qgo1.f(bacVar.a.g(new cjc0(2), b0kVar3, 0), uyn1.B(qim0VarB, 16.0f, f, 16.0f, 0.0f, 8), (a0e1) null, 0, false, (iu30) null, b0kVar2, 8, 60);
            qim0 qim0VarB2 = uyn1.B(u291.f(qim0Var2, 1.0f), 0.0f, cbx.b(b0kVar2).b.b, 0.0f, 0.0f, 13);
            boolean z = (i2 & 14) == 4 || b0kVar2.i(bacVar);
            Object objT2 = b0kVar2.T();
            if (z || objT2 == m4cVar) {
                objT2 = new tla(bacVar, (byte) 28);
                b0kVar2.s0(objT2);
            }
            dm5.a((iu30) objT2, qim0VarB2, (iu30) null, b0kVar2, 0, 4);
            b0kVar2.r(true);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new hj8(bacVar, qim0Var2, i, (byte) 19);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0271  */
    /* JADX WARN: Code duplicated, block: B:103:0x0285  */
    /* JADX WARN: Code duplicated, block: B:105:0x02be  */
    /* JADX WARN: Code duplicated, block: B:107:0x02db  */
    /* JADX WARN: Code duplicated, block: B:108:0x02dd  */
    /* JADX WARN: Code duplicated, block: B:112:0x02e6  */
    /* JADX WARN: Code duplicated, block: B:115:0x02f8  */
    /* JADX WARN: Code duplicated, block: B:117:0x0333  */
    /* JADX WARN: Code duplicated, block: B:119:0x0337  */
    /* JADX WARN: Code duplicated, block: B:122:0x034b  */
    /* JADX WARN: Code duplicated, block: B:124:0x034f  */
    /* JADX WARN: Code duplicated, block: B:126:0x0353  */
    /* JADX WARN: Code duplicated, block: B:129:0x0360  */
    /* JADX WARN: Code duplicated, block: B:131:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:61:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:66:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:67:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:71:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:75:0x00df A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:76:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:77:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:79:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:81:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:85:0x0129  */
    /* JADX WARN: Code duplicated, block: B:87:0x0134  */
    /* JADX WARN: Code duplicated, block: B:88:0x0138  */
    /* JADX WARN: Code duplicated, block: B:91:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:92:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:95:0x0266  */
    /* JADX WARN: Code duplicated, block: B:96:0x0268  */
    public static final void c(String str, String str2, String str3, yf yfVar, String str4, Function0 function0, String str5, Function0 function1, b0k b0kVar, int i, int i2) {
        int i3;
        String str6;
        int i4;
        Function0 function2;
        int i5;
        boolean z;
        x340 x340Var;
        String str7;
        Function0 function3;
        h311 h311VarV;
        String str8;
        nim0 nim0Var;
        int i6;
        f36 f36Var;
        mbh mbhVarA;
        int iHashCode;
        xos0 xos0VarM;
        qim0 qim0VarE;
        boolean z2;
        n4k n4kVar;
        boolean z3;
        Object objT;
        Function0 function4;
        boolean z4;
        Object objT2;
        Function0 function5;
        Object objT3;
        m4c m4cVar = fkj0.X;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(381059305);
        j06 j06Var = x340Var2.a;
        if ((i & 6) == 0) {
            i3 = (x340Var2.g(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= x340Var2.g(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= x340Var2.g(str3) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= x340Var2.i(yfVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            str6 = str4;
            i3 |= x340Var2.g(str6) ? 16384 : 8192;
        } else {
            str6 = str4;
        }
        if ((196608 & i) == 0) {
            i3 |= x340Var2.i(function0) ? 131072 : 65536;
        }
        int i7 = i2 & 64;
        if (i7 == 0) {
            if ((1572864 & i) == 0) {
                i3 |= x340Var2.g(str5) ? 1048576 : 524288;
            }
            i4 = i2 & 128;
            if (i4 != 0) {
                i3 |= 12582912;
                function2 = function1;
            } else {
                function2 = function1;
                if ((i & 12582912) == 0) {
                    if (x340Var2.i(function2)) {
                        i5 = 8388608;
                    } else {
                        i5 = 4194304;
                    }
                    i3 |= i5;
                }
            }
            if ((i3 & 4793491) != 4793490) {
                z = true;
            } else {
                z = false;
            }
            if (x340Var2.Y(i3 & 1, z)) {
                if (i7 != 0) {
                    str8 = null;
                } else {
                    str8 = str5;
                }
                if (i4 != 0) {
                    objT3 = x340Var2.T();
                    if (objT3 == m4cVar) {
                        objT3 = bc30.b1;
                        x340Var2.s0(objT3);
                    }
                    function2 = (Function0) objT3;
                }
                nim0Var = nim0.a;
                i6 = i3;
                qim0 qim0VarH = l6o1.H(u291.d(nim0Var, 1.0f), l6o1.C(0, 0, 1, x340Var2), false, 14);
                era eraVar = een.P0;
                f36Var = h36.c;
                mbhVarA = jbh.a(f36Var, eraVar, x340Var2, 0);
                iHashCode = Long.hashCode(x340Var2.T);
                xos0VarM = x340Var2.m();
                qim0VarE = zr7.E(x340Var2, qim0VarH);
                hzj.A.getClass();
                if (j06Var != null) {
                    tgp1.p();
                    throw null;
                }
                x340Var2.m0();
                z2 = x340Var2.S;
                n4kVar = hmb0.t1;
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
                nko1.H(qim0VarE, x340Var2, lljVar4);
                eso1.e(Uri.parse(str6), isl.a, u291.h(u291.f(nim0Var, 1.0f), 220.0f), (p3v) null, (zvx) null, (ecx) null, mif1.P0, (tl3) null, (ColorFilter) null, oux.a, false, false, x340Var2, 224304, 0, 3456);
                qim0 qim0VarF = u291.f(nim0Var, 1.0f);
                uwr uwrVar = cbx.a;
                qim0 qim0VarX = uyn1.x(qim0VarF, cbx.b(x340Var2).b.a);
                mbh mbhVarA2 = jbh.a(f36Var, een.Q0, x340Var2, 0);
                int iHashCode2 = Long.hashCode(x340Var2.T);
                xos0 xos0VarM2 = x340Var2.m();
                qim0 qim0VarE2 = zr7.E(x340Var2, qim0VarX);
                x340Var2.m0();
                if (x340Var2.S) {
                    x340Var2.l(n4kVar);
                } else {
                    x340Var2.v0();
                }
                nko1.H(mbhVarA2, x340Var2, lljVar);
                nko1.H(xos0VarM2, x340Var2, lljVar2);
                x0d.q(iHashCode2, x340Var2, lljVar3, x340Var2);
                nko1.H(qim0VarE2, x340Var2, lljVar4);
                uwo1.e(str, u291.f(nim0Var, 1.0f), cbx.d(x340Var2).d, 0L, new a0e1(3), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var2, i6 & 14, 0, 2024);
                cvx cvxVar = cbx.b(x340Var2).b;
                lee1 lee1Var = kk0.p(nim0Var, 8.0f, x340Var2, x340Var2).j;
                qim0 qim0VarF2 = u291.f(nim0Var, 1.0f);
                cvx cvxVar2 = cbx.b(x340Var2).b;
                uwo1.e(str2, uyn1.z(16.0f, 0.0f, 2, qim0VarF2), lee1Var, 0L, new a0e1(3), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var2, (i6 >> 3) & 14, 0, 2024);
                op71.g(x340Var2, u291.h(nim0Var, cbx.b(x340Var2).b.a));
                if ((i6 & 458752) == 131072) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                objT = x340Var2.T();
                if (z3 || objT == m4cVar) {
                    objT = new zg20(function0, (byte) 19);
                    x340Var2.s0(objT);
                }
                function4 = (Function0) objT;
                if (!ihc1.y0(str3)) {
                    hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                    return;
                }
                foo1.c(new gbx(new y50(str3), function4), yfVar, (qim0) null, (max) null, (gdx) null, (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, apo.r(2084598302, new ps00(str3, (byte) 25), x340Var2), x340Var2, (i6 >> 6) & 112, 48, 2044);
                x340Var = x340Var2;
                if (str8 != null) {
                    x340Var.i0(-581654053);
                    cvx cvxVar3 = cbx.b(x340Var).b;
                    op71.g(x340Var, u291.h(nim0Var, 12.0f));
                    if ((i6 & 29360128) == 8388608) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    objT2 = x340Var.T();
                    if (z4 || objT2 == m4cVar) {
                        objT2 = new zg20(function2, (byte) 20);
                        x340Var.s0(objT2);
                    }
                    function5 = (Function0) objT2;
                    if (!ihc1.y0(str8)) {
                        hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                        return;
                    } else {
                        foo1.c(new gbx(new y50(str8), function5), jdx.c, (qim0) null, (max) null, (gdx) null, (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, apo.r(368630115, new ps00(str8, (byte) 26), x340Var), x340Var, 0, 48, 2044);
                        x340Var = x340Var;
                        x340Var.r(false);
                    }
                } else {
                    x340Var.i0(-581336923);
                    x340Var.r(false);
                }
                x340Var.r(true);
                x340Var.r(true);
                str7 = str8;
            } else {
                x340Var = x340Var2;
                x340Var.b0();
                str7 = str5;
            }
            function3 = function2;
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new s2l(str, str2, str3, yfVar, str4, function0, str7, function3, i, i2);
            }
        }
        i3 |= 1572864;
        i4 = i2 & 128;
        if (i4 != 0) {
            i3 |= 12582912;
            function2 = function1;
        } else {
            function2 = function1;
            if ((i & 12582912) == 0) {
                if (x340Var2.i(function2)) {
                    i5 = 8388608;
                } else {
                    i5 = 4194304;
                }
                i3 |= i5;
            }
        }
        if ((i3 & 4793491) != 4793490) {
            z = true;
        } else {
            z = false;
        }
        if (x340Var2.Y(i3 & 1, z)) {
            if (i7 != 0) {
                str8 = null;
            } else {
                str8 = str5;
            }
            if (i4 != 0) {
                objT3 = x340Var2.T();
                if (objT3 == m4cVar) {
                    objT3 = bc30.b1;
                    x340Var2.s0(objT3);
                }
                function2 = (Function0) objT3;
            }
            nim0Var = nim0.a;
            i6 = i3;
            qim0 qim0VarH2 = l6o1.H(u291.d(nim0Var, 1.0f), l6o1.C(0, 0, 1, x340Var2), false, 14);
            era eraVar2 = een.P0;
            f36Var = h36.c;
            mbhVarA = jbh.a(f36Var, eraVar2, x340Var2, 0);
            iHashCode = Long.hashCode(x340Var2.T);
            xos0VarM = x340Var2.m();
            qim0VarE = zr7.E(x340Var2, qim0VarH2);
            hzj.A.getClass();
            if (j06Var != null) {
                tgp1.p();
                throw null;
            }
            x340Var2.m0();
            z2 = x340Var2.S;
            n4kVar = hmb0.t1;
            if (z2) {
                x340Var2.l(n4kVar);
            } else {
                x340Var2.v0();
            }
            llj lljVar5 = y580.O0;
            nko1.H(mbhVarA, x340Var2, lljVar5);
            llj lljVar6 = y580.N0;
            nko1.H(xos0VarM, x340Var2, lljVar6);
            Integer numValueOf2 = Integer.valueOf(iHashCode);
            llj lljVar7 = y580.R0;
            nko1.H(numValueOf2, x340Var2, lljVar7);
            nko1.F(x340Var2);
            llj lljVar8 = y580.Y;
            nko1.H(qim0VarE, x340Var2, lljVar8);
            eso1.e(Uri.parse(str6), isl.a, u291.h(u291.f(nim0Var, 1.0f), 220.0f), (p3v) null, (zvx) null, (ecx) null, mif1.P0, (tl3) null, (ColorFilter) null, oux.a, false, false, x340Var2, 224304, 0, 3456);
            qim0 qim0VarF3 = u291.f(nim0Var, 1.0f);
            uwr uwrVar2 = cbx.a;
            qim0 qim0VarX2 = uyn1.x(qim0VarF3, cbx.b(x340Var2).b.a);
            mbh mbhVarA3 = jbh.a(f36Var, een.Q0, x340Var2, 0);
            int iHashCode3 = Long.hashCode(x340Var2.T);
            xos0 xos0VarM3 = x340Var2.m();
            qim0 qim0VarE3 = zr7.E(x340Var2, qim0VarX2);
            x340Var2.m0();
            if (x340Var2.S) {
                x340Var2.l(n4kVar);
            } else {
                x340Var2.v0();
            }
            nko1.H(mbhVarA3, x340Var2, lljVar5);
            nko1.H(xos0VarM3, x340Var2, lljVar6);
            x0d.q(iHashCode3, x340Var2, lljVar7, x340Var2);
            nko1.H(qim0VarE3, x340Var2, lljVar8);
            uwo1.e(str, u291.f(nim0Var, 1.0f), cbx.d(x340Var2).d, 0L, new a0e1(3), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var2, i6 & 14, 0, 2024);
            cvx cvxVar4 = cbx.b(x340Var2).b;
            lee1 lee1Var2 = kk0.p(nim0Var, 8.0f, x340Var2, x340Var2).j;
            qim0 qim0VarF4 = u291.f(nim0Var, 1.0f);
            cvx cvxVar5 = cbx.b(x340Var2).b;
            uwo1.e(str2, uyn1.z(16.0f, 0.0f, 2, qim0VarF4), lee1Var2, 0L, new a0e1(3), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var2, (i6 >> 3) & 14, 0, 2024);
            op71.g(x340Var2, u291.h(nim0Var, cbx.b(x340Var2).b.a));
            if ((i6 & 458752) == 131072) {
                z3 = true;
            } else {
                z3 = false;
            }
            objT = x340Var2.T();
            if (z3) {
                objT = new zg20(function0, (byte) 19);
                x340Var2.s0(objT);
            } else {
                objT = new zg20(function0, (byte) 19);
                x340Var2.s0(objT);
            }
            function4 = (Function0) objT;
            if (!ihc1.y0(str3)) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return;
            }
            foo1.c(new gbx(new y50(str3), function4), yfVar, (qim0) null, (max) null, (gdx) null, (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, apo.r(2084598302, new ps00(str3, (byte) 25), x340Var2), x340Var2, (i6 >> 6) & 112, 48, 2044);
            x340Var = x340Var2;
            if (str8 != null) {
                x340Var.i0(-581654053);
                cvx cvxVar6 = cbx.b(x340Var).b;
                op71.g(x340Var, u291.h(nim0Var, 12.0f));
                if ((i6 & 29360128) == 8388608) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                objT2 = x340Var.T();
                if (z4) {
                    objT2 = new zg20(function2, (byte) 20);
                    x340Var.s0(objT2);
                } else {
                    objT2 = new zg20(function2, (byte) 20);
                    x340Var.s0(objT2);
                }
                function5 = (Function0) objT2;
                if (!ihc1.y0(str8)) {
                    hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                    return;
                } else {
                    foo1.c(new gbx(new y50(str8), function5), jdx.c, (qim0) null, (max) null, (gdx) null, (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, apo.r(368630115, new ps00(str8, (byte) 26), x340Var), x340Var, 0, 48, 2044);
                    x340Var = x340Var;
                    x340Var.r(false);
                }
            } else {
                x340Var.i0(-581336923);
                x340Var.r(false);
            }
            x340Var.r(true);
            x340Var.r(true);
            str7 = str8;
        } else {
            x340Var = x340Var2;
            x340Var.b0();
            str7 = str5;
        }
        function3 = function2;
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new s2l(str, str2, str3, yfVar, str4, function0, str7, function3, i, i2);
        }
    }

    public static final void d(int i, Function0 function0, Function0 function1, b0k b0kVar, boolean z, boolean z2) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(512971814);
        int i2 = (x340Var.h(z) ? 4 : 2) | i | (x340Var.h(z2) ? 32 : 16) | (x340Var.i(function0) ? 256 : 128) | (x340Var.i(function1) ? 2048 : 1024);
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = v8r.q(u8w.a);
                x340Var.s0(objT);
            }
            ven0 ven0Var = (ven0) objT;
            i((u8w) ven0Var.getValue(), z, x340Var, (i2 << 3) & 112);
            u8w u8wVar = (u8w) ven0Var.getValue();
            qim0 qim0VarH = u291.h(u291.f(nim0.a, 1.0f), 512.0f);
            Object objT2 = x340Var.T();
            if (objT2 == m4cVar) {
                objT2 = vc40.P0;
                x340Var.s0(objT2);
            }
            hm5.a(u8wVar, qim0VarH, (iu30) objT2, (tl3) null, (String) null, (iu30) null, apo.r(2099027541, new iu40(z2, ven0Var, function1, z, function0), x340Var), x340Var, 1573248, 56);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new xoe(z, z2, function0, function1, i, (byte) 2);
        }
    }

    public static final void e(int i, Function0 function0, b0k b0kVar, boolean z) {
        Function0 function1;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-313787168);
        int i2 = (x340Var.h(z) ? 4 : 2) | i | (x340Var.i(function0) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            function1 = function0;
            c(cwl1.o0(x340Var, 2131956241), cwl1.o0(x340Var, 2131956240), cwl1.o0(x340Var, z ? 2131956238 : 2131956239), z ? jdx.c : new idx(13), "https://wear.spotifycdn.com/glasses-education-audio.webp", function1, null, null, x340Var, ((i2 << 12) & 458752) | 24576, 192);
        } else {
            function1 = function0;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ie1((byte) 6, i, function1, z);
        }
    }

    public static final void f(boolean z, Function0 function0, Function0 function1, b0k b0kVar, int i) {
        String strK;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1039185112);
        int i2 = i | (x340Var.h(z) ? 4 : 2) | (x340Var.i(function0) ? 32 : 16) | (x340Var.i(function1) ? 256 : 128);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            String strO0 = cwl1.o0(x340Var, 2131956247);
            String strO1 = cwl1.o0(x340Var, 2131956244);
            String strO2 = cwl1.o0(x340Var, 2131956242);
            idx idxVar = new idx(13);
            if (z) {
                strK = x0d.k(x340Var, -2070470280, 2131956243, x340Var, false);
            } else {
                x340Var.i0(240004293);
                x340Var.r(false);
                strK = null;
            }
            c(strO0, strO1, strO2, idxVar, "https://wear.spotifycdn.com/glasses-education-main.webp", function0, strK, function1, x340Var, ((i2 << 12) & 458752) | 24576 | ((i2 << 15) & 29360128), 0);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new lf2(z, function0, function1, i, (byte) 3);
        }
    }

    public static final void g(b9l1 b9l1Var, q9l1 q9l1Var, m0t m0tVar, VideoSurfaceView videoSurfaceView, o0i o0iVar, clj1 clj1Var, boolean z, Function0 function0, iu30 iu30Var, c2u0 c2u0Var, String str, b0k b0kVar, int i) {
        int i2;
        b0k b0kVar2;
        o0i o0iVar2;
        clj1 clj1Var2 = clj1Var;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(610824918);
        if ((i & 6) == 0) {
            i2 = (b0kVar3.i(b9l1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= b0kVar3.i(q9l1Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= b0kVar3.i(m0tVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= b0kVar3.i(videoSurfaceView) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= (32768 & i) == 0 ? b0kVar3.g(o0iVar) : b0kVar3.i(o0iVar) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= (i & 262144) == 0 ? b0kVar3.g(clj1Var2) : b0kVar3.i(clj1Var2) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= b0kVar3.h(z) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i2 |= b0kVar3.i(function0) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i2 |= b0kVar3.i(iu30Var) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i2 |= b0kVar3.i(c2u0Var) ? 536870912 : 268435456;
        }
        int i3 = i2;
        char c = b0kVar3.g(str) ? (char) 4 : (char) 2;
        if (b0kVar3.Y(i3 & 1, ((i3 & 306783379) == 306783378 && (c & 3) == 2) ? false : true)) {
            ven0 ven0VarS = v8r.s(function0, b0kVar3);
            ven0 ven0VarS2 = v8r.s(iu30Var, b0kVar3);
            int i4 = i3 >> 9;
            ven0 ven0VarS3 = v8r.s(videoSurfaceView, b0kVar3);
            Object objT = b0kVar3.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = v8r.q((Object) null);
                b0kVar3.s0(objT);
            }
            ven0 ven0Var = (ven0) objT;
            boolean zG = b0kVar3.g((VideoSurfaceView) ven0VarS3.getValue());
            Object objT2 = b0kVar3.T();
            if (zG || objT2 == m4cVar) {
                objT2 = UUID.randomUUID().toString();
                b0kVar3.s0(objT2);
            }
            objT2.getClass();
            String str2 = (String) objT2;
            Object objT3 = b0kVar3.T();
            if (objT3 == m4cVar) {
                objT3 = v8r.q((Object) null);
                b0kVar3.s0(objT3);
            }
            ven0 ven0Var2 = (ven0) objT3;
            VideoSurfaceView videoSurfaceView2 = (VideoSurfaceView) ven0VarS3.getValue();
            boolean zG2 = b0kVar3.g(ven0VarS3);
            Object objT4 = b0kVar3.T();
            if (zG2 || objT4 == m4cVar) {
                objT4 = new vs3(ven0VarS3, ven0Var, (lnm) null, (byte) 5);
                b0kVar3.s0(objT4);
            }
            qxd0.t(videoSurfaceView2, b0kVar3, (vu30) objT4);
            boolean zI = b0kVar3.i(q9l1Var) | ((i3 & 458752) == 131072 || ((i3 & 262144) != 0 && b0kVar3.i(clj1Var2))) | b0kVar3.g(str2) | ((i3 & 3670016) == 1048576) | b0kVar3.i(b9l1Var) | b0kVar3.g(ven0VarS3) | b0kVar3.g(ven0VarS2) | b0kVar3.g(ven0VarS) | b0kVar3.i(c2u0Var) | ((c & 14) == 4) | b0kVar3.i(m0tVar);
            Object objT5 = b0kVar3.T();
            if (zI || objT5 == m4cVar) {
                b0kVar2 = b0kVar3;
                qwm0 qwm0Var = new qwm0(q9l1Var, clj1Var2, str2, ven0Var2, ven0Var, z, b9l1Var, ven0VarS3, c2u0Var, str, ven0VarS2, ven0VarS, m0tVar);
                clj1Var2 = clj1Var2;
                b0kVar2.s0(qwm0Var);
                objT5 = qwm0Var;
            } else {
                b0kVar2 = b0kVar3;
            }
            o0iVar2 = o0iVar;
            oto1.c(clj1Var2, o0iVar2, (iu30) objT5, b0kVar2, ((i3 >> 15) & 14) | 64 | (i4 & 112));
        } else {
            b0kVar2 = b0kVar3;
            o0iVar2 = o0iVar;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new rpr(b9l1Var, q9l1Var, m0tVar, videoSurfaceView, o0iVar2, clj1Var2, z, function0, iu30Var, c2u0Var, str, i);
        }
    }

    public static final void h(int i, int i2, int i3, b0k b0kVar) {
        long jB;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-564424184);
        int i4 = (x340Var.e(i) ? 4 : 2) | i3 | (x340Var.e(i2) ? 32 : 16);
        if (x340Var.Y(i4 & 1, (i4 & 19) != 18)) {
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            jw31 jw31VarA = ew31.a(new d36(6.0f, true, new um5(false)), een.N0, x340Var, 0);
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
            nko1.H(jw31VarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            x340Var.i0(-1809538020);
            for (int i5 = 0; i5 < i; i5++) {
                qim0 qim0VarQ = i1p1.q(u291.r(nim0Var, 6.0f), er31.a);
                if (i5 == i2) {
                    x340Var.i0(-1925021032);
                    uwr uwrVar2 = cbx.a;
                    jB = cbx.a(x340Var).c.a;
                    x340Var.r(false);
                } else {
                    x340Var.i0(-1925019258);
                    uwr uwrVar3 = cbx.a;
                    jB = u7h.b(cbx.a(x340Var).c.a, 0.3f, 0.0f, 0.0f, 0.0f, 14);
                    x340Var.r(false);
                }
                t1c.a(dug.f(qim0VarQ, jB, d4o1.a), x340Var, 0);
            }
            x340Var.r(false);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new d681(i, i2, i3, (byte) 4);
        }
    }

    public static final void i(u8w u8wVar, boolean z, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(254850267);
        if ((i & 6) == 0) {
            i2 = (x340Var.e(u8wVar.ordinal()) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.h(z) ? 32 : 16;
        }
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            gw70 gw70Var = (gw70) x340Var.k(oi7.a);
            Boolean boolValueOf = Boolean.valueOf(z);
            boolean zI = ((i2 & 14) == 4) | ((i2 & 112) == 32) | x340Var.i(gw70Var);
            Object objT = x340Var.T();
            if (zI || objT == fkj0.X) {
                objT = new xr00(u8wVar, z, gw70Var, (lnm) null);
                x340Var.s0(objT);
            }
            qxd0.s(u8wVar, boolValueOf, (vu30) objT, x340Var);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new se5(u8wVar, z, i, (byte) 1);
        }
    }

    public static final void j(Function0 function0, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(267251516);
        int i2 = (x340Var.i(function0) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            qim0 qim0VarN = anm1.N("participantRemoveButton", nim0.a);
            String strO0 = cwl1.o0(x340Var, 2131956939);
            if (ihc1.y0(strO0)) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return;
            }
            foo1.c(new gbx(new y50(strO0), function0), kdx.c, qim0VarN, (max) null, yla.s(x340Var), (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, cui.b, x340Var, 0, 48, 2008);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new vgz(function0, i, (byte) 27);
        }
    }

    public static final void k(Function0 function0, b0k b0kVar, int i) {
        Function0 function1;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1706172679);
        int i2 = (x340Var.i(function0) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            function1 = function0;
            c(cwl1.o0(x340Var, 2131956252), cwl1.o0(x340Var, 2131956251), cwl1.o0(x340Var, 2131956238), jdx.c, "https://wear.spotifycdn.com/glasses-education-picture.webp", function1, null, null, x340Var, 24576 | ((i2 << 15) & 458752), 192);
        } else {
            function1 = function0;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new vgz(function1, i, (byte) 17);
        }
    }

    public static final void l(h631 h631Var, String str, qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(266584020);
        j06 j06Var = x340Var.a;
        int i2 = i | (x340Var.g(h631Var) ? 4 : 2) | (x340Var.g(str) ? 32 : 16) | (x340Var.i(qim0Var) ? 256 : 128);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            era eraVar = een.Q0;
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            mbh mbhVarA = jbh.a(new d36(16.0f, true, new um5(false)), eraVar, x340Var, 0);
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
            nko1.H(mbhVarA, x340Var, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var, lljVar3);
            nko1.F(x340Var);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var, lljVar4);
            q431 q431Var = h631Var.f;
            String strI = xcg1.i(q431Var.getUrl(), ":", h631Var.d);
            h6m h6mVar = mif1.Q0;
            nim0 nim0Var = nim0.a;
            epo1.a(q431Var, strI, h6mVar, d7e.r(1.0f, u291.f(nim0Var, 1.0f), false), x340Var, 0);
            qim0 qim0VarZ = uyn1.z(19.0f, 0.0f, 2, u291.f(nim0Var, 1.0f));
            boolean z2 = (i2 & 112) == 32;
            Object objT = x340Var.T();
            if (z2 || objT == fkj0.X) {
                objT = new bek1(str, (byte) 7);
                x340Var.s0(objT);
            }
            qim0 qim0VarB = s161.b(qim0VarZ, true, (iu30) objT);
            mbh mbhVarA2 = jbh.a(h36.c, eraVar, x340Var, 0);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0VarB);
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
            uwo1.e(h631Var.b, u291.f(nim0Var, 1.0f), cbx.d(x340Var).e, cbx.a(x340Var).b.a, new a0e1(3), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 0, 0, 2016);
            uwo1.e(h631Var.c, u291.f(nim0Var, 1.0f), cbx.d(x340Var).g, cbx.a(x340Var).b.b, new a0e1(3), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 0, 0, 2016);
            x340Var = x340Var;
            x340Var.r(true);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new pej1(h631Var, str, qim0Var, i, (byte) 17);
        }
    }

    public static final void m(List list, kes kesVar, String str, iu30 iu30Var, b0k b0kVar, int i) {
        x340 x340Var;
        m4c m4cVar = fkj0.X;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(-1047051580);
        int i2 = i | (x340Var2.g(list) ? 4 : 2) | (x340Var2.i(kesVar) ? 32 : 16) | (x340Var2.g(str) ? 256 : 128) | (x340Var2.i(iu30Var) ? 2048 : 1024);
        byte b = 1;
        if (x340Var2.Y(i2 & 1, (i2 & 1171) != 1170)) {
            ven0 ven0VarS = v8r.s(iu30Var, x340Var2);
            boolean zI = x340Var2.i(kesVar) | x340Var2.i(ven0VarS);
            Object objT = x340Var2.T();
            if (zI || objT == m4cVar) {
                objT = new gqj1(kesVar, ven0VarS, (lnm) null, (byte) 20);
                x340Var2.s0(objT);
            }
            int i3 = (i2 >> 3) & 14;
            qxd0.t(kesVar, x340Var2, (vu30) objT);
            int i4 = ((Configuration) x340Var2.k(AndroidCompositionLocals_androidKt.a)).screenWidthDp;
            boolean zE = x340Var2.e(i4);
            Object objT2 = x340Var2.T();
            if (zE || objT2 == m4cVar) {
                objT2 = ktd.k((float) (((double) i4) * 0.7d), x340Var2);
            }
            float f = ((p3v) objT2).a;
            boolean zE2 = x340Var2.e(i4);
            Object objT3 = x340Var2.T();
            if (zE2 || objT3 == m4cVar) {
                objT3 = ktd.k((float) (((double) i4) * 0.15000000000000002d), x340Var2);
            }
            float f2 = ((p3v) objT3).a;
            mbh mbhVarA = jbh.a(h36.c, een.Q0, x340Var2, 0);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            nim0 nim0Var = nim0.a;
            qim0 qim0VarE = zr7.E(x340Var2, nim0Var);
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
            fdr0 fdr0Var = new fdr0(f);
            zzq0 zzq0VarH = uyn1.h(2, f2, 0.0f);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var2).b;
            w0h1.c(kesVar, u291.f(nim0Var, 1.0f), zzq0VarH, fdr0Var, 0, 16.0f, (pl3) null, (ru91) null, false, (iu30) null, (d6o0) null, (xu91) null, (hxq0) null, apo.r(-107624325, new esj1(kesVar, list, str, b), x340Var2), x340Var2, i3, 16336);
            x340Var = x340Var2;
            if (list.size() > 1) {
                x340Var.i0(858080320);
                op71.g(x340Var, u291.h(nim0Var, cbx.b(x340Var).b.b));
                h(list.size(), ((err0) ((jkr0) kesVar).d.c).s(), 0, x340Var);
                x340Var.r(false);
            } else {
                x340Var.i0(858241768);
                x340Var.r(false);
            }
            x340Var.r(true);
        } else {
            x340Var = x340Var2;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new l3j1(list, kesVar, str, iu30Var, i, (byte) 7);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.spotify.listplatform.contextmenu.ItemUnavailableException */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object n(ay8 ay8Var, onm onmVar) throws ItemUnavailableException {
        tzu tzuVar;
        if (onmVar instanceof tzu) {
            tzuVar = (tzu) onmVar;
            int i = tzuVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                tzuVar.b = i - Integer.MIN_VALUE;
            } else {
                tzuVar = new tzu(onmVar);
            }
        } else {
            tzuVar = new tzu(onmVar);
        }
        Object objJ = tzuVar.a;
        int i2 = tzuVar.b;
        if (i2 == 0) {
            hm5.M(objJ);
            jte jteVar = new jte(2, null, (byte) 29);
            tzuVar.b = 1;
            objJ = b5p1.j(ay8Var, jteVar, tzuVar);
            d9n d9nVar = d9n.a;
            if (objJ == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objJ);
        }
        Object objG = u890.G((k1r) objJ);
        if (objG != null) {
            return objG;
        }
        throw new ItemUnavailableException();
    }

    public static void o() {
        Date date = xd.Y;
        xd xdVarS = fuo1.s();
        if (xdVarS == null) {
            return;
        }
        if (!fuo1.w()) {
            uo5.Y.o().M((hww0) null, true);
            return;
        }
        String str = xdVarS.e;
        nhc nhcVar = new nhc((byte) 20);
        JSONObject jSONObjectA = a8x0.a(str);
        if (jSONObjectA != null) {
            nhcVar.b(jSONObjectA);
            return;
        }
        dpi1 dpi1Var = new dpi1(nhcVar, str);
        md50 md50VarP = fpi1.p(str);
        md50VarP.i(dpi1Var);
        md50VarP.d();
    }

    public static final qim0 p(qim0 qim0Var, lz20 lz20Var) {
        return qim0Var.then(new mz20(lz20Var));
    }

    public static lfa1 q(SceneTemplate.TopSongJourneyContent.SongEntry songEntry, ofa1 ofa1Var) {
        kfa1 kfa1Var = new kfa1(songEntry, (byte) 0);
        kfa1 kfa1Var2 = new kfa1(songEntry, (byte) 1);
        kfa1 kfa1Var3 = new kfa1(songEntry, (byte) 2);
        kfa1 kfa1Var4 = new kfa1(songEntry, (byte) 3);
        List<Paragraph> listM = p7h.M(new Paragraph[]{songEntry.r(), songEntry.s(), songEntry.n(), songEntry.q()});
        ArrayList arrayList = new ArrayList(q7h.U(listM, 10));
        for (Paragraph paragraph : listM) {
            paragraph.getClass();
            arrayList.add(lbf1.a(paragraph));
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (!ihc1.y0((String) obj)) {
                arrayList2.add(obj);
            }
        }
        return new lfa1(kfa1Var, kfa1Var2, kfa1Var3, kfa1Var4, ofa1Var, o7h.y0(arrayList2, ". ", (String) null, (String) null, (iu30) null, 62));
    }

    public static final evz r(g0l g0lVar, iir iirVar, h3l h3lVar) {
        lnm lnmVar = null;
        if (h3lVar.equals(h3l.a)) {
            inr inrVar = (inr) g0lVar;
            return h5p1.s(new x010(yoi1.g(inrVar.j()), new wef(yoi1.g(inrVar.l()), (byte) 9), new l2(3, (lnm) null, (byte) 28), (byte) 1), new wef(yoi1.g(inrVar.j()), (byte) 10), yoi1.g(iirVar.i()), new r20((Object) h3lVar, lnmVar, (byte) 13));
        }
        eg.o();
        return null;
    }

    public static hww0 s() {
        return (hww0) uo5.Y.o().d;
    }

    public static final b180 t() {
        b180 b180Var = a;
        if (b180Var != null) {
            return b180Var;
        }
        a180 a180Var = new a180("Encore.Vector.GearsActive16", 16.0f, 16.0f, 16.0f, 16.0f, 0L, 0, false, 96);
        int i = bui1.a;
        n6a1 n6a1Var = new n6a1(u7h.b);
        cwh0 cwh0VarQ = rjx.q(15.515f, 7.501f, -1.078f, -0.405f);
        cwh0VarQ.g(-0.146f, -0.055f, -0.268f, -0.223f, -0.312f, -0.43f);
        cwh0VarQ.g(-0.04f, -0.192f, -0.002f, -0.374f, 0.104f, -0.485f);
        cwh0VarQ.k(0.804f, -0.847f);
        cwh0VarQ.c(0.75f, 0.75f, false, false, 0.127f, -0.851f);
        cwh0VarQ.c(8.3f, 8.3f, false, false, -2.079f, -2.645f);
        cwh0VarQ.c(0.75f, 0.75f, false, false, -0.874f, -0.065f);
        cwh0VarQ.k(-0.898f, 0.549f);
        cwh0VarQ.g(-0.168f, 0.103f, -0.394f, 0.059f, -0.546f, -0.018f);
        cwh0VarQ.g(-0.193f, -0.096f, -0.324f, -0.252f, -0.344f, -0.411f);
        cwh0VarQ.j(10.28f, 0.81f);
        cwh0VarQ.c(0.75f, 0.75f, false, false, -0.59f, -0.637f);
        cwh0VarQ.c(8.1f, 8.1f, false, false, -3.341f, 0.0f);
        cwh0VarQ.b(0.75f, 0.75f, false, false, 5.76f, 0.81f);
        cwh0VarQ.k(-0.136f, 1.05f);
        cwh0VarQ.g(-0.022f, 0.168f, -0.162f, 0.334f, -0.366f, 0.435f);
        cwh0VarQ.g(-0.208f, 0.102f, -0.42f, 0.108f, -0.571f, 0.017f);
        cwh0VarQ.k(-0.876f, -0.536f);
        cwh0VarQ.c(0.75f, 0.75f, false, false, -0.874f, 0.066f);
        cwh0VarQ.b(8.2f, 8.2f, false, false, 0.858f, 4.486f);
        cwh0VarQ.c(0.75f, 0.75f, false, false, 0.128f, 0.85f);
        cwh0VarQ.k(0.784f, 0.826f);
        cwh0VarQ.g(0.109f, 0.114f, 0.148f, 0.3f, 0.106f, 0.5f);
        cwh0VarQ.g(-0.045f, 0.21f, -0.17f, 0.382f, -0.32f, 0.439f);
        cwh0VarQ.k(-1.07f, 0.403f);
        cwh0VarQ.b(0.75f, 0.75f, false, false, 0.0f, 8.22f);
        cwh0VarQ.c(8.3f, 8.3f, false, false, 0.742f, 3.296f);
        cwh0VarQ.c(0.76f, 0.76f, false, false, 0.754f, 0.437f);
        cwh0VarQ.k(1.28f, -0.122f);
        cwh0VarQ.g(0.123f, -0.008f, 0.272f, 0.064f, 0.38f, 0.197f);
        cwh0VarQ.g(0.11f, 0.132f, 0.151f, 0.292f, 0.112f, 0.415f);
        cwh0VarQ.k(-0.404f, 1.246f);
        cwh0VarQ.c(0.75f, 0.75f, false, false, 0.252f, 0.823f);
        cwh0VarQ.c(8.1f, 8.1f, false, false, 3.01f, 1.47f);
        cwh0VarQ.g(0.314f, 0.08f, 0.64f, -0.051f, 0.813f, -0.322f);
        cwh0VarQ.k(0.761f, -1.18f);
        cwh0VarQ.g(0.111f, -0.17f, 0.518f, -0.157f, 0.628f, 0.012f);
        cwh0VarQ.k(0.754f, 1.168f);
        cwh0VarQ.c(0.75f, 0.75f, false, false, 0.812f, 0.322f);
        cwh0VarQ.c(8.1f, 8.1f, false, false, 3.011f, -1.472f);
        cwh0VarQ.c(0.75f, 0.75f, false, false, 0.252f, -0.822f);
        cwh0VarQ.k(-0.413f, -1.272f);
        cwh0VarQ.g(-0.046f, -0.14f, 0.026f, -0.298f, 0.108f, -0.4f);
        cwh0VarQ.g(0.102f, -0.127f, 0.253f, -0.201f, 0.366f, -0.188f);
        cwh0VarQ.k(1.287f, 0.123f);
        cwh0VarQ.c(0.74f, 0.74f, false, false, 0.755f, -0.439f);
        cwh0VarQ.b(8.4f, 8.4f, false, false, 16.0f, 8.217f);
        cwh0VarQ.c(0.75f, 0.75f, false, false, -0.485f, -0.716f);
        cwh0VarQ.m(-7.515f, 3.0f);
        cwh0VarQ.c(2.5f, 2.5f, true, true, 0.0f, -5.0f);
        cwh0VarQ.c(2.5f, 2.5f, false, true, 0.0f, 5.0f);
        a180.a(a180Var, cwh0VarQ.a, n6a1Var, 1.0f, 2, 1.0f);
        b180 b180VarB = a180Var.b();
        a = b180VarB;
        return b180VarB;
    }

    public static final Next u(Next next, xvn xvnVar, jwn jwnVar) {
        return !u890.j(jwnVar.f(), xvnVar.getContextUri()) ? Next.h(new gwn(jwnVar.f(), jwnVar.b(), jwnVar.d(), jwnVar.g(), jwnVar.a(), jwnVar.c(), jwnVar.e())) : next;
    }

    public static final boolean v(pc41 pc41Var) {
        int i = pc41Var != null ? pc41Var.a : 0;
        int i2 = i == 0 ? -1 : uby0.a[l1d.C(i)];
        if (i2 != -1) {
            if (i2 == 1) {
                return true;
            }
            if (i2 != 2) {
                eg.o();
                return false;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x008d  */
    public static final List w(hwg hwgVar) {
        mmr0 mmr0Var;
        if (!hwgVar.i) {
            return z6x.a;
        }
        Integer numValueOf = Integer.valueOf(hwgVar.j);
        if (!hwgVar.b()) {
            numValueOf = null;
        }
        mmr0 mmr0Var2 = new mmr0("video/av01", numValueOf);
        Integer numValueOf2 = Integer.valueOf(hwgVar.m);
        if (!hwgVar.d()) {
            numValueOf2 = null;
        }
        List<mmr0> listM = p7h.M(new mmr0[]{mmr0Var2, new mmr0("video/hevc", numValueOf2), new mmr0("video/x-vnd.on2.vp9", Integer.valueOf(hwgVar.l)), new mmr0("video/avc", Integer.valueOf(hwgVar.k))});
        ArrayList arrayList = new ArrayList();
        for (mmr0 mmr0Var3 : listM) {
            String str = (String) mmr0Var3.a;
            Integer num = (Integer) mmr0Var3.b;
            if (num == null) {
                mmr0Var = null;
            } else {
                if (num.intValue() < 0) {
                    num = null;
                }
                if (num != null) {
                    mmr0Var = new mmr0(str, Integer.valueOf(num.intValue()));
                } else {
                    mmr0Var = null;
                }
            }
            if (mmr0Var != null) {
                arrayList.add(mmr0Var);
            }
        }
        List listA1 = o7h.a1(arrayList, new be21((byte) 23));
        ArrayList arrayList2 = new ArrayList(q7h.U(listA1, 10));
        Iterator it = listA1.iterator();
        while (it.hasNext()) {
            arrayList2.add((String) ((mmr0) it.next()).a);
        }
        return arrayList2;
    }

    public static final xj61 x(qnf0 qnf0Var) {
        xj61 xj61Var = new xj61();
        if (qnf0Var.c == 2) {
            ay61 ay61Var = qnf0Var.a;
            String str = ay61Var.d;
            String str2 = ay61Var.Z;
            if (str2 == null) {
                str2 = "absent";
            }
            xj61Var.add(new fcw(str, str2, ay61Var.h, ay61Var.t));
        }
        return cwl1.j(xj61Var);
    }

    public static final void y(int i, String str) {
        throw new SQLException(f4i1.c(i, "Error code: ").concat(", message: ".concat(str)));
    }

    public static final mmw0 z(umw0 umw0Var) {
        if (umw0Var.equals(tmw0.a)) {
            return kmw0.a;
        }
        if (umw0Var.equals(smw0.a)) {
            return jmw0.a;
        }
        if (umw0Var instanceof rmw0) {
            return do01.a(Long.valueOf(((rmw0) umw0Var).a));
        }
        eg.o();
        return null;
    }
}
