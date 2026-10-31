package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;
import com.spotify.base.java.logging.Logger;
import com.spotify.player.model.PlayerState;
import com.spotify.recents.recentsdatasourceimpl.events.proto.RecentsDecorationErrorEvent;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.TimeoutCancellationException;
import spotify.your_library.esperanto.proto.YourLibraryResponse;
import spotify.your_library.proto.YourLibraryDecoratedEntityOuterClass;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class t83 extends a8d1 implements xu30 {
    public final /* synthetic */ byte a;
    public /* synthetic */ Object b;
    public /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t83(su01 su01Var, Set set, dxy dxyVar, lnm lnmVar) {
        super(3, lnmVar);
        this.a = (byte) 9;
        this.c = su01Var;
        this.d = set;
        this.e = dxyVar;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj4 = this.e;
        Object obj5 = this.d;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                t83 t83Var = new t83(obj5, obj4, (lnm) obj3, (byte) 0);
                t83Var.b = (ioj0) obj;
                t83Var.c = (Map) obj2;
                return t83Var.invokeSuspend(rih1Var);
            case 1:
                t83 t83Var2 = new t83(obj5, obj4, (lnm) obj3, (byte) 1);
                t83Var2.b = (List) obj;
                t83Var2.c = (mmr0) obj2;
                return t83Var2.invokeSuspend(rih1Var);
            case 2:
                t83 t83Var3 = new t83(obj5, obj4, (lnm) obj3, (byte) 2);
                t83Var3.b = (md0) obj;
                t83Var3.c = (PlayerState) obj2;
                return t83Var3.invokeSuspend(rih1Var);
            case 3:
                t83 t83Var4 = new t83(obj5, obj4, (lnm) obj3, (byte) 3);
                t83Var4.c = (Map) obj;
                t83Var4.b = (Map) obj2;
                return t83Var4.invokeSuspend(rih1Var);
            case 4:
                t83 t83Var5 = new t83(obj5, obj4, (lnm) obj3, (byte) 4);
                t83Var5.b = (l57) obj;
                t83Var5.c = (YourLibraryResponse) obj2;
                return t83Var5.invokeSuspend(rih1Var);
            case 5:
                t83 t83Var6 = new t83(obj5, obj4, (lnm) obj3, (byte) 5);
                t83Var6.b = (yn71) obj;
                t83Var6.c = (m4o0) obj2;
                return t83Var6.invokeSuspend(rih1Var);
            case 6:
                t83 t83Var7 = new t83(obj5, obj4, (lnm) obj3, (byte) 6);
                t83Var7.b = (k1r) obj;
                t83Var7.c = (k1r) obj2;
                return t83Var7.invokeSuspend(rih1Var);
            case 7:
                t83 t83Var8 = new t83(obj5, obj4, (lnm) obj3, (byte) 7);
                t83Var8.b = (dmj0) obj;
                t83Var8.c = (emj0) obj2;
                return t83Var8.invokeSuspend(rih1Var);
            case 8:
                t83 t83Var9 = new t83(obj5, obj4, (lnm) obj3, (byte) 8);
                t83Var9.b = (u0q0) obj;
                t83Var9.c = (Set) obj2;
                return t83Var9.invokeSuspend(rih1Var);
            case 9:
                t83 t83Var10 = new t83((su01) this.c, (Set) obj5, (dxy) obj4, (lnm) obj3);
                t83Var10.b = (Throwable) obj2;
                t83Var10.invokeSuspend(rih1Var);
                return rih1Var;
            case 10:
                t83 t83Var11 = new t83(obj5, obj4, (lnm) obj3, (byte) 10);
                t83Var11.b = (nq01) obj;
                t83Var11.c = (Set) obj2;
                return t83Var11.invokeSuspend(rih1Var);
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                t83 t83Var12 = new t83(obj5, obj4, (lnm) obj3, (byte) 11);
                t83Var12.b = (k1r) obj;
                t83Var12.c = (k1r) obj2;
                return t83Var12.invokeSuspend(rih1Var);
            default:
                t83 t83Var13 = new t83(obj5, obj4, (lnm) obj3, (byte) 12);
                t83Var13.b = (k1r) obj;
                t83Var13.c = (k1r) obj2;
                return t83Var13.invokeSuspend(rih1Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:124:0x024d  */
    /* JADX WARN: Code duplicated, block: B:141:0x0283  */
    /* JADX WARN: Code duplicated, block: B:148:0x0298  */
    /* JADX WARN: Code duplicated, block: B:158:0x02b2  */
    /* JADX WARN: Code duplicated, block: B:181:0x030a  */
    /* JADX WARN: Code duplicated, block: B:182:0x030d  */
    /* JADX WARN: Code duplicated, block: B:184:0x0311  */
    /* JADX WARN: Code duplicated, block: B:188:0x0318  */
    /* JADX WARN: Code duplicated, block: B:190:0x031b  */
    /* JADX WARN: Code duplicated, block: B:192:0x031f  */
    /* JADX WARN: Code duplicated, block: B:194:0x0327  */
    /* JADX WARN: Code duplicated, block: B:195:0x0329  */
    /* JADX WARN: Code duplicated, block: B:198:0x0335  */
    /* JADX WARN: Code duplicated, block: B:204:0x034a  */
    /* JADX WARN: Code duplicated, block: B:207:0x0357  */
    /* JADX WARN: Code duplicated, block: B:209:0x035a  */
    /* JADX WARN: Code duplicated, block: B:210:0x0360  */
    /* JADX WARN: Code duplicated, block: B:213:0x0366  */
    /* JADX WARN: Code duplicated, block: B:214:0x0369  */
    /* JADX WARN: Code duplicated, block: B:216:0x036c  */
    /* JADX WARN: Code duplicated, block: B:217:0x036f  */
    /* JADX WARN: Code duplicated, block: B:222:0x037b  */
    /* JADX WARN: Code duplicated, block: B:398:0x0345 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:93:0x01d2  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final Object invokeSuspend(Object obj) {
        goj0 goj0VarA;
        bql bqlVar;
        String str;
        Long lD0;
        Long lD1;
        String str2;
        String str3;
        iix0 hix0Var;
        fy50 fy50Var;
        d2k1 d2k1Var;
        k4m k4mVar;
        jfv jfvVar;
        Long lValueOf;
        iix0 hix0Var2;
        boolean z;
        boolean z2;
        String str4;
        String str5;
        String str6;
        List list;
        Iterator it;
        Object next;
        u740 u740Var;
        String str7;
        Object i540Var;
        wsi1 wsi1Var;
        i540 i540Var2;
        zoy0 zoy0Var;
        hll hllVar;
        List list2;
        d2k1 d2k1VarJ;
        Long lValueOf2;
        a7q0 a7q0Var;
        w6q0 w6q0Var;
        byte b = this.a;
        Object obj2 = this.d;
        Object obj3 = this.e;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ioj0 ioj0Var = (ioj0) this.b;
                Map map = (Map) this.c;
                hm5.M(obj);
                hoj0 hoj0VarC = ioj0Var.c(bql.class, ((wto) obj2).a);
                if (!((hoj0VarC == null || (goj0VarA = hoj0VarC.a()) == null || (bqlVar = (bql) goj0VarA.a) == null) ? iql.a : bqlVar.a).equals(kql.a) || y7y0.A(map)) {
                    return null;
                }
                return ((x83) obj3).a.getText(2131952176);
            case 1:
                List list3 = (List) this.b;
                mmr0 mmr0Var = (mmr0) this.c;
                hm5.M(obj);
                jo70 jo70Var = (jo70) mmr0Var.a;
                xkk1 xkk1Var = (xkk1) mmr0Var.b;
                List list4 = (List) obj3;
                String str8 = jo70Var.a;
                String str9 = str8.length() == 0 ? null : str8;
                io70 io70Var = jo70Var.e;
                if (io70Var == null || (str3 = io70Var.a) == null) {
                    str = null;
                } else {
                    if (str3.length() == 0) {
                        str3 = null;
                    }
                    str = str3;
                }
                up70 up70VarA = xkk1Var.a.a(vp70.c);
                String str10 = (up70VarA == null || (str2 = up70VarA.a.a) == null) ? null : str2.length() == 0 ? null : str2;
                List list5 = list4;
                List list6 = list3;
                Iterator it2 = list5.iterator();
                Iterator it3 = list6.iterator();
                ArrayList arrayList = new ArrayList(Math.min(q7h.U(list5, 10), q7h.U(list6, 10)));
                while (it2.hasNext() && it3.hasNext()) {
                    Object next2 = it2.next();
                    jo70 jo70Var2 = (jo70) it3.next();
                    pvc0 pvc0Var = (pvc0) next2;
                    String str11 = pvc0Var.c;
                    Map map2 = pvc0Var.f;
                    String str12 = jo70Var2.a;
                    String str13 = (String) map2.get("chapter.start_position_in_milliseconds");
                    long jLongValue = (str13 == null || (lD1 = nhc1.d0(10, str13)) == null) ? 0L : lD1.longValue();
                    String str14 = (String) map2.get("chapter.end_position_in_milliseconds");
                    arrayList.add(new bhe(jLongValue, (str14 == null || (lD0 = nhc1.d0(10, str14)) == null) ? 0L : lD0.longValue(), str11, str12, false));
                }
                return new qie(str9, str, true, str10, arrayList);
            case 2:
                md0 md0Var = (md0) this.b;
                PlayerState playerState = (PlayerState) this.c;
                hm5.M(obj);
                String str15 = (String) obj3;
                if (playerState.track().c()) {
                    if (u890.j(md0Var != null ? md0Var.a() : null, str15)) {
                        return kl1.D(playerState);
                    }
                }
                return rrt0.b;
            case 3:
                Map map3 = (Map) this.c;
                Map map4 = (Map) this.b;
                hm5.M(obj);
                return ((k740) obj2).a((String) obj3, map3, map4);
            case 4:
                l57 l57Var = (l57) this.b;
                YourLibraryResponse yourLibraryResponse = (YourLibraryResponse) this.c;
                hm5.M(obj);
                boolean z3 = ((gy1) obj2) instanceof by1;
                ho1 ho1Var = ((z180) obj3).b;
                if (!z3) {
                    ho1Var.getClass();
                    h290 h290VarN = yourLibraryResponse.n();
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj4 : h290VarN) {
                        if (((YourLibraryDecoratedEntityOuterClass.YourLibraryDecoratedEntity) obj4).e().p()) {
                            arrayList2.add(obj4);
                        }
                    }
                    AbstractList abstractListB = ho1Var.b(true, arrayList2, l57Var);
                    h290 h290VarN2 = yourLibraryResponse.n();
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj5 : h290VarN2) {
                        if (!((YourLibraryDecoratedEntityOuterClass.YourLibraryDecoratedEntity) obj5).e().p()) {
                            arrayList3.add(obj5);
                        }
                    }
                    return ho1Var.e(abstractListB, ho1Var.b(false, arrayList3, l57Var), l57Var);
                }
                ho1Var.getClass();
                boolean z4 = l57Var.h;
                String str16 = l57Var.e;
                Set set = l57Var.m;
                ArrayList arrayListN = yourLibraryResponse.n();
                if (!l57Var.c) {
                    ArrayList arrayList4 = new ArrayList();
                    for (Object obj6 : arrayListN) {
                        YourLibraryDecoratedEntityOuterClass.YourLibraryDecoratedEntity yourLibraryDecoratedEntity = (YourLibraryDecoratedEntityOuterClass.YourLibraryDecoratedEntity) obj6;
                        if (yourLibraryDecoratedEntity.hasPlaylist() && yourLibraryDecoratedEntity.w().C()) {
                            arrayList4.add(obj6);
                        }
                    }
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    Iterator it4 = arrayList4.iterator();
                    while (it4.hasNext()) {
                        linkedHashSet.add(((YourLibraryDecoratedEntityOuterClass.YourLibraryDecoratedEntity) it4.next()).w().q().getUri());
                    }
                    ArrayList arrayList5 = new ArrayList();
                    for (Object obj7 : arrayListN) {
                        YourLibraryDecoratedEntityOuterClass.YourLibraryDecoratedEntity yourLibraryDecoratedEntity2 = (YourLibraryDecoratedEntityOuterClass.YourLibraryDecoratedEntity) obj7;
                        if (!set.contains(yourLibraryDecoratedEntity2.e().getUri())) {
                            if (yourLibraryDecoratedEntity2.C() ? linkedHashSet.contains(yourLibraryDecoratedEntity2.e().getUri()) : (yourLibraryDecoratedEntity2.hasPlaylist() && yourLibraryDecoratedEntity2.w().C() && !u890.j(yourLibraryDecoratedEntity2.w().q().getUri(), str16)) ? false : true) {
                            }
                        }
                        arrayList5.add(obj7);
                    }
                    arrayListN = arrayList5;
                }
                smc0 smc0VarN = k4p1.n();
                if (z4 && str16 == null) {
                    smc0VarN.add(ho1Var.j(set.contains(bo1.b)));
                }
                smc0VarN.addAll(ho1Var.a.q(arrayListN, l57Var.a, z4));
                smc0 smc0VarK = k4p1.k(smc0VarN);
                ArrayList<Object> arrayList6 = new ArrayList();
                ArrayList arrayList7 = new ArrayList();
                rmc0 rmc0VarListIterator = smc0VarK.listIterator(0);
                while (true) {
                    rmc0 rmc0Var = rmc0VarListIterator;
                    if (!rmc0Var.hasNext()) {
                        ArrayList arrayList8 = new ArrayList(q7h.U(arrayList6, 10));
                        for (Object objG : arrayList6) {
                            if (objG instanceof ot1) {
                                objG = ot1.g((ot1) objG, true, 32743);
                            } else if (!(objG instanceof nt1)) {
                                eg.o();
                                return null;
                            }
                            arrayList8.add(objG);
                        }
                        return new go1(l57Var.b, arrayList8, arrayList7, l57Var.c, (Set) null, 34);
                    }
                    Object next3 = rmc0Var.next();
                    if (set.contains(((pt1) next3).getUri())) {
                        arrayList6.add(next3);
                    } else {
                        arrayList7.add(next3);
                    }
                }
                break;
            case 5:
                yn71 yn71Var = (yn71) this.b;
                m4o0 m4o0Var = (m4o0) this.c;
                hm5.M(obj);
                return new qt90((p2a0) obj2, yn71Var.a, m4o0Var, (zo90) obj3);
            case 6:
                i1r i1rVar = (k1r) this.b;
                i1r i1rVar2 = (k1r) this.c;
                hm5.M(obj);
                if (i1rVar2 instanceof h1r) {
                    return new ho10(new RuntimeException("Track metadata loading failed: track=" + i1rVar2));
                }
                if (!(i1rVar instanceof i1r) || !(i1rVar2 instanceof i1r)) {
                    return null;
                }
                i1e i1eVar = (i1e) i1rVar.a;
                v0e v0eVar = (v0e) i1rVar2.a;
                qbw qbwVar = (qbw) obj2;
                String str17 = qbwVar.b;
                String str18 = qbwVar.c;
                qo10 qo10Var = qbwVar.d;
                String str19 = (String) obj3;
                String str20 = i1eVar.a;
                String str21 = str20 == null ? str19 : str20;
                String str22 = i1eVar.b;
                String str23 = str22 == null ? "" : str22;
                Integer num = i1eVar.c;
                String str24 = v0eVar.a;
                String str25 = v0eVar.b;
                return new io10(str17, str18, qo10Var, str19, str21, str23, num, str24, str25 == null ? "" : str25, v0eVar.c);
            case 7:
                dmj0 dmj0Var = (dmj0) this.b;
                emj0 emj0Var = (emj0) this.c;
                hm5.M(obj);
                i1r i1rVar3 = dmj0Var.a;
                i1r i1rVar4 = i1rVar3 instanceof i1r ? i1rVar3 : null;
                z8e0 z8e0Var = i1rVar4 != null ? (z8e0) i1rVar4.a : null;
                boolean z5 = dmj0Var.c;
                yqg yqgVar = ((lmj0) obj2).f;
                i1r i1rVar5 = dmj0Var.b;
                i1r i1rVar6 = i1rVar5 instanceof i1r ? i1rVar5 : null;
                p740 p740Var = i1rVar6 != null ? (p740) i1rVar6.a : null;
                i1r i1rVar7 = dmj0Var.d;
                i1r i1rVar8 = i1rVar7 instanceof i1r ? i1rVar7 : null;
                mdz mdzVar = i1rVar8 != null ? (mdz) i1rVar8.a : null;
                boolean z6 = emj0Var.a;
                String str26 = emj0Var.b;
                String str27 = emj0Var.c;
                boolean z7 = emj0Var.d;
                fmj0 fmj0Var = (fmj0) obj3;
                fju fjuVar = fmj0Var.b;
                l1z l1zVar = p740Var != null ? p740Var.b : null;
                v740 v740Var = p740Var != null ? p740Var.c : null;
                if (z8e0Var == null || (hix0Var = z8e0Var.e) == null) {
                    hix0Var = new hix0(false, 0L);
                }
                boolean z8 = (hix0Var instanceof gix0) || ((hix0Var instanceof hix0) && ((hix0) hix0Var).a);
                if (fjuVar.e && z8e0Var != null && z8e0Var.g) {
                    if (fjuVar.f) {
                        uld uldVar = z8e0Var.f;
                        if (!(uldVar instanceof old) && !(uldVar instanceof sld)) {
                            fy50Var = gy50.b;
                        }
                    }
                    a7q0 a7q0Var2 = z8e0Var.a;
                    y6q0 y6q0Var = a7q0Var2 != null ? a7q0Var2.d : null;
                    fy50Var = y6q0Var != null ? new fy50(Double.valueOf(y6q0Var.a), Long.valueOf(y6q0Var.b), Boolean.TRUE, 3) : gy50.a;
                } else {
                    fy50Var = gy50.b;
                }
                afv0 afv0Var = fjuVar.h ? (z8e0Var == null || (a7q0Var = z8e0Var.a) == null || (w6q0Var = a7q0Var.a) == null) ? null : new afv0(w6q0Var.b, fmj0Var.a, w6q0Var.a.a) : null;
                if (z8e0Var != null) {
                    e2k1 e2k1Var = z8e0Var.c;
                    if (e2k1Var != null) {
                        long j = e2k1Var.a;
                        zoy0 zoy0Var2 = z8e0Var.d;
                        if (zoy0Var2 != null) {
                            long j2 = zoy0Var2.c;
                            Long lValueOf3 = Long.valueOf(j2);
                            if (j2 <= 0) {
                                lValueOf3 = null;
                            }
                            if (lValueOf3 != null) {
                                lValueOf2 = Long.valueOf(lValueOf3.longValue() * 1000);
                            } else {
                                lValueOf2 = null;
                            }
                        } else {
                            lValueOf2 = null;
                        }
                        d2k1VarJ = e6p1.j(Long.valueOf(j), lValueOf2, yqgVar.b());
                    } else {
                        d2k1VarJ = null;
                    }
                    d2k1Var = d2k1VarJ;
                } else {
                    v740Var = v740Var;
                    d2k1Var = null;
                }
                hll hllVar2 = z8e0Var != null ? z8e0Var.b : null;
                if (hllVar2 == null || (list2 = hllVar2.b) == null) {
                    k4mVar = null;
                } else if (list2.contains(ell.d)) {
                    k4mVar = k4m.a;
                } else if (list2.contains(ell.b)) {
                    k4mVar = k4m.b;
                } else {
                    k4mVar = null;
                }
                if (z8e0Var == null || (hllVar = z8e0Var.b) == null) {
                    jfvVar = null;
                } else {
                    long j3 = hllVar.a;
                    jfvVar = new jfv(j3);
                    if (!jfv.o(j3)) {
                        jfvVar = null;
                    }
                }
                if (!l4o1.R(z8e0Var != null ? z8e0Var.d : null)) {
                    Long lZ = l4o1.z(z8e0Var != null ? z8e0Var.d : null, yqgVar);
                    if (lZ != null) {
                        lValueOf = lZ;
                    } else if (mdzVar != null) {
                        long time = mdzVar.o.a(yqgVar.d()).getTime();
                        ytw0 ytw0Var = jfv.b;
                        lValueOf = Long.valueOf(jfv.u(fdg1.l0(time, ngv.d), ngv.e));
                    } else {
                        lValueOf = null;
                    }
                } else if (z8e0Var == null || (zoy0Var = z8e0Var.d) == null) {
                    lValueOf = null;
                } else {
                    lValueOf = Long.valueOf(zoy0Var.c);
                }
                if (z8e0Var == null || (hix0Var2 = z8e0Var.e) == null) {
                    hix0Var2 = new hix0(false, 0L);
                }
                iix0 iix0Var = hix0Var2;
                l1z l1zVar2 = l1zVar;
                if (l1zVar != null) {
                    z = true;
                    boolean z9 = l1zVar2.a;
                    if (v740Var != null) {
                        z2 = z;
                    } else {
                        z2 = false;
                    }
                    if (v740Var == null) {
                        str4 = null;
                    } else {
                        if (l1zVar2 != null || l1zVar2.a != z) {
                            v740Var = null;
                        }
                        if (v740Var == null) {
                            str4 = null;
                        } else {
                            str5 = p740Var.a;
                            if (str5 != null) {
                                list = v740Var.a;
                                if (list.isEmpty()) {
                                    i540Var = null;
                                } else {
                                    it = list.iterator();
                                    do {
                                        if (it.hasNext()) {
                                            next = it.next();
                                        } else {
                                            next = null;
                                        }
                                        u740Var = (u740) next;
                                        if (u740Var != null || (wsi1Var = (wsi1) o7h.s0(u740Var.b)) == null) {
                                            str7 = null;
                                        } else {
                                            str7 = wsi1Var.a;
                                        }
                                        if (str7 != null) {
                                            i540Var = new i540(str7);
                                        } else {
                                            i540Var = j540.a;
                                        }
                                    } while (!((u740) next).a.equals(str5));
                                    u740Var = (u740) next;
                                    if (u740Var != null) {
                                        str7 = null;
                                    } else {
                                        str7 = null;
                                    }
                                    if (str7 != null) {
                                        i540Var = new i540(str7);
                                    } else {
                                        i540Var = j540.a;
                                    }
                                }
                                if (i540Var instanceof i540) {
                                    i540Var2 = (i540) i540Var;
                                } else {
                                    i540Var2 = null;
                                }
                                if (i540Var2 != null) {
                                    str6 = i540Var2.a;
                                } else {
                                    str6 = null;
                                }
                            } else {
                                str6 = null;
                            }
                            if (str6 != null || ihc1.y0(str6)) {
                                str4 = null;
                            } else {
                                str4 = str6;
                            }
                        }
                    }
                    return new z810(z8, fy50Var, afv0Var, z5, d2k1Var, k4mVar, jfvVar, lValueOf, iix0Var, z9, z6, z2, str4, str26, str27, z7);
                }
                z = true;
                if (v740Var != null) {
                    z2 = z;
                } else {
                    z2 = false;
                }
                if (v740Var == null) {
                    str4 = null;
                } else {
                    if (l1zVar2 != null) {
                        v740Var = null;
                    } else {
                        v740Var = null;
                    }
                    if (v740Var == null) {
                        str4 = null;
                    } else {
                        str5 = p740Var.a;
                        if (str5 != null) {
                            list = v740Var.a;
                            if (list.isEmpty()) {
                                i540Var = null;
                            } else {
                                it = list.iterator();
                                do {
                                    if (it.hasNext()) {
                                        next = it.next();
                                    } else {
                                        next = null;
                                    }
                                    u740Var = (u740) next;
                                    if (u740Var != null) {
                                        str7 = null;
                                    } else {
                                        str7 = null;
                                    }
                                    if (str7 != null) {
                                        i540Var = new i540(str7);
                                    } else {
                                        i540Var = j540.a;
                                    }
                                } while (!((u740) next).a.equals(str5));
                                u740Var = (u740) next;
                                if (u740Var != null) {
                                    str7 = null;
                                } else {
                                    str7 = null;
                                }
                                if (str7 != null) {
                                    i540Var = new i540(str7);
                                } else {
                                    i540Var = j540.a;
                                }
                            }
                            if (i540Var instanceof i540) {
                                i540Var2 = (i540) i540Var;
                            } else {
                                i540Var2 = null;
                            }
                            if (i540Var2 != null) {
                                str6 = i540Var2.a;
                            } else {
                                str6 = null;
                            }
                        } else {
                            str6 = null;
                        }
                        if (str6 != null) {
                            str4 = null;
                        } else {
                            str4 = null;
                        }
                    }
                }
                return new z810(z8, fy50Var, afv0Var, z5, d2k1Var, k4mVar, jfvVar, lValueOf, iix0Var, z9, z6, z2, str4, str26, str27, z7);
            case 8:
                u0q0 u0q0Var = (u0q0) this.b;
                Set set2 = (Set) this.c;
                hm5.M(obj);
                return ((y0q0) obj2).f((p0q0) obj3, u0q0Var, u0q0Var.d, set2);
            case 9:
                Set set3 = (Set) obj2;
                Throwable th = (Throwable) this.b;
                hm5.M(obj);
                if (!(th instanceof CancellationException) || (th instanceof TimeoutCancellationException)) {
                    ((su01) this.c).f("network_fetch_episode_and_audiobook_progress");
                }
                if (th != null && !(th instanceof CancellationException)) {
                    Logger.d("Failed to fetch progress for: " + set3 + ". Error: " + th, new Object[0]);
                    wr01 wr01VarN = RecentsDecorationErrorEvent.n();
                    wr01VarN.q("Failed to fetch progress for: " + set3 + ". Error: " + th);
                    wr01VarN.r("progress_decorator");
                    wr01VarN.n("data_fetch_error");
                    RecentsDecorationErrorEvent recentsDecorationErrorEventBuild = wr01VarN.build();
                    t2j0 t2j0Var = (t2j0) ((dxy) obj3).g;
                    recentsDecorationErrorEventBuild.getClass();
                    t2j0Var.a(recentsDecorationErrorEventBuild);
                }
                return rih1.a;
            case 10:
                nq01 nq01Var = (nq01) this.b;
                Set set4 = (Set) this.c;
                hm5.M(obj);
                if (set4.isEmpty()) {
                    return nq01Var;
                }
                ArrayList arrayList9 = nq01Var.a;
                ArrayList arrayList10 = new ArrayList();
                for (Object obj8 : arrayList9) {
                    if (!set4.contains(dxo1.s((cr01) obj8))) {
                        arrayList10.add(obj8);
                    }
                }
                if (arrayList10.isEmpty() && !nq01Var.a.isEmpty()) {
                    ((rq01) obj2).b.invoke(((oq01) obj3).a);
                }
                return new nq01(arrayList10);
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                k1r k1rVar = (k1r) this.b;
                k1r k1rVar2 = (k1r) this.c;
                hm5.M(obj);
                return new zaa1((xaa1) obj2, hqq0.k0(k1rVar, hqq0.e0(k1rVar2), h9a1.Z));
            default:
                k1r k1rVar3 = (k1r) this.b;
                k1r k1rVar4 = (k1r) this.c;
                hm5.M(obj);
                return ((idb1) obj2).c((qxc0) obj3, (iow0) u890.G(k1rVar3), (Integer) u890.G(k1rVar4));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t83(Object obj, Object obj2, lnm lnmVar, byte b) {
        super(3, lnmVar);
        this.a = b;
        this.d = obj;
        this.e = obj2;
    }
}
