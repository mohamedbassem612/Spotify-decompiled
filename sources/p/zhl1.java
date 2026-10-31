package p;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.webkit.WebView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class zhl1 extends WebView {
    public final /* synthetic */ byte a = 0;

    public /* synthetic */ zhl1(Context context) {
        super(context);
    }

    @Override // android.webkit.WebView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 1:
                super.onTouchEvent(motionEvent);
                return false;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public void onWindowFocusChanged(boolean z) {
        switch (this.a) {
            case 0:
                try {
                    super.onWindowFocusChanged(z);
                } catch (NullPointerException unused) {
                    return;
                }
                break;
            default:
                super.onWindowFocusChanged(z);
                break;
        }
    }

    @Override // android.view.View
    public boolean performClick() {
        switch (this.a) {
            case 1:
                super.performClick();
                return false;
            default:
                return super.performClick();
        }
    }

    public /* synthetic */ zhl1(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
