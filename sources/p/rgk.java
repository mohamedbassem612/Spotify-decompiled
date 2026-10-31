package p;

import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class rgk extends hab0 implements iu30 {
    public static final rgk N0;
    public static final rgk O0;
    public static final rgk P0;
    public static final rgk Q0;
    public static final rgk R0;
    public static final rgk S0;
    public static final rgk T0;
    public static final rgk U0;
    public static final rgk V0;
    public static final rgk W0;
    public static final rgk X;
    public static final rgk X0;
    public static final rgk Y;
    public static final rgk Y0;
    public static final rgk Z;
    public static final rgk Z0;
    public static final rgk a1;
    public static final rgk b;
    public static final rgk b1;
    public static final rgk c;
    public static final rgk c1;
    public static final rgk d;
    public static final rgk d1;
    public static final rgk e;
    public static final rgk e1;
    public static final rgk f;
    public static final rgk g;
    public static final rgk h;
    public static final rgk i;
    public static final rgk t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new rgk(i2, (byte) 0);
        c = new rgk(i2, (byte) 1);
        d = new rgk(i2, (byte) 2);
        e = new rgk(i2, (byte) 3);
        f = new rgk(i2, (byte) 4);
        g = new rgk(i2, (byte) 5);
        h = new rgk(i2, (byte) 6);
        i = new rgk(i2, (byte) 7);
        t = new rgk(i2, (byte) 8);
        X = new rgk(i2, (byte) 9);
        Y = new rgk(i2, (byte) 10);
        Z = new rgk(i2, (byte) 11);
        N0 = new rgk(i2, (byte) 12);
        O0 = new rgk(i2, (byte) 13);
        P0 = new rgk(i2, (byte) 14);
        Q0 = new rgk(i2, (byte) 15);
        R0 = new rgk(i2, (byte) 16);
        S0 = new rgk(i2, (byte) 17);
        T0 = new rgk(i2, (byte) 18);
        U0 = new rgk(i2, (byte) 19);
        V0 = new rgk(i2, (byte) 20);
        W0 = new rgk(i2, (byte) 21);
        X0 = new rgk(i2, (byte) 22);
        Y0 = new rgk(i2, (byte) 23);
        Z0 = new rgk(i2, (byte) 24);
        a1 = new rgk(i2, (byte) 25);
        b1 = new rgk(i2, (byte) 26);
        c1 = new rgk(i2, (byte) 27);
        d1 = new rgk(i2, (byte) 28);
        e1 = new rgk(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rgk(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        byte b2 = this.a;
        rih1 rih1Var = rih1.a;
        switch (b2) {
            case 0:
                int iOrdinal = ((c900) obj).ordinal();
                if (iOrdinal == 0) {
                    return jgk.a;
                }
                if (iOrdinal == 1) {
                    return kgk.a;
                }
                eg.o();
                return null;
            case 1:
                return new yyk0((i3l0) obj);
            case 2:
                b7x b7xVar = b7x.a;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), ((yyk0) obj).a, r6h1.c, System.currentTimeMillis());
            case 3:
                return new o2l0((i3l0) obj);
            case 4:
                return new o2l0((i3l0) obj);
            case 5:
                return rih1Var;
            case 6:
                return rih1Var;
            case 7:
                return rih1Var;
            case 8:
                return rih1Var;
            case 9:
                return new fok("", "");
            case 10:
                return rih1Var;
            case 11:
                b261.x((e261) obj, 0);
                return rih1Var;
            case 12:
                return ((kfk) obj).a;
            case 13:
                List list = (List) obj;
                return new upk((j6k) vpk.a.e.invoke(list.get(0)), (lhe0) vpk.b.e.invoke(list.get(1)), (jfk) vpk.c.e.invoke(list.get(2)));
            case 14:
                return ((kfk) obj).a;
            case 15:
                return ((kfk) obj).a;
            case 16:
                return Boolean.valueOf(obj instanceof j6k);
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                if (obj != null) {
                    return (j6k) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.concert.Concert");
                return null;
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                return Boolean.valueOf(obj instanceof lhe0);
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                if (obj != null) {
                    return (lhe0) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.concertlocation.Location");
                return null;
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                return Boolean.valueOf(obj instanceof jfk);
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                if (obj != null) {
                    return (jfk) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.concertmarketing.ConcertCover");
                return null;
            case 22:
                return rih1Var;
            case 23:
                return rih1Var;
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                return ((vqk) obj).a;
            case 25:
                return ((vqk) obj).a;
            case 26:
                return ((vqk) obj).a;
            case 27:
                return ((vqk) obj).a;
            case 28:
                return pqk.f33p;
            default:
                return Boolean.valueOf((obj instanceof xkk1) || (obj instanceof rih1));
        }
    }
}
