package p;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import com.spotify.concertpageview.v1.Row;
import com.spotify.cosmos.util.libs.proto.EpisodeDecorationPolicy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class eum extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ eum(Object obj, Object obj2, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                eum eumVar = new eum((hum) obj2, lnmVar, (byte) 0);
                eumVar.b = obj;
                return eumVar;
            case 1:
                return new eum((rm5) this.b, (yn71) obj2, lnmVar, (byte) 1);
            case 2:
                return new eum((w8n) this.b, (nre0) obj2, lnmVar, (byte) 2);
            case 3:
                return new eum((xcn) this.b, (adn) obj2, lnmVar, (byte) 3);
            case 4:
                return new eum((t24) this.b, (jnn) obj2, lnmVar, (byte) 4);
            case 5:
                return new eum((ihg0) this.b, (ven0) obj2, lnmVar, (byte) 5);
            case 6:
                return new eum((mrn) this.b, (wen0) obj2, lnmVar, (byte) 6);
            case 7:
                return new eum((c8b) this.b, (w2o) obj2, lnmVar, (byte) 7);
            case 8:
                eum eumVar2 = new eum((y2o) obj2, lnmVar, (byte) 8);
                eumVar2.b = obj;
                return eumVar2;
            case 9:
                eum eumVar3 = new eum((cp31) obj2, lnmVar, (byte) 9);
                eumVar3.b = obj;
                return eumVar3;
            case 10:
                eum eumVar4 = new eum((x6o) obj2, lnmVar, (byte) 10);
                eumVar4.b = obj;
                return eumVar4;
            case 11:
                return new eum((asn) this.b, (zql0) obj2, lnmVar, (byte) 11);
            case 12:
                eum eumVar5 = new eum((qoo) obj2, lnmVar, (byte) 12);
                eumVar5.b = obj;
                return eumVar5;
            case 13:
                return new eum((ven0) this.b, (cir0) obj2, lnmVar, (byte) 13);
            case 14:
                eum eumVar6 = new eum((m1r) obj2, lnmVar, (byte) 14);
                eumVar6.b = obj;
                return eumVar6;
            case 15:
                eum eumVar7 = new eum((k2q) obj2, lnmVar, (byte) 15);
                eumVar7.b = obj;
                return eumVar7;
            case 16:
                return new eum((zor) this.b, (l7l) obj2, lnmVar, (byte) 16);
            case 17:
                eum eumVar8 = new eum((wpr) obj2, lnmVar, (byte) 17);
                eumVar8.b = obj;
                return eumVar8;
            case 18:
                eum eumVar9 = new eum((mzr) obj2, lnmVar, (byte) 18);
                eumVar9.b = obj;
                return eumVar9;
            case 19:
                eum eumVar10 = new eum((tv80) obj2, lnmVar, (byte) 19);
                eumVar10.b = obj;
                return eumVar10;
            case 20:
                return new eum((atc1) this.b, (p7s) obj2, lnmVar, (byte) 20);
            case Row.TICKETING_TIMELINE_PLACEHOLDER_ROW_FIELD_NUMBER /* 21 */:
                return new eum((p7s) this.b, (eyh0) obj2, lnmVar, (byte) 21);
            case 22:
                return new eum((cs31) this.b, (p7s) obj2, lnmVar, (byte) 22);
            case EpisodeDecorationPolicy.IS_BOOK_CHAPTER_FIELD_NUMBER /* 23 */:
                return new eum((qom0) this.b, (ven0) obj2, lnmVar, (byte) 23);
            case EpisodeDecorationPolicy.IS_PODCAST_SHORT_FIELD_NUMBER /* 24 */:
                eum eumVar11 = new eum((dis) obj2, lnmVar, (byte) 24);
                eumVar11.b = ((gp90) obj).a;
                return eumVar11;
            case EpisodeDecorationPolicy.IS_CURATED_FIELD_NUMBER /* 25 */:
                eum eumVar12 = new eum((cjs) obj2, lnmVar, (byte) 25);
                eumVar12.b = obj;
                return eumVar12;
            case 26:
                eum eumVar13 = new eum((uus) obj2, lnmVar, (byte) 26);
                eumVar13.b = obj;
                return eumVar13;
            case 27:
                eum eumVar14 = new eum((j4e) obj2, lnmVar, (byte) 27);
                eumVar14.b = obj;
                return eumVar14;
            case 28:
                eum eumVar15 = new eum((grt) obj2, lnmVar, (byte) 28);
                eumVar15.b = obj;
                return eumVar15;
            default:
                eum eumVar16 = new eum((fut) obj2, lnmVar, (byte) 29);
                eumVar16.b = obj;
                return eumVar16;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invoke(Object obj, Object obj2) throws NoWhenBranchMatchedException {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                create((mmr0) obj, (lnm) obj2).invokeSuspend(rih1Var);
                throw null;
            case 1:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 2:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 3:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 4:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 5:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 6:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 7:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 8:
                create((fv21) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 9:
                create((c1o) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 10:
                create((a7o) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 11:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 12:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 13:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 14:
                return create((y1r) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 15:
                return create((Boolean) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 16:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 17:
                create((ih91) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 18:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 19:
                return create((lj70) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 20:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case Row.TICKETING_TIMELINE_PLACEHOLDER_ROW_FIELD_NUMBER /* 21 */:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 22:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case EpisodeDecorationPolicy.IS_BOOK_CHAPTER_FIELD_NUMBER /* 23 */:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case EpisodeDecorationPolicy.IS_PODCAST_SHORT_FIELD_NUMBER /* 24 */:
                String str = ((gp90) obj).a;
                eum eumVar = new eum((dis) this.c, (lnm) obj2, (byte) 24);
                eumVar.b = str;
                eumVar.invokeSuspend(rih1Var);
                return rih1Var;
            case EpisodeDecorationPolicy.IS_CURATED_FIELD_NUMBER /* 25 */:
                return create((pp90) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 26:
                return create((Map) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 27:
                return create((re61) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 28:
                create((ssw0) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            default:
                create((Map) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invokeSuspend(Object obj) throws NoWhenBranchMatchedException {
        m231 m231Var;
        ou80 ou80Var;
        int i;
        int i2;
        int i3;
        ComponentName componentName;
        ArrayList arrayList;
        byte b = this.a;
        byte b2 = 10;
        boolean z = false;
        m231 m231Var2 = null;
        rih1 rih1Var = rih1.a;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                mmr0 mmr0Var = (mmr0) this.b;
                hm5.M(obj);
                if (mmr0Var.b == null) {
                    throw new NoWhenBranchMatchedException();
                }
                throw new ClassCastException();
            case 1:
                hm5.M(obj);
                ((ClipboardManager) ((Context) ((rm5) this.b).a).getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("Spotify Link", ((yn71) obj2).a));
                return rih1Var;
            case 2:
                hm5.M(obj);
                uny unyVar = ((w8n) this.b).c;
                mev mevVar = (mev) unyVar.d;
                kp00 kp00Var = (kp00) unyVar.c;
                Activity activity = (Activity) kp00Var.b;
                int iOrdinal = ((nre0) obj2).ordinal();
                if (iOrdinal == 0) {
                    mw40 mw40VarT = yoi1.T(activity, activity.getString(2131955847), activity.getString(2131957666));
                    String string = activity.getString(2131957665);
                    js00 js00Var = new js00(kp00Var, mevVar, (byte) 1);
                    mw40VarT.a = string;
                    mw40VarT.c = js00Var;
                    mw40VarT.e = true;
                    mw40VarT.f = new ks00(kp00Var, mevVar, (byte) 1);
                    mw40VarT.b().b();
                } else if (iOrdinal == 1) {
                    mw40 mw40VarT2 = yoi1.T(activity, activity.getString(2131961325), activity.getString(2131961324));
                    String string2 = activity.getString(2131961323);
                    js00 js00Var2 = new js00(kp00Var, mevVar, (byte) 2);
                    mw40VarT2.a = string2;
                    mw40VarT2.c = js00Var2;
                    mw40VarT2.e = true;
                    mw40VarT2.f = new ks00(kp00Var, mevVar, (byte) 2);
                    mw40VarT2.b().b();
                } else {
                    if (iOrdinal != 2 && iOrdinal != 3) {
                        eg.o();
                        return null;
                    }
                    mw40 mw40VarT3 = yoi1.T(activity, activity.getString(2131955847), activity.getString(2131955846));
                    String string3 = activity.getString(2131955843);
                    ln5 ln5Var = new ln5(kp00Var, mevVar, (byte) 12);
                    mw40VarT3.a = string3;
                    mw40VarT3.c = ln5Var;
                    String string4 = activity.getString(2131955844);
                    js00 js00Var3 = new js00(kp00Var, mevVar, (byte) 0);
                    mw40VarT3.b = string4;
                    mw40VarT3.d = js00Var3;
                    mw40VarT3.e = true;
                    mw40VarT3.f = new ks00(kp00Var, mevVar, (byte) 0);
                    mw40VarT3.b().b();
                }
                return rih1Var;
            case 3:
                hm5.M(obj);
                oql oqlVar = ((xcn) this.b).b;
                int i4 = ((adn) obj2).h;
                i8h1 i8h1Var = (i8h1) ((kly0) oqlVar.b).get();
                ksk0 ksk0Var = (ksk0) oqlVar.c;
                String strValueOf = String.valueOf(i4);
                x6h1 x6h1VarC = ksk0Var.c.c();
                x6h1VarC.i.add(new a7h1("high_scores", (String) null, (Integer) null, (String) null, strValueOf));
                x6h1VarC.j = true;
                y6h1 y6h1VarA = x6h1VarC.a();
                k7h1 k7h1Var = new k7h1();
                ((xjn) k7h1Var).a = y6h1VarA;
                ((xjn) k7h1Var).b = ksk0Var.b;
                ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
                k7h1Var.e = ksk0Var.d;
                i8h1Var.f(k7h1Var.a(), (Set) null);
                return rih1Var;
            case 4:
                hm5.M(obj);
                int iOrdinal2 = ((tnn) ((t24) this.b).h.getValue()).ordinal();
                if (iOrdinal2 == 0) {
                    ((jnn) obj2).invoke();
                } else if (iOrdinal2 != 1) {
                    if (iOrdinal2 != 2) {
                        eg.o();
                        return null;
                    }
                    ((jnn) obj2).invoke();
                }
                return rih1Var;
            case 5:
                hm5.M(obj);
                if (((frn) ((ven0) obj2).getValue()).b) {
                    ((ihg0) this.b).a(tto1.f(hh0.a));
                }
                return rih1Var;
            case 6:
                hm5.M(obj);
                if (((mrn) this.b) != null) {
                    frn frnVar = new frn();
                    bpb1 bpb1Var = (wen0) obj2;
                    bpb1Var.getClass();
                    bpb1Var.m((Object) null, frnVar);
                }
                return rih1Var;
            case 7:
                hm5.M(obj);
                ((c8b) this.b).a(((w2o) obj2).b.a, true);
                return rih1Var;
            case 8:
                fv21 fv21Var = (fv21) this.b;
                hm5.M(obj);
                y2o y2oVar = (y2o) obj2;
                y2oVar.h = fv21Var;
                y2oVar.i();
                return rih1Var;
            case 9:
                c1o c1oVar = (c1o) this.b;
                hm5.M(obj);
                ((cp31) obj2).d = c1oVar;
                return rih1Var;
            case 10:
                a7o a7oVar = (a7o) this.b;
                hm5.M(obj);
                x6o x6oVar = (x6o) obj2;
                x6oVar.X.l(a7oVar);
                lko lkoVar = x6oVar.e;
                List list = a7oVar.c;
                ArrayList arrayList2 = new ArrayList();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    r7h.W(((pwm) it.next()).b, arrayList2);
                }
                ArrayList arrayList3 = new ArrayList();
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    String str = ((iwm) it2.next()).b;
                    if (str != null) {
                        arrayList3.add(str);
                    }
                }
                mko mkoVarA = lko.a(lkoVar, new huz(o7h.p1(arrayList3), b2), x6oVar.f.c);
                mkoVarA.start();
                x6oVar.Z = mkoVarA;
                if (a7oVar.c.isEmpty()) {
                    x6oVar.h(new Throwable("No contributors available"));
                } else {
                    x6oVar.i();
                }
                return rih1Var;
            case 11:
                hm5.M(obj);
                ((i8h1) ((asn) this.b).c).f(((zql0) obj2).e(), (Set) null);
                return rih1Var;
            case 12:
                hm5.M(obj);
                c9n c9nVar = (c9n) this.b;
                qoo qooVar = (qoo) obj2;
                AtomicReference atomicReference = qooVar.b;
                xab1 xab1VarT = fn31.T(c9nVar, (o8n) null, 0, new wt((faa0) atomicReference.getAndSet(null), qooVar, (lnm) null, (byte) 29), 3);
                while (!atomicReference.compareAndSet(null, xab1VarT)) {
                    if (atomicReference.get() != null) {
                        return Boolean.valueOf(z);
                    }
                }
                z = true;
                return Boolean.valueOf(z);
            case 13:
                hm5.M(obj);
                mv20 mv20Var = (nv20) ((ven0) this.b).getValue();
                if (mv20Var != null) {
                    cir0 cir0Var = (cir0) obj2;
                    List<oyh> listW = mv20Var.w();
                    int iS = zno1.s(q7h.U(listW, 10));
                    if (iS < 16) {
                        iS = 16;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(iS);
                    for (oyh oyhVar : listW) {
                        linkedHashMap.put(new jvb1(oyhVar.a), oyhVar.b);
                    }
                    if (mv20Var instanceof mv20) {
                        cir0Var.c().a(new y231(new hso(linkedHashMap, mv20Var.b)));
                    } else {
                        if (!(mv20Var instanceof lv20)) {
                            eg.o();
                            return null;
                        }
                        cir0Var.c().a(new y231(new gso(linkedHashMap)));
                    }
                }
                return rih1Var;
            case 14:
                m1r m1rVar = (m1r) obj2;
                x1r x1rVar = (y1r) this.b;
                hm5.M(obj);
                boolean z2 = x1rVar instanceof x1r;
                if (z2 && x1rVar.a == 1) {
                    return (vgc0) m1rVar.c.getValue();
                }
                if (z2 && x1rVar.a == 3) {
                    return (vgc0) m1rVar.d.getValue();
                }
                return null;
            case 15:
                Boolean bool = (Boolean) this.b;
                hm5.M(obj);
                bool.getClass();
                return bool.booleanValue() ? new x1r(1) : w1r.a;
            case 16:
                hm5.M(obj);
                ((zor) this.b).g((l7l) obj2);
                return rih1Var;
            case 17:
                wpr wprVar = (wpr) obj2;
                gh91 gh91Var = (ih91) this.b;
                hm5.M(obj);
                if (gh91Var instanceof gh91) {
                    gh91 gh91Var2 = gh91Var;
                    wprVar.d = gh91Var2;
                    long j = gh91Var2.f;
                    faa0 faa0Var = wprVar.c;
                    if (faa0Var != null) {
                        faa0Var.d((CancellationException) null);
                    }
                    wprVar.c = c921.y(wprVar.b, (o8n) null, 0, new xn2(wprVar, gh91Var2, j, (lnm) null, (byte) 3), 3);
                } else {
                    if (!(gh91Var instanceof fh91)) {
                        eg.o();
                        return null;
                    }
                    faa0 faa0Var2 = wprVar.c;
                    if (faa0Var2 != null) {
                        faa0Var2.d((CancellationException) null);
                    }
                    wprVar.d = null;
                }
                return rih1Var;
            case 18:
                hm5.M(obj);
                mzr mzrVar = (mzr) obj2;
                bma1 bma1Var = mzr.e;
                String strE = ((dma1) mzrVar.d.getValue()).e(mzr.e, (String) null);
                w7x w7xVar = w7x.a;
                if (strE == null) {
                    return w7xVar;
                }
                try {
                    m231Var = (List) mzrVar.a.a(strE, new r36(chc1.a, (byte) 0));
                    break;
                } catch (Throwable th) {
                    m231Var = new m231(th);
                }
                Throwable thA = e331.a(m231Var);
                if (thA != null) {
                    n57.g("Failed to decode FirstSave shown-for-types", thA);
                }
                List list2 = (List) (m231Var instanceof m231 ? null : m231Var);
                return list2 != null ? o7h.p1(list2) : w7xVar;
            case 19:
                lj70 lj70Var = (lj70) this.b;
                hm5.M(obj);
                String str2 = lj70Var.b;
                tv80 tv80Var = (tv80) obj2;
                if (tv80Var != null && (ou80Var = tv80Var.a) != null) {
                    m231Var2 = ou80Var.a;
                }
                if (u890.j(str2, m231Var2) && lj70Var.a.a == 33 && ((lj70Var instanceof jj70) || (lj70Var instanceof ij70))) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 20:
                List list3 = ((atc1) this.b).a;
                hm5.M(obj);
                if (Build.VERSION.SDK_INT < 36 || ibc.a() < 3600001) {
                    list3.size();
                } else {
                    list3.size();
                    mwh0 mwh0Var = (mwh0) ((p7s) obj2).e.getValue();
                    List<wqt> list4 = list3;
                    ArrayList arrayList4 = new ArrayList(q7h.U(list4, 10));
                    for (wqt wqtVar : list4) {
                        String str3 = wqtVar.a;
                        Bundle bundle = Bundle.EMPTY;
                        String str4 = wqtVar.b;
                        switch (wqtVar.c) {
                            case 0:
                                i = 0;
                                break;
                            case 1:
                                i = 1001;
                                break;
                            case 2:
                            case 6:
                            default:
                                i = 1002;
                                break;
                            case 3:
                                i = 8;
                                break;
                            case 4:
                                i = 1003;
                                break;
                            case 5:
                                i = 1004;
                                break;
                            case 7:
                                i = 1006;
                                break;
                            case 8:
                                i = 1007;
                                break;
                            case 9:
                                i = 1008;
                                break;
                            case 10:
                                i = 1009;
                                break;
                            case 11:
                                i = 1010;
                                break;
                        }
                        arrayList4.add(new vqt(i, str3, str4));
                    }
                    mwh0Var.a(new btc1(arrayList4));
                }
                return rih1Var;
            case Row.TICKETING_TIMELINE_PLACEHOLDER_ROW_FIELD_NUMBER /* 21 */:
                hm5.M(obj);
                ((p7s) this.b).c();
                owh0.f((eyh0) obj2);
                return rih1Var;
            case 22:
                p7s p7sVar = (p7s) obj2;
                cs31 cs31Var = (cs31) this.b;
                List list5 = cs31Var.a;
                hm5.M(obj);
                if (Build.VERSION.SDK_INT < 37 || (componentName = cs31Var.c) == null) {
                    list5.size();
                    p7sVar.c();
                    jqd0 jqd0Var = new jqd0();
                    List<bs31> list6 = list5;
                    ArrayList arrayList5 = new ArrayList(q7h.U(list6, 10));
                    for (bs31 bs31Var : list6) {
                        yr31 yr31Var = new yr31(bs31Var.a);
                        int iC = l1d.C(bs31Var.b);
                        if (iC == 0) {
                            i2 = 0;
                        } else if (iC == 1) {
                            i2 = 1;
                        } else {
                            if (iC != 2) {
                                eg.o();
                                return null;
                            }
                            i2 = 2;
                        }
                        yr31Var.a = i2;
                        int iC2 = l1d.C(bs31Var.c);
                        if (iC2 == 0) {
                            i3 = 0;
                        } else {
                            if (iC2 != 1) {
                                eg.o();
                                return null;
                            }
                            i3 = 10000;
                        }
                        yr31Var.c = i3;
                        yr31Var.e = bs31Var.d;
                        yr31Var.b = bs31Var.e;
                        arrayList5.add(new zr31(yr31Var));
                    }
                    jqd0Var.A(arrayList5);
                    jqd0Var.d = cs31Var.b;
                    jqd0Var.b = false;
                    owh0.g(new as31(jqd0Var));
                } else {
                    list5.size();
                    componentName.toString();
                    ((mwh0) p7sVar.e.getValue()).e(ka4.g(cs31Var));
                }
                return rih1Var;
            case EpisodeDecorationPolicy.IS_BOOK_CHAPTER_FIELD_NUMBER /* 23 */:
                hm5.M(obj);
                ven0 ven0Var = (ven0) obj2;
                if (((Boolean) ven0Var.getValue()) == null) {
                    oom0 oom0Var = (qom0) this.b;
                    if (oom0Var instanceof oom0) {
                        ArrayList arrayList6 = oom0Var.b;
                        if (!arrayList6.isEmpty()) {
                            Iterator it3 = arrayList6.iterator();
                            while (it3.hasNext()) {
                                if (((nom0) it3.next()).c) {
                                    z = true;
                                }
                            }
                        }
                        ven0Var.setValue(Boolean.valueOf(z));
                    }
                }
                return rih1Var;
            case EpisodeDecorationPolicy.IS_PODCAST_SHORT_FIELD_NUMBER /* 24 */:
                String str5 = (String) this.b;
                hm5.M(obj);
                n36 n36Var = ((dis) obj2).a;
                if (n36Var.c > 10) {
                    n36Var.removeFirst();
                }
                n36Var.addLast(new gp90(str5));
                return rih1Var;
            case EpisodeDecorationPolicy.IS_CURATED_FIELD_NUMBER /* 25 */:
                pp90 pp90Var = (pp90) this.b;
                hm5.M(obj);
                boolean z3 = pp90Var != null;
                if (pp90Var != null) {
                    ArrayList<hp90> arrayList7 = pp90Var.c;
                    arrayList = new ArrayList(q7h.U(arrayList7, 10));
                    for (hp90 hp90Var : arrayList7) {
                        arrayList.add(new td10(hp90Var.d, hp90Var.c, hp90Var.b, (sd10) null));
                    }
                } else {
                    arrayList = z6x.a;
                }
                if (z3 && ((cjs) obj2).b.a() && pp90Var.h.b.f) {
                    z = true;
                }
                return new vo50(arrayList, z3, z);
            case 26:
                Map map = (Map) this.b;
                hm5.M(obj);
                return Boolean.valueOf(!map.containsKey(((uus) obj2).a.a));
            case 27:
                re61 re61Var = (re61) this.b;
                hm5.M(obj);
                return Boolean.valueOf(re61Var.a.d((j4e) obj2));
            case 28:
                ssw0 ssw0Var = (ssw0) this.b;
                hm5.M(obj);
                grt grtVar = (grt) obj2;
                fn31.T(ssw0Var, (o8n) null, 0, new p1r(grtVar, ssw0Var, (lnm) null, (byte) 8), 3);
                fn31.T(ssw0Var, (o8n) null, 0, new n1o(grtVar, (lnm) null, (byte) 28), 3);
                return rih1Var;
            default:
                Map map2 = (Map) this.b;
                hm5.M(obj);
                ((fut) obj2).h.l(map2);
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ eum(Object obj, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = obj;
    }
}
