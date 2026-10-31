package p;

import android.content.Context;
import android.graphics.Color;
import android.net.Uri;
import com.spotify.mobius.Effects;
import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final /* synthetic */ class drm1 implements Update {
    public static final drm1 b = new drm1((byte) 0);
    public final /* synthetic */ byte a;

    public drm1() {
        this.a = (byte) 8;
        cqz0 cqz0Var = dqz0.a;
    }

    private final Next c(Object obj, Object obj2) {
        jiu jiuVar = ((aju) obj).a;
        ji0 ji0Var = jiuVar.a;
        miu miuVar = (miu) ((tq80) obj2).a;
        if (u890.j(miuVar, nsd.a)) {
            return Next.a(Effects.a(new jjb0[]{new jjb0("container", jiuVar.a)}));
        }
        if (u890.j(miuVar, qxc.a)) {
            return Next.a(Effects.a(new jjb0[]{new jjb0("cta_button", jiuVar.a)}));
        }
        if (miuVar instanceof ur10) {
            return ((ur10) miuVar).a.b() ? Next.a(Effects.a(new eeu[]{new eeu(ji0Var)})) : Next.j();
        }
        if (u890.j(miuVar, ew70.a)) {
            return Next.a(Effects.a(new w57[]{new w57(ji0Var.a)}));
        }
        if (!u890.j(miuVar, qs70.a)) {
            eg.o();
            return null;
        }
        String strR = ila0.r(ji0Var.g.a);
        if (strR == null) {
            strR = "";
        }
        return Next.a(Effects.a(new cl21[]{new cl21(strR, ji0Var)}));
    }

    private final Next d(Object obj, Object obj2) {
        Next nextJ;
        rdv rdvVarA;
        rdv rdvVar = (rdv) obj;
        kcv kcvVar = (vcv) obj2;
        c380<xcv> c380Var = rdvVar.i;
        c380<xcv> c380Var2 = rdvVar.h;
        List list = rdvVar.b;
        ak3 ak3Var = rdvVar.k;
        int i = rdvVar.d;
        boolean z = kcvVar instanceof kcv;
        if (z) {
            gbv gbvVar = kcvVar.a;
            if (gbvVar == null) {
                rdvVarA = rdvVar;
            } else {
                c380 c380VarA = mqo1.A(gbvVar.b);
                c380 c380VarA2 = mqo1.A(gbvVar.c);
                lia1 lia1Var = gbvVar.a;
                boolean z2 = gbvVar.d;
                Set set = gbvVar.e;
                rdvVarA = rdv.a(rdvVar, (String) null, (List) null, false, 0, z2, lia1Var, c380VarA, c380VarA2, z2 ? rdvVar.j : rdv.e(c380VarA2) + rdv.e(c380VarA), set, 3115);
            }
            nextJ = Next.h(rdvVarA);
        } else if (kcvVar instanceof ocv) {
            ocv ocvVar = (ocv) kcvVar;
            if (i != 1) {
                nextJ = Next.j();
            } else {
                wcv wcvVar = ocvVar.a;
                nextJ = Next.h(rdv.a(rdvVar, "", o7h.O0(new qdv(wcvVar.a, wcvVar.b), list), true, 0, false, (lia1) null, (c380) null, (c380) null, 0, (Set) null, 8184));
            }
        } else {
            Object obj3 = null;
            if (kcvVar instanceof rcv) {
                rcv rcvVar = (rcv) kcvVar;
                if (i != 1) {
                    nextJ = Next.j();
                } else {
                    String str = rcvVar.a.a;
                    for (Object obj4 : o7h.N0(c380Var, c380Var2)) {
                        if (u890.j(((ycv) obj4).getUri(), str)) {
                            obj3 = obj4;
                            break;
                        }
                    }
                    ycv ycvVar = (ycv) obj3;
                    nextJ = Next.i(rdv.a(rdvVar, (String) null, (List) null, false, 2, false, (lia1) null, (c380) null, (c380) null, 0, (Set) null, 8183).b(str), Collections.singleton(new qbv(ak3Var, str, ycvVar != null ? ycvVar.b() : false)));
                }
            } else if (kcvVar instanceof icv) {
                nextJ = !list.isEmpty() ? Next.h(rdv.a(rdvVar, "", o7h.l0(1, list), true, 0, false, (lia1) null, (c380) null, (c380) null, 0, (Set) null, 8184)) : Next.a(Collections.singleton(kbv.a));
            } else if (kcvVar instanceof ncv) {
                nextJ = i != 1 ? Next.j() : Next.h(rdv.a(rdvVar, ((ncv) kcvVar).a, (List) null, true, 0, false, (lia1) null, (c380) null, (c380) null, 0, (Set) null, 8186));
            } else if (kcvVar instanceof tcv) {
                nextJ = Next.a(Collections.singleton(new obv(rdvVar.g)));
            } else if (kcvVar instanceof ucv) {
                nextJ = Next.h(rdv.a(rdvVar, (String) null, (List) null, true, 0, false, ((ucv) kcvVar).a, (c380) null, (c380) null, 0, (Set) null, 8123));
            } else if (kcvVar instanceof jcv) {
                jcv jcvVar = (jcv) kcvVar;
                if (i != 1) {
                    nextJ = Next.j();
                } else {
                    qdv qdvVarD = rdvVar.d();
                    nextJ = Next.a(Collections.singleton(new rbv(ak3Var, qdvVarD != null ? qdvVarD.a : null, jcvVar.a)));
                }
            } else if (kcvVar instanceof pcv) {
                nextJ = Next.a(Collections.singleton(new qbv(ak3Var, ((pcv) kcvVar).a, false)));
            } else if (kcvVar instanceof qcv) {
                qcv qcvVar = (qcv) kcvVar;
                rdv rdvVarA2 = rdv.a(rdvVar, (String) null, (List) null, false, 1, false, (lia1) null, (c380) null, (c380) null, 0, (Set) null, 8183);
                xlq0 xlq0Var = qcvVar.a;
                if (xlq0Var instanceof wlq0) {
                    nextJ = Next.h(rdvVarA2);
                } else {
                    if (!(xlq0Var instanceof vlq0)) {
                        eg.o();
                        return null;
                    }
                    nextJ = Next.h(rdvVarA2.b(qcvVar.b));
                }
            } else if (kcvVar instanceof lcv) {
                bwo bwoVar = ((lcv) kcvVar).a;
                Set setSingleton = Collections.singleton(nbv.a);
                String str2 = bwoVar.a;
                if (str2 != null) {
                    ArrayList arrayList = new ArrayList(q7h.U(c380Var2, 10));
                    for (xcv xcvVarC : c380Var2) {
                        if (xcvVarC instanceof xcv) {
                            xcv xcvVar = xcvVarC;
                            if (u890.j(xcvVar.a, str2)) {
                                xcvVarC = xcv.c(xcvVar, false, 8175);
                            }
                        }
                        arrayList.add(xcvVarC);
                    }
                    ArrayList arrayList2 = new ArrayList(q7h.U(c380Var, 10));
                    for (xcv xcvVarC2 : c380Var) {
                        if (xcvVarC2 instanceof xcv) {
                            xcv xcvVar2 = xcvVarC2;
                            if (u890.j(xcvVar2.a, str2)) {
                                xcvVarC2 = xcv.c(xcvVar2, false, 8175);
                            }
                        }
                        arrayList2.add(xcvVarC2);
                    }
                    nextJ = Next.i(rdv.a(rdvVar, (String) null, (List) null, false, 1, false, (lia1) null, mqo1.A(arrayList), mqo1.A(arrayList2), 0, (Set) null, 7799), setSingleton);
                } else {
                    nextJ = Next.i(rdv.a(rdvVar, (String) null, (List) null, false, 1, false, (lia1) null, (c380) null, (c380) null, 0, (Set) null, 8183), setSingleton);
                }
            } else {
                if (!(kcvVar instanceof scv) && !(kcvVar instanceof mcv)) {
                    eg.o();
                    return null;
                }
                nextJ = Next.j();
            }
        }
        if (!z && nextJ.d()) {
            rdv rdvVar2 = (rdv) nextJ.g();
            lbv lbvVarE = sgc1.E(rdvVar2);
            if (!lbvVarE.equals(sgc1.E(rdvVar))) {
                return Next.i(rdvVar2, dm61.x0(lbvVarE, nextJ.b()));
            }
        }
        return nextJ;
    }

    private final Next e(Object obj, Object obj2) {
        Next nextI;
        g0x g0xVar = (g0x) obj;
        f441 f441Var = (e0x) obj2;
        boolean z = g0xVar instanceof dih1;
        i8k1 i8k1Var = i8k1.a;
        e7k1 e7k1Var = e7k1.a;
        if (z) {
            if (f441Var instanceof e57) {
                return Next.h(dih1.f((dih1) g0xVar, ((e57) f441Var).a, false, false, 14));
            }
            if (f441Var.equals(e7k1Var)) {
                return Next.h(dih1.f((dih1) g0xVar, 0L, true, false, 13));
            }
            if (f441Var.equals(i8k1Var)) {
                return Next.h(dih1.f((dih1) g0xVar, 0L, false, false, 13));
            }
            return f441Var instanceof ri0 ? Next.h(dih1.f((dih1) g0xVar, 0L, false, ((ri0) f441Var).a, 7)) : Next.j();
        }
        if (!(g0xVar instanceof ad80)) {
            eg.o();
            return null;
        }
        if (f441Var instanceof f441) {
            nextI = Next.h(ad80.f((ad80) g0xVar, null, null, false, 0L, f441Var.a, false, 12287));
        } else if (f441Var instanceof mve1) {
            ad80 ad80Var = (ad80) g0xVar;
            a2x a2xVar = ((mve1) f441Var).a;
            if (!(a2xVar instanceof a2x)) {
                eg.o();
                return null;
            }
            nextI = Next.i(ad80.f(ad80Var, dm61.u0(a2xVar, ad80Var.e), null, false, 0L, null, false, 16335), a2xVar.a != 0 ? Effects.a(new tc21[]{new tc21(ad80Var.a)}) : Effects.a(new tc21[0]));
        } else if (f441Var instanceof eyv0) {
            ad80 ad80Var2 = (ad80) g0xVar;
            nextI = Next.i(ad80.f(ad80Var2, null, ((eyv0) f441Var).a, false, 0L, null, false, 16191), Effects.a(new fr0[]{new fr0(ad80Var2.a)}));
        } else if (f441Var.equals(ufu.a)) {
            nextI = Next.h(ad80.f((ad80) g0xVar, null, null, true, 0L, null, false, 16127));
        } else if (f441Var.equals(g4n0.a)) {
            ad80 ad80Var3 = (ad80) g0xVar;
            nextI = (ad80Var3.d == ju0.e && ad80Var3.e()) ? Next.i(ad80.f(ad80Var3, null, null, true, 0L, null, false, 16127), Effects.a(new byd1[]{new byd1(ad80Var3.a)})) : Next.j();
        } else if (f441Var instanceof e57) {
            nextI = Next.h(ad80.f((ad80) g0xVar, null, null, false, ((e57) f441Var).a, null, false, 15359));
        } else if (f441Var.equals(e7k1Var)) {
            nextI = Next.h(ad80.f((ad80) g0xVar, null, null, false, 0L, null, false, 14335));
        } else if (f441Var.equals(i8k1Var)) {
            ad80 ad80Var4 = (ad80) g0xVar;
            nextI = Next.h(new dih1(ad80Var4.k, false, ad80Var4.m, ad80Var4.n));
        } else if (f441Var instanceof ri0) {
            nextI = Next.h(ad80.f((ad80) g0xVar, null, null, false, 0L, null, ((ri0) f441Var).a, 8191));
        } else {
            if (!f441Var.equals(o790.a)) {
                eg.o();
                return null;
            }
            nextI = Next.i(ad80.f((ad80) g0xVar, null, null, true, 0L, null, false, 16127), Effects.a(new qzw[]{new gju(2, (a2x) null), new veu()}));
        }
        return f0x.a(nextI, g0xVar);
    }

    /* JADX WARN: Code duplicated, block: B:123:0x0292  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v4, types: [java.lang.Integer[], java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r16v3 */
    /* JADX WARN: Type inference failed for: r2v29 */
    /* JADX WARN: Type inference failed for: r2v30, types: [int] */
    /* JADX WARN: Type inference failed for: r2v73 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17, types: [int] */
    /* JADX WARN: Type inference failed for: r3v20 */
    private final Next f(Object obj, Object obj2) {
        int i;
        z6x z6xVarSingletonList;
        List list;
        u771 u771Var;
        boolean z;
        jlw0 jlw0Var;
        jlw0 jlw0Var2;
        ?? IntValue;
        Object next;
        ArrayList arrayList;
        Iterator it;
        s8d1 v8d1Var;
        List list2;
        z6x arrayList2;
        wwy wwyVarG = (ywy) obj;
        nwy nwyVar = (swy) obj2;
        boolean z2 = nwyVar instanceof nwy;
        vwy vwyVar = vwy.b;
        vwy vwyVar2 = vwy.a;
        if (!z2) {
            if (nwyVar instanceof owy) {
                owy owyVar = (owy) nwyVar;
                if (wwyVarG instanceof xwy) {
                    xwy xwyVar = (xwy) wwyVarG;
                    return Next.h(new uwy(xwyVar.a, xwyVar.b, xwyVar.c, (wkt) null, owyVar.d, owyVar.e));
                }
                bhn0.s(wwyVarG, "State is ");
                return null;
            }
            if (nwyVar instanceof rwy) {
                rwy rwyVar = (rwy) nwyVar;
                if (wwyVarG instanceof wwy) {
                    wwy wwyVar = wwyVarG;
                    x8d1 x8d1Var = (x8d1) wwyVar.Y.get(rwyVar.a);
                    wwyVarG = wwy.g(wwyVar, 0, (wkt) null, (cuu0) null, x8d1Var.a(), x8d1Var instanceof t8d1 ? vwyVar : vwyVar2, rwyVar.a, 2975);
                }
                return Next.h(wwyVarG);
            }
            if (nwyVar instanceof pwy) {
                pwy pwyVar = (pwy) nwyVar;
                u771 u771Var2 = pwyVar.b;
                ela1 ela1Var = pwyVar.a;
                int i2 = pwyVar.c;
                return Next.i(new xwy(ela1Var, u771Var2, i2, null), Collections.singleton(new bwy(ela1Var, u771Var2, i2, true)));
            }
            if (nwyVar instanceof qwy) {
                return Next.h(fj30.J(wwyVarG, ((qwy) nwyVar).a));
            }
            if (nwyVar instanceof mwy) {
                mwy mwyVar = (mwy) nwyVar;
                return Next.i(fj30.J(wwyVarG, (wkt) null), Collections.singleton(new cwy(wwyVarG, mwyVar.a, mwyVar.b, mwyVar.c, mwyVar.d)));
            }
            if (!(nwyVar instanceof lwy)) {
                eg.o();
                return null;
            }
            lwy lwyVar = (lwy) nwyVar;
            if (wwyVarG instanceof wwy) {
                wwy wwyVar2 = wwyVarG;
                cuu0 cuu0Var = wwyVar2.e;
                wwyVarG = wwy.g(wwyVar2, 0, (wkt) null, cuu0Var != null ? cuu0Var.j(lwyVar.a) : null, (llw0) null, (vwy) null, 0, 4079);
            }
            return Next.h(wwyVarG);
        }
        nwy nwyVar2 = nwyVar;
        if (!(wwyVarG instanceof xwy)) {
            bhn0.s(wwyVarG, "State is ");
            return null;
        }
        zd71 zd71Var = nwyVar2.a;
        xwy xwyVar2 = (xwy) wwyVarG;
        u771 u771Var3 = xwyVar2.b;
        int i3 = xwyVar2.c;
        ela1 ela1Var2 = xwyVar2.a;
        exy exyVarB = u771Var3.b();
        jq71 jq71Var = zd71Var.c;
        jq71 jq71Var2 = zd71Var.d;
        Context context = zd71Var.a;
        List list3 = jq71Var != null ? jq71Var.g : null;
        z6x z6xVar = z6x.a;
        if (jq71Var != null) {
            Integer num = jq71Var.b;
            int iIntValue = num != null ? num.intValue() : Color.parseColor("#FF535353");
            Integer num2 = jq71Var.c;
            i = 1;
            z6xVarSingletonList = Collections.singletonList(new ilw0(iIntValue, num2 != null ? num2.intValue() : Color.parseColor("#000000"), context.getString(2131956351)));
        } else {
            i = 1;
            z6xVarSingletonList = z6xVar;
        }
        List listN0 = zd71Var.e;
        if (listN0.isEmpty()) {
            listN0 = null;
        }
        if (listN0 == null) {
            if (list3 != null) {
                List list4 = list3;
                arrayList2 = new ArrayList(q7h.U(list4, 10));
                Iterator it2 = list4.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(new jlw0((Uri) it2.next(), context.getString(2131953445)));
                }
            } else {
                arrayList2 = z6xVar;
            }
            listN0 = o7h.N0((Iterable) z6xVarSingletonList, (Collection) arrayList2);
        }
        List listA1 = o7h.a1(listN0, new cvt((byte) 4));
        bwe1 bwe1Var = exyVarB.f;
        if (bwe1Var == null && (exyVarB.b instanceof n1f1)) {
            Uri uri = (jq71Var2 == null || (list2 = jq71Var2.g) == null) ? 
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: ?: TERNARY (r5v19 'uri' android.net.Uri) = (((r9v1 'jq71Var2' p.jq71) == (null p.jq71) || (wrap java.util.List:0x00d6: IGET (r5v21 'list2' java.util.List) = (r9v1 'jq71Var2' p.jq71) A[FORCE_ASSIGN_INLINE, WRAPPED] (LINE:215) p.jq71.g java.util.List) == (null java.util.List))) ? (r2v20 android.net.Uri) : (wrap ??:0x00de: CHECK_CAST (android.net.Uri) (wrap java.lang.Object:0x00da: INVOKE (r5v21 'list2' java.util.List) STATIC call: p.o7h.s0(java.util.List):java.lang.Object A[WRAPPED] (LINE:219))) in method: p.drm1.f(java.lang.Object, java.lang.Object):com.spotify.mobius.Next, file: /workspace/spotify-analysis/dex-input/classes12.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
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
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r2v20 android.net.Uri
                	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                */
            /*
                Method dump skipped, instruction units count: 952
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: p.drm1.f(java.lang.Object, java.lang.Object):com.spotify.mobius.Next");
        }

        private final Next g(Object obj, Object obj2) {
            int i;
            g040 g040Var = (g040) obj;
            tq80 tq80Var = (tq80) obj2;
            String str = g040Var.g;
            String str2 = g040Var.c;
            String str3 = g040Var.b;
            upf upfVar = g040Var.d;
            tqw tqwVar = tq80Var.b;
            tv80 tv80VarY = tqwVar != null ? n3o1.y(tqwVar) : null;
            c040 c040Var = (d040) tq80Var.a;
            if (c040Var instanceof uz30) {
                if (upfVar instanceof gz30) {
                    return Next.i(g040.a(g040Var, (sqe) null, (String) null, (String) null, new iz30(tv80VarY), (qtg) null, false, (String) null, false, 247), Collections.singleton(new oz30(str3)));
                }
                if (upfVar instanceof hz30) {
                    return Next.i(g040Var, Collections.singleton(new sz30(((hz30) upfVar).d, str2, str3, str, tv80VarY)));
                }
                if (upfVar instanceof iz30) {
                    return Next.j();
                }
                if (upfVar instanceof fz30) {
                    return Next.i(g040.a(g040Var, (sqe) null, (String) null, (String) null, new iz30(tv80VarY), (qtg) null, false, (String) null, false, 247), Collections.singleton(new oz30(str3)));
                }
                eg.o();
                return null;
            }
            if (c040Var instanceof zz30) {
                return Next.a(Collections.singleton(new nz30(str3)));
            }
            if (c040Var instanceof c040) {
                return Next.a(Collections.singleton(new rz30(c040Var.a)));
            }
            if (c040Var instanceof wz30) {
                wz30 wz30Var = (wz30) c040Var;
                iz30 iz30Var = upfVar instanceof iz30 ? (iz30) upfVar : null;
                return Next.i(g040.a(g040Var, (sqe) null, (String) null, (String) null, new hz30(wz30Var.a), (qtg) null, false, (String) null, false, 247), Collections.singleton(new sz30(wz30Var.a, str2, str3, str, iz30Var != null ? iz30Var.d : null)));
            }
            if (c040Var instanceof vz30) {
                sqe sqeVar = g040Var.a;
                if (sqeVar instanceof dz30) {
                    i = 2131956158;
                } else {
                    if (!(sqeVar instanceof ez30)) {
                        eg.o();
                        return null;
                    }
                    i = 2131956156;
                }
                return Next.i(g040.a(g040Var, (sqe) null, (String) null, (String) null, fz30.d, (qtg) null, false, (String) null, false, 247), Collections.singleton(new tz30(i)));
            }
            if (c040Var instanceof yz30) {
                List list = ((yz30) c040Var).a;
                return list.isEmpty() ? Next.h(g040.a(g040Var, (sqe) null, (String) null, (String) null, (upf) null, new lz30(z6x.a), false, (String) null, false, 239)) : Next.i(g040.a(g040Var, (sqe) null, (String) null, (String) null, (upf) null, mz30.d, false, (String) null, false, 239), Collections.singleton(new qz30(list)));
            }
            boolean z = c040Var instanceof xz30;
            jz30 jz30Var = jz30.d;
            if (z) {
                return Next.h(g040.a(g040Var, (sqe) null, (String) null, (String) null, (upf) null, jz30Var, false, (String) null, false, 239));
            }
            if (!(c040Var instanceof b040)) {
                if (c040Var instanceof a040) {
                    return Next.h(g040.a(g040Var, (sqe) null, (String) null, (String) null, (upf) null, jz30Var, false, (String) null, false, 239));
                }
                eg.o();
                return null;
            }
            ArrayList arrayList = ((b040) c040Var).a;
            ArrayList arrayList2 = new ArrayList();
            for (Object obj3 : arrayList) {
                String str4 = ((e040) obj3).c;
                if (str4 != null && !ihc1.y0(str4)) {
                    arrayList2.add(obj3);
                }
            }
            return Next.h(g040.a(g040Var, (sqe) null, (String) null, (String) null, (upf) null, new lz30(arrayList2), false, (String) null, false, 239));
        }

        private final Next h(Object obj, Object obj2) {
            qo50 qo50Var = (qo50) obj;
            tq80 tq80Var = (tq80) obj2;
            no50 no50Var = (po50) tq80Var.a;
            if (no50Var instanceof no50) {
                no50 no50Var2 = no50Var;
                return Next.h(qo50.a(qo50Var, no50Var2.a, no50Var2.b, no50Var2.c, no50Var2.d, 0, no50Var2.e, no50Var2.f, no50Var2.g, no50Var2.h, no50Var2.i, 16));
            }
            if (u890.j(no50Var, mo50.a)) {
                return Next.a(Effects.a(new lo50[]{new lo50(tq80Var.b)}));
            }
            if (no50Var instanceof oo50) {
                return Next.h(qo50.a(qo50Var, false, (String) null, (List) null, (phx) null, ((oo50) no50Var).a, false, false, false, 0, false, 1007));
            }
            eg.o();
            return null;
        }

        private final Next i(Object obj, Object obj2) {
            uz90 uz90Var = (uz90) obj2;
            if (uz90Var instanceof tz90) {
                nq90 nq90Var = ((tz90) uz90Var).a;
                nq90Var.getClass();
                return Next.h(new wz90(nq90Var.a, nq90Var.c, false, true, nq90Var.d));
            }
            if (uz90Var instanceof sz90) {
                return Next.a(Collections.singleton(new mz90(((sz90) uz90Var).a)));
            }
            if (uz90Var instanceof rz90) {
                return Next.h(new wz90(11));
            }
            eg.o();
            return null;
        }

        private final Next j(Object obj, Object obj2) {
            qva0 qva0Var = (qva0) obj;
            pva0 pva0Var = (pva0) obj2;
            if (pva0Var instanceof mva0) {
                mva0 mva0Var = (mva0) pva0Var;
                String str = mva0Var.a;
                return Next.i(new qva0(str, 1, str.length() > 0 ? xgk1.b : xgk1.a), Collections.singleton(new kva0(str, mva0Var.b, mva0Var.c)));
            }
            if (!(pva0Var instanceof ova0)) {
                if (pva0Var instanceof nva0) {
                    return Next.h(qva0.a(qva0Var, ((nva0) pva0Var).a, 5));
                }
                eg.o();
                return null;
            }
            int iC = l1d.C(qva0Var.b);
            if (iC == 0) {
                return Next.j();
            }
            if (iC == 1) {
                return Next.h(qva0.a(qva0Var, 0, 3));
            }
            if (iC == 2) {
                return Next.a(Collections.singleton(new lva0(qva0Var.a)));
            }
            eg.o();
            return null;
        }

        private final Next k(Object obj, Object obj2) {
            fxf0 fxf0Var = (fxf0) obj;
            bk80 bk80Var = (swf0) obj2;
            String str = fxf0Var.a;
            if (bk80Var instanceof bk80) {
                String str2 = bk80Var.a;
                return (fxf0Var.c || u890.j(str2, str)) ? Next.j() : Next.h(fxf0.a(fxf0Var, str2, cxf0.a, 14));
            }
            if (bk80Var instanceof vn21) {
                return fxf0Var.g() ? Next.i(fxf0.a(fxf0Var, (String) null, bxf0.a, 15), Effects.a(new q461[]{new q461(str, fxf0Var.d)})) : Next.j();
            }
            if (bk80Var instanceof ss21) {
                return Next.h(fxf0.a(fxf0Var, (String) null, new zwf0(((ss21) bk80Var).a), 15));
            }
            if (bk80Var instanceof ts21) {
                return Next.h(fxf0.a(fxf0Var, (String) null, new dxf0(false), 15));
            }
            if (bk80Var instanceof fu9) {
                return Next.a(Effects.a(new lrn0[]{lrn0.c}));
            }
            if (bk80Var instanceof ty40) {
                return Next.a(Effects.a(new sy40[]{sy40.c}));
            }
            eg.o();
            return null;
        }

        private final Next l(Object obj, Object obj2) {
            v3g0 v3g0Var;
            y3g0 y3g0Var = (y3g0) obj;
            o3g0 o3g0Var = (q3g0) obj2;
            if (o3g0Var instanceof o3g0) {
                return Next.h(y3g0.a(y3g0Var, (Set) null, o3g0Var.a, 3));
            }
            if (o3g0Var instanceof p3g0) {
                return Next.j();
            }
            if (!o3g0Var.equals(m3g0.a)) {
                if (o3g0Var.equals(n3g0.a)) {
                    return Next.a(Collections.singleton(new l3g0(w3g0.a)));
                }
                eg.o();
                return null;
            }
            int iOrdinal = y3g0Var.c.ordinal();
            if (iOrdinal == 0) {
                v3g0Var = u3g0.a;
            } else if (iOrdinal == 1) {
                v3g0Var = t3g0.a;
            } else {
                if (iOrdinal != 2) {
                    eg.o();
                    return null;
                }
                v3g0Var = v3g0.a;
            }
            return Next.a(Collections.singleton(new l3g0(v3g0Var)));
        }

        private final Next m(Object obj, Object obj2) {
            idh0 idh0Var = (idh0) obj;
            cdh0 cdh0Var = (ddh0) obj2;
            if (cdh0Var instanceof cdh0) {
                return Next.h(new idh0(cdh0Var.a, idh0Var.b));
            }
            if (cdh0Var instanceof bdh0) {
                return Next.h(new idh0(idh0Var.a, ((bdh0) cdh0Var).a));
            }
            eg.o();
            return null;
        }

        /* JADX WARN: Code duplicated, block: B:38:0x00d5  */
        /* JADX WARN: Code duplicated, block: B:399:0x0a3d  */
        /* JADX WARN: Code duplicated, block: B:39:0x00d8  */
        /* JADX WARN: Code duplicated, block: B:401:0x0a4b  */
        /* JADX WARN: Code duplicated, block: B:403:0x0a5b  */
        /* JADX WARN: Code duplicated, block: B:41:0x00db  */
        /* JADX WARN: Code duplicated, block: B:42:0x00f9  */
        /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v136 java.lang.Object, still in use, count: 2, list:
              (r2v136 java.lang.Object) from 0x00d1: PHI (r2 I:??) = (r2v129 java.lang.Object), (r2v136 java.lang.Object) binds: [B:35:0x00d0, B:551:0x00d1] A[DONT_GENERATE, DONT_INLINE]
              (r2v136 java.lang.Object) from 0x00c9: CHECK_CAST (p.cwi0) (r2v136 java.lang.Object)
            	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
            	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
            	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
            	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
            	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
            	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
            	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
            	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
            	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
            */
        public final com.spotify.mobius.Next a(java.lang.Object r47, java.lang.Object r48) {
            /*
                Method dump skipped, instruction units count: 3780
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: p.drm1.a(java.lang.Object, java.lang.Object):com.spotify.mobius.Next");
        }

        public Next b(mie mieVar, iie iieVar) {
            if (iieVar instanceof eie) {
                eie eieVar = (eie) iieVar;
                return Next.h(mie.b(mieVar, 2, eieVar.a, eieVar.b, eieVar.c, eieVar.d, eieVar.e, 1));
            }
            if (iieVar instanceof gie) {
                return Next.h(mie.b(mieVar, 1, (String) null, (String) null, (String) null, (List) null, false, 125));
            }
            if (iieVar instanceof die) {
                die dieVar = (die) iieVar;
                bhe bheVar = (bhe) o7h.t0(dieVar.a, mieVar.f);
                return bheVar == null ? Next.j() : Next.a(Collections.singleton(new uhe(mieVar.a, bheVar.c, dieVar.b, mieVar.g)));
            }
            if (iieVar instanceof hie) {
                return Next.a(Collections.singleton(new vhe(((hie) iieVar).a)));
            }
            if (iieVar instanceof fie) {
                return Next.a(Collections.singleton(the.a));
            }
            eg.o();
            return null;
        }

        public drm1(ekb ekbVar, lhc lhcVar) {
            this.a = (byte) 16;
        }

        public drm1(f0x f0xVar) {
            this.a = (byte) 14;
        }

        public /* synthetic */ drm1(byte b2) {
            this.a = b2;
        }
    }
