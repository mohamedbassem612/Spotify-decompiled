package p;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.libs.sociallistening.events.proto.SocialConnectUpgradeAskResult;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import com.spotify.nowplaying.scroll.ScrollCardType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class fu extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fu(iqr iqrVar, String str, String str2, int i) {
        super(1);
        this.a = (byte) 7;
        this.c = iqrVar;
        this.d = str;
        this.e = str2;
        this.b = i;
    }

    /* JADX WARN: Code duplicated, block: B:71:0x02a0  */
    public final Object invoke(Object obj) {
        ifl1 ifl1Var;
        lsn0 lsn0Var;
        String str;
        mmr0 mmr0Var;
        Object value;
        Object value2;
        byte b = this.a;
        boolean z = false;
        i = 0;
        int i = 0;
        int i2 = 0;
        rih1 rih1Var = rih1.a;
        int i3 = this.b;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (b) {
            case 0:
                au auVar = (au) obj;
                int iC = l1d.C(i3);
                if (iC == 0) {
                    List list = auVar.b;
                    if (list != null) {
                        if (list.isEmpty()) {
                            list = null;
                        }
                        if (list != null) {
                            return new li81(new hr(list, auVar.d, ((hi81) obj4).a), (lr) ((idd1) obj3).getValue());
                        }
                    }
                } else if (iC == 1) {
                    int i4 = auVar.c;
                    Integer numValueOf = i4 > 0 ? Integer.valueOf(i4) : null;
                    if (numValueOf != null) {
                        return new li81(new ds(numValueOf.intValue()), (es) ((idd1) obj2).getValue());
                    }
                } else {
                    eg.o();
                }
                return null;
            case 1:
                return ((Boolean) obj).booleanValue() ? gio1.b((Object) null) : new ypg0(new gu2((fu2) obj3, i3, (hu2) obj2, (byte) 0), ((yo2) obj4).s);
            case 2:
                ((ven0) obj2).setValue(Boolean.FALSE);
                ((vu30) obj4).invoke((String) obj3, Integer.valueOf(i3));
                return rih1Var;
            case 3:
                k1i k1iVar = (k1i) obj4;
                tv80 tv80VarM = k1iVar.m(i3, (jj8) obj3);
                if (tv80VarM != null) {
                    ifl1Var = null;
                    lsn0Var = new lsn0((String) null, tv80VarM.a);
                } else {
                    ifl1Var = null;
                    lsn0Var = jsn0.a;
                }
                nyn1.Q((mwn0) k1iVar.d, lsn0Var);
                kg0.e((kg0) k1iVar.c, (dkt) obj2, ifl1Var);
                return rih1Var;
            case 4:
                jl9 jl9Var = (jl9) obj4;
                List list2 = jl9Var.a;
                ((rtb0) obj).e(list2.size(), new qf1(list2, (byte) 24), new qf1(list2, (byte) 25), new j2i(2039820996, new qk9(list2, this.b, (al9) obj3, jl9Var, (d0r) obj2), true));
                return rih1Var;
            case 5:
                int iQ = yoi1.q(Float.compare(((Number) obj).floatValue(), i3) + i3, p7h.K((List) obj4));
                if (iQ != i3) {
                    ((iu30) obj3).invoke(Integer.valueOf(iQ));
                    ((iu30) obj2).invoke(Integer.valueOf(iQ));
                    z = true;
                }
                return Boolean.valueOf(z);
            case 6:
                int iIntValue = ((Number) obj).intValue();
                ((hdn0) obj3).t(iIntValue);
                ((ven0) obj2).setValue(Integer.valueOf(i3));
                ((iu30) obj4).invoke(Integer.valueOf(iIntValue));
                return rih1Var;
            case 7:
                return ((iqr) obj4).a(i3, (String) obj3, (String) obj2, ((w3g1) obj).a);
            case 8:
                xu60 xu60Var = (zu60) obj;
                av60 av60Var = (av60) ((k9r) obj4).d;
                String str2 = (String) obj2;
                oy91 oy91VarN = SocialConnectUpgradeAskResult.n();
                oy91VarN.s((String) obj3);
                int iC2 = l1d.C(i3);
                if (iC2 == 0) {
                    str = "play_new_context";
                } else if (iC2 == 1) {
                    str = "add_to_queue";
                } else if (iC2 == 2) {
                    str = "host_pause";
                } else {
                    if (iC2 != 3) {
                        if (iC2 == 4) {
                            str = "banner";
                        } else {
                            eg.o();
                        }
                        return null;
                    }
                    str = "unspecified";
                }
                oy91VarN.t(str);
                oy91VarN.n(str2);
                if (xu60Var != null) {
                    if (xu60Var instanceof xu60) {
                        oy91VarN.q("client");
                        String str3 = xu60Var.a;
                        if (str3 == null) {
                            str3 = "Unknown";
                        }
                        oy91VarN.r(str3);
                    } else {
                        if (!(xu60Var instanceof yu60)) {
                            eg.o();
                            return null;
                        }
                        oy91VarN.q("server");
                        oy91VarN.r(kto1.D((yu60) xu60Var));
                    }
                }
                av60Var.a.a(oy91VarN.build());
                return rih1Var;
            case 9:
                elb0 elb0Var = (elb0) obj;
                ((dw91) obj4).put(Integer.valueOf(i3), Float.valueOf(Float.intBitsToFloat((int) (elb0Var.O(0L) & 4294967295L)) - ((Number) ((ven0) obj2).getValue()).floatValue()));
                ((dw91) obj3).put(Integer.valueOf(i3), Float.valueOf((int) (elb0Var.b() & 4294967295L)));
                return rih1Var;
            case 10:
                kil kilVar = (kil) obj;
                List list3 = (List) obj4;
                ConstraintLayout constraintLayout = (ConstraintLayout) obj2;
                for (Object obj5 : list3) {
                    int i5 = i2 + 1;
                    if (i2 < 0) {
                        p7h.T();
                        throw null;
                    }
                    View view = (View) obj5;
                    if (i2 == 0) {
                        kilVar.g(view.getId(), 6, constraintLayout.getId(), 6);
                    } else {
                        kilVar.g(view.getId(), 6, ((View) list3.get(i2 - 1)).getId(), 7);
                    }
                    i2 = i5;
                }
                kilVar.l(((View) obj3).getId()).e.a0 = (int) (((double) i3) * 5.0d);
                return rih1Var;
            case 11:
                p5t0 p5t0Var = (p5t0) obj;
                q5t0 q5t0Var = (q5t0) obj4;
                p5t0Var.k(q5t0Var, 0, 0, 0.0f);
                int i6 = q5t0Var.a;
                q5t0 q5t0Var2 = (q5t0) obj3;
                if (q5t0Var2 != null) {
                    p5t0Var.k(q5t0Var2, i6, 0, 0.0f);
                }
                int i7 = i6 + i3;
                q5t0 q5t0Var3 = (q5t0) obj2;
                if (q5t0Var3 != null) {
                    p5t0Var.k(q5t0Var3, i7, 0, 0.0f);
                }
                return rih1Var;
            case 12:
                String str4 = (String) obj3;
                drp0 drp0Var = (drp0) ((m4e0) obj4).b;
                int iC3 = l1d.C(i3);
                if (iC3 == 0) {
                    drp0Var.g(i3, str4);
                } else {
                    if (iC3 != 1) {
                        if (iC3 != 2) {
                            if (iC3 != 3) {
                                if (iC3 != 4) {
                                    if (iC3 != 5) {
                                        eg.o();
                                        return null;
                                    }
                                }
                            }
                        }
                        drp0Var.g(i3, str4);
                    }
                    drp0Var.h(i3, str4, (String) obj2);
                }
                return rih1Var;
            case 13:
                ssw0 ssw0Var = (ssw0) obj2;
                l0x0 l0x0Var = (l0x0) obj4;
                List<mmr0> list4 = (List) obj;
                boolean z2 = list4 instanceof Collection;
                if (!z2 || !list4.isEmpty()) {
                    Iterator it = list4.iterator();
                    while (it.hasNext()) {
                        if (!(((mmr0) it.next()).b instanceof i3r) && (i = i + 1) < 0) {
                            p7h.S();
                            throw null;
                        }
                    }
                }
                if (i == i3) {
                    if (!z2 || !list4.isEmpty()) {
                        Iterator it2 = list4.iterator();
                        while (it2.hasNext()) {
                            if (((mmr0) it2.next()).b instanceof h3r) {
                                l0x0Var.y("Some reaction contribution keys failed");
                            }
                        }
                    }
                    LinkedHashMap linkedHashMap = (LinkedHashMap) obj3;
                    ArrayList arrayList = new ArrayList();
                    for (mmr0 mmr0Var2 : list4) {
                        jh5 jh5Var = (jh5) mmr0Var2.a;
                        j3r j3rVar = (k3r) mmr0Var2.b;
                        String str5 = (String) linkedHashMap.get(jh5Var);
                        if (str5 != null) {
                            j3r j3rVar2 = j3rVar instanceof j3r ? j3rVar : null;
                            Object obj6 = j3rVar2 != null ? j3rVar2.a : null;
                            List<som> list5 = obj6 instanceof List ? (List) obj6 : null;
                            if (list5 == null) {
                                mmr0Var = null;
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                for (som somVar : list5) {
                                    num numVar = somVar.c;
                                    num numVar2 = numVar instanceof num ? numVar : null;
                                    ar01 ar01Var = numVar2 == null ? null : new ar01(numVar2.c, somVar.d);
                                    if (ar01Var != null) {
                                        arrayList2.add(ar01Var);
                                    }
                                }
                                if (arrayList2.isEmpty()) {
                                    mmr0Var = null;
                                } else {
                                    mmr0Var = new mmr0(str5, arrayList2);
                                }
                            }
                        } else {
                            mmr0Var = null;
                        }
                        if (mmr0Var != null) {
                            arrayList.add(mmr0Var);
                        }
                    }
                    Map mapT = sqg0.T(arrayList);
                    ((xr01) l0x0Var.d).e = mapT;
                    ssw0Var.l(new cbr(mapT));
                    ssw0Var.c().H((Throwable) null);
                }
                return rih1Var;
            case 14:
                id01 id01Var = (id01) obj;
                z680 z680Var = (z680) obj4;
                cde1 cde1Var = (cde1) obj3;
                ven0 ven0Var = (ven0) obj2;
                r8e1 r8e1Var = (r8e1) ven0Var.getValue();
                if (r8e1Var != null) {
                    r8e1 r8e1Var2 = new r8e1(r8e1Var.a, r8e1Var.b, id01Var);
                    z680Var.a(r8e1Var2);
                    ven0Var.setValue(r8e1Var2);
                } else if (cde1Var.b()) {
                    r8e1 r8e1Var3 = new r8e1(cde1Var.a.s() + i3, cde1Var.b.s() + i3, id01Var);
                    z680Var.a(r8e1Var3);
                    cde1Var.a();
                    ven0Var.setValue(r8e1Var3);
                }
                return rih1Var;
            case 15:
                unp0 unp0Var = (unp0) obj;
                zu30 zu30Var = (zu30) obj4;
                qn11 qn11Var = (qn11) obj3;
                in11 in11Var = qn11Var.j;
                String str6 = qn11Var.i;
                String str7 = qn11Var.e;
                if (unp0Var instanceof rnp0) {
                    zu30Var.J(Integer.valueOf(i3), str7, str6, in11Var);
                } else if (unp0Var instanceof snp0) {
                    ((vu30) obj2).invoke(Integer.valueOf(i3), str7);
                } else {
                    if (!(unp0Var instanceof tnp0)) {
                        eg.o();
                        return null;
                    }
                    zu30Var.J(Integer.valueOf(i3), str7, str6, in11Var);
                }
                return rih1Var;
            case 16:
                t45 t45Var = (t45) obj4;
                t45Var.g(hs41.b(i3, (ScrollCardType) null));
                t45Var.a("load_outcome", ((gs41) obj).toString());
                t45Var.b("entity_uri", (String) obj2);
                ((hs41) obj3).a.b(t45Var.e());
                return rih1Var;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                w061 w061Var = (w061) ((ven0) obj2).getValue();
                String str8 = (String) obj4;
                String str9 = (String) obj3;
                qv80 qv80Var = w061Var.b;
                i8h1 i8h1Var = qv80Var.a;
                r6h1 r6h1Var = qv80Var.b;
                bpb1 bpb1Var = w061Var.a.a;
                b7x b7xVar = b7x.a;
                if (zBooleanValue) {
                    do {
                        value2 = bpb1Var.getValue();
                    } while (!bpb1Var.k(value2, dm61.x0(str9, (Set) value2)));
                    Integer numValueOf2 = Integer.valueOf(i3);
                    y6h1 y6h1Var = y6h1.i;
                    x6h1 x6h1VarI = i3o1.i();
                    x6h1VarI.h = "music";
                    x6h1VarI.a = "mobile-playlist-entity-item-list-item";
                    x6h1VarI.f = "3.0.0";
                    x6h1VarI.g = "22.0.0";
                    x6h1VarI.c = numValueOf2;
                    x6h1VarI.d = str8;
                    x6h1 x6h1VarC = x6h1VarI.a().c();
                    x6h1VarC.i.add(new a7h1("select_checkbox", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC.j = false;
                    i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_select", 1, b7xVar), x6h1VarC.a(), r6h1Var, System.currentTimeMillis()), (xj61) null);
                } else {
                    do {
                        value = bpb1Var.getValue();
                    } while (!bpb1Var.k(value, dm61.u0(str9, (Set) value)));
                    Integer numValueOf3 = Integer.valueOf(i3);
                    y6h1 y6h1Var2 = y6h1.i;
                    x6h1 x6h1VarI2 = i3o1.i();
                    x6h1VarI2.h = "music";
                    x6h1VarI2.a = "mobile-playlist-entity-item-list-item";
                    x6h1VarI2.f = "3.0.0";
                    x6h1VarI2.g = "22.0.0";
                    x6h1VarI2.c = numValueOf3;
                    x6h1VarI2.d = str8;
                    x6h1 x6h1VarC2 = x6h1VarI2.a().c();
                    x6h1VarC2.i.add(new a7h1("select_checkbox", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC2.j = false;
                    i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_deselect", 1, b7xVar), x6h1VarC2.a(), r6h1Var, System.currentTimeMillis()), (xj61) null);
                }
                return rih1Var;
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                c380 c380Var = (c380) obj4;
                rtb0.b((rtb0) obj, i3, new xr1(c380Var, (byte) 8), new j2i(1719835715, new gk0(c380Var, (j2i) obj3, (j2i) obj2, (byte) 24), true), 4);
                return rih1Var;
            default:
                p5t0 p5t0Var2 = (p5t0) obj;
                q5t0 q5t0Var4 = (q5t0) obj4;
                int i8 = -i3;
                mmr0 mmr0Var3 = (mmr0) obj3;
                p5t0Var2.k(q5t0Var4, i8, ((Number) mmr0Var3.a).intValue() - q5t0Var4.b, 0.0f);
                p5t0Var2.k((q5t0) obj2, i8, ((Number) mmr0Var3.b).intValue(), 0.0f);
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fu(Object obj, int i, Object obj2, Object obj3, byte b) {
        super(1);
        this.a = b;
        this.c = obj;
        this.b = i;
        this.d = obj2;
        this.e = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fu(Object obj, Object obj2, int i, Object obj3, byte b) {
        super(1);
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.b = i;
        this.e = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fu(int i, Object obj, Object obj2, Object obj3, byte b) {
        super(1);
        this.a = b;
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }
}
