package p;

import com.spotify.concertpageview.v1.Row;
import com.spotify.cosmos.util.libs.proto.EpisodeDecorationPolicy;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.FormatType;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.LoggingData;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class kmj0 extends hab0 implements iu30 {
    public static final kmj0 N0;
    public static final kmj0 O0;
    public static final kmj0 P0;
    public static final kmj0 Q0;
    public static final kmj0 R0;
    public static final kmj0 S0;
    public static final kmj0 T0;
    public static final kmj0 U0;
    public static final kmj0 V0;
    public static final kmj0 W0;
    public static final kmj0 X;
    public static final kmj0 X0;
    public static final kmj0 Y;
    public static final kmj0 Y0;
    public static final kmj0 Z;
    public static final kmj0 Z0;
    public static final kmj0 a1;
    public static final kmj0 b;
    public static final kmj0 b1;
    public static final kmj0 c;
    public static final kmj0 c1;
    public static final kmj0 d;
    public static final kmj0 d1;
    public static final kmj0 e;
    public static final kmj0 e1;
    public static final kmj0 f;
    public static final kmj0 g;
    public static final kmj0 h;
    public static final kmj0 i;
    public static final kmj0 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new kmj0(i2, (byte) 0);
        c = new kmj0(i2, (byte) 1);
        d = new kmj0(i2, (byte) 2);
        e = new kmj0(i2, (byte) 3);
        f = new kmj0(i2, (byte) 4);
        g = new kmj0(i2, (byte) 5);
        h = new kmj0(i2, (byte) 6);
        i = new kmj0(i2, (byte) 7);
        t = new kmj0(i2, (byte) 8);
        X = new kmj0(i2, (byte) 9);
        Y = new kmj0(i2, (byte) 10);
        Z = new kmj0(i2, (byte) 11);
        N0 = new kmj0(i2, (byte) 12);
        O0 = new kmj0(i2, (byte) 13);
        P0 = new kmj0(i2, (byte) 14);
        Q0 = new kmj0(i2, (byte) 15);
        R0 = new kmj0(i2, (byte) 16);
        S0 = new kmj0(i2, (byte) 17);
        T0 = new kmj0(i2, (byte) 18);
        U0 = new kmj0(i2, (byte) 19);
        V0 = new kmj0(i2, (byte) 20);
        W0 = new kmj0(i2, (byte) 21);
        X0 = new kmj0(i2, (byte) 22);
        Y0 = new kmj0(i2, (byte) 23);
        Z0 = new kmj0(i2, (byte) 24);
        a1 = new kmj0(i2, (byte) 25);
        b1 = new kmj0(i2, (byte) 26);
        c1 = new kmj0(i2, (byte) 27);
        d1 = new kmj0(i2, (byte) 28);
        e1 = new kmj0(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kmj0(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        LoggingData loggingDataB;
        FormatType formatType;
        byte b2 = this.a;
        b7x b7xVar = b7x.a;
        rih1 rih1Var = rih1.a;
        boolean z = false;
        switch (b2) {
            case 0:
                if (obj instanceof rih1) {
                    return null;
                }
                return (zoy0) obj;
            case 1:
                return Boolean.valueOf((obj instanceof iix0) || (obj instanceof rih1));
            case 2:
                return (String) obj;
            case 3:
                return (String) obj;
            case 4:
                return (String) obj;
            case 5:
                return Boolean.valueOf((obj instanceof xkk1) || (obj instanceof rih1));
            case 6:
                if (obj instanceof rih1) {
                    return null;
                }
                return (xkk1) obj;
            case 7:
                return Boolean.valueOf((obj instanceof zoy0) || (obj instanceof rih1));
            case 8:
                if (obj instanceof rih1) {
                    return null;
                }
                return (zoy0) obj;
            case 9:
                return Boolean.valueOf(obj instanceof jo70);
            case 10:
                if (obj != null) {
                    return (jo70) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.foundationaltraits.identitytrait.IdentityTrait");
                return null;
            case 11:
                r6h1 r6h1Var = r6h1.c;
                return new xkl0(new yok0((byte) 21));
            case 12:
                x6h1 x6h1VarC = ((xkl0) obj).a.c();
                x6h1VarC.i.add(new a7h1("enable_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC.a(), r6h1.c, System.currentTimeMillis());
            case 13:
                r6h1 r6h1Var2 = r6h1.c;
                return new xkl0(new yok0((byte) 21));
            case 14:
                x6h1 x6h1VarC2 = ((xkl0) obj).a.c();
                x6h1VarC2.i.add(new a7h1("keep_previous_quality_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = false;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC2.a(), r6h1.c, System.currentTimeMillis());
            case 15:
                x6h1 x6h1VarC3 = ((xkl0) obj).a.c();
                x6h1VarC3.i.add(new a7h1("enable_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC3.j = false;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC3.a(), r6h1.c, System.currentTimeMillis());
            case 16:
                return new y691(true);
            case 17:
                return new y691(true);
            case 18:
                return new y691(true);
            case 19:
                return rih1Var;
            case 20:
                return rih1Var;
            case Row.TICKETING_TIMELINE_PLACEHOLDER_ROW_FIELD_NUMBER /* 21 */:
                return rih1Var;
            case 22:
                return Boolean.valueOf(((a5j0) ((mmr0) obj).b) instanceof y4j0);
            case EpisodeDecorationPolicy.IS_BOOK_CHAPTER_FIELD_NUMBER /* 23 */:
                return Boolean.valueOf(((a5j0) ((mmr0) obj).b) instanceof z4j0);
            case EpisodeDecorationPolicy.IS_PODCAST_SHORT_FIELD_NUMBER /* 24 */:
                a5j0 a5j0Var = (a5j0) ((mmr0) obj).b;
                if ((a5j0Var instanceof x4j0) && (loggingDataB = a5j0Var.b()) != null && (formatType = loggingDataB.getFormatType()) != null && formatType != FormatType.INLINE_CARD) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case EpisodeDecorationPolicy.IS_CURATED_FIELD_NUMBER /* 25 */:
                return Boolean.valueOf(((a5j0) ((mmr0) obj).b) instanceof y4j0);
            case 26:
                a5j0 a5j0Var2 = (a5j0) ((mmr0) obj).b;
                if (!(a5j0Var2 instanceof y4j0) && !(a5j0Var2 instanceof x4j0)) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 27:
                return Boolean.valueOf(((a5j0) ((mmr0) obj).b) instanceof y4j0);
            case 28:
                return Boolean.valueOf(((a5j0) ((mmr0) obj).b) instanceof z4j0);
            default:
                return Boolean.valueOf(((a5j0) ((mmr0) obj).b) instanceof y4j0);
        }
    }
}
