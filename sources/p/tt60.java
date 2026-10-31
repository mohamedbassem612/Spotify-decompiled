package p;

import android.view.View;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.functions.Consumer;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.functions.Action;
import io.reactivex.rxjava3.processors.PublishProcessor;
import io.reactivex.rxjava3.subjects.CompletableSubject;
import io.reactivex.rxjava3.subjects.PublishSubject;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class tt60 implements Action {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ tt60(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public final void run() {
        Integer numValueOf;
        String str;
        int i;
        byte b = this.a;
        w7x w7xVar = w7x.a;
        gu41 gu41Var = gu41.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                ((z1s) obj2).a((hj70) obj);
                return;
            case 1:
                odb0 odb0Var = (odb0) obj2;
                String str2 = (String) obj;
                odb0Var.b.a("selected-language", str2);
                ndb0 ndb0Var = odb0Var.d;
                str2.getClass();
                hma1 hma1VarEdit = ndb0Var.a.edit();
                hma1VarEdit.d(ndb0.b, str2);
                hma1VarEdit.g();
                return;
            case 2:
                o2b1 o2b1Var = (o2b1) ((vqb0) obj2).c;
                k560 k560Var = ((tb0) obj).a;
                dma1 dma1Var = (dma1) o2b1Var.b;
                bma1 bma1Var = amh1.a;
                Set setB = dma1Var.b(bma1Var, w7xVar);
                setB.getClass();
                Set setO1 = o7h.o1(setB);
                setO1.remove(k560Var.a);
                hma1 hma1VarEdit2 = dma1Var.edit();
                hma1VarEdit2.e(bma1Var, setO1);
                hma1VarEdit2.g();
                return;
            case 3:
                o2b1 o2b1Var2 = (o2b1) ((gfr) obj2).d;
                k560 k560Var2 = ((tb0) obj).a;
                dma1 dma1Var2 = (dma1) o2b1Var2.b;
                bma1 bma1Var2 = amh1.a;
                Set setB2 = dma1Var2.b(bma1Var2, w7xVar);
                setB2.getClass();
                Set setO2 = o7h.o1(setB2);
                hma1 hma1VarEdit3 = dma1Var2.edit();
                hma1VarEdit3.e(bma1Var2, dm61.x0(k560Var2.a, setO2));
                hma1VarEdit3.g();
                return;
            case 4:
                CompletableSubject completableSubject = (CompletableSubject) ((kcs) obj2).b.remove((String) obj);
                if (completableSubject != null) {
                    completableSubject.onComplete();
                    return;
                }
                return;
            case 5:
                spj0 spj0Var = (spj0) obj2;
                ps41 ps41Var = new ps41(spj0Var.t.b);
                ((p811) obj).a = ps41Var;
                spj0Var.b(ps41Var, true);
                return;
            case 6:
                Consumer consumer = ((j7m0) obj2).g;
                if (consumer != null) {
                    consumer.accept(new wjb0((pta) obj));
                    return;
                } else {
                    u890.C("eventConsumer");
                    throw null;
                }
            case 7:
                ((sam0) obj2).i.a(ham0.a);
                ((Disposable) obj).dispose();
                return;
            case 8:
                ((sas) ((s880) obj2).g).j(((k5o0) obj).a);
                return;
            case 9:
                kt91 kt91Var = (kt91) obj2;
                if (kt91Var.g()) {
                    kt91Var.k(new er91((fs91) null, (String) obj, (Integer) null, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false));
                    return;
                }
                return;
            case 10:
                ((bxp0) obj2).c(false);
                Set set = (Set) obj;
                set.size();
                Objects.toString(set);
                return;
            case 11:
                mmr0 mmr0Var = (mmr0) obj;
                Set set2 = (Set) mmr0Var.a;
                Set set3 = (Set) mmr0Var.b;
                j8m0 j8m0Var = (j8m0) ((myq0) obj2).b;
                Set<String> setO3 = o7h.o1(set2);
                setO3.removeAll(set3);
                Set<String> setO4 = o7h.o1(set3);
                setO4.removeAll(set2);
                for (String str3 : setO3) {
                    MobiusLoop mobiusLoop = j8m0Var.b;
                    if (mobiusLoop != null) {
                        mobiusLoop.a(new r4d0(Collections.singleton(str3)));
                    }
                }
                for (String str4 : setO4) {
                    MobiusLoop mobiusLoop2 = j8m0Var.b;
                    if (mobiusLoop2 != null) {
                        mobiusLoop2.a(new w4d0(Collections.singleton(str4)));
                    }
                }
                return;
            case 12:
                ((qnv0) obj2).e.onNext(new qmq0(o7h.l1(mmq0.i), (gfe) obj, true));
                return;
            case 13:
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (smq0 smq0Var : (smq0[]) obj2) {
                    mmr0 mmr0Var2 = new mmr0(smq0Var.a, Boolean.valueOf(smq0Var.c));
                    Object arrayList = linkedHashMap.get(mmr0Var2);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                        linkedHashMap.put(mmr0Var2, arrayList);
                    }
                    ((List) arrayList).add(smq0Var);
                }
                qnv0 qnv0Var = (qnv0) obj;
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    mmr0 mmr0Var3 = (mmr0) entry.getKey();
                    List list = (List) entry.getValue();
                    gfe gfeVar = (gfe) mmr0Var3.a;
                    boolean zBooleanValue = ((Boolean) mmr0Var3.b).booleanValue();
                    PublishSubject publishSubject = qnv0Var.e;
                    List list2 = list;
                    ArrayList arrayList2 = new ArrayList(q7h.U(list2, 10));
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(((smq0) it.next()).b);
                    }
                    publishSubject.onNext(new qmq0(arrayList2, gfeVar, zBooleanValue));
                }
                return;
            case 14:
                ((ywv0) obj2).g(jx20.d.g(), (tv80) obj);
                return;
            case 15:
                mzr0 mzr0Var = (mzr0) obj2;
                gzv0 gzv0Var = (gzv0) obj;
                boolean z = gzv0Var.g;
                boolean z2 = gzv0Var.h;
                if (z) {
                    numValueOf = Integer.valueOf(z2 ? 2131961193 : 2131951966);
                } else {
                    if (z) {
                        eg.o();
                        return;
                    }
                    numValueOf = !z2 ? 2131960399 : null;
                }
                if (numValueOf != null) {
                    int iIntValue = numValueOf.intValue();
                    kt91 kt91Var2 = (kt91) mzr0Var.c;
                    n57.k(iIntValue != 0, "Invalid resource ID provided: %s", new Object[]{Integer.valueOf(iIntValue)});
                    n57.k(true, "Invalid resource ID provided: %s", new Object[]{null});
                    kt91Var2.k(new er91((fs91) null, "", Integer.valueOf(iIntValue), (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false));
                    return;
                }
                return;
            case 16:
                ((b0x0) obj2).a.remove((String) obj);
                return;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                ((PublishSubject) ((mzr0) obj2).g).onNext(((zwu0) obj).a);
                return;
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                rrz0 rrz0Var = (rrz0) ((xaz0) obj2).b;
                qyo1.x(rrz0Var.a, false, true, new j3y0((Object) rrz0Var, obj, (byte) 15));
                return;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                mi11 mi11Var = (mi11) obj2;
                mi11Var.c.a(jvs0.g);
                PublishProcessor publishProcessor = mi11Var.e;
                j380 j380VarMetadata = ((ContextTrack) ((PlayerState) obj).track().b()).metadata();
                if (j380VarMetadata == null || (str = (String) j380VarMetadata.get("image_xlarge_url")) == null) {
                    str = "";
                }
                publishProcessor.onNext(new ji11(str));
                return;
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                ri11 ri11Var = (ri11) obj2;
                io.reactivex.rxjava3.functions.Consumer consumer2 = ri11Var.d;
                consumer2.accept(new hu41((int) ((e0g1) obj).a));
                consumer2.accept(gu41Var);
                ri11Var.Y.onNext(Boolean.FALSE);
                return;
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                ((zr51) obj2).b.accept(new hu41((int) ((as51) obj).a));
                return;
            case 22:
                io.reactivex.rxjava3.functions.Consumer consumer3 = ((zr51) obj2).b;
                consumer3.accept(new hu41((int) ((cs51) obj).b));
                consumer3.accept(gu41Var);
                return;
            case 23:
                ((h4e0) obj2).c.onNext(((xqx0) obj).a);
                return;
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                kt91 kt91Var3 = (kt91) obj2;
                if (kt91Var3.g()) {
                    int iC = l1d.C(((pi91) obj).f);
                    if (iC == 0) {
                        i = 2131962575;
                    } else if (iC == 1) {
                        i = 2131962576;
                    } else if (iC == 2) {
                        i = 2131962577;
                    } else if (iC == 3) {
                        i = 2131962588;
                    } else {
                        if (iC != 4) {
                            eg.o();
                            return;
                        }
                        i = 2131962594;
                    }
                    n57.k(true, "Invalid resource ID provided: %s", new Object[]{Integer.valueOf(i)});
                    n57.k(true, "Invalid resource ID provided: %s", new Object[]{null});
                    kt91Var3.k(new er91((fs91) null, "", Integer.valueOf(i), (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false));
                    return;
                }
                return;
            case 25:
                ((q491) obj2).a.invoke(Boolean.valueOf(((p491) obj).a));
                return;
            case 26:
                ((ji91) obj2).g.onNext((zuc0) obj);
                return;
            case 27:
                il91 il91Var = (il91) obj2;
                il91Var.g.c(new aih0((rig) obj, il91Var, false, (byte) 25));
                return;
            case 28:
                r1a1 r1a1Var = (r1a1) obj2;
                r1a1Var.a.c(new jyh0(r1a1Var, new k1a1((hr90) obj), (byte) 23));
                return;
            default:
                ((q7b1) obj2).e = (String) obj;
                return;
        }
    }
}
