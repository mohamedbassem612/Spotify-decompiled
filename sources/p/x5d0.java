package p;

import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import com.spotify.mobius.First;
import com.spotify.mobius.Next;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class x5d0 extends hab0 implements vu30 {
    public static final x5d0 N0;
    public static final x5d0 O0;
    public static final x5d0 P0;
    public static final x5d0 Q0;
    public static final x5d0 R0;
    public static final x5d0 S0;
    public static final x5d0 T0;
    public static final x5d0 U0;
    public static final x5d0 V0;
    public static final x5d0 W0;
    public static final x5d0 X;
    public static final x5d0 X0;
    public static final x5d0 Y;
    public static final x5d0 Y0;
    public static final x5d0 Z;
    public static final x5d0 Z0;
    public static final x5d0 a1;
    public static final x5d0 b;
    public static final x5d0 b1;
    public static final x5d0 c;
    public static final x5d0 c1;
    public static final x5d0 d;
    public static final x5d0 d1;
    public static final x5d0 e;
    public static final x5d0 e1;
    public static final x5d0 f;
    public static final x5d0 g;
    public static final x5d0 h;
    public static final x5d0 i;
    public static final x5d0 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 2;
        b = new x5d0(i2, (byte) 0);
        c = new x5d0(i2, (byte) 1);
        d = new x5d0(i2, (byte) 2);
        e = new x5d0(i2, (byte) 3);
        f = new x5d0(i2, (byte) 4);
        g = new x5d0(i2, (byte) 5);
        h = new x5d0(i2, (byte) 6);
        i = new x5d0(i2, (byte) 7);
        t = new x5d0(i2, (byte) 8);
        X = new x5d0(i2, (byte) 9);
        Y = new x5d0(i2, (byte) 10);
        Z = new x5d0(i2, (byte) 11);
        N0 = new x5d0(i2, (byte) 12);
        O0 = new x5d0(i2, (byte) 13);
        P0 = new x5d0(i2, (byte) 14);
        Q0 = new x5d0(i2, (byte) 15);
        R0 = new x5d0(i2, (byte) 16);
        S0 = new x5d0(i2, (byte) 17);
        T0 = new x5d0(i2, (byte) 18);
        U0 = new x5d0(i2, (byte) 19);
        V0 = new x5d0(i2, (byte) 20);
        W0 = new x5d0(i2, (byte) 21);
        X0 = new x5d0(i2, (byte) 22);
        Y0 = new x5d0(i2, (byte) 23);
        Z0 = new x5d0(i2, (byte) 24);
        a1 = new x5d0(i2, (byte) 25);
        b1 = new x5d0(i2, (byte) 26);
        c1 = new x5d0(i2, (byte) 27);
        d1 = new x5d0(i2, (byte) 28);
        e1 = new x5d0(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x5d0(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    /* JADX WARN: Code duplicated, block: B:80:0x0150  */
    /* JADX WARN: Code duplicated, block: B:82:0x0160  */
    public final Object invoke(Object obj, Object obj2) {
        String strS;
        String str;
        String str2;
        sqe0 sqe0Var;
        switch (this.a) {
            case 0:
                return (z5d0) obj2;
            case 1:
                Boolean bool = (Boolean) obj2;
                bool.booleanValue();
                return bool;
            case 2:
                return new f8d0((g3d0) obj2);
            case 3:
                return (gm61) obj2;
            case 4:
                ((Number) obj).intValue();
                return ((sn7) obj2).a;
            case 5:
                ccd0 ccd0Var = (ccd0) obj2;
                Set set = ((bcd0) obj).b;
                return !set.equals(ccd0Var.e) ? Next.i(ccd0.a(ccd0Var, null, null, 0L, false, set, 111), Collections.singleton(new fbw(set))) : Next.h(ccd0Var);
            case 6:
                return new ocd0(((Boolean) obj2).booleanValue());
            case 7:
                return (ted0) obj2;
            case 8:
                ufd0 ufd0Var = (ufd0) obj;
                wfd0 wfd0Var = (wfd0) obj2;
                xfd0 xfd0Var = wfd0Var.a;
                xkk1 xkk1Var = wfd0Var.b;
                String strA = xkk1Var != null ? cgd0.a(xkk1Var) : null;
                xkk1 xkk1Var2 = xfd0Var.a;
                String strA2 = xkk1Var2 != null ? cgd0.a(xkk1Var2) : null;
                jo70 jo70Var = xfd0Var.b;
                if (jo70Var == null || (str2 = jo70Var.a) == null) {
                    String str3 = ufd0Var.a;
                    List list = cgd0.a;
                    Set set2 = s4b1.f;
                    strS = uic.x(str3).s();
                    if (strS == null) {
                        strS = "";
                    }
                    str = strS;
                } else {
                    str = ihc1.y0(str2) ? null : str2;
                    if (str == null) {
                        String str4 = ufd0Var.a;
                        List list2 = cgd0.a;
                        Set set3 = s4b1.f;
                        strS = uic.x(str4).s();
                        if (strS == null) {
                            strS = "";
                        }
                        str = strS;
                    }
                }
                return new vfd0(strA, strA2, str);
            case 9:
                return ((Boolean) obj2).booleanValue() ? "1" : "0";
            case 10:
                return new gmd0(((fmd0) obj).a, (Map) obj2);
            case 11:
                return (npd0) obj2;
            case 12:
                return new rpd0((long) ((((Boolean) obj2).booleanValue() ? 1.0f : 0.0f) * 10.0f), 10L);
            case 13:
                return new spd0(((Boolean) obj2).booleanValue() ? 10L : 0L, 10L);
            case 14:
                return null;
            case 15:
                return Next.h(nee0.a((nee0) obj2, false, 0, 6));
            case 16:
                return First.b(nee0.a((nee0) obj2, false, 0, 6));
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                return new the0(((she0) obj).a);
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                xoe0 xoe0Var = (xoe0) obj;
                return Next.h(new are0(xoe0Var, jwq0.b, fap1.e(xoe0Var)));
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                xoe0 xoe0Var2 = (xoe0) obj;
                String str5 = xoe0Var2.a;
                kbh kbhVar = xoe0Var2.b;
                bqk0 bqk0Var = new bqk0(str5, (byte) 25);
                if (kbhVar instanceof kbh) {
                    sqe0Var = new sqe0(bqk0Var, kbhVar);
                } else {
                    if (!(kbhVar instanceof tj51)) {
                        eg.o();
                        return null;
                    }
                    sqe0Var = new sqe0(bqk0Var, (tj51) kbhVar);
                }
                return sqe0Var.m();
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                tte0 tte0Var = (tte0) obj2;
                return p7h.M(new Boolean[]{Boolean.valueOf(tte0Var.c), Boolean.valueOf(tte0Var.d)});
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                return Next.j();
            case 22:
                return First.b((xnb1) obj2);
            case 23:
                return Next.j();
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                return First.b((xnb1) obj2);
            case 25:
                return (z3f0) obj;
            case 26:
                return Next.j();
            case 27:
                return null;
            case 28:
                return Next.j();
            default:
                return Next.h(jgf0.a((jgf0) obj, ((jgf0) obj2).g));
        }
    }
}
