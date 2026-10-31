package p;

import android.app.Activity;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class f5d extends FrameLayout {
    public final gmw0 a;

    public f5d(Activity activity) {
        super(activity);
        gmw0 gmw0Var = new gmw0(activity);
        this.a = gmw0Var;
        gmw0Var.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        gmw0Var.setScaleType(emw0.FILL_CENTER);
        addView(gmw0Var);
    }

    public haw0 getSurfaceProvider() {
        return this.a.getSurfaceProvider();
    }
}
