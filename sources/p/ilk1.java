package p;

import com.spotify.base.java.logging.Logger;
import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import j$.time.Duration;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final /* synthetic */ class ilk1 implements Update {
    /* JADX WARN: Code duplicated, block: B:112:0x0255  */
    /* JADX WARN: Code duplicated, block: B:125:0x027f  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Next a(Object obj, Object obj2) {
        boolean zEquals;
        tqw0 tqw0VarG;
        boolean zEquals2;
        boolean zEquals3;
        boolean zEquals4;
        tqw0 tqw0Var;
        c380 c380Var;
        s220 s220Var;
        b320 b320VarN;
        fhs0 fhs0Var;
        Object next;
        Object[] objArr;
        ges0 ges0Var;
        c380 c380Var2;
        ecs0 ecs0Var = (ecs0) obj;
        t500 t500Var = (y600) obj2;
        Duration duration = ove0.a;
        str = null;
        String str = null;
        if (!(ecs0Var instanceof ccs0)) {
            if (ecs0Var instanceof bcs0) {
                if (t500Var instanceof t500) {
                    return fae1.E(ecs0Var, t500Var);
                }
                if (t500Var instanceof q500) {
                    return fae1.D(ecs0Var, (q500) t500Var);
                }
                if (t500Var instanceof f400) {
                    return fae1.z((bcs0) ecs0Var);
                }
                return t500Var instanceof h400 ? fae1.A(ecs0Var, (h400) t500Var) : fae1.r(ecs0Var, t500Var);
            }
            if (!(ecs0Var instanceof dcs0)) {
                eg.o();
                return null;
            }
            if (t500Var instanceof t500) {
                return fae1.E(ecs0Var, t500Var);
            }
            if (t500Var instanceof q500) {
                return fae1.D(ecs0Var, (q500) t500Var);
            }
            if (t500Var instanceof ayz) {
                return fae1.w((dcs0) ecs0Var, (ayz) t500Var);
            }
            if (t500Var instanceof xxz) {
                return fae1.v((dcs0) ecs0Var, (xxz) t500Var);
            }
            if (t500Var instanceof jvz) {
                return Next.a(Collections.singleton(dhw.a));
            }
            if (t500Var instanceof czz) {
                return fae1.x(ecs0Var);
            }
            if (t500Var instanceof h400) {
                return fae1.A(ecs0Var, (h400) t500Var);
            }
            if (t500Var instanceof ewz) {
                return Next.a(cwl1.j0(new rew(((dcs0) ecs0Var).a, null)));
            }
            return t500Var instanceof dwz ? Next.a(cwl1.j0(new rew(((dcs0) ecs0Var).q(), ((dwz) t500Var).a))) : fae1.r(ecs0Var, t500Var);
        }
        if (t500Var instanceof y300) {
            ccs0 ccs0Var = (ccs0) ecs0Var;
            tcs0 tcs0Var = ccs0Var.a;
            String str2 = tcs0Var.a;
            String str3 = tcs0Var.b;
            return Next.i(new dcs0(str2, str3, ccs0Var.Y, ccs0Var.N0, ccs0Var.Z, ccs0Var.e), Collections.singleton(new lbw(str2, str3)));
        }
        if (t500Var instanceof t500) {
            return fae1.E(ecs0Var, t500Var);
        }
        if (t500Var instanceof q500) {
            return fae1.D(ecs0Var, (q500) t500Var);
        }
        if (t500Var instanceof s300) {
            ccs0 ccs0Var2 = (ccs0) ecs0Var;
            s300 s300Var = (s300) t500Var;
            Next nextO = fae1.o(s300Var, s300Var.a, ccs0Var2.a.a);
            return nextO == null ? fae1.H(ccs0.a(ccs0Var2, null, null, null, null, null, null, true, false, false, false, null, null, null, null, null, null, null, null, null, 524223)) : nextO;
        }
        boolean zEquals5 = false;
        if (t500Var instanceof i000) {
            ccs0 ccs0Var3 = (ccs0) ecs0Var;
            i000 i000Var = (i000) t500Var;
            String str4 = i000Var.a;
            Next nextO2 = fae1.o(i000Var, str4, ccs0Var3.a.a);
            if (nextO2 != null) {
                return nextO2;
            }
            ccs0 ccs0VarA = ccs0.a(ccs0Var3, null, null, null, null, null, null, false, false, false, false, null, null, null, null, null, null, null, null, null, 524223);
            ogw ogwVarT = c921.t(ccs0VarA, 2);
            Throwable th = i000Var.b;
            return Next.i(ccs0VarA, dm61.B0(new niw[]{ogwVarT, th != null ? new fgw(str4, "ready-failed", th) : null}));
        }
        if (t500Var instanceof r200) {
            ccs0 ccs0Var4 = (ccs0) ecs0Var;
            r200 r200Var = (r200) t500Var;
            String str5 = r200Var.a;
            tcs0 tcs0Var2 = ccs0Var4.a;
            c380 c380Var3 = tcs0Var2.f;
            String str6 = tcs0Var2.a;
            Iterator it = c380Var3.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!u890.j(((xbs0) next).a, str5));
            xbs0 xbs0Var = (xbs0) next;
            if (xbs0Var != null && !xbs0Var.f) {
                return Next.a(f46.S0(new niw[]{new bhw(str6, str5), new hgw(str6)}));
            }
            ee30 ee30VarB = tcs0Var2.b(str5);
            if (ee30VarB != null && (c380Var2 = ee30VarB.e) != null && !c380Var2.isEmpty()) {
                Iterator it2 = c380Var2.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        objArr = false;
                        break;
                    }
                    if (((w220) it2.next()) instanceof t220) {
                        objArr = true;
                        break;
                    }
                }
            } else {
                objArr = false;
                break;
            }
            String str7 = (!objArr == true || (ges0Var = (ges0) ges0.b.i1()) == null) ? null : ges0Var.a;
            String str8 = r200Var.a;
            i3g1 i3g1Var = ccs0Var4.X;
            ss20 ss20Var = (ss20) ss20.b.i1();
            ccs0 ccs0VarQ = fae1.Q(ccs0.a(ccs0Var4, null, str8, ee30VarB, null, null, null, false, false, false, false, i3g1.a(i3g1Var, ss20Var != null ? ss20Var.a : null, null, 5), null, null, null, new t2c0(false, dqs0.e), null, null, objArr != false ? new hes0(str7, 7) : null, null, 375777), gje0.T0);
            xj61 xj61Var = new xj61();
            String str9 = ee30VarB != null ? ee30VarB.a : null;
            i3g1 i3g1Var2 = ccs0VarQ.X;
            String str10 = i3g1Var2.a;
            String str11 = i3g1Var2.b;
            Set setW0 = dm61.w0(new niw[]{new kgw(str10, str11, str5, !c921.v(ccs0VarQ).isEmpty())});
            if (str9 != null) {
                setW0.add(new lgw(str10, str11, str9));
            }
            xj61Var.addAll(setW0);
            if (str7 != null) {
                xj61Var.add(new wew(str6, str7));
            }
            return Next.i(ccs0VarQ, cwl1.j(xj61Var));
        }
        if (t500Var instanceof wyz) {
            wyz wyzVar = (wyz) t500Var;
            ccs0 ccs0VarL = fae1.L((ccs0) ecs0Var, wyzVar.a, wyzVar.b, (String) null);
            return ccs0VarL != null ? Next.h(ccs0VarL) : Next.j();
        }
        if (t500Var instanceof uyz) {
            ccs0 ccs0Var5 = (ccs0) ecs0Var;
            uyz uyzVar = (uyz) t500Var;
            String str12 = uyzVar.a;
            tqw0 tqw0Var2 = ccs0Var5.d;
            ihs0 ihs0Var = tqw0Var2 instanceof ihs0 ? (ihs0) tqw0Var2 : null;
            if (ihs0Var == null || (fhs0Var = ihs0Var.f) == null || (c380Var = fhs0Var.c) == null) {
                tqw0 tqw0VarG2 = ccs0Var5.g();
                if (tqw0VarG2 == null) {
                    c380Var = null;
                } else {
                    ee30 ee30Var = tqw0VarG2 instanceof ee30 ? (ee30) tqw0VarG2 : null;
                    if (ee30Var != null) {
                        c380Var = ee30Var.e;
                    } else {
                        c380Var = null;
                    }
                }
            }
            String str13 = uyzVar.b;
            if (c380Var == null) {
                s220Var = null;
                break;
            }
            Iterator it3 = c380Var.iterator();
            do {
                if (!it3.hasNext()) {
                    s220Var = null;
                    break;
                }
                w220 w220Var = (w220) it3.next();
                if (w220Var instanceof s220) {
                    s220Var = (s220) w220Var;
                    if (!u890.j(s220Var.a, str12) || str13.length() <= 0) {
                        s220Var = null;
                    }
                } else {
                    s220Var = null;
                }
            } while (s220Var == null);
            if (s220Var != null && (b320VarN = fae1.N(str13, s220Var.f)) != null) {
                str = b320VarN.a;
            }
            ccs0 ccs0VarL2 = fae1.L(ccs0Var5, str12, str13, str);
            return ccs0VarL2 != null ? Next.h(ccs0VarL2) : Next.j();
        }
        if (t500Var instanceof v400) {
            ccs0 ccs0Var6 = (ccs0) ecs0Var;
            v400 v400Var = (v400) t500Var;
            t2c0 t2c0Var = ccs0Var6.O0;
            LinkedHashMap linkedHashMap = new LinkedHashMap((Map) t2c0Var.b);
            linkedHashMap.put(v400Var.a, Boolean.valueOf(v400Var.b));
            return Next.h(ccs0.a(ccs0Var6, null, null, null, null, null, null, false, false, false, false, null, null, null, null, new t2c0(t2c0Var.a, mqo1.B(linkedHashMap)), null, null, null, null, 507903));
        }
        if (t500Var instanceof tyz) {
            ccs0 ccs0Var7 = (ccs0) ecs0Var;
            String str14 = ((tyz) t500Var).a;
            i3g1 i3g1Var3 = ccs0Var7.X;
            String str15 = i3g1Var3.a;
            String str16 = i3g1Var3.b;
            ee30 ee30VarB2 = ccs0Var7.b();
            return Next.a(Collections.singleton(new igw(str15, str16, ee30VarB2 != null ? ee30VarB2.a : null, c921.r(str14))));
        }
        if (t500Var instanceof c500) {
            ccs0 ccs0Var8 = (ccs0) ecs0Var;
            i3g1 i3g1Var4 = ccs0Var8.X;
            ol7 ol7Var = (ol7) ol7.b.i1();
            ccs0 ccs0VarA2 = ccs0.a(ccs0Var8, null, null, null, null, null, null, false, false, false, false, i3g1.a(i3g1Var4, null, ol7Var != null ? ol7Var.a : null, 3), null, null, null, null, null, null, null, null, 523247);
            String str17 = ccs0Var8.b;
            str17.getClass();
            i3g1 i3g1Var5 = ccs0VarA2.X;
            String str18 = i3g1Var5.a;
            String str19 = i3g1Var5.c;
            ee30 ee30VarB3 = ccs0VarA2.b();
            ngw ngwVar = new ngw(str18, str19, ee30VarB3 != null ? ee30VarB3.a : null, i3g1Var5.b, !c921.v(ccs0VarA2).isEmpty(), str17);
            Next nextH = fae1.H(ccs0VarA2);
            return Next.i(nextH.f(ccs0VarA2), dm61.x0(ngwVar, nextH.b()));
        }
        if (t500Var instanceof j500) {
            ccs0 ccs0Var9 = (ccs0) ecs0Var;
            String str20 = ccs0Var9.P0;
            String str21 = ((j500) t500Var).b;
            if (str20 != null) {
                nl7 nl7Var = v4t.b;
                zEquals5 = str20.equals(str21);
            }
            return (zEquals5 && ccs0Var9.d == null) ? fae1.H(ccs0.a(ccs0Var9, null, null, null, null, null, null, false, false, false, false, null, null, null, null, null, null, null, null, null, 491519)) : Next.j();
        }
        if (t500Var instanceof i500) {
            ccs0 ccs0Var10 = (ccs0) ecs0Var;
            String str22 = ccs0Var10.P0;
            String str23 = ((i500) t500Var).b;
            if (str22 != null) {
                nl7 nl7Var2 = v4t.b;
                zEquals5 = str22.equals(str23);
            }
            return (zEquals5 && (tqw0Var = ccs0Var10.d) != null && ((tqw0Var instanceof ths0) || (tqw0Var instanceof ihs0))) ? fae1.H(ccs0.a(ccs0Var10, null, null, null, null, null, null, false, false, false, false, null, null, null, null, null, null, null, null, null, 491519)) : Next.j();
        }
        if (t500Var instanceof j300) {
            ccs0 ccs0Var11 = (ccs0) ecs0Var;
            j300 j300Var = (j300) t500Var;
            String str24 = j300Var.a;
            String str25 = j300Var.d;
            tcs0 tcs0Var3 = ccs0Var11.a;
            ee30 ee30Var2 = ccs0Var11.c;
            Next nextO3 = fae1.o(j300Var, str24, tcs0Var3.a);
            if (nextO3 != null) {
                return nextO3;
            }
            String str26 = ccs0Var11.Q0;
            if (str26 == null) {
                zEquals4 = false;
            } else {
                nl7 nl7Var3 = bp21.b;
                zEquals4 = str26.equals(str25);
            }
            if (!zEquals4 && !u890.j(str25, "debug")) {
                Logger.k(gvg.h("Received PrepareCompleted for session id ", ucs0.a(str24), " with unexpected request id ", bp21.a(str25)), new Object[0]);
                return Next.j();
            }
            Next nextM = fae1.M(ccs0Var11, j300Var.b, str24, ee30Var2);
            Object objA = (ecs0) nextM.f(ccs0Var11);
            if (objA instanceof ccs0) {
                ccs0 ccs0Var12 = (ccs0) objA;
                int i = j300Var.c;
                ee30 ee30VarA = ee30Var2 != null ? ee30.a(ee30Var2, false, null, 23) : null;
                hes0 hes0Var = ccs0Var11.R0;
                objA = ccs0.a(ccs0Var12, null, null, ee30VarA, null, null, Integer.valueOf(i), false, false, false, false, null, null, null, null, null, null, null, hes0Var != null ? hes0.a(hes0Var, null, false, null, null, 12) : null, null, 327643);
            }
            return nextM.c() ? Next.i(objA, nextM.b()) : Next.h(objA);
        }
        if (t500Var instanceof n300) {
            ccs0 ccs0Var13 = (ccs0) ecs0Var;
            n300 n300Var = (n300) t500Var;
            String str27 = n300Var.a;
            String str28 = n300Var.c;
            Next nextO4 = fae1.o(n300Var, str27, ccs0Var13.a.a);
            if (nextO4 != null) {
                return nextO4;
            }
            String str29 = ccs0Var13.Q0;
            if (str29 == null) {
                zEquals3 = false;
            } else {
                nl7 nl7Var4 = bp21.b;
                zEquals3 = str29.equals(str28);
            }
            if (!zEquals3 && !u890.j(str28, "debug")) {
                Logger.k(gvg.h("Received ProceedCompleted for session id ", ucs0.a(str27), " with unexpected request id ", bp21.a(str28)), new Object[0]);
                return Next.j();
            }
            Next nextM2 = fae1.M(ccs0Var13, n300Var.b, str27, ccs0Var13.d);
            Object objA2 = (ecs0) nextM2.f(ccs0Var13);
            boolean z = objA2 instanceof ccs0;
            ccs0 ccs0Var14 = z ? (ccs0) objA2 : null;
            tqw0 tqw0Var3 = ccs0Var14 != null ? ccs0Var14.d : null;
            ee30 ee30Var3 = tqw0Var3 instanceof ee30 ? (ee30) tqw0Var3 : null;
            if (z && ee30Var3 != null) {
                ccs0 ccs0Var15 = (ccs0) objA2;
                ee30 ee30VarA2 = ee30.a(ee30Var3, false, null, 23);
                hes0 hes0Var2 = ccs0Var13.R0;
                objA2 = ccs0.a(ccs0Var15, null, null, null, ee30VarA2, null, null, false, false, false, false, null, null, null, null, null, null, null, hes0Var2 != null ? hes0.a(hes0Var2, null, false, null, null, 12) : null, null, 327671);
            } else if (z) {
                objA2 = ccs0.a((ccs0) objA2, null, null, null, null, null, null, false, false, false, false, null, null, null, null, null, null, null, null, null, 458751);
            }
            return nextM2.c() ? Next.i(objA2, nextM2.b()) : Next.h(objA2);
        }
        if (t500Var instanceof g500) {
            ccs0 ccs0Var16 = (ccs0) ecs0Var;
            g500 g500Var = (g500) t500Var;
            String str30 = g500Var.a;
            String str31 = g500Var.b;
            Next nextO5 = fae1.o(g500Var, str30, ccs0Var16.a.a);
            if (nextO5 != null) {
                return nextO5;
            }
            String str32 = ccs0Var16.Q0;
            if (str32 == null) {
                zEquals2 = false;
            } else {
                nl7 nl7Var5 = bp21.b;
                zEquals2 = str32.equals(str31);
            }
            if (zEquals2 || u890.j(str31, "debug")) {
                return fae1.q(ccs0Var16, g500Var.a, g500Var.c, 1, (String) null, 16);
            }
            Logger.k(gvg.h("Received SubmitFailed for session id ", ucs0.a(str30), " with unexpected request id ", bp21.a(str31)), new Object[0]);
            return Next.j();
        }
        if (t500Var instanceof lzz) {
            ccs0 ccs0Var17 = (ccs0) ecs0Var;
            lzz lzzVar = (lzz) t500Var;
            String str33 = lzzVar.a;
            Next nextO6 = fae1.o(lzzVar, str33, ccs0Var17.a.a);
            return nextO6 != null ? nextO6 : fae1.p(ccs0.a(ccs0Var17, null, null, null, null, null, null, false, false, false, false, null, null, null, null, null, null, null, null, null, 491007), str33, lzzVar.b, 3, lzzVar.c);
        }
        if (t500Var instanceof x300) {
            ccs0 ccs0Var18 = (ccs0) ecs0Var;
            x300 x300Var = (x300) t500Var;
            Next nextO7 = fae1.o(x300Var, x300Var.a, ccs0Var18.a.a);
            return nextO7 != null ? nextO7 : fae1.q(ccs0Var18, x300Var.a, x300Var.b, 4, (String) null, 16);
        }
        if (t500Var instanceof q200) {
            ccs0 ccs0Var19 = (ccs0) ecs0Var;
            q200 q200Var = (q200) t500Var;
            String str34 = ccs0Var19.b;
            if (str34 == null) {
                return Next.j();
            }
            String str35 = ccs0Var19.a.a;
            String str36 = q200Var.a;
            boolean z2 = q200Var.b;
            int i2 = q200Var.c;
            i3g1 i3g1Var6 = ccs0Var19.X;
            return Next.i(ccs0Var19, Collections.singleton(new mgw(i2, str35, str36, str34, i3g1Var6.a, i3g1Var6.b, i3g1Var6.c, z2)));
        }
        if (t500Var instanceof mzz) {
            ccs0 ccs0Var20 = (ccs0) ecs0Var;
            return (ccs0Var20.t && (tqw0VarG = ccs0Var20.g()) != null && ((tqw0VarG instanceof ths0) || (tqw0VarG instanceof ihs0))) ? fae1.H(ccs0.a(ccs0Var20, null, null, null, null, null, null, false, false, false, false, null, null, null, null, null, null, null, null, null, 523775)) : Next.j();
        }
        if (t500Var instanceof ewz) {
            ccs0 ccs0Var21 = (ccs0) ecs0Var;
            return fae1.q(ccs0Var21, ccs0Var21.a.a, (Throwable) null, 10, ccs0Var21.e, 4);
        }
        if (t500Var instanceof dwz) {
            ccs0 ccs0Var22 = (ccs0) ecs0Var;
            dwz dwzVar = (dwz) t500Var;
            ee30 ee30Var4 = ccs0Var22.c;
            return fae1.M(ccs0.a(ccs0Var22, null, null, ee30Var4 != null ? fae1.R(ee30.a(ee30Var4, false, null, 23)) : null, null, null, null, false, false, false, false, null, null, null, null, null, null, null, null, null, 327667), dwzVar.a, ccs0Var22.a.a, (tqw0) null);
        }
        if (t500Var instanceof d200) {
            ccs0 ccs0Var23 = (ccs0) ecs0Var;
            tqw0 tqw0VarG3 = ccs0Var23.g();
            tcs0 tcs0Var4 = ccs0Var23.a;
            if (tqw0VarG3 instanceof ihs0) {
                ihs0 ihs0Var2 = (ihs0) tqw0VarG3;
                if (ihs0Var2.e != null) {
                    return Next.i(ccs0.a(ccs0Var23, null, null, null, ihs0.a(ihs0Var2, null, 127), null, null, false, false, false, false, null, null, null, null, null, null, null, null, null, 524279), Collections.singleton(new caw(tcs0Var4.a)));
                }
            }
            return Next.a(Collections.singleton(new caw(tcs0Var4.a)));
        }
        if (t500Var instanceof c400) {
            ccs0 ccs0Var24 = (ccs0) ecs0Var;
            tcs0 tcs0Var5 = ccs0Var24.a;
            String str37 = ccs0Var24.b;
            str37.getClass();
            return Next.h(ccs0.a(ccs0Var24, null, null, tcs0Var5.b(str37), null, null, null, false, false, false, false, null, null, null, null, null, null, null, null, null, 294883));
        }
        if (t500Var instanceof fyz) {
            ccs0 ccs0Var25 = (ccs0) ecs0Var;
            tqw0 tqw0Var4 = ccs0Var25.d;
            tcs0 tcs0Var6 = ccs0Var25.a;
            if (!(tqw0Var4 instanceof ihs0) || ((ihs0) tqw0Var4).e == null) {
                return Next.j();
            }
            String str38 = ccs0Var25.b;
            str38.getClass();
            return Next.h(ccs0.a(ccs0Var25, null, null, tcs0Var6.b(str38), null, tcs0Var6.c.a, null, false, false, false, false, null, null, null, null, null, null, null, null, null, 458723));
        }
        if (t500Var instanceof h400) {
            return fae1.A(ecs0Var, (h400) t500Var);
        }
        if (t500Var instanceof b300) {
            ccs0 ccs0Var26 = (ccs0) ecs0Var;
            b300 b300Var = (b300) t500Var;
            Next nextO8 = fae1.o(b300Var, b300Var.a, ccs0Var26.a.a);
            if (nextO8 != null) {
                return nextO8;
            }
            hes0 hes0Var3 = ccs0Var26.R0;
            return (hes0Var3 == null || !hes0Var3.b) ? Next.j() : fae1.H(ccs0.a(ccs0Var26, null, null, null, null, null, null, false, false, false, false, null, null, null, null, null, null, null, hes0.a(hes0Var3, new kes0(b300Var.b, b300Var.c), false, null, null, 10), null, 393215));
        }
        if (t500Var instanceof a300) {
            ccs0 ccs0Var27 = (ccs0) ecs0Var;
            tcs0 tcs0Var7 = ccs0Var27.a;
            a300 a300Var = (a300) t500Var;
            Next nextO9 = fae1.o(a300Var, a300Var.a, tcs0Var7.a);
            if (nextO9 != null) {
                return nextO9;
            }
            hes0 hes0Var4 = ccs0Var27.R0;
            hes0 hes0VarA = hes0Var4 != null ? hes0.a(hes0Var4, null, false, null, null, 8) : null;
            String str39 = tcs0Var7.c.a;
            ee30 ee30Var5 = ccs0Var27.c;
            ccs0 ccs0VarA3 = ccs0.a(ccs0Var27, null, null, ee30Var5 != null ? ee30.a(ee30Var5, false, null, 23) : null, null, str39, null, false, false, false, false, null, null, null, null, null, null, null, hes0VarA, null, 393195);
            return Next.i(ccs0VarA3, Collections.singleton(c921.t(ccs0VarA3, 9)));
        }
        if (t500Var instanceof w200) {
            ccs0 ccs0Var28 = (ccs0) ecs0Var;
            w200 w200Var = (w200) t500Var;
            hes0 hes0Var5 = ccs0Var28.R0;
            return Next.i(ccs0.a(ccs0Var28, null, null, null, null, null, null, false, false, false, false, null, null, null, null, null, null, null, hes0Var5 != null ? hes0.a(hes0Var5, null, false, null, null, 9) : null, null, 393215), Collections.singleton(c921.s(ccs0Var28, w200Var.a, w200Var.b)));
        }
        if (t500Var instanceof u200) {
            ccs0 ccs0Var29 = (ccs0) ecs0Var;
            u200 u200Var = (u200) t500Var;
            Next nextO10 = fae1.o(u200Var, u200Var.a, ccs0Var29.a.a);
            if (nextO10 != null) {
                return nextO10;
            }
            hes0 hes0Var6 = ccs0Var29.R0;
            return (hes0Var6 != null ? hes0Var6.d : null) == null ? Next.j() : Next.h(fae1.Q(ccs0.a(ccs0Var29, null, null, null, null, null, null, false, false, false, false, null, null, null, null, null, null, null, hes0.a(hes0Var6, null, false, null, null, 7), null, 393215), new xy50(u200Var, (byte) 10)));
        }
        if (t500Var instanceof t200) {
            ccs0 ccs0Var30 = (ccs0) ecs0Var;
            t200 t200Var = (t200) t500Var;
            Next nextO11 = fae1.o(t200Var, t200Var.a, ccs0Var30.a.a);
            if (nextO11 != null) {
                return nextO11;
            }
            hes0 hes0Var7 = ccs0Var30.R0;
            return (hes0Var7 != null ? hes0Var7.d : null) == null ? Next.j() : Next.h(fae1.Q(ccs0.a(ccs0Var30, null, null, null, null, null, null, false, false, false, false, null, null, null, null, null, null, null, hes0.a(hes0Var7, null, false, null, null, 7), null, 393215), gje0.U0));
        }
        if (t500Var instanceof v200) {
            return Next.h(fae1.Q((ccs0) ecs0Var, new l6d0((v200) t500Var, (byte) 25)));
        }
        if (t500Var instanceof x200) {
            ccs0 ccs0Var31 = (ccs0) ecs0Var;
            x200 x200Var = (x200) t500Var;
            Next nextO12 = fae1.o(x200Var, x200Var.a, ccs0Var31.a.a);
            if (nextO12 != null) {
                return nextO12;
            }
            hes0 hes0Var8 = ccs0Var31.R0;
            String str40 = hes0Var8 != null ? hes0Var8.d : null;
            String str41 = x200Var.b;
            if (str40 != null) {
                nl7 nl7Var6 = ges0.b;
                zEquals5 = str40.equals(str41);
            }
            return !zEquals5 ? Next.j() : Next.h(fae1.Q(ccs0.a(ccs0Var31, null, null, null, null, null, null, false, false, false, false, null, null, null, null, null, null, null, hes0.a(ccs0Var31.R0, null, false, null, null, 7), null, 393215), gje0.V0));
        }
        if (t500Var instanceof y200) {
            ccs0 ccs0Var32 = (ccs0) ecs0Var;
            y200 y200Var = (y200) t500Var;
            String str42 = y200Var.a;
            tcs0 tcs0Var8 = ccs0Var32.a;
            Next nextO13 = fae1.o(y200Var, str42, tcs0Var8.a);
            if (nextO13 != null) {
                return nextO13;
            }
            String str43 = ((ges0) ges0.b.i1()).a;
            hes0 hes0Var9 = ccs0Var32.R0;
            ccs0 ccs0VarQ2 = fae1.Q(ccs0.a(ccs0Var32, null, null, null, null, null, null, false, false, false, false, null, null, null, null, null, null, null, hes0Var9 != null ? hes0.a(hes0Var9, null, false, null, str43, 7) : null, null, 393215), gje0.W0);
            String str44 = tcs0Var8.a;
            return Next.i(ccs0VarQ2, f46.S0(new niw[]{new vhw(str44), new wew(str44, str43)}));
        }
        if (!(t500Var instanceof z200)) {
            return t500Var instanceof p200 ? fae1.y((ccs0) ecs0Var) : fae1.r(ecs0Var, t500Var);
        }
        ccs0 ccs0Var33 = (ccs0) ecs0Var;
        z200 z200Var = (z200) t500Var;
        String str45 = z200Var.a;
        tcs0 tcs0Var9 = ccs0Var33.a;
        Next nextO14 = fae1.o(z200Var, str45, tcs0Var9.a);
        if (nextO14 != null) {
            return nextO14;
        }
        hes0 hes0Var10 = ccs0Var33.R0;
        String str46 = hes0Var10 != null ? hes0Var10.c : null;
        String str47 = z200Var.b;
        if (str46 == null) {
            zEquals = false;
        } else {
            nl7 nl7Var7 = jes0.b;
            zEquals = str46.equals(str47);
        }
        if (!zEquals) {
            return Next.j();
        }
        hes0 hes0VarA2 = hes0.a(ccs0Var33.R0, null, false, null, null, 8);
        String str48 = tcs0Var9.c.a;
        ee30 ee30Var6 = ccs0Var33.c;
        ccs0 ccs0VarA4 = ccs0.a(ccs0Var33, null, null, ee30Var6 != null ? ee30.a(ee30Var6, false, null, 23) : null, null, str48, null, false, false, false, false, null, null, null, null, null, null, null, hes0VarA2, null, 393195);
        return Next.i(ccs0VarA4, Collections.singleton(c921.t(ccs0VarA4, 9)));
    }
}
