package p;

import com.spotify.concertpageview.v1.Row;
import com.spotify.cosmos.util.libs.proto.EpisodeDecorationPolicy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class h4o extends hab0 implements iu30 {
    public static final h4o N0;
    public static final h4o O0;
    public static final h4o P0;
    public static final h4o Q0;
    public static final h4o R0;
    public static final h4o S0;
    public static final h4o T0;
    public static final h4o U0;
    public static final h4o V0;
    public static final h4o W0;
    public static final h4o X;
    public static final h4o X0;
    public static final h4o Y;
    public static final h4o Y0;
    public static final h4o Z;
    public static final h4o Z0;
    public static final h4o a1;
    public static final h4o b;
    public static final h4o b1;
    public static final h4o c;
    public static final h4o c1;
    public static final h4o d;
    public static final h4o d1;
    public static final h4o e;
    public static final h4o e1;
    public static final h4o f;
    public static final h4o g;
    public static final h4o h;
    public static final h4o i;
    public static final h4o t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new h4o(i2, (byte) 0);
        c = new h4o(i2, (byte) 1);
        d = new h4o(i2, (byte) 2);
        e = new h4o(i2, (byte) 3);
        f = new h4o(i2, (byte) 4);
        g = new h4o(i2, (byte) 5);
        h = new h4o(i2, (byte) 6);
        i = new h4o(i2, (byte) 7);
        t = new h4o(i2, (byte) 8);
        X = new h4o(i2, (byte) 9);
        Y = new h4o(i2, (byte) 10);
        Z = new h4o(i2, (byte) 11);
        N0 = new h4o(i2, (byte) 12);
        O0 = new h4o(i2, (byte) 13);
        P0 = new h4o(i2, (byte) 14);
        Q0 = new h4o(i2, (byte) 15);
        R0 = new h4o(i2, (byte) 16);
        S0 = new h4o(i2, (byte) 17);
        T0 = new h4o(i2, (byte) 18);
        U0 = new h4o(i2, (byte) 19);
        V0 = new h4o(i2, (byte) 20);
        W0 = new h4o(i2, (byte) 21);
        X0 = new h4o(i2, (byte) 22);
        Y0 = new h4o(i2, (byte) 23);
        Z0 = new h4o(i2, (byte) 24);
        a1 = new h4o(i2, (byte) 25);
        b1 = new h4o(i2, (byte) 26);
        c1 = new h4o(i2, (byte) 27);
        d1 = new h4o(i2, (byte) 28);
        e1 = new h4o(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h4o(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        List list;
        byte b2 = this.a;
        ArrayList arrayList = z6x.a;
        rih1 rih1Var = rih1.a;
        boolean z = true;
        switch (b2) {
            case 0:
                return new c4o("", null);
            case 1:
                String str = ((b4o) obj).a;
                if (str.length() == 0) {
                    str = null;
                }
                if (str != null) {
                    return new nwc0(str);
                }
                return null;
            case 2:
                owc0 owc0Var = (owc0) obj;
                if (owc0Var != null && (list = owc0Var.b) != null) {
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj2 : list) {
                        wls0 wls0Var = ((fji0) obj2).f;
                        if (wls0Var == wls0.a || wls0Var == wls0.f) {
                            arrayList2.add(obj2);
                        }
                    }
                    arrayList = new ArrayList(q7h.U(arrayList2, 10));
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((fji0) it.next()).a);
                    }
                }
                return arrayList;
            case 3:
                if (!(obj instanceof owc0) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 4:
                if (obj instanceof rih1) {
                    return null;
                }
                return (owc0) obj;
            case 5:
                if (!(obj instanceof xkk1) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 6:
                if (obj instanceof rih1) {
                    return null;
                }
                return (xkk1) obj;
            case 7:
                return i5o.a;
            case 8:
                return (String) obj;
            case 9:
                return (String) obj;
            case 10:
                if (!(obj instanceof jo70) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 11:
                if (obj instanceof rih1) {
                    return null;
                }
                return (jo70) obj;
            case 12:
                return Boolean.valueOf(obj instanceof j7o);
            case 13:
                if (obj != null) {
                    return (j7o) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.foundationaltraits.creditsv2trait.CreditsV2Trait");
                return null;
            case 14:
                return rih1Var;
            case 15:
                b261.c((e261) obj);
                return rih1Var;
            case 16:
                b261.c((e261) obj);
                return rih1Var;
            case 17:
                return new v6o("", arrayList);
            case 18:
                return ((u6o) obj).a;
            case 19:
                jo70 jo70Var = (jo70) obj;
                if (jo70Var != null) {
                    return jo70Var.a;
                }
                return null;
            case 20:
                if (!(obj instanceof jo70) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case Row.TICKETING_TIMELINE_PLACEHOLDER_ROW_FIELD_NUMBER /* 21 */:
                if (obj instanceof rih1) {
                    return null;
                }
                return (jo70) obj;
            case 22:
                return ((ho70) obj).a;
            case EpisodeDecorationPolicy.IS_BOOK_CHAPTER_FIELD_NUMBER /* 23 */:
                return ((vwo0) obj).a;
            case EpisodeDecorationPolicy.IS_PODCAST_SHORT_FIELD_NUMBER /* 24 */:
                return (iao) obj;
            case EpisodeDecorationPolicy.IS_CURATED_FIELD_NUMBER /* 25 */:
                return (iao) obj;
            case 26:
                ((Number) obj).intValue();
                return null;
            case 27:
                return (wao) obj;
            case 28:
                return ((uao) obj).a;
            default:
                return (uao) obj;
        }
    }
}
