package p;

import com.spotify.concertpageview.v1.Row;
import com.spotify.cosmos.util.libs.proto.EpisodeDecorationPolicy;
import java.util.UUID;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class r5r extends hab0 implements iu30 {
    public static final r5r N0;
    public static final r5r O0;
    public static final r5r P0;
    public static final r5r Q0;
    public static final r5r R0;
    public static final r5r S0;
    public static final r5r T0;
    public static final r5r U0;
    public static final r5r V0;
    public static final r5r W0;
    public static final r5r X;
    public static final r5r X0;
    public static final r5r Y;
    public static final r5r Y0;
    public static final r5r Z;
    public static final r5r Z0;
    public static final r5r a1;
    public static final r5r b;
    public static final r5r b1;
    public static final r5r c;
    public static final r5r c1;
    public static final r5r d;
    public static final r5r d1;
    public static final r5r e;
    public static final r5r e1;
    public static final r5r f;
    public static final r5r g;
    public static final r5r h;
    public static final r5r i;
    public static final r5r t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new r5r(i2, (byte) 0);
        c = new r5r(i2, (byte) 1);
        d = new r5r(i2, (byte) 2);
        e = new r5r(i2, (byte) 3);
        f = new r5r(i2, (byte) 4);
        g = new r5r(i2, (byte) 5);
        h = new r5r(i2, (byte) 6);
        i = new r5r(i2, (byte) 7);
        t = new r5r(i2, (byte) 8);
        X = new r5r(i2, (byte) 9);
        Y = new r5r(i2, (byte) 10);
        Z = new r5r(i2, (byte) 11);
        N0 = new r5r(i2, (byte) 12);
        O0 = new r5r(i2, (byte) 13);
        P0 = new r5r(i2, (byte) 14);
        Q0 = new r5r(i2, (byte) 15);
        R0 = new r5r(i2, (byte) 16);
        S0 = new r5r(i2, (byte) 17);
        T0 = new r5r(i2, (byte) 18);
        U0 = new r5r(i2, (byte) 19);
        V0 = new r5r(i2, (byte) 20);
        W0 = new r5r(i2, (byte) 21);
        X0 = new r5r(i2, (byte) 22);
        Y0 = new r5r(i2, (byte) 23);
        Z0 = new r5r(i2, (byte) 24);
        a1 = new r5r(i2, (byte) 25);
        b1 = new r5r(i2, (byte) 26);
        c1 = new r5r(i2, (byte) 27);
        d1 = new r5r(i2, (byte) 28);
        e1 = new r5r(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r5r(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        byte b2 = this.a;
        rih1 rih1Var = rih1.a;
        switch (b2) {
            case 0:
                b261.c((e261) obj);
                return rih1Var;
            case 1:
                b261.d((e261) obj);
                return rih1Var;
            case 2:
                return rih1Var;
            case 3:
                b261.F((e261) obj, true);
                return rih1Var;
            case 4:
                b261.F((e261) obj, true);
                return rih1Var;
            case 5:
                b261.c((e261) obj);
                return rih1Var;
            case 6:
                return new p7r(((cxc0) obj).f.a);
            case 7:
                return (qxc0) obj;
            case 8:
                String str = (String) ((cxc0) obj).f.q.get("daylist_pretitle");
                return new t7r(str != null ? str : "");
            case 9:
                return Boolean.valueOf(obj instanceof qxc0);
            case 10:
                if (obj != null) {
                    return (qxc0) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.listplatform.endpoints.kodiak.ListMetadataTable.Entity");
                return null;
            case 11:
                ((kd31) obj).f(false);
                return rih1Var;
            case 12:
                return new pzk0((i3l0) obj);
            case 13:
                return ((pzk0) obj).e();
            case 14:
                return new rp((ej) obj, (byte) 18);
            case 15:
                return rih1Var;
            case 16:
                l0l l0lVar = (l0l) obj;
                if (l0lVar != null) {
                    return new mmr0(l0lVar.d(), Integer.valueOf(l0lVar.c()));
                }
                return null;
            case 17:
                return j5.a;
            case 18:
                return rih1Var;
            case 19:
                return new hsf(rba0.a);
            case 20:
                return ((kik) obj).a;
            case Row.TICKETING_TIMELINE_PLACEHOLDER_ROW_FIELD_NUMBER /* 21 */:
                return ((kik) obj).a;
            case 22:
                return rih1Var;
            case EpisodeDecorationPolicy.IS_BOOK_CHAPTER_FIELD_NUMBER /* 23 */:
                return rih1Var;
            case EpisodeDecorationPolicy.IS_PODCAST_SHORT_FIELD_NUMBER /* 24 */:
                return new g3l((f3l) obj, b2l.a);
            case EpisodeDecorationPolicy.IS_CURATED_FIELD_NUMBER /* 25 */:
                u3l u3lVar = (u3l) obj;
                return new v3l(new y3l(""), u3lVar.a, u3lVar.b);
            case 26:
                anl anlVar = (anl) obj;
                return new bnl((ah91) null, -14145496, -13421773, false, anlVar.a, anlVar.b, (UUID) null);
            case 27:
                b261.t((e261) obj, 1);
                return rih1Var;
            case 28:
                return rih1Var;
            default:
                return rih1Var;
        }
    }
}
