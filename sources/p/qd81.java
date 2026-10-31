package p;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import com.spotify.scrollsita.v1.Section;
import j$.time.Instant;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class qd81 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qd81(Object obj, byte b) {
        super(1);
        this.a = b;
    }

    public final Object invoke(Object obj) {
        int i;
        Integer numC0;
        Instant m231Var;
        k1p1 ovd1Var;
        k1p1 k1p1Var;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        byte b2 = 10;
        int iIntValue = 0;
        switch (b) {
            case 0:
                return Collections.singletonMap(1, Collections.singleton(((hc81) obj).c.d));
            case 1:
                vd81 vd81Var = (vd81) obj;
                return new xya1(wd81.a[l1d.C(vd81Var.d)] != 1 ? 1 : 2, vd81Var.a, vd81Var.b, vd81Var.c);
            case 2:
                ((View) obj).setTag(2131427776, Boolean.TRUE);
                return rih1Var;
            case 3:
                return Collections.singletonMap(1, Collections.singleton(((ic81) obj).c.d));
            case 4:
                q491 q491Var = (q491) obj;
                int iC = l1d.C(q491Var.b);
                if (iC == 0 || iC == 1) {
                    i = 1;
                } else {
                    if (iC != 2) {
                        eg.o();
                        return null;
                    }
                    i = 2;
                }
                return new p491(i, 0L, false, q491Var.c);
            case 5:
                ayo0 ayo0Var = (ayo0) obj;
                String str = ayo0Var.a;
                ArrayList arrayList = ayo0Var.b;
                Map map = v7a1.g;
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : arrayList) {
                    Set set = s4b1.f;
                    if (uic.x((String) obj2).c == blc0.u1) {
                        arrayList2.add(obj2);
                    }
                }
                Set setP1 = o7h.p1(arrayList2);
                ArrayList arrayList3 = new ArrayList();
                for (Object obj3 : arrayList) {
                    Set set2 = s4b1.f;
                    if (uic.x((String) obj3).c == blc0.Ef) {
                        arrayList3.add(obj3);
                    }
                }
                Map mapJ = sqg0.J(new mmr0[]{new mmr0(t7a1.a, Collections.singleton(str)), new mmr0(t7a1.b, o7h.p1(setP1)), new mmr0(t7a1.c, o7h.p1(arrayList3))});
                LinkedHashMap linkedHashMap = new LinkedHashMap(zno1.s(mapJ.size()));
                for (Map.Entry entry : mapJ.entrySet()) {
                    linkedHashMap.put(Integer.valueOf(((t7a1) entry.getKey()).ordinal()), entry.getValue());
                }
                return linkedHashMap;
            case 6:
                kby kbyVar = ((cxc0) obj).f;
                String str2 = (String) kbyVar.q.get("last_updated");
                String str3 = (String) kbyVar.q.get("new_entries_count");
                if (str3 != null && (numC0 = nhc1.c0(str3)) != null) {
                    iIntValue = numC0.intValue();
                }
                return new haa1(str2, iIntValue);
            case 7:
                j7e0 j7e0Var = ((hwq) obj).g;
                if (!(j7e0Var instanceof j7e0)) {
                    return new uwa1((String) null, (Float) null);
                }
                zuc0 zuc0Var = j7e0Var.a;
                String str4 = zuc0Var.c;
                String str5 = (String) zuc0Var.g.get("item.speed");
                return new uwa1(str4, str5 != null ? nhc1.b0(str5) : null);
            case 8:
                return (zyp0) obj;
            case 9:
                return new df41(new qd81((xnn0) obj, b2), new t491((byte) 13, 2, false));
            case 10:
                Map map2 = (Map) obj;
                Object obj4 = map2.get("ids");
                List list = obj4 instanceof List ? (List) obj4 : null;
                if (list == null) {
                    return null;
                }
                Object obj5 = map2.get("targets");
                List list2 = obj5 instanceof List ? (List) obj5 : null;
                if (list2 == null) {
                    return null;
                }
                List list3 = list2;
                df41 df41Var = j2h1.b;
                ArrayList arrayList4 = new ArrayList(q7h.U(list3, 10));
                Iterator it = list3.iterator();
                while (it.hasNext()) {
                    Object objInvoke = df41Var.b.invoke(it.next());
                    if (objInvoke == null) {
                        return null;
                    }
                    arrayList4.add(objInvoke);
                }
                List list4 = list;
                Iterator it2 = list4.iterator();
                Iterator it3 = arrayList4.iterator();
                ArrayList arrayList5 = new ArrayList(Math.min(q7h.U(list4, 10), q7h.U(arrayList4, 10)));
                while (it2.hasNext() && it3.hasNext()) {
                    arrayList5.add(new z9b1((UUID) it2.next(), it3.next()));
                }
                return new bab1(arrayList5);
            case 11:
                sbb1 sbb1Var = (sbb1) obj;
                boolean z = sbb1Var.b;
                Uri uri = (Uri) sbb1Var.e.get(fbb1.a);
                if (uri == null) {
                    uri = Uri.EMPTY;
                }
                uri.getClass();
                return new ubb1((Boolean) null, z, false, new kbb1(new hbb1(uri), (!z || sbb1Var.d) ? new obb1(grx.c) : new obb1(xmx.c)));
            case 12:
                String str6 = (String) obj;
                try {
                    m231Var = Instant.parse(str6);
                    break;
                } catch (Throwable th) {
                    m231Var = new m231(th);
                }
                if (m231Var instanceof m231) {
                    m231Var = null;
                }
                Instant instant = m231Var;
                if (instant != null) {
                    return new mmr0(str6, instant);
                }
                return null;
            case 13:
                kby kbyVar2 = ((cxc0) obj).f;
                return new nbk0(kbyVar2.a, 12, z6k0.a(kbyVar2.q));
            case 14:
                j7e0 j7e0Var2 = ((hwq) obj).g;
                if (!(j7e0Var2 instanceof j7e0)) {
                    return new xdb1(j7e0Var2.getUri(), false);
                }
                zuc0 zuc0Var2 = j7e0Var2.a;
                return new xdb1(zuc0Var2.c, zuc0Var2.m);
            case 15:
                return mno1.h(new mmr0[]{new mmr0("share.standard.card.bundle.key", (Parcelable) obj)});
            case 16:
                return (Parcelable) jhc1.t((Bundle) obj, "share.standard.card.bundle.key", bhb1.class);
            case 17:
                return mno1.h(new mmr0[]{new mmr0("externalState", ((n0c1) obj).b)});
            case 18:
                j1c1 j1c1Var = (j1c1) obj;
                return mno1.h(new mmr0[]{new mmr0("externalState", new i1c1(j1c1Var.b, j1c1Var.c, j1c1Var.d, j1c1Var.e))});
            case 19:
                return new hjc1(((hwq) obj).g.getUri());
            case 20:
                return new df41(new qd81(obj, (byte) 21), new t491((byte) 21, 2, false));
            case 21:
                Object objInvoke2 = j2h1.b.b.invoke(obj);
                if (objInvoke2 == null) {
                    return null;
                }
                return new n8d1(objInvoke2);
            case 22:
                return new df41(new qd81(obj, (byte) 23), new t491((byte) 23, 2, false));
            case 23:
                Map map3 = (Map) obj;
                Object obj6 = map3.get("currentTabIndex");
                Integer num = obj6 instanceof Integer ? (Integer) obj6 : null;
                if (num == null) {
                    return null;
                }
                int iIntValue2 = num.intValue();
                Object obj7 = map3.get("tabs");
                List list5 = obj7 instanceof List ? (List) obj7 : null;
                if (list5 == null) {
                    return null;
                }
                List list6 = list5;
                df41 df41Var2 = j2h1.b;
                ArrayList arrayList6 = new ArrayList(q7h.U(list6, 10));
                Iterator it4 = list6.iterator();
                while (it4.hasNext()) {
                    Object objInvoke3 = df41Var2.b.invoke(it4.next());
                    if (objInvoke3 == null) {
                        return null;
                    }
                    arrayList6.add(objInvoke3);
                }
                c380 c380VarA = mqo1.A(arrayList6);
                if (c380VarA != null) {
                    return new uhd1(c380VarA.get(iIntValue2), c380VarA);
                }
                return null;
            case 24:
                ((View) obj).setTag(2131427536, Boolean.TRUE);
                return rih1Var;
            case 25:
                lvd1 lvd1Var = (lvd1) obj;
                int i2 = lvd1Var.e;
                String str7 = lvd1Var.b;
                String str8 = lvd1Var.d;
                h290 h290Var = lvd1Var.c;
                if (h290Var.isEmpty()) {
                    k1p1Var = nvd1.c;
                } else {
                    if (i2 != 1) {
                        ArrayList arrayList7 = new ArrayList(q7h.U(h290Var, 10));
                        Iterator it5 = h290Var.iterator();
                        while (it5.hasNext()) {
                            arrayList7.add(svd1.f((String) it5.next()));
                        }
                        ovd1Var = new pvd1(fg91.b, mqo1.A(arrayList7));
                    } else {
                        ovd1Var = new ovd1(z6x.a, svd1.f((String) o7h.q0(h290Var)));
                    }
                    k1p1Var = ovd1Var;
                }
                return new mvd1(str7, str8, k1p1Var, i2);
            case 26:
                return mno1.h(new mmr0[]{new mmr0("text.content.format.share.card.key", (Parcelable) obj)});
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                return (Parcelable) jhc1.t((Bundle) obj, "text.content.format.share.card.key", a3e1.class);
            case 28:
                return Double.valueOf(c9c.m((mf30) obj, uxe1.f));
            default:
                cob1 cob1Var = (cob1) obj;
                if (cob1Var == null) {
                    return null;
                }
                int iOrdinal = cob1Var.ordinal();
                if (iOrdinal == 0) {
                    return rrt0.b;
                }
                if (iOrdinal == 1) {
                    return rrt0.c;
                }
                if (iOrdinal == 2) {
                    return rrt0.a;
                }
                eg.o();
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qd81(int i, byte b) {
        super(i);
        this.a = b;
    }
}
