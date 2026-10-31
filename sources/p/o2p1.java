package p;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class o2p1 {
    public static b180 a;
    public static b180 b;

    public static final void a(c380 c380Var, j2i j2iVar, Function0 function0, boolean z, qim0 qim0Var, u7h u7hVar, b0k b0kVar, int i) {
        j2i j2iVar2;
        c380 c380Var2;
        qim0 qim0Var2;
        qim0 qim0Var3;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-48227802);
        int i2 = i | (x340Var.i(c380Var) ? 4 : 2) | (x340Var.i(function0) ? 256 : 128) | (x340Var.h(z) ? 2048 : 1024) | 24576 | (x340Var.g(u7hVar) ? 131072 : 65536);
        if (x340Var.Y(i2 & 1, (74899 & i2) != 74898)) {
            uwr uwrVar = cbx.a;
            long jA = cbx.a(x340Var).a.a.a();
            long j = u7hVar != null ? u7hVar.a : jA;
            String strO0 = cwl1.o0(x340Var, 2131953071);
            mic0 mic0VarK = v9c.k(new mmr0[]{new mmr0(Float.valueOf(0.0f), new u7h(j)), new mmr0(Float.valueOf(0.5f), new u7h(jA)), new mmr0(Float.valueOf(1.0f), new u7h(jA))}, 0.0f, 0.0f, 14);
            String strO1 = cwl1.o0(x340Var, 2131953069);
            cvx cvxVar = cbx.b(x340Var).b;
            qim0 qim0Var4 = nim0.a;
            if (z) {
                x340Var.i0(2060417272);
                Object objT = x340Var.T();
                if (objT == fkj0.X) {
                    objT = tj8.V0;
                    x340Var.s0(objT);
                }
                qim0Var3 = qim0Var4;
                zzo1.g(strO0, c380Var, (vu30) objT, dsa0.m(x340Var, 2131165403), u291.f(qim0Var4, 1.0f), mic0VarK, strO1, function0, 16.0f, j2iVar, x340Var, ((i2 << 18) & 234881024) | ((i2 << 3) & 112) | 384, 6);
                c380Var2 = c380Var;
                x340Var = x340Var;
                x340Var.r(false);
                j2iVar2 = j2iVar;
            } else {
                c380Var2 = c380Var;
                qim0Var3 = qim0Var4;
                x340Var.i0(2060871050);
                j2iVar2 = j2iVar;
                d0p1.i(strO0, u291.f(qim0Var3, 1.0f), null, mic0VarK, strO1, function0, 16.0f, apo.r(1505178796, new ef8(c380Var2, j2iVar2, (byte) 5), x340Var), x340Var, ((i2 << 9) & 458752) | 12582912, 4);
                x340Var.r(false);
            }
            qim0Var2 = qim0Var3;
        } else {
            j2iVar2 = j2iVar;
            c380Var2 = c380Var;
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new wr1((Object) c380Var2, (Object) j2iVar2, (Object) function0, z, (Object) qim0Var2, (Object) u7hVar, i, (byte) 1);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void b(dn20 dn20Var, iu30 iu30Var, yqg yqgVar, xu30 xu30Var, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        b0k b0kVar2;
        boolean z;
        gbx gbxVar;
        j2i j2iVarR;
        boolean z2;
        xu30 xu30Var2;
        m4c m4cVar = fkj0.X;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(632494851);
        int i2 = i | (b0kVar3.g(dn20Var) ? 4 : 2) | (b0kVar3.i(iu30Var) ? 32 : 16) | (b0kVar3.g(yqgVar) ? 256 : 128) | (b0kVar3.i(xu30Var) ? 2048 : 1024);
        if (b0kVar3.Y(i2 & 1, (i2 & 1171) != 1170)) {
            qim0 qim0VarH = pqo.h(u291.f(nim0.a, 1.0f), dn20Var.d);
            boolean z3 = dn20Var.a.d != 3;
            zzq0 zzq0VarP = gto1.p(1, b0kVar3, 3);
            tvx tvxVarB = gto1.B(1, b0kVar3, 3);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(b0kVar3).b;
            uvx uvxVar = new uvx(0, (pgx) null, 3, zzq0VarP, (zzq0) null, tvx.a(tvxVarB, 2.0f, 6), (hw61) null, dn20Var.c.d == 2 ? 2 : 1, (p3v) null, 339);
            int i3 = i2 & 112;
            boolean z4 = ((i2 & 896) == 256) | (i3 == 32);
            Object objT = b0kVar3.T();
            if (z4 || objT == m4cVar) {
                objT = new sn8(iu30Var, yqgVar, (byte) 3);
                b0kVar3.s0(objT);
            }
            Function0 function0 = (Function0) objT;
            if (ihc1.y0("TODO")) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return;
            }
            gbx gbxVar2 = new gbx(new y50("TODO"), function0);
            j2i j2iVarR2 = null;
            if (dn20Var.h) {
                b0kVar3.i0(633758296);
                boolean z5 = i3 == 32;
                Object objT2 = b0kVar3.T();
                if (z5 || objT2 == m4cVar) {
                    objT2 = new y720(iu30Var, (byte) 12);
                    b0kVar3.s0(objT2);
                }
                Function0 function1 = (Function0) objT2;
                if (ihc1.y0("TODO")) {
                    hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                    return;
                } else {
                    gbxVar = new gbx(new y50("TODO"), function1);
                    z = false;
                    b0kVar3.r(false);
                }
            } else {
                z = false;
                b0kVar3.i0(633863913);
                b0kVar3.r(false);
                gbxVar = null;
            }
            qa51 qa51Var = dn20Var.g;
            if (qa51Var == null) {
                b0kVar3.i0(633992345);
                b0kVar3.r(z);
                j2iVarR = null;
            } else {
                b0kVar3.i0(633992346);
                j2iVarR = apo.r(-85234160, new o8x(qa51Var, (byte) 28), b0kVar3);
                b0kVar3.r(z);
            }
            ta51 ta51Var = dn20Var.b;
            if (ta51Var.a.length() == 0 && ta51Var.c.length() == 0 && ta51Var.b.isEmpty()) {
                ta51Var = null;
            }
            if (ta51Var == null) {
                b0kVar3.i0(634150073);
                z2 = false;
                b0kVar3.r(false);
                xu30Var2 = null;
            } else {
                z2 = false;
                b0kVar3.i0(634150074);
                xu30 xu30VarR = apo.r(1171237397, new cn20(ta51Var, (byte) 0), b0kVar3);
                b0kVar3.r(false);
                xu30Var2 = xu30VarR;
            }
            b0kVar3.i0(634247909);
            b0kVar3.r(z2);
            if (dn20Var.i.a.isEmpty()) {
                b0kVar3.i0(634691241);
                b0kVar3.r(false);
            } else {
                b0kVar3.i0(634380931);
                j2iVarR2 = apo.r(358274991, new cex(dn20Var, iu30Var, (byte) 13), b0kVar3);
                b0kVar3.r(false);
            }
            b0kVar2 = b0kVar3;
            jto1.b(qim0VarH, uvxVar, null, z3, null, null, gbxVar2, gbxVar, null, apo.r(-1492286676, new o8x(dn20Var, (byte) 29), b0kVar3), j2iVarR, xu30Var2, j2iVarR2, null, null, apo.r(1048130375, new cex(dn20Var, xu30Var, (byte) 14), b0kVar3), b0kVar2, 805306432, 196608, 16692);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new bn20(dn20Var, iu30Var, yqgVar, xu30Var, i);
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0061  */
    /* JADX WARN: Code duplicated, block: B:31:0x0063  */
    /* JADX WARN: Code duplicated, block: B:34:0x006c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x006e  */
    /* JADX WARN: Code duplicated, block: B:38:0x0079  */
    /* JADX WARN: Code duplicated, block: B:39:0x007b  */
    /* JADX WARN: Code duplicated, block: B:43:0x0084  */
    /* JADX WARN: Code duplicated, block: B:46:0x0092  */
    /* JADX WARN: Code duplicated, block: B:50:0x009b  */
    /* JADX WARN: Code duplicated, block: B:52:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:55:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:57:? A[RETURN, SYNTHETIC] */
    public static final void c(dn20 dn20Var, iu30 iu30Var, yqg yqgVar, qim0 qim0Var, xu30 xu30Var, b0k b0kVar, int i, int i2) {
        xu30 xu30Var2;
        boolean z;
        xu30 xu30Var3;
        qim0 qim0Var2;
        h311 h311VarV;
        int i3;
        boolean z2;
        Object objT;
        boolean z3;
        Object objT2;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-700213147);
        int i4 = (x340Var.g(dn20Var) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i4 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        int i5 = i4 | (x340Var.g(yqgVar) ? 256 : 128);
        int i6 = i5 | 3072;
        int i7 = i2 & 16;
        if (i7 == 0) {
            if ((i & 24576) == 0) {
                xu30Var2 = xu30Var;
                i6 |= x340Var.i(xu30Var2) ? 16384 : 8192;
            }
            if ((i6 & 9363) != 9362) {
                z = true;
            } else {
                z = false;
            }
            if (x340Var.Y(i6 & 1, z)) {
                if (i7 != 0) {
                    xu30Var2 = cpi.a;
                }
                boolean z4 = dn20Var.e;
                boolean z5 = dn20Var.f;
                i3 = i6 & 112;
                if (i3 == 32) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                objT = x340Var.T();
                if (z2 || objT == m4cVar) {
                    objT = new y720(iu30Var, (byte) 15);
                    x340Var.s0(objT);
                }
                Function0 function0 = (Function0) objT;
                z3 = i3 == 32;
                objT2 = x340Var.T();
                if (z3 || objT2 == m4cVar) {
                    objT2 = new y720(iu30Var, (byte) 16);
                    x340Var.s0(objT2);
                }
                j2i j2iVarR = apo.r(-227493968, new bn20(dn20Var, iu30Var, yqgVar, xu30Var2), x340Var);
                qim0 qim0Var3 = nim0.a;
                n3o1.g(z4, function0, z5, (Function0) objT2, qim0Var3, j2iVarR, x340Var, 221184, 0);
                xu30Var3 = xu30Var2;
                qim0Var2 = qim0Var3;
            } else {
                x340Var.b0();
                xu30Var3 = xu30Var2;
                qim0Var2 = qim0Var;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new nym(dn20Var, iu30Var, yqgVar, qim0Var2, xu30Var3, i, i2, (byte) 1);
            }
        }
        i6 = i5 | 27648;
        xu30Var2 = xu30Var;
        if ((i6 & 9363) != 9362) {
            z = true;
        } else {
            z = false;
        }
        if (x340Var.Y(i6 & 1, z)) {
            if (i7 != 0) {
                xu30Var2 = cpi.a;
            }
            boolean z6 = dn20Var.e;
            boolean z7 = dn20Var.f;
            i3 = i6 & 112;
            if (i3 == 32) {
                z2 = true;
            } else {
                z2 = false;
            }
            objT = x340Var.T();
            if (z2) {
                objT = new y720(iu30Var, (byte) 15);
                x340Var.s0(objT);
            } else {
                objT = new y720(iu30Var, (byte) 15);
                x340Var.s0(objT);
            }
            Function0 function1 = (Function0) objT;
            if (i3 == 32) {
            }
            objT2 = x340Var.T();
            if (z3) {
                objT2 = new y720(iu30Var, (byte) 16);
                x340Var.s0(objT2);
            } else {
                objT2 = new y720(iu30Var, (byte) 16);
                x340Var.s0(objT2);
            }
            j2i j2iVarR2 = apo.r(-227493968, new bn20(dn20Var, iu30Var, yqgVar, xu30Var2), x340Var);
            qim0 qim0Var4 = nim0.a;
            n3o1.g(z6, function1, z7, (Function0) objT2, qim0Var4, j2iVarR2, x340Var, 221184, 0);
            xu30Var3 = xu30Var2;
            qim0Var2 = qim0Var4;
        } else {
            x340Var.b0();
            xu30Var3 = xu30Var2;
            qim0Var2 = qim0Var;
        }
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new nym(dn20Var, iu30Var, yqgVar, qim0Var2, xu30Var3, i, i2, (byte) 1);
        }
    }

    public static final void d(flw0 flw0Var, iu30 iu30Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1803236044);
        int i2 = (x340Var.i(flw0Var) ? 4 : 2) | i | (x340Var.i(iu30Var) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            boolean zI = x340Var.i(flw0Var) | ((i2 & 112) == 32);
            Object objT = x340Var.T();
            if (zI || objT == fkj0.X) {
                objT = new lm61(flw0Var, iu30Var, (lnm) null, (byte) 15);
                x340Var.s0(objT);
            }
            qxd0.t(rih1.a, x340Var, (vu30) objT);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new jt41(flw0Var, iu30Var, i, (byte) 23);
        }
    }

    public static final Object e(np00 np00Var, long j, a8d1 a8d1Var) {
        ohd ohdVar = new ohd(1, aym.t(a8d1Var));
        ohdVar.t();
        ohdVar.n(new mp00(np00Var.b(new long[]{j}, true, new o0g(j, ohdVar, (byte) 10)), np00Var, (byte) 1));
        return ohdVar.r();
    }

    public static final a7k0 f(kak0 kak0Var) {
        return new a7k0(new d0k0(kak0Var.W0, kak0Var.S0, kak0Var.R0, kak0Var.h, kak0Var.X, kak0Var.u1), new ilk0(o(kak0Var), kak0Var.w1, kak0Var.i, kak0Var.t, kak0Var.Y, kak0Var.Z, kak0Var.P0, kak0Var.Q0, kak0Var.Y0, kak0Var.d1, kak0Var.e1, kak0Var.h1, kak0Var.i1, kak0Var.j1, kak0Var.k1, kak0Var.l1, kak0Var.m1, kak0Var.q1, kak0Var.r1, kak0Var.s1, kak0Var.t1, kak0Var.p1, kak0Var.o1));
    }

    public static final f3e1 g(x4t x4tVar) {
        e3e1 e3e1Var;
        d3e1 d3e1Var = new d3e1();
        don1.E(x4tVar, h3e1.a, new w7d1(new w7d1(d3e1Var, (byte) 3), new k7b1(1, d3e1Var, d3e1.class, "addFilter", "addFilter$foundation(Lkotlin/jvm/functions/Function1;)V", 0, (byte) 14)));
        wdn0 wdn0Var = new wdn0();
        wdn0 wdn0Var2 = d3e1Var.a;
        Object[] objArr = wdn0Var2.a;
        int i = wdn0Var2.b;
        int i2 = 0;
        boolean z = true;
        e3e1 e3e1Var2 = null;
        while (true) {
            e3e1Var = q3e1.b;
            if (i2 >= i) {
                break;
            }
            e3e1 e3e1Var3 = (e3e1) objArr[i2];
            if (!z || e3e1Var3 != e3e1Var) {
                if (e3e1Var3 == e3e1Var && e3e1Var2 == e3e1Var) {
                    z = false;
                } else {
                    if (e3e1Var3 != e3e1Var) {
                        wdn0 wdn0Var3 = d3e1Var.b;
                        Object[] objArr2 = wdn0Var3.a;
                        int i3 = wdn0Var3.b;
                        int i4 = 0;
                        while (true) {
                            if (i4 < i3) {
                                if (((Boolean) ((iu30) objArr2[i4]).invoke(e3e1Var3)).booleanValue()) {
                                    i4++;
                                } else {
                                    z = false;
                                }
                            }
                        }
                    }
                    wdn0Var.b(e3e1Var3);
                    z = false;
                    e3e1Var2 = e3e1Var3;
                }
            }
            i2++;
        }
        if (((e3e1) (wdn0Var.i() ? null : wdn0Var.a[wdn0Var.b - 1])) == e3e1Var) {
            wdn0Var.l(wdn0Var.b - 1);
        }
        udn0 udn0Var = wdn0Var.c;
        if (udn0Var == null) {
            udn0Var = new udn0(wdn0Var);
            wdn0Var.c = udn0Var;
        }
        return new f3e1(udn0Var);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:37:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:39:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:41:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:44:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:46:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:48:0x0107  */
    /* JADX WARN: Code duplicated, block: B:49:0x0109  */
    /* JADX WARN: Code duplicated, block: B:52:0x011f  */
    /* JADX WARN: Code duplicated, block: B:55:0x0127  */
    /* JADX WARN: Code duplicated, block: B:57:0x012b  */
    /* JADX WARN: Code duplicated, block: B:59:0x013f  */
    /* JADX WARN: Code duplicated, block: B:62:0x0146  */
    /* JADX WARN: Code duplicated, block: B:64:0x014a  */
    /* JADX WARN: Code duplicated, block: B:67:0x0153  */
    /* JADX WARN: Code duplicated, block: B:70:0x0169  */
    /* JADX WARN: Code duplicated, block: B:75:0x0178  */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x016d, code lost:
    
        if (r11.equals(r1) == false) goto L81;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:44:0x00f9, please report this as an issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.ArrayList h(android.view.View r8, java.util.List r9, int r10, int r11, java.lang.String r12) {
        /*
            Method dump skipped, instruction units count: 419
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.o2p1.h(android.view.View, java.util.List, int, int, java.lang.String):java.util.ArrayList");
    }

    public static ArrayList i(ViewGroup viewGroup) {
        ArrayList arrayList = new ArrayList();
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt.getVisibility() == 0) {
                arrayList.add(childAt);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0070  */
    /* JADX WARN: Code duplicated, block: B:27:0x0076  */
    public static final List j(ji0 ji0Var) {
        String str;
        lj0 kj0Var;
        List list = ji0Var.O0;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof awd) {
                arrayList.add(obj);
            }
        }
        awd awdVar = (awd) o7h.s0(arrayList);
        if (awdVar == null) {
            return z6x.a;
        }
        ArrayList<hzd> arrayList2 = awdVar.b;
        ArrayList arrayList3 = new ArrayList(q7h.U(arrayList2, 10));
        for (hzd hzdVar : arrayList2) {
            String str2 = hzdVar.c;
            if (ihc1.y0(str2)) {
                str2 = ji0Var.e;
            }
            ji0 ji0VarL = ji0.l(0, 524271, str2, ji0Var);
            String str3 = hzdVar.a;
            String str4 = hzdVar.b;
            gq70 gq70Var = hzdVar.d;
            lj0 lj0Var = null;
            if (gq70Var == null) {
                str = "";
            } else {
                if (gq70Var instanceof gq70) {
                    r57 r57Var = gq70Var.c;
                    if (r57Var instanceof p57) {
                        str = ((p57) r57Var).a;
                    } else {
                        str = null;
                    }
                } else {
                    str = null;
                }
                if (str == null) {
                    str = "";
                }
            }
            String str5 = str;
            anw0 anw0Var = hzdVar.e;
            if (anw0Var != null) {
                if (anw0Var instanceof ymw0) {
                    kj0Var = new jj0(((ymw0) anw0Var).a);
                } else {
                    if (!(anw0Var instanceof zmw0)) {
                        eg.o();
                        return null;
                    }
                    zmw0 zmw0Var = (zmw0) anw0Var;
                    kj0Var = new kj0(zmw0Var.a, zmw0Var.b);
                }
                lj0Var = kj0Var;
            }
            arrayList3.add(new hj0(str3, str5, str4, ji0VarL, lj0Var));
        }
        return arrayList3;
    }

    public static final String k(xkk1 xkk1Var, vp70 vp70Var, String str) {
        mq70 mq70Var;
        up70 up70VarA;
        String str2;
        return (xkk1Var == null || (mq70Var = xkk1Var.b) == null || (up70VarA = mq70Var.a(vp70Var)) == null || (str2 = up70VarA.a.a) == null) ? str : str2;
    }

    public static final String l(xkk1 xkk1Var, String str) {
        mq70 mq70Var;
        up70 up70VarA;
        String str2;
        return (xkk1Var == null || (mq70Var = xkk1Var.a) == null || (up70VarA = mq70Var.a(vp70.c)) == null || (str2 = up70VarA.a.a) == null) ? str : str2;
    }

    public static final List m(t3k1 t3k1Var) {
        if (t3k1Var instanceof qf50) {
            return ((qf50) t3k1Var).b;
        }
        if (t3k1Var instanceof swd) {
            return ((swd) t3k1Var).b;
        }
        if (t3k1Var instanceof pnc0) {
            return ((pnc0) t3k1Var).b;
        }
        if (t3k1Var instanceof o660) {
            return ((o660) t3k1Var).b;
        }
        if (t3k1Var instanceof hol1) {
            return ((hol1) t3k1Var).b;
        }
        return null;
    }

    public static final u3e0 n() {
        return new u3e0(szq.a());
    }

    public static final ntf1 o(kak0 kak0Var) {
        ruq0 ruq0Var = kak0Var.S0.b;
        return new ntf1(ruq0Var.a, ruq0Var.g, ruq0Var.b, ruq0Var.h);
    }

    public static final kak0 p(kak0 kak0Var, a7k0 a7k0Var) {
        ilk0 ilk0Var = a7k0Var.b;
        ntf1 ntf1Var = ilk0Var.a;
        lhg1 lhg1Var = (u890.j(ntf1Var.c, kak0Var.T0) && u890.j(ntf1Var.d, kak0Var.U0)) ? kak0Var.V0 : ilk0Var.h;
        kak0 kak0VarA = kak0.a(kak0Var, (pdm0) null, (Boolean) null, (ycu0) null, (lhg1) null, ilk0Var.c, ilk0Var.d, (xx8) null, ilk0Var.e, ilk0Var.f, ilk0Var.g, lhg1Var, (lhg1) null, (lhg1) null, (String) null, (String) null, (lhg1) null, (m8w0) null, false, ilk0Var.i, ilk0Var.j, ilk0Var.k, (giq0) null, ilk0Var.l, ilk0Var.m, ilk0Var.n, ilk0Var.o, ilk0Var.p, ilk0Var.q, ilk0Var.w, ilk0Var.v, ilk0Var.r, ilk0Var.s, ilk0Var.t, ilk0Var.u, (Integer) null, (lyj0) null, ilk0Var.b, (Integer) null, (Integer) null, -1627495169, 966785);
        d0k0 d0k0Var = a7k0Var.a;
        m8w0 m8w0Var = d0k0Var.a;
        return kak0.a(kak0VarA, (pdm0) null, (Boolean) null, (ycu0) null, d0k0Var.d, (lhg1) null, (lhg1) null, d0k0Var.e, (List) null, (List) null, (Float) null, (lhg1) null, d0k0Var.c, d0k0Var.b, (String) null, (String) null, (lhg1) null, m8w0Var, false, 0, 0, 0, (giq0) null, (uia) null, (uia) null, (Float) null, (Float) null, (Float) null, (Float) null, false, false, (String) null, false, (lhg1) null, (Boolean) null, d0k0Var.f, (lyj0) null, 0L, (Integer) null, (Integer) null, -4588673, 1032191);
    }

    public static final vnr0 q(vnr0 vnr0Var, int i) {
        jor0 jor0VarF;
        cjc0 cjc0Var = new cjc0(i);
        jor0 jor0Var = vnr0Var.c;
        if (jor0Var instanceof jor0) {
            jor0VarF = jor0.f(jor0Var, (gor0) null, cjc0Var, 59);
        } else {
            if (!(jor0Var instanceof ior0)) {
                eg.o();
                return null;
            }
            jor0VarF = ior0.f((ior0) jor0Var, (ArrayList) null, cjc0Var, 7);
        }
        return vnr0.a(vnr0Var, null, null, jor0VarF, 0L, 27);
    }
}
