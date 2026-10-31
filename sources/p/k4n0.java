package p;

import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class k4n0 extends hab0 implements iu30 {
    public static final k4n0 N0;
    public static final k4n0 O0;
    public static final k4n0 P0;
    public static final k4n0 Q0;
    public static final k4n0 R0;
    public static final k4n0 S0;
    public static final k4n0 T0;
    public static final k4n0 U0;
    public static final k4n0 V0;
    public static final k4n0 W0;
    public static final k4n0 X;
    public static final k4n0 X0;
    public static final k4n0 Y;
    public static final k4n0 Y0;
    public static final k4n0 Z;
    public static final k4n0 Z0;
    public static final k4n0 a1;
    public static final k4n0 b;
    public static final k4n0 b1;
    public static final k4n0 c;
    public static final k4n0 c1;
    public static final k4n0 d;
    public static final k4n0 d1;
    public static final k4n0 e;
    public static final k4n0 e1;
    public static final k4n0 f;
    public static final k4n0 g;
    public static final k4n0 h;
    public static final k4n0 i;
    public static final k4n0 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new k4n0(i2, (byte) 0);
        c = new k4n0(i2, (byte) 1);
        d = new k4n0(i2, (byte) 2);
        e = new k4n0(i2, (byte) 3);
        f = new k4n0(i2, (byte) 4);
        g = new k4n0(i2, (byte) 5);
        h = new k4n0(i2, (byte) 6);
        i = new k4n0(i2, (byte) 7);
        t = new k4n0(i2, (byte) 8);
        X = new k4n0(i2, (byte) 9);
        Y = new k4n0(i2, (byte) 10);
        Z = new k4n0(i2, (byte) 11);
        N0 = new k4n0(i2, (byte) 12);
        O0 = new k4n0(i2, (byte) 13);
        P0 = new k4n0(i2, (byte) 14);
        Q0 = new k4n0(i2, (byte) 15);
        R0 = new k4n0(i2, (byte) 16);
        S0 = new k4n0(i2, (byte) 17);
        T0 = new k4n0(i2, (byte) 18);
        U0 = new k4n0(i2, (byte) 19);
        V0 = new k4n0(i2, (byte) 20);
        W0 = new k4n0(i2, (byte) 21);
        X0 = new k4n0(i2, (byte) 22);
        Y0 = new k4n0(i2, (byte) 23);
        Z0 = new k4n0(i2, (byte) 24);
        a1 = new k4n0(i2, (byte) 25);
        b1 = new k4n0(i2, (byte) 26);
        c1 = new k4n0(i2, (byte) 27);
        d1 = new k4n0(i2, (byte) 28);
        e1 = new k4n0(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k4n0(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        boolean z = true;
        switch (this.a) {
            case 0:
                if (obj instanceof rih1) {
                    return null;
                }
                return (jo70) obj;
            case 1:
                return Boolean.valueOf(obj instanceof jo70);
            case 2:
                if (obj != null) {
                    return (jo70) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.foundationaltraits.identitytrait.IdentityTrait");
                return null;
            case 3:
                String uri = ((vhc1) obj).getUri();
                Set set = s4b1.f;
                if (uic.g(uri, blc0.ed)) {
                    return uri;
                }
                return null;
            case 4:
                if (!(obj instanceof mtl) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 5:
                if (obj instanceof rih1) {
                    return null;
                }
                return (mtl) obj;
            case 6:
                af afVar = (af) obj;
                return Integer.valueOf(((afVar.compareTo(af.d) <= 0 && afVar.compareTo(af.a) >= 0) || afVar.compareTo(af.i) > 0 || afVar.compareTo(af.e) < 0) ? 1 : 2);
            case 7:
                return ((o4n0) obj).b;
            case 8:
                if (!(obj instanceof cob1) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 9:
                if (obj instanceof rih1) {
                    return null;
                }
                return (cob1) obj;
            case 10:
                return Boolean.valueOf(obj instanceof jo70);
            case 11:
                if (obj != null) {
                    return (jo70) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.foundationaltraits.identitytrait.IdentityTrait");
                return null;
            case 12:
                String uri2 = ((vhc1) obj).getUri();
                Set set2 = s4b1.f;
                if (uic.g(uri2, blc0.ed)) {
                    return uri2;
                }
                return null;
            case 13:
                if (!(obj instanceof mtl) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 14:
                if (obj instanceof rih1) {
                    return null;
                }
                return (mtl) obj;
            case 15:
                return ((dei0) obj).b();
            case 16:
                return ((dei0) obj).b();
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                dei0 dei0Var = (dei0) obj;
                return sqg0.J(new mmr0[]{new mmr0(1, Collections.singleton(dei0Var.b().d)), new mmr0(2, Collections.singleton(dei0Var.b().c))});
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                pxo0 pxo0Var = (pxo0) obj;
                return new t5n0(pxo0Var.a, pxo0Var.b, pxo0Var.c, pxo0Var.d, pxo0Var.e, pxo0Var.f, pxo0Var.g, pxo0Var.h, pxo0Var.i);
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                d7n0 d7n0Var = (d7n0) obj;
                return new g7n0(d7n0Var.a, d7n0Var.b, d7n0Var.c, (wkt) null);
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                g271 g271Var = (g271) obj;
                return new d7n0(g271Var.d, g271Var.a, g271Var.c);
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                return new q2l0((i3l0) obj);
            case 22:
                return new c9n0((qxc0) obj);
            case 23:
                return Boolean.valueOf(obj instanceof qxc0);
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                if (obj != null) {
                    return (qxc0) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.listplatform.endpoints.kodiak.ListMetadataTable.Entity");
                return null;
            case 25:
                return new b9n0(((a9n0) obj).a, new y2u0(0, false, false, false));
            case 26:
                return rih1.a;
            case 27:
                return new qet0(((cxc0) obj).f.a, false, false, new net0(8, false), 22);
            case 28:
                if (!(obj instanceof Boolean) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            default:
                if (obj instanceof rih1) {
                    return null;
                }
                return (Boolean) obj;
        }
    }
}
