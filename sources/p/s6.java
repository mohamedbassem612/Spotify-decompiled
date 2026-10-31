package p;

import android.graphics.BlurMaskFilter;
import android.graphics.Color;
import android.graphics.Paint;
import com.spotify.scrollsita.v1.Section;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class s6 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ List b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s6(List list, byte b) {
        super(1);
        this.a = b;
        this.b = list;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        int i = 1;
        int i2 = 0;
        rih1 rih1Var = rih1.a;
        List list = this.b;
        switch (b) {
            case 0:
                int iIntValue = ((Number) obj).intValue();
                return Boolean.valueOf(iIntValue >= 0 && iIntValue < list.size());
            case 1:
                return ((x40) list.get(((Number) obj).intValue())).getId();
            case 2:
                return ((c90) list.get(((Number) obj).intValue())).getKey();
            case 3:
                return new px2(list, Locale.forLanguageTag((String) obj));
            case 4:
                ((qv00) obj).b(a7q0.class, list, false);
                return rih1Var;
            case 5:
                qv00 qv00Var = (qv00) obj;
                List list2 = list;
                qv00Var.b(jo70.class, list2, false);
                qv00Var.b(xkk1.class, list2, false);
                return rih1Var;
            case 6:
                ((qv00) obj).b(jo70.class, list, false);
                return rih1Var;
            case 7:
                ((qv00) obj).b(xkk1.class, list, false);
                return rih1Var;
            case 8:
                ((qv00) obj).b(vy6.class, list, false);
                return rih1Var;
            case 9:
                qv00 qv00Var2 = (qv00) obj;
                List list3 = list;
                qv00Var2.b(jo70.class, list3, false);
                qv00Var2.b(xkk1.class, list3, false);
                return rih1Var;
            case 10:
                return i541.C(nim0.a, new wka(list, ((Number) obj).intValue()));
            case 11:
                eqc eqcVar = (eqc) obj;
                List list4 = this.b;
                List list5 = list4;
                ArrayList arrayList = new ArrayList(q7h.U(list5, 10));
                Iterator it = list5.iterator();
                while (it.hasNext()) {
                    arrayList.add(new u7h(z4p1.e(Color.parseColor((String) it.next()))));
                }
                mic0 mic0VarS = v9c.s(arrayList, 0.0f, 0.0f, 14);
                float fH = eqcVar.h() * 4.0f;
                float fH2 = eqcVar.h() * 8.0f;
                float fH3 = eqcVar.h() * 24.0f;
                tw4 tw4VarA = ww4.a();
                float f = fH / 2.0f;
                tw4VarA.e(ila0.h((((long) Float.floatToRawIntBits(fH3)) << 32) | (((long) Float.floatToRawIntBits(fH3)) & 4294967295L), anm1.g((((long) Float.floatToRawIntBits(f)) & 4294967295L) | (((long) Float.floatToRawIntBits(f)) << 32), (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (eqcVar.a.j() & 4294967295L)) - fH)) & 4294967295L) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (eqcVar.a.j() >> 32)) - fH)) << 32))), 1);
                tw4 tw4VarA2 = ww4.a();
                float f2 = 2.0f * fH;
                float f3 = fH3 - fH;
                tw4VarA2.e(ila0.h((((long) Float.floatToRawIntBits(f3)) << 32) | (((long) Float.floatToRawIntBits(f3)) & 4294967295L), anm1.g((((long) Float.floatToRawIntBits(fH)) << 32) | (((long) Float.floatToRawIntBits(fH)) & 4294967295L), (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (eqcVar.a.j() & 4294967295L)) - f2)) & 4294967295L) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (eqcVar.a.j() >> 32)) - f2)) << 32))), 1);
                Paint paint = fdg1.l().a;
                paint.setStyle(Paint.Style.STROKE);
                paint.setStrokeWidth(fH2);
                paint.setAntiAlias(true);
                paint.setMaskFilter(new BlurMaskFilter(48.0f, BlurMaskFilter.Blur.NORMAL));
                return eqcVar.b(new bza(tw4VarA, mic0VarS, fH, tw4VarA2, paint, list4));
            case 12:
                return rza.Y0.invoke(list.get(((Number) obj).intValue()));
            case 13:
                qv00 qv00Var3 = (qv00) obj;
                List list6 = list;
                ArrayList arrayList2 = new ArrayList(q7h.U(list6, 10));
                Iterator it2 = list6.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((p7b) it2.next()).a);
                }
                qv00Var3.b(jo70.class, arrayList2, false);
                return rih1Var;
            case 14:
                return list.get(((Number) obj).intValue());
            case 15:
                e261 e261Var = (e261) obj;
                b261.F(e261Var, true);
                b261.k(e261Var, new d4h(1, list.size()));
                return rih1Var;
            case 16:
                return jzd.h.invoke(list.get(((Number) obj).intValue()));
            case 17:
                m4f m4fVar = (m4f) list.get(((Number) obj).intValue());
                return rc11.a.b(m4fVar.getClass()).r() + "_" + m4fVar.hashCode();
            case 18:
                return Integer.valueOf(((x2g) list.get(((Number) obj).intValue())).a);
            case 19:
                return ((o2l0) obj).e((String) o7h.q0(list));
            case 20:
                qv00 qv00Var4 = (qv00) obj;
                List list7 = list;
                qv00Var4.b(jo70.class, list7, false);
                qv00Var4.b(xkk1.class, list7, false);
                return rih1Var;
            case 21:
                List list8 = list;
                List list9 = (List) obj;
                ArrayList arrayList3 = new ArrayList(q7h.U(list9, 10));
                for (Object obj2 : list9) {
                    arrayList3.add(obj2 instanceof xkk1 ? (xkk1) obj2 : null);
                }
                return sqg0.T(o7h.v1(list8, arrayList3));
            case 22:
                qv00 qv00Var5 = (qv00) obj;
                Iterator it3 = list.iterator();
                while (it3.hasNext()) {
                    qv00Var5.a((String) it3.next(), xkk1.class, false);
                }
                return rih1Var;
            case 23:
                ((qv00) obj).b(gh3.class, list, false);
                return rih1Var;
            case 24:
                List list10 = list;
                List list11 = (List) obj;
                ArrayList arrayList4 = new ArrayList(q7h.U(list11, 10));
                Iterator it4 = list11.iterator();
                while (it4.hasNext()) {
                    arrayList4.add(((pvc0) it4.next()).c);
                }
                r7h.W(arrayList4, list10);
                return rih1Var;
            case 25:
                return ((pix) list.get(((Number) obj).intValue())).b();
            case 26:
                HashMap map = (HashMap) obj;
                Map mapA = f220.a(list);
                LinkedHashMap linkedHashMap = new LinkedHashMap(zno1.s(mapA.size()));
                for (Map.Entry entry : mapA.entrySet()) {
                    Object key = entry.getKey();
                    String str = (String) entry.getKey();
                    dqy dqyVar = (dqy) entry.getValue();
                    ArrayList arrayList5 = (ArrayList) map.get(str);
                    if (arrayList5 != null) {
                        List list12 = (List) arrayList5.get(i2);
                        List list13 = (List) arrayList5.get(i);
                        List list14 = (List) arrayList5.get(2);
                        List list15 = (List) arrayList5.get(3);
                        bw91 bw91Var = dqyVar.d;
                        bw91 bw91Var2 = dqyVar.e;
                        bw91Var.clear();
                        bw91 bw91Var3 = dqyVar.d;
                        List list16 = list12;
                        List list17 = list13;
                        Iterator it5 = list16.iterator();
                        Iterator it6 = list17.iterator();
                        ArrayList arrayList6 = new ArrayList(Math.min(q7h.U(list16, 10), q7h.U(list17, 10)));
                        while (it5.hasNext() && it6.hasNext()) {
                            arrayList6.add(new ll51((String) it5.next(), (String) it6.next()));
                        }
                        bw91Var3.addAll(arrayList6);
                        bw91Var2.clear();
                        List list18 = list14;
                        List list19 = list15;
                        Iterator it7 = list18.iterator();
                        Iterator it8 = list19.iterator();
                        ArrayList arrayList7 = new ArrayList(Math.min(q7h.U(list18, 10), q7h.U(list19, 10)));
                        while (it7.hasNext() && it8.hasNext()) {
                            arrayList7.add(new fl51((String) it7.next(), (String) it8.next()));
                        }
                        bw91Var2.addAll(arrayList7);
                        dqyVar.f((String) arrayList5.get(4));
                        dqyVar.f.setValue((Boolean) arrayList5.get(5));
                        dqyVar.g.setValue((List) arrayList5.get(6));
                    }
                    linkedHashMap.put(key, dqyVar);
                    i = 1;
                    i2 = 0;
                }
                return linkedHashMap;
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                int iIntValue2 = ((Number) obj).intValue();
                kv70 kv70Var = (ov70) list.get(iIntValue2);
                if (kv70Var instanceof kv70) {
                    kv70 kv70Var2 = kv70Var;
                    return xcg1.i(kv70Var2.b, "-", kv70Var2.a.a);
                }
                return kv70Var.a() + "-" + iIntValue2;
            case 28:
                return Boolean.valueOf(list.get(((Number) obj).intValue()) instanceof kv70);
            default:
                b261.k((e261) obj, new d4h(list.size(), 1));
                return rih1Var;
        }
    }
}
