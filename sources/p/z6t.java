package p;

import android.text.SpannableStringBuilder;
import com.spotify.concertpageview.v1.Row;
import com.spotify.cosmos.util.libs.proto.EpisodeDecorationPolicy;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class z6t extends hab0 implements iu30 {
    public static final z6t N0;
    public static final z6t O0;
    public static final z6t P0;
    public static final z6t Q0;
    public static final z6t R0;
    public static final z6t S0;
    public static final z6t T0;
    public static final z6t U0;
    public static final z6t V0;
    public static final z6t W0;
    public static final z6t X;
    public static final z6t X0;
    public static final z6t Y;
    public static final z6t Y0;
    public static final z6t Z;
    public static final z6t Z0;
    public static final z6t a1;
    public static final z6t b;
    public static final z6t b1;
    public static final z6t c;
    public static final z6t c1;
    public static final z6t d;
    public static final z6t d1;
    public static final z6t e;
    public static final z6t e1;
    public static final z6t f;
    public static final z6t g;
    public static final z6t h;
    public static final z6t i;
    public static final z6t t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new z6t(i2, (byte) 0);
        c = new z6t(i2, (byte) 1);
        d = new z6t(i2, (byte) 2);
        e = new z6t(i2, (byte) 3);
        f = new z6t(i2, (byte) 4);
        g = new z6t(i2, (byte) 5);
        h = new z6t(i2, (byte) 6);
        i = new z6t(i2, (byte) 7);
        t = new z6t(i2, (byte) 8);
        X = new z6t(i2, (byte) 9);
        Y = new z6t(i2, (byte) 10);
        Z = new z6t(i2, (byte) 11);
        N0 = new z6t(i2, (byte) 12);
        O0 = new z6t(i2, (byte) 13);
        P0 = new z6t(i2, (byte) 14);
        Q0 = new z6t(i2, (byte) 15);
        R0 = new z6t(i2, (byte) 16);
        S0 = new z6t(i2, (byte) 17);
        T0 = new z6t(i2, (byte) 18);
        U0 = new z6t(i2, (byte) 19);
        V0 = new z6t(i2, (byte) 20);
        W0 = new z6t(i2, (byte) 21);
        X0 = new z6t(i2, (byte) 22);
        Y0 = new z6t(i2, (byte) 23);
        Z0 = new z6t(i2, (byte) 24);
        a1 = new z6t(i2, (byte) 25);
        b1 = new z6t(i2, (byte) 26);
        c1 = new z6t(i2, (byte) 27);
        d1 = new z6t(i2, (byte) 28);
        e1 = new z6t(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z6t(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        byte b2 = this.a;
        rih1 rih1Var = rih1.a;
        z6x z6xVar = z6x.a;
        switch (b2) {
            case 0:
                return new tzk0((i3l0) obj);
            case 1:
                return ((tzk0) obj).e();
            case 2:
                return new yzk0((i3l0) obj);
            case 3:
                return ((yzk0) obj).e();
            case 4:
                return new yzk0((i3l0) obj);
            case 5:
                return ((yzk0) obj).e();
            case 6:
                i7t i7tVar = (i7t) obj;
                return new d8t(i7tVar.a, i7tVar.b, i7tVar.c, false);
            case 7:
                return nik1.X3.b("spotify:internal:parental-control:delete-account:".concat(((h8t) obj).a)).a;
            case 8:
                return new tzk0((i3l0) obj);
            case 9:
                return ((tzk0) obj).e();
            case 10:
                return new uzk0((i3l0) obj);
            case 11:
                return ((uzk0) obj).e();
            case 12:
                b7x b7xVar = b7x.a;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), ((mgl0) obj).a, r6h1.c, System.currentTimeMillis());
            case 13:
                return (String) obj;
            case 14:
                return (vnb1) obj;
            case 15:
                return Boolean.valueOf(obj instanceof vnb1);
            case 16:
                if (obj != null) {
                    return (vnb1) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.curation.state.State");
                return null;
            case 17:
                return new yzk0((i3l0) obj);
            case 18:
                return ((yzk0) obj).e();
            case 19:
                b261.c((e261) obj);
                return rih1Var;
            case 20:
                return new iet(new ydt(new SpannableStringBuilder(), false, Integer.valueOf(((het) obj).c)), 0L);
            case Row.TICKETING_TIMELINE_PLACEHOLDER_ROW_FIELD_NUMBER /* 21 */:
                ((qtr) obj).b(new ep0(5, (lnm) null));
                return rih1Var;
            case 22:
                return Collections.singletonList(((het) obj).a);
            case EpisodeDecorationPolicy.IS_BOOK_CHAPTER_FIELD_NUMBER /* 23 */:
                String str = ((het) obj).a;
                Set set = s4b1.f;
                return uic.h(str, new blc0[]{blc0.Pg, blc0.ld, blc0.Qg, blc0.Rg, blc0.Vg, blc0.z6}) ? Collections.singletonList(str) : z6xVar;
            case EpisodeDecorationPolicy.IS_PODCAST_SHORT_FIELD_NUMBER /* 24 */:
                return Collections.singletonList(((het) obj).a);
            case EpisodeDecorationPolicy.IS_CURATED_FIELD_NUMBER /* 25 */:
                het hetVar = (het) obj;
                return hetVar.e ? Collections.singletonList(hetVar.a) : z6xVar;
            case 26:
                return (String) obj;
            case 27:
                return (z070) obj;
            case 28:
                return (String) obj;
            default:
                return (mdz) obj;
        }
    }
}
