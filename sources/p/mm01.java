package p;

import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class mm01 extends hab0 implements iu30 {
    public static final mm01 N0;
    public static final mm01 O0;
    public static final mm01 P0;
    public static final mm01 Q0;
    public static final mm01 R0;
    public static final mm01 S0;
    public static final mm01 T0;
    public static final mm01 U0;
    public static final mm01 V0;
    public static final mm01 W0;
    public static final mm01 X;
    public static final mm01 X0;
    public static final mm01 Y;
    public static final mm01 Y0;
    public static final mm01 Z;
    public static final mm01 Z0;
    public static final mm01 a1;
    public static final mm01 b;
    public static final mm01 b1;
    public static final mm01 c;
    public static final mm01 c1;
    public static final mm01 d;
    public static final mm01 d1;
    public static final mm01 e;
    public static final mm01 e1;
    public static final mm01 f;
    public static final mm01 g;
    public static final mm01 h;
    public static final mm01 i;
    public static final mm01 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new mm01(i2, (byte) 0);
        c = new mm01(i2, (byte) 1);
        d = new mm01(i2, (byte) 2);
        e = new mm01(i2, (byte) 3);
        f = new mm01(i2, (byte) 4);
        g = new mm01(i2, (byte) 5);
        h = new mm01(i2, (byte) 6);
        i = new mm01(i2, (byte) 7);
        t = new mm01(i2, (byte) 8);
        X = new mm01(i2, (byte) 9);
        Y = new mm01(i2, (byte) 10);
        Z = new mm01(i2, (byte) 11);
        N0 = new mm01(i2, (byte) 12);
        O0 = new mm01(i2, (byte) 13);
        P0 = new mm01(i2, (byte) 14);
        Q0 = new mm01(i2, (byte) 15);
        R0 = new mm01(i2, (byte) 16);
        S0 = new mm01(i2, (byte) 17);
        T0 = new mm01(i2, (byte) 18);
        U0 = new mm01(i2, (byte) 19);
        V0 = new mm01(i2, (byte) 20);
        W0 = new mm01(i2, (byte) 21);
        X0 = new mm01(i2, (byte) 22);
        Y0 = new mm01(i2, (byte) 23);
        Z0 = new mm01(i2, (byte) 24);
        a1 = new mm01(i2, (byte) 25);
        b1 = new mm01(i2, (byte) 26);
        c1 = new mm01(i2, (byte) 27);
        d1 = new mm01(i2, (byte) 28);
        e1 = new mm01(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mm01(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    /* JADX WARN: Code duplicated, block: B:174:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:29:0x0047  */
    public final Object invoke(Object obj) {
        byte b2 = this.a;
        rih1 rih1Var = rih1.a;
        boolean z = true;
        switch (b2) {
            case 0:
                if (!(obj instanceof hll) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 1:
                if (obj instanceof rih1) {
                    return null;
                }
                return (hll) obj;
            case 2:
                if (!(obj instanceof a7q0) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 3:
                if (obj instanceof rih1) {
                    return null;
                }
                return (a7q0) obj;
            case 4:
                if (!(obj instanceof zoy0) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 5:
                if (obj instanceof rih1) {
                    return null;
                }
                return (zoy0) obj;
            case 6:
                if (!(obj instanceof hzy) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 7:
                return Boolean.valueOf(obj instanceof jo70);
            case 8:
                if (obj != null) {
                    return (jo70) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.foundationaltraits.identitytrait.IdentityTrait");
                return null;
            case 9:
                return ((um01) obj).b;
            case 10:
                return ((um01) obj).b;
            case 11:
                return ((um01) obj).b;
            case 12:
                return ((um01) obj).b;
            case 13:
                String str = ((um01) obj).b;
                if (sgy.b(str) || sgy.f(str) || sgy.d(str) || sgy.c(str)) {
                    return str;
                }
                return null;
            case 14:
                String str2 = ((um01) obj).b;
                if (sgy.b(str2)) {
                    return str2;
                }
                return null;
            case 15:
                String str3 = ((um01) obj).b;
                if (sgy.b(str3)) {
                    return str3;
                }
                return null;
            case 16:
                String str4 = ((um01) obj).b;
                if (sgy.i(str4)) {
                    return str4;
                }
                return null;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                if (!(obj instanceof qfd) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                if (obj instanceof rih1) {
                    return null;
                }
                return (qfd) obj;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                return ((um01) obj).a;
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                qfd qfdVar = (qfd) obj;
                return Boolean.valueOf(qfdVar != null ? qfdVar.e.contains(l131.b) : false);
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                return rih1Var;
            case 22:
                oq01 oq01Var = ((mq01) obj).a;
                return new cu01(oq01Var.a, oq01Var.b, oq01Var.c, oq01Var.d, oq01Var.e);
            case 23:
                return ((mq01) obj).a;
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                b261.d((e261) obj);
                return rih1Var;
            case 25:
                String strS = zxo1.s(((aw01) obj).b);
                if (eyo1.q(strS) || eyo1.u(strS)) {
                    return strS;
                }
                return null;
            case 26:
                cr01 cr01Var = ((aw01) obj).b;
                if (cr01Var.e == br01.c) {
                    return cr01Var.b;
                }
                return null;
            case 27:
                cr01 cr01Var2 = ((aw01) obj).b;
                if (cr01Var2.m == null) {
                    return null;
                }
                String strS2 = zxo1.s(cr01Var2);
                if (cr01Var2.e == br01.b && eyo1.t(cr01Var2.b)) {
                    yq01 yq01Var = cr01Var2.m;
                    if ((yq01Var != null ? yq01Var.b : 0) <= 0) {
                        if (zxo1.w(strS2)) {
                            return null;
                        }
                    }
                } else if (zxo1.w(strS2)) {
                    return null;
                }
                List list = cr01Var2.f;
                ArrayList arrayList = new ArrayList();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    String str5 = ((ft01) it.next()).b;
                    if (str5.length() <= 0) {
                        str5 = null;
                    }
                    if (str5 != null) {
                        arrayList.add(str5);
                    }
                }
                List listD1 = o7h.d1(arrayList, 3);
                if (listD1.isEmpty()) {
                    listD1 = null;
                }
                if (listD1 != null) {
                    return o7h.y0(listD1, ",", (String) null, (String) null, (iu30) null, 62);
                }
                return null;
            case 28:
                if (obj instanceof rih1) {
                    return null;
                }
                return (gv01) obj;
            default:
                if (!(obj instanceof Boolean) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
        }
    }
}
