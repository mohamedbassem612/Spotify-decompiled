package p;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.spotify.musicappplatform.state.processor.AppLifecycleServicePendingIntent;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class u0u0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ s880 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u0u0(s880 s880Var, byte b) {
        super(0);
        this.a = b;
        this.b = s880Var;
    }

    public final Object invoke() {
        byte b = this.a;
        s880 s880Var = this.b;
        switch (b) {
            case 0:
                return ((zo5) s880Var.f).a(AppLifecycleServicePendingIntent.PLAYBACK_NOTIFICATION_CLOSE, new Bundle());
            case 1:
                ys80 ys80Var = (xs80) s880Var.d;
                Context context = (Context) s880Var.b;
                Intent intentA = ys80Var.a(context);
                intentA.setAction("com.spotify.mobile.android.ui.action.player.SHOW");
                intentA.setFlags(805306368);
                return PendingIntent.getActivity(context, 0, intentA, 201326592);
            default:
                return (PendingIntent) ((xs80) s880Var.d).d.getValue();
        }
    }
}
