package p;

import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class dt3 extends hab0 implements iu30 {
    public static final dt3 N0;
    public static final dt3 O0;
    public static final dt3 P0;
    public static final dt3 Q0;
    public static final dt3 R0;
    public static final dt3 S0;
    public static final dt3 T0;
    public static final dt3 U0;
    public static final dt3 V0;
    public static final dt3 W0;
    public static final dt3 X;
    public static final dt3 X0;
    public static final dt3 Y;
    public static final dt3 Y0;
    public static final dt3 Z;
    public static final dt3 Z0;
    public static final dt3 a1;
    public static final dt3 b;
    public static final dt3 b1;
    public static final dt3 c;
    public static final dt3 c1;
    public static final dt3 d;
    public static final dt3 d1;
    public static final dt3 e;
    public static final dt3 e1;
    public static final dt3 f;
    public static final dt3 g;
    public static final dt3 h;
    public static final dt3 i;
    public static final dt3 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new dt3(i2, (byte) 0);
        c = new dt3(i2, (byte) 1);
        d = new dt3(i2, (byte) 2);
        e = new dt3(i2, (byte) 3);
        f = new dt3(i2, (byte) 4);
        g = new dt3(i2, (byte) 5);
        h = new dt3(i2, (byte) 6);
        i = new dt3(i2, (byte) 7);
        t = new dt3(i2, (byte) 8);
        X = new dt3(i2, (byte) 9);
        Y = new dt3(i2, (byte) 10);
        Z = new dt3(i2, (byte) 11);
        N0 = new dt3(i2, (byte) 12);
        O0 = new dt3(i2, (byte) 13);
        P0 = new dt3(i2, (byte) 14);
        Q0 = new dt3(i2, (byte) 15);
        R0 = new dt3(i2, (byte) 16);
        S0 = new dt3(i2, (byte) 17);
        T0 = new dt3(i2, (byte) 18);
        U0 = new dt3(i2, (byte) 19);
        V0 = new dt3(i2, (byte) 20);
        W0 = new dt3(i2, (byte) 21);
        X0 = new dt3(i2, (byte) 22);
        Y0 = new dt3(i2, (byte) 23);
        Z0 = new dt3(i2, (byte) 24);
        a1 = new dt3(i2, (byte) 25);
        b1 = new dt3(i2, (byte) 26);
        c1 = new dt3(i2, (byte) 27);
        d1 = new dt3(i2, (byte) 28);
        e1 = new dt3(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dt3(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        boolean z = false;
        switch (this.a) {
            case 0:
                return rih1.a;
            case 1:
                ct3 ct3Var = (ct3) obj;
                String str = ct3Var.a;
                String str2 = ct3Var.d;
                String str3 = ct3Var.b;
                String str4 = ct3Var.c;
                List list = ct3Var.e;
                mbh0 mbh0VarA = se11.a(gt3.a, str);
                String str5 = mbh0VarA != null ? (String) o7h.s0(mbh0VarA.a()) : null;
                if (str5 == null) {
                    str5 = "";
                }
                return new hb51(str, str2, str4, str3, list, 0, 0, false, false, false, true, str5, 0);
            case 2:
                return Boolean.valueOf(!ihc1.y0((String) obj));
            case 3:
                List listQ0 = ihc1.Q0((String) obj, new String[]{","}, 0, 6);
                return new mmr0(ihc1.e1((String) listQ0.get(0)).toString(), ihc1.e1((String) listQ0.get(1)).toString());
            case 4:
                return ot11.N((f04) obj, (Boolean) null);
            case 5:
                y24 y24Var = (y24) obj;
                return new b34(y24Var.a, y24Var.b);
            case 6:
                return ((v24) obj).a;
            case 7:
                return (e04) obj;
            case 8:
                return ((e04) obj).a;
            case 9:
                return (d04) obj;
            case 10:
                return "spotify:internal:allboarding:origin:home-podcasts";
            case 11:
                ((Number) obj).intValue();
                return null;
            case 12:
                ((Number) obj).intValue();
                return null;
            case 13:
                u310 u310Var = (u310) obj;
                xkg0 xkg0Var = new xkg0();
                xkg0Var.putAll(u310Var.A);
                xkg0Var.put("android.media.browse.CONTENT_STYLE_BROWSABLE_HINT", 2);
                return u310.b(u310Var, null, null, null, 0, null, null, 0, null, null, xkg0Var.b(), null, null, -1073741825, 15);
            case 14:
                List list2 = (List) obj;
                ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add((jo70) it.next());
                }
                return arrayList;
            case 15:
                return Boolean.valueOf(obj instanceof jo70);
            case 16:
                if (obj != null) {
                    return (jo70) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.foundationaltraits.identitytrait.IdentityTrait");
                return null;
            case 17:
                return Boolean.valueOf(obj instanceof List);
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                if (obj != null) {
                    return (List) obj;
                }
                bhn0.i("null cannot be cast to non-null type kotlin.collections.List<com.spotify.listplatform.endpoints.kodiak.ListItemsTable.Item>");
                return null;
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                return new qvc0((String) obj, (c3d0) null, (Set) null, (mqz0) null, 14);
            case 20:
                return (List) obj;
            case 21:
                return Boolean.valueOf(obj instanceof jo70);
            case 22:
                if (obj != null) {
                    return (jo70) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.foundationaltraits.identitytrait.IdentityTrait");
                return null;
            case 23:
                return Boolean.valueOf(obj instanceof xkk1);
            case 24:
                if (obj != null) {
                    return (xkk1) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.foundationaltraits.visualidentitytrait.VisualIdentityTrait");
                return null;
            case 25:
                List list3 = (List) obj;
                return new mmr0((jo70) list3.get(0), (xkk1) list3.get(1));
            case 26:
                return Boolean.valueOf(obj instanceof jo70);
            case 27:
                if (obj != null) {
                    return (jo70) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.foundationaltraits.identitytrait.IdentityTrait");
                return null;
            case 28:
                return (jo70) ((List) obj).get(0);
            default:
                bp90 bp90Var = (bp90) obj;
                if (bp90Var.b && bp90Var.a) {
                    z = true;
                }
                return Boolean.valueOf(z);
        }
    }
}
