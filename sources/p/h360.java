package p;

import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.spotify.encoreconsumermobile.elements.backbutton.BackButtonView;
import com.spotify.encoreconsumermobile.elements.playbutton.PlayButtonView;
import com.spotify.encoreconsumermobile.layout.headers.BehaviorRetainingAppBarLayout;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public abstract class h360 {
    public static final void a(h72 h72Var, View view, View view2) {
        Toolbar toolbar = (Toolbar) h72Var.X;
        BehaviorRetainingAppBarLayout behaviorRetainingAppBarLayout = (BehaviorRetainingAppBarLayout) h72Var.b;
        if (!behaviorRetainingAppBarLayout.isLaidOut() || behaviorRetainingAppBarLayout.isLayoutRequested()) {
            behaviorRetainingAppBarLayout.addOnLayoutChangeListener(new qo9(view, view2, h72Var, (byte) 5));
            return;
        }
        float height = view.getHeight();
        double y = (((double) ((view2.getY() - toolbar.getHeight()) / height)) + 0.1d) * 255.0d;
        double y2 = (((double) (view2.getY() / height)) + 0.1d) * 255.0d;
        int iArgb = Color.argb((int) y, 46, 46, 46);
        int iArgb2 = Color.argb((int) y2, 30, 30, 30);
        Drawable background = toolbar.getBackground();
        if ((background instanceof GradientDrawable ? (GradientDrawable) background : null) == null) {
            toolbar.setBackground(new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{iArgb2, iArgb}));
        } else {
            ((GradientDrawable) toolbar.getBackground()).setColors(new int[]{iArgb2, iArgb});
        }
    }

    public static final void b(h72 h72Var, int i) {
        int totalScrollRange = ((BehaviorRetainingAppBarLayout) h72Var.d).getTotalScrollRange();
        if (totalScrollRange == 0) {
            return;
        }
        ((View) h72Var.f).getBackground().setAlpha(jch0.U(((i + totalScrollRange) / totalScrollRange) * 255.0f));
    }

    public static final void c(h72 h72Var, float f, int i, ViewGroup viewGroup) {
        BehaviorRetainingAppBarLayout behaviorRetainingAppBarLayout = (BehaviorRetainingAppBarLayout) h72Var.d;
        if (behaviorRetainingAppBarLayout.getTotalScrollRange() == 0) {
            return;
        }
        float totalScrollRange = (i / behaviorRetainingAppBarLayout.getTotalScrollRange()) * f * (((BehaviorRetainingAppBarLayout) h72Var.b).getLayoutDirection() == 1 ? -1 : 1);
        ((View) h72Var.f).setTranslationX(totalScrollRange);
        ((BackButtonView) h72Var.e).setTranslationX(totalScrollRange);
        if (viewGroup != null) {
            viewGroup.setTranslationX(-totalScrollRange);
        }
    }

    public static final void d(h72 h72Var, int i) {
        int dimensionPixelSize = ((BehaviorRetainingAppBarLayout) h72Var.b).getContext().getResources().getDimensionPixelSize(2131165727);
        Toolbar toolbar = (Toolbar) h72Var.X;
        int iF = l1d.f(toolbar.getLayoutParams().height, dimensionPixelSize, 2, i);
        toolbar.getLayoutParams().height += i;
        toolbar.setPadding(toolbar.getPaddingLeft(), i, toolbar.getPaddingRight(), toolbar.getPaddingBottom());
        ((ViewGroup.MarginLayoutParams) ((BackButtonView) h72Var.e).getLayoutParams()).topMargin = iF;
        ((ViewGroup.MarginLayoutParams) ((View) h72Var.f).getLayoutParams()).topMargin = iF;
        ((ViewGroup.MarginLayoutParams) ((ViewStub) h72Var.c).getLayoutParams()).topMargin = iF;
    }

    public static final void e(h72 h72Var) {
        int dimensionPixelSize = ((BehaviorRetainingAppBarLayout) h72Var.b).getResources().getDimensionPixelSize(2131167139);
        View view = (View) h72Var.f;
        view.setBackgroundResource(2131230979);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        marginLayoutParams.leftMargin = dimensionPixelSize;
        marginLayoutParams.setMarginStart(dimensionPixelSize);
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) ((BackButtonView) h72Var.e).getLayoutParams();
        marginLayoutParams2.leftMargin = dimensionPixelSize;
        marginLayoutParams2.setMarginStart(dimensionPixelSize);
        ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) ((ViewStub) h72Var.c).getLayoutParams();
        marginLayoutParams3.rightMargin = dimensionPixelSize;
        marginLayoutParams3.setMarginEnd(dimensionPixelSize);
    }

    public static final View f(h72 h72Var, int i) {
        ViewStub viewStub = (ViewStub) h72Var.h;
        viewStub.setLayoutResource(i);
        return viewStub.inflate();
    }

    public static final PlayButtonView g(h72 h72Var) {
        BehaviorRetainingAppBarLayout behaviorRetainingAppBarLayout = (BehaviorRetainingAppBarLayout) h72Var.b;
        int dimensionPixelSize = behaviorRetainingAppBarLayout.getResources().getDimensionPixelSize(2131166137);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) ((TextView) h72Var.Y).getLayoutParams();
        marginLayoutParams.rightMargin += dimensionPixelSize;
        marginLayoutParams.setMarginEnd(marginLayoutParams.getMarginEnd() + dimensionPixelSize);
        Object objInflate = LayoutInflater.from(behaviorRetainingAppBarLayout.getContext()).inflate(2131625397, (ViewGroup) new CoordinatorLayout(behaviorRetainingAppBarLayout.getContext()), false);
        if (objInflate == null) {
            bhn0.i("rootView");
            return null;
        }
        PlayButtonView playButtonView = (PlayButtonView) objInflate;
        behaviorRetainingAppBarLayout.addOnAttachStateChangeListener(new y22(playButtonView, (byte) 13));
        return playButtonView;
    }

    public static final void h(h72 h72Var) {
        BehaviorRetainingAppBarLayout behaviorRetainingAppBarLayout = (BehaviorRetainingAppBarLayout) h72Var.b;
        behaviorRetainingAppBarLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        j(h72Var, behaviorRetainingAppBarLayout.getContext().getColor(2131101370));
    }

    public static final void i(h72 h72Var, iu30 iu30Var) {
        CollapsingToolbarLayout collapsingToolbarLayout = (CollapsingToolbarLayout) h72Var.g;
        WeakHashMap weakHashMap = b8k1.a;
        r7k1.c(collapsingToolbarLayout, (k1q0) null);
        r7k1.c((BehaviorRetainingAppBarLayout) h72Var.b, new ro30(h72Var, iu30Var, (byte) 13));
    }

    public static final void j(h72 h72Var, int i) {
        BehaviorRetainingAppBarLayout behaviorRetainingAppBarLayout = (BehaviorRetainingAppBarLayout) h72Var.b;
        behaviorRetainingAppBarLayout.setBackgroundColor(i);
        if (!behaviorRetainingAppBarLayout.isLaidOut() || behaviorRetainingAppBarLayout.isLayoutRequested()) {
            behaviorRetainingAppBarLayout.addOnLayoutChangeListener(new g360(h72Var, i, (byte) 0));
            return;
        }
        Drawable background = ((Toolbar) h72Var.X).getBackground();
        if (background != null) {
            background.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.DST_OVER));
        }
    }

    public static final void k(h72 h72Var) {
        int dimensionPixelSize = ((BehaviorRetainingAppBarLayout) h72Var.b).getContext().getResources().getDimensionPixelSize(2131165344);
        tlv tlvVar = (BackButtonView) h72Var.e;
        ((ViewGroup.MarginLayoutParams) tlvVar.getLayoutParams()).leftMargin = dimensionPixelSize;
        ((ViewGroup.MarginLayoutParams) tlvVar.getLayoutParams()).setMarginStart(dimensionPixelSize);
    }

    public static final void l(h72 h72Var, int i, View view) {
        BehaviorRetainingAppBarLayout behaviorRetainingAppBarLayout = (BehaviorRetainingAppBarLayout) h72Var.b;
        float y = view.getY();
        Toolbar toolbar = (Toolbar) h72Var.X;
        if (y > toolbar.getHeight()) {
            float dimensionPixelSize = behaviorRetainingAppBarLayout.getContext().getResources().getDimensionPixelSize(2131167142);
            float f = -i;
            toolbar.setAlpha(yoi1.o(f - ((view.getY() - toolbar.getHeight()) - dimensionPixelSize), 0.0f, dimensionPixelSize) / dimensionPixelSize);
            float fMin = Math.min(toolbar.getHeight(), (behaviorRetainingAppBarLayout.getHeight() - view.getY()) - dimensionPixelSize);
            ((TextView) h72Var.Y).setAlpha(yoi1.o(f - ((view.getY() - toolbar.getHeight()) + dimensionPixelSize), 0.0f, Math.max(0.0f, fMin)) / fMin);
        }
    }
}
