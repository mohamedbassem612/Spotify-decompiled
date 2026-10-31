package p;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import com.spotify.messaging.messagingplatformimpl.slate.SlateView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ttd extends GestureDetector.SimpleOnGestureListener implements View.OnTouchListener {
    public final View a;
    public final SlateView b;
    public final mev c;
    public final float d;
    public float e;
    public float f;
    public float g;
    public float h;
    public int i;
    public boolean t = true;
    public final d20 X = new d20(this, (byte) 1);

    public ttd(View view, SlateView slateView) {
        this.a = view;
        this.b = slateView;
        this.c = new mev(view.getContext(), this);
        this.d = view.getContext().getResources().getDisplayMetrics().widthPixels / 3.0f;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (motionEvent == null) {
            return false;
        }
        float rawX = motionEvent2.getRawX() - motionEvent.getRawX();
        float rawY = motionEvent2.getRawY() - motionEvent.getRawY();
        this.i = rawX < 0.0f ? 1 : 2;
        float fAbs = Math.abs(f);
        float fAbs2 = Math.abs(f2);
        if (fAbs < fAbs2) {
            fAbs = fAbs2;
        }
        float fAbs3 = Math.abs(rawX);
        float fAbs4 = Math.abs(rawY);
        if (fAbs3 < fAbs4) {
            fAbs3 = fAbs4;
        }
        if (fAbs < 400.0f || fAbs3 < 200.0f || !this.t) {
            return false;
        }
        View view = this.a;
        view.animate().translationX(((Math.abs(f) * rawX) / 100.0f) + view.getTranslationX()).translationY(((Math.abs(f2) * rawY) / 100.0f) + view.getTranslationY()).setDuration(300L).setListener(this.X).start();
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        this.b.d();
        return true;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (!((GestureDetector) this.c.b).onTouchEvent(motionEvent)) {
            int action = motionEvent.getAction();
            SlateView slateView = this.b;
            if (action == 0) {
                slateView.b();
                this.e = motionEvent.getRawX();
                this.f = motionEvent.getRawY();
                return true;
            }
            float f = this.d;
            View view2 = this.a;
            if (action == 1) {
                slateView.a();
                float f2 = this.g;
                float f3 = this.h;
                if (Math.sqrt((f3 * f3) + (f2 * f2)) <= f || !this.t) {
                    view2.animate().setInterpolator(new OvershootInterpolator()).translationX(0.0f).translationY(0.0f).rotation(0.0f).setDuration(300L).start();
                } else if (this.g < 0.0f) {
                    slateView.e(1);
                } else {
                    slateView.e(2);
                }
                this.g = 0.0f;
                this.h = 0.0f;
                return true;
            }
            if (action != 2) {
                return false;
            }
            this.g = motionEvent.getRawX() - this.e;
            this.h = motionEvent.getRawY() - this.f;
            view2.setTranslationX(this.g);
            view2.setTranslationY(this.h);
            view2.setRotation(this.g / 30.0f);
            float f4 = this.g;
            float f5 = this.h;
            double dSqrt = Math.sqrt((f5 * f5) + (f4 * f4));
            if (dSqrt < f) {
                slateView.c(dSqrt, f, this.g < 0.0f ? 1 : 2);
            }
        }
        return true;
    }
}
