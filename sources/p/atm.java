package p;

import com.spotify.concertpageview.v1.Row;
import com.spotify.cosmos.util.libs.proto.EpisodeDecorationPolicy;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class atm extends hab0 implements iu30 {
    public static final atm N0;
    public static final atm O0;
    public static final atm P0;
    public static final atm Q0;
    public static final atm R0;
    public static final atm S0;
    public static final atm T0;
    public static final atm U0;
    public static final atm V0;
    public static final atm W0;
    public static final atm X;
    public static final atm X0;
    public static final atm Y;
    public static final atm Y0;
    public static final atm Z;
    public static final atm Z0;
    public static final atm a1;
    public static final atm b;
    public static final atm b1;
    public static final atm c;
    public static final atm c1;
    public static final atm d;
    public static final atm d1;
    public static final atm e;
    public static final atm e1;
    public static final atm f;
    public static final atm g;
    public static final atm h;
    public static final atm i;
    public static final atm t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new atm(i2, (byte) 0);
        c = new atm(i2, (byte) 1);
        d = new atm(i2, (byte) 2);
        e = new atm(i2, (byte) 3);
        f = new atm(i2, (byte) 4);
        g = new atm(i2, (byte) 5);
        h = new atm(i2, (byte) 6);
        i = new atm(i2, (byte) 7);
        t = new atm(i2, (byte) 8);
        X = new atm(i2, (byte) 9);
        Y = new atm(i2, (byte) 10);
        Z = new atm(i2, (byte) 11);
        N0 = new atm(i2, (byte) 12);
        O0 = new atm(i2, (byte) 13);
        P0 = new atm(i2, (byte) 14);
        Q0 = new atm(i2, (byte) 15);
        R0 = new atm(i2, (byte) 16);
        S0 = new atm(i2, (byte) 17);
        T0 = new atm(i2, (byte) 18);
        U0 = new atm(i2, (byte) 19);
        V0 = new atm(i2, (byte) 20);
        W0 = new atm(i2, (byte) 21);
        X0 = new atm(i2, (byte) 22);
        Y0 = new atm(i2, (byte) 23);
        Z0 = new atm(i2, (byte) 24);
        a1 = new atm(i2, (byte) 25);
        b1 = new atm(i2, (byte) 26);
        c1 = new atm(i2, (byte) 27);
        d1 = new atm(i2, (byte) 28);
        e1 = new atm(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ atm(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        boolean z = true;
        switch (this.a) {
            case 0:
                if (obj != null) {
                    return (nqm) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.contribution.model.ContributionKindCapabilities");
                return null;
            case 1:
                return (mqm) obj;
            case 2:
                return (List) obj;
            case 3:
                return Boolean.valueOf(obj instanceof List);
            case 4:
                if (obj != null) {
                    return (List) obj;
                }
                bhn0.i("null cannot be cast to non-null type kotlin.collections.List<com.spotify.contribution.model.Contribution>");
                return null;
            case 5:
                return Boolean.valueOf(obj instanceof List);
            case 6:
                if (obj != null) {
                    return (List) obj;
                }
                bhn0.i("null cannot be cast to non-null type kotlin.collections.List<com.spotify.contribution.model.Contribution>");
                return null;
            case 7:
                return (List) obj;
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
                if (!(obj instanceof xkk1) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 13:
                if (obj instanceof rih1) {
                    return null;
                }
                return (xkk1) obj;
            case 14:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return bool;
            case 15:
                if (!(obj instanceof Boolean) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 16:
                if (obj instanceof rih1) {
                    return null;
                }
                return (Boolean) obj;
            case 17:
                return Boolean.valueOf(obj instanceof Boolean);
            case 18:
                if (obj != null) {
                    return (Boolean) obj;
                }
                bhn0.i("null cannot be cast to non-null type kotlin.Boolean");
                return null;
            case 19:
                return w7x.a;
            case 20:
                return new f1l0((i3l0) obj);
            case Row.TICKETING_TIMELINE_PLACEHOLDER_ROW_FIELD_NUMBER /* 21 */:
                jum jumVar = (jum) obj;
                return jumVar.a.a + " (" + jumVar.b + ")";
            case 22:
                return rih1.a;
            case EpisodeDecorationPolicy.IS_BOOK_CHAPTER_FIELD_NUMBER /* 23 */:
                if (!(obj instanceof List) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case EpisodeDecorationPolicy.IS_PODCAST_SHORT_FIELD_NUMBER /* 24 */:
                if (obj instanceof rih1) {
                    return null;
                }
                return (List) obj;
            case EpisodeDecorationPolicy.IS_CURATED_FIELD_NUMBER /* 25 */:
                if (!(obj instanceof Boolean) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 26:
                if (obj instanceof rih1) {
                    return null;
                }
                return (Boolean) obj;
            case 27:
                if (!(obj instanceof Boolean) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 28:
                if (obj instanceof rih1) {
                    return null;
                }
                return (Boolean) obj;
            default:
                return ((uwm) obj).b;
        }
    }
}
