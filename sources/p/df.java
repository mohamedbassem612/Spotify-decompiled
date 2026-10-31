package p;

import android.media.MediaMetadataRetriever;
import com.spotify.mobius.runners.WorkRunners;
import com.spotify.playlist.policy.proto.PlaylistDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistItemDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistRequestDecorationPolicy;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class df extends hab0 implements Function0 {
    public static final df N0;
    public static final df O0;
    public static final df P0;
    public static final df Q0;
    public static final df R0;
    public static final df S0;
    public static final df T0;
    public static final df U0;
    public static final df V0;
    public static final df W0;
    public static final df X;
    public static final df X0;
    public static final df Y;
    public static final df Y0;
    public static final df Z;
    public static final df Z0;
    public static final df a1;
    public static final df b;
    public static final df b1;
    public static final df c;
    public static final df c1;
    public static final df d;
    public static final df d1;
    public static final df e;
    public static final df e1;
    public static final df f;
    public static final df g;
    public static final df h;
    public static final df i;
    public static final df t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 0;
        b = new df(i2, (byte) 0);
        c = new df(i2, (byte) 1);
        d = new df(i2, (byte) 2);
        e = new df(i2, (byte) 3);
        f = new df(i2, (byte) 4);
        g = new df(i2, (byte) 5);
        h = new df(i2, (byte) 6);
        i = new df(i2, (byte) 7);
        t = new df(i2, (byte) 8);
        X = new df(i2, (byte) 9);
        Y = new df(i2, (byte) 10);
        Z = new df(i2, (byte) 11);
        N0 = new df(i2, (byte) 12);
        O0 = new df(i2, (byte) 13);
        P0 = new df(i2, (byte) 14);
        Q0 = new df(i2, (byte) 15);
        R0 = new df(i2, (byte) 16);
        S0 = new df(i2, (byte) 17);
        T0 = new df(i2, (byte) 18);
        U0 = new df(i2, (byte) 19);
        V0 = new df(i2, (byte) 20);
        W0 = new df(i2, (byte) 21);
        X0 = new df(i2, (byte) 22);
        Y0 = new df(i2, (byte) 23);
        Z0 = new df(i2, (byte) 24);
        a1 = new df(i2, (byte) 25);
        b1 = new df(i2, (byte) 26);
        c1 = new df(i2, (byte) 27);
        d1 = new df(i2, (byte) 28);
        e1 = new df(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ df(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke() {
        byte b2 = this.a;
        tgc0 tgc0Var = tgc0.a;
        rih1 rih1Var = rih1.a;
        switch (b2) {
            case 0:
                throw new IllegalStateException("No Accessibility provided. Wrap content with SpotifyComposeDefaults.ProvideSpotifyComposeDefaults().");
            case 1:
                return Integer.valueOf(dqz0.b.g(2147418112) + 65536);
            case 2:
                return rih1Var;
            case 3:
                return new of2();
            case 4:
                return wf10.a().getSharedPreferences("com.facebook.sdk.APPLINK_INFO", 0);
            case 5:
                return Float.valueOf(0.0f);
            case 6:
                return new Locale(upn1.m());
            case 7:
                throw new IllegalStateException("No ImageLoader provided. For @Previews use com.spotify.encore.tooling.preview.EncorePreview()");
            case 8:
                return k4k.p(2131961736).c();
            case 9:
                return new vgc0((Integer) null, tgc0Var, 2);
            case 10:
                return "home";
            case 11:
                return new i94((zle1) cme1.a.getValue(), new f15());
            case 12:
                return new vgc0(2131954832, tgc0Var, 1);
            case 13:
                return rih1Var;
            case 14:
                return new ecx(0.8f);
            case 15:
                hru0 hru0VarS = PlaylistRequestDecorationPolicy.s();
                sku0 sku0VarP = PlaylistDecorationPolicy.p();
                sku0VarP.H();
                sku0VarP.G();
                hru0VarS.w(sku0VarP.build());
                return hru0VarS.build();
            case 16:
                n57.e("No LocalEncoreTooltipMessagePresenter provided - ensure that you're in a page or manually call ProvideEncoreTooltipCompositionLocals");
                return null;
            case 17:
                return Boolean.TRUE;
            case 18:
                return Boolean.FALSE;
            case 19:
                return jy20.a;
            case 20:
                return new SimpleDateFormat("EEE", Locale.getDefault());
            case 21:
                return Float.valueOf(Float.NaN);
            case 22:
                return WorkRunners.a();
            case 23:
                hru0 hru0VarS2 = PlaylistRequestDecorationPolicy.s();
                sku0 sku0VarP2 = PlaylistDecorationPolicy.p();
                sku0VarP2.N();
                sku0VarP2.d0();
                sku0VarP2.R();
                sku0VarP2.G();
                sku0VarP2.C();
                hru0VarS2.w(sku0VarP2.build());
                iou0 iou0VarV = PlaylistItemDecorationPolicy.v();
                iou0VarV.D(true);
                iou0VarV.v();
                hru0VarS2.u(iou0VarV.build());
                PlaylistRequestDecorationPolicy playlistRequestDecorationPolicyBuild = hru0VarS2.build();
                playlistRequestDecorationPolicyBuild.getClass();
                return new trc0(playlistRequestDecorationPolicyBuild, (g3d0) null, (Set) null, false, qrc0.a, hqz0.a, (prc0) null, 0, (List) null, 462);
            case 24:
                return xpn1.u();
            case 25:
                return new cwx();
            case 26:
                return new MediaMetadataRetriever();
            case 27:
                n57.e("No MessageOrchestrator provided");
                return null;
            case 28:
                throw new IllegalStateException("No MainLayoutContentContext available - is your composable really in MainLayoutContent?");
            default:
                throw new IllegalStateException("No MainLayoutInsets available - is your composable really in the MainLayout?");
        }
    }
}
