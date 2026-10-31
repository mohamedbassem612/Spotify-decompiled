package p;

import android.content.Context;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class v4c0 {
    public static final int c = View.MeasureSpec.makeMeasureSpec(0, 0);
    public final ConstraintLayout a;
    public final w4c0 b;

    public v4c0(Context context) {
        ConstraintLayout constraintLayout = new ConstraintLayout(context);
        this.a = constraintLayout;
        this.b = new w4c0(constraintLayout);
    }
}
