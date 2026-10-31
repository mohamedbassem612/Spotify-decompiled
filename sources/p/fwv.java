package p;

import android.text.Html;
import com.spotify.player.model.PlayerState;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import spotify.your_library.esperanto.proto.YourLibraryResponse;
import spotify.your_library.proto.YourLibraryDecoratedEntityOuterClass;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class fwv implements vr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vr20 b;

    public fwv(vr20 vr20Var, goq goqVar) {
        this.a = (byte) 19;
        this.b = vr20Var;
    }

    /* JADX WARN: Code duplicated, block: B:105:0x018f  */
    /* JADX WARN: Code duplicated, block: B:120:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:137:0x0209  */
    /* JADX WARN: Code duplicated, block: B:154:0x0246  */
    /* JADX WARN: Code duplicated, block: B:169:0x0282  */
    /* JADX WARN: Code duplicated, block: B:189:0x02d5  */
    /* JADX WARN: Code duplicated, block: B:207:0x031d  */
    /* JADX WARN: Code duplicated, block: B:222:0x035b  */
    /* JADX WARN: Code duplicated, block: B:237:0x039b  */
    /* JADX WARN: Code duplicated, block: B:266:0x0415  */
    /* JADX WARN: Code duplicated, block: B:26:0x0068  */
    /* JADX WARN: Code duplicated, block: B:294:0x0478  */
    /* JADX WARN: Code duplicated, block: B:312:0x04ba  */
    /* JADX WARN: Code duplicated, block: B:330:0x04fc  */
    /* JADX WARN: Code duplicated, block: B:349:0x0558  */
    /* JADX WARN: Code duplicated, block: B:376:0x05e7  */
    /* JADX WARN: Code duplicated, block: B:395:0x0630  */
    /* JADX WARN: Code duplicated, block: B:418:0x06b2  */
    /* JADX WARN: Code duplicated, block: B:41:0x009e  */
    /* JADX WARN: Code duplicated, block: B:433:0x06f2  */
    /* JADX WARN: Code duplicated, block: B:448:0x0731  */
    /* JADX WARN: Code duplicated, block: B:463:0x0770  */
    /* JADX WARN: Code duplicated, block: B:478:0x07ac  */
    /* JADX WARN: Code duplicated, block: B:503:0x0853  */
    /* JADX WARN: Code duplicated, block: B:522:0x08af  */
    /* JADX WARN: Code duplicated, block: B:545:0x0927  */
    /* JADX WARN: Code duplicated, block: B:58:0x00db  */
    /* JADX WARN: Code duplicated, block: B:75:0x0116  */
    /* JADX WARN: Code duplicated, block: B:90:0x0156  */
    /* JADX WARN: Code duplicated, block: B:9:0x002d  */
    public final Object emit(Object obj, lnm lnmVar) {
        ewv ewvVar;
        kwv kwvVar;
        wwv wwvVar;
        dxv dxvVar;
        pxv pxvVar;
        qxv qxvVar;
        rxv rxvVar;
        sxv sxvVar;
        wxv wxvVar;
        xxv xxvVar;
        yxv yxvVar;
        kyv kyvVar;
        q4w q4wVar;
        h5w h5wVar;
        p5w p5wVar;
        pnt pntVar;
        s5w s5wVar;
        m6w k6wVar;
        olw olwVar;
        gow gowVar;
        bpw bpwVar;
        dpw dpwVar;
        lpw lpwVar;
        jzw jzwVar;
        kzw kzwVar;
        lzw lzwVar;
        mzw mzwVar;
        nzw nzwVar;
        o0x o0xVar;
        p0x p0xVar;
        q0x q0xVar;
        u0x u0xVar;
        byte b = this.a;
        List listSingletonList = z6x.a;
        boolean z = false;
        rih1 rih1Var = rih1.a;
        vr20 vr20Var = this.b;
        d9n d9nVar = d9n.a;
        g1d0 string = null;
        switch (b) {
            case 0:
                if (lnmVar instanceof ewv) {
                    ewvVar = (ewv) lnmVar;
                    int i = ewvVar.b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        ewvVar.b = i - Integer.MIN_VALUE;
                    } else {
                        ewvVar = new ewv(this, lnmVar);
                    }
                } else {
                    ewvVar = new ewv(this, lnmVar);
                }
                Object obj2 = ewvVar.a;
                int i2 = ewvVar.b;
                if (i2 == 0) {
                    hm5.M(obj2);
                    yvv yvvVar = new yvv(((Boolean) obj).booleanValue());
                    ewvVar.b = 1;
                    return vr20Var.emit(yvvVar, ewvVar) == d9nVar ? d9nVar : rih1Var;
                }
                if (i2 == 1) {
                    hm5.M(obj2);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 1:
                if (lnmVar instanceof kwv) {
                    kwvVar = (kwv) lnmVar;
                    int i3 = kwvVar.b;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        kwvVar.b = i3 - Integer.MIN_VALUE;
                    } else {
                        kwvVar = new kwv(this, lnmVar);
                    }
                } else {
                    kwvVar = new kwv(this, lnmVar);
                }
                Object obj3 = kwvVar.a;
                int i4 = kwvVar.b;
                if (i4 != 0) {
                    if (i4 == 1) {
                        hm5.M(obj3);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj3);
                List list = (List) obj;
                ArrayList arrayList = new ArrayList(q7h.U(list, 10));
                int i5 = 0;
                for (Object obj4 : list) {
                    int i6 = i5 + 1;
                    if (i5 < 0) {
                        p7h.T();
                        throw null;
                    }
                    qnu0 qnu0Var = (qnu0) obj4;
                    arrayList.add(new h8k1(new lpw0(i5, qnu0Var.a, qnu0Var.b, qnu0Var.d), "privacy_".concat(qnu0Var.c)));
                    i5 = i6;
                }
                kwvVar.b = 1;
                return vr20Var.emit(arrayList, kwvVar) == d9nVar ? d9nVar : rih1Var;
            case 2:
                if (lnmVar instanceof wwv) {
                    wwvVar = (wwv) lnmVar;
                    int i7 = wwvVar.b;
                    if ((i7 & Integer.MIN_VALUE) != 0) {
                        wwvVar.b = i7 - Integer.MIN_VALUE;
                    } else {
                        wwvVar = new wwv(this, lnmVar);
                    }
                } else {
                    wwvVar = new wwv(this, lnmVar);
                }
                Object obj5 = wwvVar.a;
                int i8 = wwvVar.b;
                if (i8 != 0) {
                    if (i8 == 1) {
                        hm5.M(obj5);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj5);
                List list2 = (List) obj;
                ArrayList arrayList2 = new ArrayList(q7h.U(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((qnu0) it.next()).a);
                }
                Set setP1 = o7h.p1(arrayList2);
                wwvVar.b = 1;
                return vr20Var.emit(setP1, wwvVar) == d9nVar ? d9nVar : rih1Var;
            case 3:
                if (lnmVar instanceof dxv) {
                    dxvVar = (dxv) lnmVar;
                    int i9 = dxvVar.b;
                    if ((i9 & Integer.MIN_VALUE) != 0) {
                        dxvVar.b = i9 - Integer.MIN_VALUE;
                    } else {
                        dxvVar = new dxv(this, lnmVar);
                    }
                } else {
                    dxvVar = new dxv(this, lnmVar);
                }
                Object obj6 = dxvVar.a;
                int i10 = dxvVar.b;
                if (i10 != 0) {
                    if (i10 == 1) {
                        hm5.M(obj6);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj6);
                h290 h290VarN = ((YourLibraryResponse) obj).n();
                ArrayList<YourLibraryDecoratedEntityOuterClass.YourLibraryDecoratedEntity> arrayList3 = new ArrayList();
                for (Object obj7 : h290VarN) {
                    if (((YourLibraryDecoratedEntityOuterClass.YourLibraryDecoratedEntity) obj7).hasPlaylist()) {
                        arrayList3.add(obj7);
                    }
                }
                ArrayList arrayList4 = new ArrayList(q7h.U(arrayList3, 10));
                for (YourLibraryDecoratedEntityOuterClass.YourLibraryDecoratedEntity yourLibraryDecoratedEntity : arrayList3) {
                    arrayList4.add(new rnu0(yourLibraryDecoratedEntity.e().getUri(), yourLibraryDecoratedEntity.e().getName(), yourLibraryDecoratedEntity.w().B(), yourLibraryDecoratedEntity.w().o(), yourLibraryDecoratedEntity.w().t()));
                }
                dxvVar.b = 1;
                return vr20Var.emit(arrayList4, dxvVar) == d9nVar ? d9nVar : rih1Var;
            case 4:
                if (lnmVar instanceof pxv) {
                    pxvVar = (pxv) lnmVar;
                    int i11 = pxvVar.b;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        pxvVar.b = i11 - Integer.MIN_VALUE;
                    } else {
                        pxvVar = new pxv(this, lnmVar);
                    }
                } else {
                    pxvVar = new pxv(this, lnmVar);
                }
                Object obj8 = pxvVar.a;
                int i12 = pxvVar.b;
                if (i12 == 0) {
                    hm5.M(obj8);
                    nxv nxvVar = new nxv((Set) obj);
                    pxvVar.b = 1;
                    return vr20Var.emit(nxvVar, pxvVar) == d9nVar ? d9nVar : rih1Var;
                }
                if (i12 == 1) {
                    hm5.M(obj8);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 5:
                if (lnmVar instanceof qxv) {
                    qxvVar = (qxv) lnmVar;
                    int i13 = qxvVar.b;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        qxvVar.b = i13 - Integer.MIN_VALUE;
                    } else {
                        qxvVar = new qxv(this, lnmVar);
                    }
                } else {
                    qxvVar = new qxv(this, lnmVar);
                }
                Object obj9 = qxvVar.a;
                int i14 = qxvVar.b;
                if (i14 == 0) {
                    hm5.M(obj9);
                    Boolean boolValueOf = Boolean.valueOf(((List) obj).isEmpty());
                    qxvVar.b = 1;
                    return vr20Var.emit(boolValueOf, qxvVar) == d9nVar ? d9nVar : rih1Var;
                }
                if (i14 == 1) {
                    hm5.M(obj9);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 6:
                if (lnmVar instanceof rxv) {
                    rxvVar = (rxv) lnmVar;
                    int i15 = rxvVar.b;
                    if ((i15 & Integer.MIN_VALUE) != 0) {
                        rxvVar.b = i15 - Integer.MIN_VALUE;
                    } else {
                        rxvVar = new rxv(this, lnmVar);
                    }
                } else {
                    rxvVar = new rxv(this, lnmVar);
                }
                Object obj10 = rxvVar.a;
                int i16 = rxvVar.b;
                if (i16 == 0) {
                    hm5.M(obj10);
                    Boolean boolValueOf2 = Boolean.valueOf(((List) obj).isEmpty());
                    rxvVar.b = 1;
                    return vr20Var.emit(boolValueOf2, rxvVar) == d9nVar ? d9nVar : rih1Var;
                }
                if (i16 == 1) {
                    hm5.M(obj10);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 7:
                if (lnmVar instanceof sxv) {
                    sxvVar = (sxv) lnmVar;
                    int i17 = sxvVar.b;
                    if ((i17 & Integer.MIN_VALUE) != 0) {
                        sxvVar.b = i17 - Integer.MIN_VALUE;
                    } else {
                        sxvVar = new sxv(this, lnmVar);
                    }
                } else {
                    sxvVar = new sxv(this, lnmVar);
                }
                Object obj11 = sxvVar.a;
                int i18 = sxvVar.b;
                if (i18 == 0) {
                    hm5.M(obj11);
                    kxv kxvVar = new kxv(((Boolean) obj).booleanValue());
                    sxvVar.b = 1;
                    return vr20Var.emit(kxvVar, sxvVar) == d9nVar ? d9nVar : rih1Var;
                }
                if (i18 == 1) {
                    hm5.M(obj11);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 8:
                if (lnmVar instanceof wxv) {
                    wxvVar = (wxv) lnmVar;
                    int i19 = wxvVar.b;
                    if ((i19 & Integer.MIN_VALUE) != 0) {
                        wxvVar.b = i19 - Integer.MIN_VALUE;
                    } else {
                        wxvVar = new wxv(this, lnmVar);
                    }
                } else {
                    wxvVar = new wxv(this, lnmVar);
                }
                Object obj12 = wxvVar.a;
                int i20 = wxvVar.b;
                if (i20 != 0) {
                    if (i20 == 1) {
                        hm5.M(obj12);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj12);
                List list3 = (List) obj;
                ArrayList arrayList5 = new ArrayList(q7h.U(list3, 10));
                int i21 = 0;
                for (Object obj13 : list3) {
                    int i22 = i21 + 1;
                    if (i21 < 0) {
                        p7h.T();
                        throw null;
                    }
                    rnu0 rnu0Var = (rnu0) obj13;
                    arrayList5.add(new h8k1(new hoy0(i21, rnu0Var.a, rnu0Var.b, rnu0Var.d, rnu0Var.e), "published_".concat(rnu0Var.c)));
                    i21 = i22;
                }
                wxvVar.b = 1;
                return vr20Var.emit(arrayList5, wxvVar) == d9nVar ? d9nVar : rih1Var;
            case 9:
                if (lnmVar instanceof xxv) {
                    xxvVar = (xxv) lnmVar;
                    int i23 = xxvVar.b;
                    if ((i23 & Integer.MIN_VALUE) != 0) {
                        xxvVar.b = i23 - Integer.MIN_VALUE;
                    } else {
                        xxvVar = new xxv(this, lnmVar);
                    }
                } else {
                    xxvVar = new xxv(this, lnmVar);
                }
                Object obj14 = xxvVar.a;
                int i24 = xxvVar.b;
                if (i24 != 0) {
                    if (i24 == 1) {
                        hm5.M(obj14);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj14);
                if (!((List) obj).isEmpty()) {
                    listSingletonList = Collections.singletonList(new h8k1(rih1Var, "publishable_heading"));
                }
                xxvVar.b = 1;
                return vr20Var.emit(listSingletonList, xxvVar) == d9nVar ? d9nVar : rih1Var;
            case 10:
                if (lnmVar instanceof yxv) {
                    yxvVar = (yxv) lnmVar;
                    int i25 = yxvVar.b;
                    if ((i25 & Integer.MIN_VALUE) != 0) {
                        yxvVar.b = i25 - Integer.MIN_VALUE;
                    } else {
                        yxvVar = new yxv(this, lnmVar);
                    }
                } else {
                    yxvVar = new yxv(this, lnmVar);
                }
                Object obj15 = yxvVar.a;
                int i26 = yxvVar.b;
                if (i26 != 0) {
                    if (i26 == 1) {
                        hm5.M(obj15);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj15);
                List list4 = (List) obj;
                int iL = p7h.L(list4);
                List list5 = list4;
                ArrayList arrayList6 = new ArrayList(q7h.U(list5, 10));
                int i27 = 0;
                for (Object obj16 : list5) {
                    int i28 = i27 + 1;
                    if (i27 < 0) {
                        p7h.T();
                        throw null;
                    }
                    rnu0 rnu0Var2 = (rnu0) obj16;
                    arrayList6.add(new h8k1(new yny0(i27, rnu0Var2.a, rnu0Var2.b, rnu0Var2.e, i27 == iL, rnu0Var2.d), "publishable_".concat(rnu0Var2.c)));
                    i27 = i28;
                }
                yxvVar.b = 1;
                return vr20Var.emit(arrayList6, yxvVar) == d9nVar ? d9nVar : rih1Var;
            case 11:
                if (lnmVar instanceof kyv) {
                    kyvVar = (kyv) lnmVar;
                    int i29 = kyvVar.b;
                    if ((i29 & Integer.MIN_VALUE) != 0) {
                        kyvVar.b = i29 - Integer.MIN_VALUE;
                    } else {
                        kyvVar = new kyv(this, lnmVar);
                    }
                } else {
                    kyvVar = new kyv(this, lnmVar);
                }
                Object obj17 = kyvVar.a;
                int i30 = kyvVar.b;
                if (i30 != 0) {
                    if (i30 == 1) {
                        hm5.M(obj17);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj17);
                List list6 = (List) obj;
                ArrayList arrayList7 = new ArrayList(q7h.U(list6, 10));
                Iterator it2 = list6.iterator();
                while (it2.hasNext()) {
                    arrayList7.add(((rnu0) it2.next()).a);
                }
                Set setP2 = o7h.p1(arrayList7);
                kyvVar.b = 1;
                return vr20Var.emit(setP2, kyvVar) == d9nVar ? d9nVar : rih1Var;
            case 12:
                if (lnmVar instanceof q4w) {
                    q4wVar = (q4w) lnmVar;
                    int i31 = q4wVar.b;
                    if ((i31 & Integer.MIN_VALUE) != 0) {
                        q4wVar.b = i31 - Integer.MIN_VALUE;
                    } else {
                        q4wVar = new q4w(this, lnmVar);
                    }
                } else {
                    q4wVar = new q4w(this, lnmVar);
                }
                Object obj18 = q4wVar.a;
                int i32 = q4wVar.b;
                if (i32 != 0) {
                    if (i32 == 1) {
                        hm5.M(obj18);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj18);
                i1r i1rVar = (k1r) obj;
                if (i1rVar instanceof i1r) {
                    listSingletonList = (List) i1rVar.a;
                }
                q4wVar.b = 1;
                return vr20Var.emit(listSingletonList, q4wVar) == d9nVar ? d9nVar : rih1Var;
            case 13:
                if (lnmVar instanceof h5w) {
                    h5wVar = (h5w) lnmVar;
                    int i33 = h5wVar.b;
                    if ((i33 & Integer.MIN_VALUE) != 0) {
                        h5wVar.b = i33 - Integer.MIN_VALUE;
                    } else {
                        h5wVar = new h5w(this, lnmVar);
                    }
                } else {
                    h5wVar = new h5w(this, lnmVar);
                }
                Object obj19 = h5wVar.a;
                int i34 = h5wVar.b;
                if (i34 != 0) {
                    if (i34 == 1) {
                        hm5.M(obj19);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj19);
                i1r i1rVar2 = (k1r) obj;
                if (i1rVar2 instanceof i1r) {
                    listSingletonList = (List) i1rVar2.a;
                }
                h5wVar.b = 1;
                return vr20Var.emit(listSingletonList, h5wVar) == d9nVar ? d9nVar : rih1Var;
            case 14:
                if (lnmVar instanceof p5w) {
                    p5wVar = (p5w) lnmVar;
                    int i35 = p5wVar.b;
                    if ((i35 & Integer.MIN_VALUE) != 0) {
                        p5wVar.b = i35 - Integer.MIN_VALUE;
                    } else {
                        p5wVar = new p5w(this, lnmVar);
                    }
                } else {
                    p5wVar = new p5w(this, lnmVar);
                }
                Object obj20 = p5wVar.a;
                int i36 = p5wVar.b;
                if (i36 != 0) {
                    if (i36 == 1) {
                        hm5.M(obj20);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj20);
                i1r i1rVar3 = (k1r) obj;
                i1r i1rVar4 = i1rVar3 instanceof i1r ? i1rVar3 : null;
                if (i1rVar4 != null && (pntVar = (pnt) i1rVar4.a) != null) {
                    String str = pntVar.a;
                    if (ihc1.y0(str)) {
                        str = null;
                    }
                    if (str != null) {
                        string = ihc1.e1(Html.fromHtml(str, 0).toString()).toString();
                    }
                }
                p5wVar.b = 1;
                return vr20Var.emit(string, p5wVar) == d9nVar ? d9nVar : rih1Var;
            case 15:
                if (lnmVar instanceof s5w) {
                    s5wVar = (s5w) lnmVar;
                    int i37 = s5wVar.b;
                    if ((i37 & Integer.MIN_VALUE) != 0) {
                        s5wVar.b = i37 - Integer.MIN_VALUE;
                    } else {
                        s5wVar = new s5w(this, lnmVar);
                    }
                } else {
                    s5wVar = new s5w(this, lnmVar);
                }
                Object obj21 = s5wVar.a;
                int i38 = s5wVar.b;
                if (i38 == 0) {
                    hm5.M(obj21);
                    i1r i1rVar5 = (k1r) obj;
                    if (i1rVar5 instanceof i1r) {
                        k6wVar = new m6w(((hzy) i1rVar5.a).a == 14);
                    } else if (i1rVar5 instanceof j1r) {
                        k6wVar = l6w.a;
                    } else if (i1rVar5 instanceof h1r) {
                        k6wVar = new k6w(new RuntimeException("Editor detection failed: " + ((h1r) i1rVar5).a));
                    } else {
                        eg.o();
                    }
                    s5wVar.b = 1;
                    return vr20Var.emit(k6wVar, s5wVar) == d9nVar ? d9nVar : rih1Var;
                }
                if (i38 == 1) {
                    hm5.M(obj21);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 16:
                if (lnmVar instanceof olw) {
                    olwVar = (olw) lnmVar;
                    int i39 = olwVar.b;
                    if ((i39 & Integer.MIN_VALUE) != 0) {
                        olwVar.b = i39 - Integer.MIN_VALUE;
                    } else {
                        olwVar = new olw(this, lnmVar);
                    }
                } else {
                    olwVar = new olw(this, lnmVar);
                }
                Object obj22 = olwVar.a;
                int i40 = olwVar.b;
                if (i40 != 0) {
                    if (i40 == 1) {
                        hm5.M(obj22);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj22);
                fio fioVar = (fio) obj;
                w450 w450Var = new w450(fioVar.a, fioVar.b);
                olwVar.b = 1;
                return vr20Var.emit(w450Var, olwVar) == d9nVar ? d9nVar : rih1Var;
            case 17:
                if (lnmVar instanceof gow) {
                    gowVar = (gow) lnmVar;
                    int i41 = gowVar.b;
                    if ((i41 & Integer.MIN_VALUE) != 0) {
                        gowVar.b = i41 - Integer.MIN_VALUE;
                    } else {
                        gowVar = new gow(this, lnmVar);
                    }
                } else {
                    gowVar = new gow(this, lnmVar);
                }
                Object obj23 = gowVar.a;
                int i42 = gowVar.b;
                if (i42 == 0) {
                    hm5.M(obj23);
                    g6y g6yVar = new g6y(((z310) obj).a);
                    gowVar.b = 1;
                    return vr20Var.emit(g6yVar, gowVar) == d9nVar ? d9nVar : rih1Var;
                }
                if (i42 == 1) {
                    hm5.M(obj23);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 18:
                if (lnmVar instanceof bpw) {
                    bpwVar = (bpw) lnmVar;
                    int i43 = bpwVar.b;
                    if ((i43 & Integer.MIN_VALUE) != 0) {
                        bpwVar.b = i43 - Integer.MIN_VALUE;
                    } else {
                        bpwVar = new bpw(this, lnmVar);
                    }
                } else {
                    bpwVar = new bpw(this, lnmVar);
                }
                Object obj24 = bpwVar.a;
                int i44 = bpwVar.b;
                if (i44 != 0) {
                    if (i44 == 1) {
                        hm5.M(obj24);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj24);
                am90 am90Var = (am90) obj;
                if (am90Var instanceof xl90) {
                    cm90 cm90Var = ((xl90) am90Var).a;
                    string = new g1d0(cm90Var.a, cm90Var.b);
                }
                bpwVar.b = 1;
                return vr20Var.emit(string, bpwVar) == d9nVar ? d9nVar : rih1Var;
            case 19:
                if (lnmVar instanceof dpw) {
                    dpwVar = (dpw) lnmVar;
                    int i45 = dpwVar.b;
                    if ((i45 & Integer.MIN_VALUE) != 0) {
                        dpwVar.b = i45 - Integer.MIN_VALUE;
                    } else {
                        dpwVar = new dpw(this, lnmVar);
                    }
                } else {
                    dpwVar = new dpw(this, lnmVar);
                }
                Object obj25 = dpwVar.a;
                int i46 = dpwVar.b;
                if (i46 != 0) {
                    if (i46 == 1) {
                        hm5.M(obj25);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj25);
                PlayerState playerState = (PlayerState) obj;
                playerState.getClass();
                if (playerState.restrictions().disallowPeekingNextReasons().isEmpty() && !o4p1.t(playerState)) {
                    z = true;
                }
                Boolean boolValueOf3 = Boolean.valueOf(z);
                dpwVar.b = 1;
                return vr20Var.emit(boolValueOf3, dpwVar) == d9nVar ? d9nVar : rih1Var;
            case 20:
                if (lnmVar instanceof lpw) {
                    lpwVar = (lpw) lnmVar;
                    int i47 = lpwVar.b;
                    if ((i47 & Integer.MIN_VALUE) != 0) {
                        lpwVar.b = i47 - Integer.MIN_VALUE;
                    } else {
                        lpwVar = new lpw(this, lnmVar);
                    }
                } else {
                    lpwVar = new lpw(this, lnmVar);
                }
                Object obj26 = lpwVar.a;
                int i48 = lpwVar.b;
                if (i48 == 0) {
                    hm5.M(obj26);
                    e331 e331Var = new e331((List) obj);
                    lpwVar.b = 1;
                    return vr20Var.emit(e331Var, lpwVar) == d9nVar ? d9nVar : rih1Var;
                }
                if (i48 == 1) {
                    hm5.M(obj26);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 21:
                if (lnmVar instanceof jzw) {
                    jzwVar = (jzw) lnmVar;
                    int i49 = jzwVar.b;
                    if ((i49 & Integer.MIN_VALUE) != 0) {
                        jzwVar.b = i49 - Integer.MIN_VALUE;
                    } else {
                        jzwVar = new jzw(this, lnmVar);
                    }
                } else {
                    jzwVar = new jzw(this, lnmVar);
                }
                Object obj27 = jzwVar.a;
                int i50 = jzwVar.b;
                if (i50 != 0) {
                    if (i50 == 1) {
                        hm5.M(obj27);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj27);
                if (((PlayerState) obj).isPaused()) {
                    return rih1Var;
                }
                jzwVar.b = 1;
                return vr20Var.emit(obj, jzwVar) == d9nVar ? d9nVar : rih1Var;
            case 22:
                if (lnmVar instanceof kzw) {
                    kzwVar = (kzw) lnmVar;
                    int i51 = kzwVar.b;
                    if ((i51 & Integer.MIN_VALUE) != 0) {
                        kzwVar.b = i51 - Integer.MIN_VALUE;
                    } else {
                        kzwVar = new kzw(this, lnmVar);
                    }
                } else {
                    kzwVar = new kzw(this, lnmVar);
                }
                Object obj28 = kzwVar.a;
                int i52 = kzwVar.b;
                if (i52 != 0) {
                    if (i52 == 1) {
                        hm5.M(obj28);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj28);
                if (!((PlayerState) obj).track().c()) {
                    return rih1Var;
                }
                kzwVar.b = 1;
                return vr20Var.emit(obj, kzwVar) == d9nVar ? d9nVar : rih1Var;
            case 23:
                if (lnmVar instanceof lzw) {
                    lzwVar = (lzw) lnmVar;
                    int i53 = lzwVar.b;
                    if ((i53 & Integer.MIN_VALUE) != 0) {
                        lzwVar.b = i53 - Integer.MIN_VALUE;
                    } else {
                        lzwVar = new lzw(this, lnmVar);
                    }
                } else {
                    lzwVar = new lzw(this, lnmVar);
                }
                Object obj29 = lzwVar.a;
                int i54 = lzwVar.b;
                if (i54 == 0) {
                    hm5.M(obj29);
                    lzwVar.b = 1;
                    return vr20Var.emit(g4n0.a, lzwVar) == d9nVar ? d9nVar : rih1Var;
                }
                if (i54 == 1) {
                    hm5.M(obj29);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 24:
                if (lnmVar instanceof mzw) {
                    mzwVar = (mzw) lnmVar;
                    int i55 = mzwVar.b;
                    if ((i55 & Integer.MIN_VALUE) != 0) {
                        mzwVar.b = i55 - Integer.MIN_VALUE;
                    } else {
                        mzwVar = new mzw(this, lnmVar);
                    }
                } else {
                    mzwVar = new mzw(this, lnmVar);
                }
                Object obj30 = mzwVar.a;
                int i56 = mzwVar.b;
                if (i56 == 0) {
                    hm5.M(obj30);
                    mzwVar.b = 1;
                    return vr20Var.emit(o790.a, mzwVar) == d9nVar ? d9nVar : rih1Var;
                }
                if (i56 == 1) {
                    hm5.M(obj30);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 25:
                if (lnmVar instanceof nzw) {
                    nzwVar = (nzw) lnmVar;
                    int i57 = nzwVar.b;
                    if ((i57 & Integer.MIN_VALUE) != 0) {
                        nzwVar.b = i57 - Integer.MIN_VALUE;
                    } else {
                        nzwVar = new nzw(this, lnmVar);
                    }
                } else {
                    nzwVar = new nzw(this, lnmVar);
                }
                Object obj31 = nzwVar.a;
                int i58 = nzwVar.b;
                if (i58 == 0) {
                    hm5.M(obj31);
                    ri0 ri0Var = new ri0(((Boolean) obj).booleanValue());
                    nzwVar.b = 1;
                    return vr20Var.emit(ri0Var, nzwVar) == d9nVar ? d9nVar : rih1Var;
                }
                if (i58 == 1) {
                    hm5.M(obj31);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 26:
                if (lnmVar instanceof o0x) {
                    o0xVar = (o0x) lnmVar;
                    int i59 = o0xVar.b;
                    if ((i59 & Integer.MIN_VALUE) != 0) {
                        o0xVar.b = i59 - Integer.MIN_VALUE;
                    } else {
                        o0xVar = new o0x(this, lnmVar);
                    }
                } else {
                    o0xVar = new o0x(this, lnmVar);
                }
                Object obj32 = o0xVar.a;
                int i60 = o0xVar.b;
                if (i60 != 0) {
                    if (i60 == 1) {
                        hm5.M(obj32);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj32);
                if (!(((px0) obj) instanceof ox0)) {
                    return rih1Var;
                }
                o0xVar.b = 1;
                return vr20Var.emit(obj, o0xVar) == d9nVar ? d9nVar : rih1Var;
            case 27:
                if (lnmVar instanceof p0x) {
                    p0xVar = (p0x) lnmVar;
                    int i61 = p0xVar.b;
                    if ((i61 & Integer.MIN_VALUE) != 0) {
                        p0xVar.b = i61 - Integer.MIN_VALUE;
                    } else {
                        p0xVar = new p0x(this, lnmVar);
                    }
                } else {
                    p0xVar = new p0x(this, lnmVar);
                }
                Object obj33 = p0xVar.a;
                int i62 = p0xVar.b;
                if (i62 != 0) {
                    if (i62 == 1) {
                        hm5.M(obj33);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj33);
                if (!((Boolean) obj).booleanValue()) {
                    return rih1Var;
                }
                p0xVar.b = 1;
                return vr20Var.emit(obj, p0xVar) == d9nVar ? d9nVar : rih1Var;
            case 28:
                if (lnmVar instanceof q0x) {
                    q0xVar = (q0x) lnmVar;
                    int i63 = q0xVar.b;
                    if ((i63 & Integer.MIN_VALUE) != 0) {
                        q0xVar.b = i63 - Integer.MIN_VALUE;
                    } else {
                        q0xVar = new q0x(this, lnmVar);
                    }
                } else {
                    q0xVar = new q0x(this, lnmVar);
                }
                Object obj34 = q0xVar.a;
                int i64 = q0xVar.b;
                if (i64 == 0) {
                    hm5.M(obj34);
                    Boolean bool = Boolean.FALSE;
                    q0xVar.b = 1;
                    return vr20Var.emit(bool, q0xVar) == d9nVar ? d9nVar : rih1Var;
                }
                if (i64 == 1) {
                    hm5.M(obj34);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                if (lnmVar instanceof u0x) {
                    u0xVar = (u0x) lnmVar;
                    int i65 = u0xVar.b;
                    if ((i65 & Integer.MIN_VALUE) != 0) {
                        u0xVar.b = i65 - Integer.MIN_VALUE;
                    } else {
                        u0xVar = new u0x(this, lnmVar);
                    }
                } else {
                    u0xVar = new u0x(this, lnmVar);
                }
                Object obj35 = u0xVar.a;
                int i66 = u0xVar.b;
                if (i66 != 0) {
                    if (i66 == 1) {
                        hm5.M(obj35);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj35);
                if (!(((px0) obj) instanceof ox0)) {
                    return rih1Var;
                }
                u0xVar.b = 1;
                return vr20Var.emit(obj, u0xVar) == d9nVar ? d9nVar : rih1Var;
        }
    }

    public /* synthetic */ fwv(vr20 vr20Var, byte b) {
        this.a = b;
        this.b = vr20Var;
    }
}
