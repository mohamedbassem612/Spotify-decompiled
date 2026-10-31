package p;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.spotify.musicappplatform.state.processor.AppLifecycleServicePendingIntent;
import java.util.UUID;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class j1n0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ ewy0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j1n0(m961 m961Var, Context context, ewy0 ewy0Var, byte b) {
        super(1);
        this.a = b;
        this.b = context;
        this.c = ewy0Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        ewy0 ewy0Var = this.c;
        Context context = this.b;
        switch (b) {
            case 0:
                Intent intentA = m961.a(context, "com.spotify.app.music.scopes.utils.action.player.NOTIFICATION_PUSH_ACTIONS");
                intentA.putExtra("push_data", ((Bundle) obj).getParcelable("push_data"));
                AppLifecycleServicePendingIntent appLifecycleServicePendingIntent = AppLifecycleServicePendingIntent.ADD_TO_PLAYLIST;
                qvy0 parcelableExtra = intentA.getParcelableExtra("push_data");
                int iT0 = parcelableExtra != null ? parcelableExtra.t0() : UUID.randomUUID().hashCode();
                if (parcelableExtra != null) {
                    intentA.addCategory(fwy0.a(appLifecycleServicePendingIntent, lgo1.s(parcelableExtra)));
                }
                return ewy0Var.f(iT0, 2, intentA);
            case 1:
                Intent intentA2 = m961.a(context, "com.spotify.app.music.scopes.utils.action.player.NOTIFICATION_PUSH_ACTIONS");
                intentA2.putExtra("push_data", ((Bundle) obj).getParcelable("push_data"));
                AppLifecycleServicePendingIntent appLifecycleServicePendingIntent2 = AppLifecycleServicePendingIntent.ADD_TO_QUEUE;
                qvy0 parcelableExtra2 = intentA2.getParcelableExtra("push_data");
                int iT1 = parcelableExtra2 != null ? parcelableExtra2.t0() : UUID.randomUUID().hashCode();
                if (parcelableExtra2 != null) {
                    intentA2.addCategory(fwy0.a(appLifecycleServicePendingIntent2, lgo1.s(parcelableExtra2)));
                }
                return ewy0Var.f(iT1, 2, intentA2);
            case 2:
                Intent intentA3 = m961.a(context, "com.spotify.app.music.scopes.utils.action.player.NOTIFICATION_PUSH_ACTIONS");
                intentA3.putExtra("push_data", ((Bundle) obj).getParcelable("push_data"));
                AppLifecycleServicePendingIntent appLifecycleServicePendingIntent3 = AppLifecycleServicePendingIntent.ADD_TO_YOUR_EPISODE;
                qvy0 parcelableExtra3 = intentA3.getParcelableExtra("push_data");
                int iT2 = parcelableExtra3 != null ? parcelableExtra3.t0() : UUID.randomUUID().hashCode();
                if (parcelableExtra3 != null) {
                    intentA3.addCategory(fwy0.a(appLifecycleServicePendingIntent3, lgo1.s(parcelableExtra3)));
                }
                return ewy0Var.f(iT2, 2, intentA3);
            case 3:
                Intent intentA4 = m961.a(context, "com.spotify.app.music.scopes.utils.action.player.NOTIFICATION_PUSH_ACTIONS");
                intentA4.putExtra("push_data", ((Bundle) obj).getParcelable("push_data"));
                AppLifecycleServicePendingIntent appLifecycleServicePendingIntent4 = AppLifecycleServicePendingIntent.DOWNLOAD;
                qvy0 parcelableExtra4 = intentA4.getParcelableExtra("push_data");
                int iT3 = parcelableExtra4 != null ? parcelableExtra4.t0() : UUID.randomUUID().hashCode();
                if (parcelableExtra4 != null) {
                    intentA4.addCategory(fwy0.a(appLifecycleServicePendingIntent4, lgo1.s(parcelableExtra4)));
                }
                return ewy0Var.f(iT3, 2, intentA4);
            case 4:
                Intent intentA5 = m961.a(context, "com.spotify.app.music.scopes.utils.action.player.NOTIFICATION_PUSH_ACTIONS");
                intentA5.putExtra("push_data", ((Bundle) obj).getParcelable("push_data"));
                AppLifecycleServicePendingIntent appLifecycleServicePendingIntent5 = AppLifecycleServicePendingIntent.EMAIL_VERIFY;
                qvy0 parcelableExtra5 = intentA5.getParcelableExtra("push_data");
                int iT4 = parcelableExtra5 != null ? parcelableExtra5.t0() : UUID.randomUUID().hashCode();
                if (parcelableExtra5 != null) {
                    intentA5.addCategory(fwy0.a(appLifecycleServicePendingIntent5, lgo1.s(parcelableExtra5)));
                }
                return ewy0Var.f(iT4, 2, intentA5);
            case 5:
                Bundle bundle = (Bundle) obj;
                Intent intentA6 = m961.a(context, "com.spotify.app.music.scopes.utils.action.URL_OPEN");
                Uri uri = (Uri) bundle.getParcelable("com.spotify.music.extra_url");
                if (uri != null) {
                    intentA6.setData(uri);
                }
                intentA6.putExtra("push_data", bundle.getParcelable("push_data"));
                AppLifecycleServicePendingIntent appLifecycleServicePendingIntent6 = AppLifecycleServicePendingIntent.OPEN_PUSH_SETTINGS;
                qvy0 parcelableExtra6 = intentA6.getParcelableExtra("push_data");
                int iT5 = parcelableExtra6 != null ? parcelableExtra6.t0() : UUID.randomUUID().hashCode();
                if (parcelableExtra6 != null) {
                    intentA6.addCategory(fwy0.a(appLifecycleServicePendingIntent6, lgo1.s(parcelableExtra6)));
                }
                return ewy0Var.f(iT5, 2, intentA6);
            case 6:
                Bundle bundle2 = (Bundle) obj;
                Intent intentA7 = m961.a(context, "com.spotify.app.music.scopes.utils.action.URL_OPEN");
                Uri uri2 = (Uri) bundle2.getParcelable("com.spotify.music.extra_url");
                if (uri2 != null) {
                    intentA7.setData(uri2);
                }
                intentA7.putExtra("push_data", bundle2.getParcelable("push_data"));
                AppLifecycleServicePendingIntent appLifecycleServicePendingIntent7 = AppLifecycleServicePendingIntent.OPEN_URL;
                qvy0 parcelableExtra7 = intentA7.getParcelableExtra("push_data");
                int iT6 = parcelableExtra7 != null ? parcelableExtra7.t0() : UUID.randomUUID().hashCode();
                if (parcelableExtra7 != null) {
                    intentA7.addCategory(fwy0.a(appLifecycleServicePendingIntent7, lgo1.s(parcelableExtra7)));
                }
                return ewy0Var.f(iT6, 2, intentA7);
            case 7:
                Bundle bundle3 = (Bundle) obj;
                Intent intentA8 = m961.a(context, "com.spotify.app.music.scopes.utils.action.player.NOTIFICATION_PUSH_ACTIONS");
                Uri uri3 = (Uri) bundle3.getParcelable("com.spotify.music.extra_url");
                if (uri3 != null) {
                    intentA8.setData(uri3);
                }
                intentA8.putExtra("push_data", bundle3.getParcelable("push_data"));
                AppLifecycleServicePendingIntent appLifecycleServicePendingIntent8 = AppLifecycleServicePendingIntent.PLAY_AND_NAVIGATE;
                qvy0 parcelableExtra8 = intentA8.getParcelableExtra("push_data");
                int iT7 = parcelableExtra8 != null ? parcelableExtra8.t0() : UUID.randomUUID().hashCode();
                if (parcelableExtra8 != null) {
                    intentA8.addCategory(fwy0.a(appLifecycleServicePendingIntent8, lgo1.s(parcelableExtra8)));
                }
                return ewy0Var.f(iT7, 2, intentA8);
            case 8:
                Bundle bundle4 = (Bundle) obj;
                Intent intentA9 = m961.a(context, "com.spotify.app.music.scopes.utils.action.player.NOTIFICATION_PUSH_ACTIONS");
                Uri uri4 = (Uri) bundle4.getParcelable("com.spotify.music.extra_url");
                if (uri4 != null) {
                    intentA9.setData(uri4);
                }
                intentA9.putExtra("push_data", bundle4.getParcelable("push_data"));
                AppLifecycleServicePendingIntent appLifecycleServicePendingIntent9 = AppLifecycleServicePendingIntent.SAVE_ENTITY;
                qvy0 parcelableExtra9 = intentA9.getParcelableExtra("push_data");
                int iT8 = parcelableExtra9 != null ? parcelableExtra9.t0() : UUID.randomUUID().hashCode();
                if (parcelableExtra9 != null) {
                    intentA9.addCategory(fwy0.a(appLifecycleServicePendingIntent9, lgo1.s(parcelableExtra9)));
                }
                return ewy0Var.f(iT8, 2, intentA9);
            default:
                Intent intentA10 = m961.a(context, "com.spotify.app.music.scopes.utils.action.player.NOTIFICATION_PUSH_ACTIONS");
                intentA10.putExtra("push_data", ((Bundle) obj).getParcelable("push_data"));
                AppLifecycleServicePendingIntent appLifecycleServicePendingIntent10 = AppLifecycleServicePendingIntent.START_PLAYBACK;
                qvy0 parcelableExtra10 = intentA10.getParcelableExtra("push_data");
                int iT9 = parcelableExtra10 != null ? parcelableExtra10.t0() : UUID.randomUUID().hashCode();
                if (parcelableExtra10 != null) {
                    intentA10.addCategory(fwy0.a(appLifecycleServicePendingIntent10, lgo1.s(parcelableExtra10)));
                }
                return ewy0Var.f(iT9, 2, intentA10);
        }
    }
}
