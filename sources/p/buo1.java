package p;

import android.net.Uri;
import com.spotify.login.signupapi.services.model.MarketingMessagesOption;
import com.spotify.mobius.Next;
import io.reactivex.rxjava3.core.Emitter;
import io.reactivex.rxjava3.core.Notification;
import io.reactivex.rxjava3.internal.util.NotificationLite;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class buo1 {
    public static b180 a;

    public static final void a(int i, String str, Function0 function0, b0k b0kVar, hux huxVar, qim0 qim0Var) {
        int i2;
        String str2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-207978276);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? x340Var.g(huxVar) : x340Var.i(huxVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            str2 = str;
            i2 |= x340Var.g(str2) ? 32 : 16;
        } else {
            str2 = str;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(function0) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(qim0Var) ? 2048 : 1024;
        }
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            era eraVar = een.Q0;
            uwr uwrVar = cbx.a;
            cua cuaVar = cbx.b(x340Var).f;
            qim0 qim0VarF = dug.f(i1p1.q(qim0Var, er31.b(4.0f)), cbx.a(x340Var).a.b.c(), d4o1.a);
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = nve.a1;
                x340Var.s0(objT);
            }
            qim0 qim0VarB = s161.b(qim0VarF, false, (iu30) objT);
            boolean z = (i2 & 896) == 256;
            Object objT2 = x340Var.T();
            if (z || objT2 == m4cVar) {
                objT2 = new ukf(function0, (byte) 1);
                x340Var.s0(objT2);
            }
            qim0 qim0VarX = bin.x(qim0VarB, false, null, null, null, (Function0) objT2, 15);
            cvx cvxVar = cbx.b(x340Var).b;
            qim0 qim0VarZ = uyn1.z(0.0f, 8.0f, 1, qim0VarX);
            mbh mbhVarA = jbh.a(h36.e, eraVar, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarZ);
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
            zov0 zov0Var = cbx.b(x340Var).g;
            nim0 nim0Var = nim0.a;
            w0h1.a(huxVar, isl.a, u291.r(nim0Var, 24.0f), 0L, 0L, false, x340Var, 56 | (i2 & 14), 56);
            cvx cvxVar2 = cbx.b(x340Var).b;
            uwo1.e(str2, null, kk0.p(nim0Var, 4.0f, x340Var, x340Var).j, cbx.a(x340Var).b.a, null, null, 0, false, null, 0, null, x340Var, (i2 >> 3) & 14, 0, 2034);
            x340Var = x340Var;
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new glf(huxVar, str, function0, qim0Var, i, (byte) 0);
        }
    }

    public static final void b(boolean z, Function0 function0, Function0 function1, hux huxVar, String str, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1855917884);
        if ((i & 6) == 0) {
            i2 = (x340Var.h(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(function1) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= (i & 4096) == 0 ? x340Var.g(huxVar) : x340Var.i(huxVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= x340Var.g(str) ? 16384 : 8192;
        }
        if (x340Var.Y(i2 & 1, (i2 & 9363) != 9362)) {
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            d36 d36Var = new d36(8.0f, true, new um5(false));
            qim0 qim0VarF = u291.f(nim0.a, 1.0f);
            cvx cvxVar2 = cbx.b(x340Var).b;
            cvx cvxVar3 = cbx.b(x340Var).b;
            qim0 qim0VarY = uyn1.y(qim0VarF, 16.0f, 8.0f);
            jw31 jw31VarA = ew31.a(d36Var, een.Z, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarY);
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
            jpx jpxVar = z ? jpx.c : kpx.c;
            String strO0 = cwl1.o0(x340Var, z ? 2131961675 : 2131961670);
            if (1.0f <= 0.0d) {
                of80.a("invalid weight; must be greater than zero");
            }
            a(8 | ((i2 << 3) & 896), strO0, function0, x340Var, jpxVar, new wnb0(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true));
            x340Var = x340Var;
            if (function1 != null) {
                x340Var.i0(-1124312044);
                if (1.0f <= 0.0d) {
                    of80.a("invalid weight; must be greater than zero");
                }
                int i3 = i2 >> 9;
                a((i2 & 896) | (i3 & 112) | 8 | (i3 & 14), str, function1, x340Var, huxVar, new wnb0(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true));
                x340Var.r(false);
            } else {
                x340Var.i0(-1124144830);
                x340Var.r(false);
            }
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new sx1(z, function0, function1, (Object) huxVar, (Object) str, i, (byte) 7);
        }
    }

    public static final void c(long j, i28 i28Var, n18 n18Var, iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1922111490);
        if ((i & 6) == 0) {
            i2 = (x340Var.f(j) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.e(i28Var == null ? -1 : i28Var.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(n18Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(iu30Var) ? 2048 : 1024;
        }
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            iac0 iac0Var = (iac0) x340Var.k(jfe0.a);
            Object[] objArr = {Long.valueOf(j), i28Var, iu30Var, iac0Var};
            boolean zI = ((i2 & 112) == 32) | ((i2 & 7168) == 2048) | ((i2 & 14) == 4) | x340Var.i(n18Var) | x340Var.i(iac0Var);
            Object objT = x340Var.T();
            if (zI || objT == fkj0.X) {
                p18 p18Var = new p18(i28Var, iu30Var, j, n18Var, iac0Var, (lnm) null, (byte) 0);
                x340Var.s0(p18Var);
                objT = p18Var;
            }
            qxd0.u(objArr, (vu30) objT, x340Var);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new q18(j, i28Var, n18Var, iu30Var, i);
        }
    }

    public static final void d(ctf ctfVar, String str, jwm jwmVar, List list, boolean z, boolean z2, boolean z3, boolean z4, flf flfVar, qim0 qim0Var, boolean z5, boolean z6, boolean z7, b0k b0kVar, int i) {
        qim0 qim0Var2;
        Object obj;
        boolean z8;
        String str2;
        String str3;
        String str4;
        String str5;
        boolean z9;
        Object obj2;
        Object obj3;
        Function0 function0;
        boolean z10;
        Object obj4;
        Object obj5;
        Function0 function1 = flfVar.m;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-71889813);
        int i2 = i | (x340Var.i(ctfVar) ? 4 : 2) | (x340Var.g(str) ? 32 : 16) | (x340Var.g(jwmVar) ? 256 : 128) | (x340Var.g(list) ? 2048 : 1024) | (x340Var.h(z) ? 16384 : 8192) | (x340Var.h(z2) ? 131072 : 65536) | (x340Var.h(z3) ? 1048576 : 524288) | (x340Var.h(z4) ? 8388608 : 4194304) | (x340Var.g(flfVar) ? 67108864 : 33554432) | 805306368;
        if (x340Var.Y(i2 & 1, ((i2 & 306783379) == 306783378 && ((((x340Var.h(z5) ? (char) 4 : (char) 2) | (x340Var.h(z6) ? ' ' : (char) 16)) | (x340Var.h(z7) ? (char) 256 : (char) 128)) & 147) == 146) ? false : true)) {
            boolean z11 = ctfVar instanceof btf;
            jwm jwmVar2 = (jwm) o7h.s0(list);
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                obj = objT;
                hrr0 hrr0VarQ = v8r.q(Boolean.FALSE);
                x340Var.s0(hrr0VarQ);
                obj = hrr0VarQ;
            }
            obj = objT;
            ven0 ven0Var = (ven0) obj;
            if (((Boolean) ven0Var.getValue()).booleanValue()) {
                x340Var.i0(1519926232);
                boolean zI = x340Var.i(ven0Var) | ((i2 & 234881024) == 67108864);
                Object objT2 = x340Var.T();
                Object obj6 = objT2;
                if (zI || objT2 == m4cVar) {
                    ame ameVar = new ame(flfVar, ven0Var, (byte) 6);
                    x340Var.s0(ameVar);
                    obj6 = ameVar;
                }
                Function0 function2 = (Function0) obj6;
                boolean zI2 = x340Var.i(ven0Var);
                Object objT3 = x340Var.T();
                if (zI2 || objT3 == m4cVar) {
                    bp9 bp9Var = new bp9(ven0Var, (byte) 26);
                    x340Var.s0(bp9Var);
                    obj5 = bp9Var;
                } else {
                    obj5 = objT3;
                }
                h(function2, (Function0) obj5, x340Var, 0);
                x340Var.r(false);
            } else {
                jwmVar2 = jwmVar2;
                x340Var.i0(1520140535);
                x340Var.r(false);
            }
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarD = u291.d(qim0Var3, 1.0f);
            uwr uwrVar = cbx.a;
            qim0 qim0VarH = l6o1.H(dug.f(qim0VarD, cbx.a(x340Var).a.c, d4o1.a), l6o1.C(0, 0, 1, x340Var), false, 14);
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarH);
            hzj.A.getClass();
            Function0 function3 = null;
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
            k(z11, str, jwmVar, list, flfVar.d, flfVar.e, z7 ? flfVar.f : null, x340Var, i2 & 8176);
            jwm jwmVar3 = jwmVar2;
            b(z, z ? flfVar.b : flfVar.a, flfVar.c, z11 ? hrx.c : rnx.c, cwl1.o0(x340Var, z11 ? 2131961652 : 2131961656), x340Var, ((i2 >> 12) & 14) | 4096);
            x340Var = x340Var;
            boolean z12 = false;
            o(x340Var, 0);
            if (z11) {
                x340Var.i0(1533653629);
                Function0 function4 = flfVar.d;
                if (function4 == null) {
                    x340Var.i0(298622244);
                    x340Var.r(false);
                } else {
                    x340Var.i0(298622245);
                    j(0, 8, cwl1.o0(x340Var, 2131961672), cwl1.o0(x340Var, 2131961671), function4, x340Var, null);
                    x340Var = x340Var;
                    z12 = false;
                    x340Var.r(false);
                }
                x340Var.r(z12);
            } else {
                x340Var.i0(298870369);
                x340Var.r(false);
            }
            String str6 = "";
            if (z5) {
                x340Var.i0(298952457);
                float f = z4 ? 1.0f : 0.5f;
                if (z11) {
                    x340Var.i0(299022114);
                    String strO0 = cwl1.o0(x340Var, 2131961669);
                    String strO1 = cwl1.o0(x340Var, 2131961668);
                    if (z4) {
                        x340Var.i0(1533675834);
                        x340Var.r(false);
                        function0 = flfVar.g;
                    } else {
                        x340Var.i0(299354372);
                        boolean zI3 = x340Var.i(ven0Var);
                        Object objT4 = x340Var.T();
                        if (zI3 || objT4 == m4cVar) {
                            obj3 = objT4;
                            bp9 bp9Var2 = new bp9(ven0Var, (byte) 27);
                            x340Var.s0(bp9Var2);
                            obj3 = bp9Var2;
                        }
                        function0 = (Function0) obj3;
                        x340Var.r(false);
                    }
                    x340Var.i0(1533681389);
                    qim0 qim0VarK = d9y0.k(qim0Var3, f);
                    if (z4) {
                        z10 = false;
                        x340Var.i0(725591607);
                    } else {
                        x340Var.i0(725590669);
                        Object objT5 = x340Var.T();
                        if (objT5 == m4cVar) {
                            obj4 = objT5;
                            nve nveVar = nve.b1;
                            x340Var.s0(nveVar);
                            obj4 = nveVar;
                        }
                        obj4 = objT5;
                        z10 = false;
                        qim0VarK = s161.b(qim0VarK, false, (iu30) obj4);
                    }
                    x340Var.r(z10);
                    qim0 qim0Var4 = qim0VarK;
                    x340Var.r(z10);
                    x340 x340Var2 = x340Var;
                    j(0, 0, strO0, strO1, function0, x340Var2, qim0Var4);
                    x340Var = x340Var2;
                    x340Var.r(z10);
                    z9 = z10;
                } else {
                    x340Var.i0(299647787);
                    if (jwmVar3 == null || (str4 = jwmVar3.a.b) == null) {
                        str4 = "";
                    }
                    String strN0 = cwl1.n0(2131961667, new Object[]{str4}, x340Var);
                    if (jwmVar3 == null || (str5 = jwmVar3.a.b) == null) {
                        str5 = "";
                    }
                    String strN1 = cwl1.n0(2131961666, new Object[]{str5}, x340Var);
                    boolean z13 = z4 && z3;
                    iu30 iu30Var = z4 ? flfVar.h : null;
                    if (z4) {
                        z9 = false;
                        x340Var.i0(300342620);
                        x340Var.r(false);
                    } else {
                        x340Var.i0(300277924);
                        boolean zI4 = x340Var.i(ven0Var);
                        Object objT6 = x340Var.T();
                        if (zI4 || objT6 == m4cVar) {
                            obj2 = objT6;
                            bp9 bp9Var3 = new bp9(ven0Var, (byte) 28);
                            x340Var.s0(bp9Var3);
                            obj2 = bp9Var3;
                        }
                        function3 = (Function0) obj2;
                        z9 = false;
                        x340Var.r(false);
                    }
                    q(strN0, strN1, z13, iu30Var, d9y0.k(qim0Var3, f), function3, !z4, x340Var, 0);
                    x340Var.r(z9);
                }
                x340Var.r(z9);
            } else {
                x340Var.i0(300482369);
                x340Var.r(false);
            }
            if (z6) {
                x340Var.i0(300518143);
                x340 x340Var3 = x340Var;
                j(0, 8, cwl1.o0(x340Var, 2131961655), cwl1.o0(x340Var, 2131961654), flfVar.j, x340Var3, null);
                x340Var = x340Var3;
                z8 = false;
                x340Var.r(false);
            } else {
                z8 = false;
                x340Var.i0(300766081);
                x340Var.r(false);
            }
            o(x340Var, z8 ? 1 : 0);
            if (z11) {
                x340Var.i0(300841101);
                Function0 function5 = flfVar.k;
                if (function5 == null) {
                    x340Var.i0(300845998);
                    x340Var.r(z8);
                } else {
                    x340Var.i0(300845999);
                    e(cwl1.o0(x340Var, 2131961673), csx.c, function5, false, x340Var, csx.d << 3, 8);
                    z8 = false;
                    x340Var.r(false);
                }
                Function0 function6 = flfVar.l;
                if (function6 == null) {
                    x340Var.i0(301087922);
                    x340Var.r(z8);
                } else {
                    x340Var.i0(301087923);
                    e(cwl1.o0(x340Var, 2131961665), hox.c, function6, false, x340Var, hox.d << 3, 8);
                    z8 = false;
                    x340Var.r(false);
                }
                if (function1 == null) {
                    x340Var.i0(301328110);
                    x340Var.r(z8);
                } else {
                    x340Var.i0(301328111);
                    e(cwl1.o0(x340Var, 2131961658), cmx.c, function1, true, x340Var, (cmx.d << 3) | 3072, 0);
                    z8 = false;
                    x340Var.r(false);
                }
                Function0 function7 = flfVar.n;
                if (function7 == null) {
                    x340Var.i0(301611636);
                    x340Var.r(z8);
                } else {
                    x340Var.i0(301611637);
                    e(cwl1.o0(x340Var, 2131961664), cmx.c, function7, true, x340Var, (cmx.d << 3) | 3072, 0);
                    z8 = false;
                    x340Var.r(false);
                }
                x340Var.r(z8);
            } else {
                x340Var.i0(301912957);
                if (z2) {
                    x340Var.i0(301952358);
                    Function0 function8 = flfVar.f9p;
                    if (function8 == null) {
                        x340Var.i0(301952357);
                        x340Var.r(z8);
                    } else {
                        x340Var.i0(301952358);
                        if (jwmVar3 != null && (str3 = jwmVar3.a.b) != null) {
                            str6 = str3;
                        }
                        e(cwl1.n0(2131961674, new Object[]{str6}, x340Var), tkx.c, function8, false, x340Var, tkx.d << 3, 8);
                        z8 = false;
                        x340Var.r(false);
                    }
                    x340Var.r(z8);
                } else {
                    x340Var.i0(302315244);
                    Function0 function9 = flfVar.o;
                    if (function9 == null) {
                        x340Var.i0(302315243);
                        x340Var.r(z8);
                    } else {
                        x340Var.i0(302315244);
                        if (jwmVar3 != null && (str2 = jwmVar3.a.b) != null) {
                            str6 = str2;
                        }
                        e(cwl1.n0(2131961653, new Object[]{str6}, x340Var), tkx.c, function9, false, x340Var, tkx.d << 3, 8);
                        z8 = false;
                        x340Var.r(false);
                    }
                    x340Var.r(z8);
                }
                if (function1 == null) {
                    x340Var.i0(302662350);
                    x340Var.r(z8);
                } else {
                    x340Var.i0(302662351);
                    e(cwl1.o0(x340Var, 2131961658), cmx.c, function1, true, x340Var, (cmx.d << 3) | 3072, 0);
                    z8 = false;
                    x340Var.r(false);
                }
                x340Var.r(z8);
            }
            x0d.s(qim0Var3, cbx.b(x340Var).b.b, x340Var, true);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new hlf(ctfVar, str, jwmVar, list, z, z2, z3, z4, flfVar, qim0Var2, z5, z6, z7, i);
        }
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0070  */
    /* JADX WARN: Code duplicated, block: B:41:0x0072  */
    /* JADX WARN: Code duplicated, block: B:44:0x007b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:45:0x007d  */
    /* JADX WARN: Code duplicated, block: B:46:0x007f  */
    /* JADX WARN: Code duplicated, block: B:49:0x008c  */
    /* JADX WARN: Code duplicated, block: B:54:0x0097  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:60:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:65:? A[RETURN, SYNTHETIC] */
    public static final void e(String str, hux huxVar, Function0 function0, boolean z, b0k b0kVar, int i, int i2) {
        int i3;
        boolean z2;
        boolean z3;
        b0k b0kVar2;
        boolean z4;
        h311 h311VarV;
        boolean z5;
        qim0 qim0VarF;
        boolean z6;
        Object objT;
        Function0 function1;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(1631929465);
        if ((i & 6) == 0) {
            i3 = (b0kVar3.g(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= (i & 64) == 0 ? b0kVar3.g(huxVar) : b0kVar3.i(huxVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= b0kVar3.i(function0) ? 256 : 128;
        }
        int i4 = i2 & 8;
        if (i4 == 0) {
            if ((i & 3072) == 0) {
                z2 = z;
                i3 |= b0kVar3.h(z2) ? 2048 : 1024;
            }
            if ((i3 & 1171) != 1170) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (b0kVar3.Y(i3 & 1, z3)) {
                if (i4 != 0) {
                    z5 = false;
                } else {
                    z5 = z2;
                }
                qim0VarF = u291.f(nim0.a, 1.0f);
                z6 = (i3 & 896) == 256;
                objT = b0kVar3.T();
                if (z6 || objT == fkj0.X) {
                    objT = new ukf(function0, (byte) 2);
                    b0kVar3.s0(objT);
                }
                function1 = (Function0) objT;
                if (!ihc1.y0(str)) {
                    hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                    return;
                } else {
                    b0kVar2 = b0kVar3;
                    jto1.b(qim0VarF, null, null, false, null, null, new gbx(new y50(str), function1), null, apo.r(-1739500669, new zw2((Object) huxVar, z5, (byte) 5), b0kVar3), null, null, null, null, null, null, apo.r(-94723395, new c2(str, z5, (byte) 3), b0kVar3), b0kVar2, 100663296, 196608, 32446);
                    z4 = z5;
                }
            } else {
                b0kVar2 = b0kVar3;
                b0kVar2.b0();
                z4 = z2;
            }
            h311VarV = b0kVar2.v();
            if (h311VarV != null) {
                h311VarV.d = new ilf((byte) 0, i, i2, (Object) str, (Object) huxVar, (cv30) function0, z4);
            }
        }
        i3 |= 3072;
        z2 = z;
        if ((i3 & 1171) != 1170) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (b0kVar3.Y(i3 & 1, z3)) {
            if (i4 != 0) {
                z5 = false;
            } else {
                z5 = z2;
            }
            qim0VarF = u291.f(nim0.a, 1.0f);
            if ((i3 & 896) == 256) {
            }
            objT = b0kVar3.T();
            if (z6) {
                objT = new ukf(function0, (byte) 2);
                b0kVar3.s0(objT);
            } else {
                objT = new ukf(function0, (byte) 2);
                b0kVar3.s0(objT);
            }
            function1 = (Function0) objT;
            if (!ihc1.y0(str)) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return;
            } else {
                b0kVar2 = b0kVar3;
                jto1.b(qim0VarF, null, null, false, null, null, new gbx(new y50(str), function1), null, apo.r(-1739500669, new zw2((Object) huxVar, z5, (byte) 5), b0kVar3), null, null, null, null, null, null, apo.r(-94723395, new c2(str, z5, (byte) 3), b0kVar3), b0kVar2, 100663296, 196608, 32446);
                z4 = z5;
            }
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            z4 = z2;
        }
        h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new ilf((byte) 0, i, i2, (Object) str, (Object) huxVar, (cv30) function0, z4);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void f(qim0 qim0Var, int i, String str, float f, b0k b0kVar, int i2, int i3) throws NoWhenBranchMatchedException {
        String str2;
        int i4;
        qim0 qim0Var2;
        int i5;
        float f2;
        int i6;
        qim0 qim0Var3;
        String str3;
        float f3;
        long jA;
        long j;
        long jA2;
        long j2;
        qim0 qim0Var4;
        boolean z;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-96749657);
        j06 j06Var = x340Var.a;
        int i7 = i2 | 54;
        int i8 = i3 & 4;
        if (i8 != 0) {
            i4 = i2 | 438;
            str2 = str;
        } else {
            str2 = str;
            i4 = i7 | (x340Var.g(str2) ? 256 : 128);
        }
        int i9 = i4 | 25600;
        if (x340Var.Y(i9 & 1, (i9 & 9363) != 9362)) {
            x340Var.d0();
            int i10 = i2 & 1;
            qim0 qim0Var5 = nim0.a;
            if (i10 == 0 || x340Var.E()) {
                if (i8 != 0) {
                    str2 = null;
                }
                uwr uwrVar = cbx.a;
                mta mtaVar = cbx.b(x340Var).d;
                i6 = i9 & (-7169);
                qim0Var3 = qim0Var5;
                str3 = str2;
                f3 = 48.0f;
                i5 = 1;
            } else {
                x340Var.b0();
                i5 = i;
                i6 = i9 & (-7169);
                qim0Var3 = qim0Var;
                str3 = str2;
                f3 = f;
            }
            x340Var.s();
            int iC = l1d.C(i5);
            if (iC == 0) {
                x340Var.i0(1512870901);
                uwr uwrVar2 = cbx.a;
                jA = cbx.a(x340Var).a.a.a();
                x340Var.r(false);
            } else {
                if (iC != 1) {
                    throw p3d1.k(x340Var, 1512868929, false);
                }
                x340Var.i0(1512873046);
                uwr uwrVar3 = cbx.a;
                jA = cbx.a(x340Var).a.c;
                x340Var.r(false);
            }
            int iC2 = l1d.C(i5);
            if (iC2 == 0) {
                x340Var.i0(1512876593);
                j = cbx.a(x340Var).c.b;
                x340Var.r(false);
            } else {
                if (iC2 != 1) {
                    throw p3d1.k(x340Var, 1512874617, false);
                }
                x340Var.i0(1512878610);
                j = cbx.a(x340Var).c.b;
                x340Var.r(false);
            }
            int iC3 = l1d.C(i5);
            if (iC3 == 0) {
                x340Var.i0(1512882362);
                jA2 = cbx.a(x340Var).a.a.a();
                x340Var.r(false);
            } else {
                if (iC3 != 1) {
                    throw p3d1.k(x340Var, 1512880395, false);
                }
                x340Var.i0(1512884667);
                jA2 = cbx.a(x340Var).a.c;
                x340Var.r(false);
            }
            int iC4 = l1d.C(i5);
            if (iC4 == 0) {
                x340Var.i0(1512888500);
                j2 = cbx.a(x340Var).b.a;
                x340Var.r(false);
            } else {
                if (iC4 != 1) {
                    throw p3d1.k(x340Var, 1512886527, false);
                }
                x340Var.i0(1512890613);
                j2 = cbx.a(x340Var).b.a;
                x340Var.r(false);
            }
            qim0 qim0VarF = u291.f(qim0Var3, 1.0f);
            qim0 qim0Var6 = qim0Var3;
            jw31 jw31VarA = ew31.a(h36.b, een.N0, x340Var, 0);
            long j3 = j2;
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarF);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw 0;
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
            nko1.H(jw31VarA, x340Var, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var, lljVar3);
            nko1.F(x340Var);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var, lljVar4);
            if (str3 == null || str3.length() == 0) {
                qim0Var4 = qim0Var5;
                z = false;
                x340Var.i0(-17421609);
                x340Var.r(false);
            } else {
                x340Var.i0(-17637834);
                n(str3, jA2, j3, x340Var, (i6 >> 6) & 14);
                cvx cvxVar = cbx.b(x340Var).b;
                qim0Var4 = qim0Var5;
                z = false;
                ab80.p(qim0Var4, 8.0f, x340Var, false);
            }
            qim0 qim0VarF2 = dug.f(i1p1.q(u291.r(qim0Var4, f3), er31.a), jA, d4o1.a);
            gfh0 gfh0VarC = t1c.c(een.h, z);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0VarF2);
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
            x340Var.i0(522312883);
            m(0.0f, 0, j, x340Var);
            us71.m(x340Var, false, true, true);
            qim0Var2 = qim0Var6;
            f2 = f3;
            str2 = str3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
            i5 = i;
            f2 = f;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new h57(qim0Var2, i5, str2, f2, i2, i3);
        }
    }

    public static final void g(lik1 lik1Var, yzz0 yzz0Var, idm idmVar, fqm fqmVar, Function0 function0, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        Function0 function1;
        qim0 qim0Var2;
        xzz0 xzz0Var = yzz0Var.d;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1870210912);
        j06 j06Var = x340Var.a;
        if ((i & 6) == 0) {
            i2 = (x340Var.g(lik1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.g(yzz0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(idmVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(fqmVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= x340Var.i(function0) ? 16384 : 8192;
        }
        int i3 = i2 | 196608;
        if (x340Var.Y(i3 & 1, (74899 & i3) != 74898)) {
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarD = i541.D(qim0Var3, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, 0L, 0L, 2, null, 978939);
            qim0 qim0VarN = anm1.N("reaction-share-card-failed", u291.f(ltn1.t(qim0Var3, yzz0Var.c), 1.0f));
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            cvx cvxVar2 = cbx.b(x340Var).b;
            qim0 qim0VarB = uyn1.B(qim0VarN, 0.0f, 6.0f, 0.0f, 6.0f, 5);
            cvx cvxVar3 = cbx.b(x340Var).b;
            d36 d36Var = new d36(4.0f, true, new um5(false));
            era eraVar = een.P0;
            mbh mbhVarA = jbh.a(d36Var, eraVar, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarB);
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
            mgo1.a(xzz0Var, qim0VarD, x340Var, 0, 0);
            g6p1.c(lik1Var, new a001(yzz0Var.a, xzz0Var, yzz0Var.c, yzz0Var.e, yzz0Var.g), idmVar, qim0VarD, x340Var, i3 & 910, 0);
            if (yzz0Var.b) {
                x340Var.i0(1106972748);
                era eraVar2 = xzz0Var.a() ? een.R0 : eraVar;
                qim0 qim0VarN2 = anm1.N("failed-error-row", new tq60(eraVar2));
                gfh0 gfh0VarC = t1c.c(een.d, false);
                int iHashCode2 = Long.hashCode(x340Var.T);
                xos0 xos0VarM2 = x340Var.m();
                qim0 qim0VarE2 = zr7.E(x340Var, qim0VarN2);
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
                function1 = function0;
                otw.c(fqmVar, new eqm(yzz0Var.f, eraVar2, 5, function1), (qim0) null, (ipb1) null, x340Var, (i3 >> 9) & 14, 12);
                x340Var.r(true);
                x340Var.r(false);
            } else {
                function1 = function0;
                x340Var.i0(1107526284);
                x340Var.r(false);
            }
            x340Var.r(true);
            qim0Var2 = qim0Var3;
        } else {
            function1 = function0;
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new wc0(lik1Var, yzz0Var, idmVar, fqmVar, function1, qim0Var2, i);
        }
    }

    public static final void h(Function0 function0, Function0 function1, b0k b0kVar, int i) {
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1269716030);
        int i2 = (x340Var.i(function0) ? 4 : 2) | i | (x340Var.i(function1) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            String strO0 = cwl1.o0(x340Var, 2131961663);
            String strO1 = cwl1.o0(x340Var, 2131961662);
            String strO2 = cwl1.o0(x340Var, 2131961661);
            boolean z = (i2 & 14) == 4;
            Object objT = x340Var.T();
            if (z || objT == m4cVar) {
                objT = new ukf(function0, (byte) 3);
                x340Var.s0(objT);
            }
            z50 z50Var = z50.c;
            zgx zgxVar = new zgx(strO2, new gbx(z50Var, (Function0) objT));
            String strO3 = cwl1.o0(x340Var, 2131961660);
            boolean z2 = (i2 & 112) == 32;
            Object objT2 = x340Var.T();
            if (z2 || objT2 == m4cVar) {
                objT2 = new ukf(function1, (byte) 4);
                x340Var.s0(objT2);
            }
            mqo1.d(function1, null, null, strO0, strO1, zgxVar, new zgx(strO3, new gbx(z50Var, (Function0) objT2)), x340Var, ((i2 >> 3) & 14) | 2359296, 6);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new n4d(function0, function1, i, (byte) 2);
        }
    }

    public static final void i(jri0 jri0Var, Function0 function0, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(881855485);
        j06 j06Var = x340Var.a;
        if ((i & 6) == 0) {
            i2 = i | (x340Var.g(jri0Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(function0) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if (x340Var.Y(i3 & 1, (i3 & 147) != 146)) {
            uwr uwrVar = cbx.a;
            wux wuxVarB = cbx.b(x340Var);
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarF = u291.f(qim0Var3, 1.0f);
            era eraVar = een.P0;
            f36 f36Var = h36.c;
            mbh mbhVarA = jbh.a(f36Var, eraVar, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarF);
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
            rqo1.g(6, 0, x340Var, qim0Var3);
            qim0 qim0VarF2 = u291.f(qim0Var3, 1.0f);
            boolean z2 = (i3 & 112) == 32;
            Object objT = x340Var.T();
            if (z2 || objT == fkj0.X) {
                objT = new tze0(function0, (byte) 25);
                x340Var.s0(objT);
            }
            qim0 qim0VarX = bin.x(qim0VarF2, false, null, null, null, (Function0) objT, 15);
            cvx cvxVar = wuxVarB.b;
            qim0 qim0VarZ = uyn1.z(0.0f, 16.0f, 1, qim0VarX);
            jw31 jw31VarA = ew31.a(h36.g, een.N0, x340Var, 0);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0VarZ);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(jw31VarA, x340Var, lljVar);
            nko1.H(xos0VarM2, x340Var, lljVar2);
            x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
            wnb0 wnb0VarQ = kk0.q(x340Var, qim0VarE2, lljVar4, 1.0f, true);
            mbh mbhVarA2 = jbh.a(f36Var, eraVar, x340Var, 0);
            int iHashCode3 = Long.hashCode(x340Var.T);
            xos0 xos0VarM3 = x340Var.m();
            qim0 qim0VarE3 = zr7.E(x340Var, wnb0VarQ);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(mbhVarA2, x340Var, lljVar);
            nko1.H(xos0VarM3, x340Var, lljVar2);
            x0d.q(iHashCode3, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE3, x340Var, lljVar4);
            uwo1.e(jri0Var.a, null, cbx.d(x340Var).h, 0L, null, null, 0, false, new cjc0(2), 0, null, x340Var, 0, 0, 1786);
            if (jri0Var.b.length() > 0) {
                x340Var.i0(-79731920);
                uwo1.e(jri0Var.b, null, cbx.d(x340Var).j, cbx.a(x340Var).b.b, null, null, 0, false, new cjc0(1), 0, null, x340Var, 0, 0, 1778);
                x340Var.r(false);
            } else {
                x340Var.i0(-79511851);
                x340Var.r(false);
            }
            x340Var.r(true);
            if (jri0Var.c != null) {
                x340Var.i0(561577313);
                uwo1.e(jri0Var.c, null, cbx.d(x340Var).k, 0L, null, null, 0, false, new cjc0(1), 0, null, x340Var, 0, 0, 1786);
                x340Var.r(false);
            } else {
                x340Var.i0(561740683);
                x340Var.r(false);
            }
            x340Var.r(true);
            x340Var.r(true);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new vqd0((Object) jri0Var, (Object) function0, (Object) qim0Var2, i, (byte) 22);
        }
    }

    public static final void j(int i, int i2, String str, String str2, Function0 function0, b0k b0kVar, qim0 qim0Var) {
        qim0 qim0Var2;
        int i3;
        b0k b0kVar2;
        qim0 qim0Var3;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(1703585949);
        int i4 = i | (b0kVar3.g(str) ? 4 : 2) | (b0kVar3.g(str2) ? 32 : 16) | (b0kVar3.i(function0) ? 256 : 128);
        int i5 = i2 & 8;
        if (i5 != 0) {
            i3 = i4 | 3072;
            qim0Var2 = qim0Var;
        } else {
            qim0Var2 = qim0Var;
            i3 = i4 | (b0kVar3.i(qim0Var2) ? 2048 : 1024);
        }
        if (b0kVar3.Y(i3 & 1, (i3 & 1171) != 1170)) {
            qim0 qim0Var4 = i5 != 0 ? nim0.a : qim0Var2;
            qim0 qim0VarF = u291.f(qim0Var4, 1.0f);
            boolean z = (i3 & 896) == 256;
            Object objT = b0kVar3.T();
            if (z || objT == fkj0.X) {
                objT = new ukf(function0, (byte) 5);
                b0kVar3.s0(objT);
            }
            Function0 function1 = (Function0) objT;
            if (ihc1.y0(str)) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return;
            } else {
                b0kVar2 = b0kVar3;
                jto1.b(qim0VarF, null, null, false, null, null, new gbx(new y50(str), function1), null, null, null, null, apo.r(2052067797, new kaf(str2, (byte) 1), b0kVar3), bci.a, null, null, apo.r(-945713959, new kaf(str, (byte) 2), b0kVar3), b0kVar2, 0, 197040, 26558);
                qim0Var3 = qim0Var4;
            }
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var3 = qim0Var2;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new jlf(str, str2, function0, qim0Var3, i, i2, (byte) 0);
        }
    }

    public static final void k(boolean z, String str, jwm jwmVar, List list, Function0 function0, Function0 function1, Function0 function2, b0k b0kVar, int i) {
        int i2;
        x340 x340Var;
        boolean z2;
        int i3;
        nim0 nim0Var;
        x340 x340Var2;
        Object obj = fkj0.X;
        x340 x340Var3 = (x340) b0kVar;
        x340Var3.k0(1732296396);
        if ((i & 6) == 0) {
            i2 = (x340Var3.h(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var3.g(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? x340Var3.g(jwmVar) : x340Var3.i(jwmVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= (i & 4096) == 0 ? x340Var3.g(list) : x340Var3.i(list) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= x340Var3.i(function0) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= x340Var3.i(function1) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= x340Var3.i(function2) ? 1048576 : 524288;
        }
        if (x340Var3.Y(i2 & 1, (599187 & i2) != 599186)) {
            era eraVar = een.Q0;
            nim0 nim0Var2 = nim0.a;
            qim0 qim0VarF = u291.f(nim0Var2, 1.0f);
            uwr uwrVar = cbx.a;
            float f = cbx.b(x340Var3).b.a;
            cvx cvxVar = cbx.b(x340Var3).b;
            cvx cvxVar2 = cbx.b(x340Var3).b;
            cvx cvxVar3 = cbx.b(x340Var3).b;
            qim0 qim0VarA = uyn1.A(qim0VarF, 16.0f, f, 16.0f, 8.0f);
            mbh mbhVarA = jbh.a(h36.c, eraVar, x340Var3, 0);
            int iHashCode = Long.hashCode(x340Var3.T);
            xos0 xos0VarM = x340Var3.m();
            qim0 qim0VarE = zr7.E(x340Var3, qim0VarA);
            hzj.A.getClass();
            if (x340Var3.a == null) {
                tgp1.p();
                throw null;
            }
            x340Var3.m0();
            if (x340Var3.S) {
                x340Var3.l(hmb0.t1);
            } else {
                x340Var3.v0();
            }
            nko1.H(mbhVarA, x340Var3, y580.O0);
            nko1.H(xos0VarM, x340Var3, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var3, y580.R0);
            nko1.F(x340Var3);
            nko1.H(qim0VarE, x340Var3, y580.Y);
            if (z) {
                x340Var3.i0(-1981361197);
                boolean z3 = ((i2 & 896) == 256 || ((i2 & 512) != 0 && x340Var3.g(jwmVar))) | ((i2 & 7168) == 2048 || ((i2 & 4096) != 0 && x340Var3.g(list)));
                Object objT = x340Var3.T();
                if (z3 || objT == obj) {
                    objT = o7h.d1(o7h.N0(list, Collections.singletonList(jwmVar)), 3);
                    x340Var3.s0(objT);
                }
                List list2 = (List) objT;
                boolean zG = x340Var3.g(list2);
                Object objT2 = x340Var3.T();
                if (zG || objT2 == obj) {
                    List list3 = list2;
                    ArrayList arrayList = new ArrayList(q7h.U(list3, 10));
                    Iterator it = list3.iterator();
                    while (it.hasNext()) {
                        w4i1 w4i1Var = ((jwm) it.next()).a;
                        String str2 = w4i1Var.a;
                        String str3 = w4i1Var.b;
                        String str4 = w4i1Var.c;
                        arrayList.add(new phx(bro1.q(w4i1Var.d), str4 == null ? "" : str4, str2, str3));
                    }
                    objT2 = mqo1.A(arrayList);
                    x340Var3.s0(objT2);
                }
                fc11.a((c380) objT2, (qim0) null, hcx.d, (hux) null, false, 0, function0 != null ? new gbx(z50.c, function0) : null, cwl1.o0(x340Var3, 2131961672), (idn0) null, x340Var3, 392, 314);
                x340Var2 = x340Var3;
                x340Var2.r(false);
                i3 = i2;
                nim0Var2 = nim0Var2;
                z2 = false;
            } else {
                x340Var3.i0(-1980486315);
                jwm jwmVar2 = (jwm) o7h.s0(list);
                String strO0 = cwl1.o0(x340Var3, 2131961676);
                String str5 = jwmVar2 != null ? jwmVar2.a.c : null;
                if (str5 == null) {
                    str5 = "";
                }
                Uri uri = Uri.parse(str5);
                String str6 = jwmVar2 != null ? jwmVar2.a.b : null;
                if (str6 == null) {
                    str6 = "";
                }
                String str7 = str6;
                String str8 = jwmVar2 != null ? jwmVar2.a.a : null;
                String str9 = str8 == null ? "" : str8;
                if (function1 == null) {
                    x340Var3.i0(-1980088338);
                    z2 = false;
                    x340Var3.r(false);
                    i3 = i2;
                    nim0Var = null;
                } else {
                    x340Var3.i0(-1980088337);
                    qim0 qim0VarQ = i1p1.q(nim0Var2, er31.a);
                    boolean zI = x340Var3.i(jwmVar2);
                    Object objT3 = x340Var3.T();
                    if (zI || objT3 == obj) {
                        objT3 = new m4d(jwmVar2, (byte) 24);
                        x340Var3.s0(objT3);
                    }
                    z2 = false;
                    i3 = i2;
                    nim0 nim0VarX = bin.x(s161.b(qim0VarQ, false, (iu30) objT3), false, strO0, new pm31(0), null, function1, 9);
                    x340Var3.r(false);
                    nim0Var = nim0VarX;
                }
                if (nim0Var == null) {
                    nim0Var = nim0Var2;
                }
                bmq0.a(uri, nim0Var, hcx.e, str9, str7, 0L, 0L, false, x340Var3, 384, 224);
                x340Var2 = x340Var3;
                x340Var2.r(z2);
            }
            uwr uwrVar2 = cbx.a;
            cvx cvxVar4 = cbx.b(x340Var2).b;
            x340 x340Var4 = x340Var2;
            uwo1.e(str, null, kk0.p(nim0Var2, 8.0f, x340Var2, x340Var2).e, cbx.a(x340Var2).b.a, new a0e1(3), null, 0, false, null, 0, null, x340Var4, (i3 >> 3) & 14, 0, 2018);
            x340Var = x340Var4;
            if (!z || function2 == null) {
                x340Var.i0(-1979000640);
                x340Var.r(z2);
            } else {
                x340Var.i0(-1979367742);
                cvx cvxVar5 = cbx.b(x340Var).b;
                String strG = ydh.g(4.0f, 2131961659, x340Var, x340Var, nim0Var2);
                lee1 lee1Var = cbx.d(x340Var).k;
                long j = cbx.a(x340Var).b.a;
                Object objT4 = x340Var.T();
                if (objT4 == obj) {
                    objT4 = nve.c1;
                    x340Var.s0(objT4);
                }
                qim0 qim0VarB = s161.b(nim0Var2, z2, (iu30) objT4);
                boolean z4 = (i3 & 3670016) == 1048576 ? true : z2;
                Object objT5 = x340Var.T();
                if (z4 || objT5 == obj) {
                    objT5 = new ukf(function2, (byte) 6);
                    x340Var.s0(objT5);
                }
                uwo1.e(strG, bin.x(qim0VarB, false, null, null, null, (Function0) objT5, 15), lee1Var, j, null, null, 0, false, null, 0, null, x340Var, 0, 0, 2032);
                x340Var = x340Var;
                x340Var.r(z2);
            }
            x340Var.r(true);
        } else {
            x340Var = x340Var3;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new lv1(z, str, jwmVar, list, function0, function1, function2, i);
        }
    }

    public static final void l(hux huxVar, long j, float f, b0k b0kVar, int i) {
        int i2;
        long j2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-302300171);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? x340Var.g(huxVar) : x340Var.i(huxVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            j2 = j;
            i2 |= x340Var.f(j2) ? 32 : 16;
        } else {
            j2 = j;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.d(f) ? 256 : 128;
        }
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            nim0 nim0Var = nim0.a;
            qim0 qim0VarR = u291.r(nim0Var, f);
            gfh0 gfh0VarC = t1c.c(een.h, false);
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
            w0h1.a(huxVar, isl.a, u291.r(nim0Var, f), j2, 0L, false, x340Var, (i2 & 14) | 56 | ((i2 << 6) & 7168), 48);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new pqu(huxVar, j, f, i);
        }
    }

    public static final void m(float f, int i, long j, b0k b0kVar) {
        long j2;
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1779791128);
        int i3 = (x340Var.f(j) ? 4 : 2) | i | 16;
        if (x340Var.Y(i3 & 1, (i3 & 19) != 18)) {
            x340Var.d0();
            if ((i & 1) == 0 || x340Var.E()) {
                uwr uwrVar = cbx.a;
                cvx cvxVar = cbx.b(x340Var).b;
                i2 = i3 & (-113);
                f = 16.0f;
            } else {
                x340Var.b0();
                i2 = i3 & (-113);
            }
            float f2 = f;
            x340Var.s();
            mbh mbhVarA = jbh.a(h36.e, een.Q0, x340Var, 0);
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
            int i4 = (i2 << 3) & 112;
            j2 = j;
            l(glx.c, j2, f2, x340Var, glx.d | i4);
            uwr uwrVar2 = cbx.a;
            cvx cvxVar2 = cbx.b(x340Var).b;
            op71.g(x340Var, u291.h(nim0Var, 2.0f));
            l(elx.c, j2, f2, x340Var, elx.d | i4);
            x340Var.r(true);
            f = f2;
        } else {
            j2 = j;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new y0v(j2, f, i);
        }
    }

    public static final void n(String str, long j, long j2, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1966357776);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.f(j) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.f(j2) ? 256 : 128;
        }
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            cua cuaVar = cbx.b(x340Var).f;
            qim0 qim0VarO = sto1.o(nim0.a, 8.0f, er31.b(4.0f), false, 0L, 0L, 28);
            cua cuaVar2 = cbx.b(x340Var).f;
            qim0 qim0VarF = dug.f(i1p1.q(qim0VarO, er31.b(4.0f)), j, d4o1.a);
            mta mtaVar = cbx.b(x340Var).d;
            qim0 qim0VarH = u291.h(qim0VarF, 32.0f);
            cvx cvxVar2 = cbx.b(x340Var).b;
            qim0 qim0VarZ = uyn1.z(12.0f, 0.0f, 2, qim0VarH);
            gfh0 gfh0VarC = t1c.c(een.h, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarZ);
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
            uwo1.e(str, null, cbx.d(x340Var).j, j2, null, null, 0, false, null, 0, null, x340Var, (i2 & 14) | ((i2 << 3) & 7168), 0, 2034);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new bfx((byte) 1, i, j, j2, str);
        }
    }

    public static final void o(b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(308133826);
        if (x340Var.Y(i & 1, i != 0)) {
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            cvx cvxVar2 = cbx.b(x340Var).b;
            rqo1.g(0, 0, x340Var, uyn1.y(nim0.a, 16.0f, 8.0f));
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new qza((byte) 17, i, false);
        }
    }

    public static final void p(String str, String str2, c380 c380Var, iu30 iu30Var, h9n h9nVar, Function0 function0, Function0 function1, Function0 function2, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        Function0 function3;
        qim0 qim0Var2;
        char c;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-229551116);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        String str3 = str2;
        int i3 = i2 | (x340Var.g(str3) ? 32 : 16);
        if ((i & 384) == 0) {
            i3 |= x340Var.g(c380Var) ? 256 : 128;
        }
        int i4 = i3 | (x340Var.i(iu30Var) ? 2048 : 1024);
        h9n h9nVar2 = h9nVar;
        if ((i & 24576) == 0) {
            i4 |= x340Var.i(h9nVar2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            function3 = function0;
            i4 |= x340Var.i(function3) ? 131072 : 65536;
        } else {
            function3 = function0;
        }
        if ((1572864 & i) == 0) {
            i4 |= x340Var.i(function1) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i4 |= x340Var.i(function2) ? 8388608 : 4194304;
        }
        if (x340Var.Y(i4 & 1, (38347923 & i4) != 38347922)) {
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0Var);
            hzj.A.getClass();
            qim0 qim0Var3 = null;
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
            Iterator itN = kk0.n(x340Var, qim0VarE, y580.Y, -621892533, c380Var);
            while (itN.hasNext()) {
                f071 f071Var = (j071) itN.next();
                if (f071Var instanceof g071) {
                    x340Var.i0(284065579);
                    g071 g071Var = (g071) f071Var;
                    String str4 = g071Var.a;
                    boolean zG = x340Var.g(f071Var) | ((i4 & 7168) == 2048);
                    Object objT = x340Var.T();
                    if (zG || objT == m4cVar) {
                        c = 4;
                        objT = new fh61(iu30Var, g071Var, (byte) 4);
                        x340Var.s0(objT);
                    } else {
                        c = 4;
                    }
                    qim0Var2 = qim0Var3;
                    ob51.c(str4, (Function0) objT, h9nVar2, (qim0) null, x340Var, (i4 >> 6) & 896);
                    x340Var.r(false);
                } else {
                    qim0Var2 = qim0Var3;
                    if (f071Var instanceof e071) {
                        x340Var.i0(284073605);
                        x340 x340Var2 = x340Var;
                        o1p1.q(((e071) f071Var).a, str, str3, function3, function2, null, x340Var2, ((i4 << 3) & 1008) | ((i4 >> 6) & 7168) | ((i4 >> 9) & 57344));
                        x340Var = x340Var2;
                        x340Var.r(false);
                    } else if (f071Var instanceof f071) {
                        x340Var.i0(284082722);
                        boolean zG2 = ((i4 & 7168) == 2048) | x340Var.g(f071Var);
                        Object objT2 = x340Var.T();
                        if (zG2 || objT2 == m4cVar) {
                            objT2 = new fh61(iu30Var, f071Var, (byte) 5);
                            x340Var.s0(objT2);
                        }
                        xio1.g(0, (Function0) objT2, x340Var, qim0Var2);
                        x340Var.r(false);
                    } else if (f071Var instanceof h071) {
                        x340Var.i0(284085794);
                        boolean zG3 = ((i4 & 7168) == 2048) | x340Var.g(f071Var);
                        Object objT3 = x340Var.T();
                        if (zG3 || objT3 == m4cVar) {
                            objT3 = new fh61(iu30Var, (h071) f071Var, (byte) 6);
                            x340Var.s0(objT3);
                        }
                        byo1.k(0, (Function0) objT3, x340Var, qim0Var2);
                        x340Var.r(false);
                    } else {
                        if (f071Var instanceof c071) {
                            x340Var.i0(284089384);
                            boolean zG4 = ((i4 & 7168) == 2048) | x340Var.g(f071Var);
                            Object objT4 = x340Var.T();
                            if (zG4 || objT4 == m4cVar) {
                                objT4 = new fh61(iu30Var, (c071) f071Var, (byte) 7);
                                x340Var.s0(objT4);
                            }
                            ozn1.a(0, (Function0) objT4, x340Var, qim0Var2);
                            x340Var.r(false);
                        } else if (f071Var instanceof d071) {
                            x340Var.i0(284092675);
                            boolean zG5 = ((i4 & 7168) == 2048) | x340Var.g(f071Var);
                            Object objT5 = x340Var.T();
                            if (zG5 || objT5 == m4cVar) {
                                objT5 = new fh61(iu30Var, (d071) f071Var, (byte) 8);
                                x340Var.s0(objT5);
                            }
                            fho1.c(0, (Function0) objT5, x340Var, qim0Var2);
                            x340Var.r(false);
                        } else {
                            if (!(f071Var instanceof i071)) {
                                throw p3d1.k(x340Var, 284064992, false);
                            }
                            x340Var.i0(284096666);
                            int i5 = i4 >> 12;
                            t4n1.m(((i071) f071Var).a, str2, function1, function2, x340Var, (i4 & 112) | (i5 & 896) | (i5 & 7168));
                            x340Var.r(false);
                        }
                        str3 = str2;
                        h9nVar2 = h9nVar;
                        function3 = function0;
                        qim0Var3 = qim0Var2;
                    }
                }
                str3 = str2;
                h9nVar2 = h9nVar;
                function3 = function0;
                qim0Var3 = qim0Var2;
            }
            x340Var.r(false);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ne00(str, str2, c380Var, iu30Var, h9nVar, function0, function1, function2, qim0Var, i, (byte) 4);
        }
    }

    public static final void q(String str, String str2, boolean z, iu30 iu30Var, qim0 qim0Var, Function0 function0, boolean z2, b0k b0kVar, int i) {
        b0k b0kVar2;
        gbx gbxVar;
        m4c m4cVar = fkj0.X;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(1321873416);
        int i2 = i | (b0kVar3.g(str) ? 4 : 2) | (b0kVar3.g(str2) ? 32 : 16) | (b0kVar3.h(z) ? 256 : 128) | (b0kVar3.i(iu30Var) ? 2048 : 1024) | (b0kVar3.i(qim0Var) ? 16384 : 8192) | (b0kVar3.i(function0) ? 131072 : 65536) | (b0kVar3.h(z2) ? 1048576 : 524288);
        if (b0kVar3.Y(i2 & 1, (599187 & i2) != 599186)) {
            qim0 qim0VarF = u291.f(qim0Var, 1.0f);
            boolean z3 = ((i2 & 896) == 256) | ((3670016 & i2) == 1048576);
            Object objT = b0kVar3.T();
            if (z3 || objT == m4cVar) {
                objT = new klf(z, z2, (byte) 0);
                b0kVar3.s0(objT);
            }
            qim0 qim0VarB = s161.b(qim0VarF, true, (iu30) objT);
            if (function0 != null) {
                b0kVar3.i0(-989951047);
                boolean z4 = (i2 & 458752) == 131072;
                Object objT2 = b0kVar3.T();
                if (z4 || objT2 == m4cVar) {
                    objT2 = new ukf(function0, (byte) 7);
                    b0kVar3.s0(objT2);
                }
                Function0 function1 = (Function0) objT2;
                if (ihc1.y0(str)) {
                    hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                    return;
                } else {
                    gbxVar = new gbx(new y50(str), function1);
                    b0kVar3.r(false);
                }
            } else {
                b0kVar3.i0(-623658219);
                b0kVar3.r(false);
                gbxVar = null;
            }
            b0kVar2 = b0kVar3;
            jto1.b(qim0VarB, null, null, false, null, null, gbxVar, null, null, null, null, apo.r(-461086912, new kaf(str2, (byte) 3), b0kVar3), apo.r(-1501378751, new llf(z, iu30Var, z2), b0kVar3), null, null, apo.r(-327286972, new kaf(str, (byte) 4), b0kVar3), b0kVar2, 0, 197040, 26558);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new vl(str, str2, z, iu30Var, qim0Var, function0, z2, i);
        }
    }

    public static final Next t(r070 r070Var, Set set) {
        if (r070Var.b && !r070Var.c) {
            r070 r070VarA = r070.a(r070Var, 0, 11);
            set.add(new lz60(r070Var.a.a.a, r070Var.d < 50 ? co0.VIEWABILITY_50_LESS : co0.VIEWABILITY_50));
            r070Var = r070VarA;
        }
        return Next.i(r070Var, set);
    }

    public static final void u(int i) {
        if (i >= 1) {
            return;
        }
        hhg1.f(f4i1.c(i, "Expected positive parallelism level, but got "));
    }

    public static final int v(int i, int i2) {
        return i2 == 0 ? i : v(i2, i % i2);
    }

    public static nc w(MarketingMessagesOption marketingMessagesOption, String str) {
        if (u890.j(str, "CA")) {
            return new ic(false, false);
        }
        if (u890.j(str, "KR")) {
            return new mc(false, false);
        }
        int i = vb.c[marketingMessagesOption.ordinal()];
        if (i == 1) {
            return new kc(false, false);
        }
        if (i == 2) {
            return new lc(false, false);
        }
        if (i == 3) {
            return jc.a;
        }
        eg.o();
        return null;
    }

    public static final void x(Emitter emitter, Notification notification) {
        Object obj = notification.a;
        if (notification.e()) {
            Object objD = notification.d();
            objD.getClass();
            emitter.onNext(objD);
        } else if (NotificationLite.h(obj)) {
            Throwable thC = notification.c();
            thC.getClass();
            emitter.onError(thC);
        } else if (obj == null) {
            emitter.onComplete();
        } else {
            hhg1.g(notification, "invalid notification: ");
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0054  */
    /* JADX WARN: Code duplicated, block: B:21:0x0067  */
    /* JADX WARN: Code duplicated, block: B:24:0x0074  */
    /* JADX WARN: Code duplicated, block: B:26:0x0078  */
    /* JADX WARN: Code duplicated, block: B:29:0x008b  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x008b -> B:30:0x008d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object y(int r11, p.dj01 r12, p.onm r13) {
        /*
            boolean r0 = r13 instanceof p.oj01
            if (r0 == 0) goto L13
            r0 = r13
            p.oj01 r0 = (p.oj01) r0
            int r1 = r0.g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.g = r1
            goto L18
        L13:
            p.oj01 r0 = new p.oj01
            r0.<init>(r13)
        L18:
            java.lang.Object r13 = r0.f
            int r1 = r0.g
            r2 = 0
            r3 = 2
            r4 = 0
            r5 = 1
            p.d9n r6 = p.d9n.a
            if (r1 == 0) goto L4d
            if (r1 == r5) goto L3a
            if (r1 != r3) goto L34
            int r11 = r0.b
            byte r12 = r0.a
            p.iu30 r1 = r0.e
            p.hm5.M(r13)
            r13 = r1
            goto L8d
        L34:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r11)
            return r4
        L3a:
            int r11 = r0.d
            int r12 = r0.c
            int r1 = r0.b
            byte r7 = r0.a
            p.iu30 r8 = r0.e
            p.hm5.M(r13)
            r10 = r12
            r12 = r11
            r11 = r1
            r1 = r13
            r13 = r10
            goto L6c
        L4d:
            p.hm5.M(r13)
            r13 = r12
            r12 = r2
        L52:
            if (r12 >= r11) goto L92
            r0.e = r13
            r0.a = r11
            r0.b = r12
            r0.c = r12
            r0.d = r2
            r0.g = r5
            java.lang.Object r1 = r13.invoke(r0)
            if (r1 != r6) goto L67
            goto L8a
        L67:
            r7 = r11
            r11 = r12
            r8 = r13
            r13 = r11
            r12 = r2
        L6c:
            p.e331 r1 = (p.e331) r1
            java.lang.Object r1 = r1.a
            boolean r9 = r1 instanceof p.m231
            if (r9 != 0) goto L78
            p.hm5.M(r1)
            return r1
        L78:
            r0.e = r8
            r0.a = r7
            r0.b = r11
            r0.c = r13
            r0.d = r12
            r0.g = r3
            java.lang.Object r12 = p.xpn1.H(r0)
            if (r12 != r6) goto L8b
        L8a:
            return r6
        L8b:
            r12 = r7
            r13 = r8
        L8d:
            int r11 = r11 + r5
            r10 = r12
            r12 = r11
            r11 = r10
            goto L52
        L92:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p.buo1.y(int, p.dj01, p.onm):java.lang.Object");
    }

    public abstract int r(int i, int i2, flb0 flb0Var, q5t0 q5t0Var, int i3);

    public Integer s(q5t0 q5t0Var) {
        return null;
    }
}
