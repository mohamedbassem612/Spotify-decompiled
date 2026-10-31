package p;

import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class b03 extends hab0 implements iu30 {
    public static final b03 N0;
    public static final b03 O0;
    public static final b03 P0;
    public static final b03 Q0;
    public static final b03 R0;
    public static final b03 S0;
    public static final b03 T0;
    public static final b03 U0;
    public static final b03 V0;
    public static final b03 W0;
    public static final b03 X;
    public static final b03 X0;
    public static final b03 Y;
    public static final b03 Y0;
    public static final b03 Z;
    public static final b03 Z0;
    public static final b03 a1;
    public static final b03 b;
    public static final b03 b1;
    public static final b03 c;
    public static final b03 c1;
    public static final b03 d;
    public static final b03 d1;
    public static final b03 e;
    public static final b03 e1;
    public static final b03 f;
    public static final b03 g;
    public static final b03 h;
    public static final b03 i;
    public static final b03 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new b03(i2, (byte) 0);
        c = new b03(i2, (byte) 1);
        d = new b03(i2, (byte) 2);
        e = new b03(i2, (byte) 3);
        f = new b03(i2, (byte) 4);
        g = new b03(i2, (byte) 5);
        h = new b03(i2, (byte) 6);
        i = new b03(i2, (byte) 7);
        t = new b03(i2, (byte) 8);
        X = new b03(i2, (byte) 9);
        Y = new b03(i2, (byte) 10);
        Z = new b03(i2, (byte) 11);
        N0 = new b03(i2, (byte) 12);
        O0 = new b03(i2, (byte) 13);
        P0 = new b03(i2, (byte) 14);
        Q0 = new b03(i2, (byte) 15);
        R0 = new b03(i2, (byte) 16);
        S0 = new b03(i2, (byte) 17);
        T0 = new b03(i2, (byte) 18);
        U0 = new b03(i2, (byte) 19);
        V0 = new b03(i2, (byte) 20);
        W0 = new b03(i2, (byte) 21);
        X0 = new b03(i2, (byte) 22);
        Y0 = new b03(i2, (byte) 23);
        Z0 = new b03(i2, (byte) 24);
        a1 = new b03(i2, (byte) 25);
        b1 = new b03(i2, (byte) 26);
        c1 = new b03(i2, (byte) 27);
        d1 = new b03(i2, (byte) 28);
        e1 = new b03(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b03(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        byte b2 = this.a;
        rih1 rih1Var = rih1.a;
        switch (b2) {
            case 0:
                return new sl1(true);
            case 1:
                return rih1Var;
            case 2:
                return String.format("%02x", Arrays.copyOf(new Object[]{(Byte) obj}, 1));
            case 3:
                return (byte[]) o7h.s0(((c8r) obj).c);
            case 4:
                return ((h63) obj).a;
            case 5:
                return ((h63) obj).a;
            case 6:
                return new i63(1, "", (String) null, "", "", false, false);
            case 7:
                return Boolean.valueOf(obj instanceof jo70);
            case 8:
                if (obj != null) {
                    return (jo70) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.foundationaltraits.identitytrait.IdentityTrait");
                return null;
            case 9:
                return Boolean.valueOf(obj instanceof xkk1);
            case 10:
                if (obj != null) {
                    return (xkk1) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.foundationaltraits.visualidentitytrait.VisualIdentityTrait");
                return null;
            case 11:
                s63 s63Var = (s63) obj;
                return new t63(s63Var.a, s63Var.b, s63Var.c, s63Var.d, s63Var.e, s63Var.f, s63Var.g, s63Var.h, s63Var.i, false, 3, false, s63Var.k, s63Var.l, s63Var.m);
            case 12:
                t63 t63Var = (t63) obj;
                return new c73(t63Var.b, t63Var.c, t63Var.d, t63Var.l, t63Var.e, t63Var.j, t63Var.k, t63Var.m, oqn1.p(t63Var.n), t63Var.o);
            case 13:
                return rih1Var;
            case 14:
                if (l73.a[((h73) obj).ordinal()] == 1) {
                    return j73.a;
                }
                eg.o();
                return null;
            case 15:
                kby kbyVar = ((cxc0) obj).f;
                String str = (String) kbyVar.q.get("copyrights");
                if (str == null) {
                    str = "";
                }
                String str2 = (String) kbyVar.q.get("courtesyLine");
                return new c83(str, str2 != null ? str2 : "");
            case 16:
                return Boolean.valueOf((obj instanceof String) || (obj instanceof rih1));
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                if (obj instanceof rih1) {
                    return null;
                }
                return (String) obj;
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                return Boolean.valueOf((obj instanceof z1g1) || (obj instanceof rih1));
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                if (obj instanceof rih1) {
                    return null;
                }
                return (z1g1) obj;
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                uv11 uv11Var = (uv11) obj;
                return new rjo(uv11Var.a, uv11Var.b);
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                return new xzq(new ujo((d0r) obj, (byte) 0), V0);
            case 22:
                return "catalogue";
            case 23:
                return ((uv11) obj).a;
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                uv11 uv11Var2 = (uv11) obj;
                return new wcm(uv11Var2.a, uv11Var2.b, (String) null, (ucm) null, (Function0) null, (Function0) null, false, (String) null, (String) null, 1020);
            case 25:
                return new k73((String) obj);
            case 26:
                return new og3((String) obj);
            case 27:
                List list = ((w53) obj).a;
                ArrayList arrayList = new ArrayList(q7h.U(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((mo11) it.next()).a);
                }
                return o7h.p1(arrayList);
            case 28:
                return alk1.c(((v53) obj).a);
            default:
                return 2131952191;
        }
    }
}
