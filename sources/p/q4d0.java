package p;

import android.view.View;
import com.spotify.base.java.logging.Logger;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import com.spotify.local_files_esperanto.proto.EsLocalFiles;
import com.spotify.local_files_esperanto.proto.EsLocalFiles$GetTracksRequest;
import com.spotify.localfiles.localfilesmonorepo.AddedLocalFile;
import com.spotify.mobius.functions.Consumer;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import spotify.playlist.local_list_config_esperanto.proto.LocalListConfigSaveRequest;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class q4d0 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q4d0(Object obj, Object obj2, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = obj;
        this.d = obj2;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        Object obj2 = this.d;
        switch (b) {
            case 0:
                return new q4d0((iyc0) this.c, (k4d0) obj2, lnmVar, (byte) 0);
            case 1:
                q4d0 q4d0Var = new q4d0((q7d0) obj2, lnmVar, (byte) 1);
                q4d0Var.c = obj;
                return q4d0Var;
            case 2:
                return new q4d0((kp5) this.c, (q7d0) obj2, lnmVar, (byte) 2);
            case 3:
                return new q4d0((qn) this.c, (Consumer) obj2, lnmVar, (byte) 3);
            case 4:
                return new q4d0((ArrayList) this.c, (m5b0) obj2, lnmVar, (byte) 4);
            case 5:
                return new q4d0((vcd0) this.c, (Set) obj2, lnmVar, (byte) 5);
            case 6:
                return new q4d0((ip31) this.c, (tv80) obj2, lnmVar, (byte) 6);
            case 7:
                return new q4d0((ngd0) this.c, (mqm) obj2, lnmVar, (byte) 7);
            case 8:
                return new q4d0((ngd0) this.c, (List) obj2, lnmVar, (byte) 8);
            case 9:
                return new q4d0((rkd0) this.c, (y6b1) obj2, lnmVar, (byte) 9);
            case 10:
                return new q4d0((Flowable) this.c, (ild0) obj2, lnmVar, (byte) 10);
            case 11:
                return new q4d0((hpd0) this.c, (wa71) obj2, lnmVar, (byte) 11);
            case 12:
                q4d0 q4d0Var2 = new q4d0((hpd0) obj2, lnmVar, (byte) 12);
                q4d0Var2.c = obj;
                return q4d0Var2;
            case 13:
                return new q4d0((hpd0) this.c, (gs21) obj2, lnmVar, (byte) 13);
            case 14:
                return new q4d0((dqd0) this.c, (View) obj2, lnmVar, (byte) 14);
            case 15:
                return new q4d0((hq90) this.c, (ord0) obj2, lnmVar, (byte) 15);
            case 16:
                return new q4d0((haa0) this.c, (LinkedHashSet) obj2, lnmVar, (byte) 16);
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                return new q4d0((o860) this.c, (gbw) obj2, lnmVar, (byte) 17);
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                q4d0 q4d0Var3 = new q4d0((s2t) obj2, lnmVar, (byte) 18);
                q4d0Var3.c = obj;
                return q4d0Var3;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                return new q4d0((a4e0) this.c, (j8u) obj2, lnmVar, (byte) 19);
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                return new q4d0((w4k1) this.c, (dxy) obj2, lnmVar, (byte) 20);
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                return new q4d0((a4e0) this.c, (k8u) obj2, lnmVar, (byte) 21);
            case 22:
                return new q4d0((zd1) this.c, (g101) obj2, lnmVar, (byte) 22);
            case 23:
                return new q4d0((o3e0) this.c, (cxn) obj2, lnmVar, (byte) 23);
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                return new q4d0((j2e0) this.c, (eh71) obj2, lnmVar, (byte) 24);
            case 25:
                return new q4d0((v6a0) this.c, (fh71) obj2, lnmVar, (byte) 25);
            case 26:
                return new q4d0((mr20) this.c, (b9e0) obj2, lnmVar, (byte) 26);
            case 27:
                return new q4d0((rde0) this.c, (AddedLocalFile) obj2, lnmVar, (byte) 27);
            case 28:
                return new q4d0((u601) this.c, (ven0) obj2, lnmVar, (byte) 28);
            default:
                return new q4d0((nfe0) this.c, (List) obj2, lnmVar, (byte) 29);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 1:
                return create((y7d0) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 2:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 3:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 4:
                return create((rih1) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 5:
                return create((rih1) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 6:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 7:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 8:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 9:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 10:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 11:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 12:
                return create((wa71) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 13:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 14:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 15:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 16:
                return create((rih1) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                return create((jl71) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                return create((l2e) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                return create((jl71) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 22:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 23:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                return create((jl71) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 25:
                return create((jl71) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 26:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 27:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 28:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            default:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:343:0x06b9  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object invokeSuspend(Object obj) {
        led0 led0Var;
        String str;
        Object objE;
        byte b = this.a;
        byte b2 = 20;
        byte b3 = 11;
        int i = 0;
        int i2 = 0;
        rih1 rih1Var = rih1.a;
        Object obj2 = this.d;
        rih1 rih1Var2 = d9n.a;
        byte b4 = 1;
        Object obj3 = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        switch (b) {
            case 0:
                k4d0 k4d0Var = (k4d0) obj2;
                boolean z = this.b;
                if (z) {
                    if (z) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                xyc0 xyc0Var = (iyc0) this.c;
                List listL1 = o7h.l1(k4d0Var.b);
                this.b = true;
                xyc0 xyc0Var2 = xyc0Var;
                Object objH = c921.H(xyc0Var2.c, new ss90(xyc0Var2, listL1, objArr == true ? 1 : 0, (byte) 28), this);
                return objH == rih1Var2 ? rih1Var2 : objH;
            case 1:
                q7d0 q7d0Var = (q7d0) obj2;
                y7d0 y7d0Var = (y7d0) this.c;
                boolean z2 = this.b;
                if (!z2) {
                    hm5.M(obj);
                    if (y7d0Var instanceof w7d0) {
                        String str2 = ((w7d0) y7d0Var).a;
                        this.c = null;
                        this.b = true;
                        return q7d0Var.e(str2, this) == rih1Var2 ? rih1Var2 : rih1Var;
                    }
                    if (u890.j(y7d0Var, x7d0.a)) {
                        wj3 wj3Var = q7d0Var.c;
                        hma1 hma1VarEdit = ((dma1) wj3Var.e).edit();
                        hma1VarEdit.a(n7d0.c, false);
                        hma1VarEdit.g();
                        wj3Var.k(new f7d0(wj3Var, null, (byte) 0));
                        return rih1Var;
                    }
                    eg.o();
                } else {
                    if (z2) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                }
                return null;
            case 2:
                boolean z3 = this.b;
                if (z3) {
                    if (z3) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                jge jgeVarE = hu20.e((xe01) ((kp5) this.c).h, new i64(3, (lnm) null, (byte) 13));
                q4d0 q4d0Var = new q4d0((q7d0) obj2, objArr2 == true ? 1 : 0, b4);
                this.b = true;
                return l4p1.q(jgeVarE, q4d0Var, this) == rih1Var2 ? rih1Var2 : rih1Var;
            case 3:
                boolean z4 = this.b;
                if (z4) {
                    if (z4) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                xe01 xe01Var = ((fg60) ((qn) this.c).b).a;
                ht3 ht3Var = new ht3((Consumer) obj2, (lnm) null, (byte) 1);
                this.b = true;
                Object objCollect = xe01Var.a.collect(new eu20(kfo0.a, ht3Var, (byte) 1), this);
                if (objCollect != rih1Var2) {
                    objCollect = rih1Var;
                }
                if (objCollect != rih1Var2) {
                    objCollect = rih1Var;
                }
                return objCollect == rih1Var2 ? rih1Var2 : rih1Var;
            case 4:
                ArrayList arrayList = (ArrayList) this.c;
                boolean z5 = this.b;
                if (!z5) {
                    hm5.M(obj);
                    ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(((led0) it.next()).a);
                    }
                    vcd0 vcd0Var = (vcd0) ((m5b0) obj2).f;
                    this.b = true;
                    obj = ((mdd0) vcd0Var).f(arrayList2, this);
                    if (obj == rih1Var2) {
                        return rih1Var2;
                    }
                } else {
                    if (!z5) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                ArrayList arrayList3 = new ArrayList();
                for (Object obj4 : (List) obj) {
                    tcd0 tcd0Var = ((ucd0) obj4).b;
                    if (tcd0Var != null && tcd0Var.c) {
                        arrayList3.add(obj4);
                    }
                }
                int size = arrayList3.size();
                if (size == 0) {
                    return qed0.a;
                }
                if (size != 1) {
                    return new red0(arrayList3.size());
                }
                String str3 = ((ucd0) o7h.q0(arrayList3)).a;
                for (Object obj5 : arrayList) {
                    if (u890.j(((led0) obj5).a, str3)) {
                        obj3 = obj5;
                        led0Var = (led0) obj3;
                        if (led0Var != null || (str = led0Var.b) == null) {
                            str = "";
                        }
                        return new sed0(str);
                    }
                }
                led0Var = (led0) obj3;
                if (led0Var != null) {
                    str = "";
                } else {
                    str = "";
                }
                return new sed0(str);
            case 5:
                Set set = (Set) obj2;
                boolean z6 = this.b;
                if (!z6) {
                    hm5.M(obj);
                    vcd0 vcd0Var2 = (vcd0) this.c;
                    List listL2 = o7h.l1(set);
                    this.b = true;
                    obj = ((mdd0) vcd0Var2).f(listL2, this);
                    if (obj == rih1Var2) {
                        return rih1Var2;
                    }
                } else {
                    if (!z6) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                Iterable iterable = (Iterable) obj;
                int iS = zno1.s(q7h.U(iterable, 10));
                if (iS < 16) {
                    iS = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iS);
                for (Object obj6 : iterable) {
                    linkedHashMap.put(((ucd0) obj6).a, obj6);
                }
                Set set2 = set;
                int iS2 = zno1.s(q7h.U(set2, 10));
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(iS2 >= 16 ? iS2 : 16);
                for (Object obj7 : set2) {
                    ucd0 ucd0Var = (ucd0) linkedHashMap.get((String) obj7);
                    linkedHashMap2.put(obj7, new j3r(new fhd0(ucd0Var != null ? ucd0Var.b : null)));
                }
                return linkedHashMap2;
            case 6:
                boolean z7 = this.b;
                if (!z7) {
                    hm5.M(obj);
                    this.b = true;
                    return ((sgd0) ((ip31) this.c).i).f((tv80) obj2, this) == rih1Var2 ? rih1Var2 : rih1Var;
                }
                if (z7) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 7:
                boolean z8 = this.b;
                if (z8) {
                    if (z8) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                ezc ezcVarF = h4p1.f(new n0a0(this.c, obj2, (lnm) (objArr3 == true ? 1 : 0), b2));
                this.b = true;
                Object objI = b5p1.i(ezcVarF, this);
                return objI == rih1Var2 ? rih1Var2 : objI;
            case 8:
                boolean z9 = this.b;
                if (z9) {
                    if (z9) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                Observable observableFilter = ((ngd0) this.c).b.b(new oi("android-listening-activity-reaction-sheet", false, new nec0((List) obj2, b4))).filter(xj20.t);
                this.b = true;
                Object objL = fc11.l(observableFilter, 1, (Object) null, this);
                return objL == rih1Var2 ? rih1Var2 : objL;
            case 9:
                boolean z10 = this.b;
                if (z10) {
                    if (z10) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                q3s0 q3s0Var = ((rkd0) this.c).b;
                String string = ((y6b1) obj2).toString();
                this.b = true;
                Object objB = q3s0Var.b(string, this);
                return objB == rih1Var2 ? rih1Var2 : objB;
            case 10:
                boolean z11 = this.b;
                if (z11) {
                    if (z11) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                p811 p811VarU = cy30.u(obj);
                p811VarU.a = eld0.a;
                Flowable flowable = (Flowable) this.c;
                vbm[] vbmVarArr = q601.a;
                kge kgeVar = new kge(flowable);
                a8d0 a8d0Var = new a8d0(obj2, (Object) p811VarU, (byte) 5);
                this.b = true;
                return kgeVar.collect(a8d0Var, this) == rih1Var2 ? rih1Var2 : rih1Var;
            case 11:
                boolean z12 = this.b;
                if (!z12) {
                    hm5.M(obj);
                    this.b = true;
                    Object objA = ((hpd0) this.c).c.a((wa71) obj2, this);
                    return objA == rih1Var2 ? rih1Var2 : objA;
                }
                if (z12) {
                    hm5.M(obj);
                    return obj;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 12:
                wa71 wa71Var = (wa71) this.c;
                boolean z13 = this.b;
                if (z13) {
                    if (z13) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                q4d0 q4d0Var2 = new q4d0((hpd0) obj2, wa71Var, objArr4 == true ? 1 : 0, b3);
                this.c = null;
                this.b = true;
                Object objO = rc2.O(8000L, q4d0Var2, this);
                return objO == rih1Var2 ? rih1Var2 : objO;
            case 13:
                boolean z14 = this.b;
                if (!z14) {
                    hm5.M(obj);
                    this.b = true;
                    Object objC = ((hpd0) this.c).c.c((gs21) obj2, this);
                    return objC == rih1Var2 ? rih1Var2 : objC;
                }
                if (z14) {
                    hm5.M(obj);
                    return obj;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 14:
                boolean z15 = this.b;
                if (z15) {
                    if (z15) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                iac0 iac0VarN0 = ((dqd0) this.c).n0();
                kzj kzjVar = new kzj((View) obj2, null);
                this.b = true;
                return z8p1.u(iac0VarN0, w8c0.d, kzjVar, this) == rih1Var2 ? rih1Var2 : rih1Var;
            case 15:
                boolean z16 = this.b;
                if (z16) {
                    if (z16) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                mr20 mr20VarU = rqt0.u(new mnc0(((hq90) this.c).a(), b2));
                vi viVar = new vi((ord0) obj2, (byte) 9);
                this.b = true;
                return mr20VarU.collect(viVar, this) == rih1Var2 ? rih1Var2 : rih1Var;
            case 16:
                haa0 haa0Var = (haa0) this.c;
                boolean z17 = this.b;
                try {
                    if (!z17) {
                        hm5.M(obj);
                        vcd0 vcd0Var3 = (vcd0) haa0Var.b;
                        this.b = true;
                        objE = ((mdd0) vcd0Var3).e((LinkedHashSet) obj2, this);
                        if (objE == rih1Var2) {
                            return rih1Var2;
                        }
                    } else {
                        if (!z17) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        hm5.M(obj);
                        objE = ((e331) obj).a;
                    }
                    hm5.M(objE);
                    return new axd(haa0.u((List) objE));
                } catch (CancellationException e) {
                    throw e;
                } catch (Exception e2) {
                    return new zwd(e2);
                }
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                boolean z18 = this.b;
                if (z18) {
                    if (z18) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                wh41 wh41Var = (wh41) ((o860) this.c).c;
                gbw gbwVar = (gbw) obj2;
                String str4 = gbwVar.a;
                String str5 = gbwVar.b;
                this.b = true;
                Object objG = wh41Var.g(str4, str5, this);
                return objG == rih1Var2 ? rih1Var2 : objG;
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                l2e l2eVar = (l2e) this.c;
                boolean z19 = this.b;
                if (!z19) {
                    hm5.M(obj);
                    s2t s2tVar = (s2t) obj2;
                    if (l2eVar != null) {
                        s2tVar.d((CancellationException) null);
                        return l2eVar;
                    }
                    this.c = null;
                    this.b = true;
                    obj = s2tVar.Q(this);
                    if (obj == rih1Var2) {
                        return rih1Var2;
                    }
                } else {
                    if (!z19) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return (l2e) obj;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                j8u j8uVar = (j8u) obj2;
                boolean z20 = this.b;
                if (z20) {
                    if (z20) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                ytp0 ytp0Var = ((a4e0) this.c).b;
                abu abuVar = j8uVar.a;
                String strA = abuVar.a();
                String str6 = j8uVar.b;
                this.b = true;
                Object objA2 = ytp0Var.A(abuVar, strA, str6, w0q0.Y, this);
                return objA2 == rih1Var2 ? rih1Var2 : objA2;
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                boolean z21 = this.b;
                if (z21) {
                    if (z21) {
                        hm5.M(obj);
                        return (llg) obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                String str7 = ((w4k1) this.c).e;
                if (str7 != null) {
                    dc31 dc31Var = (dc31) ((dxy) obj2).e;
                    this.b = true;
                    obj = dc31Var.n(str7, this);
                    if (obj == rih1Var2) {
                        return rih1Var2;
                    }
                    return (llg) obj;
                }
                return null;
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                k8u k8uVar = (k8u) obj2;
                boolean z22 = this.b;
                if (z22) {
                    if (z22) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                ytp0 ytp0Var2 = ((a4e0) this.c).b;
                abu abuVar2 = k8uVar.a;
                String strA2 = abuVar2.a();
                String str8 = k8uVar.b;
                this.b = true;
                Object objA3 = ytp0Var2.A(abuVar2, strA2, str8, w0q0.Z, this);
                return objA3 == rih1Var2 ? rih1Var2 : objA3;
            case 22:
                String str9 = ((g101) obj2).a;
                boolean z23 = this.b;
                if (!z23) {
                    hm5.M(obj);
                    zd1 zd1Var = (zd1) this.c;
                    sxz0 sxz0Var = (sxz0) zd1Var.b;
                    frd1 frd1Var = (frd1) zd1Var.c;
                    String str10 = (String) zd1Var.d;
                    this.b = true;
                    obj = sxz0Var.a(frd1Var, str10, str9, this);
                    if (obj == rih1Var2) {
                        return rih1Var2;
                    }
                } else {
                    if (!z23) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                blr0 blr0Var = (blr0) obj;
                List list = blr0Var.a;
                ArrayList arrayList4 = new ArrayList(q7h.U(list, 10));
                for (Object obj8 : list) {
                    int i3 = i + 1;
                    if (i < 0) {
                        p7h.T();
                        throw null;
                    }
                    arrayList4.add(new fxz0(i, (lfi1) obj8));
                    i = i3;
                }
                return new u101(new q001(1, blr0Var.b, str9, arrayList4));
            case 23:
                boolean z24 = this.b;
                if (z24) {
                    if (z24) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                zzx zzxVar = (zzx) ((o3e0) this.c).d;
                String str11 = ((cxn) obj2).a;
                this.b = true;
                Object objB2 = zzxVar.b(str11, this);
                return objB2 == rih1Var2 ? rih1Var2 : objB2;
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                boolean z25 = this.b;
                if (z25) {
                    if (z25) {
                        hm5.M(obj);
                    } else {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                    }
                    return null;
                }
                hm5.M(obj);
                o3e0 o3e0Var = (o3e0) ((j2e0) this.c).b;
                k371 k371Var = ((eh71) obj2).c.b;
                this.b = true;
                obj = o3e0Var.o(k371Var, this);
                if (obj == rih1Var2) {
                    return rih1Var2;
                }
                p4e0 p4e0Var = (r4e0) obj;
                if (p4e0Var instanceof p4e0) {
                    return new ng71(new m231(p4e0Var.a), null);
                }
                if (!(p4e0Var instanceof q4e0)) {
                    eg.o();
                    return null;
                }
                q4e0 q4e0Var = (q4e0) p4e0Var;
                ArrayList arrayList5 = q4e0Var.a;
                int i4 = q4e0Var.b;
                z771 z771Var = ((u771) arrayList5.get(i4)).a.b;
                ArrayList arrayList6 = new ArrayList(q7h.U(arrayList5, 10));
                for (Object obj9 : arrayList5) {
                    int i5 = i2 + 1;
                    if (i2 < 0) {
                        p7h.T();
                        throw null;
                    }
                    arrayList6.add(new bb71((u771) obj9, i2, i2 == i4 ? 2 : (i2 == i4 + (-1) || i2 == i4 + 1) ? 1 : 3));
                    i2 = i5;
                }
                return new ng71(mqo1.F(arrayList6), z771Var);
            case 25:
                boolean z26 = this.b;
                if (z26) {
                    if (z26) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                ke71 ke71Var = (ke71) ((v6a0) this.c).b;
                k371 k371Var2 = ((fh71) obj2).c;
                this.b = true;
                Object objJ = ke71Var.j(k371Var2, this);
                return objJ == rih1Var2 ? rih1Var2 : objJ;
            case 26:
                boolean z27 = this.b;
                if (z27) {
                    if (z27) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                mr20 mr20Var = (mr20) this.c;
                p5b0 p5b0Var = new p5b0((b9e0) obj2, (byte) 4);
                this.b = true;
                return mr20Var.collect(p5b0Var, this) == rih1Var2 ? rih1Var2 : rih1Var;
            case 27:
                AddedLocalFile addedLocalFile = (AddedLocalFile) obj2;
                boolean z28 = this.b;
                if (!z28) {
                    hm5.M(obj);
                    eee0 eee0Var = ((rde0) this.c).e;
                    znz znzVarN = EsLocalFiles$GetTracksRequest.n();
                    boz bozVarN = EsLocalFiles.Query.n();
                    bozVarN.n(ihc1.e1(addedLocalFile.getArtistName() + " " + addedLocalFile.getAlbumName() + " " + addedLocalFile.getTrackTitle()).toString());
                    znzVarN.s(bozVarN);
                    znzVarN.n(sde0.c);
                    b8d0 b8d0Var = new b8d0(new mnc0(eee0Var.callStream("spotify.local_files_esperanto.proto.LocalFiles", "SubscribeTracks", (EsLocalFiles$GetTracksRequest) znzVarN.build()), (byte) 26), addedLocalFile, b3);
                    this.b = true;
                    obj = b5p1.k(b8d0Var, this);
                    if (obj == rih1Var2) {
                        return rih1Var2;
                    }
                } else {
                    if (!z28) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return Boolean.valueOf(obj != null);
            case 28:
                boolean z29 = this.b;
                if (z29) {
                    if (z29) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                mr20 mr20VarA = ((u601) this.c).a();
                mp0 mp0Var = new mp0((ven0) obj2, (byte) 8);
                this.b = true;
                return mr20VarA.collect(mp0Var, this) == rih1Var2 ? rih1Var2 : rih1Var;
            default:
                boolean z30 = this.b;
                try {
                    if (!z30) {
                        hm5.M(obj);
                        jn7 jn7Var = ((nfe0) this.c).b;
                        lfe0 lfe0VarO = LocalListConfigSaveRequest.o();
                        lfe0VarO.n((List) obj2);
                        LocalListConfigSaveRequest localListConfigSaveRequestBuild = lfe0VarO.build();
                        this.b = true;
                        if (jn7Var.j0(localListConfigSaveRequestBuild, this) == rih1Var2) {
                            rih1Var = rih1Var2;
                        }
                    } else {
                        if (!z30) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        hm5.M(obj);
                    }
                    return rih1Var;
                } catch (Exception e3) {
                    Logger.l(e3, "Error occurred during list config setting for local lists", new Object[0]);
                    return rih1Var;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q4d0(Object obj, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.d = obj;
    }
}
