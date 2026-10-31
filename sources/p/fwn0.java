package p;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.spotify.player.model.ContextTrack$Metadata;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class fwn0 {
    public final String a;
    public final Context b;

    public fwn0(Context context, String str) {
        this.a = str;
        this.b = context.getApplicationContext();
    }

    public final Intent a(dwn0 dwn0Var) {
        awn0 awn0Var = dwn0Var.j;
        String str = dwn0Var.b;
        String str2 = dwn0Var.a;
        if (str2 == null) {
            hhg1.n("Required value was null.");
            return null;
        }
        Uri uriBuild = Uri.parse(str2);
        uriBuild.getClass();
        if (("open.spotify.com".equals(uriBuild.getHost()) || "play.spotify.com".equals(uriBuild.getHost())) && uriBuild.getQueryParameter("nd") == null) {
            uriBuild = uriBuild.buildUpon().appendQueryParameter("nd", "1").build();
        }
        Intent intent = new Intent("android.intent.action.VIEW", uriBuild);
        Set set = s4b1.f;
        if (uic.x(str2).c != blc0.o6) {
            intent.setFlags(67108864);
            intent.setClassName(this.b, this.a);
        }
        if (str.length() > 0) {
            intent.putExtra(ContextTrack$Metadata.KEY_TITLE, str);
        }
        if (dwn0Var.c) {
            intent.putExtra("extra_clear_backstack", true);
        }
        if (dwn0Var.d) {
            intent.putExtra("extra_crossfade", true);
        }
        int i = dwn0Var.e;
        if (i != 0) {
            intent.putExtra("extra_animation_in", i);
        }
        int i2 = dwn0Var.f;
        if (i2 != 0) {
            intent.putExtra("extra_animation_out", i2);
        }
        if (dwn0Var.g) {
            intent.putExtra("extra_pop_current_fragment", true);
        }
        if (awn0Var != null) {
            if (awn0Var instanceof bwn0) {
                gg.I(intent, ((bwn0) awn0Var).a);
            } else if (awn0Var instanceof awn0) {
                gg.H(intent, awn0Var.a);
            } else if (awn0Var.equals(zvn0.a)) {
                gg.J(intent, hsn0.a);
            } else if (!awn0Var.equals(yvn0.a)) {
                if (!(awn0Var instanceof xvn0)) {
                    eg.o();
                    return null;
                }
                gg.J(intent, new dsn0(((xvn0) awn0Var).a));
            }
        }
        Bundle bundle = dwn0Var.i;
        if (bundle != null) {
            intent.putExtra("fragment_arguments", bundle);
        }
        a690 a690Var = dwn0Var.h;
        if (a690Var != null) {
            ywo1.r(intent, a690Var);
        }
        return intent;
    }
}
