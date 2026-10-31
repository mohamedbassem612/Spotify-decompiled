package p;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.OvershootInterpolator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class rvq0 extends GestureDetector.SimpleOnGestureListener implements View.OnTouchListener {
    public final View a;
    public final qvq0 b;
    public final mev c;
    public final float d;
    public float e;
    public float f;
    public float g;
    public float h;
    public final d20 i = new d20(this, (byte) 10);

    public rvq0(View view, qvq0 qvq0Var) {
        this.a = view;
        this.b = qvq0Var;
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
        float fMax = Math.max(Math.abs(f), Math.abs(f2));
        float fMax2 = Math.max(Math.abs(rawX), Math.abs(rawY));
        if (fMax < 400.0f || fMax2 < 200.0f) {
            return false;
        }
        View view = this.a;
        float fAbs = ((Math.abs(f) * rawX) / 100.0f) + view.getTranslationX();
        view.animate().translationX(fAbs).translationY(((Math.abs(f2) * rawY) / 100.0f) + view.getTranslationY()).setDuration(300L).setListener(this.i).start();
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        this.b.f(new int[]{(int) motionEvent.getX(), (int) motionEvent.getY()});
        return true;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (((GestureDetector) this.c.b).onTouchEvent(motionEvent)) {
            return true;
        }
        int action = motionEvent.getAction();
        qvq0 qvq0Var = this.b;
        if (action == 0) {
            qvq0Var.b();
            this.e = motionEvent.getRawX();
            this.f = motionEvent.getRawY();
            return true;
        }
        View view2 = this.a;
        if (action != 1) {
            if (action != 2) {
                return false;
            }
            this.g = motionEvent.getRawX() - this.e;
            this.h = motionEvent.getRawY() - this.f;
            view2.setTranslationX(this.g);
            view2.setTranslationY(this.h);
            view2.setRotation(this.g / 30.0f);
            return true;
        }
        qvq0Var.a();
        float f = this.g;
        float f2 = this.h;
        if (((float) Math.sqrt((f2 * f2) + (f * f))) > this.d) {
            qvq0Var.i();
        } else {
            view2.animate().setInterpolator(new OvershootInterpolator()).translationX(0.0f).translationY(0.0f).rotation(0.0f).setDuration(300L).start();
        }
        this.g = 0.0f;
        this.h = 0.0f;
        return true;
    }
}
