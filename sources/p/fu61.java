package p;

import android.app.PendingIntent;
import android.content.Context;
import com.spotify.settings.settings.SettingsDelegate;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class fu61 implements SettingsDelegate {
    public final Context a;
    public final xs80 b;
    public final fqw0 c;

    public fu61(Context context, xs80 xs80Var, fqw0 fqw0Var) {
        this.a = context;
        this.b = xs80Var;
        this.c = fqw0Var;
    }

    public final void onIncognitoModeDisabledByTimer() {
        pbk1 pbk1Var = this.b.b;
        String str = nik1.W0.a;
        Context context = this.a;
        i2i1 i2i1VarA = pbk1Var.a(context, str);
        i2i1VarA.e();
        this.c.a(PendingIntent.getActivity(context, 0, i2i1VarA.b(), 67108864));
    }
}
