package p;

import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import com.spotify.encoremobile.buttons.SecondaryButtonView;
import com.spotify.legacyglue.widgetstate.StateListAnimatorButton;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class vn1 implements o570 {
    public final wn1 a;

    public vn1(wn1 wn1Var) {
        this.a = wn1Var;
    }

    public final int a() {
        return 2131428625;
    }

    public final View b(ViewGroup viewGroup, l670 l670Var) {
        StateListAnimatorButton secondaryButtonView = new SecondaryButtonView(viewGroup.getContext(), null, 0, 2132017154, 6, null);
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        frameLayout.setPadding(0, viewGroup.getResources().getDimensionPixelSize(2131167068), 0, 0);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 1;
        frameLayout.addView((View) secondaryButtonView, (ViewGroup.LayoutParams) layoutParams);
        return frameLayout;
    }

    public final void d(View view, y570 y570Var, l670 l670Var, yfu yfuVar) {
        Button button = (Button) ((FrameLayout) view).getChildAt(0);
        button.setText(y570Var.n().a.a);
        button.setOnClickListener(new cg1(this, y570Var, (byte) 2));
    }

    public final void e(View view, y570 y570Var, int... iArr) {
    }
}
