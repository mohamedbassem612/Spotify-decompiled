package p;

import android.content.Context;
import android.view.View;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import com.google.android.gms.maps.GoogleMapOptions;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class y1g0 extends FrameLayout {
    public final /* synthetic */ byte a = 1;
    public final Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y1g0(Context context, iu30 iu30Var) {
        super(context);
        this.b = iu30Var;
        setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
    }

    @Override // android.view.ViewGroup, android.view.View
    public WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        hsl1 hsl1Var;
        switch (this.a) {
            case 0:
                iu30 iu30Var = (iu30) this.b;
                WindowInsets windowInsetsF = null;
                if (iu30Var != null && (hsl1Var = (hsl1) iu30Var.invoke(hsl1.g((View) null, windowInsets))) != null) {
                    windowInsetsF = hsl1Var.f();
                }
                if (windowInsetsF != null) {
                    windowInsets = windowInsetsF;
                }
                return super.dispatchApplyWindowInsets(windowInsets);
            default:
                return super.dispatchApplyWindowInsets(windowInsets);
        }
    }

    public y1g0(Context context, GoogleMapOptions googleMapOptions) {
        super(context);
        this.b = new kz50(this, context, googleMapOptions);
        setClickable(true);
    }
}
