package p;

import android.graphics.drawable.GradientDrawable;
import android.text.Layout;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.media3.ui.AspectRatioFrameLayout;
import com.spotify.login.loginflowimpl.DelegatingLoginActivity;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class c57 implements Runnable {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ c57(Object obj, boolean z, byte b) {
        this.a = b;
        this.c = obj;
        this.b = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        Object obj = this.c;
        switch (b) {
            case 0:
                this.b = false;
                break;
            case 1:
                if (!this.b) {
                    ((sjd) obj).f1.setVisibility(8);
                }
                break;
            case 2:
                if (!this.b) {
                    ((vkd) obj).k1.setVisibility(8);
                }
                break;
            case 3:
                uw0 uw0Var = ((lxr) obj).g;
                Layout layout = ((TextView) uw0Var.g).getLayout();
                boolean z = layout.getLineCount() > 0 && layout.getEllipsisCount(layout.getLineCount() - 1) > 0;
                if (this.b || z) {
                    if (((View) uw0Var.i).getBackground() == null) {
                        GradientDrawable gradientDrawable = new GradientDrawable();
                        gradientDrawable.setOrientation(((TextView) uw0Var.g).getLayoutDirection() == 1 ? GradientDrawable.Orientation.RIGHT_LEFT : GradientDrawable.Orientation.LEFT_RIGHT);
                        gradientDrawable.setShape(0);
                        gradientDrawable.setColors(new int[]{0, xfo1.r((ConstraintLayout) uw0Var.d, 2130968768)});
                        ((View) uw0Var.i).setBackground(gradientDrawable);
                    }
                    ((TextView) uw0Var.h).setVisibility(0);
                    ((View) uw0Var.i).setVisibility(0);
                } else {
                    ((TextView) uw0Var.h).setVisibility(8);
                    ((View) uw0Var.i).setVisibility(8);
                }
                break;
            case 4:
                DelegatingLoginActivity delegatingLoginActivity = (DelegatingLoginActivity) obj;
                delegatingLoginActivity.setResult(this.b ? -1 : 0);
                delegatingLoginActivity.finish();
                break;
            default:
                ujo1.q(((ux20) obj).c, true, this.b);
                break;
        }
    }

    public /* synthetic */ c57(boolean z, e711 e711Var, byte b) {
        this.a = b;
        this.b = z;
        this.c = e711Var;
    }

    public c57(AspectRatioFrameLayout aspectRatioFrameLayout) {
        this.a = (byte) 0;
        this.c = aspectRatioFrameLayout;
    }
}
