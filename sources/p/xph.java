package p;

import android.content.Intent;
import android.os.Build;
import android.os.Parcelable;
import com.spotify.podcastinteractivity.commentssheetimpl.page.CommentsSheetPageParameters;
import com.spotify.podcastinteractivity.commentssheetimpl.page.LaunchActionParams;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class xph implements acr0 {
    public final Set a = f46.S0(new blc0[]{blc0.K4, blc0.P4});

    public final Set a() {
        return this.a;
    }

    public final Class b() {
        return vph.class;
    }

    public final Parcelable c(Intent intent, s4b1 s4b1Var, th61 th61Var) {
        String stringExtra = intent.getStringExtra("view_uri");
        String str = stringExtra == null ? "" : stringExtra;
        boolean booleanExtra = intent.getBooleanExtra("disable_input", false);
        Set set = s4b1.f;
        String strZ = uic.p(s4b1Var.h()).z();
        return new CommentsSheetPageParameters(str, strZ == null ? "" : strZ, booleanExtra, intent.getBooleanExtra("show_sensitive", false), Build.VERSION.SDK_INT >= 33 ? (LaunchActionParams) intent.getParcelableExtra("launch_action", LaunchActionParams.class) : intent.getParcelableExtra("launch_action"));
    }

    public final e6w0 d() {
        return new b6w0(true);
    }

    public final String getDescription() {
        return "Bottom sheet displaying comments for podcast episodes";
    }
}
