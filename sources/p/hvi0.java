package p;

import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import com.spotify.concertpageview.v1.Row;
import com.spotify.cosmos.util.libs.proto.EpisodeDecorationPolicy;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class hvi0 extends hab0 implements iu30 {
    public static final hvi0 N0;
    public static final hvi0 O0;
    public static final hvi0 P0;
    public static final hvi0 Q0;
    public static final hvi0 R0;
    public static final hvi0 S0;
    public static final hvi0 T0;
    public static final hvi0 U0;
    public static final hvi0 V0;
    public static final hvi0 W0;
    public static final hvi0 X;
    public static final hvi0 X0;
    public static final hvi0 Y;
    public static final hvi0 Y0;
    public static final hvi0 Z;
    public static final hvi0 Z0;
    public static final hvi0 a1;
    public static final hvi0 b;
    public static final hvi0 b1;
    public static final hvi0 c;
    public static final hvi0 c1;
    public static final hvi0 d;
    public static final hvi0 d1;
    public static final hvi0 e;
    public static final hvi0 e1;
    public static final hvi0 f;
    public static final hvi0 g;
    public static final hvi0 h;
    public static final hvi0 i;
    public static final hvi0 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new hvi0(i2, (byte) 0);
        c = new hvi0(i2, (byte) 1);
        d = new hvi0(i2, (byte) 2);
        e = new hvi0(i2, (byte) 3);
        f = new hvi0(i2, (byte) 4);
        g = new hvi0(i2, (byte) 5);
        h = new hvi0(i2, (byte) 6);
        i = new hvi0(i2, (byte) 7);
        t = new hvi0(i2, (byte) 8);
        X = new hvi0(i2, (byte) 9);
        Y = new hvi0(i2, (byte) 10);
        Z = new hvi0(i2, (byte) 11);
        N0 = new hvi0(i2, (byte) 12);
        O0 = new hvi0(i2, (byte) 13);
        P0 = new hvi0(i2, (byte) 14);
        Q0 = new hvi0(i2, (byte) 15);
        R0 = new hvi0(i2, (byte) 16);
        S0 = new hvi0(i2, (byte) 17);
        T0 = new hvi0(i2, (byte) 18);
        U0 = new hvi0(i2, (byte) 19);
        V0 = new hvi0(i2, (byte) 20);
        W0 = new hvi0(i2, (byte) 21);
        X0 = new hvi0(i2, (byte) 22);
        Y0 = new hvi0(i2, (byte) 23);
        Z0 = new hvi0(i2, (byte) 24);
        a1 = new hvi0(i2, (byte) 25);
        b1 = new hvi0(i2, (byte) 26);
        c1 = new hvi0(i2, (byte) 27);
        d1 = new hvi0(i2, (byte) 28);
        e1 = new hvi0(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hvi0(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        String str = "NoView";
        switch (this.a) {
            case 0:
                return (avi0) obj;
            case 1:
                return Boolean.valueOf(obj instanceof avi0);
            case 2:
                if (obj != null) {
                    return (avi0) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.merch.merchscrollcarddataelement.MerchScrollCardData");
                return null;
            case 3:
                Context context = (Context) obj;
                ContextWrapper contextWrapper = context instanceof ContextWrapper ? (ContextWrapper) context : null;
                if (contextWrapper != null) {
                    return contextWrapper.getBaseContext();
                }
                return null;
            case 4:
                mwi0 mwi0Var = (mwi0) obj;
                return new sxi0(mwi0Var.a, mwi0Var.b, mwi0Var.c, mwi0Var.h);
            case 5:
                int iOrdinal = ((rxi0) obj).ordinal();
                if (iOrdinal == 0) {
                    return kwi0.a;
                }
                if (iOrdinal == 1) {
                    return jwi0.a;
                }
                eg.o();
                return null;
            case 6:
                qwi0 qwi0Var = (qwi0) obj;
                return new sxi0(qwi0Var.a, qwi0Var.b, qwi0Var.c, qwi0Var.h);
            case 7:
                int iOrdinal2 = ((rxi0) obj).ordinal();
                if (iOrdinal2 == 0) {
                    return pwi0.b;
                }
                if (iOrdinal2 == 1) {
                    return pwi0.a;
                }
                eg.o();
                return null;
            case 8:
                return rih1.a;
            case 9:
                g7j0 g7j0Var = (g7j0) obj;
                mmr0 mmr0Var = new mmr0("entityName", g7j0Var.c);
                mmr0 mmr0Var2 = new mmr0("entityImageUrl", g7j0Var.d);
                mmr0 mmr0Var3 = new mmr0("pageUri", g7j0Var.e);
                mmr0 mmr0Var4 = new mmr0("messageFetchingState", g7j0Var.b);
                cyo1 cyo1Var = g7j0Var.a;
                if (!(cyo1Var instanceof h7j0)) {
                    str = "Uninitialized";
                    if (!(cyo1Var instanceof i7j0) && !(cyo1Var instanceof j7j0)) {
                        eg.o();
                        return null;
                    }
                }
                return mno1.h(new mmr0[]{mmr0Var, mmr0Var2, mmr0Var3, mmr0Var4, new mmr0("viewFetchingState", str)});
            case 10:
                Bundle bundle = (Bundle) obj;
                String string = bundle.getString("entityName");
                String string2 = bundle.getString("entityImageUrl");
                String string3 = bundle.getString("pageUri");
                e7j0 parcelable = bundle.getParcelable("messageFetchingState");
                if (parcelable == null) {
                    parcelable = d7j0.a;
                }
                e7j0 e7j0Var = parcelable;
                String string4 = bundle.getString("viewFetchingState");
                if (string4 == null) {
                    string4 = "";
                }
                return new g7j0(string4.equals("NoView") ? h7j0.c : i7j0.c, e7j0Var, string, string2, string3);
            case 11:
                return (xej0) obj;
            case 12:
                return (String) obj;
            case 13:
                return (String) obj;
            case 14:
                return (String) obj;
            case 15:
                return (String) obj;
            case 16:
                return (String) obj;
            case 17:
                return (String) obj;
            case 18:
                return ((ho70) obj).a;
            case 19:
                return (String) obj;
            case 20:
                return ((ho70) obj).a;
            case Row.TICKETING_TIMELINE_PLACEHOLDER_ROW_FIELD_NUMBER /* 21 */:
                return Boolean.valueOf((obj instanceof xkk1) || (obj instanceof rih1));
            case 22:
                return Boolean.valueOf((obj instanceof xkk1) || (obj instanceof rih1));
            case EpisodeDecorationPolicy.IS_BOOK_CHAPTER_FIELD_NUMBER /* 23 */:
                if (obj instanceof rih1) {
                    return null;
                }
                return (xkk1) obj;
            case EpisodeDecorationPolicy.IS_PODCAST_SHORT_FIELD_NUMBER /* 24 */:
                if (obj instanceof rih1) {
                    return null;
                }
                return (xkk1) obj;
            case EpisodeDecorationPolicy.IS_CURATED_FIELD_NUMBER /* 25 */:
                return Boolean.valueOf((obj instanceof pjw0) || (obj instanceof rih1));
            case 26:
                if (obj instanceof rih1) {
                    return null;
                }
                return (pjw0) obj;
            case 27:
                return Boolean.valueOf(obj instanceof jo70);
            case 28:
                return Boolean.valueOf(obj instanceof jo70);
            default:
                if (obj != null) {
                    return (jo70) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.foundationaltraits.identitytrait.IdentityTrait");
                return null;
        }
    }
}
