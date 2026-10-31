package p;

import android.os.Handler;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.PopupWindow;
import com.spotify.adsdisplay.uiusecases.videocontrolsoverlay.VideoControlsOverlayView;
import com.spotify.legacyglue.widgetstate.StateListAnimatorImageButton;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class lgs implements View.OnTouchListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ lgs(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ngs ngsVar = (ngs) obj;
                PopupWindow popupWindow = ngsVar.b;
                if (motionEvent.getAction() != 4 && !ngsVar.b(motionEvent)) {
                    if (motionEvent.getAction() == 1 && !ngsVar.b(motionEvent)) {
                        popupWindow.getContentView().performClick();
                    }
                    return false;
                }
                lus lusVar = ngsVar.g;
                if (lusVar != null) {
                    lusVar.invoke();
                }
                popupWindow.dismiss();
                return true;
            case 1:
                Button button = (Button) obj;
                int action = motionEvent.getAction();
                if (action == 0) {
                    button.setAlpha(0.7f);
                } else if (action == 1 || action == 3 || action == 4) {
                    button.setAlpha(1.0f);
                }
                return false;
            case 2:
                if (motionEvent.getAction() == 0) {
                    ((fws) obj).e.invoke(fzf1.b);
                }
                return true;
            case 3:
                ((PopupWindow) ((uo5) obj).c).dismiss();
                return true;
            case 4:
                bz60 bz60Var = (bz60) obj;
                if (motionEvent.getAction() == 0) {
                    bz60Var.b = true;
                    bz60Var.e = Float.valueOf(motionEvent.getX());
                    bz60Var.f = Float.valueOf(motionEvent.getY());
                }
                return false;
            case 5:
                y0d0 y0d0Var = (y0d0) obj;
                w0d0 w0d0Var = y0d0Var.Q0;
                Handler handler = y0d0Var.U0;
                ik5 ik5Var = y0d0Var.Y0;
                int action2 = motionEvent.getAction();
                int x = (int) motionEvent.getX();
                int y = (int) motionEvent.getY();
                if (action2 == 0 && ik5Var != null && ik5Var.isShowing() && x >= 0 && x < ik5Var.getWidth() && y >= 0 && y < ik5Var.getHeight()) {
                    handler.postDelayed(w0d0Var, 250L);
                } else if (action2 == 1) {
                    handler.removeCallbacks(w0d0Var);
                }
                return false;
            case 6:
                if (((Checkable) view).isChecked()) {
                    return ((GestureDetector) obj).onTouchEvent(motionEvent);
                }
                return false;
            default:
                int id = view.getId();
                VideoControlsOverlayView videoControlsOverlayView = (VideoControlsOverlayView) obj;
                Handler handler2 = videoControlsOverlayView.a;
                seg1 seg1Var = videoControlsOverlayView.e;
                dlg1 dlg1Var = videoControlsOverlayView.g;
                if (id != ((VideoControlsOverlayView) dlg1Var.a).getId()) {
                    if (id != ((StateListAnimatorImageButton) dlg1Var.b).getId()) {
                        return true;
                    }
                    motionEvent.getClass();
                    if (motionEvent.getAction() == 1) {
                        handler2.removeCallbacks(seg1Var);
                        if (videoControlsOverlayView.c) {
                            videoControlsOverlayView.a();
                        } else {
                            videoControlsOverlayView.b = false;
                            int i = 0;
                            while (true) {
                                if (i < videoControlsOverlayView.getChildCount()) {
                                    int i2 = i + 1;
                                    View childAt = videoControlsOverlayView.getChildAt(i);
                                    if (childAt != null) {
                                        xap1.s(childAt);
                                        i = i2;
                                    } else {
                                        tw20.p();
                                    }
                                }
                            }
                        }
                        videoControlsOverlayView.d.invoke(hjj1.a);
                    }
                    view.performClick();
                    return true;
                }
                motionEvent.getClass();
                if (motionEvent.getAction() != 1) {
                    return true;
                }
                handler2.removeCallbacks(seg1Var);
                handler2.postDelayed(seg1Var, 2000L);
                if (!videoControlsOverlayView.b) {
                    return true;
                }
                videoControlsOverlayView.b = false;
                int i3 = 0;
                while (true) {
                    if (!(i3 < videoControlsOverlayView.getChildCount())) {
                        Function0 function0 = videoControlsOverlayView.f;
                        if (function0 != null) {
                            function0.invoke();
                        }
                        view.performClick();
                        return true;
                    }
                    int i4 = i3 + 1;
                    View childAt2 = videoControlsOverlayView.getChildAt(i3);
                    if (childAt2 != null) {
                        xap1.s(childAt2);
                        i3 = i4;
                    } else {
                        tw20.p();
                    }
                }
                return false;
        }
    }
}
