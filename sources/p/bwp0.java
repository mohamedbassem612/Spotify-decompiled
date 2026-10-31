package p;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.spotify.mobius.EventSource;
import com.spotify.mobius.Next;
import com.spotify.mobius.rx3.RxEventSources;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.subjects.BehaviorSubject;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public abstract class bwp0 {
    public static final jm a = new jm("REMOVED_TASK", (byte) 5);
    public static final jm b = new jm("CLOSED_EMPTY", (byte) 5);
    public static b180 c;

    public static final void a(b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(812480011);
        if (x340Var.Y(i & 1, (i & 3) != 2)) {
            cb80 cb80VarG = t5p1.g(t5p1.r("doubleLabelAnimation", x340Var, 0), 0.0f, 1.0f, irn1.Y(irn1.o0(1200, 0, mlv.d, 2), 1, 0L, 4), "doubleLabelAnimation", x340Var, 29112, 0);
            gfx.b(18, apo.r(-1614731594, new cru(g(((Number) cb80VarG.d.getValue()).floatValue(), 0.0f), g(((Number) cb80VarG.d.getValue()).floatValue(), 0.2f), (byte) 1), x340Var), x340Var, 54);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new sqk((byte) 29, i, false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v7 */
    public static final void b(h951 h951Var, Function0 function0, qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        cr31 cr31VarB;
        pl3 pl3Var;
        vu30 vu30Var;
        llj lljVar;
        vu30 vu30Var2;
        qim0 qim0Var3;
        ?? r0;
        boolean z;
        Function0 function1;
        qim0 qim0Var4;
        boolean z2;
        String str = h951Var.e;
        String str2 = h951Var.f;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-182676897);
        j06 j06Var = x340Var.a;
        int i2 = i | (x340Var.i(h951Var) ? 4 : 2) | (x340Var.i(function0) ? 32 : 16) | 384;
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            if (du3.a[l1d.C(h951Var.a)] == 1) {
                x340Var.i0(541166570);
                x340Var.r(false);
                cr31VarB = er31.a;
            } else {
                x340Var.i0(541167447);
                uwr uwrVar = cbx.a;
                cua cuaVar = cbx.b(x340Var).f;
                cr31VarB = er31.b(4.0f);
                x340Var.r(false);
            }
            qim0 qim0Var5 = nim0.a;
            cr31 cr31Var = cr31VarB;
            x340 x340Var2 = x340Var;
            qim0 qim0VarY = uyn1.y(bin.x(py20.a(anm1.N("allboarding_search_result_row", u291.f(qim0Var5, 1.0f)), 0L, (cr31) null, x340Var2, 0, 15), false, (String) null, (pm31) null, (idn0) null, function0, 15), 16.0f, 8.0f);
            pl3 pl3Var2 = een.N0;
            gex0 gex0Var = h36.a;
            jw31 jw31VarA = ew31.a(gex0Var, pl3Var2, x340Var2, 0);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0VarY);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var2.m0();
            boolean z3 = x340Var2.S;
            Function0 function2 = hmb0.t1;
            if (z3) {
                x340Var2.l(function2);
            } else {
                x340Var2.v0();
            }
            llj lljVar2 = y580.O0;
            nko1.H(jw31VarA, x340Var2, lljVar2);
            vu30 vu30Var3 = y580.N0;
            nko1.H(xos0VarM, x340Var2, vu30Var3);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var2, lljVar3);
            nko1.F(x340Var2);
            vu30 vu30Var4 = y580.Y;
            nko1.H(qim0VarE, x340Var2, vu30Var4);
            if (str2.length() > 0) {
                x340Var2.i0(715148703);
                pl3Var = pl3Var2;
                vu30Var = vu30Var3;
                lljVar = lljVar3;
                vu30Var2 = vu30Var4;
                qim0Var3 = qim0Var5;
                r0 = 0;
                z = true;
                eso1.e(Uri.parse(str2), isl.a, i1p1.q(u291.r(qim0Var5, 48.0f), cr31Var), new p3v(48.0f), (zvx) null, (ecx) null, (j6m) null, (tl3) null, (ColorFilter) null, (qux) null, false, false, x340Var2, 221232, 0, 4032);
                x340Var2 = x340Var2;
                x340Var2.r(false);
            } else {
                pl3Var = pl3Var2;
                vu30Var = vu30Var3;
                lljVar = lljVar3;
                vu30Var2 = vu30Var4;
                qim0Var3 = qim0Var5;
                r0 = 0;
                z = true;
                x340Var2.i0(715418806);
                qim0 qim0VarQ = i1p1.q(u291.r(qim0Var3, 48.0f), cr31Var);
                uwr uwrVar2 = cbx.a;
                t1c.a(dug.f(qim0VarQ, cbx.a(x340Var2).a.b.a(), d4o1.a), x340Var2, 0);
                x340Var2.r(false);
            }
            wnb0 wnb0VarK = c13.k(qim0Var3, 12.0f, x340Var2, 1.0f, z);
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var2, (int) r0);
            int iHashCode2 = Long.hashCode(x340Var2.T);
            xos0 xos0VarM2 = x340Var2.m();
            qim0 qim0VarE2 = zr7.E(x340Var2, wnb0VarK);
            x340Var2.m0();
            if (x340Var2.S) {
                function1 = function2;
                x340Var2.l(function1);
            } else {
                function1 = 
                /*  JADX ERROR: Method code generation error
                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x01bd: MOVE (r8v6 'function1' kotlin.jvm.functions.Function0) = (r38v2 kotlin.jvm.functions.Function0) (LINE:446) in method: p.bwp0.b(p.h951, kotlin.jvm.functions.Function0, p.qim0, p.b0k, int):void, file: /workspace/spotify-analysis/dex-input/classes9.dex
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                    	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:140)
                    	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                    	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:270)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r38v2 kotlin.jvm.functions.Function0
                    	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                    */
                /*
                    Method dump skipped, instruction units count: 784
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: p.bwp0.b(p.h951, kotlin.jvm.functions.Function0, p.qim0, p.b0k, int):void");
            }

            public static final void c(int i, String str, b0k b0kVar, qim0 qim0Var) {
                x340 x340Var = (x340) b0kVar;
                x340Var.k0(-2023019930);
                int i2 = (x340Var.g(str) ? 4 : 2) | i | 48;
                if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
                    qim0 qim0Var2 = nim0.a;
                    qim0 qim0VarN = anm1.N("song_dna_search_results_announcement", u291.r(qim0Var2, 1.0f));
                    boolean z = (i2 & 14) == 4;
                    Object objT = x340Var.T();
                    if (z || objT == fkj0.X) {
                        objT = new pg61(str, (byte) 29);
                        x340Var.s0(objT);
                    }
                    t1c.a(s161.b(qim0VarN, false, (iu30) objT), x340Var, 0);
                    qim0Var = qim0Var2;
                } else {
                    x340Var.b0();
                }
                h311 h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new uo50(str, qim0Var, i, (byte) 22);
                }
            }

            public static final void d(String str, boolean z, iu30 iu30Var, esf1 esf1Var, b0k b0kVar, int i) {
                boolean z2;
                Object obj = fkj0.X;
                x340 x340Var = (x340) b0kVar;
                x340Var.k0(1959229670);
                int i2 = i | (x340Var.g(str) ? 4 : 2) | (x340Var.h(z) ? 32 : 16) | (x340Var.i(iu30Var) ? 256 : 128) | (x340Var.i(esf1Var) ? 2048 : 1024);
                if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
                    Context context = (Context) x340Var.k(AndroidCompositionLocals_androidKt.b);
                    if (z) {
                        esf1Var.invoke();
                    }
                    uwr uwrVar = cbx.a;
                    cvx cvxVar = cbx.b(x340Var).b;
                    cvx cvxVar2 = cbx.b(x340Var).b;
                    qim0 qim0VarY = uyn1.y(nim0.a, 16.0f, 16.0f);
                    lee1 lee1Var = cbx.d(x340Var).g;
                    int i3 = i2 & 14;
                    boolean z3 = i3 == 4;
                    Object objT = x340Var.T();
                    if (z3 || objT == obj) {
                        objT = Boolean.valueOf(adg.a.a.matcher(str).find());
                        x340Var.s0(objT);
                    }
                    if (((Boolean) objT).booleanValue()) {
                        x340Var.i0(-1193806264);
                        ceo ceoVar = mlv.a;
                        long j = cbx.a(x340Var).b.a;
                        boolean zI = ((i2 & 896) == 256) | x340Var.i(context);
                        Object objT2 = x340Var.T();
                        if (zI || objT2 == obj) {
                            objT2 = new nyd1(context, iu30Var);
                            x340Var.s0(objT2);
                        }
                        wqn1.b(str, qim0VarY, z, lee1Var, j, ceoVar, (iu30) objT2, 0, 0, (List) null, x340Var, ((i2 << 3) & 896) | i3);
                        x340Var = x340Var;
                        x340Var.r(false);
                    } else {
                        x340Var.i0(-1193429366);
                        if (z) {
                            x340Var.i0(-1193400691);
                            t0c.a(str, qim0VarY, 2, mlv.a, 0L, 0, 0, (List) null, lee1Var, x340Var, i3 | 384);
                            z2 = false;
                            x340Var.r(false);
                        } else {
                            x340Var.i0(-1193218070);
                            uwo1.e(str, qim0VarY, lee1Var, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, i3, 0, 2040);
                            x340Var = x340Var;
                            z2 = false;
                            x340Var.r(false);
                        }
                        x340Var.r(z2);
                    }
                } else {
                    x340Var.b0();
                }
                h311 h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new zp51(str, z, iu30Var, esf1Var, i, (byte) 8);
                }
            }

            public static final int e(String str) {
                int i = 0;
                for (int i2 : l1d.H(4)) {
                    if (z5c.d(i2).equalsIgnoreCase(str)) {
                        i = i2;
                        break;
                    }
                }
                if (i == 0) {
                    return 1;
                }
                return i;
            }

            public static final void f(d3e1 d3e1Var, Context context, boolean z, CharSequence charSequence, long j) {
                if (nbe1.d(j) || charSequence.length() == 0) {
                    return;
                }
                PackageManager packageManager = context.getPackageManager();
                List list = (List) p2o1.a.invoke(context);
                if (list.isEmpty()) {
                    return;
                }
                d3e1Var.a();
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    ResolveInfo resolveInfo = (ResolveInfo) list.get(i);
                    d3e1Var.a.b(new m3e1(new csw0(i), resolveInfo.loadLabel(packageManager).toString(), 0, new dsw0(context, resolveInfo, z, charSequence, j)));
                }
                d3e1Var.a();
            }

            public static final float g(float f, float f2) {
                float f3 = f2 + 0.6f;
                if (f < f2 || f > f3) {
                    return 0.1f;
                }
                return (((float) Math.sin(((double) ((f - f2) / 0.6f)) * 3.141592653589793d)) * 0.9f) + 0.1f;
            }

            public static final t8r0 h(laa laaVar, Object obj, ipb1 ipb1Var, iu30 iu30Var) {
                rl1 rl1Var = new rl1(laaVar.getBehavior(), obj, ipb1Var, iu30Var);
                t8r0 t8r0Var = new t8r0();
                t8r0Var.a = laaVar;
                t8r0Var.b = rl1Var;
                return t8r0Var;
            }

            public static final long i(long j) {
                if (j <= 0) {
                    return 0L;
                }
                if (j >= 9223372036854L) {
                    return Long.MAX_VALUE;
                }
                return j * 1000000;
            }

            public static final int j(rpu rpuVar) {
                int iOrdinal = rpuVar.ordinal();
                if (iOrdinal == 0) {
                    return 1;
                }
                if (iOrdinal == 1) {
                    return 2;
                }
                eg.o();
                return 0;
            }

            public static hrr0 k() {
                return drl1.a;
            }

            public static final boolean l(xvp0 xvp0Var) {
                return xvp0Var.e == 1 && xvp0Var.l && xvp0Var.m && !xvp0Var.j;
            }

            public static final boolean m(xvp0 xvp0Var) {
                if (xvp0Var.e == 1) {
                    if (o0c.j(xvp0Var.a, xvp0Var.i, xvp0Var.j || o0c.F(xvp0Var.f, xvp0Var.g, xvp0Var.h))) {
                        return true;
                    }
                }
                return false;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static final EventSource n(Observable observable, sor sorVar, lk lkVar, ezt eztVar) {
                BehaviorSubject behaviorSubject = sorVar.e;
                Observable map = behaviorSubject.distinctUntilChanged().map(mif1.O0);
                lt20 lt20Var = new lt20(rqt0.u(new nwd(lkVar.c(), (byte) 22)), new jk(3, (lnm) null, (byte) 15), (byte) 0);
                o6x o6xVar = o6x.a;
                return RxEventSources.a(new ObservableSource[]{observable, map, yoi1.i(lt20Var, o6xVar), yoi1.i(new lt20(rqt0.u(new x010(ezt.g(eztVar, "connect_aggregator"), yoi1.g(behaviorSubject), new l2(3, (lnm) null, (byte) 27), (byte) 1)), new jk(3, (lnm) null, (byte) 16), (byte) 0), o6xVar)});
            }

            public static final Next o(ojf0 ojf0Var, fjf0 fjf0Var) {
                Object obj;
                String str;
                Object next;
                boolean z = ojf0Var.R0;
                dn21 dn21Var = ojf0Var.S0;
                Object obj2 = ojf0Var.O0;
                sr3 sr3Var = ojf0Var.T0;
                if (fjf0Var.equals(bjf0.a) || fjf0Var.equals(zif0.a) || fjf0Var.equals(djf0.a) || fjf0Var.equals(cjf0.a)) {
                    return Next.j();
                }
                boolean zEquals = fjf0Var.equals(ajf0.a);
                yhf0 yhf0Var = vhf0.a;
                ifm0 ifm0Var = ifm0.a;
                if (zEquals) {
                    if (sr3Var instanceof qr3) {
                        return Next.h(ojf0.a(ojf0Var, null, null, null, null, false, null, null, null, null, false, null, false, null, null, 524287));
                    }
                    if ((obj2 instanceof jfm0) && dn21Var != null) {
                        return Next.i(ojf0.a(ojf0Var, null, null, null, null, false, null, null, null, null, false, ifm0Var, false, null, null, 770047), Collections.singleton(yhf0Var));
                    }
                    n57.e("Reporting correction event invoked without a pending correction");
                    return Next.j();
                }
                if (!(fjf0Var instanceof ejf0)) {
                    eg.o();
                    return null;
                }
                wm21 wm21Var = ((ejf0) fjf0Var).a;
                if (!(wm21Var instanceof vm21)) {
                    if (!(wm21Var instanceof um21)) {
                        eg.o();
                        return null;
                    }
                    qr3 qr3Var = sr3Var instanceof qr3 ? (qr3) sr3Var : null;
                    if (qr3Var == null) {
                        n57.e("Reporting correction event invoked without a pending correction");
                        return Next.j();
                    }
                    String str2 = ((um21) wm21Var).a;
                    qr3 qr3Var2 = qr3Var;
                    return Next.i(ojf0.a(ojf0Var, null, null, null, null, false, null, null, null, null, false, null, false, null, new rr3(str2), 524287), f46.S0(new yhf0[]{new uhf0("ALL_INCORRECT_LYRICS", qr3Var2.a, qr3Var2.b, qr3Var2.c, new udi1(str2)), new ohf0(z)}));
                }
                jfm0 jfm0Var = obj2 instanceof jfm0 ? (jfm0) obj2 : null;
                if (jfm0Var != null) {
                    xm21 xm21Var = jfm0Var.b;
                    if (dn21Var != null) {
                        List list = dn21Var.a;
                        List list2 = dn21Var.b;
                        xpf0 xpf0Var = ojf0Var.c;
                        vpf0 vpf0Var = xpf0Var instanceof vpf0 ? (vpf0) xpf0Var : null;
                        if (vpf0Var == null) {
                            n57.e("Lyrics must be loaded before submitting reporting corrections");
                            return Next.j();
                        }
                        a9h a9hVar = vpf0Var.a;
                        int iOrdinal = xm21Var.ordinal();
                        if (iOrdinal == 0) {
                            obj = list;
                        } else {
                            if (iOrdinal != 1) {
                                eg.o();
                                return null;
                            }
                            aog1 aog1Var = ojf0Var.h;
                            xng1 xng1Var = aog1Var instanceof xng1 ? (xng1) aog1Var : null;
                            String str3 = xng1Var != null ? xng1Var.a : null;
                            Iterator it = a9hVar.a.c.iterator();
                            do {
                                if (!it.hasNext()) {
                                    next = null;
                                    break;
                                }
                                next = it.next();
                            } while (!nhc1.S(((def0) next).a, str3, true));
                            def0 def0Var = (def0) next;
                            if (def0Var == null) {
                                n57.e("Selected translation must be loaded before reporting it");
                                return Next.j();
                            }
                            ArrayList arrayList = new ArrayList();
                            Iterator it2 = list2.iterator();
                            while (it2.hasNext()) {
                                String str4 = (String) o7h.t0(((Number) it2.next()).intValue(), def0Var.b);
                                if (str4 != null) {
                                    arrayList.add(str4);
                                }
                            }
                            int size = arrayList.size();
                            obj = arrayList;
                            if (size != list2.size()) {
                                n57.e("Selected translation lines must be loaded before reporting them");
                                return Next.j();
                            }
                        }
                        Iterable iterable = (Iterable) obj;
                        ArrayList arrayList2 = ((vm21) wm21Var).a;
                        Iterator it3 = iterable.iterator();
                        Iterator it4 = arrayList2.iterator();
                        ArrayList arrayList3 = new ArrayList(Math.min(q7h.U(iterable, 10), q7h.U(arrayList2, 10)));
                        while (it3.hasNext() && it4.hasNext()) {
                            Object next2 = it3.next();
                            String str5 = (String) it4.next();
                            String str6 = (String) next2;
                            if (str5.length() == 0) {
                                str5 = null;
                            }
                            arrayList3.add(new ydi1(str6, str5));
                        }
                        ojf0 ojf0VarA = ojf0.a(ojf0Var, null, null, null, null, false, null, null, null, null, false, ifm0Var, false, new dn21(list, list2, dn21Var.c, dn21Var.d, arrayList2), null, 770047);
                        int iOrdinal2 = xm21Var.ordinal();
                        if (iOrdinal2 == 0) {
                            str = "SOME_INCORRECT_LYRICS";
                        } else {
                            if (iOrdinal2 != 1) {
                                eg.o();
                                return null;
                            }
                            str = "SOME_INCORRECT_TRANSLATIONS_LYRICS";
                        }
                        String str7 = ojf0Var.a.d;
                        bef0 bef0Var = a9hVar.a.f;
                        return Next.i(ojf0VarA, f46.S0(new yhf0[]{new uhf0(str, str7, bef0Var.c, bef0Var.a, new wdi1(arrayList3)), new ohf0(z), yhf0Var}));
                    }
                }
                n57.e("Reporting correction event invoked without a pending correction");
                return Next.j();
            }

            public static final ArrayList p(List list) {
                List<ea20> list2 = list;
                ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
                for (ea20 ea20Var : list2) {
                    arrayList.add(new s520(ea20Var.a, ea20Var.b));
                }
                return arrayList;
            }

            public static final cw90 q(String str, ArrayList arrayList, boolean z) {
                if (arrayList.isEmpty()) {
                    arrayList = null;
                }
                if (arrayList != null) {
                    return new cw90(arrayList.size(), s(str, arrayList, z));
                }
                return null;
            }

            /* JADX WARN: Code duplicated, block: B:18:0x0055 A[DONT_INVERT] */
            /* JADX WARN: Code duplicated, block: B:19:0x0057 A[DONT_INVERT] */
            /* JADX WARN: Code duplicated, block: B:21:0x005a  */
            /* JADX WARN: Code duplicated, block: B:24:0x0074  */
            /* JADX WARN: Code duplicated, block: B:25:0x007e  */
            /* JADX WARN: Code duplicated, block: B:27:0x0084 A[DONT_INVERT] */
            /* JADX WARN: Code duplicated, block: B:29:0x0087  */
            /* JADX WARN: Code duplicated, block: B:34:0x00ae  */
            /* JADX WARN: Code duplicated, block: B:36:0x00b2  */
            /* JADX WARN: Code duplicated, block: B:37:0x00b4  */
            /* JADX WARN: Code duplicated, block: B:40:0x00c9  */
            public static final lsm0 r(yo60 yo60Var, String str, String str2, boolean z, hwt hwtVar, boolean z2, nrl nrlVar) {
                boolean zG;
                boolean zEquals;
                TimeUnit timeUnit;
                jsm0 jsm0Var;
                myp0 myp0Var = yo60Var.d;
                String str3 = yo60Var.a;
                String str4 = yo60Var.b;
                q8i0 q8i0VarA = kno1.A(yo60Var, hwtVar);
                Set set = s4b1.f;
                blc0 blc0Var = blc0.ed;
                boolean zG2 = uic.g(str, blc0Var);
                l8i0 l8i0Var = l8i0.a;
                int i = 1;
                boolean z3 = q8i0VarA.equals(l8i0Var) && zG2;
                boolean zEquals2 = q8i0VarA.equals(l8i0Var);
                m8i0 m8i0Var = m8i0.a;
                if (zEquals2) {
                    if (zG2 && str4 != null) {
                    }
                    zG = uic.g(str, blc0Var);
                    zEquals = q8i0VarA.equals(l8i0Var);
                    timeUnit = TimeUnit.SECONDS;
                    if (zEquals) {
                        if (zG) {
                            jsm0Var = new jsm0(Long.valueOf(z ? 0L : timeUnit.toMillis(myp0Var.a.p())), j1p1.q(yo60Var, z));
                        } else {
                            jsm0Var = new jsm0(0L, null);
                        }
                    } else {
                        if (q8i0VarA.equals(m8i0Var)) {
                            eg.o();
                            return null;
                        }
                        jsm0Var = new jsm0(Long.valueOf(z ? 0L : timeUnit.toMillis(myp0Var.a.p())), j1p1.q(yo60Var, z));
                    }
                    jsm0 jsm0Var2 = jsm0Var;
                    ksm0 ksm0VarF = fap1.f(str, str2, yo60Var.h, z);
                    if (!(nrlVar instanceof irl)) {
                        if (nrlVar instanceof jrl) {
                            i = 2;
                        } else {
                            i = 3;
                        }
                    }
                    return new lsm0(str3, ksm0VarF, z2, false, jsm0Var2, 0L, (ism0) null, "", z3, i, 1096);
                }
                if (!q8i0VarA.equals(m8i0Var)) {
                    eg.o();
                    return null;
                }
                str4.getClass();
                str3 = str4;
                zG = uic.g(str, blc0Var);
                zEquals = q8i0VarA.equals(l8i0Var);
                timeUnit = TimeUnit.SECONDS;
                if (zEquals) {
                    if (zG) {
                        jsm0Var = new jsm0(Long.valueOf(z ? 0L : timeUnit.toMillis(myp0Var.a.p())), j1p1.q(yo60Var, z));
                    } else {
                        jsm0Var = new jsm0(0L, null);
                    }
                } else {
                    if (q8i0VarA.equals(m8i0Var)) {
                        eg.o();
                        return null;
                    }
                    jsm0Var = new jsm0(Long.valueOf(z ? 0L : timeUnit.toMillis(myp0Var.a.p())), j1p1.q(yo60Var, z));
                }
                jsm0 jsm0Var3 = jsm0Var;
                ksm0 ksm0VarF2 = fap1.f(str, str2, yo60Var.h, z);
                if (!(nrlVar instanceof irl)) {
                    if (nrlVar instanceof jrl) {
                        i = 2;
                    } else {
                        i = 3;
                    }
                }
                return new lsm0(str3, ksm0VarF2, z2, false, jsm0Var3, 0L, (ism0) null, "", z3, i, 1096);
            }

            public static final smc0 s(String str, List list, boolean z) {
                ArrayList arrayList = new ArrayList();
                ArrayList<hp90> arrayList2 = new ArrayList();
                for (Object obj : list) {
                    if (((hp90) obj).g) {
                        arrayList.add(obj);
                    } else {
                        arrayList2.add(obj);
                    }
                }
                smc0 smc0VarN = k4p1.n();
                for (hp90 hp90Var : arrayList2) {
                    boolean zJ = u890.j(hp90Var.c, str);
                    smc0VarN.add(new ew90(hp90Var.a, hp90Var.d, hp90Var.b, hp90Var.e, zJ, hp90Var.f, l1d.m("spotify:user:", hp90Var.c), z && !zJ));
                }
                if (!arrayList.isEmpty()) {
                    smc0VarN.add(new dw90(arrayList.size()));
                }
                return k4p1.k(smc0VarN);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static final lw90 t(pp90 pp90Var, ap90 ap90Var) {
                String str;
                ArrayList arrayList = pp90Var.c;
                hp90 hp90Var = pp90Var.h.b;
                Object yv90Var = null;
                if (hp90Var.e) {
                    String str2 = hp90Var.c;
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj : arrayList) {
                        if (!((hp90) obj).f) {
                            arrayList2.add(obj);
                        }
                    }
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj2 : arrayList) {
                        if (((hp90) obj2).f) {
                            arrayList3.add(obj2);
                        }
                    }
                    pw90 pw90Var = new pw90();
                    gw90 gw90Var = new gw90(arrayList2.size(), s(str2, arrayList2, true));
                    cw90 cw90VarQ = q(str2, arrayList3, true);
                    to90 to90Var = ap90Var.c;
                    if (to90Var != null) {
                        so90 so90Var = to90Var.d;
                        str = so90Var != null ? so90Var.b : to90Var.b;
                    } else {
                        str = null;
                    }
                    if (str == null) {
                        str = "";
                    }
                    if (str.length() == 0) {
                        str = pp90Var.d.b;
                    }
                    int iOrdinal = ap90Var.a.a.ordinal();
                    if (iOrdinal == 0) {
                        yv90Var = new yv90(true, str);
                    } else if (iOrdinal == 1) {
                        yv90Var = new yv90(false, str);
                    } else if (iOrdinal != 2) {
                        eg.o();
                        return null;
                    }
                    return new iw90(pw90Var, gw90Var, cw90VarQ, pp90Var, yv90Var);
                }
                for (Object obj3 : arrayList) {
                    if (u890.j(((hp90) obj3).c, hp90Var.c)) {
                        yv90Var = obj3;
                        break;
                    }
                }
                hp90 hp90Var2 = (hp90) yv90Var;
                if (hp90Var2 == null || !hp90Var2.f) {
                    String str3 = hp90Var.c;
                    ArrayList arrayList4 = new ArrayList();
                    for (Object obj4 : arrayList) {
                        if (!((hp90) obj4).f) {
                            arrayList4.add(obj4);
                        }
                    }
                    ArrayList arrayList5 = new ArrayList();
                    for (Object obj5 : arrayList) {
                        if (((hp90) obj5).f) {
                            arrayList5.add(obj5);
                        }
                    }
                    return new kw90(new ow90(pno1.h(arrayList).b), new gw90(arrayList4.size(), s(str3, arrayList4, false)), q(str3, arrayList5, false), pp90Var);
                }
                String str4 = hp90Var.c;
                ArrayList arrayList6 = new ArrayList();
                for (Object obj6 : arrayList) {
                    if (!((hp90) obj6).f) {
                        arrayList6.add(obj6);
                    }
                }
                ArrayList arrayList7 = new ArrayList();
                for (Object obj7 : arrayList) {
                    if (((hp90) obj7).f) {
                        arrayList7.add(obj7);
                    }
                }
                return new jw90(new ow90(pno1.h(arrayList).b), new gw90(arrayList6.size(), s(str4, arrayList6, false)), q(str4, arrayList7, false), pp90Var);
            }
        }
