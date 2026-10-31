package p;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import com.spotify.legacyglue.pasteview.PasteViewLayoutParamHelper;
import java.util.EnumSet;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class om30 implements q570, o570 {
    public final /* synthetic */ byte a;

    public final int a() {
        switch (this.a) {
            case 0:
                return 2131428968;
            case 1:
                return 2131428969;
            case 2:
                return 2131428970;
            default:
                return 2131428971;
        }
    }

    public /* bridge */ /* synthetic */ View b(ViewGroup viewGroup, l670 l670Var) {
        switch (this.a) {
            case 2:
                break;
        }
        return f(viewGroup, l670Var);
    }

    public final EnumSet c() {
        return EnumSet.of(ix40.h);
    }

    public final void d(View view, y570 y570Var, l670 l670Var, yfu yfuVar) {
        Button button = (Button) ((FrameLayout) view).getChildAt(0);
        button.setText(((id70) y570Var.n()).a.a);
        two1.r(l670Var, button, y570Var);
    }

    public final void e(View view, y570 y570Var, int[] iArr) {
        if (ha71.a.length <= 0) {
            return;
        }
        hhg1.h("Component does not support scrolling");
    }

    public FrameLayout f(ViewGroup viewGroup, l670 l670Var) {
        switch (this.a) {
            case 2:
                FrameLayout frameLayoutG = g(viewGroup, l670Var);
                frameLayoutG.setPadding(0, 0, 0, viewGroup.getResources().getDimensionPixelSize(2131167118));
                return frameLayoutG;
            default:
                return g(viewGroup, l670Var);
        }
    }

    public final FrameLayout g(ViewGroup viewGroup, l670 l670Var) {
        Button button;
        Context context = viewGroup.getContext();
        context.getClass();
        switch (this.a) {
            case 0:
                button = (Button) yoi1.w(context, Button.class, 2130970265);
                break;
            case 1:
                button = (Button) yoi1.w(context, Button.class, 2130970267);
                break;
            case 2:
                button = (Button) yoi1.w(context, Button.class, 2130970269);
                break;
            default:
                button = (Button) yoi1.w(context, Button.class, 2130970263);
                break;
        }
        FrameLayout frameLayout = new FrameLayout(context);
        ViewGroup.LayoutParams layoutParamsGenerateMatchParentLayoutParams = PasteViewLayoutParamHelper.generateMatchParentLayoutParams(context, viewGroup);
        if (layoutParamsGenerateMatchParentLayoutParams != null) {
            frameLayout.setLayoutParams(layoutParamsGenerateMatchParentLayoutParams);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 1;
        button.setLayoutParams(layoutParams);
        button.setText("");
        frameLayout.addView(button);
        return frameLayout;
    }
}
