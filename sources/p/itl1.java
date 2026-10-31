package p;

import android.app.Activity;
import android.content.res.Configuration;
import android.view.View;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class itl1 extends View {
    public final /* synthetic */ Activity a;
    public final /* synthetic */ jtl1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public itl1(Activity activity, jtl1 jtl1Var) {
        super(activity);
        this.a = activity;
        this.b = jtl1Var;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.b.a(this.a);
    }
}
