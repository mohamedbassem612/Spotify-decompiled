package p;

import android.view.View;
import android.view.WindowInsets;
import com.spotify.puffin.setup.setupflow.manualselect.ui.ManualSelectView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class mkg0 implements View.OnApplyWindowInsetsListener {
    public final /* synthetic */ ManualSelectView a;

    public mkg0(ManualSelectView manualSelectView) {
        this.a = manualSelectView;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        int i = hsl1.g((View) null, windowInsets).a.i(527).d;
        kil kilVar = new kil();
        ManualSelectView manualSelectView = this.a;
        kilVar.f(manualSelectView);
        kilVar.h(2131428472, 4, 0, 4, i);
        kilVar.h(2131427891, 4, 0, 4, i);
        kilVar.b(manualSelectView);
        return windowInsets;
    }
}
