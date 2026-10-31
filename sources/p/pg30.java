package p;

import android.content.Context;
import androidx.fragment.app.FragmentContainerView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class pg30 implements iu30 {
    public final int a;
    public FragmentContainerView b;

    public pg30(int i) {
        this.a = i;
    }

    public final FragmentContainerView a() {
        FragmentContainerView fragmentContainerView = this.b;
        if (fragmentContainerView != null) {
            return fragmentContainerView;
        }
        bhn0.f(gvg.e(this.a, "AndroidView has not created a container for ", " yet"));
        return null;
    }

    public final Object invoke(Object obj) {
        FragmentContainerView fragmentContainerView = new FragmentContainerView((Context) obj);
        fragmentContainerView.setId(this.a);
        this.b = fragmentContainerView;
        return fragmentContainerView;
    }
}
