package p;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.media.browse.MediaBrowser;
import android.net.ConnectivityManager;
import android.net.nsd.NsdManager;
import android.os.Bundle;
import android.os.Handler;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import com.spotify.apprater.appraterdialog.AppRaterActivity;
import com.spotify.encoreconsumermobile.elements.artwork.ArtworkView;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import com.spotify.wrapped.widget.v1.WrappedWidgetResources;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class nx2 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nx2(o86 o86Var, iu30 iu30Var) {
        super(0);
        this.a = (byte) 19;
        this.c = o86Var;
        this.b = iu30Var;
    }

    public final Object invoke() {
        ContextTrack contextTrack;
        j380 j380VarMetadata;
        ContextTrack contextTrack2;
        m231 m231Var;
        ou80 ou80Var;
        float fD;
        float f;
        byte b = this.a;
        float fC = 0.0f;
        String str = null;
        m231 m231Var2 = rih1.a;
        Object obj = this.b;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                ((iu30) obj).invoke((kx2) obj2);
                return m231Var2;
            case 1:
                ly2 ly2Var = (ly2) obj;
                ly2Var.a.m(ly2Var.b.e(), (xj61) null);
                ((jy2) obj2).c.invoke();
                return m231Var2;
            case 2:
                ((Handler) ((toj0) obj).f).post(new s10((gga1) obj2, (byte) 2));
                return m231Var2;
            case 3:
                tgm tgmVar = (tgm) obj2;
                return tgm.a((tgm) ((wcm) obj).f.invoke(), tgmVar.g, tgmVar.k, tgmVar.F, false, (sgm) null, (iu30) null, (p860) null, tgmVar.D, 2147480511);
            case 4:
                return new kpg0(((kyo) obj).a(), new jm1((fb3) obj2, (byte) 23));
            case 5:
                return q1o1.u(new jpg0((dx0) obj, new ve3((fb3) obj2, (byte) 2)), u291.f(nim0.a, 1.0f), (FrameLayout.LayoutParams) null, 4);
            case 6:
                bpb1 bpb1Var = ((ks3) obj).d;
                bpb1Var.getClass();
                bpb1Var.m((Object) null, (ls3) obj2);
                return m231Var2;
            case 7:
                bpb1 bpb1Var2 = ((ks3) obj).g;
                fs3 fs3Var = new fs3(((gn3) obj2).a);
                bpb1Var2.getClass();
                bpb1Var2.m((Object) null, fs3Var);
                return m231Var2;
            case 8:
                return uwo1.m(((q940) obj).a((ced0) obj2), asr0.a);
            case 9:
                ((g23) obj).l((ito) obj2).m(voc.a);
                return m231Var2;
            case 10:
                kl1 kl1Var = (kl1) obj;
                PlayerState playerState = (PlayerState) obj2;
                spq0 spq0VarTrack = playerState.track();
                String strUri = (spq0VarTrack == null || (contextTrack2 = (ContextTrack) spq0VarTrack.h()) == null) ? null : contextTrack2.uri();
                spq0 spq0VarTrack2 = playerState.track();
                if (spq0VarTrack2 != null && (contextTrack = (ContextTrack) spq0VarTrack2.h()) != null && (j380VarMetadata = contextTrack.metadata()) != null) {
                    str = (String) j380VarMetadata.get("pointer.uri");
                }
                return new d64((Long) playerState.position(((yqg) kl1Var.d).b()).h(), strUri, str, playerState.isPaused());
            case 11:
                ec4 ec4Var = (ec4) obj;
                yo00 yo00Var = ec4Var.c;
                if (yo00Var != null) {
                    yo00Var.P((cc4) obj2);
                }
                yo00 yo00Var2 = ec4Var.c;
                if (yo00Var2 != null) {
                    yo00Var2.stop();
                }
                yo00 yo00Var3 = ec4Var.c;
                if (yo00Var3 != null) {
                    yo00Var3.r(po7.i, false);
                }
                return m231Var2;
            case 12:
                d520 d520Var = (d520) obj2;
                ComponentName componentName = (ComponentName) d520Var.d;
                qr4 qr4Var = (qr4) d520Var.g;
                Bundle bundle = new Bundle();
                bundle.putBoolean("android.service.media.extra.SUGGESTED", true);
                bundle.putString("com.spotify.music.extra.SUGGESTED_TYPE", "npv-recommendations-widget");
                bundle.putString("com.spotify.music.extra.VERSION", "0.1");
                return new MediaBrowser((Context) obj, componentName, qr4Var, bundle);
            case 13:
                ((ConnectivityManager) ((idd1) ((mu4) obj).e).getValue()).unregisterNetworkCallback((ConnectivityManager.NetworkCallback) obj2);
                return m231Var2;
            case 14:
                try {
                    ((NsdManager) obj).stopServiceDiscovery((wv4) obj2);
                    m231Var = m231Var2;
                } catch (Throwable th) {
                    m231Var = new m231(th);
                }
                Throwable thA = e331.a(m231Var);
                if (thA != null) {
                    String message = thA.getMessage();
                    if (message == null) {
                        message = "stopServiceDiscovery threw error";
                    }
                    n57.t(message, thA);
                }
                return m231Var2;
            case 15:
                qp5 qp5Var = (qp5) obj;
                i8h1 i8h1Var = (i8h1) qp5Var.c.getValue();
                x6h1 x6h1VarC = qp5Var.b.b.c();
                x6h1VarC.i.add(new a7h1("dismiss_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                y6h1 y6h1VarA = x6h1VarC.a();
                b7x b7xVar = b7x.a;
                i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), y6h1VarA, r6h1.c, System.currentTimeMillis()), (xj61) null);
                ((Function0) obj2).invoke();
                return m231Var2;
            case 16:
                AppRaterActivity appRaterActivity = (AppRaterActivity) obj;
                appRaterActivity.startActivity((Intent) obj2);
                appRaterActivity.finish();
                return m231Var2;
            case 17:
                ven0 ven0Var = (ven0) obj2;
                if (!((Boolean) ven0Var.getValue()).booleanValue()) {
                    ven0Var.setValue(Boolean.TRUE);
                    ((az20) obj).b(true);
                }
                return m231Var2;
            case 18:
                EditText editText = (EditText) obj;
                if (!editText.requestFocus()) {
                    return Boolean.FALSE;
                }
                InputMethodManager inputMethodManager = (InputMethodManager) obj2;
                if (inputMethodManager != null) {
                    return Boolean.valueOf(inputMethodManager.showSoftInput(editText, 1));
                }
                return null;
            case 19:
                tv80 tv80VarB = ((o86) obj2).b();
                if (tv80VarB != null && (ou80Var = tv80VarB.a) != null) {
                    str = ou80Var.a;
                }
                ((iu30) obj).invoke(str);
                return m231Var2;
            case 20:
                ((iu30) obj).invoke(((zm7) obj2).a);
                return m231Var2;
            case 21:
                gj6 gj6Var = (gj6) obj2;
                return ((Boolean) ((Function0) obj).invoke()).booleanValue() ? gj6Var.d : gj6Var.e;
            case 22:
                long jB = ((tui1) obj).b();
                ((vu30) obj2).invoke(Float.valueOf(qui1.d(jB)), Float.valueOf(qui1.e(jB)));
                return m231Var2;
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                ((ven0) obj2).setValue(Boolean.TRUE);
                ((xd6) obj).e = false;
                return m231Var2;
            case 24:
                ((ven0) obj2).setValue(Boolean.TRUE);
                ((xgm1) ((rk41) obj).c).a(fgm1.a);
                return m231Var2;
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                ((iu30) obj).invoke(((kb6) obj2).a);
                return m231Var2;
            case 26:
                wmo1.b((ven0) obj, (tbr0) obj2, l231.a);
                return m231Var2;
            case 27:
                ((wen0) obj).l((List) obj2);
                return m231Var2;
            case 28:
                fcf0 fcf0VarC = ((ncf0) obj).c();
                if (fcf0VarC != null) {
                    float f2 = ((r37) obj2).a;
                    float f3 = fcf0VarC.l;
                    fC = (f2 - f3) / (fcf0VarC.m - f3);
                }
                return Float.valueOf(fC);
            default:
                ArtworkView artworkView = (ArtworkView) obj2;
                o17 o17Var = (o17) obj;
                if (o17Var.a().b instanceof yz6) {
                    fC = ArtworkView.c(artworkView);
                } else if (o17Var.a().b instanceof zz6) {
                    fC = (artworkView.getContext().getResources().getDisplayMetrics().densityDpi / 160.0f) * ((zz6) o17Var.a().b).d;
                } else {
                    String str2 = ArtworkView.S0;
                    if ((o17Var instanceof l07) || (o17Var instanceof p07) || (o17Var instanceof j17) || (o17Var instanceof n07) || (o17Var instanceof j07) || (o17Var instanceof k17) || (o17Var instanceof l17) || (o17Var instanceof u07) || (o17Var.a().b instanceof xz6)) {
                        fD = ArtworkView.d(artworkView);
                        f = 2.0f;
                    } else if ((o17Var instanceof t07) || (o17Var instanceof o07) || (o17Var instanceof e17) || (o17Var instanceof f17) || (o17Var instanceof h17)) {
                        fD = ArtworkView.d(artworkView);
                        f = 12.0f;
                    }
                    fC = fD / f;
                }
                return Float.valueOf(fC);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nx2(Object obj, Object obj2, byte b) {
        super(0);
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nx2(ssw0 ssw0Var, NsdManager nsdManager, wv4 wv4Var) {
        super(0);
        this.a = (byte) 14;
        this.b = nsdManager;
        this.c = wv4Var;
    }
}
