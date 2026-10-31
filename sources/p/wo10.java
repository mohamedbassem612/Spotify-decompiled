package p;

import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import com.spotify.mobius.First;
import com.spotify.mobius.Next;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class wo10 extends hab0 implements vu30 {
    public static final wo10 N0;
    public static final wo10 O0;
    public static final wo10 P0;
    public static final wo10 Q0;
    public static final wo10 R0;
    public static final wo10 S0;
    public static final wo10 T0;
    public static final wo10 U0;
    public static final wo10 V0;
    public static final wo10 W0;
    public static final wo10 X;
    public static final wo10 X0;
    public static final wo10 Y;
    public static final wo10 Y0;
    public static final wo10 Z;
    public static final wo10 Z0;
    public static final wo10 a1;
    public static final wo10 b;
    public static final wo10 b1;
    public static final wo10 c;
    public static final wo10 c1;
    public static final wo10 d;
    public static final wo10 d1;
    public static final wo10 e;
    public static final wo10 e1;
    public static final wo10 f;
    public static final wo10 g;
    public static final wo10 h;
    public static final wo10 i;
    public static final wo10 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 2;
        b = new wo10(i2, (byte) 0);
        c = new wo10(i2, (byte) 1);
        d = new wo10(i2, (byte) 2);
        e = new wo10(i2, (byte) 3);
        f = new wo10(i2, (byte) 4);
        g = new wo10(i2, (byte) 5);
        h = new wo10(i2, (byte) 6);
        i = new wo10(i2, (byte) 7);
        t = new wo10(i2, (byte) 8);
        X = new wo10(i2, (byte) 9);
        Y = new wo10(i2, (byte) 10);
        Z = new wo10(i2, (byte) 11);
        N0 = new wo10(i2, (byte) 12);
        O0 = new wo10(i2, (byte) 13);
        P0 = new wo10(i2, (byte) 14);
        Q0 = new wo10(i2, (byte) 15);
        R0 = new wo10(i2, (byte) 16);
        S0 = new wo10(i2, (byte) 17);
        T0 = new wo10(i2, (byte) 18);
        U0 = new wo10(i2, (byte) 19);
        V0 = new wo10(i2, (byte) 20);
        W0 = new wo10(i2, (byte) 21);
        X0 = new wo10(i2, (byte) 22);
        Y0 = new wo10(i2, (byte) 23);
        Z0 = new wo10(i2, (byte) 24);
        a1 = new wo10(i2, (byte) 25);
        b1 = new wo10(i2, (byte) 26);
        c1 = new wo10(i2, (byte) 27);
        d1 = new wo10(i2, (byte) 28);
        e1 = new wo10(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wo10(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    /* JADX WARN: Code duplicated, block: B:118:0x0314  */
    /* JADX WARN: Code duplicated, block: B:137:0x03b5  */
    public final Object invoke(Object obj, Object obj2) {
        so10 uo10Var;
        String str;
        goj0 goj0VarA;
        goj0 goj0VarA2;
        goj0 goj0VarA3;
        long jA;
        String str2 = null;
        switch (this.a) {
            case 0:
                ro10 ro10Var = (ro10) obj;
                so10 so10Var = (vo10) obj2;
                fo10 fo10Var = ro10Var.b;
                qo10 qo10Var = fo10Var.c;
                String str3 = fo10Var.a;
                if (so10Var instanceof so10) {
                    so10 so10Var2 = so10Var;
                    if (u890.j(so10Var2.b, str3)) {
                        uo10Var = so10.a(so10Var2, (qo10) null, ro10Var.e, 2047);
                    } else {
                        uo10Var = new uo10(ro10Var.a, fo10Var.a, fo10Var.b, qo10Var, ro10Var.d, ro10Var.e);
                    }
                } else {
                    uo10Var = new uo10(ro10Var.a, fo10Var.a, fo10Var.b, qo10Var, ro10Var.d, ro10Var.e);
                }
                return First.c(uo10Var, Collections.singleton(new qbw(ro10Var.a, str3, fo10Var.b, qo10Var)));
            case 1:
                vv10 vv10Var = (vv10) obj;
                return Next.h(wv10.a((wv10) obj2, vv10Var.a, vv10Var.b, vv10Var.c, vv10Var.d, (nho0) null, false, false, false, (String) null, false, false, vv10Var.e, vv10Var.f, vv10Var.g, false, vv10Var.h, vv10Var.i, vv10Var.j, false, vv10Var.k, 280560));
            case 2:
                return First.c((wv10) obj2, Collections.singleton(gt10.a));
            case 3:
                h3j1 h3j1Var = (h3j1) obj;
                ioj0 ioj0Var = (ioj0) obj2;
                String str4 = h3j1Var.a;
                hoj0 hoj0VarC = ioj0Var.c(uxn.class, str4);
                uxn uxnVar = (hoj0VarC == null || (goj0VarA3 = hoj0VarC.a()) == null) ? null : (uxn) goj0VarA3.a;
                hoj0 hoj0VarC2 = ioj0Var.c(pn30.class, str4);
                pn30 pn30Var = (hoj0VarC2 == null || (goj0VarA2 = hoj0VarC2.a()) == null) ? null : (pn30) goj0VarA2.a;
                if (pn30Var == null) {
                    str = null;
                } else {
                    pn30 pn30Var2 = pn30Var.b ? pn30Var : null;
                    if (pn30Var2 != null) {
                        str = pn30Var2.c;
                    } else {
                        str = null;
                    }
                }
                if (str == null) {
                    str = "";
                }
                hoj0 hoj0VarC3 = ioj0Var.c(a7q0.class, str4);
                if (hoj0VarC3 != null && (goj0VarA = hoj0VarC3.a()) != null) {
                    str2 = (a7q0) goj0VarA.a;
                }
                return new m120(str4, str, h0p1.s(h3j1Var, str2, uxnVar), h0p1.t(pn30Var), h0p1.r(h3j1Var, uxnVar));
            case 4:
                return new u7h(u7h.j);
            case 5:
                Map map = (Map) obj2;
                LinkedHashMap linkedHashMap = new LinkedHashMap(zno1.s(map.size()));
                for (Map.Entry entry : map.entrySet()) {
                    Object key = entry.getKey();
                    dqy dqyVar = (dqy) entry.getValue();
                    bw91 bw91Var = dqyVar.d;
                    bw91 bw91Var2 = dqyVar.e;
                    ArrayList arrayList = new ArrayList(q7h.U(bw91Var, 10));
                    ek60 ek60VarListIterator = bw91Var.listIterator();
                    while (true) {
                        ek60 ek60Var = ek60VarListIterator;
                        if (ek60Var.hasNext()) {
                            arrayList.add(((ll51) ek60Var.next()).a);
                        } else {
                            ArrayList arrayList2 = new ArrayList(arrayList);
                            bw91 bw91Var3 = dqyVar.d;
                            ArrayList arrayList3 = new ArrayList(q7h.U(bw91Var3, 10));
                            ek60 ek60VarListIterator2 = bw91Var3.listIterator();
                            while (true) {
                                ek60 ek60Var2 = ek60VarListIterator2;
                                if (ek60Var2.hasNext()) {
                                    arrayList3.add(((ll51) ek60Var2.next()).b);
                                } else {
                                    ArrayList arrayList4 = new ArrayList(arrayList3);
                                    ArrayList arrayList5 = new ArrayList(q7h.U(bw91Var2, 10));
                                    ek60 ek60VarListIterator3 = bw91Var2.listIterator();
                                    while (true) {
                                        ek60 ek60Var3 = ek60VarListIterator3;
                                        if (ek60Var3.hasNext()) {
                                            arrayList5.add(((fl51) ek60Var3.next()).a);
                                        } else {
                                            ArrayList arrayList6 = new ArrayList(arrayList5);
                                            ArrayList arrayList7 = new ArrayList(q7h.U(bw91Var2, 10));
                                            ek60 ek60VarListIterator4 = bw91Var2.listIterator();
                                            while (true) {
                                                ek60 ek60Var4 = ek60VarListIterator4;
                                                if (ek60Var4.hasNext()) {
                                                    arrayList7.add(((fl51) ek60Var4.next()).b);
                                                }
                                            }
                                            linkedHashMap.put(key, p7h.H(new Object[]{arrayList2, arrayList4, arrayList6, new ArrayList(arrayList7), dqyVar.d(), Boolean.valueOf(dqyVar.e()), new ArrayList((List) dqyVar.g.getValue())}));
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return new HashMap(linkedHashMap);
            case 6:
                return new HashMap((Map) obj2);
            case 7:
                return Boolean.valueOf(((File) obj).renameTo((File) obj2));
            case 8:
                return new ArrayList((Collection) nho1.w((bw91) obj2).c);
            case 9:
                return (uha1) ((ven0) obj2).getValue();
            case 10:
                return new k720((String) obj2);
            case 11:
                ixx ixxVar = ((afx) obj).a.b;
                int iOrdinal = ((vux) obj2).ordinal();
                if (iOrdinal == 0) {
                    jA = ixxVar.a();
                } else if (iOrdinal == 1) {
                    jA = ixxVar.b();
                } else {
                    if (iOrdinal != 2) {
                        eg.o();
                        return null;
                    }
                    jA = ixxVar.c();
                }
                return new u7h(jA);
            case 12:
                ((Number) obj2).intValue();
                x340 x340Var = (b0k) obj;
                x340Var.i0(-2050129787);
                mn20 mn20VarR = poo1.r(0, 14);
                x340Var.r(false);
                return mn20VarR;
            case 13:
                return new u7h(((afx) obj).d.b);
            case 14:
                long j = ((yr80) obj).a;
                long j2 = ((yr80) obj2).a;
                return irn1.o0(500, 0, (dlv) null, 6);
            case 15:
                String str5 = (String) obj2;
                return new ge20((fe20) obj, str5.length() > 0 ? str5 : null);
            case 16:
                return new kg20(((Boolean) obj2).booleanValue());
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                return null;
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                vnb1 vnb1Var = (vnb1) obj2;
                k330 k330Var = ((p330) obj).b;
                if (vnb1Var.b) {
                    return new q330(k330Var.b, null);
                }
                boolean z = vnb1Var.a;
                yf yfVar = k330Var.a;
                return z ? new s330(yfVar) : new t330(yfVar);
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                return ((n330) obj2).a ? r330.a : u330.a;
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                return (w330) obj2;
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                return ((vo11) obj).c;
            case 22:
                return ((se31) obj).c;
            case 23:
                return ((jd5) obj).b;
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                return ((xvu0) obj).c;
            case 25:
                return ((n460) obj).b;
            case 26:
                return ((h720) obj).b;
            case 27:
                d730 d730Var = (d730) obj;
                c730 c730Var = (c730) obj2;
                return new e730(d730Var.a, d730Var.b, c730Var.a, c730Var.b, c730Var.c);
            case 28:
                return new fc30((o231) obj, ((fc30) obj2).b);
            default:
                oc30 oc30Var = (oc30) obj;
                return new pc30(((Boolean) obj2).booleanValue(), oc30Var.a, oc30Var.b);
        }
    }
}
