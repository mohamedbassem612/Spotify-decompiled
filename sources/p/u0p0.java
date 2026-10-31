package p;

import android.R;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lp/u0p0;", "Lp/zf30;", "<init>", "()V", "src_main_java_com_spotify_endless_sillywalk_page-page"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class u0p0 extends zf30 {
    public final void I0(View view, Bundle bundle) {
        Bundle bundle2;
        if (bundle == null && (bundle2 = ((zf30) this).f) != null) {
            o0p0 o0p0Var = new o0p0();
            Bundle bundle3 = new Bundle();
            bundle3.putAll(bundle2);
            o0p0Var.T0(bundle3);
            th30 th30VarG0 = g0();
            th30VarG0.getClass();
            nu9 nu9Var = new nu9(th30VarG0);
            nu9Var.n(R.id.content, o0p0Var, (String) null);
            nu9Var.f();
        }
    }

    public final View x0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FrameLayout frameLayout = new FrameLayout(P0());
        frameLayout.setId(R.id.content);
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        return frameLayout;
    }
}
