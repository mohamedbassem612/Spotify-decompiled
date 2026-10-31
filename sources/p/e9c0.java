package p;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class e9c0 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e9c0(Object obj, Object obj2, lnm lnmVar, byte b) {
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
                e9c0 e9c0Var = new e9c0((f9c0) obj2, lnmVar, (byte) 0);
                e9c0Var.b = obj;
                return e9c0Var;
            case 1:
                e9c0 e9c0Var2 = new e9c0((u9c0) obj2, lnmVar, (byte) 1);
                e9c0Var2.b = obj;
                return e9c0Var2;
            case 2:
                return new e9c0((lec0) this.b, (ven0) obj2, lnmVar, (byte) 2);
            case 3:
                e9c0 e9c0Var3 = new e9c0((dhc0) obj2, lnmVar, (byte) 3);
                e9c0Var3.b = obj;
                return e9c0Var3;
            case 4:
                return new e9c0((b7d0) this.b, (hp90) obj2, lnmVar, (byte) 4);
            case 5:
                e9c0 e9c0Var4 = new e9c0((v7d0) obj2, lnmVar, (byte) 5);
                e9c0Var4.b = obj;
                return e9c0Var4;
            case 6:
                return new e9c0((gcd0) this.b, (ccd0) obj2, lnmVar, (byte) 6);
            case 7:
                e9c0 e9c0Var5 = new e9c0((ur00) obj2, lnmVar, (byte) 7);
                e9c0Var5.b = obj;
                return e9c0Var5;
            case 8:
                e9c0 e9c0Var6 = new e9c0((g9r) obj2, lnmVar, (byte) 8);
                e9c0Var6.b = obj;
                return e9c0Var6;
            case 9:
                return new e9c0((ip31) this.b, (tv80) obj2, lnmVar, (byte) 9);
            case 10:
                e9c0 e9c0Var7 = new e9c0((mrd0) obj2, lnmVar, (byte) 10);
                e9c0Var7.b = obj;
                return e9c0Var7;
            case 11:
                return new e9c0((qwd0) this.b, (gwd0) obj2, lnmVar, (byte) 11);
            case 12:
                return new e9c0((iu30) this.b, (yle1) obj2, lnmVar, (byte) 12);
            case 13:
                e9c0 e9c0Var8 = new e9c0((s2t) obj2, lnmVar, (byte) 13);
                e9c0Var8.b = obj;
                return e9c0Var8;
            case 14:
                return new e9c0((see0) this.b, (ihg0) obj2, lnmVar, (byte) 14);
            case 15:
                return new e9c0((mie0) this.b, (Bundle) obj2, lnmVar, (byte) 15);
            case 16:
                return new e9c0((oie0) this.b, (iu30) obj2, lnmVar, (byte) 16);
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                return new e9c0((fqe0) this.b, (rpe0) obj2, lnmVar, (byte) 17);
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                return new e9c0((i8h1) this.b, (l7h1) obj2, lnmVar, (byte) 18);
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                return new e9c0((byp) this.b, (Intent) obj2, lnmVar, (byte) 19);
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                return new e9c0((w6e0) this.b, (tv80) obj2, lnmVar, (byte) 20);
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                e9c0 e9c0Var9 = new e9c0((w9f0) obj2, lnmVar, (byte) 21);
                e9c0Var9.b = obj;
                return e9c0Var9;
            case 22:
                return new e9c0((w6e0) this.b, (String) obj2, lnmVar, (byte) 22);
            case 23:
                return new e9c0((ogf0) this.b, (dgf0) obj2, lnmVar, (byte) 23);
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                return new e9c0((tbr0) this.b, (iof0) obj2, lnmVar, (byte) 24);
            case 25:
                return new e9c0((b9y) this.b, (hof0) obj2, lnmVar, (byte) 25);
            case 26:
                return new e9c0((p410) this.b, (Intent) obj2, lnmVar, (byte) 26);
            case 27:
                return new e9c0((p811) this.b, (ven0) obj2, lnmVar, (byte) 27);
            case 28:
                e9c0 e9c0Var10 = new e9c0((n2g0) obj2, lnmVar, (byte) 28);
                e9c0Var10.b = obj;
                return e9c0Var10;
            default:
                return new e9c0((bgg0) this.b, (ven0) obj2, lnmVar, (byte) 29);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                create((bp90) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 1:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 2:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 3:
                create((List) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 4:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 5:
                create((y7d0) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 6:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 7:
                create((sn7) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 8:
                create((b5w0) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 9:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 10:
                create((srd0) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 11:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 12:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 13:
                return create((l2e) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 14:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 15:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 16:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                create((v181) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 22:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 23:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 25:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 26:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 27:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 28:
                create((String) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            default:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
        }
    }

    public final Object invokeSuspend(Object obj) {
        Object value;
        Map mapP;
        xvd0 xvd0Var;
        g4s0 g4s0Var;
        byte b = this.a;
        int i = 2;
        rih1 rih1Var = rih1.a;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                bp90 bp90Var = (bp90) this.b;
                hm5.M(obj);
                ((f9c0) obj2).d.l(bp90Var);
                return rih1Var;
            case 1:
                hm5.M(obj);
                c9n c9nVar = (c9n) this.b;
                u9c0 u9c0Var = (u9c0) obj2;
                x8c0 x8c0Var = u9c0Var.a;
                if (x8c0Var.b().compareTo(w8c0.b) >= 0) {
                    x8c0Var.a(u9c0Var);
                } else {
                    op71.m(c9nVar.J(), (CancellationException) null);
                }
                return rih1Var;
            case 2:
                hm5.M(obj);
                ven0 ven0Var = (ven0) obj2;
                if (((lec0) this.b).c != null) {
                    bby bbyVar = oec0.a;
                    ven0Var.setValue(Boolean.TRUE);
                } else {
                    bby bbyVar2 = oec0.a;
                    ven0Var.setValue(Boolean.FALSE);
                }
                return rih1Var;
            case 3:
                List list = (List) this.b;
                hm5.M(obj);
                rgc0 rgc0Var = ((dhc0) obj2).b;
                List list2 = list;
                ArrayList<vgc0> arrayList = new ArrayList(q7h.U(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(((xgc0) it.next()).b);
                }
                ArrayList arrayList2 = new ArrayList();
                for (vgc0 vgc0Var : arrayList) {
                    String string = vgc0Var.a;
                    if (string == null) {
                        Integer num = vgc0Var.b;
                        string = num != null ? rgc0Var.b.getString(num.intValue()) : null;
                    }
                    if (string != null) {
                        arrayList2.add(string);
                    }
                }
                Set setP1 = o7h.p1(arrayList2);
                rgc0Var.e = setP1;
                hma1 hma1VarEdit = rgc0Var.c.edit();
                hma1VarEdit.e(rgc0.f, setP1);
                hma1VarEdit.g();
                return rih1Var;
            case 4:
                hm5.M(obj);
                ser serVar = ((b7d0) this.b).d;
                String str = nik1.E5.a;
                hp90 hp90Var = (hp90) obj2;
                String str2 = hp90Var.c;
                String str3 = hp90Var.b;
                if (ihc1.y0(str3)) {
                    str3 = str2;
                }
                r6d0 r6d0Var = new r6d0(str2, str3, hp90Var.d);
                Bundle bundle = new Bundle();
                bundle.putParcelable("jam.listen.along.onboarding.args", r6d0Var);
                serVar.a(null, str, bundle);
                return rih1Var;
            case 5:
                y7d0 y7d0Var = (y7d0) this.b;
                hm5.M(obj);
                ((v7d0) obj2).b.a(y7d0Var);
                return rih1Var;
            case 6:
                hm5.M(obj);
                mgc mgcVar = ((gcd0) this.b).a;
                List<tbd0> list3 = ((ccd0) obj2).a;
                if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                    for (tbd0 tbd0Var : list3) {
                        if ((tbd0Var instanceof obd0) || (tbd0Var instanceof qbd0)) {
                            i = 1;
                        }
                    }
                }
                mgcVar.o(i);
                return rih1Var;
            case 7:
                sn7 sn7Var = (sn7) this.b;
                hm5.M(obj);
                if (sn7Var != null) {
                    bpb1 bpb1Var = (bpb1) ((ur00) obj2).e;
                    Boolean boolValueOf = Boolean.valueOf(!sn7Var.b);
                    bpb1Var.getClass();
                    bpb1Var.m((Object) null, boolValueOf);
                }
                return rih1Var;
            case 8:
                b5w0 b5w0Var = (b5w0) this.b;
                hm5.M(obj);
                bpb1 bpb1Var2 = ((z5s) ((g9r) obj2).d).a;
                do {
                    value = bpb1Var2.getValue();
                    mapP = (Map) value;
                    if (b5w0Var instanceof a5w0) {
                        ucd0 ucd0Var = ((a5w0) b5w0Var).a;
                        if (ucd0Var.a.length() > 0) {
                            mapP = sqg0.P(mapP, new mmr0(ucd0Var.a, ucd0Var));
                        }
                    } else {
                        if (!(b5w0Var instanceof z4w0)) {
                            eg.o();
                            return null;
                        }
                        List list4 = ((z4w0) b5w0Var).a;
                        int iS = zno1.s(q7h.U(list4, 10));
                        if (iS < 16) {
                            iS = 16;
                        }
                        LinkedHashMap linkedHashMap = new LinkedHashMap(iS);
                        for (Object obj3 : list4) {
                            linkedHashMap.put(((ucd0) obj3).a, obj3);
                        }
                        mapP = linkedHashMap;
                    }
                } while (!bpb1Var2.k(value, mapP));
                return rih1Var;
            case 9:
                hm5.M(obj);
                ip31 ip31Var = (ip31) this.b;
                kt91 kt91Var = (kt91) ((ynb0) ip31Var.b).get();
                n57.k(true, "Invalid resource ID provided: %s", new Object[]{2131953634});
                n57.k(true, "Invalid resource ID provided: %s", new Object[]{null});
                n57.k(true, "Invalid resource ID provided: %s", new Object[]{2131953634});
                kt91Var.k(new er91((fs91) null, "", 2131953634, (String) null, 2131953635, new t230(ip31Var, (tv80) obj2, (byte) 11), (cvr) null, (xq91) null, false));
                return rih1Var;
            case 10:
                srd0 srd0Var = (srd0) this.b;
                hm5.M(obj);
                mrd0 mrd0Var = (mrd0) obj2;
                srd0 srd0Var2 = mrd0Var.T0;
                if (srd0Var2 != null) {
                    srd0Var2.b.set(null);
                }
                mrd0Var.T0 = srd0Var;
                srd0Var.b.set(new ird0(mrd0Var));
                return rih1Var;
            case 11:
                hm5.M(obj);
                qwd0 qwd0Var = (qwd0) this.b;
                gwd0 gwd0Var = (gwd0) obj2;
                eh30 eh30Var = gwd0Var.h;
                lzn0 lzn0Var = gwd0Var.g;
                int iC = l1d.C(qwd0Var.a);
                if (iC == 0) {
                    xvd0Var = mvd0.a;
                } else if (iC == 1) {
                    xvd0Var = tvd0.a;
                } else if (iC == 2) {
                    xvd0Var = rvd0.a;
                } else {
                    if (iC != 3) {
                        eg.o();
                        return null;
                    }
                    xvd0Var = uvd0.a;
                }
                eh30Var.a(xvd0Var, new p350(0, lzn0Var, lzn0.class, "closeCurrentPage", "closeCurrentPage()V", 0, (byte) 13));
                return rih1Var;
            case 12:
                hm5.M(obj);
                iu30 iu30Var = (iu30) this.b;
                yle1 yle1Var = (yle1) obj2;
                if (yle1Var instanceof ule1) {
                    g4s0Var = g4s0.a;
                } else if (yle1Var instanceof xle1) {
                    g4s0Var = g4s0.b;
                } else if (yle1Var instanceof vle1) {
                    g4s0Var = g4s0.c;
                } else {
                    if (!(yle1Var instanceof wle1)) {
                        eg.o();
                        return null;
                    }
                    g4s0Var = g4s0.d;
                }
                iu30Var.invoke(g4s0Var);
                return rih1Var;
            case 13:
                l2e l2eVar = (l2e) this.b;
                hm5.M(obj);
                ((s2t) obj2).d((CancellationException) null);
                return l2eVar;
            case 14:
                hm5.M(obj);
                ((see0) this.b).f = new qee0((ihg0) obj2, (byte) 0);
                return rih1Var;
            case 15:
                hm5.M(obj);
                a1r0.m(((mie0) this.b).f, "spotify:internal:permissions-location-request", (tv80) null, (Bundle) obj2, 8);
                return rih1Var;
            case 16:
                hm5.M(obj);
                oie0 oie0Var = (oie0) this.b;
                iu30 iu30Var2 = (iu30) obj2;
                sie0 sie0Var = (sie0) oie0Var.i.getValue();
                if (sie0Var.a == null && sie0Var.c == 1) {
                    oie0Var.k(iu30Var2, false);
                }
                return rih1Var;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                hm5.M(obj);
                ((fqe0) this.b).f.k(new er91((fs91) null, ((rpe0) obj2).a, (Integer) null, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false));
                return rih1Var;
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                hm5.M(obj);
                ((i8h1) this.b).f((l7h1) obj2, (Set) null);
                return rih1Var;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                hm5.M(obj);
                ((bi0) ((byp) this.b).a).a((Intent) obj2);
                return rih1Var;
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                hm5.M(obj);
                ((lzn0) ((w6e0) this.b).e).a(nik1.d3.a, (tv80) obj2, (Bundle) null);
                return rih1Var;
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                v181 v181Var = (v181) this.b;
                hm5.M(obj);
                boolean z = v181Var instanceof u181;
                w9f0 w9f0Var = (w9f0) obj2;
                w6e0 w6e0Var = (w6e0) w9f0Var.f;
                if (z) {
                    bsc0 bsc0Var = new bsc0(w9f0Var, v181Var, (byte) 15);
                    eur eurVar = (eur) w6e0Var.d;
                    Context context = (Context) w6e0Var.c;
                    eurVar.b(new fwi0(ywi0.c, context.getString(2131957756), context.getString(2131957755), new uvi0(context.getString(2131957754), new e4f0(w6e0Var, (byte) 2)), 96), new e4f0(bsc0Var, (byte) 3));
                } else {
                    ((eur) w6e0Var.d).a("LOSSLESS");
                }
                return rih1Var;
            case 22:
                hm5.M(obj);
                w6e0 w6e0Var2 = (w6e0) this.b;
                lzn0 lzn0Var2 = (lzn0) w6e0Var2.b;
                if (lzn0Var2.j((Activity) w6e0Var2.d)) {
                    lzn0Var2.h((String) obj2);
                } else {
                    a1r0.j((a1r0) w6e0Var2.e, (String) obj2, (String) null, (Bundle) null, false, 14);
                }
                return rih1Var;
            case 23:
                hm5.M(obj);
                dgf0 dgf0Var = (dgf0) obj2;
                ((ogf0) this.b).b.a(dgf0Var.e, dgf0Var.d, dgf0Var.f, new ArrayList(dgf0Var.g));
                return rih1Var;
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                hm5.M(obj);
                ((tbr0) this.b).a(new y231(new gpf0(((iof0) obj2).a)));
                return rih1Var;
            case 25:
                hm5.M(obj);
                hof0 hof0Var = (hof0) obj2;
                ((b9y) this.b).a(hof0Var.b, hof0Var.a, hof0Var.c, new ArrayList(hof0Var.d));
                return rih1Var;
            case 26:
                hm5.M(obj);
                ((Context) ((p410) this.b).b).startActivity((Intent) obj2);
                return rih1Var;
            case 27:
                p811 p811Var = (p811) this.b;
                hm5.M(obj);
                ven0 ven0Var2 = (ven0) obj2;
                if (((v0g0) ven0Var2.getValue()) != null) {
                    v0g0 v0g0Var = (v0g0) ven0Var2.getValue();
                    v0g0Var.getClass();
                    if (!v0g0Var.equals(((ven0) p811Var.a).getValue())) {
                        ven0 ven0Var3 = (ven0) p811Var.a;
                        v0g0 v0g0Var2 = (v0g0) ven0Var2.getValue();
                        v0g0Var2.getClass();
                        ven0Var3.setValue(v0g0Var2);
                    }
                }
                return rih1Var;
            case 28:
                String str4 = (String) this.b;
                hm5.M(obj);
                ((n2g0) obj2).g = str4;
                return rih1Var;
            default:
                hm5.M(obj);
                if (((bgg0) this.b) instanceof agg0) {
                    ((ven0) obj2).setValue(Boolean.FALSE);
                }
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e9c0(Object obj, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = obj;
    }
}
