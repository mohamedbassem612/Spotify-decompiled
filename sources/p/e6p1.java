package p;

import android.net.Uri;
import androidx.compose.ui.graphics.ColorFilter;
import com.spotify.mobius.Next;
import java.net.ProxySelector;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class e6p1 {
    public static b180 a;
    public static b180 b;

    public e6p1(int i) {
    }

    public static final void a(qw50 qw50Var, qim0 qim0Var, Function0 function0, iu30 iu30Var, b0k b0kVar, int i) {
        iu30 iu30Var2;
        String str = qw50Var.a;
        String str2 = qw50Var.i;
        String str3 = qw50Var.g.a;
        String str4 = qw50Var.h;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1006343240);
        j06 j06Var = x340Var.a;
        int i2 = i | (x340Var.g(qw50Var) ? 4 : 2) | (x340Var.i(qim0Var) ? 32 : 16) | (x340Var.i(function0) ? 256 : 128) | (x340Var.i(iu30Var) ? 2048 : 1024);
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            gfh0 gfh0VarC = t1c.c(een.d, false);
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
            nko1.H(gfh0VarC, x340Var, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var, lljVar3);
            nko1.F(x340Var);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var, lljVar4);
            Uri uri = Uri.parse(qw50Var.f);
            nim0 nim0Var = nim0.a;
            qim0 qim0VarH = u291.h(u291.f(nim0Var, 1.0f), 320.0f);
            as80 as80Var = mif1.P0;
            isl islVar = isl.a;
            oux ouxVar = oux.a;
            eso1.e(uri, islVar, qim0VarH, (p3v) null, (zvx) null, (ecx) null, as80Var, (tl3) null, (ColorFilter) null, ouxVar, false, false, x340Var, 196656, 0, 3480);
            era eraVar = een.Q0;
            qim0 qim0VarB = uyn1.B(u291.f(nim0Var, 1.0f), 24.0f, 0.0f, 24.0f, 40.0f, 2);
            mbh mbhVarA = jbh.a(h36.c, eraVar, x340Var, 0);
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
            op71.g(x340Var, u291.h(nim0Var, 160.0f));
            String str5 = qw50Var.c;
            uwr uwrVar = cbx.a;
            uwo1.e(str5, anm1.N("HeaderSuperscript", nim0Var), cbx.d(x340Var).h, xxq0.c(qw50Var.d), new a0e1(3), null, 0, false, null, 0, null, x340Var, 0, 0, 2016);
            x340 x340Var2 = x340Var;
            if (str4.length() > 0) {
                v8i0.i(24.0f, -1180504476, x340Var2, x340Var2, nim0Var);
                eso1.e(Uri.parse(str4), islVar, u291.r(anm1.N("HeaderIcon", nim0Var), 64.0f), (p3v) null, (zvx) null, (ecx) null, as80Var, (tl3) null, (ColorFilter) null, ouxVar, false, false, x340Var2, 196656, 0, 3480);
                x340Var2 = x340Var2;
                x340Var2.r(false);
            } else {
                x340Var2.i0(-1180125842);
                x340Var2.r(false);
            }
            if (str.length() > 0) {
                x340Var2.i0(-1180070817);
                x340 x340Var3 = x340Var2;
                uwo1.e(str, uyn1.B(anm1.N("HeaderTitle", nim0Var), 0.0f, 8.0f, 0.0f, 0.0f, 13), cbx.d(x340Var2).b, xxq0.c(qw50Var.b), new a0e1(3), null, 0, false, null, 0, null, x340Var3, 0, 0, 2016);
                x340Var2 = x340Var3;
                x340Var2.r(false);
            } else {
                x340Var2.i0(-1179802450);
                x340Var2.r(false);
            }
            x340 x340Var4 = x340Var2;
            uwo1.e(qw50Var.e, uyn1.B(anm1.N("HeaderDescription", nim0Var), 0.0f, 24.0f, 0.0f, 0.0f, 13), cbx.d(x340Var4).g, cbx.a(x340Var4).b.a, new a0e1(3), null, 0, false, null, 0, null, x340Var4, 0, 0, 2016);
            x340Var = x340Var4;
            if (
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r25v1 ??
                	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                */
            /*
                Method dump skipped, instruction units count: 893
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: p.e6p1.a(p.qw50, p.qim0, kotlin.jvm.functions.Function0, p.iu30, p.b0k, int):void");
        }

        public static final void b(int i, int i2, j2i j2iVar, b0k b0kVar, qim0 qim0Var) {
            int i3;
            x340 x340Var = (x340) b0kVar;
            x340Var.k0(-1664419757);
            j06 j06Var = x340Var.a;
            int i4 = i2 & 1;
            if (i4 != 0) {
                i3 = i | 6;
            } else {
                i3 = (x340Var.i(qim0Var) ? 4 : 2) | i;
            }
            if (x340Var.Y(i3 & 1, (i3 & 19) != 18)) {
                qim0 qim0Var2 = nim0.a;
                if (i4 != 0) {
                    qim0Var = qim0Var2;
                }
                qim0 qim0VarF = u291.f(qim0Var2, 1.0f);
                gfh0 gfh0VarC = t1c.c(een.e, false);
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
                nko1.H(gfh0VarC, x340Var, lljVar);
                llj lljVar2 = y580.N0;
                nko1.H(xos0VarM, x340Var, lljVar2);
                Integer numValueOf = Integer.valueOf(iHashCode);
                llj lljVar3 = y580.R0;
                nko1.H(numValueOf, x340Var, lljVar3);
                nko1.F(x340Var);
                llj lljVar4 = y580.Y;
                nko1.H(qim0VarE, x340Var, lljVar4);
                qim0 qim0VarF2 = u291.f(u291.x(0.0f, dsa0.m(x340Var, 2131166901), 1, qim0Var), 1.0f);
                mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
                int iHashCode2 = Long.hashCode(x340Var.T);
                xos0 xos0VarM2 = x340Var.m();
                qim0 qim0VarE2 = zr7.E(x340Var, qim0VarF2);
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
                k4s0.i(6, j2iVar, x340Var, true, true);
            } else {
                x340Var.b0();
            }
            qim0 qim0Var3 = qim0Var;
            h311 h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new rbh(qim0Var3, j2iVar, i, i2, (byte) 0);
            }
        }

        public static final void c(a001 a001Var, lik1 lik1Var, idm idmVar, qim0 qim0Var, b0k b0kVar, int i) {
            int i2;
            qim0 qim0Var2;
            x340 x340Var = (x340) b0kVar;
            x340Var.k0(-1394480880);
            j06 j06Var = x340Var.a;
            if ((i & 6) == 0) {
                i2 = (x340Var.g(a001Var) ? 4 : 2) | i;
            } else {
                i2 = i;
            }
            if ((i & 48) == 0) {
                i2 |= x340Var.g(lik1Var) ? 32 : 16;
            }
            if ((i & 384) == 0) {
                i2 |= x340Var.i(idmVar) ? 256 : 128;
            }
            int i3 = i2 | 3072;
            if (x340Var.Y(i3 & 1, (i3 & 1171) != 1170)) {
                boolean z = a001Var.c;
                qim0 qim0Var3 = nim0.a;
                qim0 qim0VarN = anm1.N("ShareCardLoading", u291.f(ltn1.t(qim0Var3, z), 1.0f));
                uwr uwrVar = cbx.a;
                cvx cvxVar = cbx.b(x340Var).b;
                cvx cvxVar2 = cbx.b(x340Var).b;
                qim0 qim0VarB = uyn1.B(qim0VarN, 0.0f, 6.0f, 0.0f, 6.0f, 5);
                cvx cvxVar3 = cbx.b(x340Var).b;
                mbh mbhVarA = jbh.a(new d36(4.0f, true, new um5(false)), een.P0, x340Var, 0);
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
                mgo1.a(a001Var.b, null, x340Var, 0, 2);
                qim0 qim0VarZ = u291.z(qim0Var3, (fra) null, 1);
                gfh0 gfh0VarC = t1c.c(een.d, false);
                int iHashCode2 = Long.hashCode(x340Var.T);
                xos0 xos0VarM2 = x340Var.m();
                qim0 qim0VarE2 = zr7.E(x340Var, qim0VarZ);
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
                g6p1.c(lik1Var, a001Var, idmVar, null, x340Var, ((i3 >> 3) & 14) | ((i3 << 3) & 112) | (i3 & 896), 8);
                x340Var.r(true);
                x340Var.r(true);
                qim0Var2 = qim0Var3;
            } else {
                x340Var.b0();
                qim0Var2 = qim0Var;
            }
            h311 h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new nca0(i, a001Var, lik1Var, idmVar, qim0Var2, (byte) 15);
            }
        }

        public static final long d(int i) {
            return e(i, i);
        }

        public static final long e(int i, int i2) {
            if (i < 0 || i2 < 0) {
                rf80.a("start and end cannot be negative. [start: " + i + ", end: " + i2 + "]");
            }
            long j = (((long) i2) & 4294967295L) | (((long) i) << 32);
            int i3 = nbe1.c;
            return j;
        }

        public static final long f(int i, long j) {
            int i2 = nbe1.c;
            int i3 = (int) (j >> 32);
            int i4 = i3 < 0 ? 0 : i3;
            if (i4 > i) {
                i4 = i;
            }
            int i5 = (int) (4294967295L & j);
            int i6 = i5 >= 0 ? i5 : 0;
            if (i6 <= i) {
                i = i6;
            }
            return (i4 == i3 && i == i5) ? j : e(i4, i);
        }

        public static final ven0 g(idn0 idn0Var, b0k b0kVar, int i) {
            x340 x340Var = (x340) b0kVar;
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = v8r.q(Boolean.FALSE);
                x340Var.s0(objT);
            }
            ven0 ven0Var = (ven0) objT;
            boolean z = (((i & 14) ^ 6) > 4 && x340Var.g(idn0Var)) || (i & 6) == 4;
            Object objT2 = x340Var.T();
            if (z || objT2 == m4cVar) {
                objT2 = new b4v(idn0Var, ven0Var, (lnm) null, (byte) 1);
                x340Var.s0(objT2);
            }
            qxd0.t(idn0Var, x340Var, (vu30) objT2);
            return ven0Var;
        }

        public static final jhm h(Function0 function0) {
            return new jhm("decline_offer", gux.c, (fhm) null, 2131956610, (String) null, false, (tm81) null, new ihm(new ygm(2), new ghm(r5r.N0, r5r.O0), new vj0(function0, (byte) 28)), 244);
        }

        public static apk0 i(Integer num, r6h1 r6h1Var) {
            return new apk0(num, r6h1Var);
        }

        public static final d2k1 j(Long l, Long l2, long j) {
            if (l2 == null || l == null) {
                return null;
            }
            return (j - l2.longValue()) / 3600000 <= 24 ? b2k1.a : new c2k1(l.longValue());
        }

        public static Next k(fu1 fu1Var, ss1 ss1Var) {
            Object next;
            ot1 ot1Var = ss1Var.a;
            String str = ot1Var.a;
            boolean zG = fu1Var.g(str);
            gy1 gy1Var = fu1Var.m;
            if (gy1Var instanceof by1) {
                c380<Object> c380Var = fu1Var.k;
                ArrayList arrayList = new ArrayList(q7h.U(c380Var, 10));
                for (Object objG : c380Var) {
                    if (objG instanceof ot1) {
                        ot1 ot1Var2 = (ot1) objG;
                        if (u890.j(ot1Var2.a, str)) {
                            objG = ot1.g(ot1Var2, !ot1Var2.e, 32751);
                        }
                    }
                    arrayList.add(objG);
                }
                c380<Object> c380Var2 = fu1Var.l;
                ArrayList arrayList2 = new ArrayList(q7h.U(c380Var2, 10));
                for (Object objG2 : c380Var2) {
                    if (objG2 instanceof ot1) {
                        ot1 ot1Var3 = (ot1) objG2;
                        if (u890.j(ot1Var3.a, str)) {
                            objG2 = ot1.g(ot1Var3, !ot1Var3.e, 32751);
                        }
                    }
                    arrayList2.add(objG2);
                }
                return Next.i(fu1.b(fu1Var, (String) null, (fo1) null, false, 0L, 0, false, (ma61) null, (pia1) null, mqo1.A(arrayList), mqo1.A(arrayList2), false, (Set) null, false, (wka1) null, (Set) null, 2094079), Collections.singleton(new zp1(((by1) gy1Var).a, str, zG)));
            }
            boolean z = gy1Var instanceof fy1;
            fu1 fu1VarC = fu1Var.c(new atp0(str, (byte) 29), lqu0.b);
            ma61 ma61Var = fu1VarC.h;
            if (!z) {
                return Next.i(fu1VarC, Collections.singleton(new yo1(str, zG)));
            }
            boolean z2 = (!fu1Var.n || ot1Var.h || zG) ? false : true;
            hlg1 hlg1Var = fu1Var.h.c;
            hlg1 hlg1Var2 = ma61Var.c;
            if (!zG) {
                return Next.i(fu1.b(fu1VarC, (String) null, (fo1) null, false, 0L, 0, false, ma61.a(ma61Var, null, null, hlg1.a(hlg1Var2, dm61.x0(str, hlg1Var2.a), null, dm61.u0(str, hlg1Var2.c), null, null, 26), null, null, null, null, 123), (pia1) null, (c380) null, (c380) null, false, (Set) null, false, (wka1) null, (Set) null, 2097023), Collections.singleton(new lp1(str, z2)));
            }
            if (hlg1Var.a.contains(str)) {
                return Next.i(fu1.b(fu1VarC, (String) null, (fo1) null, false, 0L, 0, false, ma61.a(ma61Var, null, null, hlg1.a(hlg1Var2, dm61.u0(str, hlg1Var2.a), null, dm61.x0(str, hlg1Var2.c), null, null, 26), null, null, null, null, 123), (pia1) null, (c380) null, (c380) null, false, (Set) null, false, (wka1) null, (Set) null, 2097023), Collections.singleton(new ap1(str)));
            }
            Set set = hlg1Var.b;
            if (!(set instanceof Collection) || !set.isEmpty()) {
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    if (u890.j(((af41) it.next()).a, str)) {
                        Iterator it2 = hlg1Var2.b.iterator();
                        do {
                            if (!it2.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it2.next();
                        } while (!u890.j(((af41) next).a, str));
                        af41 af41Var = (af41) next;
                        List list = af41Var != null ? af41Var.b : null;
                        if (list == null) {
                            list = z6x.a;
                        }
                        boolean z3 = af41Var != null && af41Var.c;
                        Set set2 = hlg1Var2.b;
                        ArrayList arrayList3 = new ArrayList();
                        for (Object obj : set2) {
                            if (!u890.j(((af41) obj).a, str)) {
                                arrayList3.add(obj);
                            }
                        }
                        fu1 fu1VarB = fu1.b(fu1VarC, (String) null, (fo1) null, false, 0L, 0, false, ma61.a(ma61Var, null, null, hlg1.a(hlg1Var2, null, o7h.p1(arrayList3), null, null, null, 29), null, null, null, null, 123), (pia1) null, (c380) null, (c380) null, false, (Set) null, false, (wka1) null, (Set) null, 2097023);
                        Set setSingleton = Collections.singleton(str);
                        Set set3 = w7x.a;
                        return Next.i(fu1VarB, Collections.singleton(new kp1(set3, setSingleton, z3 ? Collections.singleton(str) : set3, !list.isEmpty() ? Collections.singletonMap(str, list) : b7x.a)));
                    }
                }
            }
            return Next.i(fu1.b(fu1VarC, (String) null, (fo1) null, false, 0L, 0, false, ma61.a(ma61Var, null, null, hlg1.a(hlg1Var2, null, null, null, dm61.x0(str, hlg1Var2.d), null, 23), null, null, null, null, 123), (pia1) null, (c380) null, (c380) null, false, (Set) null, false, (wka1) null, (Set) null, 2097023), Collections.singleton(new gp1(str)));
        }

        public static void l() {
            ProxySelector proxySelector = ProxySelector.getDefault();
            if (proxySelector instanceof iq50) {
                return;
            }
            ProxySelector.setDefault(new iq50(proxySelector));
        }

        public static final go80 m(klm klmVar, bcp0 bcp0Var, bcp0 bcp0Var2, bcp0 bcp0Var3, bcp0 bcp0Var4, bcp0 bcp0Var5, bcp0 bcp0Var6) {
            return klmVar.a("WearDataLayerDaemon", new ndp0(bcp0Var, bcp0Var2, bcp0Var3, bcp0Var4, bcp0Var5, bcp0Var6, (byte) 3));
        }

        public static boolean n(mi4 mi4Var) {
            return mi4Var.a();
        }

        public static final String o(long j, CharSequence charSequence) {
            return charSequence.subSequence(nbe1.g(j), nbe1.f(j)).toString();
        }

        public static final g4a p(f4a f4aVar) {
            int iOrdinal = f4aVar.ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal == 1) {
                    return g4a.b;
                }
                if (iOrdinal == 2) {
                    return g4a.c;
                }
                if (iOrdinal == 3) {
                    return g4a.d;
                }
                if (iOrdinal != 4) {
                    eg.o();
                    return null;
                }
            }
            return g4a.a;
        }

        public static final f4a q(g4a g4aVar) {
            int iOrdinal = g4aVar.ordinal();
            if (iOrdinal == 0) {
                hhg1.n("Cannot update an unknown ban status.");
                return null;
            }
            if (iOrdinal == 1) {
                return f4a.c;
            }
            if (iOrdinal == 2) {
                return f4a.d;
            }
            if (iOrdinal == 3) {
                return f4a.e;
            }
            eg.o();
            return null;
        }

        public static Next r(fu1 fu1Var, ss1 ss1Var) {
            ot1 ot1Var = ss1Var.a;
            if (fu1Var.e != 1) {
                return Next.j();
            }
            if (!ot1Var.g || (!fu1Var.n && (fu1Var.m instanceof fy1) && !ot1Var.h)) {
                return !ot1Var.d ? Next.a(Collections.singleton(new dp1(ot1Var))) : Next.j();
            }
            String str = ot1Var.a;
            if (!fu1Var.g(str) && ot1Var.N0 == 4) {
                String str2 = bo1.a;
                Set set = s4b1.f;
                if (bo1.a(uic.x(str)) && !bo1.c(str) && (!ot1Var.O0 || fu1Var.s.contains(str))) {
                    return c97.t(fu1Var, new i031(ot1Var));
                }
            }
            return k(fu1Var, ss1Var);
        }
    }
