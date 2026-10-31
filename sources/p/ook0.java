package p;

import android.os.Bundle;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import com.spotify.checkout.proto.model.v1.proto.Error;
import com.spotify.checkout.proto.model.v1.proto.FollowLinkCta;
import com.spotify.checkout.proto.model.v1.proto.GetSpotifyCheckoutPageResponse;
import com.spotify.checkout.proto.model.v1.proto.Redirect;
import com.spotify.checkout.proto.model.v1.proto.SubmitCheckoutResponse;
import com.spotify.checkout.proto.model.v1.proto.i1;
import com.spotify.checkout.proto.model.v1.proto.j;
import com.spotify.concertpageview.v1.Row;
import com.spotify.cosmos.util.libs.proto.EpisodeDecorationPolicy;
import java.io.IOException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class ook0 extends hab0 implements iu30 {
    public static final ook0 N0;
    public static final ook0 O0;
    public static final ook0 P0;
    public static final ook0 Q0;
    public static final ook0 R0;
    public static final ook0 S0;
    public static final ook0 T0;
    public static final ook0 U0;
    public static final ook0 V0;
    public static final ook0 W0;
    public static final ook0 X;
    public static final ook0 X0;
    public static final ook0 Y;
    public static final ook0 Y0;
    public static final ook0 Z;
    public static final ook0 Z0;
    public static final ook0 a1;
    public static final ook0 b;
    public static final ook0 b1;
    public static final ook0 c;
    public static final ook0 c1;
    public static final ook0 d;
    public static final ook0 d1;
    public static final ook0 e;
    public static final ook0 e1;
    public static final ook0 f;
    public static final ook0 g;
    public static final ook0 h;
    public static final ook0 i;
    public static final ook0 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new ook0(i2, (byte) 0);
        c = new ook0(i2, (byte) 1);
        d = new ook0(i2, (byte) 2);
        e = new ook0(i2, (byte) 3);
        f = new ook0(i2, (byte) 4);
        g = new ook0(i2, (byte) 5);
        h = new ook0(i2, (byte) 6);
        i = new ook0(i2, (byte) 7);
        t = new ook0(i2, (byte) 8);
        X = new ook0(i2, (byte) 9);
        Y = new ook0(i2, (byte) 10);
        Z = new ook0(i2, (byte) 11);
        N0 = new ook0(i2, (byte) 12);
        O0 = new ook0(i2, (byte) 13);
        P0 = new ook0(i2, (byte) 14);
        Q0 = new ook0(i2, (byte) 15);
        R0 = new ook0(i2, (byte) 16);
        S0 = new ook0(i2, (byte) 17);
        T0 = new ook0(i2, (byte) 18);
        U0 = new ook0(i2, (byte) 19);
        V0 = new ook0(i2, (byte) 20);
        W0 = new ook0(i2, (byte) 21);
        X0 = new ook0(i2, (byte) 22);
        Y0 = new ook0(i2, (byte) 23);
        Z0 = new ook0(i2, (byte) 24);
        a1 = new ook0(i2, (byte) 25);
        b1 = new ook0(i2, (byte) 26);
        c1 = new ook0(i2, (byte) 27);
        d1 = new ook0(i2, (byte) 28);
        e1 = new ook0(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ook0(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) throws IOException {
        byte b2 = this.a;
        rih1 rih1Var = rih1.a;
        switch (b2) {
            case 0:
                return (k1r) obj;
            case 1:
                return ((cok0) obj).a.b.c;
            case 2:
                return ((cok0) obj).a.b.d;
            case 3:
                return rih1Var;
            case 4:
                return mno1.h(new mmr0[]{new mmr0("LyricsFullscreenElementSavedStateKey", (ojf0) obj)});
            case 5:
                return mno1.h(new mmr0[]{new mmr0("LyricsTextElementSavedStateKey", (gsf0) obj)});
            case 6:
                ojf0 ojf0Var = (ojf0) jhc1.t((Bundle) obj, "LyricsFullscreenElementSavedStateKey", ojf0.class);
                if (ojf0Var != null) {
                    return ojf0Var;
                }
                eg.m("Saved state not found");
                return null;
            case 7:
                gsf0 gsf0Var = (gsf0) jhc1.t((Bundle) obj, "LyricsTextElementSavedStateKey", gsf0.class);
                if (gsf0Var != null) {
                    return gsf0Var;
                }
                eg.m("Saved state not found");
                return null;
            case 8:
                return mno1.h(new mmr0[]{new mmr0("wrapped.state", (ufm1) obj)});
            case 9:
                Object objT = jhc1.t((Bundle) obj, "wrapped.state", ufm1.class);
                if (objT != null) {
                    return (ufm1) objT;
                }
                hhg1.n("Required value was null.");
                return null;
            case 10:
                throw new IOException("Mock network error");
            case 11:
                return cbm0.d;
            case 12:
                hq40 hq40VarT = GetSpotifyCheckoutPageResponse.t();
                hq40VarT.q(ubm0.l);
                return (GetSpotifyCheckoutPageResponse) hq40VarT.build();
            case 13:
                hq40 hq40VarT2 = GetSpotifyCheckoutPageResponse.t();
                j jVarT = Error.t();
                jVarT.u("Error follow link");
                jVarT.t("This error only has a follow Link CTA");
                i630 i630VarQ = FollowLinkCta.q();
                i630VarQ.q("go to page");
                i630VarQ.n("https://www.youtube.com/watch?v=g0amdIcZt5I");
                jVarT.r(i630VarQ);
                hq40VarT2.r(jVarT);
                return (GetSpotifyCheckoutPageResponse) hq40VarT2.build();
            case 14:
                hq40 hq40VarT3 = GetSpotifyCheckoutPageResponse.t();
                hq40VarT3.r(ubm0.j);
                return (GetSpotifyCheckoutPageResponse) hq40VarT3.build();
            case 15:
                hq40 hq40VarT4 = GetSpotifyCheckoutPageResponse.t();
                hq40VarT4.n(ubm0.k);
                return (GetSpotifyCheckoutPageResponse) hq40VarT4.build();
            case 16:
                throw new IOException("Mock network error");
            case 17:
                hq40 hq40VarT5 = GetSpotifyCheckoutPageResponse.t();
                k711 k711VarO = Redirect.o();
                k711VarO.n("https://open.spotify.com/track/7mJY84RDD1Y1zg1BRA0pxz");
                hq40VarT5.s(k711VarO);
                return (GetSpotifyCheckoutPageResponse) hq40VarT5.build();
            case 18:
                i1 i1VarT = SubmitCheckoutResponse.t();
                i1VarT.q(ubm0.l);
                return (SubmitCheckoutResponse) i1VarT.build();
            case 19:
                i1 i1VarT2 = SubmitCheckoutResponse.t();
                i1VarT2.r(ubm0.j);
                return (SubmitCheckoutResponse) i1VarT2.build();
            case 20:
                i1 i1VarT3 = SubmitCheckoutResponse.t();
                i1VarT3.n(ubm0.k);
                return (SubmitCheckoutResponse) i1VarT3.build();
            case Row.TICKETING_TIMELINE_PLACEHOLDER_ROW_FIELD_NUMBER /* 21 */:
                throw new IOException("Mock network error");
            case 22:
                return ubm0.i;
            case EpisodeDecorationPolicy.IS_BOOK_CHAPTER_FIELD_NUMBER /* 23 */:
                throw new IOException("Mock network error");
            case EpisodeDecorationPolicy.IS_PODCAST_SHORT_FIELD_NUMBER /* 24 */:
                DrawScope drawScope = (DrawScope) obj;
                drawScope.a1().getClass();
                uwr uwrVar = cbx.a;
                long j = ((vex) zex.a.b).a;
                DrawScope.S0(drawScope, v9c.t(new mmr0[]{new mmr0(Float.valueOf(0.0f), new u7h(u7h.b(j, 0.9f, 0.0f, 0.0f, 0.0f, 14))), new mmr0(Float.valueOf(1.0f), new u7h(j))}, 0.0f, 0.0f, 14), 0L, 0L, 0.6f, (DrawStyle) null, (ColorFilter) null, 0, 118);
                return rih1Var;
            case 26:
            case EpisodeDecorationPolicy.IS_CURATED_FIELD_NUMBER /* 25 */:
                return rih1Var;
            case 27:
                return new zjm0(null);
            case 28:
                return ((yjm0) obj).a;
            default:
                return (a7q0) obj;
        }
    }
}
