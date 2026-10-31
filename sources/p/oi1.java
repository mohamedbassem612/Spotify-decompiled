package p;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;
import com.spotify.concertcampaignview.v1.CtaType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class oi1 implements zu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ oi1(Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = obj4;
    }

    /* JADX WARN: Code duplicated, block: B:94:0x03a2  */
    /* JADX WARN: Code duplicated, block: B:98:0x0407 A[LOOP:1: B:96:0x0401->B:98:0x0407, LOOP_END] */
    private final Object a(Object obj, Object obj2, Object obj3, Object obj4) {
        cgz cgzVar;
        cgz cgzVar2;
        he00 ge00Var;
        ArrayList arrayList;
        Iterator it;
        gpb0 gpb0Var = (gpb0) obj;
        int iIntValue = ((Number) obj2).intValue();
        x340 x340Var = (b0k) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        i7d i7dVar = (i7d) this.d;
        idd1 idd1Var = (idd1) i7dVar.Q0;
        idd1 idd1Var2 = (idd1) i7dVar.N0;
        idd1 idd1Var3 = (idd1) i7dVar.Y;
        q7r0 q7r0Var = (q7r0) i7dVar.i;
        int i = (iIntValue2 & 6) == 0 ? (x340Var.g(gpb0Var) ? 4 : 2) | iIntValue2 : iIntValue2;
        if ((iIntValue2 & 48) == 0) {
            i |= x340Var.e(iIntValue) ? 32 : 16;
        }
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(i & 1, (i & 147) != 146)) {
            Object obj5 = ((ArrayList) this.c).get(iIntValue);
            x340Var2.i0(1217650069);
            if (obj5 instanceof udk) {
                x340Var2.i0(-376370275);
                i1o1.e((tyq) ((idd1) i7dVar.Z).getValue(), obj5, cwl1.C(q7r0Var), null, null, gni.a, gni.b, 0, null, x340Var2, 1769472, 204);
                x340Var2.r(false);
            } else if (obj5 instanceof z800) {
                x340Var2.i0(-376359924);
                i1o1.e((tyq) idd1Var3.getValue(), new tek(((z800) obj5).b, 1, 56, false), cwl1.C(q7r0Var), null, null, gni.c, gni.d, 0, null, x340Var2, 1769472, 204);
                x340Var2.r(false);
            } else if (obj5 instanceof tqm0) {
                x340Var2.i0(-376337944);
                i1o1.e((yqm0) idd1Var2.getValue(), obj5, cwl1.C(q7r0Var), null, null, gni.e, gni.f, 0, null, x340Var2, 1769480, 204);
                x340Var2.r(false);
            } else {
                boolean z = obj5 instanceof sh51;
                nim0 nim0Var = nim0.a;
                if (z) {
                    x340Var2.i0(-376329757);
                    sh51 sh51Var = (sh51) obj5;
                    otw.c((na9) i7dVar.O0, new qh51(16, sh51Var.a, sh51Var.b, sh51Var.d, sh51Var.c), u291.f(nim0Var, 1.0f), (ipb1) null, x340Var2, 8, 8);
                    x340Var2.r(false);
                } else if (obj5 instanceof oi00) {
                    x340Var2.i0(-376315186);
                    hz5 hz5Var = (hz5) i7dVar.e;
                    ni00 ni00Var = ((oi00) obj5).a;
                    otw.c(hz5Var, new r7w(ni00Var.a, ni00Var.b, ni00Var.c, ni00Var.d, (iu30) this.b), u291.f(nim0Var, 1.0f), (ipb1) null, x340Var2, 0, 8);
                    x340Var2.r(false);
                } else if (obj5 instanceof if00) {
                    x340Var2.i0(1219678150);
                    if (((xrk) i7dVar.h).g) {
                        x340Var2.i0(1219733609);
                        i7dVar.b((if00) obj5, x340Var2, 0);
                        x340Var2.r(false);
                    } else {
                        x340Var2.i0(1219790215);
                        i7dVar.a((if00) obj5, (iu30) this.e, x340Var2, 0);
                        x340Var2.r(false);
                    }
                    x340Var2.r(false);
                } else if (obj5 instanceof vi00) {
                    x340Var2.i0(1219922678);
                    tyq tyqVar = (tyq) idd1Var3.getValue();
                    vi00 vi00Var = (vi00) obj5;
                    String string = vi00Var.b.toString();
                    String str = vi00Var.c;
                    Integer num = vi00Var.d;
                    i1o1.e(tyqVar, new tek(3, num, num, string, str, false), cwl1.C(q7r0Var), null, null, gni.g, gni.h, 0, null, x340Var2, 1769472, 204);
                    x340Var2.r(false);
                } else if (obj5 instanceof wi00) {
                    x340Var2.i0(1220617977);
                    yqm0 yqm0Var = (yqm0) idd1Var2.getValue();
                    wi00 wi00Var = (wi00) obj5;
                    List list = wi00Var.b;
                    ArrayList arrayList2 = new ArrayList(q7h.U(list, 10));
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(((y6b1) it2.next()).toString());
                    }
                    String str2 = wi00Var.c;
                    Integer num2 = wi00Var.d;
                    i1o1.e(yqm0Var, new tqm0(arrayList2, 2, str2, num2, num2), cwl1.C(q7r0Var), null, null, gni.i, gni.j, 0, null, x340Var2, 1769480, 204);
                    x340Var2.r(false);
                } else if (obj5 instanceof aj00) {
                    x340Var2.i0(1221332961);
                    aj00 aj00Var = (aj00) obj5;
                    Integer num3 = aj00Var.d;
                    y6b1 y6b1Var = aj00Var.b;
                    v6b1 v6b1Var = y6b1Var.c;
                    if (v6b1Var == v6b1.S1) {
                        x340Var2.i0(1221365976);
                        i1o1.e((tyq) idd1Var3.getValue(), new tek(2, num3, num3, y6b1Var.toString(), aj00Var.c, false), cwl1.C(q7r0Var), null, null, gni.k, gni.l, 0, null, x340Var2, 1769472, 204);
                        x340Var2.r(false);
                    } else if (v6b1Var == v6b1.h || v6b1Var == v6b1.O0) {
                        x340Var2.i0(1222160971);
                        l63 l63Var = (l63) idd1Var.getValue();
                        h63 h63Var = new h63(2, num3, num3, y6b1Var.toString(), aj00Var.c);
                        d0r d0rVarC = cwl1.C(q7r0Var);
                        j2i j2iVar = gni.m;
                        j2i j2iVar2 = gni.n;
                        o3r o3rVar = l63.h;
                        i1o1.e(l63Var, h63Var, d0rVarC, null, null, j2iVar, j2iVar2, 0, null, x340Var2, 1769480, 204);
                        x340Var2.r(false);
                    } else {
                        x340Var2.i0(1222792348);
                        x340Var2.r(false);
                    }
                    x340Var2.r(false);
                } else {
                    v6b1 v6b1Var2 = null;
                    if (obj5 instanceof bj00) {
                        x340Var2.i0(1222908257);
                        bj00 bj00Var = (bj00) obj5;
                        Integer num4 = bj00Var.d;
                        List list2 = bj00Var.b;
                        List list3 = list2;
                        if ((list3 instanceof Collection) && list3.isEmpty()) {
                            x340Var2.i0(1222951037);
                            yqm0 yqm0Var2 = (yqm0) idd1Var2.getValue();
                            arrayList = new ArrayList(q7h.U(list3, 10));
                            it = list3.iterator();
                            while (it.hasNext()) {
                                arrayList.add(((y6b1) it.next()).toString());
                            }
                            i1o1.e(yqm0Var2, new tqm0(arrayList, 3, bj00Var.c, num4, num4), cwl1.C(q7r0Var), null, null, gni.o, gni.p, 0, null, x340Var2, 1769480, 204);
                            x340Var2.r(false);
                        } else {
                            Iterator it3 = list3.iterator();
                            while (true) {
                                if (!it3.hasNext()) {
                                    x340Var2.i0(1222951037);
                                    yqm0 yqm0Var3 = (yqm0) idd1Var2.getValue();
                                    arrayList = new ArrayList(q7h.U(list3, 10));
                                    it = list3.iterator();
                                    while (it.hasNext()) {
                                        arrayList.add(((y6b1) it.next()).toString());
                                    }
                                    i1o1.e(yqm0Var3, new tqm0(arrayList, 3, bj00Var.c, num4, num4), cwl1.C(q7r0Var), null, null, gni.o, gni.p, 0, null, x340Var2, 1769480, 204);
                                    x340Var2.r(false);
                                } else if (((y6b1) it3.next()).c != v6b1.S1) {
                                    y6b1 y6b1Var2 = (y6b1) o7h.s0(list2);
                                    if ((y6b1Var2 != null ? y6b1Var2.c : null) == v6b1.h) {
                                        x340Var2.i0(1223789122);
                                        l63 l63Var2 = (l63) idd1Var.getValue();
                                        h63 h63Var2 = new h63(2, num4, num4, ((y6b1) o7h.q0(list2)).toString(), bj00Var.c);
                                        d0r d0rVarC2 = cwl1.C(q7r0Var);
                                        j2i j2iVar3 = gni.q;
                                        j2i j2iVar4 = gni.r;
                                        o3r o3rVar2 = l63.h;
                                        i1o1.e(l63Var2, h63Var2, d0rVarC2, null, null, j2iVar3, j2iVar4, 0, null, x340Var2, 1769480, 204);
                                        x340Var2.r(false);
                                    } else {
                                        y6b1 y6b1Var3 = (y6b1) o7h.s0(list2);
                                        if ((y6b1Var3 != null ? y6b1Var3.c : null) == v6b1.O0) {
                                            x340Var2.i0(1223789122);
                                            l63 l63Var3 = (l63) idd1Var.getValue();
                                            h63 h63Var3 = new h63(2, num4, num4, ((y6b1) o7h.q0(list2)).toString(), bj00Var.c);
                                            d0r d0rVarC3 = cwl1.C(q7r0Var);
                                            j2i j2iVar5 = gni.q;
                                            j2i j2iVar6 = gni.r;
                                            o3r o3rVar3 = l63.h;
                                            i1o1.e(l63Var3, h63Var3, d0rVarC3, null, null, j2iVar5, j2iVar6, 0, null, x340Var2, 1769480, 204);
                                            x340Var2.r(false);
                                        } else {
                                            x340Var2.i0(1224429148);
                                            x340Var2.r(false);
                                        }
                                    }
                                }
                            }
                        }
                        x340Var2.r(false);
                    } else if (obj5 instanceof yi00) {
                        x340Var2.i0(-376140783);
                        tyq tyqVar2 = (tyq) ((idd1) i7dVar.P0).getValue();
                        yi00 yi00Var = (yi00) obj5;
                        String string2 = yi00Var.b.toString();
                        String str3 = yi00Var.c;
                        Integer num5 = yi00Var.d;
                        i1o1.e(tyqVar2, new vqk(string2, (af5) null, (u7h) null, true, 1, 2, false, false, (u7h) null, str3, num5, num5, 3854), cwl1.C(q7r0Var), null, null, gni.s, gni.t, 0, null, x340Var2, 1769536, 204);
                        x340Var2.r(false);
                    } else if (obj5 instanceof ii00) {
                        x340Var2.i0(-376115570);
                        tyq tyqVar3 = (tyq) idd1Var3.getValue();
                        ii00 ii00Var = (ii00) obj5;
                        String string3 = ii00Var.b.toString();
                        String str4 = ii00Var.c;
                        Integer num6 = ii00Var.d;
                        i1o1.e(tyqVar3, new tek(1, num6, num6, string3, str4, false), cwl1.C(q7r0Var), null, null, gni.u, gni.v, 0, null, x340Var2, 1769472, 204);
                        x340Var2.r(false);
                    } else if (obj5 instanceof ji00) {
                        x340Var2.i0(-376093465);
                        yqm0 yqm0Var4 = (yqm0) idd1Var2.getValue();
                        List list4 = ((ji00) obj5).b;
                        ArrayList arrayList3 = new ArrayList(q7h.U(list4, 10));
                        Iterator it4 = list4.iterator();
                        while (it4.hasNext()) {
                            arrayList3.add(((y6b1) it4.next()).toString());
                        }
                        i1o1.e(yqm0Var4, new tqm0(arrayList3), cwl1.C(q7r0Var), null, null, gni.w, gni.x, 0, null, x340Var2, 1769480, 204);
                        x340Var2.r(false);
                    } else if (obj5 instanceof ki00) {
                        x340Var2.i0(-376080585);
                        me00 me00Var = (me00) ((idd1) i7dVar.X).getValue();
                        ki00 ki00Var = (ki00) obj5;
                        ArrayList<y6b1> arrayList4 = ki00Var.b;
                        ArrayList arrayList5 = new ArrayList();
                        for (y6b1 y6b1Var4 : arrayList4) {
                            v6b1 v6b1Var3 = y6b1Var4.c;
                            if (v6b1Var3 == v6b1.S1) {
                                ge00Var = new he00(y6b1Var4.toString());
                            } else if (v6b1Var3 == v6b1.f4) {
                                ge00Var = new je00(y6b1Var4.toString());
                            } else {
                                ge00Var = (v6b1Var3 == v6b1.h || v6b1Var3 == v6b1.O0) ? new ge00(y6b1Var4.toString()) : null;
                            }
                            if (ge00Var != null) {
                                arrayList5.add(ge00Var);
                            }
                        }
                        String str5 = ki00Var.c;
                        if (str5 == null) {
                            str5 = "carousel";
                        }
                        i1o1.e(me00Var, new le00(iIntValue, ki00Var.d, str5, arrayList5), cwl1.C(q7r0Var), null, null, gni.y, null, 0, null, x340Var2, 196616, 236);
                        x340Var2.r(false);
                    } else if (obj5 instanceof pi00) {
                        x340Var2.i0(-376044004);
                        fqg0 fqg0VarU = q1o1.u((z8x) i7dVar.g, null, null, 7);
                        dgz dgzVar = ((pi00) obj5).a.b;
                        String str6 = dgzVar != null ? dgzVar.a : null;
                        if (str6 == null) {
                            str6 = "";
                        }
                        String str7 = str6;
                        String str8 = dgzVar != null ? dgzVar.b : null;
                        String str9 = (dgzVar == null || (cgzVar2 = dgzVar.c) == null) ? null : cgzVar2.a;
                        if (dgzVar != null && (cgzVar = dgzVar.c) != null) {
                            v6b1Var2 = cgzVar.b;
                        }
                        otw.c(fqg0VarU, new y8x(str7, str8, str9, v6b1Var2, dgzVar != null && dgzVar.d), u291.f(nim0Var, 1.0f), (ipb1) null, x340Var2, 0, 8);
                        x340Var2.r(false);
                    } else {
                        x340Var2.i0(1228101594);
                        x340Var2.r(false);
                    }
                }
            }
            x340Var2.r(false);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }

    private final Object d(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        aqb0 aqb0Var = (aqb0) obj;
        int iIntValue = ((Number) obj2).intValue();
        x340 x340Var = (b0k) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        if ((iIntValue2 & 6) == 0) {
            i = (x340Var.g(aqb0Var) ? 4 : 2) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i |= x340Var.e(iIntValue) ? 32 : 16;
        }
        boolean z = true;
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(i & 1, (i & 147) != 146)) {
            aoe0 aoe0Var = (aoe0) ((List) this.c).get(iIntValue);
            x340Var2.i0(-510453550);
            Object obj5 = this.d;
            boolean zI = x340Var2.i((k6a1) obj5);
            Object obj6 = this.e;
            boolean zI2 = zI | x340Var2.i((az20) obj6);
            Object obj7 = this.b;
            boolean zG = zI2 | x340Var2.g((vu30) obj7) | x340Var2.i(aoe0Var);
            if ((((i & 112) ^ 48) <= 32 || !x340Var2.e(iIntValue)) && (i & 48) != 32) {
                z = false;
            }
            boolean z2 = zG | z;
            Object objT = x340Var2.T();
            if (z2 || objT == fkj0.X) {
                lzm lzmVar = new lzm((k6a1) obj5, (az20) obj6, (vu30) obj7, aoe0Var, iIntValue);
                x340Var2.s0(lzmVar);
                objT = lzmVar;
            }
            t9p1.c(aoe0Var, (Function0) objT, null, x340Var2, 0);
            x340Var2.r(false);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }

    private final Object e(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        String strK;
        aqb0 aqb0Var = (aqb0) obj;
        int iIntValue = ((Number) obj2).intValue();
        x340 x340Var = (b0k) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        if ((iIntValue2 & 6) == 0) {
            i = (x340Var.g(aqb0Var) ? 4 : 2) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i |= x340Var.e(iIntValue) ? 32 : 16;
        }
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(i & 1, (i & 147) != 146)) {
            vcj0 vcj0Var = (vcj0) ((List) this.c).get(iIntValue);
            x340Var2.i0(-1987984994);
            List listSingletonList = Collections.singletonList(vcj0Var.a);
            String str = vcj0Var.a.b;
            Integer numR = sto1.r(vcj0Var.b);
            if (numR == null) {
                x340Var2.i0(-1987808420);
                x340Var2.r(false);
                strK = null;
            } else {
                strK = kk0.k(x340Var2, -1987808419, numR, x340Var2, false);
            }
            ero1.f(new rgi1(listSingletonList, str, strK, new mgi1(new ogi1(apo.r(-1782488488, new rvg0((scj0) this.e, vcj0Var, (iu30) this.b, (byte) 20), x340Var2)))), (Function0) null, (gw70) this.d, (qim0) null, x340Var2, 48, 8);
            x340Var2.r(false);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }

    private final Object f(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        String str;
        aqb0 aqb0Var = (aqb0) obj;
        int iIntValue = ((Number) obj2).intValue();
        x340 x340Var = (b0k) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        if ((iIntValue2 & 6) == 0) {
            i = (x340Var.g(aqb0Var) ? 4 : 2) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i |= x340Var.e(iIntValue) ? 32 : 16;
        }
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(i & 1, (i & 147) != 146)) {
            qgs0 qgs0Var = (qgs0) ((ArrayList) this.c).get(iIntValue);
            x340Var2.i0(-228070206);
            pjp pjpVar = (pjp) this.d;
            lbl0 lbl0Var = (lbl0) this.e;
            vu60 vu60Var = (vu60) ((lw60) ((a680) pjpVar.a.c).a).g.get();
            c8o.l(vu60Var);
            ngs0 ngs0Var = new ngs0(vu60Var, lbl0Var);
            pgs0 pgs0Var = qgs0Var.a;
            String str2 = qgs0Var.b;
            otw.c(ngs0Var, new mgs0(iIntValue, pgs0Var != null ? pgs0Var.c : null, (pgs0Var == null || (str = pgs0Var.b) == null) ? str2 : str, str2, qgs0Var.c, ((tgs0) this.b).c), u291.f(nim0.a, 1.0f), (ipb1) null, x340Var2, 0, 8);
            x340Var2.r(false);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private final Object g(Object obj, Object obj2, Object obj3, Object obj4) throws NoWhenBranchMatchedException {
        int i;
        gpb0 gpb0Var = (gpb0) obj;
        int iIntValue = ((Number) obj2).intValue();
        x340 x340Var = (b0k) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        if ((iIntValue2 & 6) == 0) {
            i = (x340Var.g(gpb0Var) ? 4 : 2) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i |= x340Var.e(iIntValue) ? 32 : 16;
        }
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(i & 1, (i & 147) != 146)) {
            hxs0 hxs0Var = (jxs0) ((List) this.c).get(iIntValue);
            x340Var2.i0(-1524977101);
            pxg1 pxg1VarO0 = irn1.o0(CtaType.CTA_JOIN_WAITLIST_FIELD_NUMBER, 0, null, 6);
            ni20 ni20VarO0 = ((jua0) this.d).a ? null : irn1.o0(250, 0, null, 6);
            gpb0Var.getClass();
            lrb0 lrb0Var = new lrb0(pxg1VarO0, ni20VarO0, (ni20) null);
            if (hxs0Var instanceof ixs0) {
                x340Var2.i0(1890478592);
                ows0.g(lrb0Var, x340Var2, 0);
                x340Var2.r(false);
            } else if (hxs0Var instanceof hxs0) {
                x340Var2.i0(1890481079);
                ows0.f(0, hxs0Var.a, x340Var2, lrb0Var);
                x340Var2.r(false);
            } else {
                if (!(hxs0Var instanceof gxs0)) {
                    throw p3d1.k(x340Var2, 1890477311, false);
                }
                x340Var2.i0(1890484433);
                cuo1.u((gxs0) hxs0Var, iIntValue, (iu30) this.b, lrb0Var.then((qim0) this.e), x340Var2, i & 112);
                x340Var2.r(false);
            }
            x340Var2.r(false);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }

    private final Object h(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        aqb0 aqb0Var = (aqb0) obj;
        int iIntValue = ((Number) obj2).intValue();
        x340 x340Var = (b0k) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        iu30 iu30Var = (iu30) this.b;
        ss50 ss50Var = (ss50) this.e;
        if ((iIntValue2 & 6) == 0) {
            i = (x340Var.g(aqb0Var) ? 4 : 2) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i |= x340Var.e(iIntValue) ? 32 : 16;
        }
        boolean z = true;
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(i & 1, (i & 147) != 146)) {
            s201 s201Var = (s201) ((List) this.c).get(iIntValue);
            x340Var2.i0(-702544605);
            String str = s201Var.a;
            boolean z2 = iIntValue == ((w201) this.d).b.intValue();
            boolean zI = x340Var2.i(ss50Var) | x340Var2.g(iu30Var) | x340Var2.i(s201Var);
            if ((((i & 112) ^ 48) <= 32 || !x340Var2.e(iIntValue)) && (i & 48) != 32) {
                z = false;
            }
            boolean z3 = zI | z;
            Object objT = x340Var2.T();
            if (z3 || objT == fkj0.X) {
                ka0 ka0Var = new ka0(ss50Var, iu30Var, s201Var, iIntValue, (byte) 11);
                x340Var2.s0(ka0Var);
                objT = ka0Var;
            }
            iqo1.c(0, str, (Function0) objT, x340Var2, null, z2);
            x340Var2.r(false);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }

    private final Object i(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        n9d1 n9d1Var;
        aqb0 aqb0Var = (aqb0) obj;
        int iIntValue = ((Number) obj2).intValue();
        x340 x340Var = (b0k) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        if ((iIntValue2 & 6) == 0) {
            i = (x340Var.g(aqb0Var) ? 4 : 2) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i |= x340Var.e(iIntValue) ? 32 : 16;
        }
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(i & 1, (i & 147) != 146)) {
            wx71 wx71Var = (wx71) ((List) this.c).get(iIntValue);
            x340Var2.i0(-1793456976);
            String str = wx71Var.e;
            Set set = ((xx71) this.d).f42p;
            Set set2 = s4b1.f;
            boolean zI0 = o7h.i0(set, uic.x(str).z());
            boolean zG = x340Var2.g(str) | x340Var2.h(zI0);
            Object objT = x340Var2.T();
            if (zG || objT == fkj0.X) {
                r9y0 r9y0Var = new r9y0((ven0) this.e, (byte) 29);
                n9d1 n9d1Var2 = null;
                if (nzy.g(str) || nzy.c(str)) {
                    n9d1Var = new n9d1(1, new by71(r9y0Var, str, (byte) 0), vjx.c);
                } else {
                    n9d1Var = null;
                }
                if (r4p1.s(str)) {
                    n9d1Var2 = new n9d1(zI0 ? 3 : 1, new by71(r9y0Var, str, (byte) 1), zI0 ? bpx.c : klx.c);
                }
                objT = new dqf(n9d1Var, n9d1Var2);
                x340Var2.s0(objT);
            }
            dqf dqfVar = (dqf) objT;
            n9d1 n9d1Var3 = dqfVar.a;
            n9d1 n9d1Var4 = dqfVar.b;
            uwr uwrVar = cbx.a;
            puo1.b(n9d1Var3, n9d1Var4, dug.f(nim0.a, cbx.a(x340Var2).a.c, d4o1.a), apo.r(-132262377, new jt41((ze71) this.b, wx71Var, (byte) 28), x340Var2), x340Var2, 3072);
            x340Var2.r(false);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }

    private final Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        aqb0 aqb0Var = (aqb0) obj;
        int iIntValue = ((Number) obj2).intValue();
        x340 x340Var = (b0k) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        iu30 iu30Var = (iu30) this.b;
        if ((iIntValue2 & 6) == 0) {
            i = (x340Var.g(aqb0Var) ? 4 : 2) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i |= x340Var.e(iIntValue) ? 32 : 16;
        }
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(i & 1, (i & 147) != 146)) {
            asc1 asc1Var = (asc1) ((List) this.c).get(iIntValue);
            x340Var2.i0(-286627763);
            String strK = q0o1.k(asc1Var, (Context) ((rwj) this.d).d);
            boolean zJ = u890.j(((bsc1) this.e).a, asc1Var.b);
            boolean zG = x340Var2.g(iu30Var) | x340Var2.g(asc1Var);
            Object objT = x340Var2.T();
            if (zG || objT == fkj0.X) {
                objT = new k7a1(iu30Var, asc1Var, (byte) 19);
                x340Var2.s0(objT);
            }
            gbx gbxVar = new gbx(z50.c, (Function0) objT);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var2).b;
            ozn1.f(strK, gbxVar, uyn1.z(8.0f, 0.0f, 2, nim0.a), zJ, x340Var2, 0);
            x340Var2.r(false);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) throws NoWhenBranchMatchedException {
        boolean z;
        String strN0;
        boolean z2;
        boolean z3;
        boolean z4;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj5 = this.c;
        Object obj6 = this.b;
        Object obj7 = this.e;
        Object obj8 = this.d;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                aqb0 aqb0Var = (aqb0) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var = (b0k) obj3;
                int iIntValue2 = ((Number) obj4).intValue();
                iu30 iu30Var = (iu30) obj6;
                int i = (iIntValue2 & 6) == 0 ? iIntValue2 | (x340Var.g(aqb0Var) ? 4 : 2) : iIntValue2;
                if ((iIntValue2 & 48) == 0) {
                    i |= x340Var.e(iIntValue) ? 32 : 16;
                }
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(i & 1, (i & 147) != 146)) {
                    h6q0 h6q0Var = (h6q0) ((List) obj5).get(iIntValue);
                    x340Var2.i0(-1524947897);
                    gv51 gv51Var = (gv51) obj8;
                    boolean z5 = ((gj1) obj7).h.get(h6q0Var.a.a) != null;
                    boolean zG = x340Var2.g(iu30Var) | x340Var2.i(h6q0Var) | ((((i & 112) ^ 48) > 32 && x340Var2.e(iIntValue)) || (i & 48) == 32);
                    Object objT = x340Var2.T();
                    if (zG || objT == fkj0.X) {
                        objT = new mi1(iu30Var, h6q0Var, iIntValue, (byte) 0);
                        x340Var2.s0(objT);
                    }
                    iu30 iu30Var2 = (iu30) objT;
                    w4i1 w4i1Var = h6q0Var.a;
                    String strZ = h6q0Var.b().z();
                    if (strZ == null) {
                        strZ = "";
                    }
                    otw.c(gv51Var, new ev51(w4i1Var, z5, iIntValue, 2, strZ, iu30Var2), (qim0) null, (ipb1) null, x340Var2, 0, 12);
                    x340Var2.r(false);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 1:
                aqb0 aqb0Var2 = (aqb0) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                x340 x340Var3 = (b0k) obj3;
                int iIntValue4 = ((Number) obj4).intValue();
                iu30 iu30Var3 = (iu30) obj6;
                int i2 = (iIntValue4 & 6) == 0 ? iIntValue4 | (x340Var3.g(aqb0Var2) ? 4 : 2) : iIntValue4;
                if ((iIntValue4 & 48) == 0) {
                    i2 |= x340Var3.e(iIntValue3) ? 32 : 16;
                }
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(i2 & 1, (i2 & 147) != 146)) {
                    zm7 zm7Var = (zm7) ((ArrayList) obj5).get(iIntValue3);
                    x340Var4.i0(-1465178542);
                    kko kkoVar = (kko) obj8;
                    rzo rzoVar = (rzo) obj7;
                    boolean zG2 = x340Var4.g(iu30Var3) | x340Var4.i(zm7Var);
                    Object objT2 = x340Var4.T();
                    if (zG2 || objT2 == fkj0.X) {
                        objT2 = new nx2(iu30Var3, zm7Var, (byte) 20);
                        x340Var4.s0(objT2);
                    }
                    l6o1.c(zm7Var, kkoVar, rzoVar, (Function0) objT2, null, x340Var4, 8);
                    x340Var4.r(false);
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
            case 2:
                aqb0 aqb0Var3 = (aqb0) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                x340 x340Var5 = (b0k) obj3;
                int iIntValue6 = ((Number) obj4).intValue();
                vu30 vu30Var = (vu30) obj8;
                int i3 = (iIntValue6 & 6) == 0 ? iIntValue6 | (x340Var5.g(aqb0Var3) ? 4 : 2) : iIntValue6;
                if ((iIntValue6 & 48) == 0) {
                    i3 |= x340Var5.e(iIntValue5) ? 32 : 16;
                }
                x340 x340Var6 = x340Var5;
                if (x340Var6.Y(i3 & 1, (i3 & 147) != 146)) {
                    tkf tkfVar = (tkf) ((List) obj5).get(iIntValue5);
                    x340Var6.i0(-474027969);
                    boolean zG3 = x340Var6.g(vu30Var) | x340Var6.i(tkfVar) | ((((i3 & 112) ^ 48) > 32 && x340Var6.e(iIntValue5)) || (i3 & 48) == 32);
                    Object objT3 = x340Var6.T();
                    if (zG3 || objT3 == fkj0.X) {
                        objT3 = new u0f(vu30Var, tkfVar, iIntValue5, (byte) 0);
                        x340Var6.s0(objT3);
                    }
                    yto1.c(tkfVar, (Function0) objT3, (iu30) obj6, null, x340Var6, 0);
                    if (iIntValue5 != p7h.L((c380) obj7)) {
                        x340Var6.i0(-473827121);
                        z = false;
                        upo1.c(x340Var6, 0);
                        x340Var6.r(false);
                    } else {
                        z = false;
                        x340Var6.i0(-473786759);
                        x340Var6.r(false);
                    }
                    x340Var6.r(z);
                } else {
                    x340Var6.b0();
                }
                return rih1Var;
            case 3:
                aqb0 aqb0Var4 = (aqb0) obj;
                int iIntValue7 = ((Number) obj2).intValue();
                x340 x340Var7 = (b0k) obj3;
                int iIntValue8 = ((Number) obj4).intValue();
                jwm jwmVar = (jwm) obj6;
                abf abfVar = (abf) obj7;
                int i4 = (iIntValue8 & 6) == 0 ? iIntValue8 | (x340Var7.g(aqb0Var4) ? 4 : 2) : iIntValue8;
                if ((iIntValue8 & 48) == 0) {
                    i4 |= x340Var7.e(iIntValue7) ? 32 : 16;
                }
                x340 x340Var8 = x340Var7;
                if (x340Var8.Y(i4 & 1, (i4 & 147) != 146)) {
                    oe90 oe90Var = (oe90) ((c380) obj5).get(iIntValue7);
                    x340Var8.i0(2021643589);
                    b921 b921Var = (b921) obj8;
                    String strD = pcf.d(6, abfVar.b, null);
                    String strO0 = cwl1.o0(x340Var8, 2131953313);
                    String str = abfVar.c;
                    w4i1 w4i1Var2 = oe90Var.b;
                    if (u890.j(str, w4i1Var2.a)) {
                        strN0 = x0d.k(x340Var8, 2021947915, 2131953312, x340Var8, false);
                    } else {
                        x340Var8.i0(2022073093);
                        strN0 = cwl1.n0(2131953311, new Object[]{w4i1Var2.b}, x340Var8);
                        x340Var8.r(false);
                    }
                    otw.c(b921Var, new w821(strD, oe90Var.a, strO0, strN0, u890.j(w4i1Var2.a, jwmVar.a.a) || u890.j(jwmVar.b, zvm.a), new m821(cwl1.o0(x340Var8, 2131953308), cwl1.o0(x340Var8, 2131953307), cwl1.o0(x340Var8, 2131953306), cwl1.o0(x340Var8, 2131953305)), iIntValue7), (qim0) null, (ipb1) null, x340Var8, 0, 12);
                    x340Var8.r(false);
                } else {
                    x340Var8.b0();
                }
                return rih1Var;
            case 4:
                llj lljVar = y580.Y;
                llj lljVar2 = y580.R0;
                llj lljVar3 = y580.N0;
                llj lljVar4 = y580.O0;
                aqb0 aqb0Var5 = (aqb0) obj;
                int iIntValue9 = ((Number) obj2).intValue();
                x340 x340Var9 = (b0k) obj3;
                int iIntValue10 = ((Number) obj4).intValue();
                iu30 iu30Var4 = (iu30) obj6;
                m4c m4cVar = fkj0.X;
                gra graVar = een.d;
                i7d i7dVar = (i7d) obj8;
                bjx bjxVar = (bjx) i7dVar.Y;
                q7r0 q7r0Var = (q7r0) i7dVar.X;
                int i5 = (iIntValue10 & 6) == 0 ? iIntValue10 | (x340Var9.g(aqb0Var5) ? 4 : 2) : iIntValue10;
                if ((iIntValue10 & 48) == 0) {
                    i5 |= x340Var9.e(iIntValue9) ? 32 : 16;
                }
                x340 x340Var10 = x340Var9;
                boolean zY = x340Var10.Y(i5 & 1, (i5 & 147) != 146);
                j06 j06Var = x340Var10.a;
                if (zY) {
                    Object obj9 = ((ArrayList) obj5).get(iIntValue9);
                    x340Var10.i0(-429051946);
                    boolean z6 = obj9 instanceof gx6;
                    nim0 nim0Var = nim0.a;
                    n4k n4kVar = hmb0.t1;
                    if (z6) {
                        x340Var10.i0(-429248394);
                        uwr uwrVar = cbx.a;
                        cvx cvxVar = cbx.b(x340Var10).b;
                        cvx cvxVar2 = cbx.b(x340Var10).b;
                        qim0 qim0VarY = uyn1.y(nim0Var, 16.0f, 8.0f);
                        gfh0 gfh0VarC = t1c.c(graVar, false);
                        int iHashCode = Long.hashCode(x340Var10.T);
                        xos0 xos0VarM = x340Var10.m();
                        qim0 qim0VarE = zr7.E(x340Var10, qim0VarY);
                        hzj.A.getClass();
                        if (j06Var == null) {
                            tgp1.p();
                            throw null;
                        }
                        x340Var10.m0();
                        if (x340Var10.S) {
                            x340Var10.l(n4kVar);
                        } else {
                            x340Var10.v0();
                        }
                        nko1.H(gfh0VarC, x340Var10, lljVar4);
                        nko1.H(xos0VarM, x340Var10, lljVar3);
                        x0d.q(iHashCode, x340Var10, lljVar2, x340Var10);
                        nko1.H(qim0VarE, x340Var10, lljVar);
                        gx6 gx6Var = (gx6) obj9;
                        i1o1.e(ggr.a((ggr) i7dVar.h, cwl1.C(q7r0Var)), new gx6(gx6Var.a, gx6Var.b, true), cwl1.C(q7r0Var), null, null, kei.a, null, 0, null, x340Var10, 196616, 236);
                        x340Var10.r(true);
                        z3 = false;
                        x340Var10.r(false);
                    } else if (obj9 instanceof bqm0) {
                        x340Var10.i0(-428517538);
                        Object objT4 = x340Var10.T();
                        if (objT4 == m4cVar) {
                            objT4 = ((lbs) i7dVar.i).a.a(cwl1.C(q7r0Var));
                            x340Var10.s0(objT4);
                        }
                        i1o1.e((jqm0) objT4, new gqm0(((bqm0) obj9).c, 1), cwl1.C(q7r0Var), null, null, kei.b, null, 0, null, x340Var10, 196616, 236);
                        z3 = false;
                        x340Var10.r(false);
                    } else if (obj9 instanceof vqk) {
                        x340Var10.i0(-428115375);
                        uwr uwrVar2 = cbx.a;
                        cvx cvxVar3 = cbx.b(x340Var10).b;
                        cvx cvxVar4 = cbx.b(x340Var10).b;
                        qim0 qim0VarY2 = uyn1.y(nim0Var, 16.0f, 8.0f);
                        gfh0 gfh0VarC2 = t1c.c(graVar, false);
                        int iHashCode2 = Long.hashCode(x340Var10.T);
                        xos0 xos0VarM2 = x340Var10.m();
                        qim0 qim0VarE2 = zr7.E(x340Var10, qim0VarY2);
                        hzj.A.getClass();
                        if (j06Var == null) {
                            tgp1.p();
                            throw null;
                        }
                        x340Var10.m0();
                        if (x340Var10.S) {
                            x340Var10.l(n4kVar);
                        } else {
                            x340Var10.v0();
                        }
                        nko1.H(gfh0VarC2, x340Var10, lljVar4);
                        nko1.H(xos0VarM2, x340Var10, lljVar3);
                        x0d.q(iHashCode2, x340Var10, lljVar2, x340Var10);
                        nko1.H(qim0VarE2, x340Var10, lljVar);
                        i1o1.e(((bnr) i7dVar.f).a(cwl1.C(q7r0Var)), new vqk(((vqk) obj9).a, (af5) null, (u7h) null, false, 1, 2, false, false, (u7h) null, (String) null, (Integer) null, (Integer) null, 32654), cwl1.C(q7r0Var), null, null, kei.c, null, 0, null, x340Var10, 196672, 236);
                        x340Var10.r(true);
                        z3 = false;
                        x340Var10.r(false);
                    } else if (obj9 instanceof lvt0) {
                        x340Var10.i0(-427268610);
                        uwr uwrVar3 = cbx.a;
                        cvx cvxVar5 = cbx.b(x340Var10).b;
                        cvx cvxVar6 = cbx.b(x340Var10).b;
                        qim0 qim0VarY3 = uyn1.y(nim0Var, 16.0f, 8.0f);
                        gfh0 gfh0VarC3 = t1c.c(graVar, false);
                        int iHashCode3 = Long.hashCode(x340Var10.T);
                        xos0 xos0VarM3 = x340Var10.m();
                        qim0 qim0VarE3 = zr7.E(x340Var10, qim0VarY3);
                        hzj.A.getClass();
                        if (j06Var == null) {
                            tgp1.p();
                            throw null;
                        }
                        x340Var10.m0();
                        if (x340Var10.S) {
                            x340Var10.l(n4kVar);
                        } else {
                            x340Var10.v0();
                        }
                        nko1.H(gfh0VarC3, x340Var10, lljVar4);
                        nko1.H(xos0VarM3, x340Var10, lljVar3);
                        x0d.q(iHashCode3, x340Var10, lljVar2, x340Var10);
                        nko1.H(qim0VarE3, x340Var10, lljVar);
                        lvt0 lvt0Var = (lvt0) obj9;
                        i1o1.e(((afs) i7dVar.e).a((u9u0) i7dVar.t, cwl1.C(q7r0Var)), new lvt0(lvt0Var.a, lvt0Var.b, lvt0Var.c), cwl1.C(q7r0Var), null, null, kei.d, null, 0, null, x340Var10, 196616, 236);
                        x340Var10.r(true);
                        z3 = false;
                        x340Var10.r(false);
                    } else if (obj9 instanceof qh51) {
                        x340Var10.i0(-426398626);
                        if (o7h.t0(iIntValue9 + 1, (ArrayList) obj7) instanceof pjk) {
                            x340Var10.i0(-426250167);
                            z4 = !((List) rwq.h(((lpd0) bjxVar.d).g, x340Var10, 0).getValue()).isEmpty();
                            x340Var10.r(false);
                        } else {
                            x340Var10.i0(-426070181);
                            x340Var10.r(false);
                            z4 = true;
                        }
                        if (z4) {
                            x340Var10.i0(-425994355);
                            uwr uwrVar4 = cbx.a;
                            float f = cbx.b(x340Var10).b.a;
                            cvx cvxVar7 = cbx.b(x340Var10).b;
                            cvx cvxVar8 = cbx.b(x340Var10).b;
                            cvx cvxVar9 = cbx.b(x340Var10).b;
                            qim0 qim0VarA = uyn1.A(nim0Var, 16.0f, f, 16.0f, 8.0f);
                            gfh0 gfh0VarC4 = t1c.c(graVar, false);
                            int iHashCode4 = Long.hashCode(x340Var10.T);
                            xos0 xos0VarM4 = x340Var10.m();
                            qim0 qim0VarE4 = zr7.E(x340Var10, qim0VarA);
                            hzj.A.getClass();
                            if (j06Var == null) {
                                tgp1.p();
                                throw null;
                            }
                            x340Var10.m0();
                            if (x340Var10.S) {
                                x340Var10.l(n4kVar);
                            } else {
                                x340Var10.v0();
                            }
                            nko1.H(gfh0VarC4, x340Var10, lljVar4);
                            nko1.H(xos0VarM4, x340Var10, lljVar3);
                            x0d.q(iHashCode4, x340Var10, lljVar2, x340Var10);
                            nko1.H(qim0VarE4, x340Var10, lljVar);
                            otw.c(((n7p) i7dVar.g).a(), obj9, (qim0) null, (ipb1) null, x340Var10, 8, 12);
                            x340Var10.r(true);
                            z3 = false;
                            x340Var10.r(false);
                        } else {
                            z3 = false;
                            x340Var10.i0(-425548451);
                            x340Var10.r(false);
                        }
                        x340Var10.r(z3);
                    } else if (obj9 instanceof ikk) {
                        x340Var10.i0(-425476748);
                        ikk ikkVar = (ikk) obj9;
                        dyi1 dyi1Var = ikkVar.a;
                        uwr uwrVar5 = cbx.a;
                        cvx cvxVar10 = cbx.b(x340Var10).b;
                        cvx cvxVar11 = cbx.b(x340Var10).b;
                        qim0 qim0VarY4 = uyn1.y(nim0Var, 16.0f, 8.0f);
                        gfh0 gfh0VarC5 = t1c.c(graVar, false);
                        int iHashCode5 = Long.hashCode(x340Var10.T);
                        xos0 xos0VarM5 = x340Var10.m();
                        qim0 qim0VarE5 = zr7.E(x340Var10, qim0VarY4);
                        hzj.A.getClass();
                        if (j06Var == null) {
                            tgp1.p();
                            throw null;
                        }
                        x340Var10.m0();
                        if (x340Var10.S) {
                            x340Var10.l(n4kVar);
                        } else {
                            x340Var10.v0();
                        }
                        nko1.H(gfh0VarC5, x340Var10, lljVar4);
                        nko1.H(xos0VarM5, x340Var10, lljVar3);
                        x0d.q(iHashCode5, x340Var10, lljVar2, x340Var10);
                        nko1.H(qim0VarE5, x340Var10, lljVar);
                        mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var10, 0);
                        int iHashCode6 = Long.hashCode(x340Var10.T);
                        xos0 xos0VarM6 = x340Var10.m();
                        qim0 qim0VarE6 = zr7.E(x340Var10, nim0Var);
                        if (j06Var == null) {
                            tgp1.p();
                            throw null;
                        }
                        x340Var10.m0();
                        if (x340Var10.S) {
                            x340Var10.l(n4kVar);
                        } else {
                            x340Var10.v0();
                        }
                        nko1.H(mbhVarA, x340Var10, lljVar4);
                        nko1.H(xos0VarM6, x340Var10, lljVar3);
                        x0d.q(iHashCode6, x340Var10, lljVar2, x340Var10);
                        nko1.H(qim0VarE6, x340Var10, lljVar);
                        otw.c(new b7u((Context) x340Var10.k(AndroidCompositionLocals_androidKt.b), (byte) 1), new hyi1(dyi1Var.a, dyi1Var.b, dyi1Var.c, dyi1Var.d, dyi1Var.e), (qim0) null, (ipb1) null, x340Var10, 72, 12);
                        String str2 = ikkVar.b;
                        if (str2 == null) {
                            x340Var10.i0(1278125836);
                            z3 = false;
                        } else {
                            z3 = false;
                            x340Var10.i0(1278125837);
                            pqo.c(str2, x340Var10, 0);
                        }
                        x340Var10.r(z3);
                        us71.m(x340Var10, true, true, z3);
                    } else if (obj9 instanceof zxi1) {
                        x340Var10.i0(-424648459);
                        uwr uwrVar6 = cbx.a;
                        cvx cvxVar12 = cbx.b(x340Var10).b;
                        qim0 qim0VarZ = uyn1.z(16.0f, 0.0f, 2, nim0Var);
                        gfh0 gfh0VarC6 = t1c.c(graVar, false);
                        int iHashCode7 = Long.hashCode(x340Var10.T);
                        xos0 xos0VarM7 = x340Var10.m();
                        qim0 qim0VarE7 = zr7.E(x340Var10, qim0VarZ);
                        hzj.A.getClass();
                        if (j06Var == null) {
                            tgp1.p();
                            throw null;
                        }
                        x340Var10.m0();
                        if (x340Var10.S) {
                            x340Var10.l(n4kVar);
                        } else {
                            x340Var10.v0();
                        }
                        nko1.H(gfh0VarC6, x340Var10, lljVar4);
                        nko1.H(xos0VarM7, x340Var10, lljVar3);
                        x0d.q(iHashCode7, x340Var10, lljVar2, x340Var10);
                        nko1.H(qim0VarE7, x340Var10, lljVar);
                        zxi1 zxi1Var = (zxi1) obj9;
                        otw.c(((kys) i7dVar.d).a, new zxi1(zxi1Var.a, zxi1Var.b, zxi1Var.c), (qim0) null, (ipb1) null, x340Var10, 0, 12);
                        x340Var10.r(true);
                        z3 = false;
                        x340Var10.r(false);
                    } else if (obj9 instanceof wxi1) {
                        x340Var10.i0(-424313535);
                        uwr uwrVar7 = cbx.a;
                        cvx cvxVar13 = cbx.b(x340Var10).b;
                        qim0 qim0VarZ2 = uyn1.z(16.0f, 0.0f, 2, nim0Var);
                        gfh0 gfh0VarC7 = t1c.c(graVar, false);
                        int iHashCode8 = Long.hashCode(x340Var10.T);
                        xos0 xos0VarM8 = x340Var10.m();
                        qim0 qim0VarE8 = zr7.E(x340Var10, qim0VarZ2);
                        hzj.A.getClass();
                        if (j06Var == null) {
                            tgp1.p();
                            throw null;
                        }
                        x340Var10.m0();
                        if (x340Var10.S) {
                            x340Var10.l(n4kVar);
                        } else {
                            x340Var10.v0();
                        }
                        nko1.H(gfh0VarC7, x340Var10, lljVar4);
                        nko1.H(xos0VarM8, x340Var10, lljVar3);
                        x0d.q(iHashCode8, x340Var10, lljVar2, x340Var10);
                        nko1.H(qim0VarE8, x340Var10, lljVar);
                        wxi1 wxi1Var = (wxi1) obj9;
                        otw.c(new xv81((byte) 7), new wxi1(wxi1Var.c, wxi1Var.a, wxi1Var.b), (qim0) null, (ipb1) null, x340Var10, 8, 12);
                        x340Var10.r(true);
                        z3 = false;
                        x340Var10.r(false);
                    } else {
                        if (obj9 instanceof a7s0) {
                            x340Var10.i0(-423988252);
                            nu nuVar = new nu((byte) 24);
                            a7s0 a7s0Var = (a7s0) obj9;
                            boolean zG4 = x340Var10.g(iu30Var4);
                            Object objT5 = x340Var10.T();
                            if (zG4 || objT5 == m4cVar) {
                                objT5 = new lck(iu30Var4, (byte) 6);
                                x340Var10.s0(objT5);
                            }
                            otw.c(nuVar, new a7s0(a7s0Var.a, a7s0Var.b, a7s0Var.c, (Function0) objT5), (qim0) null, (ipb1) null, x340Var10, 8, 12);
                            z2 = false;
                            x340Var10.r(false);
                        } else {
                            z2 = false;
                            if (obj9 instanceof zj51) {
                                x340Var10.i0(-423619941);
                                i7dVar.f((zj51) obj9, (iu30) obj6, null, x340Var10, 0);
                                x340Var10.r(false);
                            } else if (obj9 instanceof sjk) {
                                x340Var10.i0(-423451704);
                                tje1 tje1Var = ((sjk) obj9).a;
                                if (tje1Var == null) {
                                    x340Var10.i0(-423433972);
                                    uwr uwrVar8 = cbx.a;
                                    cvx cvxVar14 = cbx.b(x340Var10).b;
                                    cvx cvxVar15 = cbx.b(x340Var10).b;
                                    cvx cvxVar16 = cbx.b(x340Var10).b;
                                    m6p1.c(0, 0, x340Var10, uyn1.B(nim0Var, 16.0f, 8.0f, 16.0f, 0.0f, 8));
                                    us71.m(x340Var10, false, false, false);
                                } else {
                                    x340Var10.i0(-423110115);
                                    x340Var10.r(false);
                                    boolean zG5 = x340Var10.g(tje1Var);
                                    Object objT6 = x340Var10.T();
                                    if (zG5 || objT6 == m4cVar) {
                                        objT6 = new ije1((yqg) i7dVar.N0, ((xrk) i7dVar.O0).p ? new hje1((y1t0) i7dVar.P0) : null, new kjk(tje1Var, iu30Var4, (byte) 1));
                                        x340Var10.s0(objT6);
                                    }
                                    gje1 gje1Var = tje1Var.a;
                                    uwr uwrVar9 = cbx.a;
                                    cvx cvxVar17 = cbx.b(x340Var10).b;
                                    otw.c((ije1) objT6, gje1Var, uyn1.B(nim0Var, 0.0f, 8.0f, 0.0f, 0.0f, 13), (ipb1) null, x340Var10, 72, 8);
                                    z2 = false;
                                    x340Var10.r(false);
                                }
                            } else if (obj9 instanceof pjk) {
                                x340Var10.i0(-421398791);
                                ven0 ven0VarH = rwq.h(((lpd0) bjxVar.d).g, x340Var10, 0);
                                pjk pjkVar = (pjk) obj9;
                                h290 h290Var = pjkVar.a;
                                boolean zI = x340Var10.i(obj9) | x340Var10.i(i7dVar);
                                Object objT7 = x340Var10.T();
                                if (zI || objT7 == m4cVar) {
                                    objT7 = new zti(i7dVar, pjkVar, (lnm) null, (byte) 10);
                                    x340Var10.s0(objT7);
                                }
                                qxd0.t(h290Var, x340Var10, (vu30) objT7);
                                Object objT8 = x340Var10.T();
                                if (objT8 == m4cVar) {
                                    objT8 = fgi0.a((fgi0) bjxVar.b, new jgd0(bjxVar, (byte) 3), ((lpd0) bjxVar.d).e, ((jpd0) bjxVar.g).c, new uei0(false, new har0(0), true, false, false, false, false, false, false, 8184), (cgi0) null, (Function0) bjxVar.f, (ojv0) bjxVar.c, 6048);
                                    x340Var10.s0(objT8);
                                }
                                xpw xpwVar = (xpw) objT8;
                                if (((List) ven0VarH.getValue()).isEmpty()) {
                                    z3 = false;
                                    x340Var10.i0(-420759075);
                                    x340Var10.r(false);
                                } else {
                                    x340Var10.i0(-421026233);
                                    List list = (List) ven0VarH.getValue();
                                    String str3 = pjkVar.b;
                                    List list2 = list;
                                    ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
                                    int i6 = 0;
                                    for (Object obj10 : list2) {
                                        int i7 = i6 + 1;
                                        if (i6 < 0) {
                                            p7h.T();
                                            throw null;
                                        }
                                        String str4 = (String) obj10;
                                        arrayList.add(new ggi0(f4i1.c(i6, "medium-preview-carousel-concert-entity-"), "medium-preview-carousel-concert-entity", str3 == null ? str4 : str3, str4));
                                        i6 = i7;
                                    }
                                    otw.c(xpwVar, new hgi0("medium-preview-carousel-concert-entity", "medium-preview-carousel-concert-entity", (x360) null, arrayList, false, (String) null, 112), uyn1.z(16.0f, 0.0f, 2, nim0Var), (ipb1) null, x340Var10, 0, 8);
                                    z3 = false;
                                    x340Var10.r(false);
                                }
                                x340Var10.r(z3);
                            } else {
                                z3 = false;
                                x340Var10.i0(-420741219);
                                x340Var10.r(false);
                            }
                        }
                        z3 = z2;
                    }
                    x340Var10.r(z3);
                } else {
                    x340Var10.b0();
                }
                return rih1Var;
            case 5:
                aqb0 aqb0Var6 = (aqb0) obj;
                int iIntValue11 = ((Number) obj2).intValue();
                x340 x340Var11 = (b0k) obj3;
                int iIntValue12 = ((Number) obj4).intValue();
                int i8 = (iIntValue12 & 6) == 0 ? iIntValue12 | (x340Var11.g(aqb0Var6) ? 4 : 2) : iIntValue12;
                if ((iIntValue12 & 48) == 0) {
                    i8 |= x340Var11.e(iIntValue11) ? 32 : 16;
                }
                x340 x340Var12 = x340Var11;
                if (x340Var12.Y(i8 & 1, (i8 & 147) != 146)) {
                    jhm jhmVar = (jhm) ((c9) obj5).get(iIntValue11);
                    x340Var12.i0(2047178170);
                    ihm ihmVar = jhmVar.i;
                    if (!(ihmVar instanceof ihm)) {
                        throw p3d1.k(x340Var12, -349603991, false);
                    }
                    x340Var12.i0(-349601808);
                    int i9 = cfm.t;
                    ((cfm) obj8).e((pem) obj7, jhmVar, ihmVar, x340Var12, 0);
                    x340Var12.r(false);
                    x340Var12.r(false);
                } else {
                    x340Var12.b0();
                }
                return rih1Var;
            case 6:
                aqb0 aqb0Var7 = (aqb0) obj;
                int iIntValue13 = ((Number) obj2).intValue();
                x340 x340Var13 = (b0k) obj3;
                int iIntValue14 = ((Number) obj4).intValue();
                int i10 = (iIntValue14 & 6) == 0 ? iIntValue14 | (x340Var13.g(aqb0Var7) ? 4 : 2) : iIntValue14;
                if ((iIntValue14 & 48) == 0) {
                    i10 |= x340Var13.e(iIntValue13) ? 32 : 16;
                }
                x340 x340Var14 = x340Var13;
                if (x340Var14.Y(i10 & 1, (i10 & 147) != 146)) {
                    bf00 bf00Var = (bf00) ((ArrayList) obj5).get(iIntValue13);
                    x340Var14.i0(675270991);
                    l4o1.c(bf00Var, (xfx) obj8, (p40) obj7, (iu30) obj6, iIntValue13, null, x340Var14, 512 | (((i10 & 126) << 9) & 57344));
                    x340Var14.r(false);
                } else {
                    x340Var14.b0();
                }
                return rih1Var;
            case 7:
                return a(obj, obj2, obj3, obj4);
            case 8:
                return d(obj, obj2, obj3, obj4);
            case 9:
                return e(obj, obj2, obj3, obj4);
            case 10:
                return f(obj, obj2, obj3, obj4);
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                return g(obj, obj2, obj3, obj4);
            case grn1.d /* 12 */:
                return h(obj, obj2, obj3, obj4);
            case 13:
                return i(obj, obj2, obj3, obj4);
            case 14:
                return j(obj, obj2, obj3, obj4);
            default:
                aqb0 aqb0Var8 = (aqb0) obj;
                int iIntValue15 = ((Number) obj2).intValue();
                x340 x340Var15 = (b0k) obj3;
                int iIntValue16 = ((Number) obj4).intValue();
                ven0 ven0Var = (ven0) obj8;
                w9i1 w9i1Var = (w9i1) obj5;
                int i11 = (iIntValue16 & 6) == 0 ? iIntValue16 | (x340Var15.g(aqb0Var8) ? 4 : 2) : iIntValue16;
                if ((iIntValue16 & 48) == 0) {
                    i11 |= x340Var15.e(iIntValue15) ? 32 : 16;
                }
                x340 x340Var16 = x340Var15;
                if (x340Var16.Y(i11 & 1, (i11 & 147) != 146)) {
                    by10 by10Var = (by10) by10.b.get(iIntValue15);
                    x340Var16.i0(2084232908);
                    String strO1 = cwl1.o0(x340Var16, w9i1.d0(by10Var));
                    n061 n061Var = ((by10) ven0Var.getValue()) == by10Var ? n061.a : o061.a;
                    boolean zI2 = x340Var16.i(ven0Var) | x340Var16.e(by10Var.ordinal()) | x340Var16.i(w9i1Var) | x340Var16.i((Context) obj7) | x340Var16.g((iu30) obj6);
                    Object objT9 = x340Var16.T();
                    if (zI2 || objT9 == fkj0.X) {
                        objT9 = new kbp0(by10Var, w9i1Var, (Context) obj7, (iu30) obj6, (ven0) obj8, (byte) 20);
                        x340Var16.s0(objT9);
                    }
                    two1.o(strO1, n061Var, (Function0) objT9, null, x340Var16, 0);
                    x340Var16.r(false);
                } else {
                    x340Var16.b0();
                }
                return rih1Var;
        }
    }

    public /* synthetic */ oi1(List list, Object obj, iu30 iu30Var, Object obj2, byte b) {
        this.a = b;
        this.c = list;
        this.d = obj;
        this.b = iu30Var;
        this.e = obj2;
    }
}
