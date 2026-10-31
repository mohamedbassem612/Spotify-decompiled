package p;

import android.R;
import android.animation.StateListAnimator;
import android.view.View;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class v9w0 {
    public static final int[] f = {R.attr.state_pressed};
    public static final int[] g = new int[0];
    public final float a;
    public final View b;
    public final ArrayList c = z1p1.z();
    public final ArrayList d = z1p1.z();
    public boolean e = true;

    public v9w0(View view, float f2) {
        this.b = view;
        this.a = f2;
    }

    public final void a() {
        mnm0 mnm0VarN = hqn1.n(new fr11(this));
        mnm0 mnm0VarN2 = hqn1.n(new u9w0(this));
        StateListAnimator stateListAnimator = new StateListAnimator();
        stateListAnimator.addState(f, mnm0VarN2);
        stateListAnimator.addState(g, mnm0VarN);
        this.b.setStateListAnimator(stateListAnimator);
    }
}
