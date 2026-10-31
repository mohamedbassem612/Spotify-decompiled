package p;

import android.view.View;
import android.view.Window;
import android.view.WindowManager;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ep41 extends View {
    public Window a;
    public dp41 b;

    private float getBrightness() {
        Window window = this.a;
        if (window != null) {
            return window.getAttributes().screenBrightness;
        }
        j2h1.p("ScreenFlashView");
        return Float.NaN;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBrightness(float f) {
        if (this.a == null) {
            j2h1.p("ScreenFlashView");
            return;
        }
        if (Float.isNaN(f)) {
            j2h1.p("ScreenFlashView");
            return;
        }
        WindowManager.LayoutParams attributes = this.a.getAttributes();
        attributes.screenBrightness = f;
        this.a.setAttributes(attributes);
        j2h1.o("ScreenFlashView");
    }

    private void setScreenFlashUiInfo(nr70 nr70Var) {
        j2h1.o("ScreenFlashView");
    }

    public nr70 getScreenFlash() {
        return this.b;
    }

    public long getVisibilityRampUpAnimationDurationMillis() {
        return 1000L;
    }

    public void setController(d3d d3dVar) {
        w8p1.m();
    }

    public void setScreenFlashWindow(Window window) {
        w8p1.m();
        if (this.a != window) {
            this.b = window == null ? null : new dp41(this);
        }
        this.a = window;
        setScreenFlashUiInfo(getScreenFlash());
    }
}
