package p;

import android.content.Context;
import android.view.accessibility.AccessibilityManager;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import com.spotify.mobius.Effects;
import com.spotify.playlist.ai.creation.v2.Playlist;
import com.spotify.playlist.ai.creation.v2.Status;
import java.net.URI;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public abstract class h7w {
    public static final Object a = new Object();
    public static b180 b;
    public static b180 c;

    public static final String A(a6q0 a6q0Var, Context context) {
        if (a6q0Var instanceof y5q0) {
            return ((y5q0) a6q0Var).a.c;
        }
        if (a6q0Var instanceof w5q0) {
            return ((w5q0) a6q0Var).b;
        }
        if (a6q0Var instanceof x5q0) {
            return context.getString(((x5q0) a6q0Var).b);
        }
        if (a6q0Var instanceof v5q0) {
            return context.getString(((v5q0) a6q0Var).b);
        }
        if (a6q0Var instanceof z5q0) {
            return context.getString(((z5q0) a6q0Var).b);
        }
        eg.o();
        return null;
    }

    public static ljm0 B(iu30 iu30Var, o8n o8nVar, iu30 iu30Var2, zu30 zu30Var, int i) {
        if ((i & 2) != 0) {
            o8nVar = (o8n) v55.Z.getValue();
        }
        if ((i & 4) != 0) {
            iu30Var2 = k8b0.P0;
        }
        xas xasVar = new xas();
        iu30Var2.invoke(xasVar);
        return new ljm0(xasVar, iu30Var, o8nVar, new j2i(1573489251, new sw1(zu30Var, (byte) 25), true));
    }

    public static ljm0 C(iu30 iu30Var, zu30 zu30Var) {
        return new ljm0(new xas(), iu30Var, (o8n) v55.Z.getValue(), new j2i(1573489251, new sw1(zu30Var, (byte) 25), true));
    }

    public static ljm0 D(iu30 iu30Var, bs50 bs50Var, iu30 iu30Var2, j2i j2iVar, int i) {
        if ((i & 2) != 0) {
            bs50Var = (o8n) v55.Z.getValue();
        }
        if ((i & 4) != 0) {
            iu30Var2 = ook0.b1;
        }
        xas xasVar = new xas();
        iu30Var2.invoke(xasVar);
        return new ljm0(xasVar, iu30Var, bs50Var, j2iVar);
    }

    public static String E(String str) {
        Boolean m231Var;
        String host;
        if (str == null) {
            return null;
        }
        try {
            URI uri = new URI(str);
            Set setS0 = f46.S0(new String[]{"http", "https"});
            String scheme = uri.getScheme();
            m231Var = Boolean.valueOf((!o7h.i0(setS0, scheme != null ? scheme.toLowerCase(Locale.ROOT) : null) || (host = uri.getHost()) == null || host.length() == 0) ? false : true);
        } catch (Throwable th) {
            m231Var = new m231(th);
        }
        Boolean bool = Boolean.FALSE;
        if (m231Var instanceof m231) {
            m231Var = bool;
        }
        if (m231Var.booleanValue()) {
            return str;
        }
        return null;
    }

    public static final void a(yj41 yj41Var, float f, tcf1 tcf1Var, b0k b0kVar, int i) {
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(474581301);
        int i2 = i | (x340Var.i(yj41Var) ? 32 : 16) | (x340Var.d(f) ? 256 : 128) | (x340Var.d(48.0f) ? 2048 : 1024) | (x340Var.g(tcf1Var) ? 16384 : 8192);
        if (x340Var.Y(i2 & 1, (i2 & 9363) != 9362)) {
            boolean z = (i2 & 112) == 32 || x340Var.g(yj41Var);
            Object objT = x340Var.T();
            if (z || objT == m4cVar) {
                objT = new yk4(yj41Var.a);
                x340Var.s0(objT);
            }
            yk4 yk4Var = (yk4) objT;
            if (!(((double) 1.0f) > 0.0d)) {
                of80.a("invalid weight; must be greater than zero");
            }
            wnb0 wnb0Var = new wnb0(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, false);
            boolean z2 = (i2 & 57344) == 16384;
            Object objT2 = x340Var.T();
            if (z2 || objT2 == m4cVar) {
                objT2 = new mcf1(tcf1Var, (byte) 0);
                x340Var.s0(objT2);
            }
            w2g0.c(i541.C(wnb0Var, (iu30) objT2), een.h, apo.r(1085369119, new ye6(f, yk4Var, (byte) 13), x340Var), x340Var, 3120, 4);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new gf((Object) yj41Var, f, (Object) tcf1Var, i, (byte) 14);
        }
    }

    public static final void b(lfa1 lfa1Var, qim0 qim0Var, boolean z, boolean z2, tcf1 tcf1Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1059145674);
        int i2 = i | (x340Var.g(lfa1Var) ? 4 : 2) | (x340Var.g(qim0Var) ? 32 : 16) | (x340Var.h(z) ? 256 : 128) | (x340Var.h(z2) ? 2048 : 1024) | (x340Var.g(tcf1Var) ? 16384 : 8192);
        if (x340Var.Y(i2 & 1, (i2 & 9363) != 9362)) {
            w2g0.c(qim0Var, (tl3) null, apo.r(-1125378636, new gb7(z2, z, lfa1Var, tcf1Var, (byte) 5), x340Var), x340Var, ((i2 >> 3) & 14) | 3072, 6);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new hy(lfa1Var, qim0Var, z, z2, tcf1Var, i);
        }
    }

    public static final void c(pqk pqkVar, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        iu30 iu30Var2;
        long j;
        String strO0;
        float f;
        boolean z;
        long j2;
        boolean z2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1788830453);
        j06 j06Var = x340Var.a;
        if ((i & 6) == 0) {
            i2 = (x340Var.i(pqkVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(qim0Var) ? 256 : 128;
        }
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            Object objT = x340Var.T();
            Object obj = fkj0.X;
            if (objT == obj) {
                objT = new wqk();
                x340Var.s0(objT);
            }
            wqk wqkVar = (wqk) objT;
            u7h u7hVar = pqkVar.n;
            boolean z3 = pqkVar.h;
            boolean z4 = pqkVar.j;
            if (u7hVar == null) {
                x340Var.i0(1079155833);
                uwr uwrVar = cbx.a;
                j = cbx.a(x340Var).b.a;
                x340Var.r(false);
            } else {
                x340Var.i0(1079154531);
                x340Var.r(false);
                j = u7hVar.a;
            }
            long j3 = j;
            float fO = yoi1.o(((wat) x340Var.k(t4k.h)).U0(), 1.0f, 1.5f) * 40.0f;
            uwr uwrVar2 = cbx.a;
            lee1 lee1Var = cbx.d(x340Var).j;
            ye5 ye5Var = new ye5();
            int iO = ye5Var.o(lee1Var.a);
            try {
                ye5Var.g(pqkVar.e);
                ye5Var.k(iO);
                af5 af5VarP = ye5Var.p();
                if (z4) {
                    x340Var.i0(-905440683);
                    strO0 = cwl1.o0(x340Var, z3 ? 2131955777 : 2131955776);
                    x340Var.r(false);
                } else {
                    x340Var.i0(-905288101);
                    x340Var.r(false);
                    strO0 = null;
                }
                qim0 qim0VarF = u291.f(qim0Var, 1.0f);
                if (pqkVar.l) {
                    x340Var.i0(1079181049);
                    cvx cvxVar = cbx.b(x340Var).b;
                    x340Var.r(false);
                    f = 16.0f;
                } else {
                    x340Var.i0(1079181431);
                    x340Var.r(false);
                    f = 0.0f;
                }
                qim0 qim0VarF2 = dug.f(i1p1.q(u291.j(72.0f, 0.0f, 2, uyn1.z(f, 0.0f, 2, qim0VarF)), wqkVar), pqkVar.o, d4o1.a);
                avw0 avw0Var = cbx.b(x340Var).c;
                qim0 qim0VarE = d1u.E(2.0f, u7h.b(j3, 0.5f, 0.0f, 0.0f, 0.0f, 14), qim0VarF2, wqkVar);
                Object objT2 = x340Var.T();
                if (objT2 == obj) {
                    objT2 = ktd.n(x340Var);
                }
                idn0 idn0Var = (idn0) objT2;
                jtr jtrVar = jtr.f;
                String strO1 = cwl1.o0(x340Var, 2131959399);
                pm31 pm31Var = new pm31(0);
                int i3 = i2 & 112;
                boolean z5 = i3 == 32;
                Object objT3 = x340Var.T();
                if (z5 || objT3 == obj) {
                    objT3 = new lck(iu30Var, (byte) 11);
                    x340Var.s0(objT3);
                }
                qim0 qim0VarV = bin.v(qim0VarE, idn0Var, jtrVar, false, strO1, pm31Var, (Function0) objT3, 4);
                boolean zG = x340Var.g(strO0) | (i3 == 32);
                Object objT4 = x340Var.T();
                if (zG || objT4 == obj) {
                    z = true;
                    objT4 = new mr3(strO0, iu30Var, (byte) 1);
                    x340Var.s0(objT4);
                } else {
                    z = true;
                }
                qim0 qim0VarB = s161.b(qim0VarV, z, (iu30) objT4);
                cvx cvxVar2 = cbx.b(x340Var).b;
                qim0 qim0VarZ = uyn1.z(16.0f, 0.0f, 2, qim0VarB);
                fra fraVar = een.N0;
                cvx cvxVar3 = cbx.b(x340Var).b;
                jw31 jw31VarA = ew31.a(new d36(12.0f, true, new um5(false)), fraVar, x340Var, 0);
                int iHashCode = Long.hashCode(x340Var.T);
                xos0 xos0VarM = x340Var.m();
                qim0 qim0VarE2 = zr7.E(x340Var, qim0VarZ);
                hzj.A.getClass();
                if (j06Var == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var.m0();
                boolean z6 = x340Var.S;
                n4k n4kVar = hmb0.t1;
                if (z6) {
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
                nim0 nim0Var = nim0.a;
                ton1.b(pqkVar.f, pqkVar.g, j3, u291.r(nim0Var, fO), 0L, 0.0f, x340Var, 0);
                qim0 qim0VarR = i1p1.r(new wnb0(1.0f, true));
                mbh mbhVarA = jbh.a(h36.e, een.P0, x340Var, 0);
                int iHashCode2 = Long.hashCode(x340Var.T);
                xos0 xos0VarM2 = x340Var.m();
                qim0 qim0VarE3 = zr7.E(x340Var, qim0VarR);
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
                af5 af5Var = pqkVar.b;
                if (af5Var == null) {
                    x340Var.i0(518976668);
                    x340Var.r(false);
                    z2 = false;
                } else {
                    x340Var.i0(518976669);
                    qim0 qim0VarF3 = u291.f(nim0Var, 1.0f);
                    lee1 lee1Var2 = cbx.d(x340Var).k;
                    zma1 zma1Var = gf5.a;
                    ef5 ef5Var = new ef5(lee1Var2, (byte) 0);
                    ye5 ye5Var2 = new ye5(af5Var);
                    ye5Var2.i(ef5Var);
                    af5 af5VarP2 = ye5Var2.p();
                    cjc0 cjc0Var = new cjc0(2);
                    lee1 lee1Var3 = cbx.d(x340Var).j;
                    u7h u7hVar2 = pqkVar.c;
                    if (u7hVar2 == null) {
                        x340Var.i0(338404827);
                        j2 = cbx.a(x340Var).b.a;
                        x340Var.r(false);
                    } else {
                        x340Var.i0(338403463);
                        x340Var.r(false);
                        j2 = u7hVar2.a;
                    }
                    z2 = false;
                    uwo1.d(af5VarP2, j2, qim0VarF3, lee1Var3, (a0e1) null, (iu30) null, 2, false, cjc0Var, 0, (qx8) null, (cqs0) null, x340Var, 0, 0, 3760);
                    x340Var = x340Var;
                    x340Var.r(false);
                }
                x340 x340Var2 = x340Var;
                uwo1.e(pqkVar.d, u291.f(nim0Var, 1.0f), cbx.d(x340Var).h, cbx.a(x340Var).b.a, (a0e1) null, (iu30) null, 2, false, new cjc0(1), 0, (qx8) null, x340Var2, 0, 0, 1712);
                uwo1.d(af5VarP, j3, u291.f(nim0Var, 1.0f), lee1Var, (a0e1) null, (iu30) null, 2, false, new cjc0(2), 0, (qx8) null, (cqs0) null, x340Var2, 0, 0, 3760);
                x340Var = x340Var2;
                x340Var.r(true);
                if (pqkVar.k) {
                    x340Var.i0(-1168932960);
                    jkx jkxVar = jkx.c;
                    zov0 zov0Var = cbx.b(x340Var).g;
                    w0h1.a(jkxVar, isl.a, anm1.N("navigation_arrow", u291.r(nim0Var, 16.0f)), cbx.a(x340Var).b.a, 0L, false, x340Var, jkx.d | 48, 48);
                    x340Var.r(z2);
                    iu30Var2 = iu30Var;
                } else if (z4) {
                    x340Var.i0(-1168619147);
                    pk1 pk1Var = new pk1(z3 ? qk1.b : qk1.a, false, (String) null, (String) null, (j7p1) null, 30);
                    qim0 qim0VarN = anm1.N("save_button", nim0Var);
                    Object objT5 = x340Var.T();
                    if (objT5 == obj) {
                        objT5 = rgk.X0;
                        x340Var.s0(objT5);
                    }
                    qim0 qim0VarA = s161.a(qim0VarN, (iu30) objT5);
                    boolean z7 = i3 == 32 ? true : z2;
                    Object objT6 = x340Var.T();
                    if (z7 || objT6 == obj) {
                        iu30Var2 = iu30Var;
                        objT6 = new lck(iu30Var2, (byte) 13);
                        x340Var.s0(objT6);
                    } else {
                        iu30Var2 = iu30Var;
                    }
                    h7p1.a(pk1Var, new gbx(z50.c, (Function0) objT6), qim0VarA, (max) null, (gdx) null, x340Var, 0, 24);
                    x340Var.r(z2);
                } else {
                    iu30Var2 = iu30Var;
                    x340Var.i0(-1168117071);
                    x340Var.r(z2);
                }
                x340Var.r(true);
            } catch (Throwable th) {
                ye5Var.k(iO);
                throw th;
            }
        } else {
            iu30Var2 = iu30Var;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new jqk(pqkVar, iu30Var2, qim0Var, i, (byte) 0);
        }
    }

    public static final h4k d(wch1 wch1Var, v3k v3kVar) {
        return new h4k(v3kVar, wch1Var);
    }

    public static final void e(pqk pqkVar, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i, int i2) {
        int i3;
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(591037381);
        if ((i & 6) == 0) {
            i3 = (x340Var.i(pqkVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= x340Var.i(qim0Var) ? 256 : 128;
        }
        if (x340Var.Y(i3 & 1, (i3 & 147) != 146)) {
            qim0 qim0Var3 = i4 != 0 ? nim0.a : qim0Var;
            if (pqkVar.m) {
                x340Var.i0(-1771112800);
                c(pqkVar, iu30Var, qim0Var3, x340Var, i3 & 1022);
                x340Var.r(false);
            } else {
                x340Var.i0(-1771014623);
                g(pqkVar, iu30Var, qim0Var3, x340Var, i3 & 1022);
                x340Var.r(false);
            }
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new qx1((byte) 6, i, i2, pqkVar, iu30Var, qim0Var2);
        }
    }

    public static final void f(boolean z, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1367334409);
        int i2 = i | 6;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            qim0 qim0VarZ = uyn1.z(16.0f, 0.0f, 2, u291.f(nim0.a, 1.0f));
            uwr uwrVar = cbx.a;
            long jA = cbx.a(x340Var).a.b.a();
            cua cuaVar = cbx.b(x340Var).f;
            qim0 qim0VarL0 = cwl1.l0(dug.f(qim0VarZ, jA, er31.b(4.0f)), 0L, (hw61) null, 15);
            jw31 jw31VarA = ew31.a(h36.a, een.Z, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarL0);
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
            x340Var.r(true);
            z = true;
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new dr0((byte) 13, i, z);
        }
    }

    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7, types: [boolean, byte] */
    /* JADX WARN: Type inference failed for: r9v9 */
    public static final void g(pqk pqkVar, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        b0k b0kVar2;
        String strO0;
        ?? r9;
        xu30 xu30Var;
        j2i j2iVar;
        j2i j2iVarR;
        boolean z = pqkVar.j;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-1318070646);
        if ((i & 6) == 0) {
            i2 = (b0kVar3.i(pqkVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= b0kVar3.i(iu30Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= b0kVar3.i(qim0Var) ? 256 : 128;
        }
        if (b0kVar3.Y(i2 & 1, (i2 & 147) != 146)) {
            if (z) {
                b0kVar3.i0(-2051384896);
                strO0 = cwl1.o0(b0kVar3, pqkVar.h ? 2131955777 : 2131955776);
                b0kVar3.r(false);
            } else {
                b0kVar3.i0(-2051232314);
                b0kVar3.r(false);
                strO0 = null;
            }
            qim0 qim0VarZ = uyn1.z(pqkVar.l ? 16.0f : 0.0f, 0.0f, 2, u291.f(qim0Var, 1.0f));
            Object objT = b0kVar3.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = ktd.n(b0kVar3);
            }
            idn0 idn0Var = (idn0) objT;
            jtr jtrVar = jtr.f;
            String strO1 = cwl1.o0(b0kVar3, 2131959399);
            pm31 pm31Var = new pm31(0);
            int i3 = i2 & 112;
            boolean z2 = i3 == 32;
            Object objT2 = b0kVar3.T();
            if (z2 || objT2 == m4cVar) {
                objT2 = new lck(iu30Var, (byte) 14);
                b0kVar3.s0(objT2);
            }
            qim0 qim0VarV = bin.v(qim0VarZ, idn0Var, jtrVar, false, strO1, pm31Var, (Function0) objT2, 4);
            boolean zG = (i3 == 32) | b0kVar3.g(strO0);
            Object objT3 = b0kVar3.T();
            if (zG || objT3 == m4cVar) {
                objT3 = new mr3(strO0, iu30Var, (byte) 2);
                b0kVar3.s0(objT3);
            }
            qim0 qim0VarB = s161.b(qim0VarV, true, (iu30) objT3);
            zzq0 zzq0Var = new zzq0(0.0f, 0.0f, 0.0f, 0.0f);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(b0kVar3).b;
            uvx uvxVar = new uvx(1, null, 2, zzq0Var, null, new tvx(0.0f, 12.0f, 0.0f), null, 2, new p3v(48.0f), 82);
            af5 af5Var = pqkVar.b;
            if (af5Var == null) {
                b0kVar3.i0(-2049031687);
                r9 = 0;
                b0kVar3.r(false);
                xu30Var = null;
            } else {
                r9 = 0;
                b0kVar3.i0(-2049031686);
                xu30 xu30VarR = apo.r(1664713305, new e6j(af5Var, pqkVar, (byte) 5), b0kVar3);
                b0kVar3.r(false);
                xu30Var = xu30VarR;
            }
            if (pqkVar.k) {
                b0kVar3.i0(-2048138638);
                b0kVar3.r((boolean) r9);
                j2iVarR = oei.a;
            } else {
                if (z) {
                    b0kVar3.i0(-2047778480);
                    j2iVarR = apo.r(-1488117295, new e6j(pqkVar, iu30Var, (byte) 6), b0kVar3);
                    b0kVar3.r((boolean) r9);
                } else {
                    b0kVar3.i0(-2047169517);
                    b0kVar3.r((boolean) r9);
                    j2iVar = null;
                }
                b0kVar2 = b0kVar3;
                jto1.b(qim0VarB, uvxVar, (max) null, false, (idn0) null, (ga80) null, (gbx) null, (gbx) null, (xu30) null, apo.r(-1454719885, new kqk(pqkVar, r9), b0kVar3), xu30Var, apo.r(-1347036078, new kqk(pqkVar, (byte) 1), b0kVar3), j2iVar, (xu30) null, (xu30) null, apo.r(-501285426, new kqk(pqkVar, (byte) 2), b0kVar3), b0kVar2, 805306432, 196656, 25084);
            }
            j2iVar = j2iVarR;
            b0kVar2 = b0kVar3;
            jto1.b(qim0VarB, uvxVar, (max) null, false, (idn0) null, (ga80) null, (gbx) null, (gbx) null, (xu30) null, apo.r(-1454719885, new kqk(pqkVar, r9), b0kVar3), xu30Var, apo.r(-1347036078, new kqk(pqkVar, (byte) 1), b0kVar3), j2iVar, (xu30) null, (xu30) null, apo.r(-501285426, new kqk(pqkVar, (byte) 2), b0kVar3), b0kVar2, 805306432, 196656, 25084);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new jqk(pqkVar, iu30Var, qim0Var, i, (byte) 1);
        }
    }

    public static final void h(int i, String str, Function0 function0, j2i j2iVar, b0k b0kVar, int i2) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-80718644);
        int i3 = i2 | (x340Var.h(true) ? 4 : 2) | (x340Var.e(l1d.C(i)) ? 32 : 16) | (x340Var.g(str) ? 256 : 128) | (x340Var.i(function0) ? 2048 : 1024);
        if (x340Var.Y(i3 & 1, (i3 & 9363) != 9362)) {
            int iC = l1d.C(i);
            qim0 qim0VarR = nim0.a;
            if (iC != 0) {
                if (iC != 1) {
                    eg.o();
                    return;
                }
                qim0VarR = u291.r(qim0VarR, 32.0f);
            }
            x340Var.i0(492935133);
            boolean z = (i3 & 7168) == 2048;
            Object objT = x340Var.T();
            if (z || objT == fkj0.X) {
                objT = new z9t(function0, (byte) 11);
                x340Var.s0(objT);
            }
            wro1.h(new gbx(new y50(str), (Function0) objT), ldx.c, qim0VarR, (max) null, yla.s(x340Var), new zzq0(0.0f, 0.0f, 0.0f, 0.0f), false, (idn0) null, (ga80) null, apo.r(-493431782, new pu2(j2iVar, (byte) 22), x340Var), x340Var, 0, 6, 920);
            x340Var.r(false);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new x8t(i, str, function0, j2iVar, i2);
        }
    }

    public static final void i(Function0 function0, b0k b0kVar, int i) {
        b0k b0kVar2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(1781901899);
        int i2 = (b0kVar3.i(function0) ? 4 : 2) | i;
        if (b0kVar3.Y(i2 & 1, (i2 & 3) != 2)) {
            lex lexVarZ = yoo1.z(b0kVar3);
            oex oexVar = vqb.a;
            String strO0 = cwl1.o0(b0kVar3, 2131952988);
            boolean z = (i2 & 14) == 4;
            Object objT = b0kVar3.T();
            if (z || objT == fkj0.X) {
                objT = new pj8(function0, (byte) 10);
                b0kVar3.s0(objT);
            }
            b0kVar2 = b0kVar3;
            poo1.e(new gbx(z50.c, (Function0) objT), oexVar, lexVarZ, (qim0) null, 0, strO0, (max) null, s9i.a, (vu30) null, (idn0) null, (ga80) null, false, (vzq0) null, (vu30) null, b0kVar2, 12582912, 0, 16216);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new wm(function0, i, (byte) 14);
        }
    }

    public static final void j(String str, rq31 rq31Var, sq31 sq31Var, boolean z, iu30 iu30Var, yqg yqgVar, hlq hlqVar, ilq ilqVar, b0k b0kVar, int i) {
        int i2;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(646874751);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(rq31Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(sq31Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.h(z) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= x340Var.i(iu30Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= x340Var.g(yqgVar) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= (2097152 & i) == 0 ? x340Var.g(hlqVar) : x340Var.i(hlqVar) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= (16777216 & i) == 0 ? x340Var.g(ilqVar) : x340Var.i(ilqVar) ? 8388608 : 4194304;
        }
        int i3 = i2;
        if (x340Var.Y(i3 & 1, (i3 & 4793491) != 4793490)) {
            nim0 nim0Var = nim0.a;
            qim0 qim0VarD = u291.d(nim0Var, 1.0f);
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarD);
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
            int iR = b2u.r(rq31Var);
            int size = rq31Var.a.g.size();
            Long l = sq31Var.b;
            k1z0 k1z0Var = sq31Var.a;
            int i4 = i3 << 6;
            m(iR, size, str, l, sq31Var.c, k1z0Var.e, sq31Var.d, z, hlqVar, x340Var, (i4 & 234881024) | (i4 & 896) | ((i3 << 12) & 29360128));
            x340Var = x340Var;
            k1z0 k1z0Var2 = sq31Var.a;
            boolean z2 = sq31Var.d;
            Long l2 = sq31Var.b;
            Long l3 = sq31Var.c;
            int i5 = i3 & 458752;
            int i6 = i3 & 57344;
            boolean zI = (i5 == 131072) | x340Var.i(sq31Var) | (i6 == 16384);
            Object objT = x340Var.T();
            if (zI || objT == m4cVar) {
                objT = new v721(yqgVar, sq31Var, iu30Var, (byte) 17);
                x340Var.s0(objT);
            }
            iu30 iu30Var2 = (iu30) objT;
            boolean z3 = i6 == 16384;
            Object objT2 = x340Var.T();
            if (z3 || objT2 == m4cVar) {
                objT2 = new wg31(iu30Var, (byte) 3);
                x340Var.s0(objT2);
            }
            Function0 function0 = (Function0) objT2;
            boolean zI2 = (i5 == 131072) | (i6 == 16384) | x340Var.i(sq31Var);
            Object objT3 = x340Var.T();
            if (zI2 || objT3 == m4cVar) {
                objT3 = new d4v0(iu30Var, sq31Var, yqgVar, (byte) 24);
                x340Var.s0(objT3);
            }
            p1z0 p1z0Var = new p1z0(k1z0Var2, z2, l2, l3, z, iu30Var2, function0, (Function0) objT3);
            boolean zG = x340Var.g(k1z0Var.a);
            Object objT4 = x340Var.T();
            if (zG || objT4 == m4cVar) {
                ojq ojqVar = (ojq) ilqVar.a.c;
                v1z0 v1z0Var = new v1z0((jlq) ojqVar.P0.get(), (klq) ojqVar.Q0.get(), (llq) ojqVar.S0.get(), (nlq) ojqVar.T0.get(), (olq) ojqVar.W0.get(), (zja1) ojqVar.f.get());
                x340Var.s0(v1z0Var);
                objT4 = v1z0Var;
            }
            otw.c((v1z0) objT4, p1z0Var, u291.d(nim0Var, 1.0f), (ipb1) null, x340Var, 0, 8);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new brf(str, rq31Var, sq31Var, z, iu30Var, yqgVar, hlqVar, ilqVar, i);
        }
    }

    public static final void k(String str, String str2, boolean z, boolean z2, rq31 rq31Var, tq31 tq31Var, iu30 iu30Var, yqg yqgVar, hlq hlqVar, slq slqVar, b0k b0kVar, int i) {
        String str3;
        int i2;
        rq31 rq31Var2 = rq31Var;
        List list = rq31Var2.b;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1639144896);
        if ((i & 6) == 0) {
            str3 = str;
            i2 = (x340Var.g(str3) ? 4 : 2) | i;
        } else {
            str3 = str;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.g(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.h(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.h(z2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= x340Var.i(rq31Var2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= x340Var.i(tq31Var) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= x340Var.i(iu30Var) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= x340Var.g(yqgVar) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i2 |= (134217728 & i) == 0 ? x340Var.g(hlqVar) : x340Var.i(hlqVar) ? 67108864 : 33554432;
        }
        if ((805306368 & i) == 0) {
            i2 |= (1073741824 & i) == 0 ? x340Var.g(slqVar) : x340Var.i(slqVar) ? 536870912 : 268435456;
        }
        int i3 = i2;
        if (x340Var.Y(i3 & 1, (i3 & 306783379) != 306783378)) {
            qim0 qim0VarD = u291.d(nim0.a, 1.0f);
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarD);
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
            rq31Var2 = rq31Var;
            vp31 vp31Var = rq31Var2.a;
            m(list.size() - 1, vp31Var.g.size(), str2, null, null, 0L, false, z2, hlqVar, x340Var, ((i3 << 3) & 896) | 1797120 | ((i3 << 12) & 29360128) | (i3 & 234881024));
            x340Var = x340Var;
            Object objT = x340Var.T();
            Object obj = fkj0.X;
            if (objT == obj) {
                ojq ojqVar = (ojq) slqVar.a.c;
                tlq tlqVar = (tlq) ojqVar.a1.get();
                vlq vlqVar = (vlq) ojqVar.e1.get();
                lzn0 lzn0VarB = ((jiz0) ojqVar.b).b();
                c8o.l(lzn0VarB);
                objT = new h2z0(tlqVar, vlqVar, lzn0VarB, ((Boolean) ojqVar.f1.get()).booleanValue());
                x340Var.s0(objT);
            }
            h2z0 h2z0Var = (h2z0) objT;
            k1z0 k1z0Var = tq31Var.a;
            boolean z3 = ((om21) o7h.A0(list)).b == 2;
            boolean z4 = b2u.r(rq31Var2) == vp31Var.g.size() + (-1) && rq31Var2.d;
            int i4 = i3 & 3670016;
            boolean z5 = ((i3 & 29360128) == 8388608) | (i4 == 1048576);
            Object objT2 = x340Var.T();
            if (z5 || objT2 == obj) {
                objT2 = new sn8(iu30Var, yqgVar, (byte) 7);
                x340Var.s0(objT2);
            }
            Function0 function0 = (Function0) objT2;
            boolean z6 = i4 == 1048576;
            Object objT3 = x340Var.T();
            if (z6 || objT3 == obj) {
                objT3 = new wg31(iu30Var, (byte) 4);
                x340Var.s0(objT3);
            }
            otw.c(h2z0Var, new e2z0(str3, k1z0Var, z3, z4, z, function0, (Function0) objT3), (qim0) null, (ipb1) null, x340Var, 0, 12);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new t3d(str, str2, z, z2, rq31Var2, tq31Var, iu30Var, yqgVar, hlqVar, slqVar, i);
        }
    }

    public static final void l(lfa1 lfa1Var, tcf1 tcf1Var, b0k b0kVar, int i) {
        boolean z;
        int i2;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1339146956);
        j06 j06Var = x340Var.a;
        int i3 = i | (x340Var.g(lfa1Var) ? 4 : 2) | (x340Var.g(tcf1Var) ? 32 : 16);
        if (x340Var.Y(i3 & 1, (i3 & 19) != 18)) {
            era eraVar = een.Q0;
            nim0 nim0Var = nim0.a;
            qim0 qim0VarF = u291.f(nim0Var, 1.0f);
            mbh mbhVarA = jbh.a(h36.c, eraVar, x340Var, 48);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarF);
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
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            d36 d36Var = new d36(8.0f, true, new um5(false));
            qim0 qim0VarF2 = u291.f(nim0Var, 1.0f);
            mbh mbhVarA2 = jbh.a(d36Var, eraVar, x340Var, 48);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0VarF2);
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
            vnr0 vnr0Var = (vnr0) lfa1Var.a.invoke(x340Var, 0);
            qim0 qim0VarF3 = u291.f(nim0Var, 1.0f);
            int i4 = i3 & 112;
            boolean z3 = i4 == 32;
            Object objT = x340Var.T();
            if (z3 || objT == m4cVar) {
                z = true;
                objT = new mcf1(tcf1Var, (byte) 1);
                x340Var.s0(objT);
            } else {
                z = true;
            }
            qgo1.f(vnr0Var, i541.C(qim0VarF3, (iu30) objT), new a0e1(3), 0, false, (iu30) null, x340Var, 8, 56);
            vnr0 vnr0Var2 = (vnr0) lfa1Var.b.invoke(x340Var, 0);
            qim0 qim0VarF4 = u291.f(nim0Var, 1.0f);
            boolean z4 = i4 == 32;
            Object objT2 = x340Var.T();
            if (z4 || objT2 == m4cVar) {
                objT2 = new mcf1(tcf1Var, (byte) 2);
                x340Var.s0(objT2);
            }
            qgo1.f(vnr0Var2, i541.C(qim0VarF4, (iu30) objT2), new a0e1(3), 0, false, (iu30) null, x340Var, 8, 56);
            vnr0 vnr0Var3 = (vnr0) lfa1Var.c.invoke(x340Var, 0);
            qim0 qim0VarF5 = u291.f(nim0Var, 1.0f);
            boolean z5 = i4 == 32;
            Object objT3 = x340Var.T();
            if (z5 || objT3 == m4cVar) {
                i2 = 3;
                objT3 = new mcf1(tcf1Var, (byte) 3);
                x340Var.s0(objT3);
            } else {
                i2 = 3;
            }
            qgo1.f(vnr0Var3, i541.C(qim0VarF5, (iu30) objT3), new a0e1(i2), 0, false, (iu30) null, x340Var, 8, 56);
            x340Var.r(true);
            op71.g(x340Var, u291.h(nim0Var, cbx.b(x340Var).b.a));
            vnr0 vnr0Var4 = (vnr0) lfa1Var.d.invoke(x340Var, 0);
            qim0 qim0VarF6 = u291.f(nim0Var, 1.0f);
            boolean z6 = i4 == 32;
            Object objT4 = x340Var.T();
            if (z6 || objT4 == m4cVar) {
                objT4 = new mcf1(tcf1Var, (byte) 4);
                x340Var.s0(objT4);
            }
            qgo1.f(vnr0Var4, i541.C(qim0VarF6, (iu30) objT4), new a0e1(3), 0, false, (iu30) null, x340Var, 8, 56);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new xaf1(lfa1Var, tcf1Var, i, (byte) 2);
        }
    }

    public static final void m(int i, int i2, String str, Long l, Long l2, long j, boolean z, boolean z2, hlq hlqVar, b0k b0kVar, int i3) {
        int i4;
        Long l3;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1072727856);
        if ((i3 & 6) == 0) {
            i4 = (x340Var.e(i) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= x340Var.e(i2) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= x340Var.g(str) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            l3 = l;
            i4 |= x340Var.g(l3) ? 2048 : 1024;
        } else {
            l3 = l;
        }
        if ((i3 & 24576) == 0) {
            i4 |= x340Var.g(l2) ? 16384 : 8192;
        }
        if ((196608 & i3) == 0) {
            i4 |= x340Var.f(j) ? 131072 : 65536;
        }
        if ((1572864 & i3) == 0) {
            i4 |= x340Var.h(z) ? 1048576 : 524288;
        }
        if ((12582912 & i3) == 0) {
            i4 |= x340Var.h(z2) ? 8388608 : 4194304;
        }
        if ((100663296 & i3) == 0) {
            i4 |= (134217728 & i3) == 0 ? x340Var.g(hlqVar) : x340Var.i(hlqVar) ? 67108864 : 33554432;
        }
        if (x340Var.Y(i4 & 1, (38347923 & i4) != 38347922)) {
            Object objT = x340Var.T();
            if (objT == fkj0.X) {
                yqg yqgVar = (yqg) ((jiz0) ((ojq) hlqVar.a.c).b).k.get();
                c8o.l(yqgVar);
                objT = new flz0(yqgVar);
                x340Var.s0(objT);
            }
            elz0 elz0Var = new elz0(i, i2, str, l3, l2, j, z, z2);
            qim0 qim0VarF = u291.f(nim0.a, 1.0f);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            otw.c((flz0) objT, elz0Var, uyn1.y(qim0VarF, 16.0f, cbx.b(x340Var).b.a), (ipb1) null, x340Var, 0, 8);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new jq31(i, i2, str, l, l2, j, z, z2, hlqVar, i3);
        }
    }

    public static final void n(boolean z, j2i j2iVar, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(669568959);
        int i2 = (x340Var.h(z) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = new zen0(Boolean.FALSE);
                x340Var.s0(objT);
            }
            zen0 zen0Var = (zen0) objT;
            uwr uwrVar = cbx.a;
            int iT = jfv.t(cbx.c(x340Var).b.a, ngv.d);
            ceo ceoVar = ((jhx) cbx.c(x340Var).a.d).b;
            pxg1 pxg1VarO0 = irn1.o0(iT, 0, ceoVar, 2);
            pxg1 pxg1VarO1 = irn1.o0(iT, 0, ceoVar, 2);
            Boolean boolValueOf = Boolean.valueOf(z);
            boolean zI = x340Var.i(zen0Var) | ((i2 & 14) == 4);
            Object objT2 = x340Var.T();
            if (zI || objT2 == m4cVar) {
                objT2 = new prb(zen0Var, z, (lnm) null, (byte) 0);
                x340Var.s0(objT2);
            }
            qxd0.t(boolValueOf, x340Var, (vu30) objT2);
            bby bbyVarE = xay.e(2, pxg1VarO0);
            Object objT3 = x340Var.T();
            if (objT3 == m4cVar) {
                objT3 = zmb.b1;
                x340Var.s0(objT3);
            }
            bby bbyVarA = bbyVarE.a(xay.m(pxg1VarO1, (iu30) objT3));
            ln00 ln00VarF = xay.f(2, pxg1VarO0);
            Object objT4 = x340Var.T();
            if (objT4 == m4cVar) {
                objT4 = zmb.c1;
                x340Var.s0(objT4);
            }
            fq7.d(zen0Var, (qim0) null, bbyVarA, ln00VarF.a(xay.q(pxg1VarO1, (iu30) objT4)), (String) null, apo.r(-454617449, new zw2(z, j2iVar, (byte) 4), x340Var), x340Var, 196608, 18);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ok6((byte) 2, i, j2iVar, z);
        }
    }

    public static final HashSet o(m2a1 m2a1Var) {
        return Effects.a(new n2a1[]{new n2a1(m2a1Var)});
    }

    public static boolean p(hk4 hk4Var) {
        return hk4Var.b();
    }

    public static final int w(bgl1 bgl1Var, boolean z) {
        switch (bgl1Var.ordinal()) {
            case 0:
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                bgl1Var.name();
                return 2131234023;
            case 1:
                return 2131234008;
            case 2:
                return 2131234009;
            case 3:
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                return 2131234006;
            case 4:
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                return 2131234007;
            case 5:
                return 2131234005;
            case 6:
                return z ? 2131234014 : 2131234013;
            case 7:
                return z ? 2131234014 : 2131234013;
            case 8:
            case 9:
                return z ? 2131234021 : 2131234015;
            case 10:
            case 11:
                return z ? 2131234022 : 2131234018;
            case 12:
                return 2131234016;
            case 13:
                return 2131234017;
            case 14:
            case 15:
                return z ? 2131234020 : 2131234019;
            case 16:
                return 2131234004;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                return 2131234010;
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                return z ? 2131234012 : 2131234011;
            default:
                eg.o();
                return 0;
        }
    }

    public static boolean x(hk4 hk4Var) {
        return hk4Var.c();
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0038  */
    public static final ven0 y(b0k b0kVar) {
        boolean z;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        Context context = (Context) x340Var.k(AndroidCompositionLocals_androidKt.b);
        boolean zG = x340Var.g(context);
        Object objT = x340Var.T();
        if (zG || objT == m4cVar) {
            Object systemService = context.getSystemService("accessibility");
            objT = systemService instanceof AccessibilityManager ? (AccessibilityManager) systemService : null;
            x340Var.s0(objT);
        }
        AccessibilityManager accessibilityManager = (AccessibilityManager) objT;
        if (accessibilityManager != null) {
            z = accessibilityManager.isTouchExplorationEnabled();
        }
        Boolean boolValueOf = Boolean.valueOf(z);
        boolean zI = x340Var.i(accessibilityManager);
        Object objT2 = x340Var.T();
        if (zI || objT2 == m4cVar) {
            objT2 = new jh(accessibilityManager, (lnm) null, (byte) 2);
            x340Var.s0(objT2);
        }
        return yto.p(boolValueOf, accessibilityManager, (vu30) objT2, x340Var, 0);
    }

    public static boolean z(hk4 hk4Var) {
        return hk4Var.i();
    }

    public abstract String q();

    public abstract svi0 r();

    public abstract Playlist s();

    public abstract Status t();

    public abstract long u();

    public abstract long v();
}
