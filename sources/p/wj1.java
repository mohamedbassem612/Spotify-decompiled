package p;

import android.os.Bundle;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class wj1 implements r331 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ wj1(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public final void e(d331 d331Var) {
        List listQ0;
        h3f t2fVar;
        dia1 dia1Var;
        int i;
        u2d0 e3d0Var;
        est estVar;
        byte b = this.a;
        mel melVar = mel.a;
        mel melVar2 = nel.a;
        int i2 = 1;
        str = null;
        String str = null;
        l231 l231Var = l231.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                y231 y231Var = d331Var instanceof y231 ? (y231) d331Var : null;
                if (y231Var != null) {
                    oez0 oez0Var = (oez0) ((tm) obj).c;
                    dma1 dma1Var = oez0Var.a;
                    boolean z = oez0Var.c;
                    idd1 idd1Var = oez0Var.d;
                    if (z) {
                        String strE = dma1Var.e(oez0.e, (String) null);
                        listQ0 = strE != null ? ihc1.Q0(strE, new String[]{"\n"}, 0, 6) : null;
                        if (listQ0 == null) {
                            listQ0 = (List) idd1Var.getValue();
                        }
                    } else {
                        listQ0 = (List) idd1Var.getValue();
                    }
                    ArrayList arrayListO0 = o7h.O0(y231Var.a.a, listQ0);
                    if (z) {
                        hma1 hma1VarEdit = dma1Var.edit();
                        hma1VarEdit.d(oez0.e, o7h.y0(arrayListO0, "\n", (String) null, (String) null, (iu30) null, 62));
                        hma1VarEdit.g();
                    }
                }
                break;
            case 1:
                if (d331Var instanceof y231) {
                    bbc bbcVar = ((ca6) obj).a;
                    apk1 apk1Var = ((y231) d331Var).a;
                    bbcVar.l(new k86(apk1Var.a, apk1Var.b));
                }
                break;
            case 2:
                if (d331Var instanceof y231) {
                    qe7 qe7Var = ((y231) d331Var).a;
                    List list = qe7Var.a;
                    ArrayList arrayList = new ArrayList(q7h.U(list, 10));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(new xa7(((hi90) it.next()).getUri(), qe7Var.b, qe7Var.c));
                    }
                    if (!arrayList.isEmpty()) {
                        ((bbc) ((yu3) obj).d).l(new ya7(arrayList));
                    }
                }
                break;
            case 3:
                ajq0 ajq0Var = (ajq0) obj;
                if (d331Var instanceof y231) {
                    int iOrdinal = ((me7) ajq0Var.a).ordinal();
                    if (iOrdinal == 0 || iOrdinal == 1) {
                        ((cir0) ajq0Var.d).c().a(d331Var);
                    } else if (iOrdinal == 2) {
                        ((yf7) ajq0Var.c).a.onNext(new qf7(((y231) d331Var).a.a));
                    } else {
                        eg.o();
                    }
                }
                break;
            case 4:
                if (d331Var instanceof y231) {
                    c3b c3bVar = ((y231) d331Var).a;
                    String str2 = c3bVar.b;
                    t3b t3bVar = (t3b) obj;
                    fn31.T(t3bVar.i, (o8n) null, 0, new sxa(t3bVar, c3bVar.a, str2 != null ? new fzx0(str2) : ezx0.a, null, (byte) 2), 3);
                }
                break;
            case 5:
                ny51 ny51Var = ((rwb) obj).a;
                if (d331Var.equals(l231Var)) {
                    ny51Var.invoke(iwb.a);
                } else if (d331Var instanceof y231) {
                    ny51Var.invoke(((y231) d331Var).a.a);
                } else {
                    eg.o();
                }
                break;
            case 6:
                if (d331Var.equals(l231Var)) {
                    n57.s("Returning the result from Chat Content Picker has failed");
                } else if (d331Var instanceof y231) {
                    pxs0 pxs0Var = ((y231) d331Var).a.a;
                    fta ftaVar = (fta) obj;
                    if (pxs0Var instanceof pxs0) {
                        t2fVar = new h3f(pxs0Var.a);
                    } else if (!(pxs0Var instanceof rxs0)) {
                        if (!(pxs0Var instanceof qxs0)) {
                            eg.o();
                        } else {
                            wol wolVar = ((qxs0) pxs0Var).a;
                            lg31 lg31Var = wolVar.b;
                            String str3 = lg31Var != null ? lg31Var.a : null;
                            t2fVar = new t2f(wolVar, str3 != null ? str3 : "");
                        }
                        break;
                    } else if (((add) ftaVar.d).c()) {
                        t2fVar = new t2f(new mpl(((rxs0) pxs0Var).a, false), "");
                    } else {
                        rxs0 rxs0Var = (rxs0) pxs0Var;
                        t2fVar = new f3f(new mpl(rxs0Var.a, false), rxs0Var.b);
                    }
                    ((pbr0) ftaVar.c).accept(t2fVar);
                } else {
                    eg.o();
                }
                break;
            case 7:
                if (!d331Var.equals(l231Var)) {
                    if (d331Var instanceof y231) {
                        ((kwe) obj).a.accept(e1f.a);
                    } else {
                        eg.o();
                    }
                }
                break;
            case 8:
                if (d331Var instanceof y231) {
                    ((syf) obj).invoke(((y231) d331Var).a);
                }
                break;
            case 9:
                bbc bbcVar2 = (bbc) ((xid) obj).b;
                if (d331Var instanceof y231) {
                    melVar = melVar2;
                }
                bbcVar2.l(new bwk(melVar));
                break;
            case 10:
                if (d331Var instanceof y231) {
                    Object obj2 = ((gso) ((y231) d331Var).a).a.get(new jvb1("confirm-generation-location"));
                    xne0 xne0Var = obj2 instanceof xne0 ? (xne0) obj2 : null;
                    if (xne0Var != null) {
                        bbc bbcVar3 = ((nxk) obj).a;
                        String str4 = xne0Var.a;
                        if (str4 != null && !ihc1.y0(str4)) {
                            str = str4;
                        }
                        bbcVar3.l(new qwk(str));
                    }
                }
                break;
            case 11:
                if (d331Var instanceof y231) {
                    ((mzk) obj).a.l(wvk.a);
                }
                break;
            case 12:
                if (d331Var instanceof y231) {
                    ((nxk) obj).a.l(new bxk(((y231) d331Var).a.a));
                }
                break;
            case 13:
                if (d331Var instanceof y231) {
                    bbc bbcVar4 = ((mzk) obj).a;
                    apk1 apk1Var2 = ((y231) d331Var).a;
                    bbcVar4.l(new exk(apk1Var2.a, apk1Var2.b));
                }
                break;
            case 14:
                bbc bbcVar5 = ((mzk) obj).a;
                if (d331Var instanceof y231) {
                    melVar = melVar2;
                }
                bbcVar5.l(melVar);
                break;
            case 15:
                s1m s1mVar = (s1m) obj;
                if (d331Var instanceof y231) {
                    pxs0 pxs0Var2 = ((y231) d331Var).a.a;
                    if (pxs0Var2 instanceof pxs0) {
                        s1mVar.b.invoke(new f7q0(pxs0Var2.a, (String) null, (String) null, (String) null, (s7q0) null, 120));
                    } else if (pxs0Var2 instanceof rxs0) {
                        rxs0 rxs0Var2 = (rxs0) pxs0Var2;
                        s1mVar.c.invoke(new mpl(rxs0Var2.a, false), Long.valueOf(rxs0Var2.b));
                    } else if (pxs0Var2 instanceof qxs0) {
                        s1mVar.d.invoke(((qxs0) pxs0Var2).a);
                    } else {
                        eg.o();
                    }
                    break;
                } else if (!d331Var.equals(l231Var)) {
                    eg.o();
                    break;
                }
                break;
            case 16:
                wzn wznVar = (wzn) obj;
                if (d331Var.equals(l231Var)) {
                    n57.s("Returning the result from Custom Reactions Picker has failed");
                } else if (d331Var instanceof y231) {
                    long jB = ((yqg) wznVar.c).b() / 1000;
                    pbr0 pbr0Var = (pbr0) wznVar.b;
                    oqo oqoVar = (oqo) ((y231) d331Var).a;
                    pbr0Var.accept(new l2f(oqoVar.a, oqoVar.b, jB));
                } else {
                    eg.o();
                }
                break;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                if (!d331Var.equals(l231Var)) {
                    if (d331Var instanceof y231) {
                        iu30 iu30Var = ((nps) obj).a;
                        switch (((y231) d331Var).a.a.ordinal()) {
                            case 0:
                                dia1Var = dia1.e;
                                break;
                            case 1:
                                dia1Var = dia1.i;
                                break;
                            case 2:
                                dia1Var = dia1.f;
                                break;
                            case 3:
                                dia1Var = dia1.g;
                                break;
                            case 4:
                                dia1Var = dia1.X;
                                break;
                            case 5:
                                dia1Var = dia1.Y;
                                break;
                            case 6:
                                dia1Var = dia1.d;
                                break;
                            case 7:
                                dia1Var = dia1.h;
                                break;
                            case 8:
                                dia1Var = dia1.c;
                                break;
                            case 9:
                                dia1Var = dia1.t;
                                break;
                            default:
                                eg.o();
                                break;
                        }
                        iu30Var.invoke(new ar3(dia1Var));
                    } else {
                        eg.o();
                    }
                }
                break;
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                if (d331Var instanceof y231) {
                    ((k1t) obj).Q0.invoke(new yq3(o7h.p1(((y231) d331Var).a.a)));
                }
                break;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                if (d331Var instanceof y231) {
                    a630 a630Var = ((v530) obj).c;
                    f720 f720Var = ((y231) d331Var).a;
                    s530 s530Var = a630Var.i;
                    uha1 uha1Var = f720Var.a;
                    List list2 = f720Var.b;
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj3 : list2) {
                        if (((qa20) obj3).b) {
                            arrayList2.add(obj3);
                        }
                    }
                    ArrayList arrayList3 = new ArrayList(q7h.U(arrayList2, 10));
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        arrayList3.add(((qa20) it2.next()).a);
                    }
                    Set setP1 = o7h.p1(arrayList3);
                    ArrayList<qa20> arrayList4 = a630Var.Y0;
                    ArrayList arrayList5 = new ArrayList(q7h.U(arrayList4, 10));
                    for (qa20 qa20Var : arrayList4) {
                        arrayList5.add(new qa20(qa20Var.a, setP1.contains(qa20Var.a), qa20Var.c));
                    }
                    a630Var.Y0 = arrayList5;
                    sha1 sha1Var = uha1Var.b;
                    qha1 qha1Var = uha1Var.d;
                    ArrayList<uha1> arrayList6 = a630Var.Z0;
                    ArrayList arrayList7 = new ArrayList(q7h.U(arrayList6, 10));
                    for (uha1 uha1Var2 : arrayList6) {
                        arrayList7.add(uha1Var2.b == sha1Var ? uha1.a(uha1Var2, true, qha1Var, 3) : uha1.a(uha1Var2, false, (qha1) null, 11));
                    }
                    a630Var.Z0 = arrayList7;
                    s530Var.getClass();
                    sha1 sha1Var2 = uha1Var.b;
                    s530Var.b = sha1Var2;
                    if (qha1Var == null || (i = qha1Var.a) == 0) {
                        int iOrdinal2 = sha1Var2.ordinal();
                        if (iOrdinal2 != 0 && iOrdinal2 == 2) {
                            i2 = 2;
                        }
                        i = i2;
                    }
                    s530Var.c = i;
                    ArrayList arrayList8 = new ArrayList();
                    for (Object obj4 : list2) {
                        if (((qa20) obj4).b) {
                            arrayList8.add(obj4);
                        }
                    }
                    ArrayList arrayList9 = new ArrayList(q7h.U(arrayList8, 10));
                    Iterator it3 = arrayList8.iterator();
                    while (it3.hasNext()) {
                        arrayList9.add(((qa20) it3.next()).a);
                    }
                    Set setP2 = o7h.p1(arrayList9);
                    hma1 hma1VarEdit2 = s530Var.a.edit();
                    hma1VarEdit2.e(t530.a, setP2);
                    hma1VarEdit2.g();
                    bpb1 bpb1Var = s530Var.d;
                    mmr0 mmr0Var = new mmr0(s530Var.a(), s530Var.d());
                    bpb1Var.getClass();
                    bpb1Var.m((Object) null, mmr0Var);
                    ((bpb1) a630Var.g.h).m((Object) null, new o530(s530Var.b(), s530Var.c()));
                }
                break;
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                if (d331Var instanceof y231) {
                    bf41 bf41Var = ((y231) d331Var).a;
                    String str5 = bf41Var.a;
                    ((iw30) obj).t.l(new u500(new bq10(str5, bf41Var.b, 120, str5)));
                }
                break;
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                if (d331Var instanceof y231) {
                    bbc bbcVar6 = (bbc) ((ur00) obj).c;
                    og7 og7Var = ((y231) d331Var).a;
                    bbcVar6.l(new rhb0(og7Var.a, og7Var.b));
                }
                break;
            case 22:
                if (d331Var instanceof y231) {
                    wj3 wj3Var = ((q7d0) obj).c;
                    f720 f720Var2 = ((y231) d331Var).a;
                    List list3 = f720Var2.b;
                    uha1 uha1Var3 = f720Var2.a;
                    ArrayList arrayList10 = new ArrayList();
                    for (Object obj5 : list3) {
                        if (((qa20) obj5).b) {
                            arrayList10.add(obj5);
                        }
                    }
                    ArrayList arrayList11 = new ArrayList(q7h.U(arrayList10, 10));
                    Iterator it4 = arrayList10.iterator();
                    while (it4.hasNext()) {
                        arrayList11.add(((qa20) it4.next()).a);
                    }
                    Set setP3 = o7h.p1(arrayList11);
                    ArrayList arrayList12 = new ArrayList(q7h.U(arrayList10, 10));
                    Iterator it5 = arrayList10.iterator();
                    while (it5.hasNext()) {
                        arrayList12.add(((qa20) it5.next()).c);
                    }
                    Set setP4 = o7h.p1(czo1.m(arrayList12));
                    qha1 qha1Var2 = uha1Var3.d;
                    boolean z2 = (qha1Var2 != null ? qha1Var2.a : 0) == 2;
                    int iOrdinal3 = uha1Var3.b.ordinal();
                    if (iOrdinal3 == 0) {
                        e3d0Var = new e3d0(z2);
                    } else if (iOrdinal3 == 1) {
                        e3d0Var = new m2d0(z2);
                    } else if (iOrdinal3 == 2) {
                        e3d0Var = new c3d0(z2);
                    } else if (iOrdinal3 != 3) {
                        eg.o();
                    } else {
                        e3d0Var = u2d0.a;
                    }
                    u2d0 u2d0Var = e3d0Var;
                    hma1 hma1VarEdit3 = ((dma1) wj3Var.e).edit();
                    hma1VarEdit3.e(n7d0.a, setP3);
                    hma1VarEdit3.d(n7d0.b, u2d0Var.g());
                    hma1VarEdit3.a(n7d0.c, true);
                    hma1VarEdit3.g();
                    wj3Var.k(new d7d0(wj3Var, setP4, u2d0Var, (lnm) null, (byte) 0));
                }
                break;
            case 23:
                if (!d331Var.equals(l231Var)) {
                    if (d331Var instanceof y231) {
                        jj40 jj40Var = ((gne0) ((y231) d331Var).a).a;
                        if (jj40Var != null) {
                            ((wod0) obj).e.invoke(new jh00(jj40Var));
                        }
                    } else {
                        eg.o();
                    }
                }
                break;
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                ohd ohdVar = (ohd) obj;
                if (ohdVar.s() instanceof ago0) {
                    if (d331Var instanceof y231) {
                        estVar = ((y231) d331Var).a.a;
                    } else if (!(d331Var instanceof l231)) {
                        eg.o();
                    } else {
                        estVar = est.c;
                    }
                    ohdVar.resumeWith(estVar);
                }
                break;
            case 25:
                if (d331Var instanceof y231) {
                    ((apf0) obj).a.invoke(((y231) d331Var).a);
                    break;
                } else if (!(d331Var instanceof l231)) {
                    eg.o();
                    break;
                }
                break;
            case 26:
                lff lffVar = ((fth0) obj).b;
                if (d331Var.equals(l231Var)) {
                    lffVar.invoke((Object) null);
                } else if (d331Var instanceof y231) {
                    lffVar.invoke(((y231) d331Var).a);
                } else {
                    eg.o();
                }
                break;
            case 27:
                dt71 dt71Var = (dt71) ((kdy0) obj).d;
                if (d331Var instanceof y231) {
                    dt71Var.a(new akz0(((y231) d331Var).a.a));
                } else if (d331Var instanceof l231) {
                    dt71Var.a(zjz0.a);
                } else {
                    eg.o();
                }
                break;
            case 28:
                bjx bjxVar = (bjx) obj;
                dt71 dt71Var2 = (dt71) bjxVar.c;
                String str6 = (String) bjxVar.e;
                String str7 = (String) bjxVar.f;
                bjxVar.e = null;
                bjxVar.f = null;
                if (!(d331Var instanceof y231)) {
                    if (d331Var instanceof l231) {
                        dt71Var2.a(new g3z0((x1z0) null));
                    } else {
                        eg.o();
                    }
                    break;
                } else if (str6 != null && str7 != null) {
                    v0a v0aVar = ((y231) d331Var).a.a;
                    dt71Var2.a(new g3z0(new x1z0(str6, v0aVar.a, str7, v0aVar.b)));
                    break;
                }
                break;
            default:
                if (!d331Var.equals(l231Var)) {
                    if (d331Var instanceof y231) {
                        wmy wmyVar = (wmy) obj;
                        t501 t501Var = ((y231) d331Var).a;
                        if (t501Var.d) {
                            ((pbr0) wmyVar.b).accept(new l2f(t501Var.a, t501Var.c, ((yqg) wmyVar.e).b() / 1000));
                        } else {
                            pcf.a((lzn0) wmyVar.c, pcf.j(t501Var.b), (tv80) null, (Bundle) null);
                        }
                    } else {
                        eg.o();
                    }
                }
                break;
        }
    }
}
