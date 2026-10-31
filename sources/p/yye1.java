package p;

import android.animation.AnimatorSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class yye1 {
    public final View a;
    public final TextView b;
    public final TextView c;
    public final Button d;
    public final ViewGroup.MarginLayoutParams e;
    public final int f;
    public AnimatorSet g;

    public yye1(View view, gl61 gl61Var) {
        this.a = view;
        this.b = (TextView) view.findViewById(2131431394);
        this.c = (TextView) view.findViewById(2131431393);
        Button button = (Button) view.findViewById(2131431391);
        this.d = button;
        button.setOnClickListener(gl61Var);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        this.e = marginLayoutParams;
        this.f = marginLayoutParams.bottomMargin;
        rwq0.s(view, new gjm(this, view, (byte) 4));
        w7d1 w7d1Var = new w7d1(this, (byte) 8);
        if (!view.isLaidOut() || view.isLayoutRequested()) {
            view.addOnLayoutChangeListener(new eg7(w7d1Var, (byte) 28));
        } else {
            w7d1Var.invoke(view);
        }
    }
}
