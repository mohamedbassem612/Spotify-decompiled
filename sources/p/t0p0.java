package p;

import android.R;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.spotify.messages.BetamaxPlaybackSession;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lp/t0p0;", "Lp/zf30;", "<init>", "()V", "src_main_java_com_spotify_martini_nowplayingbarimpl-nowplayingbarimpl"}, k = 1, mv = {2, 3, 0}, xi = BetamaxPlaybackSession.CLIENT_METADATA_FIELD_NUMBER)
public final class t0p0 extends zf30 {
    public final void w0(Bundle bundle) {
        super.w0(bundle);
        int i = b6h0.b;
        o0p0 o0p0Var = new o0p0();
        Bundle bundle2 = new Bundle();
        bundle2.putBoolean("embedded_in_bottom_sheet", true);
        bundle2.putInt("background_color_override", i);
        bundle2.putBoolean("hide_add_to_element", false);
        bundle2.putBoolean("navigation_allowed", true);
        bundle2.putBoolean("large_screen_layout_enabled", false);
        bundle2.putBoolean("emits_pane_events", false);
        Bundle bundle3 = ((zf30) o0p0Var).f;
        if (bundle3 != null) {
            bundle3.putAll(bundle2);
            bundle2 = bundle3;
        }
        o0p0Var.T0(bundle2);
        o0p0Var.T1 = b6h0.a;
        th30 th30VarG0 = g0();
        th30VarG0.getClass();
        nu9 nu9Var = new nu9(th30VarG0);
        nu9Var.n(R.id.content, o0p0Var, (String) null);
        nu9Var.h();
    }

    public final View x0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FrameLayout frameLayout = new FrameLayout(P0());
        frameLayout.setId(R.id.content);
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        return frameLayout;
    }
}
