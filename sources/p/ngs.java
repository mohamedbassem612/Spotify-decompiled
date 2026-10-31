package p;

import android.app.Activity;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import com.spotify.messaging.tooltipsimpl.TooltipContentView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ngs {
    public final Activity a;
    public final PopupWindow b;
    public final int c;
    public final View d;
    public m3n e;
    public final eg7 f;
    public lus g;

    public ngs(int i, Activity activity) {
        this.a = activity;
        PopupWindow popupWindow = new PopupWindow(activity);
        this.b = popupWindow;
        this.f = new eg7(this, (byte) 9);
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(activity);
        popupWindow.setBackgroundDrawable(new ColorDrawable(0));
        popupWindow.setContentView(layoutInflaterFrom.inflate(2131625336, (ViewGroup) null));
        popupWindow.setAnimationStyle(i);
        if (Build.VERSION.SDK_INT >= 29) {
            popupWindow.setIsClippedToScreen(true);
        }
        this.c = activity.getResources().getDisplayMetrics().widthPixels - (activity.getResources().getDimensionPixelSize(2131167068) * 4);
        this.d = popupWindow.getContentView().findViewById(2131430200);
    }

    public final TooltipContentView a() {
        return this.b.getContentView().findViewById(2131430201);
    }

    public final boolean b(MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0) {
            return false;
        }
        float x = motionEvent.getX();
        PopupWindow popupWindow = this.b;
        return x < popupWindow.getContentView().getX() || motionEvent.getX() > popupWindow.getContentView().getX() + ((float) popupWindow.getContentView().getWidth()) || motionEvent.getY() < popupWindow.getContentView().getY() || motionEvent.getY() > popupWindow.getContentView().getY() + ((float) popupWindow.getContentView().getHeight());
    }
}
