package p;

import android.content.Context;
import android.graphics.Bitmap;
import android.widget.FrameLayout;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import io.reactivex.rxjava3.core.BackpressureStrategy;
import io.reactivex.rxjava3.core.Observable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class hzu0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hzu0(Object obj, Object obj2, byte b) {
        super(1);
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public final Object invoke(Object obj) {
        Object value;
        byte b = this.a;
        byte b2 = 8;
        byte b3 = 14;
        byte b4 = 11;
        boolean z = true;
        rih1 rih1Var = rih1.a;
        byte b5 = 10;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                vu30 vu30Var = (vu30) obj;
                List<j0v0> list = ((qzu0) obj3).h0;
                mbt mbtVar = (mbt) obj2;
                ArrayList arrayList = new ArrayList(q7h.U(list, 10));
                for (j0v0 j0v0Var : list) {
                    arrayList.add((ibt) vu30Var.invoke(j0v0Var, new wpu0((Object) j0v0Var, (Object) mbtVar, (byte) 7)));
                }
                return arrayList;
            case 1:
                vu30 vu30Var2 = (vu30) obj;
                List<j0v0> list2 = ((qzu0) obj3).e0;
                nbt nbtVar = (nbt) obj2;
                ArrayList arrayList2 = new ArrayList(q7h.U(list2, 10));
                for (j0v0 j0v0Var2 : list2) {
                    arrayList2.add((ibt) vu30Var2.invoke(j0v0Var2, new wpu0(j0v0Var2, nbtVar, b2)));
                }
                return arrayList2;
            case 2:
                vu30 vu30Var3 = (vu30) obj;
                List<j0v0> list3 = ((qzu0) obj3).d0;
                obt obtVar = (obt) obj2;
                ArrayList arrayList3 = new ArrayList(q7h.U(list3, 10));
                for (j0v0 j0v0Var3 : list3) {
                    arrayList3.add((ibt) vu30Var3.invoke(j0v0Var3, new wpu0((Object) j0v0Var3, (Object) obtVar, (byte) 9)));
                }
                return arrayList3;
            case 3:
                vu30 vu30Var4 = (vu30) obj;
                List<j0v0> list4 = ((qzu0) obj3).g0;
                qbt qbtVar = (qbt) obj2;
                ArrayList arrayList4 = new ArrayList(q7h.U(list4, 10));
                for (j0v0 j0v0Var4 : list4) {
                    arrayList4.add((ibt) vu30Var4.invoke(j0v0Var4, new wpu0(j0v0Var4, qbtVar, b5)));
                }
                return arrayList4;
            case 4:
                vu30 vu30Var5 = (vu30) obj;
                List<j0v0> list5 = ((qzu0) obj3).o0;
                sbt sbtVar = (sbt) obj2;
                ArrayList arrayList5 = new ArrayList(q7h.U(list5, 10));
                for (j0v0 j0v0Var5 : list5) {
                    arrayList5.add((ibt) vu30Var5.invoke(j0v0Var5, new wpu0(j0v0Var5, sbtVar, b4)));
                }
                return arrayList5;
            case 5:
                vu30 vu30Var6 = (vu30) obj;
                List<j0v0> list6 = ((qzu0) obj3).i0;
                tbt tbtVar = (tbt) obj2;
                ArrayList arrayList6 = new ArrayList(q7h.U(list6, 10));
                for (j0v0 j0v0Var6 : list6) {
                    arrayList6.add((ibt) vu30Var6.invoke(j0v0Var6, new wpu0((Object) j0v0Var6, (Object) tbtVar, (byte) 12)));
                }
                return arrayList6;
            case 6:
                vu30 vu30Var7 = (vu30) obj;
                List<j0v0> list7 = ((qzu0) obj3).f0;
                ubt ubtVar = (ubt) obj2;
                ArrayList arrayList7 = new ArrayList(q7h.U(list7, 10));
                for (j0v0 j0v0Var7 : list7) {
                    arrayList7.add((ibt) vu30Var7.invoke(j0v0Var7, new wpu0((Object) j0v0Var7, (Object) ubtVar, (byte) 13)));
                }
                return arrayList7;
            case 7:
                vu30 vu30Var8 = (vu30) obj;
                List<j0v0> list8 = ((qzu0) obj3).l0;
                vbt vbtVar = (vbt) obj2;
                ArrayList arrayList8 = new ArrayList(q7h.U(list8, 10));
                for (j0v0 j0v0Var8 : list8) {
                    arrayList8.add((ibt) vu30Var8.invoke(j0v0Var8, new wpu0(j0v0Var8, vbtVar, b3)));
                }
                return arrayList8;
            case 8:
                vu30 vu30Var9 = (vu30) obj;
                List<j0v0> list9 = ((qzu0) obj3).j0;
                wbt wbtVar = (wbt) obj2;
                ArrayList arrayList9 = new ArrayList(q7h.U(list9, 10));
                for (j0v0 j0v0Var9 : list9) {
                    arrayList9.add((ibt) vu30Var9.invoke(j0v0Var9, new wpu0((Object) j0v0Var9, (Object) wbtVar, (byte) 15)));
                }
                return arrayList9;
            case 9:
                vu30 vu30Var10 = (vu30) obj;
                List<j0v0> list10 = ((qzu0) obj3).Z;
                xbt xbtVar = (xbt) obj2;
                ArrayList arrayList10 = new ArrayList(q7h.U(list10, 10));
                for (j0v0 j0v0Var10 : list10) {
                    arrayList10.add((ibt) vu30Var10.invoke(j0v0Var10, new wpu0((Object) j0v0Var10, (Object) xbtVar, (byte) 16)));
                }
                return arrayList10;
            case 10:
                vu30 vu30Var11 = (vu30) obj;
                List<j0v0> list11 = ((qzu0) obj3).n0;
                ybt ybtVar = (ybt) obj2;
                ArrayList arrayList11 = new ArrayList(q7h.U(list11, 10));
                for (j0v0 j0v0Var11 : list11) {
                    arrayList11.add((ibt) vu30Var11.invoke(j0v0Var11, new wpu0((Object) j0v0Var11, (Object) ybtVar, (byte) 17)));
                }
                return arrayList11;
            case 11:
                qzu0 qzu0Var = (qzu0) obj3;
                return (xi90) ((vu30) obj).invoke(qzu0Var.r0, new wpu0((Object) qzu0Var, obj2, (byte) 18));
            case 12:
                kdy0 kdy0Var = (kdy0) obj3;
                return new soy0(Observable.combineLatest(((uu00) kdy0Var.e).b(new oi("ReleasedStateProvider", false, new ak01(kdy0Var, (byte) 29))).switchMap(new mlw0(kdy0Var, (byte) 19)), ((a1q) obj2).c(), ok10.b1).toFlowable(BackpressureStrategy.d));
            case 13:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                d1z d1zVar = (d1z) obj3;
                if (d1zVar != d1z.c && d1zVar != d1z.a) {
                    z = false;
                }
                j7s j7sVar = (j7s) obj2;
                if (j7sVar.a && zBooleanValue && z) {
                    return ((Context) j7sVar.d).getString(2131959133);
                }
                return null;
            case 14:
                o4o1.o((y2s) obj, (kdn0) obj3, new zsv0((rt01) obj2, (byte) 0));
                return rih1Var;
            case 15:
                kt91 kt91Var = (kt91) ((s880) obj3).h;
                if (kt91Var != null) {
                    kt91Var.i((c78) obj2);
                }
                return rih1Var;
            case 16:
                bim0 bim0Var = (bim0) obj;
                z0w0 z0w0Var = (z0w0) obj3;
                h1w0 h1w0Var = (h1w0) obj2;
                f1w0 f1w0Var = h1w0Var.b;
                d1w0 d1w0Var = h1w0Var.g;
                ArrayList arrayList12 = f1w0Var.b;
                if (!arrayList12.isEmpty()) {
                    bim0Var.a(f1w0Var.a);
                    bim0Var.a.add(arrayList12);
                }
                if (z0w0Var.h && d1w0Var != null) {
                    bim0Var.a(d1w0Var.a);
                    bim0Var.a(d1w0Var.b);
                }
                g1w0 g1w0Var = h1w0Var.c;
                r3w0 r3w0Var = g1w0Var.b;
                if (!r3w0Var.a.isEmpty()) {
                    bim0Var.a(g1w0Var.a);
                    bim0Var.a(r3w0Var);
                }
                e1w0 e1w0Var = h1w0Var.d;
                mui0 mui0Var = e1w0Var.b;
                if (!mui0Var.a.isEmpty()) {
                    bim0Var.a(e1w0Var.a);
                    bim0Var.a(mui0Var);
                }
                b1w0 b1w0Var = h1w0Var.e;
                szu0 szu0Var = b1w0Var.b;
                if (!szu0Var.a.isEmpty()) {
                    bim0Var.a(b1w0Var.a);
                    bim0Var.a(szu0Var);
                }
                bim0Var.a(h1w0Var.f.a);
                return rih1Var;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                oyx oyxVar = (oyx) obj3;
                bpb1 bpb1Var = oyxVar.b;
                k6w0 k6w0Var = (k6w0) obj2;
                do {
                    value = bpb1Var.getValue();
                } while (!bpb1Var.k(value, o7h.O0(k6w0Var, (List) value)));
                return new w9d0(oyxVar, k6w0Var, (byte) 8);
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                ((Boolean) obj).getClass();
                ((iu30) obj3).invoke((m8w0) obj2);
                return rih1Var;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                fn31.T((c9n) obj3, (o8n) null, 0, new f3t0((n7w0) obj2, (tv80) obj, (lnm) null, (byte) 29), 3);
                return rih1Var;
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                ((vu30) obj3).invoke(((e9w0) obj2).a, (tv80) obj);
                return rih1Var;
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                gfw0 gfw0Var = (gfw0) obj3;
                i091 i091Var = (i091) gfw0Var.A.getValue();
                if (i091Var == null) {
                    i091Var = (i091) gfw0Var.r.getValue();
                }
                Long l = (Long) gfw0Var.B.getAndSet(null);
                String str = (String) obj2;
                long jLongValue = 0;
                long j = i091Var != null ? i091Var.e : 0L;
                if (l != null) {
                    jLongValue = l.longValue();
                } else {
                    Long lValueOf = i091Var != null ? Long.valueOf(ebp1.o(i091Var, Long.valueOf(gfw0Var.g.b()))) : null;
                    if (lValueOf != null) {
                        jLongValue = lValueOf.longValue();
                    }
                }
                return new s731(j, jLongValue, str);
            case 22:
                qhw0 qhw0Var = (qhw0) obj3;
                if (qhw0Var.e == ((xab1) obj2)) {
                    qhw0Var.e = null;
                }
                return rih1Var;
            case 23:
                ((okw0) obj3).a.a((String) obj2, (tv80) obj, mno1.h(new mmr0[]{new mmr0("view_as_visitor", Boolean.TRUE)}));
                return rih1Var;
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                FrameLayout frameLayoutA = ((iis) obj3).a();
                op80 jp80Var = new jp80(frameLayoutA);
                j0x0 j0x0Var = (j0x0) obj2;
                op80 eq80Var = new eq80(new e3h1((l6h1) j0x0Var.g.get(), (n7h1) null, (i8h1) j0x0Var.f.get()));
                op80 wchVar = q6x.b;
                if (jp80Var.equals(wchVar) && eq80Var.equals(wchVar)) {
                    jp80Var = wchVar;
                } else if (jp80Var.equals(wchVar)) {
                    jp80Var = eq80Var;
                } else if (!eq80Var.equals(wchVar)) {
                    wchVar = new wch(jp80Var, eq80Var);
                    jp80Var = wchVar;
                }
                xhk1.c(frameLayoutA, jp80Var);
                return frameLayoutA;
            case 25:
                if (((q9x) obj).equals(q9x.a)) {
                    ((iu30) obj3).invoke(new n6x0(((o3x0) obj2).a()));
                    return rih1Var;
                }
                eg.o();
                return null;
            case 26:
                ai4 ai4VarG0 = ((a49) obj2).b.g0();
                wfx wfxVar = ((zfx) obj3).b;
                return new h98(wfxVar.b, wfxVar.a, ai4VarG0, (byte) 14);
            case 27:
                List list12 = (List) obj3;
                v01 v01Var = new v01(list12, (hdn0) obj2, (byte) 1);
                Iterator it = list12.iterator();
                while (it.hasNext()) {
                    ((z511) it.next()).w(v01Var);
                }
                return new w9d0(list12, v01Var, (byte) 11);
            case 28:
                Bitmap bitmap = (Bitmap) obj;
                if (((wfx0) obj3).a()) {
                    ((ven0) obj2).setValue(bitmap);
                }
                return rih1Var;
            default:
                int iOrdinal = ((o6u) obj).ordinal();
                if (iOrdinal == 0) {
                    boolean zD = ((n360) obj3).d();
                    y11 y11Var = ((fvx0) obj2).e;
                    if (zD) {
                        y11Var.accept(asx0.a);
                    } else {
                        y11Var.accept(orx0.a);
                    }
                } else if (iOrdinal != 1) {
                    eg.o();
                    return null;
                }
                return rih1Var;
        }
    }
}
